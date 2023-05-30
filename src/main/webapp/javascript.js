const forms = document.querySelector(".forms"),
  buttons = document.querySelectorAll(".registerButton"),
  ShowHide = document.querySelectorAll(".eye-icon"),
  form = document.querySelector(".cadastro"),
  cadastroButton = document.querySelector("#cadastrar-button"),
  emailField = document.querySelector("#email-cadastrar"),
  emailInput =  document.querySelector("#email1"),
  senhaField = document.querySelector("#senha_cadastro1"),
  senhaInput = document.querySelector("#senha_cadastroinput"),
  senhaconfirmaField = document.querySelector("#senha_confirma"),
  senhaconfirmaInput = document.querySelector("#senha_confirmainput");

ShowHide.forEach((eyeIcon) => {
  eyeIcon.addEventListener("click", () => {
    let eyeIcon_senha_field =
      eyeIcon.parentElement.parentElement.querySelectorAll(".password");
    eyeIcon_senha_field.forEach((password) => {
      if (password.type === "password") {
        password.type = "text";
        eyeIcon.classList.replace("bx-hide", "bx-show");
        return;
      }
      password.type = "password";
      eyeIcon.classList.replace("bx-show", "bx-hide");
    });
  });
});
function toggleLogin() {
  forms.classList.toggle("show-cadastrar");
}
function checkEmail() {
   const padrao = /^\d{2}\.\d{5}-\d@maua\.br$/ ;
   let emailValue = emailInput.value
   if(!emailValue.match(padrao)) {
    console.log(emailValue);
    return emailField.classList.add("invalido");
   }
   emailField.classList.remove("invalido");
}
function checkSenha() {
  const padraosenha = /^(?=.*[@#$%^&+=!])(?=.*[a-zA-Z0-9]).{9,}$/;
  let senhaValue = senhaInput.value
  if(!senhaValue.match(padraosenha)){
    return senhaField.classList.add("invalido");
  }
  senhaField.classList.remove("invalido");
}
function comparaSenha(){
  let senhaconfirmaValue = senhaconfirmaInput.value
  if(senhaconfirmaValue !== senhaInput.value || senhaconfirmaValue === ""){
    return senhaconfirmaField.classList.add("invalido");
  }
  senhaconfirmaField.classList.remove("invalido");
}
function onConfirmar(){
  checkEmail();
  checkSenha();
  comparaSenha();
  if(!emailField.classList.contains("invalido")&&
 !senhaField.classList.contains("invalido") &&
 !senhaconfirmaField.classList.contains("invalido")
 ) {
  forms.classList.toggle("show-cadastrar");
 }
}



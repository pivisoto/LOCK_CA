const forms = document.querySelector(".forms"),
  buttons = document.querySelectorAll(".registerButton"),
  ShowHide = document.querySelectorAll(".eye-icon");
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


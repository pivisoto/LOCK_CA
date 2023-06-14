const botaoSinuca = document.querySelector("#botao_sinuca"),
    botaoDevolverSinuca = document.querySelector("#botao_devolver_sinuca"),
    botaoTenis = document.querySelector("#botao_tenis"),
    botaoDevolverTenis = document.querySelector("#botao_devolver_tenis"),
    botaoBaralho = document.querySelector("#botao_baralho"),
    botaoDevolverBaralho = document.querySelector("#botao_devolver_baralho"),
    botaoPebolim = document.querySelector("#botao_pebolim"),
    botaoDevolverPebolim = document.querySelector("#botao_devolver_pebolim"),
    formEmprestimo = document.querySelector("#form_emprestimo"),
    botaoIndisSinuca = document.querySelector("#indis_sinuca"),
    botaoIndisPebolim = document.querySelector("#indis_pebolim"),
    botaoIndisTenis = document.querySelector("#indis_tenis"),
    botaoIndisBaralho = document.querySelector("#indis_baralho"),
    Field = document.querySelector("#field_botao"),
    Material = document.querySelectorAll("#nome"),
    Line = document.querySelectorAll(".line"),
    PopUp = document.querySelector("#popup"),
    Form_titulo = document.querySelector("#form_titulo");

function aparecerDevolverSinuca(){
    if(botaoSinuca.style.display == "none") {
        popupFeedback_S();
    } else{
        botaoSinuca.style.display = "none";
        botaoPebolim.style.display = "none";
        botaoTenis.style.display = "none";
        botaoBaralho.style.display = "none";
        botaoDevolverSinuca.style.display = "flex";
        botaoIndisTenis.style.display = "flex";
        botaoIndisBaralho.style.display = "flex";
        botaoIndisPebolim.style.display = "flex";

    }
}
function aparecerDevolverTenis(){
    if(botaoTenis.style.display == "none") {
        popupFeedback_T();
    } else{
        botaoSinuca.style.display = "none";
        botaoPebolim.style.display = "none";
        botaoTenis.style.display = "none";
        botaoBaralho.style.display = "none";
        botaoDevolverTenis.style.display = "flex";
        botaoIndisSinuca.style.display = "flex";
        botaoIndisBaralho.style.display = "flex";
        botaoIndisPebolim.style.display = "flex";
    }
}
function aparecerDevolverBaralho(){
    if(botaoBaralho.style.display == "none") {
        popupFeedback_B();
    } else{
        botaoSinuca.style.display = "none";
        botaoPebolim.style.display = "none";
        botaoTenis.style.display = "none";
        botaoBaralho.style.display = "none";
        botaoDevolverBaralho.style.display = "flex";
        botaoIndisSinuca.style.display = "flex";
        botaoIndisPebolim.style.display = "flex";
        botaoIndisTenis.style.display = "flex";
        // onSolicitarBaralho();
    }
}
function aparecerDevolverPebolim(){
    if(botaoPebolim.style.display == "none") {
        popupFeedback_P();
    } else{
        botaoSinuca.style.display = "none";
        botaoPebolim.style.display = "none";
        botaoTenis.style.display = "none";
        botaoBaralho.style.display = "none";
        botaoDevolverPebolim.style.display = "flex";
        botaoIndisSinuca.style.display = "flex";
        botaoIndisTenis.style.display = "flex";
        botaoIndisBaralho.style.display = "flex";
    }
}
function popupFeedback_S(){
    Field.style.display = "none";
    botaoIndisTenis.style.display = "none";
    botaoIndisSinuca.style.display = "none";
    botaoIndisPebolim.style.display = "none";
    botaoIndisBaralho.style.display = "none";
    Material.forEach((texto) => {
        texto.style.display = "none";
    });
    Line.forEach((texto) => {
        texto.style.display = "none";
    });
    PopUp.style.display = "flex";
    Form_titulo.textContent = "Feedback";

}
function popupFeedback_T(){
    Field.style.display = "none";
    botaoIndisTenis.style.display = "none";
    botaoIndisSinuca.style.display = "none";
    botaoIndisPebolim.style.display = "none";
    botaoIndisBaralho.style.display = "none";
    botaoDevolverTenis.style.display = "none";
    Material.forEach((texto) => {
        texto.style.display = "none";
    });
    Line.forEach((texto) => {
        texto.style.display = "none";
    });
    PopUp.style.display = "flex";
    Form_titulo.textContent = "Feedback";
}
function popupFeedback_B(){
    Field.style.display = "none";
    botaoIndisTenis.style.display = "none";
    botaoIndisSinuca.style.display = "none";
    botaoIndisPebolim.style.display = "none";
    botaoIndisBaralho.style.display = "none";
    botaoDevolverBaralho.style.display = "none";
    Material.forEach((texto) => {
        texto.style.display = "none";
    });
    Line.forEach((texto) => {
        texto.style.display = "none";
    });
    PopUp.style.display = "flex";
    Form_titulo.textContent = "Feedback";
}
function popupFeedback_P(){
    Field.style.display = "none";
    botaoIndisTenis.style.display = "none";
    botaoIndisSinuca.style.display = "none";
    botaoIndisPebolim.style.display = "none";
    botaoIndisBaralho.style.display = "none";
    botaoDevolverPebolim.style.display = "none";
    Material.forEach((texto) => {
        texto.style.display = "none";
    });
    Line.forEach((texto) => {
        texto.style.display = "none";
    });
    PopUp.style.display = "flex";
    Form_titulo.textContent = "Feedback";
}

const botaoSinuca = document.querySelector("#botao_sinuca"),
    botaoDevolverSinuca = document.querySelector("#botao_devolver_sinuca"),
    botaoTenis = document.querySelector("#botao_tenis"),
    botaoDevolverTenis = document.querySelector("#botao_devolver_tenis"),
    botaoBaralho = document.querySelector("#botao_baralho"),
    botaoDevolverBaralho = document.querySelector("#botao_devolver_baralho"),
    botaoPebolim = document.querySelector("#botao_pebolim"),
    botaoDevolverPebolim = document.querySelector("#botao_devolver_pebolim");

function aparecerDevolverSinuca(){
    if(botaoSinuca.style.display == "none") {
        botaoSinuca.style.display = "flex";
        botaoDevolverSinuca.style.display = "none";
        // popupFeedback();
    } else{
        botaoSinuca.style.display = "none";
        botaoDevolverSinuca.style.display = "flex";
        onSolicitarSinuca();
    }
}
function aparecerDevolverTenis(){
    if(botaoTenis.style.display == "none") {
        botaoTenis.style.display = "flex";
        botaoDevolverTenis.style.display = "none";
        // popupFeedback();
    } else{
        botaoTenis.style.display = "none";
        botaoDevolverTenis.style.display = "flex";
        // onSolicitarTenis();
    }
}
function aparecerDevolverBaralho(){
    if(botaoBaralho.style.display == "none") {
        botaoBaralho.style.display = "flex";
        botaoDevolverBaralho.style.display = "none";
        // popupFeedback();
    } else{
        botaoBaralho.style.display = "none";
        botaoDevolverBaralho.style.display = "flex";
        // onSolicitarBaralho();
    }
}
function aparecerDevolverPebolim(){
    if(botaoPebolim.style.display == "none") {
        botaoPebolim.style.display = "flex";
        botaoDevolverPebolim.style.display = "none";
        // popupFeedback();
    } else{
        botaoPebolim.style.display = "none";
        botaoDevolverPebolim.style.display = "flex";
        // onSolicitarPebolim();
    }
}
// function popupFeedback(){
//  console.log("123");
// }
function onSolicitarSinuca(){
    var result = "<?php php_func();?>";
}
// function onSolicitarTenis(){}
// function onSolicitarBaralho(){}
// function onSolicitarPebolim(){}

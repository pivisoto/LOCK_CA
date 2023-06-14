<?php session_start() ?>
<!DOCTYPE html>
<html>
<head>
    <title>LOCKC.A</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width">
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
    <script src="https://code.jquery.com/jquery-3.7.0.min.js" integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="style_emprestimo.css">
</head>
<body>
<header>
    <h1>LOCKC.A</h1>
</header>
<section class="container forms">
    <div class="form cadastrar">
        <div class="form-content">
            <main id="form_titulo">Empréstimo</main>
            <form method="post" id="form_emprestimo" action = "includes/feedback.inc.php">
                <div class="field_popup" id="popup" style="display:none;">
                    <div class="popup">
                        <div class="popup-content">
                            <input id="input_feedback" name="input_feedback" type="text" placeholder="Escreva aqui seu feedback">
                            <button type="submit" id="botao_feedback" class="field button">ENVIAR</button>
                        </div>
                    </div>
                </div>
                <div class="field" id="field_botao">
                    <div class="item">
                        <p class="field p" id="nome">KIT SINUCA</p>
                    </div>
                    <div class="botao-item">
                        <button id="botao_sinuca" type="button" class="field button" onclick="aparecerDevolverSinuca();">Solicitar</button>
                        <button id="botao_devolver_sinuca" style="display:none" class="field button" onclick="aparecerDevolverSinuca();">Devolver</button>
                        <button style="display:none" id="indis_sinuca" class="field button indis" >Indisponível</button>
                    </div>
                </div>
                <div class="line"></div>
                <div class="field" id="field_botao">
                    <div class="item">
                        <p class="field p" id="nome">TÊNIS DE MESA</p>
                    </div>
                    <div class="botao-item">
                        <button id="botao_tenis" type="button" class="field button" onclick="aparecerDevolverTenis();">Solicitar</button>
                        <button id="botao_devolver_tenis" style="display:none" class="field button" onclick="aparecerDevolverTenis();">Devolver</button>
                        <button style="display:none" id="indis_tenis" class="field button indis" >Indisponível</button>
                    </div>
                </div>
                <div class="line" id="linha"></div>
                <div class="field" id="field_botao">
                    <div class="item">
                        <p class="field p" id="nome">BARALHO</p>
                    </div>
                    <div class="botao-item">
                        <button id="botao_baralho" type="button" class="field button" onclick="aparecerDevolverBaralho();">Solicitar</button>
                        <button id="botao_devolver_baralho" style="display:none" class="field button" onclick="aparecerDevolverBaralho();">Devolver</button>
                        <button style="display:none" id="indis_baralho" class="field button indis">Indisponível</button>
                    </div>
                </div>
                <div class="line"></div>
                <div class="field" id="field_botao">
                    <div class="item">
                        <p class="field p" id="nome">PEBOLIM</p>
                    </div>
                    <div class="botao-item">
                        <button id="botao_pebolim" type="button" class="field button" onclick="aparecerDevolverPebolim();">Solicitar</button>
                        <button id="botao_devolver_pebolim" style="display:none" class="field button" onclick="aparecerDevolverPebolim();">Devolver</button>
                        <button style="display:none" id="indis_pebolim" class="field button indis">Indisponível</button>
                    </div>
                </div>
                <div class="line"></div>
            </form>
        </div>
    </div>
</section>
<script>
    $(document).ready(function() {
        $("#botao_sinuca").click(function(event) {
            event.preventDefault();
            var item = "sinuca";
            $.ajax({
                url: "includes/emprestimo.inc.php",
                type: "POST",
                data: {
                    item: item
                },
                success: function(response) {
                    console.log(response);
                },
                error: function(error) {
                    console.error(error);
                }
            });
        });
    });
    $(document).ready(function() {
        $("#botao_tenis").click(function(event) {
            event.preventDefault();
            var item = "tenis";
            $.ajax({
                url: "includes/emprestimo.inc.php",
                type: "POST",
                data: {
                    item: item
                },
                success: function(response) {
                    console.log(response);
                },
                error: function(error) {
                    console.error(error);
                }
            });
        });
    });

    $(document).ready(function() {
        $("#botao_baralho").click(function(event) {
            event.preventDefault();
            var item = "baralho";
            $.ajax({
                url: "includes/emprestimo.inc.php",
                type: "POST",
                data: {
                    item: item
                },
                success: function(response) {
                    console.log(response);
                },
                error: function(error) {
                    console.error(error);
                }
            });
        });
    });

    $(document).ready(function() {
        $("#botao_pebolim").click(function(event) {
            event.preventDefault();
            var item = "pebolim";
            $.ajax({
                url: "includes/emprestimo.inc.php",
                type: "POST",
                data: {
                    item: item
                },
                success: function(response) {
                    console.log(response);
                    // Você pode exibir uma mensagem de sucesso aqui, se desejar
                },
                error: function(error) {
                    console.error(error);
                }
            });
        });
    });
    $(document).ready(function() {
        $("#botao_devolver_sinuca").click(function(event) {
            event.preventDefault();
            $.ajax({
                url: "includes/feedback.inc.php",
                type: "POST",
                data: {
                    item: item
                },
                success: function(response) {
                    console.log(response);
                    // Você pode exibir uma mensagem de sucesso aqui, se desejar
                },
                error: function(error) {
                    console.error(error);
                }
            });
        });
    });
    $(document).ready(function() {
        $("#botao_devolver_tenis").click(function(event) {
            event.preventDefault();
            $.ajax({
                url: "includes/feedback.inc.php",
                type: "POST",
                data: {
                    item: item
                },
                success: function(response) {
                    console.log(response);
                    // Você pode exibir uma mensagem de sucesso aqui, se desejar
                },
                error: function(error) {
                    console.error(error);
                }
            });
        });
    });
    $(document).ready(function() {
        $("#botao_devolver_baralho").click(function(event) {
            event.preventDefault();
            $.ajax({
                url: "includes/feedback.inc.php",
                type: "POST",
                data: {
                    item: item
                },
                success: function(response) {
                    console.log(response);
                    // Você pode exibir uma mensagem de sucesso aqui, se desejar
                },
                error: function(error) {
                    console.error(error);
                }
            });
        });
    });
    $(document).ready(function() {
        $("#botao_devolver_pebolim").click(function(event) {
            event.preventDefault();
            $.ajax({
                url: "includes/feedback.inc.php",
                type: "POST",
                data: {
                    item: item
                },
                success: function(response) {
                    console.log(response);
                    // Você pode exibir uma mensagem de sucesso aqui, se desejar
                },
                error: function(error) {
                    console.error(error);
                }
            });
        });
    });
    $(document).ready(function() {
        $("#indis_sinuca").click(function(event){
            event.preventDefault();
            $.ajax({
                url: "includes/feedback.inc.php",
                type: "POST",
                data: {
                },
                success: function(response) {
                    console.log(response);
                    // Você pode exibir uma mensagem de sucesso aqui, se desejar
                },
                error: function(error) {
                    console.error(error);
                }
            });
        });
    });
    $(document).ready(function() {
        $("#indis_tenis").click(function(event) {
            event.preventDefault();
            $.ajax({
                url: "includes/feedback.inc.php",
                type: "POST",
                data: {
                },
                success: function(response) {
                    console.log(response);
                    // Você pode exibir uma mensagem de sucesso aqui, se desejar
                },
                error: function(error) {
                    console.error(error);
                }
            });
        });
    });
    $(document).ready(function() {
        $("#indis_baralho").click(function(event) {
            event.preventDefault();
            $.ajax({
                url: "includes/feedback.inc.php",
                type: "POST",
                data: {
                },
                success: function(response) {
                    console.log(response);
                    // Você pode exibir uma mensagem de sucesso aqui, se desejar
                },
                error: function(error) {
                    console.error(error);
                }
            });
        });
    });
    $(document).ready(function() {
        $("#indis_pebolim").click(function(event) {
            event.preventDefault();
            $.ajax({
                url: "includes/feedback.inc.php",
                type: "POST",
                data: {
                },
                success: function(response) {
                    console.log(response);
                    // Você pode exibir uma mensagem de sucesso aqui, se desejar
                },
                error: function(error) {
                    console.error(error);
                }
            });
        });
    });


</script>
</body>
<script src="emprestimo.js"></script>
</html>
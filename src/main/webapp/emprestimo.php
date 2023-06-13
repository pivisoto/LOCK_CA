<?php session_start() ?>
<!DOCTYPE html>
<html>
    <head>
        <title>LOCKC.A</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport"content="width=device-width">
        <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
        <link rel="stylesheet" href="style_emprestimo.css">
    </head>
    <body>
        <header>
            <h1>LOCKC.A</h1>
        </header>
        <section class="container forms">
                <div class="form cadastrar">
                    <div class="form-content">
                        <main>Empréstimo</main>
                        <form action = "includes/emprestimo.inc.php" method="post">
                            <div class="field">
                                <div class="item">
                                    <p class ="field p">KIT SINUCA</p>
                                </div>
                                <div class="botao-item">
                                        <input style="background-color: #0171d3; color:#fff;" id="botao_sinuca" type="submit" class="field button" onclick="aparecerDevolverSinuca();" value="Solicitar" name="sinuca"></input>
                                    <button id="botao_devolver_sinuca" style="display:none" class="field button" onclick="aparecerDevolverSinuca();">Devolver</button>
                                </div>
                            </div>
                            <div class="line"></div>
                            <div class="field">
                                <div class="item">
                                    <p class ="field p">TÊNIS DE MESA</p>
                                </div>
                                <div class="botao-item">
                                    <input style="background-color: #0171d3; color:#fff;" id="botao_tenis" type="submit" class="field button" onclick="aparecerDevolverTenis();" value="Solicitar" name="tenis"></input>
                                    <button id="botao_devolver_tenis" style = "display:none" class="field button" onclick="aparecerDevolverTenis();">Devolver</button>
                                </div>
                            </div>
                            <div class="line"></div>
                            <div class="field">
                                <div class="item">
                                    <p class ="field p">BARALHO</p>
                                </div>
                                <div class="botao-item">
                                    <input style="background-color: #0171d3; color:#fff;" id="botao_baralho" type="submit" class="field button" onclick="aparecerDevolverBaralho();" value="Solicitar" name="baralho"></input>
                                    <button id="botao_devolver_baralho" style = "display:none" class="field button" onclick="aparecerDevolverBaralho();">Devolver</button>
                                </div>
                            </div>
                            <div class="line"></div>
                            <div class="field">
                                <div class="item">
                                    <p class ="field p">PEBOLIM</p>
                                </div>
                                <div class="botao-item">
                                    <input style="background-color: #0171d3; color:#fff;" id="botao_pebolim" type="submit" class="field button" onclick="aparecerDevolverPebolim();" value="Solicitar" name="pebolim"></input>
                                    <button id="botao_devolver_pebolim" style="display:none" class="field button" onclick="aparecerDevolverPebolim();">Devolver</button>
                                </div>
                            </div>
                            <div class="line"></div>
                        </form>
                    </div>
                </div>
        </section>
    </body>
    <script src="emprestimo.js"></script>
</html>


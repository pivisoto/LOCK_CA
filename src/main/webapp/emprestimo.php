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
                        <form action = "#">
                            <div class="field">
                                <div class="item"><p class ="field p">KIT SINUCA</p></div><div class="botao-item"><button id="botao_sinuca" type="button" class="field button" onclick="aparecerDevolver();">Solicitar</button>
                                    <button id="botao_devolver_sinuca" style="display:none" class="field button" onClick="popupFeedback()">Devolver</button>
                                </div>
                            </div>
                            <div class="line"></div>
                            <div class="field">
                                <div class="item"><p class ="field p">TÊNIS DE MESA</p></div><div class="botao-item"><button style = "display:none" type="button" class="field button" id="botao_tenis">Solicitar</button>
                                    <button style = "display:none" class="field button">Devolver</button>
                                </div>
                            </div>
                            <div class="line"></div>
                            <div class="field">
                                <div class="item"><p class ="field p">BARALHO</p></div>
                                <div class="botao-item"><button type="button" class="field button" id="botao_baralho">Solicitar</button>
                                    <button style = "display:none" class="field button">Devolver</button>
                                </div>
                            </div>
                            <div class="line"></div>
                            <div class="field">
                                <div class="item"><p class ="field p">PEBOLIM</p></div><div class="botao-item"><button type="button" class="field button" id="botao_pebolim">Solicitar</button>
                                    <button style="display:none" class="field button">Devolver</button>
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


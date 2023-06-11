<!DOCTYPE html>
<html>
    <head>
        <title>LOCKC.A</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport"content="width=device-width">
        <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
        <link rel="stylesheet" href="style.css">
    </head>
    <body>
        <header>
            <h1>LOCKC.A</h1>
        </header>
        <section class="container forms">
                <div class="form login">
                    <div class="form-content">
                        <main>Login</main>
                        <form action = "#">
                            <slot>
                                <div class="field input-field">
                                    <input type="text" placeholder="email Institucional" class ="input">
                                </div>
                                <span class="error email">
                                    <i class='bx bx-message-alt-error error-icon'></i>                                    
                                    <p class="error-text">Insira um email válido (xx.xxxxx-x@maua.br)</p>
                                </span>
                            </slot>
                            <slot>
                                <div class="field input-field">
                                    <input type="password" placeholder="senha" class="password">
                                    <i class='bx bx-hide eye-icon'></i>
                                </div>
                                <span class="error senha">
                                    <i class='bx bx-message-alt-error error-icon'></i>                                    
                                    <p class="error-text">email e/ou senha incorretos</p>
                                </span>
                            </slot>
                            <div class="field field-button">
                                <button class="botao">Confirmar</button>
                            </div>
                            <div class="line"></div>
                            <div class="field ">
                                <button type="button" class="registerButton" onclick="toggleLogin();">Cadastrar</button>
                            </div>
                        </form>
                    </div>
                </div>
                <div class="form cadastrar">
                    <div class="form-content">
                        <main>Cadastrar</main>
                        <form class = "cadastro" action = "#">
                            <slot id = "email-cadastrar" >
                                <div class="field input-field">
                                    <input id = "email1" type="email" placeholder="email Institucional">
                                </div>
                                <span class="error email-error">
                                    <i class='bx bx-message-alt-error error-icon'></i>                                    
                                    <p class="error-text">Insira um email válido (xx.xxxxx-x@maua.br)</p>
                                </span>
                            </slot>
                            <slot id ="senha_cadastro1">
                                <div class="field input-field">
                                    <input id = "senha_cadastroinput" type="password" placeholder="insira uma senha" class="password">
                                    <i class='bx bx-hide eye-icon'></i>
                                </div>
                                <span class="error senha">
                                    <i class='bx bx-message-alt-error error-icon'></i>                                    
                                    <p class="error-text">Insira uma senha válida utilizando no mínimo 8 caracteres e 1 caracter especial</p>
                                </span>
                            </slot>
                            <slot id ="senha_confirma">
                                <div class="field input-field">
                                    <input id = "senha_confirmainput" type="password" placeholder="insira novamente" class="password">
                                    <i class='bx bx-hide eye-icon'></i>
                                </div>
                                <span class="error senha">
                                    <i class='bx bx-message-alt-error error-icon'></i>                                    
                                    <p class="error-text">A senhas não são iguais</p>
                                </span>
                            </slot>
                            <div class="field button-field cadastro-button">
                                <button type = "button" id="cadastrar-button" onclick="onConfirmar();">Confirmar</button>
                            </div>
                            <div class="line"></div>
                            <div class="field button-field">
                                <button type="button" class="botaoLogar" onclick="toggleLogin();">Logar</button>
                            </div>
                        </form>
                    </div>
                    </div>
                </div>
        </section>
        <script src="javascript.js"></script>
    </body>
</html>


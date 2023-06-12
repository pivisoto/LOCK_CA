<?php

if($_SERVER["REQUEST_METHOD"] == "POST")
{
    $email_login = $_POST["email_login"];
    $senha_login = $_POST["pwd_login"];
    include "../Classes/dbconnect.classes.php";
    include "../Classes/login.classes.php";
    include "../Classes/controle_login.classes.php";
    $login = new ControleLogin($email_login,$senha_login);
    $login->loginUsuario();
    header("location: ../emprestimo.php");
}


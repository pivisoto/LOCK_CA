<?php

if($_SERVER["REQUEST_METHOD"] == "POST")
{
    $email = $_POST["email"];
    $senha = $_POST["pwd"];
    $senha_novamente = $_POST["pwdrepeat"];
    $ra = substr($email,0,10);
    include "../Classes/dbconnect.classes.php";
    include "../Classes/registro.classes.php";
    include "../Classes/controle_registro.classes.php";
    $registro = new ControleRegistro($email,$senha,$senha_novamente,$ra);
    $registro->registraUsuario();
    header("location: ../index.php");
}

<?php

if(isset($_POST["enviar"]))
{
    $email = $_POST["email"];
    $senha = $_POST["pwd"];
    $senha_novamente = $_POST["pwdrepeat"];
    $ra = substr($email,0,10);
    include "../classes/dbconnect.classes.php";
    include "../classes/registro.classes.php";
    include "../Classes/controle_registro.classes.php";
    $registro = new ControleRegistro($email,$senha,$senha_novamente,$ra);
    $registro->registraUsuario();
    header("location: ../index.php");
}

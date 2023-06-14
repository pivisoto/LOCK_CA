<?php
    if (isset($_POST['item']) && $_POST['item'] === 'sinuca') {
        session_start();
        $idUsuario = $_SESSION["idUsuario"];
        $idMaterial = 1;
        $codigo = rand(0,1000000);
        include "../Classes/dbconnect.classes.php";
        include "../Classes/emprestimo.classes.php";
        include "../Classes/controle_emprestimo.classes.php";
        $emprestimo = new ControleEmprestimo($idUsuario, $idMaterial,$codigo);
        $emprestimo->newEmprestimo();
    }
    if (isset($_POST['item']) && $_POST['item'] === 'tenis') {
        session_start();
        $idUsuario = $_SESSION["idUsuario"];
        $idMaterial = 2;
        $codigo = rand(0,1000000);
        include "../Classes/dbconnect.classes.php";
        include "../Classes/emprestimo.classes.php";
        include "../Classes/controle_emprestimo.classes.php";
        $emprestimo = new ControleEmprestimo($idUsuario, $idMaterial,$codigo);
        $emprestimo->newEmprestimo();
    }
    if (isset($_POST['item']) && $_POST['item'] === 'baralho') {
        session_start();
        $idUsuario = $_SESSION["idUsuario"];
        $idMaterial = 3;
        $codigo = rand(0,1000000);
        include "../Classes/dbconnect.classes.php";
        include "../Classes/emprestimo.classes.php";
        include "../Classes/controle_emprestimo.classes.php";
        $emprestimo = new ControleEmprestimo($idUsuario, $idMaterial,$codigo);
        $emprestimo->newEmprestimo();
    }
    if (isset($_POST['item']) && $_POST['item'] === 'pebolim') {
        session_start();
        $idUsuario = $_SESSION["idUsuario"];
        $idMaterial = 4;
        $codigo = rand(0,1000000);
        include "../Classes/dbconnect.classes.php";
        include "../Classes/emprestimo.classes.php";
        include "../Classes/controle_emprestimo.classes.php";
        $emprestimo = new ControleEmprestimo($idUsuario, $idMaterial,$codigo);
        $emprestimo->newEmprestimo();
    }

<?php
    if (isset($_POST['item']) && $_POST['item'] === 'sinuca') {
        session_start();
        $idUsuario = $_SESSION["idUsuario"];
        $idMaterial = 1;
        include "../Classes/dbconnect.classes.php";
        include "../Classes/emprestimo.classes.php";
        include "../Classes/controle_emprestimo.classes.php";
        $emprestimo = new ControleEmprestimo($idUsuario, $idMaterial);
        $emprestimo->newEmprestimo();
    }
    if (isset($_POST['item']) && $_POST['item'] === 'tenis') {
        session_start();
        echo $_POST['item'];
        $idUsuario = $_SESSION["idUsuario"];
        $idMaterial = 2;
        include "../Classes/dbconnect.classes.php";
        include "../Classes/emprestimo.classes.php";
        include "../Classes/controle_emprestimo.classes.php";
        $emprestimo = new ControleEmprestimo($idUsuario, $idMaterial);
        $emprestimo->newEmprestimo();
    }
    if (isset($_POST['item']) && $_POST['item'] === 'baralho') {
        session_start();
        $idUsuario = $_SESSION["idUsuario"];
        $idMaterial = 3;
        include "../Classes/dbconnect.classes.php";
        include "../Classes/emprestimo.classes.php";
        include "../Classes/controle_emprestimo.classes.php";
        $emprestimo = new ControleEmprestimo($idUsuario, $idMaterial);
        $emprestimo->newEmprestimo();
    }
    if (isset($_POST['item']) && $_POST['item'] === 'pebolim') {
        session_start();
        $idUsuario = $_SESSION["idUsuario"];
        $idMaterial = 4;
        include "../Classes/dbconnect.classes.php";
        include "../Classes/emprestimo.classes.php";
        include "../Classes/controle_emprestimo.classes.php";
        $emprestimo = new ControleEmprestimo($idUsuario, $idMaterial);
        $emprestimo->newEmprestimo();
    }

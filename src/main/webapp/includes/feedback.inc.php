<?php
if ($_SERVER["REQUEST_METHOD"] === "POST") {
    session_start();
    $feedback = $_POST["input_feedback"];
    $idEmprestimo = $_SESSION["idEmprestimo"];
    $idMaterial = $_SESSION["idMaterial"];
    include "../Classes/dbconnect.classes.php";
    include "../Classes/feedback.classes.php";
    include "../Classes/controle_feedback.classes.php";
    $feedback_novo = new ControleFeedback($feedback,$idMaterial,$idEmprestimo);
    $feedback_novo->newFeedback();
    header("location: ../emprestimo.php");
}
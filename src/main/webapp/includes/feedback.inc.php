<?php
if ($_SERVER["REQUEST_METHOD"] === "POST") {
    session_start();
    $feedback = $_POST["input_feedback"];
    $idEmprestimo = $_SESSION["idEmprestimo"];
    $idMaterial = $_SESSION["idMaterial"];
    $feedback_novo = new ControleFeedback($feedback,$idMaterial,$idEmprestimo);
    $feedback_novo->newFeedback();
}
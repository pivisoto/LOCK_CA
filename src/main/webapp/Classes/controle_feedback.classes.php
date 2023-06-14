<?php

class ControleFeedback extends Feedback
{

    private $idEmprestimo;
    private $idMaterial;
    private $feedback;

    public function __construct($feedback, $idMaterial,$idEmprestimo)
    {
        $this->feedback = $feedback;
        $this->idEmprestimo= $idEmprestimo;
        $this->idMaterial = $idMaterial;
    }

    public function newFeedback()
    {
        if ($this->inputVazio()) {
            header("location: ../emprestimo.php?error=emptyinput");
            exit();
        }
        $this->createFeedback($this->feedback,$this->idMaterial,$this->idEmprestimo);
    }

    private function inputVazio()
    {
        $result = null;
        if (empty($this->idEmprestimo) || empty($this->idMaterial)) {
            $result = true;
        } else {
            $result = false;
        }
        return $result;

    }
}
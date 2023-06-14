<?php

class Feedback extends dbconnect{

    protected function createFeedback($feedback,$idMaterial,$idEmprestimo)
    {
        $stmt = $this->connect()->prepare('INSERT INTO feedback (idEmprestimo, Feedback) VALUES (?, ?);');
        if (!$stmt->execute(array($idEmprestimo, $feedback))) {
            $stmt = null;
            header("location: ../emprestimo.php?error=stmtfailed");
            exit();
        }
        $stmt = null;
        $this->devolveMaterial($idMaterial);
    }

    protected function devolveMaterial($idMaterial)
    {
        $stmt = $this->connect()->prepare('UPDATE material SET quantidadeDisponivel=quantidadeDisponivel+1 WHERE idMaterial = ?;');
        if (!$stmt->execute(array($idMaterial))) {
            $stmt = null;
            header("location: ../emprestimo.php?error=stmtfailed");
            exit();
        }
        $stmt = null;
    }
}

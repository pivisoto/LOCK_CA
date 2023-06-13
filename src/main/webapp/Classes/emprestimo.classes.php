<?php
class emprestimo extends dbconnect{
    protected function createEmprestimo($idUsuario, $idMaterial)
    {
        $stmt = $this->connect()->prepare('INSERT INTO emprestimo (idMaterial, idUsuario, horario) VALUES (?, ?, current_time());');
        if (!$stmt->execute(array($idMaterial, $idUsuario))) {
            $stmt = null;
            header("location: ../emprestimo.php?error=stmtfailed");
            exit();
        }
        $stmt = null;
        $this->retiraMaterial($idMaterial);
    }
    protected function retiraMaterial($idMaterial) {
        $stmt = $this->connect()->prepare('UPDATE material SET quantidadeDisponivel=quantidadeDisponivel-1 WHERE idMaterial = ?;');
        if (!$stmt->execute(array($idMaterial))) {
            $stmt = null;
            header("location: ../emprestimo.php?error=stmtfailed");
            exit();
        }
        $stmt = null;
    }
}

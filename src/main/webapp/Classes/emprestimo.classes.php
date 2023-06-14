<?php
class emprestimo extends dbconnect{
    protected function createEmprestimo($idUsuario, $idMaterial,$codigo)
    {
        $stmt = $this->connect()->prepare('INSERT INTO emprestimo (idMaterial, idUsuario, horario,codigo) VALUES (?, ?, current_time(),?);');
        if (!$stmt->execute(array($idMaterial, $idUsuario,$codigo))) {
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
    protected function getIDemprestimo($codigo){
        $stmt = $this->connect()->prepare('SELECT idEmprestimo, idMaterial FROM emprestimo WHERE codigo = ?;');
        if (!$stmt->execute(array($codigo))) {
            $stmt = null;
            header("location: ../emprestimo.php?error=stmtfailed");
            exit();
        }
        if ($stmt->rowCount() == 0) {
            $stmt = null;
            header("location: ../emprestimo.php?error=codigonotfound");
            exit();
        }
        $user = $stmt->fetchAll(PDO::FETCH_ASSOC);;
        session_start();
        $_SESSION["idEmprestimo"] = $user[0]["idEmprestimo"];
        $_SESSION["idMaterial"] = $user[0]["idMaterial"];
        $stmt = null;
    }
}

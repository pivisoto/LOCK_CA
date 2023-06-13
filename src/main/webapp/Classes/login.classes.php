<?php
class Login extends dbconnect{
    protected function getUsuario($email, $senha)
    {
        $stmt = $this->connect()->prepare('SELECT senha, email, idUsuario FROM usuario WHERE email = ?;');
        if (!$stmt->execute(array($email))) {
            $stmt = null;
            header("location: ../index.php?error=stmtfailed");
            exit();
        }
        if ($stmt->rowCount() == 0) {
            $stmt = null;
            header("location: ../index.php?error=usenotfound");
            exit();
        }
        $user = $stmt->fetchAll(PDO::FETCH_ASSOC);
        $checkSenha = password_verify($senha,$user[0]["senha"]);
        if (!$checkSenha) {
            $stmt = null;
            header("location: ../index.php?error=wrongpassword");
            exit();
        }
        session_start();
        $_SESSION["email"] = $user[0]["email"];
        $_SESSION["idUsuario"] = $user[0]["idUsuario"];
        $stmt = null;
    }
}

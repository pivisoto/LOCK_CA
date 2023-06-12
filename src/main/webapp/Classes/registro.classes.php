<?php

class Registro extends dbconnect{
    protected function criaUsuario($email, $senha , $ra){
        $stmt = $this->connect()->prepare("INSERT INTO usuario (ra,email,senha) VALUES (?,?,?);");

        $hashedsenha = password_hash($senha, PASSWORD_DEFAULT);
        if(!$stmt->execute(array($ra, $email , $hashedsenha))){
            $stmt = null;
            header("location: ../index.php?error=stmtfailed");
            exit();
        }
        $stmt = null;
    }
    protected function checkUser($email){
        $stmt = $this->connect()->prepare('SELECT email FROM usuario WHERE email = ?;');
        if(!$stmt->execute(array($email))){
            $stmt = null;
            header("location: ../index.php?error=stmtfailed");
            exit();
        }
        if($stmt->rowCount() > 0){
            $resultCheck = false;
        }
        else {
            $resultCheck = true;
        }
        return $resultCheck;
    }
}
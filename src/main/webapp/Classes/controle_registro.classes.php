<?php

class ControleRegistro extends Registro{
    private $email;
    private $ra;
    private $senha;
    private $senha_novamente;

    public function __construct($email,$senha,$senha_novamente,$ra){
        $this->email = $email;
        $this->senha = $senha;
        $this->senha_novamente = $senha_novamente;
        $this->ra = $ra;
    }

    public function registraUsuario(){
        if($this->inputVazio() == false){
            header("location: ../index.php?error=emptyinput");
            exit();
        }
        if($this->emailInvalido() == false){
            header("location: ../index.php?error=emptyinput");
            exit();
        }
        if($this->senhaCompara() == false){
            header("location: ../index.php?error=emptyinput");
            exit();
        }
        $this->criaUsuario($this->email, $this->senha, $this->ra);
    }
    private function inputVazio(){
        $result = null;
        if(empty($this->email)||empty($this->senha)||empty($this->senha_novamente)){
            $result = false;
        }
        else {
            $result = true;
        }
        return $result;

    }
    private function emailInvalido(){
        $result = null;
        if (!preg_match("/^\d{2}\.\d{5}-\d@maua\.br$/", $this->email)){
            $result = false;
        }
        else{
            $result = true;
        }
        return $result;
    }
    private function senhaCompara(){
        $result = null;
        if ($this->senha !== $this->senha_novamente) {
            $result = false;
        } else {
            $result = true;
        }
        return $result;

    }
    private function emailCadastrado(){
        $result = null;
        if (!$this->checkUser($this->email)) {
            $result = false;
        } else {
            $result = true;
        }
        return $result;

    }



}
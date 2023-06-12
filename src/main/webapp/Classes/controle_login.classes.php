<?php
class ControleLogin extends Login{

    private $email;
    private $senha;

    public function __construct($email, $senha)
    {
        $this->email = $email;
        $this->senha = $senha;
    }

    public function loginUsuario()
    {
        if ($this->inputVazio()) {
            header("location: ../index.php?error=emptyinput");
            exit();
        }
        $this->getUsuario($this->email, $this->senha);
    }

    private function inputVazio()
    {
        $result = null;
        if (empty($this->email) || empty($this->senha)) {
            $result = true;
        } else {
            $result = false;
        }
        return $result;

    }
}
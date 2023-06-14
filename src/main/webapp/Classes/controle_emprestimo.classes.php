<?php
class ControleEmprestimo extends Emprestimo{

    private $idUsuario;
    private $idMaterial;
    private $codigo;

    public function __construct($idUsuario, $idMaterial,$codigo)
    {
        $this->codigo = $codigo;
        $this->idUsuario = $idUsuario;
        $this->idMaterial = $idMaterial;
    }

    public function newEmprestimo()
    {
        if ($this->inputVazio()) {
            header("location: ../emprestimo.php?error=emptyinput");
            exit();
        }
        $this->createEmprestimo($this->idUsuario, $this->idMaterial,$this->codigo);
    }

    private function inputVazio()
    {
        $result = null;
        if (empty($this->idUsuario) || empty($this->idMaterial)) {
            $result = true;
        } else {
            $result = false;
        }
        return $result;

    }
}
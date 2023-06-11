<?php

class DbConnect{
    protected function connect(){
        try {
            $username = "pietro";
            $password = "";
            $dbconnect = new PDO('mysql:host=localhost;dbname=dbcalok',$username,$password);
            return $dbconnect;
        }
        catch (PDOException $e){
            print "Error:" .$e->getMessage(). "<br/>";
            die();
        }

    }
}
<?php

class DbConnect{
    protected function connect(){
        try {
            $username = "root2";
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
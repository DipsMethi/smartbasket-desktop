<?php

    session_start();

    $serverName = "localhost";
    $username = "root";
    $password = "";
    $dbname = "smartbasket_db";

    // Create connection
    $connection = new mysqli($serverName, $username, $password, $dbname);
    // Check connection
    if($connection->connect_error)
    {
        die("Connection failed: " . $connection->connect_error);
    }

    try 
    {
        $method = $_POST['method'];
        switch($method)
        {
            case "AUTH":
                $email = $_POST['email'];
                $password = $_POST['password'];

                $sql = "SELECT * FROM users WHERE email='" . $email . "' AND password='" . $password . "' AND Status='Active'";
                $result = $connection->query($sql);

                if($result)
                {
                    if($result->num_rows > 0)
                    {
                        if($row = $result->fetch_assoc())
                        {
                            $_SESSION['uid'] = $row['id'];
                            $_SESSION['firstname'] = $row['firstName'];
                            $_SESSION['lastname'] = $row['lastName'];
                            $_SESSION['gender'] = $row['gender'];
                            $_SESSION['cellNum'] = $row['cellNum'];
                            $_SESSION['addr'] = $row['addr'];

                            $_SESSION['email'] = $email;
                            $_SESSION['password'] = $password;
                            
                            writeLoginDetails($connection);
                        } 

                        $uidFile = fopen("uid.txt", "w");
                        fwrite($uidFile, $_SESSION['uid']);
                        fclose($uidFile);

                        die ("True&" . $_SESSION['uid'] . "&" . $_SESSION['firstname'] . "&" . $_SESSION['lastname'] 
                                    . "&" . $_SESSION['gender'] . "&" . $_SESSION['cellNum'] . "&" . $_SESSION['addr']
                                    . "&" . $_SESSION['email'] . "&" . $_SESSION['password']);                      
                    }                      
                    else
                        die("False");       
                } 
                else
                    die("No data");

                break;
            case "GET_USER":
                    $dat = fopen("uid.txt", "r");
                    if( $res = fgets($dat))
                        die ( $res );
                    else
                        die ("No data");
                    fclose($dat);
                    //echo $_SESSION['uid'];
                break;
            case "UPDATE_USER":
                $dat = fopen("uid.txt", "r");
                if( $res = fgets($dat))
                    $uid =  $res;
                fclose($dat);
                
                $query = "UPDATE users SET firstName='" . $_POST['firstName'] . "', lastName='" . $_POST['lastName'] . "', email='" . $_POST['email'] . "', cellNum='" . $_POST['cellNum'] . "', addr='" . $_POST['addr'] . "',password='".$_POST['password']. "' WHERE id='" . $uid . "'";
                
                if($connection->query($query))
                    die("UpdateSuccess");
                else
                    die("404");

                break;
            case "LOGOUT" :
                
                $f = fopen("uid.txt", "w");
                fwrite($f, "");
                fclose($f);
                die("LogoutSuccess");

                break;
        }
    }
    catch (Exception $th) 
    {
        die("Exception: " . $th->Message);
    }
    finally
    {
        $connection->close();
    } 
    
    function writeLoginDetails($connection)
    {
        $query = "INSERT INTO customers (id, checkin, isCardScanned) VALUES ('" . $_SESSION['uid'] . "','" . time() + strtotime('+17 minutes') . "', '2')";
        if($connection->query($query))
        {
            // Do nothing
        }  
    }
?>>
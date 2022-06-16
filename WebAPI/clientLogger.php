
<?php

    try 
    {
        $tme = time();

        $date = date("d-m-Y H:m:s", $tme);
        $time_ = time("HH:mm", $tme);

        $dat = fopen("uid.txt", "r");
        if( $res = fgets($dat))
            $uid =  $res;
        fclose($dat);

        $message = $date . " " . $time_ . " " . $uid . " " . $_POST['message'] . "\n";

        // If file does not exist
        if( file_exist("log.txt") == FALSE )
        {
            $logFile = fopen("log.txt", "w");
            fwrite($logFile, $message);
            fwrite($logFile, "------------------------------------------------------------");
            fclose($logFile);
        }
        else
        {
            $logFile = fopen("log.txt", "a");
            fwrite($logFile, $message);
            fwrite($logFile, "------------------------------------------------------------");
            fclose($logFile);
        }     
    } 
    catch (Exception $ex) 
    {
        $logFile = fopen("log.txt", "a");
        fwrite($logFile, $ex->message);
        fwrite($logFile, "--------------------------------------------------");
        fclose($logFile);
    }

?>
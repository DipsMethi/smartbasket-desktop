
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
    $dat = fopen("uid.txt", "r");
    if( $res = fgets($dat))
        $uid =  $res;
    fclose($dat);

    $method = $_POST['method'];
    switch($method)
    {
        case "INSERT_ITEM":
            $id = $_POST['cardid'];
            $insertQuery = "INSERT INTO buyitems (customerID, cardid) VALUES ('". $uid . "','" . $id . "')";

            if($selResult = $connection->query("SELECT * FROM buyitems WHERE customerID='" . $uid . "' AND cardid='" . $id . "'"))
            {
                if($selResult->num_rows > 0)
                {
                    $deleteQuery = "DELETE FROM buyitems WHERE customerID='" . $uid . "' AND cardid='" . $id . "'";
                    $result = $connection->query($deleteQuery);
                }
                else
                {
                    if( $connection->query($insertQuery) )
                        die("Success");
                }
            }
            else {
                die("Could not execute");
            }
            break;
        case "GET_CART":
            // Fetch current cart items
            $query = "SELECT customerID, cardid, id, name, price FROM buyitems, items WHERE buyitems.customerID ='" . $uid . "' AND items.id = buyitems.cardid";
            $result = $connection->query($query);

            if($result)
            {
                if($result->num_rows > 0)
                {
                    while($row = $result->fetch_assoc())
                    {
                        // print details
                        echo($row['name'] . "&" . $row['price'] . "-");
                    }
                }
                else
                    die("No data");
            }
            else
                die("Incorrect query");
            break;
        case "ABORT_CART":
            // Delete all items in cart
            $query = "DELETE FROM buyitems WHERE customerID=" . $uid;
            $result = $connection->query($query);

            break;
        case "GET_TOTAL":
            $query = "SELECT SUM(price) FROM buyitems, items WHERE buyitems.customerID ='" . $uid . "' AND items.id = buyitems.cardid";
            $result = $connection->query($query);

            if($result)
            {
                $row = $result->fetch_array(MYSQLI_NUM);
                $total = (double)$row[0];
                die(round($total, 2));
            }        
            break;
        case 'CHECKOUT':
            $dat = fopen("uid.txt", "r");
            if( $res = fgets($dat))
                $uid =  $res;
            fclose($dat);

            $query = "UPDATE customers SET checkout='" . time() + strtotime('+17 minutes') . "', total='" . $_POST['total'] . "', isCardScanned = '1' WHERE id='" . $uid . "' AND isCardScanned = '2'";

            if( $connection->query($query) )
                die("CheckoutSuccess");

            break;
        case 'SCAN_CARD':
            $dat = fopen("uid.txt", "r");
            if( $res = fgets($dat))
                $uid =  $res;
            fclose($dat);

            $query = "UPDATE customers SET isCardScanned = '0' WHERE id='" . $uid . "' AND isCardScanned = '1'";
            if($connection->query($query))
                die("CardScanned");
            else
                die("NoScanned");
        case 'GET_CARD_STAT':
            $dat = fopen("uid.txt", "r");
            if( $res = fgets($dat))
                $uid =  $res;
            fclose($dat);

            $query = "SELECT MAX(checkin), isCardScanned FROM customers WHERE id='" . $uid . "'";
            if($result = $connection->query($query))
            {
                $row = $result->fetch_assoc();
                die($row['isCardScanned']);
            }
    }
} 
catch (Throwable $th) 
{
    die("Exception: " . $th);
}
finally
{
    $connection->close();
}

?>
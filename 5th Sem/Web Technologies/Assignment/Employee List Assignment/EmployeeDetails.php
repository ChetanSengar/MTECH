<html>
<head>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<style>
  img {
    width: 100% !important;
    height: 100% !important;
  }

  div {
    width: 100%;
    height: 100%;
  }

  .alignD {
    text-align: center;
  }
</style>

<body>

  <?php
  $servername = "localhost";
  $username = "root";
  $password = "";
  $dbname = "webtechnology";
  $EID = $_POST['eid'];
  $ENAME = $_POST['ename'];
  $EPASSWORD = $_POST['epassword'];
  $EEMAIL = $_POST['eemail'];
  $ECOUNTRY = $_POST['ecountry'];

  // Create connection
  $conn = new mysqli($servername, $username, $password, $dbname);

  // Check connection
  if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
  } else {
    // echo "Connection with Database established successfully...";
  }
  $executeInsert = "INSERT INTO EMPLOYEEDATABASE (E_ID, E_NAME, E_PASSWORD, E_EMAIL, E_COUNTRY) 
  VALUES ('$EID', '$ENAME', '$EPASSWORD', '$EEMAIL', '$ECOUNTRY')";

  if ($conn->query($executeInsert) === FALSE) {
    echo "Error: " . $executeInsert . "<br>" . $conn->error;
  }
  $conn->close();
  ?>

  <div class="text-white">
    <img class="card-img" src="https://cdn.dribbble.com/users/928909/screenshots/6232696/completed.gif" alt="Card image">
    <div class="card-img-overlay ">
      <h5 class="card-title alignD">NEW ROW HAS BEEN INSERTED</h5>
      <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
      <a href="index.php">
        <h5 class="card-title alignD">>>Home<<</h5> </a> </div> </div> </body> </html>
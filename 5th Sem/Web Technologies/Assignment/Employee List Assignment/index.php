<html>
<!-- 
    Table Creation in DataBase. 

    Query: 
    CREATE TABLE `employeedatabase` (
    `E_ID` varchar(4000) NOT NULL,
    `E_NAME` varchar(4000) NOT NULL,
    `E_PASSWORD` varchar(4000) NOT NULL,
    `E_EMAIL` varchar(4000) NOT NULL,
    `E_COUNTRY` varchar(4000) NOT NULL
    ) ENGINE=InnoDB DEFAULT CHARSET=latin1;
    
 -->

<head>
    <title>
        Employee Details Assignment
    </title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<style>
    table {
        border: 1px;
        border-radius: 5px;
        border-color: black;
        border-style: solid;
        width: 100%;
        height: max-content;
        text-align: center;
    }

    div {
        margin: 15px;
    }

    input {
        width: 300px;
    }
</style>

<body>
    <h1>Assignment Name: Employee Details</h1>
    <!--  -->
    <table>
        <tr>
            <td>
                <table>
                    <h2>Employee Details</h2>
                    <tr>
                        <td>
                            <p><b>ID</p>
                        </td>
                        <td>
                            <p><b>NAME</p>
                        </td>
                        <td>
                            <p><b>PASSWORD</b></p>
                        </td>
                        <td>
                            <p><b>EMAIL</b></p>
                        </td>
                        <td>
                            <p><b>COUNTRY</b></p>
                        </td>
                        <td>
                            <p><b>Mark</b></p>
                        </td>
                        <td>
                            <p><b>Delete</b></p>
                        </td>
                    </tr>
                    <?php
                    $servername = "localhost";
                    $username = "root";
                    $password = "";
                    $dbname = "webtechnology";

                    // Create connection
                    $conn = new mysqli($servername, $username, $password, $dbname);

                    // Check connection
                    if ($conn->connect_error) {
                        die("Connection failed: " . $conn->connect_error);
                    }

                    $showTableQuery = "SELECT E_ID, E_NAME, E_PASSWORD, E_EMAIL, E_COUNTRY FROM EMPLOYEEDATABASE";
                    $result = $conn->query($showTableQuery);

                    if (isset($_POST['submitDelete'])) {
                        $checkKey = $_POST['checkBoxDelete'];
                        $checkQuery = $conn->query("DELETE from EMPLOYEEDATABASE where E_ID like '$checkKey'");
                    }

                    if ($result->num_rows > 0) {
                        // output data of each row
                        while ($row = $result->fetch_assoc()) {
                    ?>
                            <tr>
                                <form action="" method="post" role="form">
                                    <td><?php echo $row['E_ID'] ?></td>
                                    <td><?php echo $row['E_NAME'] ?></td>
                                    <td><?php echo $row['E_PASSWORD'] ?></td>
                                    <td><?php echo $row['E_EMAIL'] ?></td>
                                    <td><?php echo $row['E_COUNTRY'] ?></td>
                                    <td><input type="checkbox" name="checkBoxDelete" value="<?php echo $row['E_ID'] ?>" required></td>
                                    <td><input type="submit" name="submitDelete" class="btn btn-info"></td>
                                </form>
                            </tr>
                    <?php
                        }
                    } else {
                        echo "<tr> No Data Found </tr>";
                    }

                    $conn->close();
                    ?>
                </table>
            </td>
        </tr>
    </table>
    <!--  -->
    <br>
    <hr style="width: 70%; border: 1px solid black; border-radius: 5px;">
    <!--  -->
    <div class="container">
        <form action="EmployeeDetails.php" method="post">
            <h2>Add New Details : </h2>
            <div class="row">
                <div class="col">
                    <input type="number" id="eid" name="eid" placeholder="Employee ID..">
                </div>
                <div class="col">
                    <input type="text" id="ename" name="ename" placeholder="Employee Name..">
                </div>
                <div class="col">
                    <input type="password" id="epassword" name="epassword" placeholder="Employee Password..">
                </div>
            </div>
            <div class="row">
                <div class="col">
                    <input type="email" id="eemail" name="eemail" placeholder="Employee Email..">
                </div>
                <div class="col">
                    <input type="text" id="ecountry" name="ecountry" placeholder="Employee Country..">
                </div>
            </div>
            <div class="row">
                <div class="col">
                    <input type="submit" value="Submit">
                </div>
            </div>
        </form>
    </div>
    <!--  -->
</body>

</html>
 <?php
$cars = array("Volvo", "BMW", "Toyota");
for ($i =0 ; $i< sizeof($cars);$i++){
echo "I like " . $cars[$i]. "<br>";
}
$x=false;
if($x){
    echo 'x is true';
}
elseif (!$x){
    echo 'x is false';
}

?> 
<html>
    <head>
  <title>FabLab Queue System</title>
</head>
    <h1>FabLab Queue System</h1>
    <link rel="stylesheet" type="text/css" href="index_style.css" />
<body>
    
    <form action="display_queue.php" method="post">
  NETID: <input type="text" name="nid" placeholder="Your NETID">
  <br> <br>
  Email: <input type="text" name="email" placeholder="Email (Optional)">
  <br><br>
  <input type="submit" name="submit" value="Submit">
</form> 

<p>If you click the "Submit" button, the form-data will be sent to a page called "action_page.php".</p>

</body>
</html>

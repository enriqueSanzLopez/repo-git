<?php
try{
    $conexion = new PDO('mysql:host=localhost;dbname=empresa', 'entornocliente', 'ejemplo');//Intentar conectarse a la base de datos
    if(isset($_GET['pagina'])){
        $_GET['pagina']=$_GET['pagina']*4;
        $empleados=$conexion->query('SELECT * FROM empleado LIMIT 4 OFFSET '.$_GET['pagina'].';');//Conseguir los empleados de la tabla de la página correspondiente
    }else{
        $empleados=$conexion->query('SELECT * FROM empleado LIMIT 4;');//Conseguir a los empleados de la tabla de la primera página
    }
    header('Content-Type: application/json; charset=utf-8');//Indicar que se va ha devolver un json
    echo json_encode($empleados->fetchAll(PDO::FETCH_ASSOC));//Devolver los empleados en formato de json
}catch(PDOException $e){
}
?>

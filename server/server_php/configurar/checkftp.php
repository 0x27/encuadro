<?php
# conexi�n con el servidor FTP


$direccion=$_POST['ipservidorftp'];
$usuario=$_POST['usuario'];
$pass=$_POST['pass'];



if($x=@ftp_connect ($direccion,21)){
    //echo "Conexi�n FTP activada<br>";
	$respuesta=0;
	
}else{
   // echo "No se activo lo conexi�n FTP<br>";
	$respuesta=1;
   
  }
# registro de usuario
if(@ftp_login($x,$usuario,$pass)){
    //echo "El login y la password han sido aceptados";

	$respuesta=0;
	
	}else{
    //echo "Error en login o password";
	$respuesta=1;
	
	}
#desconexi�n
ftp_quit($x);

echo $respuesta;
?>
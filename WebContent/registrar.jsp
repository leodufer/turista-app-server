<!DOCTYPE HTML>

<html>
	<head>
		<title>Tur�sta App Ciudad del Este</title>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<meta name="description" content="" />
		<meta name="keywords" content="" />

		<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
		<link rel="stylesheet" type="text/css" href="css/bootstrap-responsive.css">
		</head>
	<body>
		
		<header>
			<div class="navbar">
			  <div class="navbar-inner">
			    <a class="brand" href="#">Tur�sta App</a>
			    <ul class="nav">
			    	<li class="active"><a href="#">inicio</a></li>
			    	<li><a href="#">hoteles</a></li>
			    	<li><a href="#">restaurantes</a></li>
			    	<li><a href="#">registrar lugares</a></li>
			    </ul>
			  </div>
			</div>
		</header>
		<section class="container">
			<h4>Tur�smo y Diversi�n en Ciudad del Este</h4>
			<img alt="" src="images/pic01a.jpg">
			<div class="container">
			 <form action="lugares" method="post">
			 	<label>Nombre</label>
			 	<input type="text" placeholder="Nombre del Lugar" required name="nombre">
			 	<label>Descripci�n</label>
			 	<textarea type="text" placeholder="Descripci�n del Lugar" required name="descripcion"></textarea>
			 	<label>Email</label>
			 	<input type="email" placeholder="Nombre del Lugar" required name="email">
			 	<label>Tel�fono</label>
			 	<input type="text" placeholder="N�mero de Tel�fono" required name="telefono">
			 	<label>Direcci�n</label>
			 	<textarea type="text" placeholder="Direcci�n del Lugar" name="direccion"></textarea>
			 	<label>Web</label>
			 	<input type="text" placeholder="Sitio Web" name="web">
			 	<label>Categor�a</label>
			 	<select name="categoria">
			 	<option value="1">Hotel</option>
			 	<option value="2">Restaurante</option>
			 	</select>
			 	<input type="hidden" name="x" value="10">
			 	<input type="hidden" name="y" value="15">
			 	<br>
			 	<a href="index.jsp" class="btn">Cancelar</a>
			 	<input type="submit" class="btn btn-danger" value="Guardar">
			 </form>
			</div>
		</section>
	</body>
</html>
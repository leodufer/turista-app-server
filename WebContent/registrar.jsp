<!DOCTYPE HTML>

<html>
	<head>
		<title>Turísta App Ciudad del Este</title>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />

		<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
		<link rel="stylesheet" type="text/css" href="css/bootstrap-responsive.css">
		</head>
	<body>
		
		<header>
			<div class="navbar">
			  <div class="navbar-inner">
			    <a class="brand" href="#">Turísta App</a>
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
			<h4>Turísmo y Diversión en Ciudad del Este</h4>
			<img alt="" src="images/pic01a.jpg">
			<div class="container">
			 <form action="lugares" method="post">
			 	<label>Nombre</label>
			 	<input type="text" placeholder="Nombre del Lugar" required name="nombre">
			 	<label>Descripción</label>
			 	<textarea type="text" placeholder="Descripción del Lugar" required name="descripcion"></textarea>
			 	<label>Email</label>
			 	<input type="email" placeholder="Nombre del Lugar" required name="email">
			 	<label>Teléfono</label>
			 	<input type="text" placeholder="Número de Teléfono" required name="telefono">
			 	<label>Dirección</label>
			 	<textarea type="text" placeholder="Dirección del Lugar" name="direccion"></textarea>
			 	<label>Web</label>
			 	<input type="text" placeholder="Sitio Web" name="web">
			 	<label>Categoría</label>
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
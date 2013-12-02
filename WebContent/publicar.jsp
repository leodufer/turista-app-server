<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Turista App :: Ciudad del Este</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="utf-8">
    <link rel="stylesheet" href="bootstrap.min.css" media="screen">
    <!--link rel="stylesheet" href="../assets/css/bootswatch.min.css"-->
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="../bower_components/bootstrap/assets/js/html5shiv.js"></script>
      <script src="../bower_components/bootstrap/assets/js/respond.min.js"></script>
    <![endif]-->
    <style type="text/css">
      html { height: 100% }
      body { height: 100%; margin: 0; padding: 0 }
      #map_canvas { height: 400px; color: #000000}
    </style>
    <script type="text/javascript"
      src="http://maps.googleapis.com/maps/api/js?key=AIzaSyBHiIuBV_WE8Vc9rNsurKkl75ziFdh8zXc&sensor=false">
    </script>
    <script type="text/javascript">

   var  geocoder;
   var marker;
   var infoWindow;
   var myStyles =[
    {
        featureType: "poi",
        elementType: "labels",
        stylers: [
              { visibility: "off" }
        ]
     }
    ];
      function initialize() {
        var mapOptions = {
          center: new google.maps.LatLng(-25.5167, -54.6167),
          zoom: 16,
          mapTypeId: google.maps.MapTypeId.ROADMAP,
          styles: myStyles 
        };
        geocoder = new google.maps.Geocoder();
        infowindow = new google.maps.InfoWindow();
        var map = new google.maps.Map(document.getElementById("map_canvas"),
            mapOptions);


        google.maps.event.addListener(map, 'click', function(e) {
          geocoder.geocode(
              {'latLng': e.latLng},
              function(results, status) {
                if (status == google.maps.GeocoderStatus.OK) {
                  if (results[0]) {
                    if (marker) {
                      marker.setPosition(e.latLng);
                    } else {
                      marker = new google.maps.Marker({
                         position: e.latLng,
                         map: map});
                    }
                    infowindow.setContent(results[0].formatted_address);
                    infowindow.open(map, marker);
                    //log of console
                    console.log(e.latLng);
                    console.log(e.latLng.toString());
                    console.log(e.latLng.lat());
                    console.log(e.latLng.lng());
                    // set value in input 
                    document.getElementById("latitud").setAttribute("value", e.latLng.lat());
                    document.getElementById("longitud").setAttribute("value", e.latLng.lng());
                    document.getElementById("direccion").setAttribute("value", results[0].formatted_address);
                  } else {
                    document.getElementById('geocoding').innerHTML =
                        'No results found';
                  }
                } else {
                  document.getElementById('geocoding').innerHTML =
                      'Geocoder failed due to: ' + status;
                }
              });
        });
      }
    </script>

  </head>
  <body onload="initialize()">
   
    <div class="navbar navbar-default navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <a href="pages.html" class="navbar-brand">TuristaApp</a>
          <button class="navbar-toggle" type="button" data-toggle="collapse" data-target="#navbar-main">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
        </div>
        <div class="navbar-collapse collapse" id="navbar-main">
          <ul class="nav navbar-nav">
            <li><a href="#">Hoteles</a></li>
            <li><a href="#">Restaurantes</a></li>
          </ul>
        </div>
      </div>
    </div>


    <div class="container">

      <div class="page-header" id="banner">
        <div class="row">
          <div class="col-lg-8">
            <h1></h1>
             <p class="lead">La aplicación móvil de recomendación turística <strong>#1</strong> para Ciudad de Este. Hecho para Ciudad del Este, por personas que aman Ciudad del Este.</p>
          </div>
          
        </div>
      </div>

    

     

      
      <div class="bs-docs-section">

        <div class="row">
          <div class="col-lg-12">
            <div class="well">
            <div class="bs-example">
              <legend>Ubicación</legend>
              <div id="map_canvas"></div>
            </div>
          </div>
          </div>
        </div>
        <div>
           <div class="well">
          <form action="lugares" method="post" class="bs-example form-horizontal">
                <fieldset>
                  <legend>Información General</legend>
                  <div class="form-group">
                    <label for="nombre" class="col-lg-2 control-label">Nombre</label>
                    <div class="col-lg-10">
                      <input type="text" class="form-control" id="nombre" placeholder="Nombre" name="nombre" required>
                    </div>
                  </div>
                  
                  <div class="form-group">
                    <label for="descripcion" class="col-lg-2 control-label">Descripción General</label>
                    <div class="col-lg-10">
                      <textarea class="form-control" rows="3" id="descripcion" name="descripcion" placeholder="Información General del Lugar, Servicio Ofrecidos, Características, Horario de Atención, Toda la información que quieras dar a conocer." required></textarea>
                    </div>
                  </div>
                  
                  
                  <div class="form-group">
                    <label for="email" class="col-lg-2 control-label">Email</label>
                    <div class="col-lg-10">
                      <input type="email" class="form-control" id="email" placeholder="Email de contacto" name="email">
                    </div>
                  </div>
                  
                  <div class="form-group">
                    <label for="telefono" class="col-lg-2 control-label">Teléfono</label>
                    <div class="col-lg-10">
                      <input type="text" class="form-control" id="telefono" placeholder="Teléfono de contacto" name="telefono">
                    </div>
                  </div>

                  <div class="form-group">
                    <label for="direccion" class="col-lg-2 control-label">Dirección</label>
                    <div class="col-lg-10">
                      <input type="text" class="form-control" id="direccion" placeholder="Dirección del local" name="direccion" required>
                    </div>
                  </div>
                  
                  <div class="form-group">
                    <label for="web" class="col-lg-2 control-label">Sitio web</label>
                    <div class="col-lg-10">
                      <input type="text" class="form-control" id="web" placeholder="Sitio Web del local" name="web">
                    </div>
                  </div>

                  <div class="form-group">
                    <label for="categoria" class="col-lg-2 control-label">Categoría</label>
                    <div class="col-lg-10">
                      <select class="form-control" id="categoria" name="categoria">
                         <option value="1">Hoteles</option>
                         <option value="2">Restaurantes</option>
                      </select>
                    </div>
                  </div>
                  <div class="form-group">
                    <div class="col-lg-10 col-lg-offset-2">
                      <a class="btn btn-default" href="pages.html">Cancel</a> 
                      <button type="submit" class="btn btn-primary">Publicar</button> 
                    </div>
                  </div>
                </fieldset>
                <input type="hidden" name="x" id="latitud">
                <input type="hidden" name="y" id="longitud">
              </form>
              </div>
        </div>

      
      <div class="bs-docs-section">
        
        <div class="row">
          
        </div>
        
      </div>

      <!-- Progress bars
      ================================================== -->
      </div>


      <footer>
        <div class="row">
          <div class="col-lg-12">
            <hr>      
            <p>Basado en <a href="http://getbootstrap.com">Bootstrap</a>. Fuente Web de <a href="http://www.google.com/webfonts">Google</a>.
          </div>
        </div>
        
      </footer>
    </div>
  </body>
  
  <script type="text/javascript" src="js/jquery-2.0.2.min.js"></script>
  <script type="text/javascript" src="js/bootstrap.js"></script>
</html>
$(document).ready(function(){
	
	$('#btnSend').click(function(){

		var errores = '';


		if( $('#CorreoElectronico').val() == '' ){
			errores += '<p>Escriba un correo electronico</p>';
		}

		if( $('#FechaDeNacimiento').val() == '' ){
			errores += '<p>Escriba fecha de nacimiento</p>';
		}

		if( $('#ConfirmeContraseña').val() == '' ){
			errores += '<p>Las contraseñas no coinciden</p>';
		}

		if(errores == ''== false){
			var mensajeModal ='<div class="modal_wrap">'+ 
                                 '<div class="mensaje_modal">'+
                                      '<h3>Errores Encontrados</h3>'+
                                errores+
                              '<span> id="btnClose">Cerrar</span>'+
                            '</div>'+ 
                          '</div>';
      

        $('body').appened(mensajeModal);
    }

    $('btnClose').click(function(){
    	$('.modal_wrap').remove();

    });

  });
  }
  
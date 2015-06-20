/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function(){
//alert("Viendo si se carga mi archivo");

// El # sirve para selccionar un Id que se creo en el HTML
$("#boton-hola").click(function(){
   /*
    * Vamos a enviar el dato al Servlet HOLA
    * y esperar la respuesta del Servlet HOLA
    */ 
   $.ajax({
      url:"hola2",
      method:"get",
      data:{
          nombre:$("#nombre").val()
      },
      success:function (datos){
          $("#respuesta").html(datos);
      },
      failure:function(){
          
      }
   });
});
});


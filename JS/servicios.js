$(document).ready(function(){



    $('#mostrarProductos').on('click', function() {

        let tabla = document.querySelector('#tablaProductos')
        tabla.innerHTML = '<thead>' +
        '<th class="titleTabla" colspan="7">PRODUCTOS' +
        '<thead>' +
        '<th class="titleTabla">Codigo' +
        '<th class="titleTabla">Cantidad' +
        '<th class="titleTabla">Nombre' +
        '<th class="titleTabla">Categoria' +
        '<th class="titleTabla">Precio' +
        '<th class="titleTabla">Total' +
        '<th class="titleTabla">Total IVA'

        $.ajax({
            
            url: "http://localhost:8080/mostrarProductos",
            type: "GET",
            datatype: "JSON",
            success: function(respuesta) {

                for (i=0; i <= respuesta.length; i++) {

                    tabla.innerHTML += '<tr><td>' + respuesta[i].codigo + 
                    '<td>' + respuesta[i].cantidad +
                    '<td>' + respuesta[i].nombre +
                    '<td>' + respuesta[i].categoria +
                    '<td>' + respuesta[i].precio +
                    '<td>' + respuesta[i].total +
                    '<td>' + respuesta[i].totalIva 

                }
    
            }

        });

    });



    $('#eliminarProCategoria').on('click', function() {

        let categoria = $('#categoria').val();
        console.log(categoria)
        $.ajax({

            url: "http://localhost:8080/eliminarProCategoria/" + categoria,
            type: "DELETE",
            datatype: "TEXT",
            success: function(respuesta) {
                alert(respuesta)
            }

        });

    });



    $('#actualizarProPrecio').on('click', function() {
        
        $.ajax({
        
            type: "PUT", 
            url: "http://localhost:8080/actualizarProPrecio",
            datatype: "TEXT",
            success: function(respuesta) {
                alert(respuesta)
            }

        });

    });



});
$(document).ready(function() {


    $.getJSON("/MPlatillos", function(dataResult) {
        console.log(dataResult)

        var PlatillosData;
        $.each(dataResult, function(key, value) {
            PlatillosData += '<tr>';
            PlatillosData += '<th scope="row">' + value.idPlatillo + '</th>'
            PlatillosData += '<th>' + value.nombre + '</th>';
            PlatillosData += '<th>' + value.Descripcion+ '</th>';
            PlatillosData += '</tr>';
        })

        $('#PlatillosTable').append(PlatillosData);
    })

});
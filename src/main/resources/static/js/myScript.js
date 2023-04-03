function getGames() {
    $.ajax({
        url: 'api/games/all',
        type: 'GET',
        dataType: 'json', // Se espera una respuesta en formato JSON
        contentType: 'application/json; charset=utf-8',
        success: function(data) {
            // Aquí procesamos los datos obtenidos
            console.log(data);
            paintGames(data);
        },
        error: function(jqXHR, textStatus, errorThrown) {
            // Aquí manejamos cualquier error que pueda haber ocurrido
            console.log(textStatus + ': ' + errorThrown);
        }
    });

}

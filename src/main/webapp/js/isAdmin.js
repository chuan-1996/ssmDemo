$( function() {
    var name = $('#user-name'),
        management = $('#management');
    if(name.text()!=="admin"){
        management.hide();
    }
} );
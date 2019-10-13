$( function() {
    var $login = $( '.login-form1' ), //获取登录表单对象
        $submit = $( '.loginBtn' ),  //获得提交按钮对象
        $error = $('#error');
    $error.hide();
    //登录按钮响应事件
    $submit.on( 'click', function(){

        $.ajax( {
            url: './update-password',  //登录验证请求的地址
            method: 'POST',    //ajax方式
            data: $login.serialize(),  //表单数据
            dataType: 'JSON'
        } ).then( function( json ) {
            if( json.bizNo > 0 ) {  //前后通信成功，请求成功
                $error.hide();
                //window.location.href = '/analysis/index' ;  它或下面都可以
                window.location.href = './login' ;
            }else { //前后通信成功，请求失败
                $error.html(json.bizMsg);
                $error.show();
            }
        }, function() { //前后通信失败
            alert("ajax连接异常：");
        } ).always( function(){ //无论请求失败还是成功始终都会执行的内容

        } );
        return false;
    } );
} );

$(document).ready(function() {
    myIndex();
});

function  myIndex() {
    $.ajax({
        type:"post",
        url:"/index.do",
        dataType: "text",
        error:function(){
        },
        success:function(data){
            console.log(data);
            $("#aTitle").html(data);
        }
    })
}
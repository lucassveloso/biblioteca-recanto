function marcaBotaoCategoriaAtual(){
    var categorias = $("#menu-categoria");
    var botoesCategorias = categorias.find(".categoria").each(function(){
         if($(this).attr('value') === getParametros()["categoria"]){
            $(this).toggleClass("categoria-atual");
            $(this).on("click", function(){return false;});
                }
    });
}

$(document).ready(function(){
    marcaBotaoCategoriaAtual();
});
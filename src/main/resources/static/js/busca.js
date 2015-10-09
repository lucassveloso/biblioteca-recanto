function onClickBotaoBusca(){
    getParametros();
    setParametro("busca", $("#input-busca").val());
    removerParametro("pagina");
    acessarPaginaComParametros("");
}


$(document).ready(function(){
      $("#btn-busca").on("click", onClickBotaoBusca);

      $("#input-busca").keypress(function(e){
      	    if (e.which == 13){
          		onClickBotaoBusca();
      	    }
          });
});
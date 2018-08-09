/* 
 */
function validarFormulario() {
    if(validadarCampoNome()== false || 
            validadarCampoQuantidade() == false ){
        
        event.preventDefault();
    }
    
    event.preventDefault();
}

function validadarCampoNome(){
    var nome = document.getElementById("campo-nome").value;
    var quantidadeDeCaracteres = nome.length;

    apagarElementoSeExiste("span-campo-nome-menor-7");
    apagarElementoSeExiste("span-campo-nome-maior-100");

    if (quantidadeDeCaracteres < 7) {
        gerarSpan("span-campo-nome-menor-7", "Nome deve conter no minimo 7 caracteres"
                , "div-campo-nome");
        adicionarClasse("campo-nome", "border-danger");
        apagarClasse("campo-nome", "border-success");
        return false;
    } else if (quantidadeDeCaracteres > 100) {
        gerarSpan("span-campo-nome-maior-100", "Nome deve conter no máximo 100 caracteres"
                , "div-campo-nome");
        adicionarClasse("campo-nome", "border-danger");
        apagarClasse("campo-nome", "border-success");
        return false;
    } else {
        adicionarClasse("campo-nome", "border-success");
        apagarClasse("campo-nome", "border-danger");
        adicionarClasse("campo-quantidade","border-success");
        apagarClasse("campo-quantidade","border-danger");
        return false;
    }
    
}

function validadarCampoQuantidade(){
    var quantidade = parseInt(document.getElementById("campo-quantidade").value);
    if(quantidade <= 0){
        gerarSpan("span-campo-quantidade-menor-zero","Quantidade de ser positiva","div-campo-quantidade");
        adicionarClasse("campo-quantidade","border-success");
        apagarClasse("campo-quantidade","border-danger");
        return false;
    }else{
        adicionarClasse("campo-quantidade","border-success");
        apagarClasse("campo-quantidade","border-danger");
        return true;
    
    }
}

function apagarClasse(id, classCor) {
    document.getElementById(id).classList.remove(classCor);
}
function adicionarClasse(id, classCor) {
    document.getElementById(id).classList.add(classCor);
}

function apagarElementoSeExiste(id) {
    if (document.contains(document.getElementById(id))) {
        document.getElementById(id).remove();
    }
}


function gerarSpan(id, texto, idPai) {
    var span = document.createElement("span");
    span.id = id;
    span.textContent = texto;
    span.classList.add("text-danger");
    span.classList.add("font-weight-bold");

    document.getElementById(idPai).appendChild(span);


}

function cadastroProdutoSelect(){
	let elementoTitulos = document.forms['formProduto'].idCategoria;
	let value = elementoTitulos.options[elementoTitulos.selectedIndex].value;
	
	if(value==1){
		alert("Cadastrar Titulo")
	}
	else{
		alert("selecionado")
	}
}

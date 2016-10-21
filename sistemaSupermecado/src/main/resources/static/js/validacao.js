function validaForm() {
	var form = document.forms['formProduto'];
	var formOk = true;
	
	

	if (!validaCodigoBarras(form.codigoBarras.value)) {
		console.log('codigo errado');
	formOk = false;
		}
	
	if(!validaNome(form.nome.value)){
		console.log('nome errado');
		formOk = false;
	}
	
	if(!validaValorUnitario(form.valorUnitario.value)){
		console.log('Valor unitario errado');
		formOk = false;
	}
	
	if(!validaQtdEstoque(form.qtdEstoque.value)){
		console.log('Qtd estoque errado');
		formOk = false;
	}
	
	if(!validaQtdMinimaEstoque(form.qtdMinimo.value)){
		console.log('Quantidade mínima errada');
		formOk = false;
	}
	
	if(!validaCategoria()){
		console.log('Categoria errado');
		formOk = false;
	}
	
	
	if(formOk) return true;
	else return false;
	
	
}

function validaCodigoBarras(codigoBarras) {
	if (codigoBarras == "" | codigoBarras == undefined)	return false;
	else
		return true;
}

function validaNome(nome){
	if(nome=="" | nome == undefined) return false
	else return true;
}

function validaValorUnitario(valorUnitario){
	if(valorUnitario == "" | valorUnitario == undefined) return false;
	else return true;
}

function validaQtdEstoque(qtdEstoque){
	if(qtdEstoque == "" | qtdEstoque == undefined) return false;
	else return true;
}

function validaQtdMinimaEstoque(qtdMinimaEstoque){
	if(qtdMinimaEstoque == "" | qtdMinimaEstoque == undefined) return false;
	else return true;
}

function validaCategoria(){
	//cadastroProdutoSelect();
	var categoria = document.forms['formProduto'].idCategoria;
	alert(categoria.value);
	var categoriaIndex = categoria.selectedIndex;
	if(categoriaIndex == 0 | categoriaIndex == undefined) return false;
	else return true;
}

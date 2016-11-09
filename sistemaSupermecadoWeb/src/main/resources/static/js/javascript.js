$('#confirmacaoExclusaoModal').on('show.bs.modal', function(event) {
	let button = $(event.relatedTarget);
	
	let codigoTitulo = button.data('id');
	let descricaoTitulo = button.data('nome');

	
	let modal = $(this);
	let form = modal.find('form');
	let action = button.data('action');
	if (!action.endsWith('/')) {
		action += '/';
	}
	form.attr('action', action + codigoTitulo);
	
	modal.find('.modal-body span').html('Tem certeza que deseja excluir o título <strong>' + descricaoTitulo + '</strong>?');
	
});

jQuery(document).ready(function($) {

	$("#search-form").click(function(event) {

		var search = {}
		search["nome"] = $("#nome").val();
		search["descricao"] = $("#descricao").val();
		$.ajax({
			type : "POST",
			contentType : "application/json",
			url : "/categorias",
			data : JSON.stringify(search),
			dataType : 'json',
			timeout : 100000,
			success : function(data) {
				console.log("SUCCESS: ", data.nome);
				display(data);
			},
			error : function(e) {
				console.log("ERROR: ", e);
				display(e);
			},
			done : function(e) {
				console.log("DONE");
				enableSearchButton(true);
			}
		});
		// Prevent the form from submitting via the browser.
		event.preventDefault();

	});
	
	
});
$('#close').click( function (e) {
	$.getJSON("/categorias/data/jsonList", function(response){ 
	    $("#focusCategoria option").remove(); 
	        let options = ''; 
	        $.each(response, function(index,nome) {
	            options += '<option value="' + nome.id + '">' + nome.nome + '</option>';
	            $("#focusCategoria").html(options);
	        });
	});
});

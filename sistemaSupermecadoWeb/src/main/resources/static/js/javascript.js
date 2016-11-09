<<<<<<< HEAD
$('#confirmacaoExclusaoModal').on('show.bs.modal', function(event) {
	let button = $(event.relatedTarget);
	
	let codigoTitulo = button.data('id');
	let descricaoTitulo = button.data('nome');

	
	let modal = $(this);
	let form = modal.find('form');
	let url = form.data('url-base');
	let action = button.data('action');
	if (!action.endsWith('/')) {
		action += '/';
	}
	form.attr('action', url+ action + codigoTitulo);
	
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
				console.log("SUCCESS: ", data);
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
=======
$('#confirmacaoExclusaoModal').on('show.bs.modal', function(event) {
	let button = $(event.relatedTarget);
	
	let codigoTitulo = button.data('id');
	var descricaoTitulo = button.data('nome');

	
	let modal = $(this);
	let form = modal.find('form');
	let action = button.data('action');
	if (!action.endsWith('/')) {
		action += '/';
	}
	form.attr('action', action + codigoTitulo);
	
	modal.find('.modal-body span').html('Tem certeza que deseja excluir o título <strong>' + descricaoTitulo + '</strong>?');
});
jQuery(document).ready(function(){
	jQuery('#ajax_form').submit(function(){
		var dados = jQuery( this ).serialize();

		jQuery.ajax({
			type: "POST",
			url: "/categoria",
			data: dados,
			success: function( data )
			{
				alert( data );
			}
		});
		
		return false;
	});
});
>>>>>>> master

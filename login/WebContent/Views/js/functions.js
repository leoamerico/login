// Initialize jQuery Visualise
$(function(){
	$('#stats').visualize({type: 'line', height: '300px', width: '600px'});
});

// Sidebar Toggle
var fluid = {
Toggle : function(){
	var default_hide = {"grid": true };
	$.each(
		["pagesnav", "commentsnav", "userssnav", "imagesnav"],
		function() {
			var el = $("#" + (this == 'accordon' ? 'accordion-block' : this) );
			if (default_hide[this]) {
				el.hide();
				$("[id='toggle-"+this+"']").addClass("hidden")
			}
			$("[id='toggle-"+this+"']")
			.bind("click", function(e) {
				if ($(this).hasClass('hidden')){
					$(this).removeClass('hidden').addClass('visible');
					el.slideDown();
				} else {
					$(this).removeClass('visible').addClass('hidden');
					el.slideUp();
				}
				e.preventDefault();
			});
		}
	);
}
}
jQuery(function ($) {
	if($("[id^='toggle']").length){fluid.Toggle();}
});

// Notification Animations
$(function () { 
$('.notification').hide().append('<span class="close" title="Dismiss"></span>').fadeIn('slow');
$('.notification .close').hover(
function() { $(this).addClass('hover'); },
function() { $(this).removeClass('hover'); }
);
$('.notification .close').click(function() {
$(this).parent().fadeOut('slow', function() { $(this).remove(); });
}); 

});



// jQuery UI - Live Search
$(function() {
		var availableTags = ["gallery", "dashboard", "pages", "manage pages", "edit pages", "delete pages", "users", "manage users", "edit users", "delete users", "settings", "system settings", "server settings", "documentation", "help", "community forums", "contact"];
		$("#livesearch").autocomplete({
			source: availableTags
		});
	});



// jQuery UI - Dialog Box
	$(function() {
		$('#dialog').dialog({
			autoOpen: false,
			modal: true,
			width: 500
		})
		$('#opener').click(function() {
			$('#dialog').dialog('open');
			return false;
		});

	});
	
// MASCARA MAIUSCULA
	function maiuscula(z){
	        v = z.value.toUpperCase();
	        z.value = v;
	    }
//FIM MASCARA MAIUSCULA
	
	
// VALIDA CPF
	function Verifica_campo_CPF(campo) {
		var CPF = campo.value; // Recebe o valor digitado no campo
	
		// Aqui começa a checagem do CPF
		var POSICAO, I, SOMA, DV, DV_INFORMADO;
		var DIGITO = new Array(10);
		DV_INFORMADO = CPF.substr(9, 2); // Retira os dois últimos dígitos do Número informado
	
		// Desmembra o Número do CPF na array DIGITO
		for (I = 0; I <= 8; I++) {
			DIGITO[I] = CPF
					.substr(I, 1);
		}
	
		// Calcula o valor do 10º dígito da verificacao
		POSICAO = 10;
		SOMA = 0;
	
		for (I = 0; I <= 8; I++) {
			SOMA = SOMA + DIGITO[I]
					* POSICAO;
			POSICAO = POSICAO - 1;
		}
	
		DIGITO[9] = SOMA % 11;
		if (DIGITO[9] < 2) {
			DIGITO[9] = 0;
		} else {
	
			DIGITO[9] = 11 - DIGITO[9];
		}
	
		// Calcula o valor do 11º dígito da verificacao
		POSICAO = 11;
		SOMA = 0;
	
		for (I = 0; I <= 9; I++) {
			SOMA = SOMA + DIGITO[I]
					* POSICAO;
			POSICAO = POSICAO - 1;
		}
	
		DIGITO[10] = SOMA % 11;
		if (DIGITO[10] < 2) {
			DIGITO[10] = 0;
		} else {
	
			DIGITO[10] = 11 - DIGITO[10];
		}
	
		// Verifica se os valores dos dígitos verificadores conferem
		DV = DIGITO[9] * 10
				+ DIGITO[10];
		if (DV != DV_INFORMADO) {
			alert('CPF inválido');
			campo.value = '';
			campo.focus();
			return false;
		}
	}
//FIM VALIDA CPF
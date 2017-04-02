$(document).ready(
		function() {
			$('#boutonUtilisateur').click(
					function() {
						var Utilisateur = {};
						
						Utilisateur["pseudo"] = $('#pseudo').val();
						Utilisateur["motDePasse"] = $('#pass').val();
						Utilisateur["email"] = $('#email').val();
						
						$.ajax({
							type : "POST",
							contentType : "application/json",
							url : "/creerUtilisateur",
							data : JSON.stringify(Utilisateur),
							dataType : 'json',
							success : function(data) {
								var date = new Date(data["derniereMaj"]);
								data["derniereMaj"] = date;
								var json = "<h4>Ajax Response</h4><pre>"
										+ JSON.stringify(data, null, 4) + "</pre>";
								$('#reponse').html(json);

								console.log("SUCCESS : ", data);
							},
							error : function(e) {

								var json = "<h4>Ajax Response</h4><pre>" + e.responseText
										+ "</pre>";
								$('#reponse').html(json);

								console.log("ERROR : ", e);
							}					
						});
					}),
			$('#boutonRole').click(
					function() {
						var Role = {};
						
						Role["nom"] = $('#nomRole').val();
						
						$.ajax({
							type : "POST",
							contentType : "application/json",
							url : "/creerRole",
							data : JSON.stringify(Role),
							dataType : 'json',
							success : function(data) {
								var date = new Date(data["derniereMaj"]);
								data["derniereMaj"] = date;
								var json = "<h4>Ajax Response</h4><pre>"
										+ JSON.stringify(data, null, 4) + "</pre>";
								$('#reponse').html(json);

								console.log("SUCCESS : ", data);
							},
							error : function(e) {

								var json = "<h4>Ajax Response</h4><pre>" + e.responseText
										+ "</pre>";
								$('#reponse').html(json);

								console.log("ERROR : ", e);
							}			
						});
					});
					
		});
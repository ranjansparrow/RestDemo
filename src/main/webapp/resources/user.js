$(document)
		.ready(
				function() {
					$
							.ajax({
								url : '/Ecommerce/users',
								type : 'GET',
								success : function(response) {
									$
											.each(
													response,
													function(i, data) {
														var result = "<p> Id:"
																+ data.id
																+ "Name"
																+ data.name
																+ "Salary"
																+ data.salary
																+ "</p>"
																+ "<span>"
																+ "<input type = 'submit' value = 'Delete' onclick = 'clickme("
																+ data.id
																+ ")' />"
																+ "</span>"
														$("#showuser").append(
																result);
													})

								}
							})
				})

function clickme(id) {
	$.ajax({
		url : '/Ecommerce/users/' + id,
		type : 'DELETE',
		success : function() {
			location.reload(true)
		},
		error : function() {
			console.log("erroer");
		}
	})
}
function iamhere(){
	alert($("#salary").val());
	var dataToSend = JSON.stringify(serializeObject($('#adduser')));
	alert("hello" + dataToSend);
	$.ajax({
		type : 'POST',
		url : '/Ecommerce/users',
		dataType : "json", // Accept header
		data : "salary:"+'$("#salary").val()' + ",name :" + '$("#name").val()',
		contentType : 'application/json', // Sends - Content-type
		success : function() {
			console.log("hello");
			location.reload(true);
		},

		error : function(errorObject) {
			console.log("error while adding user");
		}
	});
}


//Then put in JSON format
function serializeObject(form) {

	var jsonObject = {};
	var array = form.serializeArray();
	$.each(array, function() {
		jsonObject[this.name] = this.value;
	});
	return jsonObject;

}
function edit(n) {
	alert("Here you edit " + n + "th employee.");
}

function del(n) {
	answer = confirm("Delete employee #" + n + "?");
	if (answer) {

		var data = 'delete-employee=' + n;
		
		$.ajax({
			url : 'delete-employee.do',
			type : 'POST',
			data : data,
			contentType : 'text/plain',
			success : function(data) {
				alert(data + " succeeded.");
			},
			error : function(data, status, error) {
				alert(data + " failed." + "\nStatus : " + status + "\nError : " + error);
			}
		})
	}
}
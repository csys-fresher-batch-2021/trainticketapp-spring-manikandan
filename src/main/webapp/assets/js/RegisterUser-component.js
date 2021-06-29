/**
 * This Method is to Register User Details
 */
function registerUser(){
		event.preventDefault();
		let firstName = document.querySelector("#firstName").value;
		let lastName = document.querySelector("#lastName").value;
		let email = document.querySelector("#email").value;
		let mobileNumber = document.querySelector("#mobileNumber").value;
		let userName = document.querySelector("#userName").value;
		let newPassword = document.querySelector("#newPassword").value;
	
	
	let user = {
			"firstname": firstName,
	        "lastname": lastName,
	        "email": email,
	        "mobilenumber": mobileNumber,
	        "username": userName,
	        "newpassword": newPassword
	};
	console.log(user);				
	let url ="http://localhost:9000/User/register";
	let content="";
	axios.post(url,user).then(res=>{
		console.log("Success");
		let data = res.data;
		console.log(data);
		content+="<span style=color:green;>" + data.infoMessage + "</span>";
		document.querySelector("#message").innerHTML= content;
	}).catch(err=>{
		console.log("Error");
		let data = err.response.data;
		console.log(data);	
		content+="<span style=color:red;>" + data.errorMessage + "</span>";
		console.log(content);
		document.querySelector("#message").innerHTML= content;				
	});
	}
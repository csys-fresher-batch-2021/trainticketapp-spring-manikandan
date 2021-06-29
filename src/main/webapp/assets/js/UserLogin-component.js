/**
 * This Method is to check User Login Credential
 */
function userLogin(){			
		event.preventDefault();
		let userName = document.querySelector("#userName").value;
		let password = document.querySelector("#password").value;
		localStorage.setItem("role","USER");
		let user={
				"username": userName,
		        "newpassword": password					    
			};				
		let url = "http://localhost:9000/User/userLogin";
		let content="";
		axios.post(url,user).then(res=>{
			let data = res.data;
			console.log(data.infoMessage);
			content+="<span style=color:green;>" + data.infoMessage + "</span>";
			document.querySelector("#message").innerHTML= content;
		}).catch(err=>{
			console.log("Error");
			let data = err.response.data;
			console.log(data);	
			content+="<span style=color:red;>" + data.errorMessage + "</span>";
			document.querySelector("#message").innerHTML= content;							
		});		
 }
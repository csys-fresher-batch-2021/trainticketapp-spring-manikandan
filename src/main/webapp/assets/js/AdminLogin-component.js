/**
 * This Method is to check Admin Login Credential
 */
function adminLogin(){	
		event.preventDefault();
		let userName = document.querySelector("#adminId").value;
		let password = document.querySelector("#password").value;
		localStorage.setItem("role","ADMIN");
		let admin={
			    "adminId" : userName,
			    "password" : password					    
			};					
		let url = "http://localhost:9000/User/adminLogin";
		let content="";
		axios.post(url,admin).then(res=>{
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
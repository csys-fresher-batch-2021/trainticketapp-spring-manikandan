/**
 * This Method is to add Train details
 */
function addTrain(){
				
				event.preventDefault();
				let trainNumber = document.querySelector("#trainNumber").value;
				let trainName = document.querySelector("#trainName").value;
				let source = document.querySelector("#source").value;
				let destination = document.querySelector("#destination").value;
				let sourceTime = document.querySelector("#sourcetime").value;
				let destinationTime = document.querySelector("#destinationtime").value;
				let classType = document.querySelector("#classType").value;
				let fare = document.querySelector("#fare").value;
				let availability = document.querySelector("#availability").value;
				
				let train={
					    "trainNumber": trainNumber,
					    "trainName": trainName,
					    "source": source,
					    "destination": destination,
					    "sourceTime":sourceTime + ":00",
					    "destinationTime": destinationTime + ":00",
					    "classType": classType,
					    "fare": fare,
					    "availability": availability
					  }; 
				console.log(train);				
				let url = "http://localhost:9000/trains/addTrain";
				let content="";
				axios.post(url,train).then(res=>{
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
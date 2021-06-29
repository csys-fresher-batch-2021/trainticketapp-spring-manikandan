/**
 * This Method is to Fetch All Train Details
 */
function getAllTrains() {
				let url = "http://localhost:9000/trains/trainList";
				fetch(url).then(res=> res.json()).then(res=>{
				let trains=res;		
				console.log(trains);
				let content="";				
				let i = 1;
				for(let train of trains){
					
						content+="<tr><td rowspan=2>"+ i++ + "</td><td rowspan=2>" + train.trainNumber  + "</td><td rowspan=2>" + train.trainName + "</td><td>"+ train.source + "</td>";
						content+="<td>"+ train.destination + "</td><td rowspan=2>" + train.classType  + "</td><td rowspan=2>" + train.fare + "</td><td rowspan=2>"+ train.availability + "</td></tr>";
						content+="<tr><td>DEPARTURE TIME: " + train.sourceTime + "</td><td>ARRIVAL TIME: " + train.destinationTime + "</td></tr>";
				}
				document.querySelector("#trainList").innerHTML= content;
				});		
			}
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Train List</title>
<style type="text/css">
table, td, th {
	text-align: center;
}
</style>
</head>
<body onload="getAllTrains()">
	<jsp:include page="Header.jsp"></jsp:include>
	<main class="container-fluid">
		<h3 class="text-center">List of Trains</h3>
		<p class="text-center"></p>
		<table class="table table-bordered">
			<caption>Train List</caption>
			<thead>
				<tr>
					<th id="trainID">SI.NO</th>
					<th id="trainNo">Train No</th>
					<th id="trainName">Train Name</th>
					<th id="source">Source</th>
					<th id="destination">Destination</th>
					<th id="classType">Class</th>
					<th id="fare">Fare(Rs./-)</th>
					<th id="availability">Availability</th>
				</tr>
			</thead>
			<tbody id="trainList">
			</tbody>
		</table>
	</main>
	<script>
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
	</script>
</body>
</html>
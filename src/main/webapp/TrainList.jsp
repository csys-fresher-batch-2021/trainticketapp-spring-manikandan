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
	<script src="assets/js/TrainList-component.js"></script>
</body>
</html>
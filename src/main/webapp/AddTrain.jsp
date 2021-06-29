<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Add Trains</title>
</head>
<body>
	<jsp:include page="Header.jsp"></jsp:include>
	<main class="container-fluid">
		<div class="card bg-light">
			<article class="card-body mx-auto" style="max-width: 400px;">
				<h4 class="card-title mt-3 text-center">ADD TRAIN</h4>
				<p class="text-center" id="message"></p>
				<form method="post" onsubmit="addTrain()">
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text" style="width: 160px;">TRAIN
								NUMBER</span>
						</div>
						<input type="number" name="trainNumber" id="trainNumber"
							style="width: 160px;" placeholder="Train Number"
							autocomplete="off" required><br />
					</div>
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text" style="width: 160px;">TRAIN
								NAME</span>
						</div>
						<input type="text" name="trainName" id="trainName"
							style="width: 160px;" placeholder="Train Name" autocomplete="off"
							required><br />
					</div>
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text" style="width: 160px;">SOURCE</span>
						</div>
						<input type="text" name="source" id="source" style="width: 160px;"
							placeholder="Source" autocomplete="off" required><br />
					</div>
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text" style="width: 160px;">DESTINATION</span>
						</div>
						<input type="text" name="destination" id="destination"
							style="width: 160px;" placeholder="Destination"
							autocomplete="off" required><br />
					</div>
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text" style="width: 160px;">DEPARTURE
								TIME</span>
						</div>
						<input type="time" name="sourcetime" id="sourcetime"
							style="width: 160px;" autocomplete="off" required><br />
					</div>
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text" style="width: 160px;">ARRIVAL
								TIME</span>
						</div>
						<input type="time" name="destinationtime" id="destinationtime"
							style="width: 160px;" autocomplete="off" required><br />
					</div>
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text" style="width: 160px;">CLASS
								TYPE</span>
						</div>
						<select name="classType" id="classType" style="width: 160px;">
							<option value="FirstClass">First Class</option>
							<option value="Sleeper">Sleeper</option>
							<option value="SecondSitting">Second Sitting</option>
						</select>
					</div>
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text" style="width: 160px;">FARE</span>
						</div>
						<input type="number" name="fare" id="fare" style="width: 160px;"
							placeholder="Fare" autocomplete="off" required><br />
					</div>
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<span class="input-group-text" style="width: 160px;">AVAILABILITY</span>
						</div>
						<input type="number" name="availability" id="availability"
							style="width: 160px;" placeholder="Availability"
							autocomplete="off" required><br />
					</div>
					<div class="form-group input-group">
						<div class="input-group-prepend">
							<button type="submit" class="btn btn-primary btn-block"
								style="width: 160px;">Submit</button>
						</div>
						<button class="btn btn-danger" type="reset" style="width: 160px;">Reset</button>
					</div>
				</form>
			</article>
		</div>
	</main>
	<script src="assets/js/AddTrain-component.js"></script>
</body>
</html>
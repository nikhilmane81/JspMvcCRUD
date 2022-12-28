<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Expense Tracker</title>
</head>
<body>
<div >
<h1>Expense Tracker Form</h1>
<div >
<div >
	<form id="form-1" action="expense_add.jsp" method="post">
		<div >
		<label >Item Name</label>
		<div >
		<input type="text" name="itemName" placeholder="Enter item name" >
		</div>
		</div>
		<div >
		<label >Price</label>
		<div >
		<input type="text" name="price" placeholder="Enter price" >
		</div>
		</div>
		<div >
		<label >Quantity</label>
		<div >
		<input type="number" name="quantity" placeholder="Enter quantity" >
		</div>
		</div>
		<div >
		<label >Date</label>
		<div >
		<input type="date" name="dop" placeholder="select date yyyy-mm-dd" >
		</div>
		</div>
		<button type="submit"> Add</button>
		<br></br>
		<a href="expense_list.jsp"><button type=button>View List</button></a>
	</form>
	</div>
	</div>
	</div>
</body>
</html>
<%@page import="com.nikhil.model.Expense"%>
<%@page import="com.nikhil.service.ExpenseServiceImplementation"%>
<%@page import="com.nikhil.service.ExpenseService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%
 	String p1 = request.getParameter("itemId");
 	int id = Integer.parseInt(p1);
 	ExpenseService expenseService = new ExpenseServiceImplementation();
 	Expense expense = expenseService.getById(id);
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Expense Updater</title>
</head>
<body>
<div>
<h1>Expense Updater</h1>
<div >
<div >
	<form action="expense_update.jsp" method="post">
	<input type="hidden" name="itemId" value="<%=expense.getItemId()%>">
	<div>
		<label  id="label-1">Item Name</label>
		<div >
		<input type="text" name="itemName" value="<%=expense.getItemName() %>" >
	</div> </div>
		<div >
		<label >Price</label>
		<div >
		<input type="text" name="price" value="<%=expense.getPrice() %>" >
		</div></div>
		<div >
		<label >Quantity</label>
		<div >
		<input type="number" name="quantity" value="<%=expense.getQuantity() %>" >
		</div></div>
		<div >
		<label >Date</label>
		<div>
		<input type="date" name="dop" value="<%=expense.getDop() %>" >
		</div ></div>
		<button type="submit">Update</button>
	</form>
	</div>
	</div>
	</div>
</body>
</html>
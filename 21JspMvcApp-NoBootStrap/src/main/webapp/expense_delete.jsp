<%@page import="com.nikhil.service.ExpenseServiceImplementation"%>
<%@page import="com.nikhil.service.ExpenseService"%>
<%
	String p1 = request.getParameter("itemId");
	int id = Integer.parseInt(p1);
	ExpenseService expenseService = new ExpenseServiceImplementation();
	expenseService.removeById(id);
	response.sendRedirect("expense_list.jsp");
	
%>
<%@page import="com.nikhil.service.ExpenseServiceImplementation"%>
<%@page import="com.nikhil.service.ExpenseService"%>
<jsp:useBean id="expense" class="com.nikhil.model.Expense"></jsp:useBean>
<jsp:setProperty property="*" name="expense" />

<%
	ExpenseService expenseService = new ExpenseServiceImplementation();
	expenseService.add(expense);
	response.sendRedirect("expense_add_form.jsp");
%>
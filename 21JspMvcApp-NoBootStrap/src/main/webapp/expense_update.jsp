<%@page import="com.nikhil.service.ExpenseServiceImplementation"%>
<%@page import="com.nikhil.service.ExpenseService"%>
<%@page import="com.nikhil.model.Expense"%>
<jsp:useBean id="expense" class="com.nikhil.model.Expense"></jsp:useBean>
<jsp:setProperty property="*" name="expense"/>

<%
	ExpenseService expenseService = new ExpenseServiceImplementation();
	expenseService.modify(expense);
	response.sendRedirect("expense_list.jsp");
%>
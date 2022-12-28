package com.nikhil.service;

import java.util.List;

import com.nikhil.dao.ExpenseDao;
import com.nikhil.dao.ExpenseDaoImplementation;
import com.nikhil.model.Expense;

public class ExpenseServiceImplementation implements ExpenseService{

	
	private ExpenseDao expenseDao;
	
	public ExpenseServiceImplementation() {
		expenseDao = new ExpenseDaoImplementation();
	}

	@Override
	public void add(Expense expense) {
		expenseDao.save(expense);
		
	}

	@Override
	public List<Expense> getAll(int itemID) {
		
		return expenseDao.selectAll(itemID);
	}

	@Override
	public void removeById(int itemId) {
		expenseDao.deleteById(itemId);
	}

	@Override
	public Expense getById(int itemId) {
		return expenseDao.selectById(itemId);
		
	}

	@Override
	public void modify(Expense expense) {
		expenseDao.update(expense);
	}

}

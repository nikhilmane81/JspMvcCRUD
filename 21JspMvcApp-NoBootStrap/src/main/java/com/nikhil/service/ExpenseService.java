package com.nikhil.service;

import java.util.List;

import com.nikhil.model.Expense;

public interface ExpenseService {
	void add(Expense expense);
	List<Expense> getAll(int itemID);
	void removeById(int itemId);
	Expense getById(int itemId);
	void modify(Expense expense);
}

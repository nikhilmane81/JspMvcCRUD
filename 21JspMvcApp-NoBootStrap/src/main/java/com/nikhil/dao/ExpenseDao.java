package com.nikhil.dao;

import java.util.List;

import com.nikhil.model.Expense;

public interface ExpenseDao {
	void save(Expense expense);
	List<Expense> selectAll(int itemId);
	void deleteById(int itemId);
	Expense selectById(int itemId);
	void update(Expense expense);
}

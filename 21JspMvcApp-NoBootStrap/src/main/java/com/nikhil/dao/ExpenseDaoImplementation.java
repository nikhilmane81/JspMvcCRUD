package com.nikhil.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nikhil.conn.MyConn;
import com.nikhil.model.Expense;

public class ExpenseDaoImplementation implements ExpenseDao
{
	private MyConn myConn;
	

	public ExpenseDaoImplementation() {
		myConn = new MyConn();
	}

	@Override
	public void save(Expense expense) {
		try {
			Connection con = myConn.getConn();
			PreparedStatement ps = con.prepareStatement("insert into expense (itemName, price, quantity, dop) values (?,?,?,?)");
			ps.setString(1, expense.getItemName());
			ps.setFloat(2, expense.getPrice());
			ps.setInt(3, expense.getQuantity());
			ps.setString(4, expense.getDop());
			int i = ps.executeUpdate();
			con.close();
			ps.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public List<Expense> selectAll(int itemId) {
		List<Expense> lst = new ArrayList<>();
		try {
			Connection con = myConn.getConn();
			PreparedStatement ps = con.prepareStatement("select * from expense");
			//ps.setInt(1, itemId);
			ResultSet rs  = ps.executeQuery();
			while(rs.next())
			{
				Expense expense = new Expense();
				expense.setItemId(rs.getInt(1));
				expense.setItemName(rs.getString(2));
				expense.setPrice(rs.getFloat(3));
				expense.setQuantity(rs.getInt(4));
				expense.setDop(rs.getString(5));
				lst.add(expense);
			}
			ps.close();
			con.close();
	
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;
	}

	@Override
	public void deleteById(int itemId) {
		try {
			Connection con = myConn.getConn();
			PreparedStatement ps = con.prepareStatement("delete from expense where itemId = ?");
			ps.setInt(1, itemId);
			int i = ps.executeUpdate();
			con.close();
			ps.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public Expense selectById(int itemId) {
		Expense expense = new Expense();
		try {
			Connection con = myConn.getConn();
			PreparedStatement ps = con.prepareStatement("select * from expense where itemID = ?");
			ps.setInt(1, itemId);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				expense.setItemId(rs.getInt(1));
				expense.setItemName(rs.getString(2));
				expense.setPrice(rs.getFloat(3));
				expense.setQuantity(rs.getInt(4));
				expense.setDop(rs.getString(5));
			}
			ps.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return expense;
	}

	@Override
	public void update(Expense expense) {
		Connection con;
		try {
			con = myConn.getConn();
			PreparedStatement ps = con.prepareStatement("Update expense set itemName=? , price=?, quantity=?, dop=? where itemId=?");
			
			ps.setString(1, expense.getItemName());
			ps.setFloat(2, expense.getPrice());
			ps.setInt(3, expense.getQuantity());
			ps.setString(4, expense.getDop());
			ps.setInt(5, expense.getItemId());
			
			int i = ps.executeUpdate();
			ps.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	

}

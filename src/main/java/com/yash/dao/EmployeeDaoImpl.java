package com.yash.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.yash.*;
import com.yash.connectionmaster.ConnectionMaster;
import com.yash.dao.*;
import com.yash.form.*;


public class EmployeeDaoImpl implements EmployeeDao{

	//All other code inside the DisplayAllEmployee method
	
	@Override
	public List<Employee> getAllEmployee() throws SQLException {
		List<Employee> employees=new ArrayList<Employee>();
		Connection conn=ConnectionMaster.getConnection();
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select * from employee");
		
		while(rs.next()) {
			employees.add(new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getInt(6), rs.getString(7)));
		}
		conn.close();
		return employees;
	}

	@Override
	public Employee getEmployeeById(int id) throws SQLException {
		Employee employee=null;
		Connection conn=ConnectionMaster.getConnection();
		PreparedStatement pst=conn.prepareStatement("select * from employee where eid=?");
		pst.setInt(1, id);
		ResultSet rs=pst.executeQuery();
		rs.next();
		employee=new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getInt(6),rs.getString(7));
		conn.close();
		return employee;
	}

	@Override
	public void addEmployee(Employee employee) throws SQLException{
		String sql="insert into employee(eid,ename,deptid,salary,designation,mgrid) values(?,?,?,?,?,?)";
		Connection conn=ConnectionMaster.getConnection();
		PreparedStatement pst=conn.prepareStatement(sql);
		pst.setInt(1,employee.getEid());
		pst.setString(2,employee.getEname());
		pst.setInt(3,employee.getDeptid());
		pst.setInt(4,employee.getSalary());
		pst.setString(5,employee.getDesignation());
		pst.setInt(6,employee.getMgrid());
		pst.executeUpdate();
		conn.close();
		
		//employee1.add(new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getInt(6)));
	}

	@Override
	public void deleteEmployeeById(int id) throws SQLException {
		
		String sql="delete from employee where eid=?";
		Connection conn=ConnectionMaster.getConnection();
		PreparedStatement pst=conn.prepareStatement(sql);
		pst.setInt(1, id);
		 pst.executeUpdate();
		conn.close();
	}

	@Override
	public void updateEmployee(Employee employee) throws SQLException {
		/*
		 * String
		 * sql="update employee set eid=?,ename=?,deptid=?,salary=?,designation=?,mgrid=? where eid=?"
		 * ; Connection conn=ConnectionMaster.getConnection(); PreparedStatement
		 * pst=conn.prepareStatement(sql); pst.setInt(1,employee.getEid());
		 * pst.setString(2,employee.getEname()); pst.setInt(3,employee.getDeptid());
		 * pst.setInt(4,employee.getSalary());
		 * pst.setString(5,employee.getDesignation());
		 * pst.setInt(6,employee.getMgrid()); pst.executeUpdate(); conn.close();
		 */
	  Connection   conn=ConnectionMaster.getConnection();
	        PreparedStatement prep=conn.prepareStatement("update employee set ename=?,deptid=?,salary=?,designation=?,mgrid=? where eid=?");
	        prep.setString(1,employee.getEname());
	        prep.setInt(2,employee.getDeptid());
	        prep.setInt(3,employee.getSalary());
	        prep.setString(4,employee.getDesignation());
	        prep.setInt(5,employee.getMgrid());
	        prep.setInt(6,employee.getEid());
	        
	        prep.executeUpdate();
	        conn.close();
	       
	}

	@Override
	public boolean doesEmployeeExits(int id) throws SQLException {
		String sql="select * from employee where eid=?";
		Connection conn=ConnectionMaster.getConnection();
		PreparedStatement pst=conn.prepareStatement(sql);
		pst.setInt(1,id);
		ResultSet rs=pst.executeQuery();
		return rs.next()?true:false;
	}

	@Override
	public boolean isEmployeeLoginValid(String username, String password) throws SQLException {
		String sql="select * from employee where ename=? and password=?";
		PreparedStatement pst=ConnectionMaster.getConnection().prepareStatement(sql);
		pst.setString(1, username);
		pst.setString(2, password);
		ResultSet rs=pst.executeQuery();
		return rs.next()?true:false;
		
	}

	@Override
	public boolean doesEmployeeNameExits(String name) throws SQLException {
	
		String sql="select * from employee where ename=?";
		Connection conn=ConnectionMaster.getConnection();
		PreparedStatement pst=conn.prepareStatement(sql);
		pst.setString(1,name);
		ResultSet rs=pst.executeQuery();
		return rs.next()?true:false;
	}

	
	
}

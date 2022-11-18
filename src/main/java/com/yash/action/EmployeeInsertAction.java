package com.yash.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.yash.dao.EmployeeDaoImpl;
import com.yash.form.Employee;

public class EmployeeInsertAction extends Action {
	@Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        Employee emp = (Employee) form;
        // System.out.println(10/0);
        System.out.println(emp); 
       Employee e1 = new Employee();
        e1.setEid(emp.getEid());
        e1.setEname(emp.getEname());
        e1.setDeptid(emp.getDeptid());
        e1.setSalary(emp.getSalary());
        e1.setDesignation(emp.getDesignation());
        e1.setMgrid(emp.getMgrid());
        new EmployeeDaoImpl().addEmployee(e1);
        request.setAttribute("employees", new EmployeeDaoImpl().getAllEmployee());
        return mapping.findForward("success");
        
    }
    


}

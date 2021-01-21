package com.dason.bytecode_enhancement.visitor_pattern.demo1;

import java.util.ArrayList;
import java.util.List;

public class Client {
 
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
		Employee mep1,mep2,gep1,gep2,gep3;
		// 管理者1
		mep1 = new ManagerEmployee("王总", 8, 20000, 10);
		// 管理者2
		mep2 = new ManagerEmployee("谢经理", 8, 15000, 15);
		// 普通员工1
		gep1 = new GeneralEmployee("小杰", 8, 8000, 8);
		// 普通员工2
		gep2 = new GeneralEmployee("小晓", 8, 8500, 12);
		// 普通员工3
		gep3 = new GeneralEmployee("小虎", 8, 7500, 0);
		
		employeeList.add(mep1);
		employeeList.add(mep2);
		employeeList.add(gep1);
		employeeList.add(gep2);
		employeeList.add(gep3);
		
		// 财务部 对公司员工的工资核算/访问
		FADepartment department = new FADepartment();
		for(Employee employee : employeeList){
			employee.accept(department);
		}

		// 人力资源部 HR 对公司员工的工资核算/访问
		HRDepartment hrDepartment = new HRDepartment();
		for(Employee employee : employeeList){
			employee.accept(hrDepartment);
		}

	}
	
}
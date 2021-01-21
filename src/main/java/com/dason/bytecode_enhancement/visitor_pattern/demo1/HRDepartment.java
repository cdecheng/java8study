package com.dason.bytecode_enhancement.visitor_pattern.demo1;

import java.util.logging.Logger;

/**
 * 具体访问者对象：公司人力资源部<br/>
 * 人力资源部的职责就是负责统计核算员工的每月上班时长
 * @author  lvzb.software@qq.com
 *
 */
public class HRDepartment extends Department {

	Logger logger = Logger.getLogger(HRDepartment.class.getName());
 
	/**
	 * 访问公司管理者对象的每月实际上班时长统计
	 */
	@Override
	public void visit(ManagerEmployee me) {
		int totalTimeSheet = me.getTotalTimeSheet();
		logger.info(me.getName() + "上班时长是：" + totalTimeSheet);
	}
 
	/**
	 * 访问公司普通员工对象的每月实际上班时长统计
	 */
	@Override
	public void visit(GeneralEmployee ge) {
		int totalTimeSheet = ge.getTotalTimeSheet();
		logger.info(ge.getName() + "上班时长是：" + totalTimeSheet);
	}
 
}
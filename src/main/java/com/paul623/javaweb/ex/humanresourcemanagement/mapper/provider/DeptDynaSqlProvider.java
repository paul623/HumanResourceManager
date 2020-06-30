package com.paul623.javaweb.ex.humanresourcemanagement.mapper.provider;


import com.paul623.javaweb.ex.humanresourcemanagement.entity.Dept;
import org.apache.ibatis.jdbc.SQL;

import static com.paul623.javaweb.ex.humanresourcemanagement.utils.Constants.DEPTTABLE;


public class DeptDynaSqlProvider {
	
	// 动态插入
		public String insertDept(Dept dept){
			
			return new SQL(){
				{
					INSERT_INTO(DEPTTABLE);
					if(dept.getName() != null && !dept.getName().equals("")){
						VALUES("name", "#{name}");
					}
					if(dept.getRemark() != null && !dept.getRemark().equals("")){
						VALUES("remark", "#{remark}");
					}
				}
			}.toString();
		}	
		// 动态更新
		public String updateDept(Dept dept){
			return new SQL(){
				{
					UPDATE(DEPTTABLE);
					if(dept.getName() != null){
						SET(" name = #{name} ");
					}
					if(dept.getRemark() != null){
						SET(" remark = #{remark} ");
					}
					WHERE(" id = #{id} ");
				}
			}.toString();
		}
}

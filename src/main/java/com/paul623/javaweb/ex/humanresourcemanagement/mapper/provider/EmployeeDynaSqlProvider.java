package com.paul623.javaweb.ex.humanresourcemanagement.mapper.provider;


import com.paul623.javaweb.ex.humanresourcemanagement.entity.Employee;
import org.apache.ibatis.jdbc.SQL;

import static com.paul623.javaweb.ex.humanresourcemanagement.utils.Constants.EMPLOYEETABLE;


public class EmployeeDynaSqlProvider {
			// 动态插入
			public String insert_Employee(Employee job){
				
				return new SQL(){
					{
						INSERT_INTO(EMPLOYEETABLE);
						if(job.getName() != null ){
							VALUES("name", "#{name}");
						}
						if(job.getCardId()!=null){
							VALUES("cardId","#{cardId}");
						}
						if(job.getAddress()!=null){
							VALUES("address","#{address}");
						}
						if(job.getPostCode()!=null){
							VALUES("postCode","#{postCode}");
						}
						if(job.getTel()!=null){
							VALUES("tel","#{tel}");
						}
						if(job.getPhone()!=null){
							VALUES("phone","#{phone}");
						}
						if(job.getQqNum()!=null){
							VALUES("qqNum","#{qqNum}");
						}
						if(job.getEmail()!=null){
							VALUES("email","#{email}");
						}
						if(job.getSex()!=null){
							VALUES("sex","#{sex}");
						}
						if(job.getParty()!=null){
							VALUES("party","#{party}");
						}
						if(job.getBirthday()!=null){
							VALUES("birthday","#{birthday}");
						}
						if(job.getRace()!=null){
							VALUES("race","#{race}");
						}
						if(job.getEducation()!=null){
							VALUES("education","#{education}");
						}
						if(job.getSpeciality()!=null){
							VALUES("speciality","#{speciality}");
						}
						if(job.getHobby()!=null){
							VALUES("hobby","#{hobby}");
						}
						if(job.getRemark()!=null){
							VALUES("remark","#{remark}");
						}
						if(job.getCreateDate()!=null){
							VALUES("createDate","#{createDate}");
						}
						if(job.getDeptId()!=null){
							VALUES("deptId","#{deptId}");
						}
						if(job.getJobId()!=null){
							VALUES("jobId","#{jobId}");
						}
						if(job.getPassword()!=null){
							VALUES("password","#{password}");
						}
					}
				}.toString();
			}	
			// 动态更新
			public String update_Employee(Employee job){
				
				return new SQL(){
					{
						UPDATE(EMPLOYEETABLE);
						if(job.getName() != null ){
							SET("name = #{name}");
						}
						if(job.getPassword()!=null){
							SET("password =#{password}");
						}
						if(job.getCardId()!=null){
							SET("cardId = #{cardId}");
						}
						if(job.getAddress()!=null){
							SET("address = #{address}");
						}
						if(job.getPostCode()!=null){
							SET("postCode = #{postCode}");
						}
						if(job.getTel()!=null){
							SET("tel = #{tel}");
						}
						if(job.getPhone()!=null){
							SET("phone = #{phone}");
						}
						if(job.getQqNum()!=null){
							SET("qqNum = #{qqNum}");
						}
						if(job.getEmail()!=null){
							SET("email = #{email}");
						}
						if(job.getSex()!=null){
							SET("sex = #{sex}");
						}
						if(job.getParty()!=null){
							SET("party = #{party}");
						}
						if(job.getBirthday()!=null){
							SET("birthday = #{birthday}");
						}
						if(job.getRace()!=null){
							SET("race = #{race}");
						}
						if(job.getEducation()!=null){
							SET("education = #{education}");
						}
						if(job.getSpeciality()!=null){
							SET("speciality = #{speciality}");
						}
						if(job.getHobby()!=null){
							SET("hobby = #{hobby}");
						}
						if(job.getRemark()!=null){
							SET("remark = #{remark}");
						}
						if(job.getCreateDate()!=null){
							SET("createDate = #{createDate}");
						}
						if(job.getDeptId()!=null){
							SET("deptId = #{deptId}");
						}
						if(job.getJobId()!=null){
							SET("jobId = #{jobId}");
						}
						WHERE(" id = #{id} ");
					}
				}.toString();
			}
}

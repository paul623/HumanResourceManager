package com.paul623.javaweb.ex.humanresourcemanagement.mapper.provider;


import com.paul623.javaweb.ex.humanresourcemanagement.entity.User;
import org.apache.ibatis.jdbc.SQL;

import static com.paul623.javaweb.ex.humanresourcemanagement.utils.Constants.USERTABLE;


public class UserDynaSqlProvider {
			// 动态插入
			public String insert_Notice(User job){
				
				return new SQL(){
					{
						INSERT_INTO(USERTABLE);
						if(job.getLoginname() != null ){
							VALUES("loginname", "#{loginname}");
						}
						if(job.getPassword()!=null){
							VALUES("password","#{password}");
						}
						if(job.getUsername()!=null){
							VALUES("username","#{username}");
						}
						if(job.getCreatedate()!=null){
							VALUES("createdate","#{createdate}");
						}
					
						
					}
				}.toString();
			}	
			// 动态更新
			public String update_Notice(User job){
				
				return new SQL(){
					{
						UPDATE(USERTABLE);
						if(job.getLoginname() != null ){
							SET("loginname = #{loginname}");
						}
						if(job.getPassword()!=null){
							SET("password = #{password}");
						}
						if(job.getUsername()!=null){
							SET("username = #{username}");
						}
				
						
						
						WHERE(" id = #{id} ");
					}
				}.toString();
			}
}

package com.paul623.javaweb.ex.humanresourcemanagement.mapper.provider;


import com.paul623.javaweb.ex.humanresourcemanagement.entity.Notice;
import org.apache.ibatis.jdbc.SQL;

import static com.paul623.javaweb.ex.humanresourcemanagement.utils.Constants.NOTICETABLE;


public class NoticeDynaSqlProvider {
			// 动态插入
			public String insert_Notice(Notice job){
				
				return new SQL(){
					{
						INSERT_INTO(NOTICETABLE);
						if(job.getTitle() != null ){
							VALUES("title", "#{title}");
						}
						if(job.getUserId()!=null){
							VALUES("userId","#{userId}");
						}
						if(job.getContent()!=null){
							VALUES("content","#{content}");
						}
						if(job.getCreateDate()!=null){
							VALUES("createDate","#{createDate}");
						}
					
						
					}
				}.toString();
			}	
			// 动态更新
			public String update_Notice(Notice job){
				
				return new SQL(){
					{
						UPDATE(NOTICETABLE);
						if(job.getTitle() != null ){
							SET("title = #{title}");
						}
						if(job.getUserId()!=null){
							SET("userId = #{userId}");
						}
						if(job.getContent()!=null){
							SET("content = #{content}");
						}
						if(job.getCreateDate()!=null){
							SET("createDate = #{createDate}");
						}
						WHERE(" id = #{id} ");
					}
				}.toString();
			}
}

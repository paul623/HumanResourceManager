package com.paul623.javaweb.ex.humanresourcemanagement.mapper.provider;


import com.paul623.javaweb.ex.humanresourcemanagement.entity.Document;
import org.apache.ibatis.jdbc.SQL;

import static com.paul623.javaweb.ex.humanresourcemanagement.utils.Constants.DOCUMENTTABLE;


public class DocumentDynaSqlProvider {
	
	// 动态插入
		public String insert(Document dept){
			
			return new SQL(){
				{
					INSERT_INTO(DOCUMENTTABLE);
					if(dept.getTitle() != null ){
						VALUES("title", "#{title}");
					}
					if(dept.getRemark() != null ){
						VALUES("remark", "#{remark}");
					}
					if(dept.getCreateDate() != null ){
						VALUES("createDate", "#{createDate}");
					}
					if(dept.getUserId() != null ){
						VALUES("userId", "#{userId}");
					}
					if(dept.getFilename() != null ){
						VALUES("filename", "#{filename}");
					}
					if(dept.getFileAdd()!=null){
						VALUES("fileAdd", "#{fileAdd}");
					}
				}
			}.toString();
		}	
		// 动态更新
		public String update(Document dept){
			
			return new SQL(){
				{
					UPDATE(DOCUMENTTABLE);
					if(dept.getTitle() != null){
						SET(" title = #{title} ");
					}
				
					if(dept.getRemark() != null){
						SET(" remark = #{remark} ");
					}
					WHERE(" id = #{id} ");
				}
			}.toString();
		}
}

package com.paul623.javaweb.ex.humanresourcemanagement.entity;

import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

public class Document  implements Serializable {
	private Integer id;
	private String title;
	private String filename;
	private String remark;
	private String createDate;
	private Integer userId;
	private MultipartFile file;
	private User user;
	private String fileAdd;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
		if(user!=null){
			this.userId=user.getId();
		}
	}

	public String getFileAdd() {
		return fileAdd;
	}

	public void setFileAdd(String fileAdd) {
		this.fileAdd = fileAdd;
	}

	@Override
	public String toString() {
		return "Document{" +
				"id=" + id +
				", title='" + title + '\'' +
				", filename='" + filename + '\'' +
				", remark='" + remark + '\'' +
				", createDate='" + createDate + '\'' +
				", userId=" + userId +
				", file=" + file +
				", user=" + user +
				", fileAdd='" + fileAdd + '\'' +
				'}';
	}
}

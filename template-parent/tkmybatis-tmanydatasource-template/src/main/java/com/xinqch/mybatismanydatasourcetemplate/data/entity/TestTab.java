package com.xinqch.mybatismanydatasourcetemplate.data.entity;

/**
 * <p>
 * 测试表
 * </p>
 *
 * @author xinqch
 * @since 2017-12-22
 */
public class TestTab {

    private static final long serialVersionUID = 1L;

	private String id;
	private String message;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "TestTab{" +
			", id=" + id +
			", message=" + message +
			"}";
	}
}

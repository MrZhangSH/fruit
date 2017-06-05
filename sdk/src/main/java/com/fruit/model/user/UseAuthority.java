package com.fruit.model.user;

import java.io.Serializable;

public class UseAuthority implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4499052132331505591L;

	private Integer _id;

	private String roleName;

	public Integer get_id() {
		return _id;
	}

	public void set_id(Integer _id) {
		this._id = _id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

}

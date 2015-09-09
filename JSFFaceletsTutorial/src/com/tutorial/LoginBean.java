/** 
 * LoginBean.java 
 * 
 */

package com.tutorial;

public class LoginBean {
	private String name;
	private String birthday;
	private String password;

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}
	
	public void setBirthday(final String birthday) {
		this.birthday = birthday;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}
}
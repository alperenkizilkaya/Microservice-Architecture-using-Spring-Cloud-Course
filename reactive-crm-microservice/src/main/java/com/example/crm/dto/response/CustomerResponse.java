package com.example.crm.dto.response;

public class CustomerResponse {
	private String identity;
	private String fullname;
	private String email;
	private String phone;
	private int birthYear;

	public CustomerResponse() {
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	@Override
	public String toString() {
		return "CustomerResponse [identity=" + identity + ", fullname=" + fullname + ", email=" + email + ", phone="
				+ phone + ", birthYear=" + birthYear + "]";
	}

}

package com.jbk.entity;

public class BloodInfo {

	public BloodInfo() {

	}

	private int id;
	private String username;
	private String Blood_Group;
	private String Weight;
	private String Contact_Number;
	private String Location;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getBlood_Group() {
		return Blood_Group;
	}

	public void setBlood_Group(String blood_Group) {
		Blood_Group = blood_Group;
	}

	public String getWeight() {
		return Weight;
	}

	public void setWeight(String weight) {
		Weight = weight;
	}

	public String getContact_Number() {
		return Contact_Number;
	}

	public void setContact_Number(String contact_Number) {
		Contact_Number = contact_Number;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	String password;

	@Override
	public String toString() {
		return "BloodInfo [id=" + id + ", username=" + username + ", Blood_Group=" + Blood_Group + ", Weight=" + Weight
				+ ", Contact_Number=" + Contact_Number + ", Location=" + Location + ", password=" + password + "]";
	}

	public BloodInfo(int id, String username, String blood_Group, String weight, String contact_Number, String location,
			String password) {
		super();
		this.id = id;
		this.username = username;
		Blood_Group =blood_Group;
		Weight = weight;
		Contact_Number = contact_Number;
		Location = location;
		this.password = password;
	}

}

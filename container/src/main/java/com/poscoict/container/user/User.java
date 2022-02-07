package com.poscoict.container.user;

import java.util.List;

public class User {
	private Long no=0L;
	private String name="김소원";
	private Friend friend=null;
	private List<String> frineds;
	
	public User() {
	//기본 생성자	
	}
	
	public void setFrineds(List<String> frineds) {
		this.frineds = frineds;
	}

	public User(String name) {
		this.name=name;
	}
	
	public User(Long no, String name) {
		this.no=no;
		this.name=name;
	}
	
//	public User(Long no, String name, Friend frined) {
//		this.no=no;
//		this.name=name;
//		this.friend=friend;
//	}
	
	public void setNo(Long no) {
		this.no = no;
	}
	public void setFriend(Friend friend) {
		this.friend = friend;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [no=" + no + ", name=" + name + ", friend=" + friend + ", frineds=" + frineds + "]";
	}

	

}

package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Principle {

	
	private String name;
	private int age;
	private long mobno;
	@Id
	private String email;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getMobno() {
		return mobno;
	}
	public void setMobno(long mobno) {
		this.mobno = mobno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Principle [name=" + name + ", age=" + age + ", mobno=" + mobno + ", email=" + email + ", password="
				+ password + "]";
	}
	
}

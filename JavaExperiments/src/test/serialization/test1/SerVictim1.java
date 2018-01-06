package test.serialization.test1;

import java.io.Serializable;
import java.util.Date;

public class SerVictim1 implements Serializable{
	
	
	/**
	 * 
	 */
	//private static final long serialVersionUID = -9174866087201750609L;
	private int id=1;
	private String remarks="none";
	private String name="Renjith";
	
	
	private Date age = new Date();
	
	
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Date getAge() {
		return age;
	}
	public void setAge(Date age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "SerVictim1 [id=" + id + ", name=" + name + ", age=" + age
				+ ", remarks=" + remarks + "]";
	}
	
	
	
}

package test.clone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Victim implements Cloneable{
	private String name = "Renjith";
	private String[] educationList = {"EDU_1", "EDU_2", "EDU_3", "EDU_4"};
	private Misc[] miscList = {new Misc("1"), new Misc("2")};
	private List<Misc> miscList2 = new ArrayList<Misc>(Arrays.asList(miscList));
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getEducationList() {
		return educationList;
	}
	public void setEducationList(String[] educationList) {
		this.educationList = educationList;
	}
	
	protected Victim clone() throws CloneNotSupportedException{
		return (Victim)super.clone();
	}
	public Misc[] getMiscList() {
		return miscList;
	}
	public void setMiscList(Misc[] miscList) {
		this.miscList = miscList;
	}
	
	
	public List<Misc> getMiscList2() {
		return miscList2;
	}
	public void setMiscList2(List<Misc> miscList2) {
		this.miscList2 = miscList2;
	}
	@Override
	public String toString() {
		return "Victim [name=" + name + ", educationList="
				+ Arrays.toString(educationList) + ", miscList="
				+ Arrays.toString(miscList) + ", miscList2=" + miscList2 + "]";
	}


	
}

package test.clone;

import java.util.Arrays;

public class Misc implements Cloneable{
	private String value;

	public Misc(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Misc [value=" + value + "]";
	}
	
	
	protected Misc clone() throws CloneNotSupportedException{
		return (Misc)super.clone();
	}
	
}

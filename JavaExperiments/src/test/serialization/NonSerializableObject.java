package test.serialization;

public class NonSerializableObject {
	
	public NonSerializableObject(int state){
		this.nonSerializableState = state;
	}
	
	public NonSerializableObject(){
		
	}
	
	private int nonSerializableState;

	public int getNonSerializableState() {
		return nonSerializableState;
	}

	public void setNonSerializableState(int nonSerializableState) {
		this.nonSerializableState = nonSerializableState;
	}
	
	
}

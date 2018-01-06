package test.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableObject extends NonSerializableObject implements Serializable{
	private int serializableState;

	
	public SerializableObject(int state){
		super(state*2);
		this.serializableState = state;
	}
	
	public int getSerializableState() {
		return serializableState;
	}

	public void setSerializableState(int serializableState) {
		this.serializableState = serializableState;
	}
	
	
	private void writeObject(ObjectOutputStream os) throws IOException{
		os.defaultWriteObject();
		os.writeInt(getNonSerializableState());
	}
	
	
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException{
		ois.defaultReadObject();
		int state = ois.readInt();
		setNonSerializableState(state);
	}
	
}

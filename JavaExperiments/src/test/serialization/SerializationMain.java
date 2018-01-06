package test.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileOutputStream objectFileOs;
		objectFileOs = new FileOutputStream(
				"/home/renju/opt/temp/Serializableobj.txt");
		ObjectOutputStream os = new ObjectOutputStream(objectFileOs);
		SerializableObject so = new SerializableObject(1234);
		os.writeObject(so);
		
		System.out.println("State:"+so.getSerializableState());
		System.out.println("NS State:"+so.getNonSerializableState());
		
		System.out.println("De-serialising.....................");
		
		FileInputStream fis = new FileInputStream("/home/renju/opt/temp/Serializableobj.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		SerializableObject sObj = (SerializableObject)ois.readObject();
		
		System.out.println("State:"+sObj.getSerializableState());
		System.out.println("NS State:"+sObj.getNonSerializableState());
		

	}

}

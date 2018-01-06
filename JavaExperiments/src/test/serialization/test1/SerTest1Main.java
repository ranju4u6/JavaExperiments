package test.serialization.test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerTest1Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		SerVictim1 victim1 = new SerVictim1();
		
		
		/*FileOutputStream fos = new FileOutputStream(new File("SerVictim1.ser"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(victim1);*/
		
		FileInputStream fis = new FileInputStream(new File("SerVictim1.ser"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		SerVictim1 victim1FromFile = (SerVictim1)ois.readObject();
		
		System.out.println(victim1FromFile);
	}

}

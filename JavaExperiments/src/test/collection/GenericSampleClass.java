package test.collection;

import java.util.ArrayList;
import java.util.List;

public class GenericSampleClass<T> {
	
	List<T> genericList;
	
	public GenericSampleClass(List<T> genericList){
		this.genericList = genericList;
	}
	
	public T getData(int index){
		return genericList.get(index);
	}
	
	public void setData(T data){
		genericList.add(data);
	}
	
	public static void main(String[] args){
		List<Cat> catList = new ArrayList<Cat>();
		GenericSampleClass<Cat> catData = new GenericSampleClass<>(catList);
		
		catData.setData(new Cat("C1"));
		catData.setData(new Cat("C3"));
		catData.setData(new Cat("C2"));
		catData.setData(new Cat("C4"));
		
		for(Cat c: catList){
			System.out.println(c);
		}
		
		//catData.setData(new Dog("D1"));
	}
}

package test.clone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Victim victim = new Victim();
		
		System.out.println(victim);
		
		Victim secondVictim = victim.clone();
		
		for(Misc miscData: secondVictim.getMiscList2()){
			
			if(secondVictim.getMiscList2().indexOf(miscData) == 0)
				miscData.setValue("3");
			else
				miscData.setValue("4");
		}
		
		/*String[] educationList = {"EDU_1_mod", "EDU_2_mod", "EDU_3_mod", "EDU_4_mod"};
		Misc[] miscList = {new Misc("3"), new Misc("4")};
		List<Misc> miscList2 = new ArrayList<Misc>(Arrays.asList(miscList));
		
		secondVictim.setEducationList(educationList);
		secondVictim.setMiscList(miscList);
		secondVictim.setMiscList2(miscList2);*/
	
		System.out.println(secondVictim);
		
		System.out.println(victim);
	}

}

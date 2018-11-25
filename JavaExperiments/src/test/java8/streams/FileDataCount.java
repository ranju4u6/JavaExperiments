package test.java8.streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class FileDataCount {

	public static void main(String[] args) {
	
		//represents the line  stream
		try(Stream<String> fileLineStream = Files.lines(Paths.get("src/test/java8/streams/DataFile.txt"))){
			
			//represents the line data (String[]) stream
			Stream<String[]> lineDataStream = fileLineStream.map(line -> line.split(" "));
			
			//Following can give us arrays
			//lineDataStream.forEach(System.out::println);
			
			//lets stream the array too
			Stream<Stream<String>> lineDataAryStream = lineDataStream.map(stringAry -> Arrays.stream(stringAry));
			
			
			lineDataAryStream.forEach(dataStream -> {
				//following would print the data
				//dataStream.forEach(System.out::println);
				
				//But filtering it is getting more complicated as the options are not showing up here
				//dataStream.filter(x -> x)
				//StreamdataStream.filter(predicate)
			});
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		//######################### REAL CODE #######################
		
		//Lets use the flatMap approach. This is convert two diamentional array in single diamention for easy reading
		try {
			
			long count = Files.lines(Paths.get("src/test/java8/streams/DataFile.txt"))
					.map(line -> line.split(" "))
					.flatMap(stringAry -> Arrays.stream(stringAry))
					.filter(data -> data.equals("Renjith"))
					.count();
					
			System.out.println("Total \"Renjiths\" : "+count);	
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}

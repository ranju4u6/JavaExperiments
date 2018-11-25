package test.java8.streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FIleDataCollector {

	public static void main(String[] args) {

		System.out.println("############# Using Files.lines #############");
		try (Stream<String> fileLineStream = Files.lines(Paths.get("src/test/java8/streams/integervalues.txt"))) {

			System.out.println("---- using Collectors.toList() : String collection");
			List<String> lineList = fileLineStream.collect(Collectors.toList());
			System.out.println(lineList);

		} catch (Exception e) {
			e.printStackTrace();
		}

		try (Stream<String> fileLineStream = Files.lines(Paths.get("src/test/java8/streams/integervalues.txt"))) {

			System.out.println("---- using Collectors.toCollection() : String predefined collection");
			List<String> lineList = fileLineStream.collect(Collectors.toCollection(() -> new ArrayList<String>()));
			System.out.println(lineList);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try (Stream<String> fileLineStream = Files.lines(Paths.get("src/test/java8/streams/integervalues.txt"))) {

			System.out.println("---- using Collectors.toCollection() : String predefined collection + calling constructor using method ref");
			List<String> lineList = fileLineStream.collect(Collectors.toCollection(ArrayList::new));
			System.out.println(lineList);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try (Stream<String> fileLineStream = Files.lines(Paths.get("src/test/java8/streams/integervalues.txt"))) {

			System.out.println("---- using Collectors.toCollection() : ");
			
			List<FileData> fileDataList = fileLineStream.map(line -> {
				FileData fd = new FileData();
				fd.setLine(line);
				return fd;
			}).collect(Collectors.toCollection(ArrayList<FileData>::new));
			
			
			System.out.println(fileDataList);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

package test.enums;

public class Main {

	public static void main(String[] args) {

		SeasonTiming.WINTER.timing();
		SeasonTiming.SUMMER.timing();
		
		DefaultSeasonTiming.WINTER.timing();
		DefaultSeasonTiming.SUMMER.timing();
		DefaultSeasonTiming.SPRING.timing();
	}

}

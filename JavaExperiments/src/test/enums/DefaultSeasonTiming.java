package test.enums;

public enum DefaultSeasonTiming {
	
	WINTER{
		public void timing() {
			System.out.println("Winter Timing");
		}
	}, SUMMER{
		public void timing() {
			System.out.println("Summer Timing");
		}
	}, SPRING;
	
	public void timing() {
		System.out.println("Default Timing");
	}

}

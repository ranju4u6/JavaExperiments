package test.enums;

public enum SeasonTiming {
	WINTER {
		@Override
		public void timing() {
			
			System.out.println("Winter timing");
		}
	},SUMMER {
		@Override
		public void timing() {

			System.out.println("Summer timing");
		}
	};
	
	public abstract void timing();

}

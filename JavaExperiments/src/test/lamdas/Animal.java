package test.lamdas;

public class Animal {
	
	private String name;
	private boolean canWalk;
	private boolean canSwim;
	
	public Animal(String name, boolean canWalk, boolean canSwim) {
		this.canWalk = canWalk;
		this.canSwim = canSwim;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean isCanWalk() {
		return canWalk;
	}

	public boolean isCanSwim() {
		return canSwim;
	}
	
	@Override
	public String toString() {
		return name;
	}

}

package sec3;

public class Birds extends Animal {
	int wings;
	private boolean fly;
	
	public int getWings() {
		return wings;
	}

	public boolean isFly() {
		return fly;
	}

	public void setFly(boolean fly) {
		this.fly = fly;
	}

	public void setWings(int wings) {
		this.wings = wings;
	}

	@Override
	public String toString() {
		return "Birds [wings=" + wings + ", fly=" + fly + "]";
	}

	
	
}

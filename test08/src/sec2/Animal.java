package sec2;

public class Animal { 
	 String name; 
	private boolean spine;
	
	
	
	public String print() {
		return "Animal [name=" + name + ", spine=" + spine + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isSpine() {
		return spine;
	}
	public void setSpine(boolean spine) {
		this.spine = spine;
	
		
	}
}

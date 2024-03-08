package P123;

public class Q6 {

		private String name;
		private int age;
		private boolean married;
		private short gender;
		private short child;
		
		
		public Q6() {}
		
		
		public Q6(String name, int age, boolean married, short gender, short child) { //순서 맞게끔 해야됨
			super();
			this.name = name;
			this.age = age;
			this.married = married;
			this.gender = gender;
			this.child = child;
		}


		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public boolean isMarried() {
			return married;
		}
		public void setMarried(boolean married) {
			this.married = married;
		}
		public short getGender() {
			return gender;
		}
		public void setGender(short gender) {
			this.gender = gender;
		}
		public short getChild() {
			return child;
		}
		public void setChild(short child) {
			this.child = child;
		}
		
		public void print() {
			System.out.println();
			if(married) {
				System.out.print("기혼\n");
			}else {
				System.out.print("미혼\n");
			}
			
				
		}

}

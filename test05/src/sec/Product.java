package sec;

public class Product {
	private String pname;
	private int pcode;
	private int price;
	private int size;
	private int amount;
	private String remark;
//	public String getPname() 
//		return pname;
	
	//추가 
	//메소드 오버로딩/드(하나의 클래스 내부에서 같은 이름의 내부에 메서드를 여러번 쓰되 매개변수에 따라서 여러번 쓸 수 있다. )	
    //
	//오버라이드(특정 메소드를 상속을 받아서 ..실행할 내용을 ...)랑 다름 실행할 내용만 수정 가능함..
	public void print() {
		System.out.println("제품정보");
	} // 같아서 오류가 남
	public void print(int pcode) {	 // 같은 이름의 메서드를 사용해서 호출할때 같은 자료형의 다른 이름은 사용 불가 에러
		System.out.println("");		 // 같은 자료형이라.. 뭐를 호출하는지 몰라서..???? 이상한대
	}
	public void print(String remark ) {	
		System.out.println("");
	}
	public void print(int size,String pname) {	// n개를 호출 할 경우는 같은 자료형인데 다른거 호출 가능 유형이 달라서 그런듯
		System.out.println("");
	}
	public void print(String pnaame,int amount) {	// n개를 호출 할 경우에 순서가 바껴도 유형이 달라서 가능한듯
		System.out.println("");
	}
//	----------------------------------------------
	
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPcode() {
		return pcode;
	}
	public void setPcode(int pcode) {
		this.pcode = pcode;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Product [pname=" + pname + ", pcode=" + pcode + ", price=" + price + ", size=" + size + ", amount="
				+ amount + ", remark=" + remark + "]";
	}
	
}

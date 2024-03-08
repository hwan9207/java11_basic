package sec;

public class Book {
	private int bno;
	private String bname;
	private int price;
	private String author;
	private String pub;
	
	public void print(int bno) {
		System.out.println("교재코드 : " + bno);
	}
	public void print(String bname ) {
		System.out.println("교재명 : "+ bname);
	}
	public void print(int price , String author) {
		System.out.println("가 격 : "+price);
		System.out.println("저 자 : "+author);
	}
	public void print(String pub, int price) {
		System.out.println("출판사 : "+pub);
		System.out.println("교재가격 : "+price);
	}
	
//	public void bno(int i) {
//		System.out.println("아놔");
//	}
	
	public Book() {
		super();
	}
	public Book(int bno) {
		super();
		this.bno = bno;
	}
	public Book(int bno, String bname) {
		super();
		this.bno = bno;
		this.bname = bname;
	}
	public Book(int bno, String bname, int price) {
		super();
		this.bno = bno;
		this.bname = bname;
		this.price = price;
	}
	public Book(int bno, String bname, int price, String author) {
		super();
		this.bno = bno;
		this.bname = bname;
		this.price = price;
		this.author = author;
	}
	public Book(int bno, String bname, int price, String author, String pub) {
		this.bno = bno;
		this.bname = bname;
		this.price = price;
		this.author = author;
		this.pub = pub;
	}
	@Override
	public String toString() {
		return "Book [bno=" + bno + ", bname=" + bname + ", price=" + price + ", author=" + author + ", pub=" + pub
				+ "]";
	}
//	public int getBno() {
//		return bno;
//	}
//	public void setBno(int bno) {
//		this.bno = bno;
//	}
//	public String getBname() {
//		return bname;
//	}
//	public void setBname(String bname) {
//		this.bname = bname;
//	}
//	public int getPrice() {
//		return price;
//	}
//	public void setPrice(int price) {
//		this.price = price;
//	}
//	public String getAuthor() {
//		return author;
//	}
//	public void setAuthor(String author) {
//		this.author = author;
//	}
//	public String getPub() {
//		return pub;
//	}
//	public void setPub(String pub) {
//		this.pub = pub;
//	}
	
	
	

	
}

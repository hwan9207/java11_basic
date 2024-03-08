package sec2;

public class Board {
	private int bno;
	private String title;
	private String uname;
	private String content;
	private String author;
	private int visited;
	
		//생성자 이름 클래스랑 같? 객체를 만들때 쓴다? 
		//생성자 오버로딩 메서드랑 차이점은 .. 반환을 하지 않는다? 객체 생성 동시에 값을 세팅 필요한 만큼 가능
		//
	
	
	//우 클릭 소스 유징 필드 >> 생성자 자동 생성------------------------------------------
	
	public	Board()	{
		
	}
	public Board(int bno) {
		super();
		this.bno = bno;
	}
	public Board(int bno, String title, String uname, String content, String author, int visited) {
			super(); // 지워도 상관없음
			this.bno = bno;
			this.title = title;
			this.uname = uname;
			this.content = content;
			this.author = author;
			this.visited = visited;
//---------------------------------------------------------------------------------	
	}
	public	Board(int bno,String title) {
		this.bno = bno;
		this.title = title;
	}
	public	Board(int bno,String title,String uname) {
		this.bno = bno;
		this.title = title;
		this.uname = uname;
	}
	public	Board(int bno,String title,String uname,String content) {
		this.bno = bno;
		this.title = title;
		this.uname = uname;
		this.content = content;
	}
	public	Board(int bno,String title,String uname,String content,int visited) {
		this.bno = bno;
		this.title = title;
		this.uname = uname;
		this.content = content;
		this.visited = visited;
	}	
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getVisited() {
		return visited;
	}
	public void setVisited(int visited) {
		this.visited = visited;
	}
	@Override
	public String toString() {
		return "Board [bno=" + bno + ", title=" + title + ", uname=" + uname + ", content=" + content + ", author="
				+ author + ", visited=" + visited + "]";
	}
	
	
}

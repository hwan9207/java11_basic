package sec2;
// Top-Down의 생성자 함수 만들기
public class News {
	private int bno;
	private String title;
	private String uname;
	private String content;
	private int visited;
	
	
	
	
//	public News(int bno, String title, String uname, String content) {
//		this(bno, title, uname , content , "0");
//		this.bno = bno;
//		this.title = title;
//		this.uname = uname;
//		this.content = content;
//	}
//	
//	public News(int bno, String title, String uname, String content, int visited) {
//		this(bno, title, uname , content , visited);
//		this.bno = bno;
//		this.title = title;
//		this.uname = uname;
//		this.content = content;
//		this.visited = visited;
	
//	}

	
	public int getBno() {
		return bno;
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


	public int getVisited() {
		return visited;
	}


	public void setVisited(int visited) {
		this.visited = visited;
	}


	@Override
	public String toString() {
		return "News [bno=" + bno + ", title=" + title + ", uname=" + uname + ", content=" + content + ", visited="
				+ visited + "]";
	}

}
	
	


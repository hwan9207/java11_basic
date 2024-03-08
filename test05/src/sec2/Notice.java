package sec2;

public class Notice {
	private int bno;
	private String uname;
	private String visited;
	private	String test;
	
	@Override
	public String toString() {
		return "Notice [bno=" + bno + ", uname=" + uname + ", visited=" + visited + ", test=" + test + "]";
	
		
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getVisited() {
		return visited;
	}

	public void setVisited(String visited) {
		this.visited = visited;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public Notice(int bno, String uname, String visited, String test) {
		super();
		this.bno = bno;
		this.uname = uname;
		this.visited = visited;
		this.test = test;
	}
}

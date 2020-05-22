package practice;

public class Data {
	
	private int num;
	private String title;
	private String writer;
	private String date;
	
	// constructor
	public Data(int num, String title, String writer, String date) {
		this.num = num;
		this.title = title;
		this.writer = writer;
		this.date = date;
	}
	
	// getter
	public int getNum() { return num; }
	public String getTitle() { return title; }
	public String getWriter() { return writer; }
	public String getDate() { return date; }
	
	// setter
	public void setNum(int num) { this.num = num; }
	public void setTitle(String title) { this.title = title; }
	public void setWriter(String writer) { this.writer = writer; }
	public void setDate(String date) { this.date = date; }
	
}


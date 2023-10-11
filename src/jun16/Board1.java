package jun16;

class Board {
	String title;
	String content;
	String writer;
	int hitcount;
	String date;

	public Board(String title, String content) {
//		this.title = title;
//		this.content = content;
//		this.writer = "로그인한 회원아이디";
//		this.date = "현재 컴퓨터 날짜";
//		this.hitcount = 0;
		this(title, content, "로그인한 회원아이디", "현재 컴퓨터 날짜", 0);
		System.out.println(date);
		System.out.println(writer);
	}

	public Board(String title, String content, String writer) {
//		this.title = title;
//		this.content = content;
//		this.writer = writer;
//		this.date = "현재 컴퓨터 날짜";
//		this.hitcount = 0;
		this(title, content, writer, "현재 컴퓨터 날짜", 0);

	}

	public Board(String title, String content, String writer, String date) {
//		this.title = title;
//		this.content = content;
//		this.writer = writer;
//		this.date = date;
//		this.hitcount = 0;
		this(title, content, writer, date, 0);
	}

	public Board(String title, String content, String writer, String date, int hitcount) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
		// this(title, content, writer, date, hicount);// Recursive constructor
		// invocation Board
	}
}

public class Board1 {
	public static void main(String[] args) {
		Board b = new Board("제목", "내용");
		

	}
}

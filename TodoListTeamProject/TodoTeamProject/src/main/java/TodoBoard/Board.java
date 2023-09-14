package TodoBoard;


public class Board {
	String code; //1 
	int no; // 2
	String id; // 3
	String contents; // 4
	String memo; // 5
	String date; // 6
	String star; // 7
	String finished; // 8
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStar() {
		return star;
	}
	public void setStar(String star) {
		this.star = star;
	}
	public String getFinished() {
		return finished;
	}
	public void setFinished(String finished) {
		this.finished = finished;
	}
	
	public Board() {
		// TODO Auto-generated constructor stub
	}
	
	public Board(String code, int no, String id, String contents, String memo, String date, String star,
			String finished) {
		super();
		this.code = code;
		this.no = no;
		this.id = id;
		this.contents = contents;
		this.memo = memo;
		this.date = date;
		this.star = star;
		this.finished = finished;
	}
	
	@Override
	public String toString() {
		return "Board [code=" + code + ", no=" + no + ", id=" + id + ", contents=" + contents + ", memo=" + memo
				+ ", date=" + date + ", star=" + star + ", finished=" + finished + "]";
	}
	
	
	
	
	
	
	
}

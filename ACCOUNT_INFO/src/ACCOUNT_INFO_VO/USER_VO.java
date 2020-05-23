package ACCOUNT_INFO_VO;

public class USER_VO {

	private String name; 
	private String id;
	private String pwd;
	private int seq;
	private String reg_date;
	
	public USER_VO() {
		super();
	}

	public USER_VO(String name, String id, String pwd, int seq, String reg_date) {
		super();
		this.name = name;
		this.id = id;
		this.pwd = pwd;
		this.seq = seq;
		this.reg_date = reg_date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getReg_date() {
		return reg_date;
	}

	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}

	@Override
	public String toString() {
		return "USER_VO [name=" + name + ", id=" + id + ", pwd=" + pwd + ", seq=" + seq + ", reg_date=" + reg_date
				+ "]";
	}
}
	

	
	
	
	
	
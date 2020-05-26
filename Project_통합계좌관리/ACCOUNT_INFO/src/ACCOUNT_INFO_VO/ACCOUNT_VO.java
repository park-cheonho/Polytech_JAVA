package ACCOUNT_INFO_VO;

public class ACCOUNT_VO {

	private String name; 
	private String id; 
	private String account_number; 
	private int balance; 
	private String bank_code;
	private String bank_name;
	private String nick_name;
	
	public ACCOUNT_VO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ACCOUNT_VO(String name, String id, String account_number, int balance, String bank_code, String bank_name,
			String nick_name) {
		super();
		this.name = name;
		this.id = id;
		this.account_number = account_number;
		this.balance = balance;
		this.bank_code = bank_code;
		this.bank_name = bank_name;
		this.nick_name = nick_name;
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

	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getBank_code() {
		return bank_code;
	}

	public void setBank_code(String bank_code) {
		this.bank_code = bank_code;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public String getNick_name() {
		return nick_name;
	}

	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}

	@Override
	public String toString() {
		return "ACCOUNT_VO [name=" + name + ", id=" + id + ", account_number=" + account_number + ", balance=" + balance
				+ ", bank_code=" + bank_code + ", bank_name=" + bank_name + ", nick_name=" + nick_name + "]";
	}
	
	
	
		
	}
		
		
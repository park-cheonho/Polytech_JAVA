package ACCOUNT_INFO_VO;

public class ACCOUNT_VO {

	private String name; 
	private String id; 
	private String account_number; 
	private String balance; 
	private String bank_code;
	
		public ACCOUNT_VO(String name, String id, String account_number, String balance, String bank_code) {
		super();
		this.name = name;
		this.id = id;
		this.account_number = account_number;
		this.balance = balance;
		this.bank_code = bank_code;
	}
		
	@Override
	public String toString() {
		return "ACCOUNT_VO [name=" + name + ", id=" + id + ", account_number=" + account_number + ", balance=" + balance
				+ ", bank_code=" + bank_code + "]";
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
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getBank_code() {
		return bank_code;
	}
	public void setBank_code(String bank_code) {
		this.bank_code = bank_code;
	} 
	
	
}

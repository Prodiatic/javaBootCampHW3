
public class BaseUser 
{
	private int id;
	private String eMail;
	private String password;
	
	
	
	public BaseUser(int _id,String _eMail,String _password)
	{
		super();
		this.id = _id;
		this.eMail = _eMail;
		this.password = _password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}

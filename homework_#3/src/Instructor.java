
public class Instructor extends BaseUser
{
	private String courseGiven;
	private String firstName;
	private String lastName;
	
	public Instructor (int _id, String _firstName,String _lastName,String _eMail,String _password,String _courseGiven) 
	{
		super(_id,_eMail,_password);
		this.courseGiven = _courseGiven;
		this.firstName = _firstName;
		this.lastName = _lastName;
	}

	public String getCourseGiven() {
		return courseGiven;
	}

	public void setCourseGiven(String courseGiven) {
		this.courseGiven = courseGiven;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}

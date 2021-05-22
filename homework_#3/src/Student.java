
public class Student extends BaseUser
{
	
	private String courseTaken;
	private String firstName;
	private String lastName;
	
	public Student (int _id, String _firstName,String _lastName,String _eMail,String _password,String _courseTaken) 
	{
		super(_id,_eMail,_password);    //super/base class attributes.
		this.courseTaken = _courseTaken;
		this.firstName = _firstName;
		this.lastName = _lastName;
		
	}

	public String getCourseTaken() {
		return courseTaken;
	}

	public void setCourseTaken(String courseTaken) {
		this.courseTaken = courseTaken;
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

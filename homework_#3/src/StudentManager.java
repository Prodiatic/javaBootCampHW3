
public class StudentManager extends BaseUserManager
{
	
	public void logIn(BaseUser user) 
	{
		System.out.println("Student login successful with "+ user.geteMail());
	}
	
	
}

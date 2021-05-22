
public class BaseUserManager 
{
	

	public void add(BaseUser[] users) 
	{
		for (BaseUser user : users) 
		{
			System.out.println("User added. UserID : " + user.getId());
		}
	}
	
}

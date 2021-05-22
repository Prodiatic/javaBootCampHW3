
public class Main {

	public static void main(String[] args) 
	{
		
		Student student = new Student(101,"Can","Hamurcu","canhamurcu@gmail.com","samplepassword","JavaBootCamp");
		Instructor instructor = new Instructor(201, "Engin", "Demiroð", "enginmail@mail.com","samplepassword","JavaBootCamp");
		BaseUser[] users = new BaseUser[] {student,instructor};
		
		BaseUserManager baseUserManager = new BaseUserManager();
		baseUserManager.add(users);
		
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		studentManager.logIn(student);
		instructorManager.logIn(instructor);
		
		
	}

}

import java.util.*;

class InvalidUserExcept extends Exception{

public InvalidUserExcept(String msg){

super(msg);

}
}


class Authentication{

	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Username : ");
		String user=sc.next();
		System.out.println("Enter the Password : ");
		String pass=sc.next();
		try
		{
		if(user.length()<8)
		
			throw new InvalidUserExcept("Invalid Username,The username should be greater than 8");
			
		else if(!pass.equals("Orifier976"))
		
			throw new InvalidUserExcept("Invalid Password,Type the correct password");
			
		else
		
			System.out.println("LOgin Successfull.......");
		}
		catch(InvalidUserExcept e)
			{
			e.printStackTrace();
			}
			}
			}


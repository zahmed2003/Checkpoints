import java.util.Random;

public class m1 {

	
	public static void main(String[] args) 
	{
		try {
			System.out.println(new m1().ret(new Random().nextInt(5)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String ret(int x) throws Exception
	{
		switch(x)
		{
		case 0: 
			return "0";
		case 1:
			return "1";
		case 2:
			return "2";
		case 3:
			return "3";
		case 4:
			return "4";
		default:
			throw new Exception();
		}
			
	}
}

import java.util.Random;

public class m0 
{

	public static void main (String[] args)
	{
		int[][] test;
		test = new int[5][5];
		
		for(int i = 0; i < test.length; i++)
		{
			for(int j = 0; j < test[i].length; j++)
			{
				test[i][j] = new Random().nextInt(10);
			}
		}
		
		for(int i = 0; i < test.length; i++)
		{
			for(int j = 0; j < test[i].length; j++)
			{
				System.out.print(test[i][j] + " ");
			}
			System.out.println("");
		}
		
	}
	
	
}

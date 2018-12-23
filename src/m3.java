
import java.io.*;
import java.util.List;
import java.util.ArrayList;
 
public class m3 {
    private List<Integer> list;
    private static final int SIZE = 10;
    
    public static void main(String[] args) {
    	m3 M = new m3();
		try {
			M.readList();
			M.writeList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
 
    public m3 () {
        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++)
            list.add(new Integer(i));
    }
    public void writeList() {
        PrintWriter out = null;
 
        try {
            System.out.println("Entering try statement");
            out = new PrintWriter(new FileWriter("src/OutFile.txt"));
         
            for (int i = 0; i < SIZE; i++)
                out.println("Value at: " + i + " = " + list.get(i));
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Caught IndexOutOfBoundsException: " +
                                 e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }
    
    public void readList() throws Exception
    {
    		BufferedReader br = new BufferedReader(new FileReader("src/list.txt"));
    		String line = br.readLine();
    		
    		while (line != null)
    		{
    			list.add(Integer.parseInt(line));
    			System.out.println(list);
    			line = br.readLine();
    		}
    		
    		br.close();
    }
}

import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class BOBBIEHandler implements Runnable
{
    public BOBBIEHandler(Socket newConnectionToClient)
    {	
    	//Bind streams
    }
    
    public void run()
    {
    	//Process commands from client		    
    }
    
    private boolean matchUser(String username,String password)
    {
		boolean found = false;
		File userFile = new File(""/*File location*/);
		try
		{
		    Scanner scan = new Scanner(userFile);
		    while(scan.hasNextLine()&&!found)
		    {
			String line = scan.nextLine();
			String lineSec[] = line.split("\\s");
	    		
			//Compare user 
			
		    }
		    scan.close();
		}
		catch(IOException ex)
		{
		    ex.printStackTrace();
		}
		
		return found;
    }
    
    private ArrayList<String> getFileList()
    {
		ArrayList<String> result = new ArrayList<String>();
		File lstFile = new File(""/*File location*/);
		try
		{
			Scanner scan = new Scanner(lstFile);

			//Read in each line of file
			
			scan.close();
		}	    
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		
		return result;
    }
    
}

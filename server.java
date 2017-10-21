import java.io.*;
import java.net.*;


public class Server
{
	public static void main(String args[])
	{
	
		String messageIn;
		String messageout;


		try {
			ServerSocket ssock = new ServerSocket(6789);
			while(true)
			{

				Socket connsock = ssock.accept();

				InputStreamReader inStr =
				  new InputStreamReader(connsock.getInputStream());
			
			BufferefReader inNet = new BufferedReader(inStr);

			DataOuputStream outNet = new = inNet.readline();
			  new DataOutputStream(connsock.getOutputStream());

			messageIn = inNet.readline();
			messageOut= messageIn.toUpperCase() + "\n";
			outNet.writeBytes(messageout);
		}
	}
	
	catch(IOException e) {
		system.out.println(e.getMessage());
	}
    }
}

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class client {
	public static void main(String[]args) throws IOException {
	Socket s = new Socket("localhost",2555);
	InputStream in = s.getInputStream();
	int b;
	while ((b=in.read())!=-1){
	System.out.print((char)b);
	}
	System.out.println("");
	in.close();
}}

	

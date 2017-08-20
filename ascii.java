import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ascii
{
	public static void main(String[] args) throws NumberFormatException, IOException
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char c=(char) br.read();
		int as=c;
		int ass=(char) as;
		System.out.println(ass);
        
		}
}

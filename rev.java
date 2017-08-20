import java.util.*;
import java.io.*;
public class rev
{
	public static void main(String[] args) throws NumberFormatException, IOException
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String n=br.readLine();
		System.out.println(n);
		StringBuffer buf=new StringBuffer(n);
		String ss=buf.reverse().toString();
		int n1=Integer.parseInt(ss);
		System.out.println(n1);
		
		}
		}

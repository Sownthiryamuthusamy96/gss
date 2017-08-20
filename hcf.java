package swap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 
{
	public static void main(String[] args) throws NumberFormatException, IOException
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int n1=Integer.parseInt(br.readLine());
		int hcf=0;
        int min = Math.min(n,n1);
         
        for(int i=min; i >= 1; i--)
        {
            if(n%i == 0 && n1%i == 0)
            {
                hcf = i;
                break;
            }
        }        
        System.out.print("\nThe hcf of "+n+" and "+n1+" = "+hcf);
        
		}
}

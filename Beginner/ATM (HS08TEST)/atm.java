import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try{
		    
			Scanner sc = new Scanner(System.in);
        
            // withdrawal amount
            double x = sc.nextDouble();
            
            // balance
    		double y = sc.nextDouble();
            
            // If withdrawal amount is a multiple of 5 and 
            // there's enough balance.
    		if (x % 5 == 0 && x + 0.5 <= y) {
    		    y -= x + 0.5;
    		}
    		
            System.out.println(y);
            
            sc.close();
    		
		}catch(Exception e){
			return;
		}
	}
}

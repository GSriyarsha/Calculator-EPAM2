/**
 * 
 */
import java.util.*;
/**
 * 
 * @author Sriyarsha 
 * This is program where a choice of operation is considered and performed accordingly.
 * This program takes any nuumber of parameters.
 *
 */
public class Calculator {
	int n,c;
	Scanner s = new Scanner(System.in);
	public int add(){
        n = s.nextInt();
		int sum = 0;
		int a;
		for(int i=0; i < n; i++){
			a = s.nextInt();
			sum = sum + a;
		}
		return sum;
	}	
	public int multiply(){
		int prod = 1;
		int a;
		for(int i=0; i < n; i++){
			a = s.nextInt();
			prod = prod * a;
		}	
		return prod;
	}	
	public double divide(){
		double a,b;
			a = s.nextInt();
			b = s.nextInt();
			try{
			 return b/ (double)a;
			}
			catch(Exception e){
			 return Integer.parseInt(e.getMessage());
			}
		}
}

	

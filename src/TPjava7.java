import java.util.Arrays;

public class TPjava7 {

	public static void main(String[] args) {
		primeNumber(10);
	}
	
	public static void primeNumber(int nbr) {
		int ct=0,n=0,i=1,j=1;  
		while(n<nbr)  {  
		j=1;  
		ct=0;
		while(j<=i){  
			if(i%j==0) {  
				ct++;
			}
		j++;
		}
		if(ct==2){  
			System.out.printf("%d ", i);  
			n++;  
		}  
		i++;
		}
	}
	
}

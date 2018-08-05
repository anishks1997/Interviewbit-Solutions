
import java.util.*;

public class distinct_prime_of_product{

	public static void main(String[] args)
	{
		int len = 0;

		Scanner scan = new Scanner(System.in);

		len = scan.nextInt();

		int[] arr = new int[len];

		for(int i = 0; i < len; i++)
		{
			arr[i] = scan.nextInt();
		}

		int result = prime_div_dist(arr);

		System.out.println(result);

		scan.close();

	}

	public static int prime_div_dist(int[] arr)
	{
		int len = arr.length;
        
        int pdt = 1;
        
        int main_counter = 0;
        
        int sub_counter = 0;
        
        for(int i = 0; i < len; i++)
        {
            pdt = pdt * arr[i];
        }
        
        while(pdt % 2 == 0)
        {
            pdt = pdt / 2;
            
            sub_counter++;
        }
        
        if(sub_counter > 0)
        {
            main_counter++;
        }
        
        for(int i = 3; i < (int) Math.sqrt(pdt); i = i + 2)
        {
            sub_counter = 0;
            
            while(pdt % i == 0)
            {
                pdt = pdt / i;
                
                sub_counter++;
            }
            
            if(sub_counter > 0)
            {
                main_counter++;
            }
            
        }
        
    	return main_counter;   
        
	}
}
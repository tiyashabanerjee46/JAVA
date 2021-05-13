import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
public static void main(String[] args) {
 Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
        int i=0,max=0;
        while(n>0)
        {
            
            if(n%2==1)
            {
                i++;
                   if(i>=max)
                   {
                       max=i;
                   }
           }
           
           else
            {
                 i=0;
            }
         n=n/2;
        }
        System.out.println(max);
        sc.close();
    }
}

/* output:
1.
  439
  3     //110110111-highest max consecutive 1's is 3 times.
  
2. 5
   1  //101
   
3. 13
   2 //1101
*/
 

import java.util.*;
import java.text.*;
import java.util.Locale;

public class Solution {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double payment = sc.nextDouble();
        sc.close();
        final String us=NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        final String india=NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment);
        final String china=NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        final String france=NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        // Write your code here.
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
/*OUTPUT:
Sampleinput:
9987.99
SampleOutput:
US: $9,987.99
India: Rs.9,987.99
China: ￥9,987.99
France: 9 987,99 €
*/

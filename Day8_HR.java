import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer>myMap= new HashMap<String,Integer>();//create hashmap
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String name = sc.next();
            int phone = sc.nextInt();
            myMap.put(name,phone);//put the value of (key,value)
            sc.nextLine();
        }
        while(sc.hasNext()){
            String s = sc.next();
            if(myMap.containsKey(s))
            {
                System.out.println(s+"="+myMap.get(s));//check the key with s
            }
            else
             {
                 System.out.println("Not found");
             }
        }
        sc.close();
    }
}

/*output:
userinput:
3
sam 99912222
tom 11122222
harry 12299933
sam
edward
harry
output:
sam=99912222
Not found
harry=12299933
*/

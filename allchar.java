import java.io.*;
import java.util.*;
class allchar
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        String str2 = str.replaceAll("[^0-9]","");
        System.out.println(str2);
    }
}

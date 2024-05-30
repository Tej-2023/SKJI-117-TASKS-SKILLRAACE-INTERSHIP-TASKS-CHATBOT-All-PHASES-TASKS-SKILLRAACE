import java.util.*;
public class Task2B
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int c=0;
	    String s=String.valueOf(a);
	    for(int i=0;i<s.length();i++)
	    {
	        int d= s.charAt(i)-'0';
	        
	        if(d==4)
	        c=c+1;
	    }
		System.out.println(c);
	}
}
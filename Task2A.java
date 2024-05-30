import java.util.*;
public class Task2A
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int os=0;
	    int es=0;
	    String s=String.valueOf(a);
	    for(int i=0;i<s.length();i++)
	    {
	        int d= s.charAt(i)-'0';
	        
	        if(d%2==0)
	        es=es+d;
	        else
	        os=os+d;
	    }
		System.out.println(os+" "+es);
	}
}
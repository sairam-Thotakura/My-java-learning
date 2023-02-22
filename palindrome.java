import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=12321,r,s=0;
        int temp=n;
        while(n>0){
            r=n%10;
            n=n/10;
            s=s*10+r;
        }
        if(temp==s)
        System.out.println("it is a palindrome");
        else
        System.out.println("it is not a palindrome");
    }
}

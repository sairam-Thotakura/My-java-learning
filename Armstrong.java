public class Armstrong {
    public static void main(String[] args) {
        /*
          1 5 3 --> 1^3 + 5^3 + 3^3 ==153
         */
        int n =153,r,sum=0;
        int temp=n;
        while(n>0)
        {
             r=n%10;
             n=n/10;
             sum+=r*r*r;
        }
        if(sum==temp)
        System.out.println("perfect number");
        else
        System.out.println("not a perfect number");
    }
}

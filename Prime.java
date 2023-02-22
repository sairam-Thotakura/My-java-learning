public class Prime {
    public static void main(String[] args) {
        /*int n=17;
        boolean isprime=true;
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
            isprime=false;
        }
            break;
        }
        if(isprime)
        System.out.println("it is a prime");
        else 
        System.out.println("its not a prime"); */

        for(int n=2;n<20;n++){
            boolean b=true;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                b=false;
                break;
                }
            }
            if(b) System.out.println(n);
        }
    }
}

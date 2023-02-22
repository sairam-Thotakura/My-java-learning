public class swap2nums {
    public static void main(String[] args) {
        int a,b,temp;
a=4; // 1 0 0
b=5; // 1 0 1
// "^" --> XOR  ----> 1 0 --> 1; 0 0 --> 0; 1 1 ---> 0; 0 1 ---> 1;


b=a+b-(a=b);

// a=a^b;
// b=a^b;
// a=a^b;

// a=a+b;
// b=a-b;
// a=a-b;

// temp=b;
// b=a;
// a=temp;
System.out.print(a+" "+b);

    }
}

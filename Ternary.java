public class Ternary {
    public static void main(String[] args) {
         int i=1;
        int j=5;

        // if(i==1)
        // j=6;
        // else
        // j=7;

// Same as this
        
        j=i==1?6:7;  // ANS --> 6 //This means j value is 6 or 7 based on ifof i=1 is true or false 
      //j=i==4?6:7;  // ANS --> 7
        System.out.println(j);

       /*  object obj1;
        object obj2;

        if(true)
        obj1=new Integer(10);

        else
        obj1=new Double(15.0);
        System.out.println(obj1);

        obj2=true?new Integer(10):new Double(10.0); */
    }
}

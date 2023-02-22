import java .util.*;
public class Example {

    public static void fact(int n){
        int f=1;
       for(int i=1;i<=n;i++){
        f*=i;
       }
       System.out.println(f);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       fact(n);
        
        


        // 7 bits ----> 2^7 --->128 bits 
        // so there are 0-127 ascii values
         // ASCII ---> American standard code for information interchange
  /*   for(int i=0;i<=127;i++)
    {
        System.out.printf("%d : %c \n",i,i);
    }
*/

    // for(int n=2;n<20;n++){
    //     boolean b=true;
    //     //int count=0;
    //     for(int i=2;i<n;i++){
    //         if(n%i==0){
    //           b=false;
    //             // count++;
    //             break;
    //         }
           
    //     }
    //      if(b) System.out.println(n);
    // }

    
//     Scanner sc=new Scanner(System.in);
//         int a=/*2;*/  sc.nextInt();
//         int r1=/*1;*/ sc.nextInt();
//         int sum1=0;
//          float avg1=0;
//          float avg2=0;
//         String name1=/* "Ram";*/  sc.nextLine();
//         sc.nextLine();
//         int marks1[]=new int[3];
//         // int marks1[]={57,68,90};
//         // sum=57+68+90;
//         // avg1=sum/3f;
//         for(int i=0;i<3;i++){
//         marks1[i]=sc.nextInt();
//         sum1+=marks1[i];
//          avg1=sum1/3f;
//     }
//     int r2=/*1;*/ sc.nextInt();
//     String name2=/* "Ram";*/  sc.nextLine();
//     sc.nextLine();
//     int sum2=0;
//     int marks2[]=new int[3];
//     // int marks1[]={57,68,90};
//     // sum=57+68+90;
//     // avg1=sum/3f;
//     for(int i=0;i<3;i++){
//     marks2[i]=sc.nextInt();
//     sum2+=marks2[i];
//      avg2=sum2/3f;
// }
    
//     System.out.print(r1+" "+name1+" "+sum1+" "+avg1+"\n");
//     System.out.print(r2+" "+name2+" "+sum2+" "+avg2);



   
}
}

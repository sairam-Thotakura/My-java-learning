public class patterns {
    public static void main(String[] args) {

        /*
             *
             * *
             * * *
             * * * *
         */
        /*
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }  */

        /* 
          * * * *
          * * * *
          * * * *
          * * * *
        */
        /* 
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.print("* ");
            }
            System.out.println("");
        } */

        /*  
           * * * *
           *     *
           *     *
           * * * *

        */
       /*  for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(i==1 || i==4 || j==1 || j==4)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println("");
        */

        /*
          1 2 3 4
          2 3 4 1
          3 4 1 2 
          4 1 2 3
         */

       /*   for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
               // if(i+j-1>4)
               int k=i+j-1;
               if(k>4)
                System.out.print(k-4 +" ");
                else
                System.out.print(k +" ");
            }
            System.out.println();
        }
        */

        /*
          1
          0 1 
          1 0 1
          0 1 0 1
          1 0 1 0 1 
         */

        /*  for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                int k=i-j+1;
                System.out.print((k%2)+" ");
            }
            System.out.println();
         } */

         /*
           * * * *
           * * *
           * *
           * 
           * * 
           * * *
           * * * *
          */

         /*  for(int i=1;i<=4;i++){
            for (int j=4;j>=i;j--){
                System.out.print("* ");
            }
            System.out.print("\n");
          }
          for(int i=2;i<=4;i++){
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
          }
          */

          /*
             1 
             2 1 
             3 2 1 
             4 3 2 1
             5 4 3 2 1 
             6 5 4 3 2 1
             7 6 5 4 3 2 1
           */

          /*  for(int i=1;i<=7;i++){
            for(int j=i;j>=1;j--){
                int k=j+i-1;
                //if(k>7)
                System.out.print(j+" ");
                // else
                // System.out.print(k+" ");
            }
            System.out.println();
           }*/
           
         /* 1 
            1 0
            1 0 1
            1 0 1 0
            1 0 1 0 1
            1 0 1 0 1 0
            1 0 1 0 1 0 1 */
            
           /*for(int i=1;i<=7;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j%2+" ");
                // else
                // System.out.print(k+" ");
            }
            System.out.println();
           }*/

           /*
              1
              0 1
              1 0 1
              0 1 0 1
              1 0 1 0 1 
            */

            /*  for(int i=1;i<=6;i++){
                for(int j=1;j<i;j++){
                    System.out.print((j+i-2)%2+" ");
                }
                System.out.println();
            }*/

            /*
              1
              2 2
              3 3 3 
              4 4 4 4 
              5 5 5 5 5
             */

             for(int i=1;i<=5;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(i+" ");
                }
                System.out.println();
             }
    }
    
}

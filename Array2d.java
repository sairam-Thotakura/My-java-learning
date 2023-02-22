public class Array2d {
    public static void main(String[] args) {
       // int a[][]=new int[3][4];
        // int a[][]={{1,2,3,4 },
        //            {5,6,7,8 },
        //            {9,10,11,12}};

        int a[][]={{1,2,3,4 },
                   {5,6},
                  {9,10,11}};



        for(int i[]:a)
        {
            for(int j :i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        // for(int i=0;i<3;i++)
        // {
        //     for(int j=0;j<4;j++)
        //     {
        //         System.out.print(a[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        
       
    }
}

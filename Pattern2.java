/*
output : 
        1
       1 2
      1 2 3
     1 2 3 4
    1 2 3 4 5
   1 2 3 4 5 6
  1 2 3 4 5 6 7
 1 2 3 4 5 6 7 8
1 2 3 4 5 6 7 8 9 
 */
package assignment2;

public class Pattern2 {
    public static void main(String args[])
    {
        int row=9,j,k;
        for(int i=1;i<10;i++)  //rows
        {
            for(j=row-i;j>0;j--) //spaces
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)  //print pattern
            {
               System.out.print(k+" "); 
            }
            System.out.println();
        }
    }
    
}

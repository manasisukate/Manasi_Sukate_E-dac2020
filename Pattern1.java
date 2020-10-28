/*
Output :
        1
       2 2
      3 3 3
     4 4 4 4
    5 5 5 5 5
   6 6 6 6 6 6
  7 7 7 7 7 7 7
 8 8 8 8 8 8 8 8
9 9 9 9 9 9 9  9 9
*/
package assignment2;
public class Pattern1 {
    public static void main(String args[])
    {
        int row=9,j,k;
        for(int i=1;i<10;i++) //rows
        {
            for(j=row-i;j>0;j--) //spaces
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++) //print pattern
            {
               System.out.print(i+" "); 
            }
            System.out.println();
        }
    }
}

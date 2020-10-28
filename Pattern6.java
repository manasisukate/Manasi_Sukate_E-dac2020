
package assignment2;

public class Pattern6 {
    public static void main(String args[])
    {
        int rows=9;
        for(int i=rows;i>=1;i--)
        {
           for(int j=rows-i;j>0;j--) //spaces
           {
                System.out.print(" ");
           }
           for(int k=1;k<=i;k++) //spaces
           {
                System.out.print("* ");
           }
           System.out.println();
        }
    }
}

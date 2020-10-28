package assignment2;

public class Pattern4 {
    public static void main(String args[])
    {
        int row=9,j,k,m,n;
        for(int i=1;i<10;i++)
        { 
            //Divide into two pattern.
            //pattern1
            for(j=2*(row-i);j>0;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
               System.out.print(k+" "); 
            }
            //pattern2
            for(m=i;m>=2;m--) //start with row 2 and print in reverse order.
            {             
                    System.out.print((m-1)+" ");               
            }
            System.out.println();
            
        }
    }
  
}

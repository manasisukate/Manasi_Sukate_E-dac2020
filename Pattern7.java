/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author A
 */
public class Pattern7 {
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
                System.out.print(i+" ");
           }
           System.out.println();
        }
    }
    
}

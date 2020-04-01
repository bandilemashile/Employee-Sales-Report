
package question1_salestest;

import java.util.Scanner;


public class Question1_SalesTest
{

    
    public static void main(String[] args)
    {
     Scanner input = new Scanner(System.in);
     
     int [][]sales = new int[3][3];
     String [] id = {"10111","10122","10133"};
     
     for(int x = 0;x < 3;x++)
     {
         for(int y = 0;y < 3;y++)
         {
             System.out.print("Enter the sales amount ["+x+"] ["+y+"] : ");
             sales[x][y] = input.nextInt();
         }
     }
     
          System.out.print("\n");
         System.out.print("***********************************************************");
         System.out.print("\n");
         System.out.print("               EMPLOYEE SALES REPORT");
         System.out.print("\n");
         System.out.print("***********************************************************");
     
     
      System.out.print("\n\n");
      System.out.print("\t\tSales1\tSales2\tSales3");
        System.out.print("\n");
     
     for(int x = 0;x < 3;x++)
     {
         System.out.print(id[x]+" ---- >");
         for(int y = 0;y < 3;y++)
         {
             System.out.print("\t R "+sales[x][y]);
           
         }
         System.out.print("\n");
     }
      System.out.print("\n");
       System.out.print("***********************************************************");
       System.out.print("\n");
        System.out.print("                 EMPLOYEE SALES TOTALS");
        System.out.print("\n");
         System.out.print("***********************************************************");
        System.out.print("\n");
        System.out.print("\n");
     
     int sum = 0;
       for(int x = 0;x < 3;x++)
     {
         for(int y = 0;y < 3;y++)
         {
         
             sum = sum + sales[x][y];
             
         }
       System.out.print(id[x]+" ---- > : R "+sum);
        System.out.print("\n");
        sum = 0;
     }
       
        int sum1 = 0;
       for(int x = 0;x < 3;x++)
     {
         for(int y = 0;y < 3;y++)
         {
         
             sum1 = sum1 + sales[y][x];
             
         }
       System.out.print(id[x]+" ---- > : R "+sum1);
        System.out.print("\n");
        sum1 = 0;
     }
        System.out.print("\n");
        System.out.print("***********************************************************");
    }
}
    

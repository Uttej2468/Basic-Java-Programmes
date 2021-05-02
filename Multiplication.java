//Multiplication table for the given number
 import java.util.*;
  class Multiplication
   { 
    public static void main(String[] args) 
   {
   Scanner sin=new Scanner(System.in);
   int num=sin.nextInt();
      for(int i=1;i<=10;i++)  
       {    
       System.out.println(i+" * "+num+" = "+(i*num));
       }
    }

    } 
 
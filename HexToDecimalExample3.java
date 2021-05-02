    public class HexToDecimalExample3{    
    public static int getDecimal(String hex){ //JAva occurance A=2
        String digits = "0123456789ABCDEF";  
                 hex = hex.toUpperCase();//A1  
                 int val = 0;  
                 for (int i = 0; i < hex.length(); i++)  
                 {  
                     char c = hex.charAt(i);  //
                     int d = digits.indexOf(c);  //
                     val = 16*val + d;  //
                 }  
                 return val;  
    }  
    public static void main(String args[]){    
    System.out.println("Decimal of a is: "+getDecimal("a1"));  
    System.out.println("Decimal of f is: "+getDecimal("f"));  
    System.out.println("Decimal of 121 is: "+getDecimal("121"));  
    }}    
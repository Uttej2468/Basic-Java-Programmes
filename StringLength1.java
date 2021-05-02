class StringLength1 {  
   public static void main(String args[]) throws Exception {
      String str = "String ";
      int i = 0;
      System.out.println("Length="+str.length());
      for(char c: str.toCharArray()) {

         i++;
      }
      System.out.println("Length of the given string :"+i);
   }
}
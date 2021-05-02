class StringMethod
{
	public static void main(String args[])
	{
		String str1=" Amaravati ";
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.trim());
		
		String str2="VIT-AP ";
		System.out.println(str2.startsWith("V")); 
 		System.out.println(str2.endsWith("p"));
 		System.out.println(str2.contains("AP"));

 		System.out.println(str2.charAt(0));
		System.out.println(str2.charAt(5));
		System.out.println(str2.charAt(6));


		String s1="Java is a programming language. Java is a platform. Java is an Island.";    
    	String replaceString=s1.replace("Java","Kava");
    	System.out.println(replaceString);    
	}
}
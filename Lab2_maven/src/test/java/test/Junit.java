package test;

public class Junit {

	public static void main (String args[])
	{
	
		printer("aaabbbhhhyuyyym");
		
	}
	
	 public static String printer(String s) 
	{
		 int k=0;
		 String fin;
		 for(int i=0; i< s.length();i++)
		 {
			 if (s.charAt(i)>'z' || s.charAt(i)<'a')  return "";
			 if (s.charAt(i)>'m') k++;	 
		 }
		 fin=k+"/"+s.length();
		 System.out.print(fin);
	        return fin;
}
}
package stringprogram;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //string literal way
		 String s="hello";
		 
		 String s1=new String("world");
		 System.out.println(s);
		 System.out.println(s1);
		
		 //charAt-return charracter based on index position
		 System.out.println(s1.charAt(4));
		 System.out.println(s.charAt(0));
		 
		 //length method-to return the size/lenth
		 System.out.println(s.length());
		 System.out.println(s1.length());
		 
		 //concat method- to add 2 string/
         System.out.println(s.concat(s1));
         System.out.println(s);
         
         //contains-to check if any specific character is present in a string--
         //if yes then it returns true value
         System.out.println(s.contains("o"));
         System.out.println(s.contains("w"));
         
         //isEmpty method--true /false is returned
         String f= "";
         System.out.println(s1.isEmpty());
         System.out.println(f.isEmpty());
         
         //valueOf method-convert any datatype to string
         int x=7;
         System.out.println(String.valueOf(x));
         
         //new string
         String g="lolo";
         String h="KIKA";
         String i="lolo";
         
         //equals method
         System.out.println(g.equals(i));
         System.out.println(g.equals(h));
         
         //equalsIgnoreCase()
         System.out.println(g.equalsIgnoreCase(i));
         
	}

}

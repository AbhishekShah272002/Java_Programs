public class Name {
    public static void main(String[] args) {
      // String name = new String("Abhishek");
      // String name = "Abhishek";
      // System.out.println("Hello " + name);
      //  System.out.println(name.charAt(5));
      //  System.out.println(name.concat(" Shah"));
    
      // String s1="Abhi";
      // String s2="Abhi";
      // System.out.println(s1 == s2); 

      StringBuffer sb = new StringBuffer("Abhishek");
      System.out.println(sb.capacity());
      System.out.println(sb.length());
      sb.append(" Shah");
      System.out.println(sb);
    }

}

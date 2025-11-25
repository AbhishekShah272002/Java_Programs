class InvalidAge Exception extents Exception
InvalidAge Exception(String message)
{
  super(message):; 
 } 
}
public class Try_catch.java
  {
    static void checkAge(int age)  
    throw InvalidAgeAge Exception  
    {
      if(age<18)  
      {
        throw new InvalidAge Exception ("You must be 18 or older. Age age: " + age);
      }
      System.out.println("Age is fine: " + age);
    } 
    public static void main(String[] args)
    {
      int [] age = {21, 16};
      for(int age : ages)
        {
          try
            {
              checkAge(age);
            }
              catch(InvalidAge Exception)  
            {
              System.out.prinln("Error: " + e.get Message());
            }
          finally
            {
              System.out.println("Check finished for age: " + age + "\n");
            }
        }
    }
  }


  

       
 class Computer{ 
    public void show()
    {
        System.out.println("In Computer class");  
    } 
 }      
     
class Laptop extends Computer{     
 
 }  

 class A { 
    public void show()
    { 
        System.out.println("In A show");
    }
}

class B extends A
{
    public void show() 
    {
        System.out.println("In B show");
    }
}

class C extends B
{
    public void show()
    {
        System.out.println("In C show");
    }
}

class D
{
    public void show()
    {
        System.out.println("In D show");
    }
}

public class DynamicDispatch {
    public static void main(String[] args) {
        
        A obj = new A(); // Upcasting 
        obj.show(); // Dynamic method dispatch

        obj = new B(); // Upcasting works only for reference type with parent class
        obj.show(); // Dynamic method dispatch

        obj = new C(); // Upcasting works only for reference type with parent class
        obj.show(); // Dynamic method dispatch

        D obj2 = new D(); // Upcasting works when make seprate class
        obj2.show(); // Dynamic method dispatch

        Computer obj1 = new Laptop(); // Upcasting works only for reference type with parent class
        obj1.show();
    }
}

 class Calculator{
    int a;
    public int add( int n1, int n2) {
        int r = n1 + n2;
        return r;
    }  
}  
public class Class {   
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 3;

        Calculator calc = new Calculator();

        int result = calc.add(num1, num2);

        System.out.println(result);
    }
}

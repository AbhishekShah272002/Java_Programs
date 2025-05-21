class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    } 
}
public class Calss3 {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int r1 = obj.add(10, 20, 30); 
        System.out.println(r1);
    }
}

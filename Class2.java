class Computer{
    public void playMusic() {
        System.out.println("Music is playing");
    }
    public String getMeAPen(int cost){
        if(cost >= 10)
        return "Pen";
        else
        return "No Pen";
    }

    
}
public class Class2 {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen  (19);
        System.out.println(str);
    }
}

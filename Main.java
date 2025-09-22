class Car{
  String color;
  int speed;

void drive()
  {
    System.out.println("The car is driving at speed :" + speed);
  }
} 

public calss Main { 
  public static void main(String[] args)
    Car myCar = new Car();
  myCar.color = "Red";
  myCar.speed = 100;

  Car yourCar = new Car();
  yourCar.color = "Blue";
  yourCar.speed = 80;

  myCar.drive();
  yourCar.drive();
}
}


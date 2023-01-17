public class Main {
    public static void main(String[] args) {
        //задание1
        int age = 56;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
            }
        else{
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия , нужно немного подождать");
            }
        //задание2
        double temperature = 4;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов , можно идти без шапки");
        }
        else{
            System.out.println("На улице " + temperature + " градусов , нужно надеть шапку");
        }
        //задание 3
        double speed = 40;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " ,то  придется заплатить штраф");
        }
        else{
            System.out.println("Если скорость " + speed + " ,то  можно ездить скокойно");
        }
        //задание 4
        int humanAge = 5;
        if (humanAge >= 2 && humanAge <= 6 ) {
            System.out.println("Если возраст человека равен " + humanAge + " ,то  ему нужно ходить в детский сад");
        }
        if (humanAge >= 7 && humanAge < 18 ) {
            System.out.println("Если возраст человека равен " + humanAge + " ,то  ему нужно ходить в школу");
        }
        if (humanAge >= 18 && humanAge < 24 ) {
            System.out.println("Если возраст человека равен " + humanAge + " ,то  ему нужно ходить в университет");
        }
        if (humanAge >= 24 ) {
            System.out.println("Если возраст человека равен " + humanAge + " ,то  ему нужно ходить на работу");
        }
        //задание5
        int childAge = 10;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + " ,то  ему нельзя кататься на аттракционе" );
        }
        if (childAge >= 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + " ,то  ему можно кататься на аттракционе в сопровождении взрослого" );
        }
        if (childAge >= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + " ,то  ему можно кататься на аттракционе без сопровождения взрослого" );
        }
        //задание6
        int wagonCapacity = 102;
        int seatPlace = 60;
        int passengersNumber =67;
        if (passengersNumber < seatPlace){
            System.out.println("В вагоне " + passengersNumber + " человек, есть сидячие места");
            }
        if (passengersNumber >= seatPlace && passengersNumber < wagonCapacity){
            System.out.println("В вагоне " + passengersNumber + " человек, есть стоячие места");
        }
        else {
            System.out.println("Все места заняты");
        }
        // задание 7
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three){
            System.out.println("Большее число - это  " + one);
        }
        if (two > one && one > three){
            System.out.println("Большее число - это  " + two);
        }
        else {
            System.out.println("Большее число - это " + three);
        }

    }
}
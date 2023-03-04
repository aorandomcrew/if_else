public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен - "+ age +", то он совершеннолетний" );
        }
        if (age<18){
            System.out.println("Если возраст человека равен - "+ age +", то он не достиг совершеннолетия, нужно немного подождать"    );
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int temperature = 5;
        if (temperature<5){
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        if (temperature>=5){
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int speed = 60;
        if (speed>=60){
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        if (speed<60){
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int age = 17;
        if (age >= 2     && age < 5){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age <= 18){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в ходить в школу");
        }
        if (age > 18 && age <= 24){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        if (age > 24){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }

    }
    public static void task5 () {
        System.out.println("Задача 5");
        int age = 14;
        if (age < 5){
            System.out.println("если возраст ребенка равен "+ age +", то ему нельзя кататься на аттракционе");
        }
        if (age >= 5 && age < 14){
            System.out.println("если возраст ребенка равен "+ age +", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        if (age >= 14){
            System.out.println("если возраст ребенка равен "+ age +", то он может кататься без сопровождения взрослого");
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int people = 24;
        if (people < 102){
            System.out.println("в вагоне есть свободные места");
        } else {
            System.out.println("в вагоне нет свободных мест");
        }
        if (people<60){
            System.out.println("в вагоне есть сидячие места");
        }else {
            System.out.println("в вагоне нет сидячих мест");
        }
    }
    public static void task7 () {
        System.out.println("Задача7 ");
        int one = 1;
        int two = 6;
        int three = 8;
        if(one>two && one>three){
            System.out.println("первое число наибольшее");
        }else {
            if (two>one && two>three){
                System.out.println("второе число наибольшее");
            }
            else {
                if(three>one && three>two){
                    System.out.println("третье число наибольшее");
                }
            }
        }
    }
}
public class main3 {
    public static void main(String[] args){
        int afloor = 5;
        int floor = 6;

        if(floor > afloor && floor <10){
            if(floor == 2){
                System.out.println("Ви піднялись на 3 поверх");
                floor = 3;}
            System.out.println("Ви піднялися на "+ (floor) +" поверх");}
        else if (afloor == 2) {
            System.out.println("Ви спустились на 1 поверх");
            floor=1;}
        else if (floor < afloor) {
            System.out.println("ви спустилися на "+ (floor) + " поверх");

        } else if (afloor == floor) {
            System.out.println("Ви вже знаходитесь на цьому поверсі");
        }
        else {
            System.out.println(("У цьому будинку не має такого поверху"));
        }

    }
}

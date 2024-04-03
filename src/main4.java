public class main4 {
    public static void main(String[] args){
        switch ("No"){
            case "Так":
            case "OK":
            case "Yes":
            case "Y":
            case "+":
            case "Ok":
                System.out.println("Ви погодились!");
                break;
            case "Ні":
            case "NO":
            case "N":
            case "-":
            case "No":
                System.out.println("Ви відмовились!");
                break;
            default:
                System.out.println("Ви вказали неіснуючу відповідь");


        }


    }
}

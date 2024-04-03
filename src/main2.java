public class main2 {
    public static void main(String[] args){
        int n = 759;
        int a = n/100;
        int b = (n%100)/10;
        int c =(n%10);
        if (a>b & a>c){
            System.out.println(a);
        }else if(b>a & b>c){
            System.out.println(b);
        }else if (c>a & c>b ){
            System.out.println(c);
        } else if (a==b  &  a>c) {
            System.out.println(a);
        }else if (a==c & a>b) {
            System.out.println(a);
        }else if (b==c & b>a){
            System.out.println(b);
        }else if (b==a & b>c){
            System.out.println(b);
        }else if (c==a & c>b){
            System.out.println(c);
        }else if (c==b & c>a){
            System.out.println(c);
        }else if (a==b & b==c) {
            System.out.println(a);
        }


    }
}

public class Sample {

    public static void main(String [] args){
        callAldous();
        System.out.println(add(4, 5));
        printNumbers(7, 9);
    }

    public static void callAldous(){
        System.out.println("I called aldous");
    }

    public static int add(int x, int y){
        return x + y;
    }

    public static void printNumbers(int x, int y){
        System.out.println(x + " " + y);
    }
}

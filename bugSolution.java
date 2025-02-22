public class MyClass {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
            //This if condition removed, because if condition caused unexpected behavior 
            //if (i == 5) {
                //break; // Exit the loop prematurely
           // }
        }
        System.out.println("Loop finished");
    }
}
//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
//Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?

package Task;


public class Task1 {
    //ArrayIndexOutOfBoundsException
    public static void methodOne(String[] args) {
       int[] array = {1, 20, 32, 45, 51, 64, 77};
    }

    //ArithmeticException
    public static void methodTwo(String[] args) {
        int num1 = 5;
        int num2 = 0;
        int res = num1 / num2;
    }

    //NullPointerException
    public static void methodThree(String[] args) {
        String str = null;
    }
    System.out.println("array[7] + res + str.length()");
}

package Task;//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен частному элементов
// двух входящих массивов в той же ячейке.
//Если длины массивов не равны, необходимо как-то оповестить пользователя.
//Важно: При выполнении метода единственное исключение, которое пользователь
// может увидеть - RuntimeException, т.е. ваше.

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] arr1 = getFillArray(10);
        int[] arr2 = getFillArray(10);

        int[] divArray = divArrays(arr1, arr2);
        printArray(divArray);

        int[] wrongArray = divArrays(null, arr2);
    }

    public static int[] divArrays(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) throw new RuntimeException("Массивов не существует ");
        if(arr1.length != arr2.length) throw new RuntimeException("Длинна массивов не равна ");


        int[] resArr = new int[arr1.length];
        for (int i = 0; i < resArr.length; i++) {
            resArr[i] = arr1[i]/arr2[i];
        }
        return resArr;
    }

    public static int[] getFillArray(int length){
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(0,15);
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int number: array){
            System.out.println(number);
        }
    }
}

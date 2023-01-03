package Task;//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен разности элементов
// двух входящих массивов в той же ячейке.
//Если длины массивов не равны, необходимо как-то оповестить пользователя.

import java.util.Random;

    public class Task2 {
        public static void main(String[] args) {
            int[] arr1 = getFillArray(5);
            int[] arr2 = getFillArray(4);

            int[] divArray = divArrays(arr1, arr2);
        }

        public static int[] divArrays(int[] arr1, int[] arr2) {
            if(arr1.length != arr2.length) throw new RuntimeException("Длинна массивов не равна ");
            int[] resArr = new int[arr1.length];
            for (int i = 0; i < resArr.length; i++) {
                resArr[i] = arr1[i] - arr2[i];
            }
            return resArr;
        }

        public static int[] getFillArray(int length){
            int[] array = new int[length];
            Random random = new Random();
            for (int i = 0; i < length; i++) {
                array[i] = random.nextInt(20);
            }
            return array;
        }
    }



import java.util.Arrays;
import java.util.Scanner;

    public class Homework {

        public static void main(String[] args) {
            System.out.println(isSumBetween10And20(5, 15)); // true
            System.out.println(isSumBetween10And20(7, 15)); // false
            System.out.println();
            System.out.println(isPositive(5)); // true
            System.out.println(isPositive(-3)); // false
            System.out.println();
            printString("abcd", 5); // abcdabcdabcdabcdabcd
            System.out.println();
            System.out.println(isLeapYear(2000));
            System.out.println(isLeapYear(1998));
            System.out.println();
            System.out.println(Arrays.toString(createArray(15, 10)));
            System.out.println();
            int[] array1 = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            System.out.println(Arrays.toString(array1));
            System.out.println(Arrays.toString(zeroToOne(array1)));
            System.out.println();
            int[] array2 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            System.out.println(Arrays.toString(array2));
            System.out.println(Arrays.toString(toTwo(array2)));
            System.out.println();
            int[][] matrix = squareMatrixCreate(9, 0);
            printMatrix(matrix);
            printMatrix(oneToDiagonal(matrix));
        }
        /**
         * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
         * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
         */
        private static boolean isSumBetween10And20(int a, int b) {
            if (( a + b >= 10) && (a + b <= 20)) {
                return true;}
            // проверить, что сумма a и b лежит между 10 и 20
            return false;
        }

        private static boolean isPositive(int x) {
            if (x > 0) {
                return true;
            }
            // проверить, что х положительное
            return false;
        }

        private static void printString(String source, int repeat) {
            int i = 0;
            while (i < repeat) {
                System.out.print(source);
                i ++;

            }
            System.out.println();
            // напечатать строку source repeat раз
        }

        private static boolean isLeapYear(int year) {
            if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
                return true;

            }
            return false;
        }

        private static int[] createArray(int len, int initialValue) {
            // должен вернуть массив длины len, каждое значение которого равно initialValue
            if (len > 0) {
                int[] array = new int[len];
                for (int i = 0; i < array.length; i++) {
                    array[i] = initialValue;
                }
                return array;
            }
            return null;
        }

        private static int[] zeroToOne(int[] array) {
            //заменяет 0 на 1, 1 на 0 в массиве;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0){
                    array[i] = 1;
                }
                else{
                    array[i] = 0;
                }
            }
            return array;
        }

        private static int[]toTwo (int[] array) {
            //в массиве числа, меньшие 6, умножает на 2.
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 6) {
                    array[i] = array[i] * 2;
                }
            }
            return array;
        }
        private static int[][] squareMatrixCreate(int size, int number) {
            //создает кваквадратный двумерный целочисленный массив размера size x size, заполненный одинаковыми числами number.
            int[][] matrix = new int[size][size];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    matrix[i][j] = number;
                }
            }
            return matrix;
        }

        private static void printMatrix(int[][] matrix){
            //печать двумерного массива.
            for (int i = 0; i < matrix.length; i++){
                for (int j = 0; j <  matrix[0].length; j++) {
                    System.out.print(" " + matrix[i][j] + " ");
                    }
                System.out.println();
                }
            System.out.println();
        }
        private static int[][] oneToDiagonal(int[][] matrix) {
            //заполнение диагональных элементов двумерного массива единицами:
            for (int i = 0; i < matrix.length; i++){
                for (int j = 0; j <  matrix[0].length; j++) {
                    if (i == j){
                        matrix[i][j] = 1;
                    }
                    if(i == matrix.length - 1 - j){
                        matrix[i][j] = 1;
                    }
                }
            }
        return matrix;
        }


    }

///**
// * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
// * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
// * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
// * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
// * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
// * * Также заполнить элементы побочной диагонали
// */
//    }
//}

package CodeChallenge01;

public class Main{
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {89, 2354, 3546, 23, 10, -923, 823, -12};
        
        int[] reversedArray1 = reverseArray(array1);
        int[] reversedArray2 = reverseArray(array2);

        System.out.print("Array 1 : ");
        printArray(reversedArray1);
        System.out.println("----------------------");
        System.out.print("Array 2 : ");
        printArray(reversedArray2);
    }

    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[array.length - 1 - i] = array[i];
        }
        return reversed;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
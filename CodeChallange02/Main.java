package CodeChallange02;

public class Main {
    public static void main(String[] args) {
        int[] input1 = { 2, 4, 6, -8 };
        int[] output1 = insertShiftArray(input1, 5);
        printArray(output1);

        System.out.println("---------");

        int[] input2 = { 42, 8, 15, 32, -8 };
        int[] output2 = insertShiftArray(input2, 16);
        printArray(output2);
    }

    public static int[] insertShiftArray(int[] arr, int index) {
        int insertToMiddle = arr.length / 2;
        int[] finalArr = new int[arr.length + 1];
        for (int i = 0; i < insertToMiddle; i++) {
            finalArr[i] = arr[i];
        }

        finalArr[insertToMiddle] = index;

        for (int i = insertToMiddle + 1; i < finalArr.length; i++) {
            finalArr[i] = arr[i - 1];
        }

        return finalArr;

    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}

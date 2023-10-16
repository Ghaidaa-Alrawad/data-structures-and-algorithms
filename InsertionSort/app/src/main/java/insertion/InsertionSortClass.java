package InsertionSort.app.src.main.java.insertion;

public class InsertionSortClass {
    public void insertionSort(int[] arr) throws Exception {
        try {
            int length = arr.length;
            for (int i = 1; i < length; ++i) {
                int key = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }
        } catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            int[] arr = {8,4,23,42,16,15};

            InsertionSortClass insertionSort = new InsertionSortClass();

            insertionSort.insertionSort(arr);

            for (int value : arr) {
                System.out.print(value + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

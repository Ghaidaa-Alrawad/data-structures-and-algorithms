package mergeSort.app.src.main.java.merge;

public class MergeSort {

    public static void mergeSort(int[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;

            int[] left = new int[mid];
            int[] right = new int[arr.length - mid];

            System.arraycopy(arr, 0, left, 0, mid);
            System.arraycopy(arr, mid, right, 0, arr.length - mid);

            mergeSort(left);
            mergeSort(right);

            merge(arr, left, right);
        }
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] sampleArray = {8,4,23,42,16,15};

        mergeSort(sampleArray);

        System.out.print("Sorted Array: [");
        for (int i = 0; i < sampleArray.length; i++) {
            System.out.print(sampleArray[i]);
            if (i < sampleArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}

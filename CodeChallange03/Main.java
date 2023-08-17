package CodeChallange03;
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {4, 8, 15, 16, 23, 42};
        int searchKey1 = 15;
        System.out.println(binarySearch(arr1, searchKey1));  // Output: 2

        int[] arr2 = {-131, -82, 0, 27, 42, 68, 179};
        int searchKey2 = 42;
        System.out.println(binarySearch(arr2, searchKey2));  // Output: 4

        int[] arr3 = {11, 22, 33, 44, 55, 66, 77};
        int searchKey3 = 90;
        System.out.println(binarySearch(arr3, searchKey3));  // Output: -1

        int[] arr4 = {1, 2, 3, 5, 6, 7};
        int searchKey4 = 4;
        System.out.println(binarySearch(arr4, searchKey4));  // Output: -1
    }

    public static int binarySearch(int[] arr, int searchKey) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == searchKey) {
                return mid;
            } else if (arr[mid] < searchKey) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

}

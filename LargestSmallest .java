public class LargestSmallest {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 23, 56};

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Largest element = " + largest);
        System.out.println("Smallest element = " + smallest);
    }
}
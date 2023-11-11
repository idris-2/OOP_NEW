class BinarySearch {
    public static boolean BinaryFind(int[] array, int value) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check value in the middle
            if (array[mid] == value) {return true;}

            // If the value is greater, ignore the left half
            if (array[mid] < value) {left = mid + 1;}

            // If the value is smaller, ignore the right half
            else {right = mid - 1;}
        }
        // value not present
        return false;
    }
}       // {-1, 2, 4, 6, 8, 9, 23, 56}

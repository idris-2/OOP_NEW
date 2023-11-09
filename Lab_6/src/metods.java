import java.util.Arrays;

public class metods {       // 1. FIND SMALLEST
    public static int smallest(int[] array){
        int small = array[0];
        for(int i = 0; i <= array.length - 1; i++){
            if(small > array[i]){small = array[i];}
        }
        return small;
    }

public static int indexOfTheSmallest(int[] array){      // 2. INDEX OF SMALLEST
    int small = array[0];
    int index = 0;
        for(int i = 0; i <= array.length - 1; i++){
            if(small > array[i]){small = array[i]; index = i;}
        }
        return index;
}

public static int indexOfTheSmallestStartingFrom(int[] array, int pos) {        // 3. INDEX OF SMALLEST STARTING FROM INDEX
    int small = array[pos];
    int index = pos;
        for(int i = pos; i <= array.length - 1; i++){
            if(small > array[i]){small = array[i]; index = i;}
        }
        return index;
}

public static void swap(int[] array, int index1, int index2) {      // 4. SWAP ELEMENTS
    int elem1 = array[index1];
    int elem2 = array[index2];
    array[index2] = elem1;
    array[index1] = elem2;
    System.out.println(Arrays.toString(array));
}

    public static void main(String[] args) {
        int[] values = {6, 5, 8, 7, 11};
        System.out.println("Smallest: " + smallest(values));
        System.out.println("Index: " + indexOfTheSmallest(values));
        System.out.println("Index: " + indexOfTheSmallestStartingFrom(values, 2));
        swap(values, 1, 3);
    }
}

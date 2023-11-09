import java.util.Arrays;

class BinarySearch {
    public static boolean BinaryFind(int[] array, int value) {
        boolean isVal = false;
        int first = array[0];
        int last = array[array.length - 1];

        if(first == value){isVal = true;}
        else if (last == value){isVal = true;}
        int middle = array[(array.length - 1) / 2];

        while(!isVal){
            if(array[middle] == value){isVal = true;}
            else if(array[middle] > value){middle = middle/2;}
            else if (array[middle] < value){middle = middle + (middle/2);}
        }


        Arrays.toString(array);
        return isVal;
    }
}

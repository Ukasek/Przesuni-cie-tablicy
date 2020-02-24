public class ArrayMove {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        int[] array1 = {5, 6, 7, 8, 9};
        int[] moveArray = moveArray(array, 3);
        int[] moveArray1 = moveArray(array1, 4);
        System.out.println(showArray(array));
        System.out.println(showArray(moveArray));
        System.out.println(showArray1(array1));
        System.out.println(showArray1(moveArray1));
    }

    public static int[] moveArray(int[] array, int N) {

        if (array == null) {
            return null;
        } else if (N >= array.length || N <= 0) {
            return array;
        } else {
            int[] moveArray = new int[array.length];
            for (int i = 0; i < moveArray.length; i++) {
                int a = i + N;
                if (a < array.length) {
                    moveArray[i] = array[a];
                } else {
                    moveArray[i] = array[a - array.length];
                }
            }
            return moveArray;
        }
    }

    public static String showArray(int[] array) {
        return "Tablica nr.1: " + "{" + array[0] + ", " + array[1] +
                ", " + array[2] + ", " + array[3] + ", " + array[4] + "}";
    }

    public static String showArray1(int[] array2) {
        return "Tablica nr.2: " + "{" + array2[0] + ", " + array2[1] +
                ", " + array2[2] + ", " + array2[3] + ", " + array2[4] + "}";
    }

}


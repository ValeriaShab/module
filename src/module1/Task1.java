package module1;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 6, 7, 1, 4, 3, 6, 4};
        sort(array);
        checkIfDifferent(array);
    }


    private static int[] sort(int[] array) {
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }
        return array;
    }

    private static void checkIfDifferent(int[] array) {
        int count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1])
                count++;
        }
        System.out.println(count);
    }
}


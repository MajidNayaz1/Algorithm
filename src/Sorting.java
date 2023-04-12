 class sorting {
    public static void main(String[] args) {

        // bubble sorting

        bubbleSorting bubble1 = new bubbleSorting();
        bubble1.bubbleSort();

        // slection sorting

        slectionSorting slect1 = new slectionSorting();
        slect1.slectSort();
    }
}

class bubbleSorting {

    // the sorting in bubble algorithm in this algorithm if
    // the first elment is bigger than second element it will
    // change the location of them if not it will ignore and
    // copmare the next elemnt this code will sort upward
    void bubbleSort() {
        int arry[] = { 1, 11, 3, 4, 15, 6, 8, 9 };

        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry.length - 1; j++) {
                if (arry[j] > arry[j + 1]) {
                    int swap = arry[j];
                    arry[j] = arry[j + 1];
                    arry[j + 1] = swap;
                }
            }
        }
        System.out.println("this is bubble sorting ");
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i] + "   ");
        }
        System.out.println(" ");

    }
}

class slectionSorting {
    void slectSort() {

        // the other algorithm of sorting is slection:
        // it finds the smalist or largist elment and than finds
        // the second smalist or largist elemnt until end of array
        // this code will sort backward
        System.out.println("this is slection sorting ");
        int[] arr1 = { 12, 3, 45, 56, 67, 4, 3, 56 };
        int smallest = 0;
        for (int i = 0; i < arr1.length; i++) {
            smallest = i;
            for (int j = i + 1; j < arr1.length - 1; j++) {
                if (arr1[smallest] > arr1[j + 1]) {
                    int temp = arr1[smallest];
                    arr1[smallest] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "  ");
        }

    }
}
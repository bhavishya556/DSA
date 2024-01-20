
public class insertionSort {
    public static void main(String[] args) {
        int arr[] = { 9, 3, 55, 1, 0, 2, -9, 4, 2, -99, 1 ,-6554,547654,0754};

        for (int i = 0; i < arr.length; i++) {
            int minimumsPostionIdx = i;
            for (int j = i; j < arr.length; j++) {

                // check miniPostionIdx
                if (arr[j] < arr[minimumsPostionIdx]) {
                    minimumsPostionIdx = j;
                }

            }
            // swap 
            // put minimum number in begning
            int temp = arr[i];
            arr[i] = arr[minimumsPostionIdx];
            arr[minimumsPostionIdx] = temp;
        }

        //print
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " , ");
        }
    }

}

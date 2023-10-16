public class BubbleSortALU {

    // thuat toan sap not bot
    // doi tuong thao tac la Array
    public static void bubbleSort(int[] arr, int n){
        // arr: mang chua cac so nguyen ngau nhien
        // n: kich thuoc cua mang
        int i, j, temp;
        boolean swapped; // dau hieu de nhan biet da sap cac cap so
        for (i = 0; i < n - 1; i++ ){
            swapped = false;
            for (j = 0; j < n- i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    // swap
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            // neu khong co 2 phan tu tro len se bi roi vao vong lap vo han
            // can kiem tra tranh dieu do xay ra
            if(swapped == false){
                break;
            }
        }
    }

    public static void printResult(int[] array){
        System.out.println("Mang sau khi da duoc sap xep theo thua toan Bubble Sort");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}

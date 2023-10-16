public class MergeSortALU {

    private static void mergeSort(int[] arr, int l, int m, int r){
        // l: left - m : middle - r : right
        // can tim kich thuoc cua 2 mang con ban dau duoc tach
        int n1 = m - l + 1;
        int n2 = r - m;
        // mang con thu nhat : arr[l...m]
        // mang con thu 2: arr[m+1 ...r]
        // tao cac mang con ben trai va ben phai
        // khai bao mang rong voi kich thuoc co dinh san
        int[] Left = new int[n1];
        int[] Right = new int[n2];
        // copy du lieu vao 2 mang con trai - phai vua tao
        for (int i = 0; i < n1; i++){
            Left[i] = arr[l+i];
        }
        for (int j = 0; j < n2; j++){
            Right[j] = arr[m+1+j];
        }

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2){
            if(Left[i] <= Right[j]){
                arr[k] = Left[i];
                i++;
            } else {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = Left[i];
            i++;
            k++;
        }
        while (j < n2){
            arr[k] = Right[j];
            j++;
            k++;
        }
    }

    public static void sort(int[] arr, int l, int r){
        if(l < r){
            int m = l + (r - l) / 2;
            // de quy - goi chinh ham do trong ham
            MergeSortALU.sort(arr, l, m);
            MergeSortALU.sort(arr, m + 1, r);

            // goi ham merge da viet
            MergeSortALU.mergeSort(arr, l, m, r);
        }
    }

    public static void printResult(int[] arr){
        System.out.println("Mang sau khi dc sap xep voi thuat toan Merge Sort");
        for(int i : arr) {
            System.out.println(i);
        }
    }
}

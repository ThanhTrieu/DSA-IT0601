public class InsertionSortALU {
    public static void insertionSort(int[] arrNumber){
        // so luong phan tu trong mang
        int count = arrNumber.length;
        for (int i = 1; i < count; i++){
            // cac phan tu dang dc duyet
            int key = arrNumber[i];
            // vi i = 1 : bat dau tu phan tu sau phan tu dau tien
            // j : vi tri cua cac phan tu dung truoc cac phan dang duoc duyet
            int j = i - 1; // 0
            while (j >= 0 && arrNumber[j] > key){
                // neu nhu phan dung dang truoc cac phan tu dang dc duyet ma lon hon thi thuc hien hoan doi vi tri
                arrNumber[j+1] = arrNumber[j];
                j--;
            }
            // tiep doi vi dang duyet thanh vi dung dang sau de tiep tuc thuc thi kiem tra.
            arrNumber[j+1] = key;
        }
    }

    public static void printResult(int[] arr){
        System.out.println("Mang sau khi dc sap xep theo thuat toan Insertion Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

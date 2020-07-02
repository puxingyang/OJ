package OJ;

public class FindKth {

//    public static void main(String[] args){
//        int[] arr={3,1,2,5,4,7,6};
//        int k = 6;
//        findK(arr,k,0,arr.length-1);
//    }
//
//    public static void findK(int[] a,int k,int left,int right){
//        int temp = partition(a,left,right);
//        if(temp == k-1){
//            System.out.println(a[temp]);
//            return ;
//        }
//        else if(temp > k-1){
//            findK(a,k,left,temp-1);
//        } else if(temp < k-1){
//            findK(a,k,temp+1,right);
//        }
//    }
//
//    public static int partition(int[] a,int left,int right){
//        int pivot = a[left];
//        int low = left;
//        int high = right;
//        while(low < high){
//            while(low < high && a[high]<pivot){
//                high--;
//            }
//            swap(a,low,high);
//            while(low < high && a[low]>pivot){
//                low++;
//            }
//            swap(a,high,low);
//        }
//        a[low] = pivot;
//        return low;
//    }
//    public static void swap(int[] t,int a,int b){
//        int temp = t[a];
//        t[a] = t[b];
//        t[b] = temp;
//    }

    public static int findKth(int[] a, int n, int K) {

        return qs(a, 0, a.length - 1, a.length - K);
    }

    static void qsort(int[] a, int left, int right) {
        if (left < right) {
            int p = partition(a, left, right);
            qsort(a, left, p - 1);
            qsort(a, p + 1, right);
        }
    }
    static int qs(int[] a, int left, int right, int k) {
            int p = partition(a, left, right);
            if (p == k) {
                return a[p];
            } else if (p > k) {
                return qs(a, left, p - 1, k);
            } else{
                return qs(a, p + 1, right, k);
        }
    }

    static int partition(int[] a, int left, int right) {
        int p = a[left];
        while (left < right) {
            while (left < right && a[right] >= p) {
                right--;
            }
            if (left < right) {
                a[left++] = a[right];
            }

            while (left < right && a[left] <= p) {
                left++;
            }
            if (left < right) {
                a[right--] = a[left];
            }
        }
        a[left] = p;
        return left;
    }
}

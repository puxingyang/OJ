package OJ;

public class InversePairs {

    public int count(int[] A, int n) {
        // write code here
        if (A == null || n == 0) {
            return 0;
        }
        return mergeSortRecursion(A, 0, n - 1);
    }

    /**
     * 递归实现归并排序
     *
     * @param arr
     * @param l
     * @param r
     * @return 返回数组中的逆序对
     */
    public static int mergeSortRecursion(int[] arr, int l, int r) {
        if (l == r) {   // 当待排序数组长度为1时，递归开始回溯，进行merge操作
            return 0;
        }
        int mid = (l + r) / 2;
        return mergeSortRecursion(arr, l, mid) + mergeSortRecursion(arr, mid + 1, r) + merge(arr, l, mid, r);
    }

    /**
     * 合并两个已排好序的数组s[left...mid]和s[mid+1...right]
     *
     * @param arr
     * @param left
     * @param mid
     * @param right
     * @return 返回合并过程中累加逆序对
     */
    public static int merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];    // 辅助存储空间 O(n)
        int index = 0;
        int i = left;
        int j = mid + 1;
        int inverseNum = 0;       // 新增，用来累加数组逆序对
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[index++] = arr[i++];
            } else {
                // 当前一个数组元素大于后一个数组元素时，累加逆序对
                // s[i] > s[j] -> s[i]...s[mid] > s[j]
                inverseNum += (mid - i + 1);
                temp[index++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[index++] = arr[i++];
        }
        while (j <= right) {
            temp[index++] = arr[j++];
        }
        for (int k = 0; k < temp.length; k++) {
            arr[left++] = temp[k];
        }
        return inverseNum;
    }
}

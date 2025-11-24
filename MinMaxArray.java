public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {3,2,5,3,2,1,7,8};
        int max = arr[0], min = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Min" + min + "Max" + max );
    }
}
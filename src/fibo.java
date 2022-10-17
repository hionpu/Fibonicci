import java.util.*;


public class fibo {
    public static int fibonacci(int num) {
        // TODO:
        int[] arr = new int[num+1];
        arr[0] = 0; arr[1] = 1;
        return generator(num, arr);

    }
    public static int generator(int num, int[] arr) {
        if (arr[num] != 0 || num == 0 || num == 1) return arr[num];

        arr[num] = generator(num-1, arr) + arr[num-2];
        System.out.println(Arrays.toString(arr));
        return arr[num];
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(5));

    }
}

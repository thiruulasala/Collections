import java.util.Arrays;

public class MinAbsolute
{
    static int findMinDiff(int[] arr, int n)
    {
        Arrays.sort(arr);
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++)
            if (arr[i + 1] - arr[i] < diff) {
                diff = arr[i + 1] - arr[i];
            }
        return diff;
    }

    public static void main(String[] args)
    {
        int arr[] = new int[] { 1,2,3,4,5 };
        System.out.println("Minimum difference is " + findMinDiff(arr, arr.length));
    }
}

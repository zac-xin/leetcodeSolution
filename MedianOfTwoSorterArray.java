/**
 * Get Median of two sorted array.
 * The size of the two arrays are same
 */
package others;

public class MedianOfTwoSortedArray {
    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4, 5 };
        int b[] = { 6, 7, 8, 9, 10 };
        System.out.println(getMedianDriver(a, b));
    }

    public static double getMedianDriver(int[] a, int[] b) {
        return getMedian(a, 0, a.length - 1, b, a.length);
    }

    // left and right indicates the portion we are searching
    public static double getMedian(int a[], int left, int right, int b[], int n) {
        if (left > right) {
            return getMedian(b, 0, b.length - 1, a, n);
        }

        /*
         * a[i] is greater than i elements in a[] and b[j] is greater than n - i - 1
         * elements in b[]
         * so a[i] >= n elements in the whole array
         * n = i + (n - i - 1)+ 1. the last 1 is b[j] since a[i] >= b[j]. 
         * for median m1, m2, m1 is greater than n - 1 elements.
         *  m2 is greater than m2 elements
         * eg n = 4, there are 8 elements in
         * total x x x m1 m2 x x x. so a[i] must be m2, now we need to find m1
         * from a[i - 1] and b[j]
         */
        int i = left + (right - left) / 2;
        int j = n - i - 1;

        /*
         * i could be be (n-1) when left = right = n - 1
         * this is the max of i
         * so min of j is n - (n-1) - 1 = 1;
         * Thus we don't need to worry about j == 0;
         * 
         * i might be zero, so we need to consider i == 0; and j == n-1
         */

        if (a[i] >= b[j] && (j == n - 1 || a[i] <= b[j + 1])) {
            if (i == 0 || b[j] > a[i - 1]) {
                return (a[i] + b[j]) / 2.0;
            } else {
                return (a[i] + a[i - 1]) / 2.0;
            }
        } else if (a[i] > b[j] && (j == n - 1 || a[i] > b[j] + 1)) {
            /*
             * since j = n - i - 1, if j = n - 1, the i = 0; so we call
             * getMedian(a, 0, -1, b, n), the we begin search in b[]
             */
            return getMedian(a, left, i - 1, b, n);
        } else {
            return getMedian(a, i + 1, right, b, n);
        }
    }
}

public class Array16 {
    // Stock Buy And Sell
    /*
     * ou are given an array prices where prices[i] is the price of a given stock on
     * the ith day.
     * 
     * You want to maximize your profit by choosing a single day to buy one stock
     * and choosing a different day in the future to sell that stock.
     * 
     * Return the maximum profit you can achieve from this transaction. If you
     * cannot achieve any profit, return 0.
     */
    public static int F(int[] a) {
        int min = Integer.MAX_VALUE;
        int maxPro = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            maxPro = Math.max(maxPro, a[i] - min);
        }
        return maxPro;
    }
}

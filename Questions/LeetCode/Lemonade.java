class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveCount = 0;
        int tenCount = 0;
        
        for (int bill : bills) {
            if (bill == 5) { // No need of giving change
                fiveCount++;
            } else if (bill == 10) {
                if (fiveCount == 0) {
                    return false;
                }
                fiveCount--;
                tenCount++;
            } else if (bill == 20) {
                if (tenCount > 0 && fiveCount > 0) {
                    tenCount--;
                    fiveCount--;
                } else if (fiveCount >= 3) {
                    fiveCount -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] bills1 = {5, 5, 5, 10, 20};
        System.out.println(solution.lemonadeChange(bills1)); // Output: true

        int[] bills2 = {5, 5, 10, 10, 20};
        System.out.println(solution.lemonadeChange(bills2)); // Output: false

        int[] bills3 = {5, 5, 5, 5, 10, 10, 10, 20, 50};
        System.out.println(solution.lemonadeChange(bills3)); // Output: false

        int[] bills4 = {5, 5, 5, 5, 10, 10, 50};
        System.out.println(solution.lemonadeChange(bills4)); // Output: false
    }
}

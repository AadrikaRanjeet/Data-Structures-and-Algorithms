
class Solution
{ 
    static void insertAtBottom(Stack<Integer> s, int item) {
        if (s.isEmpty()) {
            s.push(item);
        } else {
            int temp = s.pop();
            insertAtBottom(s, item);
            s.push(temp);
        }
    }
    
    static void reverse(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int temp = s.pop();
            reverse(s);
            insertAtBottom(s, temp);
        }
    }
    
}
import java.util.*;

class Main {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.add("R");
        list.add("Aadrika");
        list.add("Ro");
        list.addLast("1");
        
        System.out.println("Size before removal: " + list.size());
        System.out.println("List before removal: " + list);

        // Remove the first element
        list.removeFirst();

        // Remove the last element
        list.removeLast();
        list.remove(2);
        System.out.println("Size after removal: " + list.size());
        System.out.println("List after removal: " + list);

        // Print elements using iteration
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
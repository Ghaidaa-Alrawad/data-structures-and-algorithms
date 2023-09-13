package StackAndQueue.lib.src.main.java.stackqueue.queue;

public class DuckDuckGoose {
    public static String duckDuckGoose(String[] players, int k) {
        Queue<String> queue = new Queue<>();
        for (String player : players){
            queue.enqueue(player);
        }

        int count = players.length;

        while (count > 1){
            for (int i = 1; i < k; i++){
                String dequeue = queue.dequeue();
                queue.enqueue(dequeue);
            }

            queue.dequeue();
            count--;
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        String[] arr1 = {"A", "B", "C", "D", "E"};
        int k = 3;
        System.out.println("first array " + duckDuckGoose(arr1,k)); // D

        String[] arr2 = {"F", "G", "H", "I"};
        int k2 = 3;
        System.out.println("Secound "+duckDuckGoose(arr2,k2)); // F
    }

}

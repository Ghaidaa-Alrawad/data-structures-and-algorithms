# DuckDuckGoose (Challenge 14) 

---

## Description of the challenge

The challenge is to implement a variation of the "Duck, Duck, Goose" game using a queue. 
In this game, you have an array of players, and a number 'k'. Players sit in a circle, and you start counting from the first player. When you reach 'k', the player is "Goose," and you remove them from the circle. This process repeats until only one player is left, who is the winner. The function duckDuckGoose takes an array of players and 'k' as input and returns the name of the last player remaining.

---

## Whiteboard

![](img/CC14.jpg)

---

## Approach & Efficiency

- The code uses a queue to simulate the circle of players.
- It enqueues all players into the queue initially.
- Then, it repeatedly dequeues and enqueues players in a loop until only one player remains.
- The time complexity of this approach is O(N*K), where N is the number of players, and K is the value of 'k'.

---

## Solution

### Output

![](img/duckGooseOutput.png)

#### code

[DuckDuckGooseCode](./lib/src/main/java/stackqueue/queue/DuckDuckGoose.java)


```java
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
}
```

# Repeated Word Finder

The problem is to find the first word that occurs more than once in a given string.

---

## Whiteboard

![CC2.jpg](img%2FCC2.jpg)

---

## Approach & Efficiency

The approach is to use a HashMap to efficiently track word occurrences. The algorithm has linear time complexity as it iterates through the words once. The space complexity is also linear, considering the worst case where all words are unique. The use of a HashMap allows for constant time lookups, making the algorithm efficient for finding repeated words.

- Time Complexity: O(N), where N is the number of words in the input string.
- Space Complexity: O(N), where N is the number of unique words in the input string.
#  Fuzz Buzz Tree (Challenge 18)

---

## Description of the challenge

The challenge is to transform a given tree of integers into a new tree of strings following the Fizz Buzz rules. We need to implement a method that recursively traverses the input tree, applies the Fizz Buzz logic to each node, and constructs a new tree of strings with the transformed values.

---

## Whiteboard

![](img/CC%2018.jpg)

---

## Approach & Efficiency

The approach taken is to recursively traverse the input binary tree using a depth-first search (DFS) approach. 
At each node, the Fizz Buzz logic is applied to determine the new value for the node. 
A new tree is constructed with the transformed values, and the process continues until all nodes are processed. 
The algorithm has a time complexity of O(n) and a space complexity of O(n) due to the recursion stack.

---

## Output

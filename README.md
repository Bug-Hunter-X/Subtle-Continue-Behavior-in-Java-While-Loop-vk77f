# Uncommon Java Bug: Subtle Continue Behavior in While Loop

This repository demonstrates a subtle bug related to the `continue` statement within a `while` loop in Java.  The bug highlights an often overlooked aspect of how `continue` interacts with loop increments and conditional statements.

The primary issue lies in the placement of the increment statement (`i++`) and how it affects the conditional check. The `continue` statement skips the remaining code within the loop body, but the increment still occurs *after* the `continue` statement.

This example might be counter-intuitive, especially to newer programmers, because it isn't immediately clear that the loop doesn't execute the last println statement when `i` is equal to `5` due to the `continue` statement skipping to the next iteration before that statement is reached.

## How to Reproduce
1. Compile and run `UncommonBug.java`.
2. Observe the output. Notice the missing "This line will not be executed when i = 5" message when `i` is 5.
3. Compare the output to the expected behavior (all numbers 0-9 with the string printed after each).

## Solution
The solution involves understanding how `continue` impacts increment operations within a loop and is demonstrated in `UncommonBugSolution.java`.
## Arrays in Java

Array can be treated like any other object instance in Java!

### Linear Search or Sequential search

This search is called **linear** or **sequential** because you are stepping through the elements one after another.

### Interval Searching (binary search)

You split each section up, testing the values at the boundaries, and based on that, split again into smaller sections, narrowing the number of elements to test each time.

This type of searching in software is called **interval searching**.

One of the most common interval searching is **binary search**. In this search, **intervals** are continually **split into two**, hence the word binary.

The static, binary search is in `Arrays` class.

We can use this method to test if the value is already in our array, but there are some **important** things to remember:
- Array ahs to be **sorted**;
- If there are duplicate values in the array, there is no guarantee which one it will match on;
- Elements must be comparable.

This method returns:
- **The position of a match**, if found,
- It returns **-1** when **no match** found,
- Positive number **may not be the position of the first match**,
- If an array has duplicate values, and we need to find the first element, another method should be used.

### Arrays Recap

- An array is a data structure that allows us to store multiple values of the same type in a single variable.
- The default values of a numeric array element are set to zero.
- Arrays are zero-indexed. `const arr = [5, 7, 8];` That means that an element with value of 5 is at index 0, `arr[0]` is `5`.
- If we try to access an index that is out of range, Java will give us an **ArrayIndexOutOfBoundsException**, which indicates that the index is out of range, in other words, out of bounds.
- Array access operator `[]` e.g. `arr[0]`.

```java
import java.util.Arrays;

int[] arr = new int[5]; // It has 5 elements and index range from 0 to 4;
// or we can 
String str = Arrays.toString(arr);

// -> System.out.print(str); // [0, 0, 0, 0, 0];
```

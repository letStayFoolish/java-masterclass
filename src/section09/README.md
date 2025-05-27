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
- If array has duplicate values and we need to find first element, other method should be used.

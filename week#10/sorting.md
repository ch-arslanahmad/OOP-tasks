# Sorting
In programming & specifically DSA, it is one of the basic & essential topics of DSA.

Sorting is the process of arranging data in a particular order.
Sorting can be:
- Ascending (0 --> n)
- Decending (n --> n)
- Alphabetical sorting (a --> z or vice versa)

For example, an array of
`{1000, -7, 300, 7, 100, -1}`
after sorting will be: 
`{-7, -1, 100, 300, 1000}`

There are many types of sorting techniques, some popular are:
- Bubble Sort
- Selection Sort

## 1. Bubble Sort
So, in Bubble sort, you compare each value to the other and swap values, until the array becomes sorted.
In case of ascending sort, which is small → large value, so you basically,
Compare left value to right and whichever is smaller is moved to left.
In programming of sorting, it is said that, it takes
N-1 iterations of loop where n means the size of array.
Example:
Size = 5, so total iterations is = 4;

|5|10|-100|7|5|
|--|--|--|-|--|


`{5,10,-100,7,5}`

Lets do this manually before pushing to code,
During **1st iteration**
- `5 < 10` – no swap
- `10 < -100` swap
- `10 < 7;` swap
- `10 < 5;` swap

Now we have,
`{5,-100,7, 5, 10}`

**2nd Iteration**

- `5 < -100` - swap
- `5 < 7` - no swap
- `7 < 5` swap
- `7 < 10` - no swap
- `{-100, 5,5, 7, 10}`

Now further, you do not require more iterations, but for a program you must, because it does not know what even is sorted.

So initial pseudo code:

```

for(0 to n-1 iterations)
for(0 to n-1 iterations) {
	if(arr[i] > arr[i+1]) {
        Replace values
    }
}
```
For starters, you can start/work with this which is not wrong, It works, i mean but it can be optimized:

**DSA** is the subject of finding patterns to solve problems, more efficiently.

So, one recurring pattern in bubble sort is that after every iteration, the last value becomes sorted/locked, so we do not need to compare them again. So you can say,

```
for(0 to n-1 iterations)
for(0 to n-i-1 iterations) {
	if(arr[i] > arr[i+1]) {
        Replace values
    }
}
```

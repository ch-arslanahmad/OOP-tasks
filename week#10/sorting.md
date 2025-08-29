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

Now you know about the most basic sorting method, but bubble sorting is by far the most inefficient as you have to go through each and every value.

## 2. Selection Sorting
Here, more efficient sorting method comes from, **Selection Sorting**:

In this method, you simply 'select' a value and move it by swapping it.
You select either a min or max value.

Suppose using  `min value`, you select it then put it in the first index, then try again but exluding the first index because its sorted already, then repeat this until whole array becomes sorted.

Like for example, in this array:
`{5,10,-100,7,5}`
We want to sort it in ascending order.

**1st Iteration**  
We select the min which is `-100` which swaps with `5`, so updated array,
```
{-100,10,5,7,5}
```

**2nd Iteration**

We select the min again, its, `5`, it swaps with `10`, we get,
```
{-100,5, 10 ,7,5}
```

**3rd Iteration**
Now selects the `5` from the end and swaps with `10`. we get,
```
{-100,5,5,7,10}
```

Now its completely sorted.


Now moving to pseudo-code,

```

a[n] = {n,n,n,n,n}; // example

for (i to n-1 iterations) {
    min = i // suppose to do comparison
    for(i+1 to n-1) {
        if(a[min] > a[i]) {
            min = i; // telling the index of the minimum value
        }

// now replacing the minimum value with the i value

    }
}
```

You can also do it with max, but will have to flip the logic, as max will swap with the last element.


# Binary Search using a Sorted Array

#### In Binary Search, an array is divided into two halves, which means that the desired element maybe present either in the 1st half or in the 2nd half.
#### However, Binary Search can be applied only when the array elements are SORTED(ascending/descending order).
#### It always compares the element to be searched with the middle element of the sorted array. If there is a match it returns the element's index. If the search key is less than the middle element, repeat searching on the left half, otherwise, search the right half.


Time Complexity:

                O(1)     - (Best-Case)
                O(log n) - (Worst-Case & Average-Case)


Space Complexity: 
    
              O(1)     - [iterative method]  (Best-Case)
              O(log n) - [recursive method]
          


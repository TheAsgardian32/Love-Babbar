Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which 
is a contiguous subarray.

  
  
-Initialize maxend=1sst elem,res=1st elem
-traverse a loop from 2nd elemnt to the end of array
-for every traversal, we have two options,
  -we can either consider the element(arr[i]) or sum of that and previous element(arr[i]+maxend),,But the max of both
-then we store the best in all cases in the res variable.(so far max);

class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n)
    {
        int maxend=arr[0];
        int res=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            maxend=Math.max(arr[i],maxend+arr[i]);
            res=Math.max(res,maxend);
        }
        return res;
    }
    
}

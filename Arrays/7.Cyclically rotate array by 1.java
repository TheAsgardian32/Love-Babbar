Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4
  
-Firstly reverse the array from 0 to last before elem
-Then Reverse the whole array


class Compute {
    
    public void rotate(int arr[], int n)
    {
        rev(arr,0,n-1);
        rev(arr,0,n);
    }
    public static void rev(int[]arr,int low,int high)
    {
        while(low<high-1)
        {
            int temp=arr[low];
            arr[low]=arr[high-1];
            arr[high-1]=temp;
            low++;
            high--;
        }
    }
}

/*
package org.example;

public class Main {
    public static int findMin(List<Integer> arr, int low,
                              int high)
    {
        // If the array is not rotated
        if (arr.get(low) < arr.get(high)) {
            return arr.get(low);
        }
        int ans = 1000000000;
        // Binary search
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid)== arr.get(low) && arr.get(mid) == arr.get(high)) {
                ans = Math.min(ans,arr.get(mid));
                low++;
                high--;
            }
            // If the left half is sorted, the minimum
            // element must be in the right half
            else if (arr.get(mid) > arr.get(high)) {
                low = mid + 1;
            }

            // If the right half is sorted, the minimum
            // element must be in the left half
            else {
                ans = Math.min(ans,arr.get(mid));
                high = mid - 1;
            }
        }

        // If no minimum element is found, return -1
        return ans;
    }

    // Driver program to test above functions
    public static void main(String[] args)
    {
        List<Integer> arr = new ArrayList<>(
                Arrays.asList(5, 6, 1, 2, 3, 4));
        int N = arr.size();
        System.out.println("The minimum element is "
                + findMin(arr, 0, N - 1));
    }
}
*/

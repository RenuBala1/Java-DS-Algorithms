package warmup;

public class MissingNumberInArray {

	// Method1 1 - Integer overflow can happen as its summing up if n is big
	// time complexity - O(n), space complexity O(1)
	static int checkMissingNumber(int[] arr, int n)
	{
		int sumOfN = ((n+1)*(n+2))/2;

		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}		
		return sumOfN-sum;

	}

	// Method2 - Sort and Traverse if value at arr[index] != index+1 
	// then index+1 is missing number else n
	static int getMissingNum(int[] arr, int n) {

		int i=0;
		while (i < n) {
			// as array is of 1 based indexing so the
			// correct position or index number of each
			// element is element-1 i.e. 1 will be at 0th
			// index similarly 2 correct index will 1 so
			// on...
			int correctpos = arr[i] - 1;
			if (arr[i] < n && arr[i] != arr[correctpos]) {
				// if array element should be lesser than
				// size and array element should not be at
				// its correct position then only swap with
				// its correct position or index value

				swap(arr, i, correctpos);
			}
			else {
				// if element is at its correct position
				// just increment i and check for remaining
				// array elements
				i++;
			}
		}
		for(int j : arr)
		{
			System.out.println("Array after sorting : " + j);
		}
		// check for missing element by comparing elements
		// with their index values
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != index + 1) {
				return index + 1;
			}
		}
		return arr.length;

	}

	static void swap(int[] arr, int i, int correctpos)
	{
		// swap elements with their correct indexes
		System.out.println("Swapping :" + arr[i] + "with " + arr[correctpos]);
		int temp = arr[i];
		arr[i] = arr[correctpos];
		arr[correctpos] = temp;
	}

	public static void main(String[] args) {
		int[] arr = {5,3,4,2};
		int length = arr.length;
		// Call method1
		System.out.println("1st method: Missing number in array : " + checkMissingNumber(arr,length));

		// Call method2
		System.out.println("2nd Method: Missing number in array : " + getMissingNum(arr,length));

	}

}

package warmup;

public class RotateArray {

	public static void main(String[] args) {


		int[] arr = {1,2,3,4,5,6,7};
		int rotate=2; // rotate to left by 2
		int length=arr.length;

		rotateArray(arr,length,rotate);

		System.out.print("Array after rotation : { ");
		for(int i:arr)
		{
			System.out.print(i+",");
		}

		System.out.print(" }");

	}

	private static void rotateArray(int[] arr, int length, int rotate) {
		reverseArray(arr,0,rotate-1);
		reverseArray(arr,rotate,length-1);
		reverseArray(arr,0,length-1);

	}

	private static void reverseArray(int[] arr, int start, int end) {
		for(int rev=start; rev<end;rev++, end--)
		{
			int temp=arr[rev];
			arr[rev]=arr[end];
			arr[end]=temp;

		}

	}

}

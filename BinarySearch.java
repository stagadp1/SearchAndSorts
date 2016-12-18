
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(bSearchRec(arr,0,10, 10));
		System.out.println(bSearch(arr, 10));
	}
	
	public static int bSearch(int[] arr, int k)
	{
		int low,mid,high;
		
		low = 0;
		high = arr.length-1;
		
		while(low<= high)
		{
			mid = (low + high)/2;
			if(arr[mid] == k)
				return mid;
			else if(arr[mid] < k)
				low = mid + 1;
			else
				high = mid -1 ;
		}
		
		return -1;
	}

	public static int bSearchRec(int[] arr, int low, int high, int data)
	{
		int mid = low+ (high - low)/2;
		
		if(arr[mid] == data)
			return mid;
		else if(arr[mid] < data)
			return bSearchRec(arr, mid+1, high, data);
		else if(arr[mid] > data)
			return bSearchRec(arr, low, mid-1, data);
		else
		return -1;
	}
}

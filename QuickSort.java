import java.util.Random;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {34,4,546,4,3};
		
		quick(arr,0,arr.length-1);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static void quick(int[] arr,int low, int high)
	{
		int pivot;
		if(high>low)
		{
			
			pivot = partition(arr,low,high);
			quick(arr,low,pivot-1);
			quick(arr,pivot+1,high);
		}
	}
	
	public static int partition(int[] arr,int low, int high)
	{
		int left = low;
		int right = high;
		Random rand = new Random();
		//int pivot_item = low + rand.nextInt(right - left + 1);
		
		int pivot_item = arr[low];
		
		while(left < right)
		{
			while(arr[left] <= pivot_item)
				left++;
			while(arr[right] > pivot_item)
				right--;
			if(left < right)
				swap(arr,left,right);
		}
		//right is the final position of pivot
		arr[low] = arr[right];
		arr[right]=pivot_item;
		return right;
		
	}
	
	public static void swap(int[] arr,int left, int right)
	{
		int temp = 0;
		temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
	
}

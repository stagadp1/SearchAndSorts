
public class ShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {12,34,57,34,56,78,8};
		int[] arr1 = {1,2,3,4,5,5,5,5,5,6,0};
		ShellSort1(arr1);
	}
	
	public static void SSort(int[] arr)
	{
		int i, j, k;
		int n = arr.length;
		for(i = 1; i < n; i++)
		{
			k = arr[i];
			for(j=i-1; j >= 0 && arr[j] > k; j--)
			{
				arr[j+1]  = arr[j];
			}
			arr[j+1] = k;
		}
		System.out.println("Sorted list \n");
		for(i = 0; i < n ; i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static void ShellSort1(int[] arr)
	{
		int i, j, k;
		
		int n = arr.length;
		int incr = n/2;
		while(incr >= 1)
		{
		for(i = incr; i < n; i++)
		{
			k = arr[i];
			for(j=i-incr; j >= 0 && arr[j] > k; j = j - incr)
			{
				arr[j+incr]  = arr[j];
			}
			arr[j+incr] = k;
		}
		incr = incr - 2;
		}
		System.out.println("Sorted list \n");
		for(i = 0; i < n ; i++)
		{
			System.out.println(arr[i]);
		}
	}
}

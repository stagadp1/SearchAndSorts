
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {34,4,546,4,3};
		mergeSort(arr);
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}


	public static void mergeSort(int[] inputArray) {
        int size = inputArray.length;
        if (size < 2)
            return;
        int mid = size / 2;
        int leftSize = mid;
        int rightSize = size - mid;
        int[] left = new int[leftSize];
        int[] right = new int[rightSize];
        for (int i = 0; i < mid; i++) {
            left[i] = inputArray[i];

        }
        for (int i = mid; i < size; i++) 
        {
            right[i - mid] = inputArray[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left, right, inputArray);
    }

    public static void merge(int[] left, int[] right, int[] arr) {
        int leftSize = left.length;
        int rightSize = right.length;
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) 
        {
            if (left[i] <= right[j]) 
            {
                arr[k++] = left[i++];
               
            } else 
            {
                arr[k++] = right[j++];
               
            }
        }
        while (i < leftSize) 
        {
            arr[k++] = left[i++];   
        }
        while (j < rightSize) 
        {
            arr[k++] = right[j++];
            
        }
    }
}









//public static void Merge(int[] arr,int low,int up)
//{
//	int mid;
//	int n = arr.length;
//	int[] temp = new int[arr.length];
//	if(low<up)
//	{
//		mid = (low+up)/2;
//		Merge(arr,low,mid);
//		Merge(arr,mid+1,up);
//		
//		Msort(arr,temp,low,mid,mid+1,up);
//		
//		copy(arr,temp,low,up);
//	}
//}
//
//public static void Msort(int[] arr, int[] temp, int low1, int up1,int low2, int up2)
//{
//	int i = low1;
//	int j = low2;
//	int k = low1;
//	
//	while(i<=up1 && j<= up2)
//	{
//		if(arr[i] <= arr[j])
//			temp[k++] = arr[i++];
//		else
//			temp[k++] = arr[j++];
//		
//	}
//	
//	while(i<=up1)
//		temp[k++] = arr[i++];
//	while(j<=up2)
//		temp[k++] = arr[j++];
//}
//
//public static void copy(int[] arr, int[] temp, int low, int up)
//{
//	int i;
//	for(i=low;i<=up;i++)
//	{
//		arr[i] = temp[i];
//	}
//		
//}







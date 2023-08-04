package Sorting;
import java.util.*;
public class Quick_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;arr[i++]=sc.nextInt());
        quickSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    static int[] quickSort(int[] arr,int left,int right)
    {
//        if(left>=right)
//        {
//            return;
//        }
        int start=left;
        int end=right;
        int mid=(start+end)/2;
        int pivot=arr[mid];
        while(start<=end)
        {
            while(arr[end]>pivot)
            {
                end--;
            }
            while(arr[start]<pivot)
            {
                start++;
            }
           // if(start<=end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            // }
        }
        return arr;
    }
}

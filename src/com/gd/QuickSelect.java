package com.gd;

public class QuickSelect {
    public static int partition(Integer[] arr, int l, int r)
    {
        int x = arr[r], i=1;
        for (int j=1;j<=r-1;j++) {
            if (arr[j] <= x) {
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] =temp;
        return  i;
    }
    public  static int kthSmallest(Integer[] arr, int l,int r,int k)
    {
        if (k > 0 && k <=r-l+1)
        {
            int pos = partition(arr,l,r);
            if (pos-1==k-1)
                return arr[pos];
            if(pos-1 > k-1)
                return kthSmallest(arr,l,pos-1,k);
            return kthSmallest(arr,pos+1,l,k);
        }
        return  Integer.MAX_VALUE;
    }
    public static void main(String[] args)
    {
        Integer arr[] = new Integer[] {12,3,5,7,4,19,26};
        int k=3;
        System.out.print(kthSmallest(arr,0,arr.length-1,k));
    }
    }

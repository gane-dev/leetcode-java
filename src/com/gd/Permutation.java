package  com.gd;
public class Permutation
{
    public  static  void main(String[] args)
    {
        int[] input =new int[4];
        input[0] = 1;
        input[1] = 2;
        input[2] = 3;
        input[3] = 4;
        int n =4;
        Permutation permute = new Permutation();
        permute.permute(input,0,n-1);
    }

    private  void permute (int[] arr, int l, int r)
    {
        if (l==r)
        {
            for (int z : arr) {
                System.out.print(z);
            }
            System.out.println("\n");
        }
        else {
            for(int i=l;i<=r;i++)
            {
                arr = swap(arr,l,i);
                permute(arr,l+1,r);
               arr = swap(arr,l,i);

            }
        }
    }

    public int[] swap(int[] arr, int k,int j)
    {
        int temp=arr[k];
        arr[k] = arr[j];
        arr[j]= temp;
return arr;
    }
}

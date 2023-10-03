class LinearSearch
{
    public static void main(String[] args) {
        int[] a = {9,6,4,0,1,6,6,9};
        System.out.println(search(a,9));
    }

    public static int search(int[] a, int key)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==key)
                return i;
        }
        return -1;
    }
}
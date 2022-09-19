class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1;
    for(int i=0;i<nums.length-1;i++)
    {
        if(nums[i]!=nums[i+1])
        {
            nums[j]=nums[i+1];
            j++;
        }
    }
    return j;
    }
  public static void main(String[] args)
  {
    Scanner sc = new Sacnner(System.in);
    int n=sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    int b=removeDuplicates(arr);
    for(int i=0;i<b;i++)
    {
      System.out.print(arr[i]);
    }
}

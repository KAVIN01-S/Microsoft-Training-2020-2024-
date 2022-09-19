class Solution {
    public int[] twoSum(int[] numbers, int target) {
            int len = numbers.length;
        int[] result = new int[2] ;
        int number1 = 0;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            number1 = numbers[i];
            for(int j = i+1; j < len; j++)
            {
                sum = number1+numbers[j];       
                if(sum == target)
                {
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
      Scanner sc = new Sacnner(System.in);
      int a=sc.nextInt();
      int target = sc.nextInt();
      int[] num = new int[a];
      for(int i=0;i<a;i++)
      {
        num[i]=sc.nextInt();
      }
      System.out.println(twoSum(num,target);
}

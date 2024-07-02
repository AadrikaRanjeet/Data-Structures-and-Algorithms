public class SortedArray {
    public boolean check(int[] nums) {
        int n=nums.length;
        int point=-1;
        if(n==0||n==1)
        {
           return true;
        }
        for(int i=0;i<n-1;i++)
        {
           //finding the distortion point
           if(nums[i]>nums[i+1])
           {
                point=i;
               break;
           }
        }
        if(point==-1)
        {
           return true;
        }
        for(int i=0;i<point;i++)
        {
           if(nums[i]>nums[i+1])
           {
               return false;
           }

        }
        for(int i=point+1;i<n-1;i++)
        {
           if(nums[i]>nums[i+1])
           {
               return false;
           }
        }
        if(nums[n-1]>nums[0])
        {
           return false;
        }
        return true;
   }
}

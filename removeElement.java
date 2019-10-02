class Solution {
    public int removeElement(int[] nums, int val) {
        int z=0;
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == val)
            {
                nums[i] = 0;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                c++;
            }
        }
        return c;
    }
public static void main(String args[])
{
int nums[] = {3,2,2,3};
int value = 3;
removeElement(nums,value);
}
}

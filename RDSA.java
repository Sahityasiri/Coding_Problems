// RDSA : Remove Duplicates from Sorted Array
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class RDSA{
    public int removeDuplicates(int[] nums) {
        int x = nums.length;
        int i,j,k,z=0,m=0;
        for( i =0; i< x;i++)
        {
            k = nums[i];
             if(nums[i]!=  2147483647){
        for( j = i+1; j < x; j++ ){
           
            if(k == nums[j]) {
               nums[j] =  2147483647;
           }
            }
        }
        }
        for(int y =0;y<x;y++){
            if(nums[y]!= 2147483647){
                nums[z]= nums[y];
                z++;
                m++;
            }
        }
        
        return m;
    }
}
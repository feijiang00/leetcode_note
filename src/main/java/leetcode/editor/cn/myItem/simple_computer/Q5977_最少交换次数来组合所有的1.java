package leetcode.editor.cn.myItem.simple_computer;

import javax.xml.transform.Source;
import java.util.stream.StreamSupport;

/**
 * @date 2022/1/9 10:53
 */
public class Q5977_最少交换次数来组合所有的1 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minSwaps(new int[]{0,1,1,1,0,0,1,1,0}));
    }
    static class Solution {
        public int minSwaps(int[] nums) {
            int len = nums.length;
            int p=0,q=len-1,flag=0;
            int swap=0;
            while (p<=q){
                if(nums[p] ==1)
                    flag=1;
                if(nums[p]==0&&flag==1){
                    //找q指针去补
                    while (nums[q]==0){
                        q--;
                    }
                    //假装移动
                    q--;
                    swap++;
                }
                p++;
            }
            return swap;
        }
        public void swap(int[] nums,int a,int b){
            int tmp = nums[a];
            nums[a] = nums[b];
            nums[b] = nums[a];
        }
    }
}

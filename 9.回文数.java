/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        else{
            int s,y=0;
            s=x;
            while(s>0){
                y=s%10+y*10;
                s=s/10;
            }
            if(y==x){
                return true;
            }
            else{
                return false;
            }
        }
    }
}
// @lc code=end


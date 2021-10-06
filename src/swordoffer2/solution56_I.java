package swordoffer2;

/*
    如果除了一个数字以外，其他数字都出现了两次，那么如何找到出现一次的数字？
    对所有数字进行异或操作，剩下的那个就是只出现一次的数字
    现在有两个只出现了一次的数字，这两个数字必定不相同，设这两个数为a，b
    对数组所有元素进行异或操作，结果就是a^b
    找到a^b倒数第一位不为0的位数
    根据(nums[i]&t)==0将数组分开，由于&操作，相同的数字被分到了同一组，a，b分到了不同的组
 */
public class solution56_I {
    public int[] singleNumbers(int[] nums) {
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
            res=res^nums[i];
        }
        int t=1;
        while((t&res)==0){
            t=t<<1;
        }
        int a=0,b=0;
        for (int i = 0; i < nums.length; i++) {
            if((t&nums[i])==0){
                a=a^nums[i];
            }else {
                b=b^nums[i];
            }
        }
        return new int[]{a,b};
    }
}

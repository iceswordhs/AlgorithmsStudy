package swordoffer1;

public class solution56_II {
//    public int singleNumber(int[] nums) {
//        Map<Integer,Integer> map=new HashMap<>();
//        for(int i=0;i<nums.length;i++){
//            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//        }
//        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
//            if(entry.getValue()==1){
//                return entry.getKey();
//            }
//        }
//        return -1;
//    }

    public int singleNumber(int[] nums) {//用状态机的方法
        int a = 0, b = 0;
        for (int c : nums) {
            //防止a的值被修改，在计算b的时候有影响，
            //这里在b计算完之后再对a赋值
            int tempa = ~a & b & c | a & ~b & ~c;
            b = ~a & ~b & c | ~a & b & ~c;
            a = tempa;
        }
        return b;
    }
}

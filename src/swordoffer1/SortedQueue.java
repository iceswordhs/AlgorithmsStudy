package swordoffer1;

import java.util.ArrayList;

/**
 * @author Hs
 * @Date 2021/10/28 10:18
 */
public class SortedQueue {
    ArrayList<Integer> arrayList=new ArrayList<>();
    public void addInt(int num){
        if (arrayList.size()==0){
            arrayList.add(num);
        }else {
            for (int i=0;i<arrayList.size();i++){
                if (num<arrayList.get(i)){
                    arrayList.add(i,num);
                    return;
                }
            }
            arrayList.add(num);
        }
    }

    public int select(int num){
        int left=0,right=arrayList.size()-1;
        while (left<right){
            int mid=(right-left)/2+left;
            if (arrayList.get(mid)<num){
                left=mid+1;
            }else if (arrayList.get(mid)>num){
                right=mid-1;
            }else return mid;
        }
        return -1;
    }
}

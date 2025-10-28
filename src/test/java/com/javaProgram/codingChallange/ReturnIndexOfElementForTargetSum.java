package com.javaProgram.codingChallange;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReturnIndexOfElementForTargetSum {

    public static void main(String args[])
    {
        int a[]={2,11,7,15};
        int target=9;
        System.out.println(getIndexesOfSum(a,target).get(0)+" "+getIndexesOfSum(a,target).get(1));
    }

    public static List<Integer> getIndexesOfSum(int a[], int target) {
    List<Integer>indexList=new ArrayList<>();
        Map<Integer,Integer> indexMap=new HashMap<>();
        for(int i=0;i<a.length;i++) {
            int comp = target - a[i];
            if (indexMap.containsKey(comp)) {
                indexList.add(indexMap.get(comp));
                indexList.add(i);
                return indexList;
            }
            indexMap.put(a[i], i);
        }
        return null;
    }


}

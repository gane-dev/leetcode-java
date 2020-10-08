package com.gd;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

//heap approach
public class TopKElements {
    public int[] topKFrequent(int[] nums, int k) {
        if (k == nums.length) {
            return nums;
        }
        //build hash map
        Map<Integer, Integer> count = new HashMap();
        for(int n:nums)
        {
            count.put(n, count.getOrDefault(n,0)+1);
        }
        //init heap the less frequent element first
        Queue<Integer> heap = new PriorityQueue<>((n1,n2) ->count.get(n1)-count.get(n2));
        for(int n: count.keySet()) {
            heap.add(n);
            if (heap.size() > k) heap.poll();
        }
        int[] top = new int[k];
        for(int i=k-1;i>=0;--i)
        {
            top[i] = heap.poll();
        }
        return  top;
    }
}
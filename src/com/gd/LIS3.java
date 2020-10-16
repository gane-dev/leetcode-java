package com.gd;


public class LIS3 {
    public boolean increasingTriplet(int[] nums) {
        int n;
        n = nums.length;
        int lis[] = new int[n];
        int i, j, max = 0;

        for (i = 0; i < n; i++)
            lis[i] = 1;

        for (i = 1; i < n; i++) {
            for (j = 0; j < i; j++) {
                if (nums[i] > nums[j] && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;
            }
        }
        for (i = 0; i < n; i++)
            if (lis[i] == 3)
                return true;

        return false;

    }

    public static void main(String args[]) {
        int nums[] = {10, 22, 9, 33, 21, 50, 41, 60};
        int n = nums.length;
        LIS3 sol = new LIS3();
        System.out.println(sol.increasingTriplet(nums));
    }
}


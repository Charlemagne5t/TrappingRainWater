package org.example;

public class Solution {
    public int trap(int[] height) {

        int left = 0;
        int right = 0;
        int count = 0;
        for (int i = 0; i < height.length - 1; i++) {
            if (height[i] > height[i + 1]) {
                left = i;
                right = i + 1;
                int subCount = 0;
                while (right < height.length && height[left] > height[right]) {

                    subCount += height[left] - height[right];
                    right++;
                }

                if (right < height.length && height[right] >= height[left]) {
                    count = count + subCount;
                    i = right - 1;
                } else {
                    i = left - 1;
                    height[left]--;
                }

            }
        }
        return count;
    }
}

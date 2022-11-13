package com.company;

import java.util.ArrayList;
import java.util.List;

public class Q3 {
    public void InRange(Node root, int start, int end) {
        List<Integer> nums = new ArrayList<>();
        inOrder(root, nums);

        for (int i : nums) {
            if (start <= i && i <= end) {
                //System.out.print(i + " ");
            }
        }
    }

    private static void inOrder(Node root, List<Integer> nums) {
        if (root == null) {
            return;
        }

        inOrder(root.left, nums);
        nums.add(root.val);
        inOrder(root.right, nums);
    }
}

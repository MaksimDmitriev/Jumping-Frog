package com.app;

public class Solution {

    public int solution(int X, int Y, int D) {
        // X, Y and D are integers within the range [1..1,000,000,000];
        // X ≤ Y.

        int distance = Y - X;
        if (distance % D == 0) {
            return distance / D;
        } else {
            return distance / D + 1;
        }
    }
}

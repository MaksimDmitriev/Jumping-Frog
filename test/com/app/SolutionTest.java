package com.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    public void solution_Distance_Less_Than_Step() {
        Solution solution = new Solution();
        assertEquals(1, solution.solution(30, 32, 15));
    }

    @Test
    public void solution_Distance_More_Than_Step() {
        Solution solution = new Solution();
        assertEquals(4, solution.solution(30, 45, 4));
    }

    @Test
    public void solution_Distance_Equal_To_Step() {
        Solution solution = new Solution();
        assertEquals(9, solution.solution(30, 66, 4));
    }

    @Test
    public void solution_No_Need_To_Move() {
        Solution solution = new Solution();
        assertEquals(0, solution.solution(30, 30, 4));
    }

    @Test
    public void solution_Large_Numbers() {
        Solution solution = new Solution();
        assertEquals(3, solution.solution(1_000_000_000 - 10, 1_000_000_000, 4));
    }

    @Test
    public void solution_No_Need_To_Move_Small_Numbers() {
        Solution solution = new Solution();
        assertEquals(0, solution.solution(1, 1, 4));
    }
}
package com.bezf;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var firstTeam = new int[]{45, 31, 24, 22, 20, 17, 14, 13, 12, 10};
        var secondTeam = new int[]{31, 18, 15, 12, 10, 8, 6, 4, 2, 1};
        var thirdTeam = new int[]{51, 30, 10, 9, 8, 7, 6, 5, 2, 1};

        System.out.println(Arrays.toString(Sorting.sort(new int[][]{firstTeam, secondTeam, thirdTeam}, 10)));
    }
}

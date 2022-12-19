package com.bezf;

public class Sorting {
    public static int[] sort(int[][] sortableArrays, int returnedElementsNumber) {
        var sortedArray = sortableArrays[0];
        for (int i = 1; i < sortableArrays.length; i++) {
            sortedArray = merge(sortedArray, sortableArrays[i]);
        }

        return getResultArray(sortedArray, returnedElementsNumber);
    }

    private static int[] getResultArray(int[] sortedArray, int returnedElementsNumber) {
        var result = new int[returnedElementsNumber];
        System.arraycopy(sortedArray, 0, result, 0, returnedElementsNumber);
        return result;
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        var resArr = new int[arr1.length + arr2.length];
        var arr1Index = 0;
        var arr2Index = 0;
        var resultArrIndex = 0;

        while (arr1Index < arr1.length || arr2Index < arr2.length) {
            if (arr1Index == arr1.length) {
                resArr[resultArrIndex] = arr2[arr2Index];
                arr2Index++;
            } else if (arr2Index == arr2.length) {
                resArr[resultArrIndex] = arr1[arr1Index];
                arr1Index++;
            } else {
                if (arr1[arr1Index] <= arr2[arr2Index]) {
                    resArr[resultArrIndex] = arr2[arr2Index];
                    arr2Index++;
                } else {
                    resArr[resultArrIndex] = arr1[arr1Index];
                    arr1Index++;
                }
            }
            resultArrIndex++;
        }
        return resArr;
    }
}


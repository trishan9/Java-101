package com.trishan.ds_and_algos;

public class FindMinMax {
  static class Pair {
    int min;
    int max;

    Pair(int min, int max) {
      this.min = min;
      this.max = max;
    }
  }

  Pair findMinMax(int a[], int start, int end) {
    if (start == end) {
      return new Pair(a[start], a[start]);
    }
    if (start + 1 == end) {
      return new Pair(Math.min(a[start], a[end]), Math.max(a[start], a[end]));
    }
    int mid = (start + end) / 2;
    Pair leftMinMax = findMinMax(a, start, mid);
    Pair rightMinMax = findMinMax(a, mid + 1, end);
    return new Pair(Math.min(leftMinMax.min, rightMinMax.min), Math.max(leftMinMax.max, rightMinMax.max));
  }

  public static void main(String[] args) {
    FindMinMax minMaxAlgo = new FindMinMax();
    int[] a = new int[] { 22, -13, -5, -8, 15, 60, 17, 31, 47 };
    FindMinMax.Pair minMax = minMaxAlgo.findMinMax(a, 0, a.length - 1);
    System.out.println("Minimum: " + minMax.min);
    System.out.println("Maximum: " + minMax.max);
  }
}

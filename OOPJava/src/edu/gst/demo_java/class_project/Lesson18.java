package edu.gst.demo_java.class_project;

class ArrayCalculator {
    // for int arr
    public static int maxOfArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) if (max < i) max = i;
        return max;
    }
    public static int minOfArray(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i : arr) if (min > i) min = i;
        return min;
    }

    // for double arr
    public static double maxOfArray(double[] arr) {
        double max = Double.MIN_VALUE;
        for (double i : arr) if (max < i) max = i;
        return max;
    }
    public static double minOfArray(double[] arr) {
        double min = Double.MAX_VALUE;
        for (double i : arr) if (min > i) min = i;
        return min;
    }
}
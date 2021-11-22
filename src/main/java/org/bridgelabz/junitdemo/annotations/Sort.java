package org.bridgelabz.junitdemo.annotations;

public class Sort {

    /**
     * This method is deprecated, Use mergeSort instead.
     *
    * */
    @Deprecated
    public void sort(int[] arr) {
        //sorting algorithm with quick sort
    }

    @Override
    @Value(id = 100)
    public String toString() {
        return super.toString();
    }

    public void mergeSort(int[] arr) {
        ////sorting algorithm with merge sort
    }

}

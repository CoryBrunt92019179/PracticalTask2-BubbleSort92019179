/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

/**
 *
 * @author 92019179
 */
// Java program for implementation of Bubble Sort
public class BubbleSort {

    public static int counter = 0;
    public static int swapOps = 0;

    static void sortByRating(Customers arr[]) {
        int n = arr.length;
        counter++;
        for (int i = 0; i < n - 1; i++) {
            counter++;
            for (int j = 0; j < n - i - 1; j++) {
                counter++;
                if (arr[j].getRating() > arr[j + 1].getRating()) {
                    swapOps++;
                    // swap temp and arr[i]
                    Customers temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
//this sort by desending names of customers then by rating

    static void sortByNameDesending(Customers arr[]) {
        int n = arr.length;
        counter++;
        for (int i = 0; i < n - 1; i++) {
            counter++;
            for (int j = 0; j < n - i - 1; j++) {
                counter++;
                if (arr[j].getName().compareToIgnoreCase(arr[j + 1].getName()) < 0
                        && arr[j].getRating() == arr[j + 1].getRating()) {
                    swapOps++;

                    // swap temp and arr[i]
                    Customers temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /* Prints the array */
    static void printArray(Customers arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i].getName() + " " + arr[i].getRating() + ", \n");
        }
        System.out.println();
        System.out.println();
    }

    // Driver method to test above
    public static void main(String args[]) {

        Customers arr[] = {
            new Customers("Tama", 2, "Auckland"),
            new Customers("Amelia", 5, "Taranaki"),
            new Customers("Kaos", 3, "Hamilton"),
            new Customers("Karl", 4, "Papatoetoe"),
            new Customers("Carlos", 5, "Glenfield"),
            new Customers("Alicia", 2, "Whangarai"),
            new Customers("Zion", 2, "Wellington"),
            new Customers("Sara", 3, "Auckland"),
            new Customers("Bob", 4, "Papakura"),
            new Customers("Wiremu", 5, "Auckland")};

        System.out.println("Welcome to the customer bubble sorter \n\n");
        System.out.println(
                "The Unsorted Customer list.");
        printArray(arr);

        // apply sort by rating
        sortByRating(arr);

        //apply sort by name desending
        sortByNameDesending(arr);
        System.out.println("The Sorted by rating list.");
        printArray(arr);
        System.out.println("Amount of operations: " + counter);
        System.out.println("Amount of swaps used: " + swapOps);
    }
}

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
public class Customers {

    private String name;
    private int rating;
    private String address;

    // getter methods
    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public String getAddress() {
        return address;
    }

    public Customers(String newName, int newRating, String newAddress) {
        name = newName;
        rating = newRating;
        address = newAddress;
    }

    @Override
    public String toString() {
        return ("Name" + this.name + "Rating" + this.rating);
    }

}

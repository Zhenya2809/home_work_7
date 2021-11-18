package com.java.hw7;

public class DynamicIntArray {

    /**
     * Array for storing numbers
     */
    private int[] array;

    /**
     * Current size of the array
     */
    private int size;

    /**
     * Method for adding element to the array
     * @param element represents number need to add
     */
    public void add(int element) {
    }

    /**
     * Method for removing first element from array
     * @param element represents number need to remove
     * @return true if successfully removed and false if the array doesn't contain such an element
     */
    public boolean remove(int element) {
        return false;
    }

    /**
     * Method for updating element by index
     * @param element represents new value of the element with appropriate index
     * @param index represents the position of the element which need to update
     * @return true if successfully updated and false if the array doesn't contain such an element
     */
    public boolean update(int element, int index) {
        return false;
    }

    /**
     * Method for retrieving an element by index. If the array doesn't contain an element at the position then throw NoSuchElementException
     * @param index represents the position of the element which need to retrieve
     * @return an element at the position with appropriate index
     */
    public int getElement(int index) {
        return -1;
    }

    /**
     * Method for retrieving size of the array.
     * @return size of the array
     */
    public int getSize() {
        return -1;
    }

    /**
     * Method for creating new array if previous is full and copying all element from an old array to a new
     */
    private void resize() {
    }

}

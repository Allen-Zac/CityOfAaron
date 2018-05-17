/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Zac Allen
 */
public class Point {
    private int row;
    private int column;

    public Point() {
        //Empty constructor for JavaBeans
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return "Point {" 
                + "row=" + row 
                + ", column=" + column 
                + '}';
    }   
}

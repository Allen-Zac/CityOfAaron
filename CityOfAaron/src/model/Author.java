/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.Serializable;
/**
 *
 * @author Carson Fullmer
 */
public class Author implements Serializable {
    private String name;
    private String title;
    
    public Author() {
        //Empty constructor for JavaBeans
}
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    @Override
    public String toString(){
        return "Author: ("
                + "name=" + name
                + ", title=" + title
                + ")";
    }
}

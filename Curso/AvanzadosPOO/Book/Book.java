/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book;
import Author.Author;
/**
 *
 * @author Alumno
 */
public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public Author[] getAuthors() {
        return this.authors;
    }

    public double getPrice() {
        return this.price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public int getQty() {
        return this.qty;
    }
    
    public void setQty(int q){
        this.qty = q;
    }
    @Override
    public String toString(){
        String ans = "Name: " + this.name + "\nAuthors: " + this.getAuthorNames() + "\nPrice: " + this.price + "\nQuantity: " + this.qty;
        return ans;
    }
    String getAuthorNames(){
        String ans = "";
        for(int i=0; i<authors.length; i++){
            ans+=authors[i].getName();
            if(i!=authors.length-1)ans+=", ";
        }
        return ans;
    }
    
}

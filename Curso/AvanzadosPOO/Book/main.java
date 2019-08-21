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
public class main {
    public static void main(String[] args){
        Author[] autores = new Author[2];
        autores[0] = new Author("Daniel","asdasd.com",'m');
        autores[1] = new Author("Fabio","ddwwqw.com",'m');
        Book a = new Book("Hunger Games", autores, 1200, 100);
        System.out.println(a.getAuthorNames());
    }
}

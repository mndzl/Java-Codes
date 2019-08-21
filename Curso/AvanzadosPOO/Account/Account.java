/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

/**
 *
 * @author Alumno
 */
public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }
    public int credit(int amount){
        this.balance += amount;
        return this.balance;
    }
    public int debit(int amount){
        if(amount <= balance)this.balance -= amount;
        else System.out.println("Amount exceeded balance");
        
        return balance;
    }
    public int transferTo(Account another, int amount){
        if(amount <= balance){
            another.balance+=amount;
            debit(amount);
        }
        else System.out.println("Amount exceeded balance");
        
        return balance;
    }
    @Override
    public String toString(){
        return "ID: " + this.id + "\nName: " + this.name + "\nBalance: " + this.balance;
    }
}

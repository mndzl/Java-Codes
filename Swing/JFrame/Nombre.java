import javax.swing.*;
import java.awt.event.*;
class pruebasSwing {  
public static void main(String args[])  {  
        JFrame frame = new JFrame("Mostrar nombre por consola");
        
        JLabel l1,l2;
        JTextField tf = new JTextField();
        
        tf.setBounds(45,50,200,30);
        JButton boton = new JButton("Ingresar");
        
        boton.setBounds(100,200,100,100);
        
        l1 = new JLabel("Ingrese su nombre");
        l1.setBounds(70,10,200,30);
        
        boton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println(tf.getText());
            }
        });
        

        frame.add(l1);
        frame.add(boton);
        frame.add(tf);
        frame.setSize(300,200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }  
}  


package pruebasswing;
import javax.swing.*;
import java.awt.event.*;

public class PruebasSwing {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JTextField tf = new JTextField();
        tf.setBounds(105,70,150,20);
        
        JButton boton = new JButton("Botón");
        boton.setBounds(130,140,100,40);
        boton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                tf.setText("Boton presionado");
            }
        });
        
        frame.add(tf);
        frame.add(boton);
        frame.setSize(400,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
}

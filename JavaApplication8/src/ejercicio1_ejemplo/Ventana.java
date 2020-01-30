/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_ejemplo;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Administrador
 */
public class Ventana extends JFrame {

    private JPanel panel;
    private JLabel etiqueta;
    private JButton boton1;
    private JButton boton2;
    private int contador = 0;
    
    public Ventana() {
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("ejercicio1");
        setLocationRelativeTo(null);
        iniciarComponentes();
    }
    
    private void iniciarComponentes() {
        colocarPanel();
        colocarEtiqueta();
        colocarBoton1();
        colocarBoton2();
    }
    
    private void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
    
    private void colocarEtiqueta() {
        etiqueta = new JLabel("pulsaciones de mouse ");
        etiqueta.setBounds(40, 10, 300, 30);
        etiqueta.setFont(new Font("Cooper Black", 1, 15));
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(etiqueta);
        
    }
    
    private void colocarBoton1() {
        boton1 = new JButton("Aumentar");
        boton1.setFont(new Font("Cooper black", 1, 20));
        boton1.setBounds(40, 200, 200, 50);
        panel.add(boton1);
        eventoDeAccionbtn1();
    }
    
    private void colocarBoton2() {
        boton2 = new JButton("Disminuir");
        boton2.setFont(new Font("Cooper black", 1, 20));
        boton2.setBounds(300, 200, 200, 50);
        panel.add(boton2);
        eventoDeAccionbnt2();
    }
    
    private void eventoDeAccionbtn1() {
        ActionListener oyenteAccionbnt1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                if (contador == 0) {
                    etiqueta.setText("boton Aumento 1 vez");
                    contador++;
                }
                
                if (contador >= 1) {
                    
                    etiqueta.setText("boton Aumento " + contador + " vez");
                    contador++;
                }
                
            }
        };        
        
        boton1.addActionListener(oyenteAccionbnt1);
        
    }
    
    private void eventoDeAccionbnt2() {
        
        ActionListener oyenteAccionbnt2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                if (contador == 0) {
                    etiqueta.setText("boton disminuye 0 vez");
                    
                }
                if (contador > 0) {
                    contador--;
                    etiqueta.setText("boton disminuye " + contador + " vez");
                }
                
            }
        };        
        
        boton2.addActionListener(oyenteAccionbnt2);
    }
    
}

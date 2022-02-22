package Operaciones;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import Memory.Memory;

public class operaciones {


	
	static String[] imagen = {"pangolin","elefante","gato","perro","ornitorrinco","pez","leon","hamster"};
	
	static HashMap<Integer,String> hashmap = new HashMap <Integer,String>();
	
	static Random claseRandom = new Random();
	
	static int cont = 0, parejas = 0, intentos = 0;
	static JLabel comparar;
	
	public static void asignarposicion(JLabel[] carta) {
		int j = 0;
		for (int i = 0; i < imagen.length; i++) {
			j = 0;
			while (j != 2) {
				int num = claseRandom.nextInt(16);
				if(carta[num].getText().equals("ok")) {
					
				}else {
					hashmap.put(num, imagen[i]);
					carta[num].setText("ok");
					j++;
				}
			}
		}
		ocultar(carta);
	}
	
	public static void ocultar(JLabel[] carta) {
		for (int i = 0; i < carta.length; i++) {
			carta[i].setIcon(null);
			carta[i].setText("");
		}
	}
	
	public static void mostrar(JLabel carta, int i) {
		if (carta.getIcon()==null) {
		carta.setIcon(new ImageIcon("Imagenes/"+ hashmap.get(i) +".jpg"));
		carta.setText(hashmap.get(i));
		cont++;

		if (cont == 2) {
			
			if (carta.getText().equals(comparar.getText())) {
				parejas++;
				intentos++;
				comprobarganador();
			}else {
				carta.setIcon(null);
				carta.setText("");
				intentos++;
				comparar.setIcon(null);
				comparar.setText("");
				
			}
			cont = 0;
		}
		
		comparar = carta;
		}else {

		}
		
	}
	
	public static void comprobarganador() {
		if (parejas == 8) {
			JOptionPane.showMessageDialog(null, "Enhorabuena has finalizado con " + intentos + " intentos.");
		}
	}
	
}

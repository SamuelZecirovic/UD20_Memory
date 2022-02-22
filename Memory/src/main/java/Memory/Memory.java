package Memory;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Operaciones.operaciones;

import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Memory extends JFrame {

	private JPanel contentPane;

	public JLabel carta[] = new JLabel[16];

	/**
	 * Create the frame.
	 */
	public Memory() {
			
		setTitle("Memory");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 620);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(null);
		panel1.setBounds(47, 11, 117, 114);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				operaciones.mostrar(carta[0], 0);
			}
		});
		//lblNewLabel_1.setIcon(new ImageIcon(operaciones.mostrarimagen(1)));//prueba para ver la imagen en el label
		lblNewLabel_1.setBounds(0, 0, 117, 114);
		panel1.add(lblNewLabel_1);
		
				
		JPanel panel2 = new JPanel();
		panel2.setBounds(212, 11, 117, 114);
		contentPane.add(panel2);
		panel2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				operaciones.mostrar(carta[1], 1);
			}
		});
		lblNewLabel_2.setBounds(0, 0, 117, 114);
		panel2.add(lblNewLabel_2);
		
		JPanel panel3 = new JPanel();
		panel3.setBounds(374, 11, 117, 114);
		contentPane.add(panel3);
		panel3.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				operaciones.mostrar(carta[2], 2);
			}
		});
		lblNewLabel_3.setBounds(0, 0, 117, 114);
		panel3.add(lblNewLabel_3);
		
		JPanel panel4 = new JPanel();
		panel4.setBounds(526, 11, 117, 114);
		contentPane.add(panel4);
		panel4.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				operaciones.mostrar(carta[3], 3);
			}
		});
		lblNewLabel_4.setBounds(0, 0, 117, 114);
		panel4.add(lblNewLabel_4);
		
		JPanel panel5 = new JPanel();
		panel5.setBounds(47, 155, 117, 114);
		contentPane.add(panel5);
		panel5.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				operaciones.mostrar(carta[4], 4);
			}
		});
		lblNewLabel_5.setBounds(0, 0, 117, 114);
		panel5.add(lblNewLabel_5);
		
		JPanel panel6 = new JPanel();
		panel6.setBounds(47, 301, 117, 114);
		contentPane.add(panel6);
		panel6.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				operaciones.mostrar(carta[5], 5);
			}
		});
		lblNewLabel_6.setBounds(0, 0, 117, 114);
		panel6.add(lblNewLabel_6);
		
		JPanel panel7 = new JPanel();
		panel7.setBounds(47, 443, 117, 114);
		contentPane.add(panel7);
		panel7.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				operaciones.mostrar(carta[6], 6);
			}
		});
		lblNewLabel_7.setBounds(0, 0, 117, 114);
		panel7.add(lblNewLabel_7);
		
		JPanel panel8 = new JPanel();
		panel8.setBounds(212, 155, 117, 114);
		contentPane.add(panel8);
		panel8.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				operaciones.mostrar(carta[7], 7);
			}
		});
		lblNewLabel_8.setBounds(0, 0, 117, 114);
		panel8.add(lblNewLabel_8);
		
		JPanel panel9 = new JPanel();
		panel9.setBounds(374, 155, 117, 114);
		contentPane.add(panel9);
		panel9.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				operaciones.mostrar(carta[8], 8);
			}
		});
		lblNewLabel_9.setBounds(0, 0, 117, 114);
		panel9.add(lblNewLabel_9);
		
		JPanel panel10 = new JPanel();
		panel10.setBounds(526, 155, 117, 114);
		contentPane.add(panel10);
		panel10.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				operaciones.mostrar(carta[9], 9);
			}
		});
		lblNewLabel_10.setBounds(0, 0, 117, 114);
		panel10.add(lblNewLabel_10);
		
		JPanel panel11 = new JPanel();
		panel11.setBounds(212, 301, 117, 114);
		contentPane.add(panel11);
		panel11.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				operaciones.mostrar(carta[10], 10);
			}
		});
		lblNewLabel_11.setBounds(0, 0, 117, 114);
		panel11.add(lblNewLabel_11);
		
		JPanel panel12 = new JPanel();
		panel12.setBounds(374, 301, 117, 114);
		contentPane.add(panel12);
		panel12.setLayout(null);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				operaciones.mostrar(carta[11], 11);
			}
		});
		lblNewLabel_12.setBounds(0, 0, 117, 114);
		panel12.add(lblNewLabel_12);
		
		JPanel panel13 = new JPanel();
		panel13.setBounds(526, 301, 117, 114);
		contentPane.add(panel13);
		panel13.setLayout(null);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				operaciones.mostrar(carta[12], 12);
			}
		});
		lblNewLabel_13.setBounds(0, 0, 117, 114);
		panel13.add(lblNewLabel_13);
		
		JPanel panel14 = new JPanel();
		panel14.setBounds(212, 443, 117, 114);
		contentPane.add(panel14);
		panel14.setLayout(null);
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				operaciones.mostrar(carta[13], 13);
			}
		});
		lblNewLabel_14.setBounds(0, 0, 117, 114);
		panel14.add(lblNewLabel_14);
		
		JPanel panel15 = new JPanel();
		panel15.setBounds(374, 443, 117, 114);
		contentPane.add(panel15);
		panel15.setLayout(null);
		
		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				operaciones.mostrar(carta[14], 14);
			}
		});
		lblNewLabel_15.setBounds(0, 0, 117, 114);
		panel15.add(lblNewLabel_15);
		
		JPanel panel16 = new JPanel();
		panel16.setBounds(526, 443, 117, 114);
		contentPane.add(panel16);
		panel16.setLayout(null);
		
		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				operaciones.mostrar(carta[15], 15);
			}
		});
		lblNewLabel_16.setBounds(0, 0, 117, 114);
		panel16.add(lblNewLabel_16);
		
		//declaro cada carta a su respectivo label
		carta[0] = lblNewLabel_1;
		carta[1] = lblNewLabel_2;
		carta[2] = lblNewLabel_3;
		carta[3] = lblNewLabel_4;
		carta[4] = lblNewLabel_5;
		carta[5] = lblNewLabel_6;
		carta[6] = lblNewLabel_7;
		carta[7] = lblNewLabel_8;
		carta[8] = lblNewLabel_9;
		carta[9] = lblNewLabel_10;
		carta[10] = lblNewLabel_11;
		carta[11] = lblNewLabel_12;
		carta[12] = lblNewLabel_13;
		carta[13] = lblNewLabel_14;
		carta[14] = lblNewLabel_15;
		carta[15] = lblNewLabel_16;
		
		operaciones.asignarposicion(carta);
	}
}

package septima;

import java.awt.Color;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class VentaColores extends JFrame implements MouseListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private JButton btnAzul;
	private JButton btnRojo;
	private JButton btnVerde;
	private JButton btnFondoVerde;
	private JButton btnFondoAzul;
	private JButton btnFondoRojo;
	private JButton btnTransparente;
	private JButton btnOpaca;
	
	private JLabel etiNombre;
	
	public VentaColores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 284);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnAzul = new JButton("Azul");
		btnAzul.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
		btnAzul.setBounds(10, 11, 127, 27);
		btnAzul.addMouseListener(this);
		contentPane.add(btnAzul);
		
		btnRojo = new JButton("Rojo");
		btnRojo.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
		btnRojo.setBounds(147, 11, 127, 27);
		btnRojo.addMouseListener(this);
		contentPane.add(btnRojo);
		
		btnVerde = new JButton("Verde");
		btnVerde.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
		btnVerde.setBounds(284, 11, 127, 27);
		btnVerde.addMouseListener(this);
		contentPane.add(btnVerde);
		
		btnFondoAzul = new JButton("Fondo Azul");
		btnFondoAzul.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
		btnFondoAzul.setBounds(10, 49, 127, 27);
		btnFondoAzul.addMouseListener(this);
		contentPane.add(btnFondoAzul);
		
		btnFondoVerde = new JButton("Fondo Verde");
		btnFondoVerde.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
		btnFondoVerde.setBounds(284, 49, 127, 27);
		btnFondoVerde.addMouseListener(this);
		contentPane.add(btnFondoVerde);
		
		btnFondoRojo = new JButton("Fondo Rojo");
		btnFondoRojo.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
		btnFondoRojo.setBounds(147, 49, 127, 27);
		btnFondoRojo.addMouseListener(this);
		contentPane.add(btnFondoRojo);
		
		btnTransparente = new JButton("Transparente");
		btnTransparente.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
		btnTransparente.setBounds(62, 203, 127, 27);
		btnTransparente.addMouseListener(this);
		contentPane.add(btnTransparente);
		
		btnOpaca = new JButton("Opaca");
		btnOpaca.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
		btnOpaca.setBounds(225, 203, 127, 27);
		btnOpaca.addMouseListener(this);
		contentPane.add(btnOpaca);
		
		etiNombre = new JLabel("bavin");
		etiNombre.setHorizontalAlignment(SwingConstants.CENTER);
		etiNombre.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 18));
		etiNombre.setBounds(10, 87, 401, 105);
		contentPane.add(etiNombre);
		
		

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getSource()==btnAzul) {
			etiNombre.setForeground(Color.blue);
		}else if (e.getSource()==btnRojo) {
			etiNombre.setForeground(Color.red);
		}else if (e.getSource()==btnVerde) {
			etiNombre.setForeground(Color.green);
		} else if (e.getSource() == btnFondoAzul) {
			contentPane.setBackground(Color.blue);
	        etiNombre.setForeground(Color.white);
	    } else if (e.getSource() == btnFondoRojo) {
	    	contentPane.setBackground(Color.red);
	        etiNombre.setForeground(Color.white);
	    } else if (e.getSource() == btnFondoVerde) {
	    	contentPane.setBackground(Color.green);
	        etiNombre.setForeground(Color.white);
	    }  else if (e.getSource() == btnOpaca) {
	    	contentPane.setBackground(Color.white);
	        etiNombre.setForeground(Color.black);
	    	contentPane.setOpaque(true);
	    }	 else if (e.getSource() == btnTransparente) {
	    	contentPane.setBackground(Color.white);
	        etiNombre.setForeground(Color.black);
	    	contentPane.setOpaque(false);
	    }

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

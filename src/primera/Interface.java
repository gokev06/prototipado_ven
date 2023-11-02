package primera;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interface {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(240, 240, 240));
		frame.getContentPane().setBackground(new Color(188, 143, 143));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea etiNombre = new JTextArea();
		etiNombre.setBounds(86, 52, 80, 22);
		frame.getContentPane().add(etiNombre);
		
		JLabel lblNewLabel = new JLabel("Nombre:\r\n");
		lblNewLabel.setBounds(35, 57, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ciudad:");
		lblNewLabel_1.setBounds(222, 57, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JTextArea etiCiudad = new JTextArea();
		etiCiudad.setBounds(265, 52, 80, 22);
		frame.getContentPane().add(etiCiudad);
		
		JButton btnVisuNombre = new JButton("Visualizar Nombre\r\n");
		btnVisuNombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiNombre.setVisible(true);
			}
		});
		btnVisuNombre.setBounds(61, 121, 117, 23);
		frame.getContentPane().add(btnVisuNombre);
		
		JButton btnVisuCiudad = new JButton("Visulaizar Ciudad");
		btnVisuCiudad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiCiudad.setVisible(true);
			}
		});
		btnVisuCiudad.setBounds(240, 121, 129, 23);
		frame.getContentPane().add(btnVisuCiudad);
		
		JButton btnOcultarNombre = new JButton("Ocultar Nombre");
		btnOcultarNombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiNombre.setVisible(false);
			}
		});
		btnOcultarNombre.setBounds(61, 166, 117, 23);
		frame.getContentPane().add(btnOcultarNombre);
		
		JButton btnOcultarCiudad = new JButton("Ocultar Ciudad");
		btnOcultarCiudad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiCiudad.setVisible(false);
			}
		});
		btnOcultarCiudad.setBounds(240, 166, 129, 23);
		frame.getContentPane().add(btnOcultarCiudad);
	}
}

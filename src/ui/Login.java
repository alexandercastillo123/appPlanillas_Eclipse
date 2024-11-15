package ui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import controller.EmpleadoDAO;
import model.Empleado;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	
	JTextField txtDni;
	JPasswordField txtPassswordd;
	Empleado empleado = new Empleado();
	EmpleadoDAO empleadoDAO = new  EmpleadoDAO();

	private JTextField txtPasswordd;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 400, 300);
		setLayout(null);
		setLocationRelativeTo(null);
		setUndecorated(true);
		
		JPanel pnlLogin = new JPanel();
		pnlLogin.setBounds(0, 0, 400, 51);
		pnlLogin.setBackground(new Color(94, 17, 90) );
		pnlLogin.setLayout(null);
		getContentPane().add( pnlLogin);
		
		JLabel imgLogo = new JLabel();
		imgLogo.setIcon( new ImageIcon( Login.class.getResource("/ui/img/logo.png") ) );
		imgLogo.setBounds(96, 4, 208, 43);
		pnlLogin.add(imgLogo);
		
		JLabel imgSalir = new JLabel();
		imgSalir.setBounds(370, 12, 24, 24);
		imgLogo.setIcon( new ImageIcon( Login.class.getResource("/ui/img/logo.png") ) );
		pnlLogin.add(imgSalir);
		
		JLabel lblDni = new JLabel ("Dni:");
		lblDni.setBounds(100, 100 , 100, 30);
		getContentPane().add(lblDni);
		
		JLabel lblPasswordd = new JLabel ("Password:");
		lblPasswordd.setBounds(100, 150 , 100, 30);
		getContentPane().add(lblPasswordd);
		
		txtDni = new JTextField();
		txtDni.setBounds(200, 100, 100, 30);
		txtDni.setColumns(8);
		txtDni.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtDni);
		
		txtPasswordd = new JTextField();
		txtPasswordd.setBounds(200, 150, 100, 30);
		txtPasswordd.setColumns(6);
		txtPasswordd.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtPasswordd);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.setBounds(75, 250, 100, 30);
		btnIniciar.setBackground(new Color(94, 17, 90) );
		btnIniciar.setBorderPainted(false);
		btnIniciar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnIniciar.setForeground(Color.WHITE);
		btnIniciar.setMnemonic('i');
		btnIniciar.setFocusPainted(false);
		getContentPane().add(btnIniciar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(225, 250, 100, 30);
		btnCancelar.setBackground(new Color(94, 17, 90) );
		btnCancelar.setBorderPainted(false);
		btnCancelar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnCancelar.setForeground(Color.WHITE);
		btnCancelar.setMnemonic('a');
		btnCancelar.setFocusPainted(false);
		getContentPane().add(btnCancelar);
		
		btnIniciar.addActionListener( e -> btnIniciar_actionPerformed() );
		btnCancelar.addActionListener( e -> btnCancelar_actionPerformed() );
	}
	protected void btnCancelar_actionPerformed() {
		txtDni.setText("");
		txtPasswordd.setText("");
		txtDni.requestFocus();
	}
	protected void btnIniciar_actionPerformed() {
	}
}
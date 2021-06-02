package fp.daw.exprog20210602.ejercicio4;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

import javafx.stage.WindowEvent;

public class InterfazGrafica extends JFrame implements MouseListener, MouseMotionListener {

	private static final long serialVersionUID = 1L;
	static JLabel etiqueta;
	static int contador = 0;
	static JButton boton;
	static JButton reset;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new InterfazGrafica().setVisible(true));
	}

	public InterfazGrafica() {
		super("Examen de la 3ª Evaluación - Ejercicio 4");
		this.setLayout(new GridLayout(3, 1,50,50));
		boton = new JButton("Pulsa aquí");
		boton.registerKeyboardAction(this::veces, KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.ALT_DOWN_MASK), 1);
		boton.addActionListener(this::veces);
		etiqueta = new JLabel("           Se ha pulsado el botón " + contador + " veces.");
		reset = new JButton("Reset");
		reset.registerKeyboardAction(this::veces, KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.ALT_DOWN_MASK), 2);
		reset.addActionListener(this::veces);
		this.getContentPane().add(boton);
		this.getContentPane().add(etiqueta);
		this.getContentPane().add(reset);
		this.setBounds(320, 250, 700, 500);
		this.setResizable(false);
//		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//		this.addWindowListener(this::cerrar);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void veces(ActionEvent e) {
		if (e.getSource() == boton)
			contador++;
		else if (e.getSource() == reset)
			contador = 0;
		etiqueta.setText("Se ha pulsado el botón " + contador + " veces.");
	}

	public void cerrar(WindowEvent e) {
		switch (JOptionPane.showConfirmDialog(this, "¿Está seguro que quiere cerrar la ventana?")) {
		case JOptionPane.YES_OPTION:
			System.exit(0);
		case JOptionPane.NO_OPTION:
			break;
		}
	
	}

	public void colorear(MouseMotionListener e) {

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
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

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}

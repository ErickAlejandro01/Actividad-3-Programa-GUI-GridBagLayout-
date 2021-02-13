import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridBagLayoutInfo;

import javax.swing.*;

class VentanaInicio extends JFrame{
	GridBagLayout gbl= new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	public VentanaInicio(){
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setSize(600,600);
		setTitle("Mi Primera Vez");
		
		        //Cuadro De Texto 1
				JLabel cdt1 =new JLabel("El formulario clasico incluye todos "
						+ "los campos visibles para esta lista ");
				add(cdt1);
				gbc.gridx = 0;
				gbc.gridy = 0;
				gbc.gridheight = 1;
				gbc.gridwidth =  1;
				gbc.anchor = GridBagConstraints.WEST;
				gbl.setConstraints(cdt1, gbc);
				
				

				
				//Cuadro De Texto 2
				JLabel cdt2 =new JLabel("Opciones del formulario "
						+ "Incluya Lo Siguiente");
				add(cdt2);
				gbc.gridx = 0;
				gbc.gridy = 1;
				gbc.gridheight = 1;
				gbc.gridwidth =  1;
				gbc.anchor = GridBagConstraints.WEST;
				gbl.setConstraints(cdt2, gbc);
				
				
				//ChackBox 1
				JCheckBox Chb1 = new JCheckBox("Un poco sobre ti");
				add(Chb1);
				gbc.gridx = 0;
				gbc.gridy = 3;
				gbc.gridheight = 1;
				gbc.gridwidth =  1;
				gbc.anchor = GridBagConstraints.WEST;
				gbl.setConstraints(Chb1, gbc);
				
				//Cuadro de llenado 1
				JTextArea Cdll1 = new JTextArea("Suscribase a nuestra lista de correo");
				add(Cdll1);
				gbc.gridx = 0;
				gbc.gridy = 4;
				gbc.gridheight = 1;
				gbc.gridwidth =  1;
				gbc.fill = GridBagConstraints.HORIZONTAL;
				gbc.anchor = GridBagConstraints.WEST;
				gbl.setConstraints(Cdll1, gbc);
				
				
				//Select button 1
		        ButtonGroup bg = new ButtonGroup();
				
				JRadioButton Selectb1 = new JRadioButton("Solo Campos Obligatorios");
				bg.add(Selectb1);
				add(Selectb1);
				gbc.gridx = 0;
				gbc.gridy = 5;
				gbc.gridheight = 1;
				gbc.gridwidth =  1;
				gbc.anchor = GridBagConstraints.WEST;
				gbl.setConstraints(Selectb1, gbc);
				
				//Select Button 2
				JRadioButton Selectb2 = new JRadioButton("Todos Los Campos");
				bg.add(Selectb2);
				add(Selectb2);
				gbc.gridx = 0;
				gbc.gridy = 6;
				gbc.gridheight = 1;
				gbc.gridwidth =  1;
				gbc.anchor = GridBagConstraints.WEST;
				gbl.setConstraints(Selectb2, gbc);
				
				//Cuadro de texto 3
				JLabel cdt3 =new JLabel("(Editar Campos Oblgaorios en el generagor de formularios)");
				add(cdt3);
				gbc.gridx = 0;
				gbc.gridy = 7;
				gbc.gridheight = 1;
				gbc.gridwidth =  1;
				gbc.anchor = GridBagConstraints.WEST;
				gbl.setConstraints(cdt3, gbc);
				
				
				//Check box 2
				JCheckBox Chb2 = new JCheckBox("Grupo De Campos De Interes");
				add(Chb2);
				gbc.gridx = 0;
				gbc.gridy = 9;
				gbc.gridheight = 1;
				gbc.gridwidth =  1;
				gbc.anchor = GridBagConstraints.WEST;
				gbl.setConstraints(Chb2, gbc);
				
				//Check Box 3
				JCheckBox Chb3 = new JCheckBox("Indicador De Campos Obligatorios");
				add(Chb3);
				gbc.gridx = 0;
				gbc.gridy = 10;
				gbc.gridheight = 1;
				gbc.gridwidth =  1;
				gbc.anchor = GridBagConstraints.WEST;
				gbl.setConstraints(Chb3, gbc);
				
				
				//Cuadro de texto 4
				JLabel cdt4 =new JLabel("Establecer ancho de formulario");
				add(cdt4);
				gbc.gridx = 0;
				gbc.gridy = 11;
				gbc.gridheight = 1;
				gbc.gridwidth =  1;
				gbc.anchor = GridBagConstraints.WEST;
				gbl.setConstraints(cdt4, gbc);
				
				//Cuadro de llenado 2
				JTextArea Cdll2 = new JTextArea("");
				add(Cdll2);
				gbc.gridx = 0;
				gbc.gridy = 12;
				gbc.gridheight = 1;
				gbc.gridwidth =  1;
				gbc.anchor = GridBagConstraints.WEST;
				gbl.setConstraints(Cdll2, gbc);
				
				
				//Cuadro  de texto 5
				JLabel cdt5 =new JLabel("Mejora La Forma De El Formulario");
				add(cdt5);
				gbc.gridx = 0;
				gbc.gridy = 13;
				gbc.gridheight = 1;
				gbc.gridwidth =  1;
				gbc.anchor = GridBagConstraints.WEST;
				gbl.setConstraints(cdt5, gbc);
				
				
				//Check Box 4
				JCheckBox Chb4 = new JCheckBox("Habilite el Modo de emergencia");
				add(Chb4);
				gbc.gridx = 0;
				gbc.gridy = 015;
				gbc.gridheight = 1;
				gbc.gridwidth =  1;
				gbc.anchor = GridBagConstraints.WEST;
				gbl.setConstraints(Chb4, gbc);
				
				
				//Check Box 5
				JCheckBox Chb5 = new JCheckBox("Desavilita Todo Java Script");
				add(Chb5);
				gbc.gridx = 0;
				gbc.gridy = 17;
				gbc.gridheight = 1;
				gbc.gridwidth =  1;
				gbc.anchor = GridBagConstraints.WEST;
				gbl.setConstraints(Chb5, gbc);
				
				
				//Check box 6
				JCheckBox Chb6 = new JCheckBox("Incluir Links De Archivo");
				add(Chb6);
				gbc.gridx = 0;
				gbc.gridy = 19;
				gbc.gridheight = 1;
				gbc.gridwidth =  1;
				gbc.anchor = GridBagConstraints.WEST;
				gbl.setConstraints(Chb6, gbc);
				
				
				//Check box 7
				JCheckBox Chb7 = new JCheckBox("Incluye Mankey Reguard Link");
				add(Chb7);
				gbc.gridx = 0;
				gbc.gridy = 21;
				gbc.gridheight = 1;
				gbc.gridwidth =  1;
				gbc.anchor = GridBagConstraints.WEST;
				gbl.setConstraints(Chb7, gbc);
				
				
				//Cuadro de texto 6
				JLabel cdt6 =new JLabel("Preview");
				add(cdt6);
				gbc.gridx = 2;
				gbc.gridy = 1;
				gbc.gridheight = 1;
				gbc.gridwidth =  1;
				gbc.anchor = GridBagConstraints.EAST;
				gbl.setConstraints(cdt6, gbc);
				
				
				//Cuadro de texto 7
				JLabel cdt7 =new JLabel("Direccion De Correo");
				add(cdt7);
				gbc.gridx = 2;
				gbc.gridy = 2;
				gbc.gridheight = 1;
				gbc.gridwidth =  1;
				gbc.anchor = GridBagConstraints.EAST;
				gbl.setConstraints(cdt7, gbc);
				
				
				
				//Cuadro De Llenado 3
				JFormattedTextField cdll3 = new JFormattedTextField("");
				add(cdll3);
				gbc.gridx = 2;
				gbc.gridy = 3;
				gbc.gridheight = 1;
				gbc.gridwidth =  1;
				gbc.anchor = GridBagConstraints.EAST;
				gbl.setConstraints(cdll3, gbc);
				
				
				
				//Cuadro de texto  8
				JLabel cdt8 =new JLabel("Primer Nombre");
				add(cdt8);
				gbc.gridx = 2;
				gbc.gridy = 4;
				gbc.gridheight = 1;
				gbc.gridwidth =  1;
				gbc.anchor = GridBagConstraints.EAST;
				gbl.setConstraints(cdt8, gbc);
				
				
				//Cuadro De Llenado 4
				JTextArea Cdll4 = new JTextArea("");
				add(Cdll4);
				gbc.gridx = 2;
				gbc.gridy = 5;
				gbc.gridheight = 1;
				gbc.gridwidth =  1;
				gbc.anchor = GridBagConstraints.EAST;
				gbl.setConstraints(Cdll4, gbc);
				
				
				//Cuadro De Texto 9
				JLabel cdt9 =new JLabel("Ultimo Nombre");
				add(cdt9);
				gbc.gridx = 2;
				gbc.gridy = 6;
				gbc.gridheight = 1;
				gbc.gridwidth =  1;
				gbc.anchor = GridBagConstraints.EAST;
				gbl.setConstraints(cdt9, gbc);
				
				
				//Cuadro De Llenado 5
				JTextArea Cdll5 = new JTextArea("");
				add(Cdll5);
				gbc.gridx = 2;
				gbc.gridy = 7;
				gbc.gridheight = 1;
				gbc.gridwidth =  1;
				gbc.anchor = GridBagConstraints.EAST;
				gbl.setConstraints(Cdll5, gbc);
				
				
				//Cuadro de texto 10
				JLabel cdt10 =new JLabel("Copia Y Pega Tus Links De Sitio Web");
				add(cdt10);
				gbc.gridx = 2;
				gbc.gridy = 8;
				gbc.gridheight = 1;
				gbc.gridwidth =  1;
				gbc.anchor = GridBagConstraints.EAST;
				gbl.setConstraints(cdt10, gbc);
				
				
				//Cuadro De Llenado 6
				JTextArea Cdll6 = new JTextArea("");
				add(Cdll6);
				gbc.gridx = 2;
				gbc.gridy = 9;
				gbc.gridheight = 30;
				gbc.gridwidth =  30;
				gbl.setConstraints(Cdll6, gbc);
				
				

		
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
		
	}
    public void MetdodDeOrd (JComponent c,int gx,int gy, int gw, int gh, int f ) {
    	gbc.gridx = gx;
		gbc.gridy = gx;
		gbc.gridheight = gh;
		gbc.gridwidth = gw;
		gbc.fill= f;
		gbl.setConstraints(c, gbc);
		add(c);
    }
}


public class FormuarioGridBag {
	

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable () {
			public void run() {
				new VentanaInicio();
			}
		});
	}

}

package pekan8_2511532023;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperasiAssignmentGUI_2511532023 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA1;
	private JTextField txtA2;
	private JTextField txtAkhir;
	
	int nilaiA1= 0;
	boolean mulai= true;
	
	private void pesanPeringatan(String pesan) {JOptionPane.showMessageDialog(this, pesan, "Peringatan", JOptionPane.WARNING_MESSAGE);}
	private void pesanError(String pesan) {JOptionPane.showMessageDialog(this,  pesan, "Kesalahan", JOptionPane.ERROR_MESSAGE);}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperasiAssignmentGUI_2511532023 frame = new OperasiAssignmentGUI_2511532023();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OperasiAssignmentGUI_2511532023() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(206, 232, 253));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERASI ASSIGNMENT");
		lblNewLabel.setBackground(new Color(119, 0, 170));
		lblNewLabel.setForeground(new Color(85, 31, 158));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(133, 11, 181, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cara kerja A1 = A1 (+, -, *, /, %) A2");
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_1.setBounds(128, 32, 201, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nilai A1 Awal");
		lblNewLabel_2.setForeground(new Color(119, 0, 170));
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(10, 58, 79, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Nilai A2");
		lblNewLabel_2_1.setForeground(new Color(119, 0, 170));
		lblNewLabel_2_1.setBounds(10, 83, 79, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Operator");
		lblNewLabel_2_2.setForeground(new Color(119, 0, 170));
		lblNewLabel_2_2.setBounds(10, 108, 79, 14);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Nilai A1 Akhir");
		lblNewLabel_2_3.setForeground(new Color(119, 0, 170));
		lblNewLabel_2_3.setBounds(10, 133, 79, 14);
		contentPane.add(lblNewLabel_2_3);
		
		JComboBox cbOp = new JComboBox();
		cbOp.setForeground(new Color(0, 0, 0));
		cbOp.setBackground(new Color(255, 255, 255));
		cbOp.setModel(new DefaultComboBoxModel(new String[] {"+=", "-=", "*=", "/=", "%="}));
		cbOp.setBounds(149, 104, 64, 22);
		contentPane.add(cbOp);
		
		txtA1 = new JTextField();
		txtA1.setBackground(new Color(255, 255, 255));
		txtA1.setBounds(149, 55, 64, 20);
		contentPane.add(txtA1);
		txtA1.setColumns(10);
		
		txtA2 = new JTextField();
		txtA2.setBackground(new Color(255, 255, 255));
		txtA2.setColumns(10);
		txtA2.setBounds(149, 80, 64, 20);
		contentPane.add(txtA2);
		
		txtAkhir = new JTextField();
		txtAkhir.setBackground(new Color(232, 232, 232));
		txtAkhir.setEditable(false);
		txtAkhir.setColumns(10);
		txtAkhir.setBounds(149, 130, 64, 20);
		contentPane.add(txtAkhir);
		
		JButton btnProses = new JButton("Proses");
		btnProses.setBackground(new Color(255, 255, 255));
		btnProses.setBounds(251, 104, 78, 22);
		contentPane.add(btnProses);
	
		btnProses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtA1.getText().trim().isEmpty() && mulai) {
					pesanPeringatan("Input Nilai A1 Awal Terlebih Dahulu!");
				} else if (txtA2.getText().trim().isEmpty()) {
					pesanPeringatan("Input Nilai A2 Terlebih Dahulu!");
				} else {
					try { if (mulai) {
						nilaiA1= Integer.parseInt(txtA1.getText());
						mulai= false;
						txtA1.setEditable(false);
						txtA1.setBackground(new Color(232, 232, 232));
					}
					
					int b = Integer.parseInt(txtA2.getText());
					int c = cbOp.getSelectedIndex();
					
					if (c==0) { nilaiA1 += b; }
					if (c==1) { nilaiA1 -= b; }
					if (c==2) { nilaiA1 *= b; }
					if (c==3) { nilaiA1 /= b; }
					if (c==4) { nilaiA1 %= b; }
					txtAkhir.setText(String.valueOf(nilaiA1));
				} catch (NumberFormatException ex) {
					pesanError("Bilangan harus Angka");
				}
			}
		}
	});
	JButton btnReset = new JButton("Reset");
	btnReset.setBackground(new Color(255, 255, 255));
	btnReset.setBounds(251, 129, 78, 22);
	contentPane.add(btnReset);
	
	btnReset.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			nilaiA1 = 0;
			mulai = true;
			txtA1.setText("");
			txtA2.setText("");
			txtAkhir.setText("");
			txtA1.setEditable(true);
			txtA1.setBackground(new Color(255, 255, 255));
		}
	});
	}
}

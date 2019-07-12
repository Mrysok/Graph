import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JRadioButton;

public class Home {

	private JFrame frame2;
	public int k=0;
	//public static double Gx=0,Gy=0;// xR,yR,R;
	private JTextField TFGx1;
	private JTextField TFGy1;
	private JTextField TFCx1;
	private JTextField TFCy1;
	private JTextField TFR1;
	private JTextField TFSx1;
	private JTextField TFS1_1;
	private JTextField TFSy1;
	private JTextField TFS2_1;
	private JTextField TFS3_1;
	private JCheckBox CBGip1,CBPar1,CBLine1,CBEll1,CBGip2;
	JPanel panel;
	MyPanel3 fg;
	boolean A,B,C,D;
	boolean Line1,Gip1,Par1,Ell1,Gip2,Par2;
	private JTextField TFR2;
	private JTextField TFGx2;
	private JTextField TFGy2;
	private JTextField TFCp1;
	private JTextField TGy2;
	private JTextField TGx2;
	private JLabel lblYx;
	private JCheckBox CBPar2;
	private JTextField TFCy2;
	private JTextField TFCx2;
	private JTextField TFCp2;
	private JLabel lblXy;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame2 = new JFrame("Построение графиков");
		frame2.setVisible(true);
		frame2.setBounds(50, 50, 880, 710);
		frame2.getContentPane().setLayout(null);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		fg = new MyPanel3();
		fg.setBounds(335, 29, 500, 600);
		fg.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
	    frame2.getContentPane().add(fg);
	    frame2.getContentPane().setLayout(null);
		
		TFGx1 = new JTextField();
		TFGx1.setBackground(UIManager.getColor("Button.background"));
		TFGx1.setBounds(31, 161, 25, 20);
		frame2.getContentPane().add(TFGx1);
		TFGx1.setColumns(10);
		
		TFGy1 = new JTextField();
		TFGy1.setBackground(UIManager.getColor("Button.background"));
		TFGy1.setBounds(112, 161, 25, 20);
		TFGy1.setColumns(10);
		frame2.getContentPane().add(TFGy1);
		
		TFCx1 = new JTextField();
		TFCx1.setBackground(UIManager.getColor("Button.background"));
		TFCx1.setBounds(114, 266, 25, 20);
		TFCx1.setColumns(10);
		frame2.getContentPane().add(TFCx1);
		
		TFCy1 = new JTextField();
		TFCy1.setBackground(UIManager.getColor("Button.background"));
		TFCy1.setBounds(33, 266, 25, 20);
		TFCy1.setColumns(10);
		frame2.getContentPane().add(TFCy1);
		
		TFR1 = new JTextField();
		TFR1.setBackground(UIManager.getColor("Button.background"));
		TFR1.setBounds(31, 457, 25, 20);
		TFR1.setColumns(10);
		frame2.getContentPane().add(TFR1);
		
		TFSx1 = new JTextField();
		TFSx1.setBackground(UIManager.getColor("Button.background"));
		TFSx1.setBounds(31, 481, 25, 20);
		TFSx1.setColumns(10);
		frame2.getContentPane().add(TFSx1);
		
		TFSy1 = new JTextField();
		TFSy1.setBackground(UIManager.getColor("Button.background"));
		TFSy1.setBounds(31, 504, 25, 20);
		TFSy1.setColumns(10);
		frame2.getContentPane().add(TFSy1);
		
		TFS1_1 = new JTextField();
		TFS1_1.setBackground(UIManager.getColor("Button.background"));
		TFS1_1.setBounds(47, 579, 25, 20);
		TFS1_1.setColumns(10);
		frame2.getContentPane().add(TFS1_1);
		
		TFS2_1 = new JTextField();
		TFS2_1.setBackground(UIManager.getColor("Button.background"));
		TFS2_1.setColumns(10);
		TFS2_1.setBounds(47, 610, 25, 20);
		frame2.getContentPane().add(TFS2_1);
		
	
		
		JButton btnClear = new JButton("\u041E\u0447\u0438\u0449\u0435\u043D\u0438\u0435");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CBPar1.setSelected(false);
				CBEll1.setSelected(false);
				CBLine1.setSelected(false);
				CBGip1.setSelected(false);
				CBGip2.setSelected(false);
				Gip2=false;
				Gip1=false;
				Par1=false;
				Line1=false;
				Ell1=false;
				fg.setNull();
				fg.repaint();//
			}
		});
		btnClear.setBounds(21, 72, 172, 23);
		frame2.getContentPane().add(btnClear);
		
		
		TFS3_1 = new JTextField();
		TFS3_1.setColumns(10);
		TFS3_1.setBackground(UIManager.getColor("Button.background"));
		TFS3_1.setBounds(47, 641, 25, 20);
		frame2.getContentPane().add(TFS3_1);
		
		
		TFR2 = new JTextField();
		TFR2.setColumns(10);
		TFR2.setBackground(SystemColor.menu);
		TFR2.setBounds(31, 535, 25, 20);
		frame2.getContentPane().add(TFR2);
		
		
		JButton btnBild = new JButton("\u0414\u043E\u0431\u0430\u0432\u0438\u0442\u044C \u0433\u0440\u0430\u0444\u0438\u043A");
		btnBild.setBounds(21, 29, 172, 23);
		btnBild.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if(Par1){
						double a1,b1,c1;
						String str = TFCx1.getText();
						a1=Double.parseDouble(str);
						str = TFCy1.getText();
						b1=Double.parseDouble(str);
						str = TFCp1.getText();
						c1=Double.parseDouble(str);
						fg.setPar1(k,-a1, b1,c1,1);
					}	
					if(Par2){
						double a1,b1,c1;
						String str = TFCx2.getText();
						a1=Double.parseDouble(str);
						str = TFCy2.getText();
						b1=Double.parseDouble(str);
						str = TFCp2.getText();
						c1=Double.parseDouble(str);
						fg.setPar1(k,a1, -b1,-c1,2);
					}	
					if(Line1){
						double a1,b1,c1;
						String str = TFS1_1.getText();
						a1 = Double.parseDouble(str);
						str = TFS2_1.getText();
						b1 = Double.parseDouble(str);
						str = TFS3_1.getText();
						c1 = Double.parseDouble(str);
						fg.setLine1(k,a1, b1, c1);
					}
					if(Gip1){
						double a1,b1,c1,d1;
						String str = TFGx1.getText();
						a1=Double.parseDouble(str);
						str = TFGy1.getText();
						b1=Double.parseDouble(str);
						str = TFGx2.getText();
						c1=Double.parseDouble(str);
						str = TFGy2.getText();
						d1=Double.parseDouble(str);
						fg.setGip1(k,a1, b1,-c1,-d1);
					}
					if(Gip2){
						double a1,b1;
						String str = TGx2.getText();
						a1=Double.parseDouble(str);
						str = TGy2.getText();
						b1=Double.parseDouble(str);
						fg.setGip2(k,a1, -b1);
					}
					if(Ell1){
						double a1,b1,c1,d1;
						String str = TFSx1.getText();
						a1=Double.parseDouble(str);
						str = TFSy1.getText();
						b1=Double.parseDouble(str);
						str = TFR1.getText();
						c1=Double.parseDouble(str);
						str = TFR2.getText();
						d1=Double.parseDouble(str);
						fg.setEll1(k,a1, b1, c1,d1);
					}
					fg.repaint();// перерисовка графика функции
					k++;}
				});
		frame2.getContentPane().add(btnBild);
		
		CBGip1 = new JCheckBox("\u0413\u0438\u043F\u0435\u0440\u0431\u043E\u043B\u0430 \u043A\u0430\u043D\u043E\u043D\u0438\u0447\u0435\u0441\u043A\u043E\u0433\u043E \u0432\u0438\u0434\u0430:");
		CBGip1.setBounds(15, 113, 301, 23);
		frame2.getContentPane().add(CBGip1);
		CBGip1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CBPar1.setSelected(false);
				CBEll1.setSelected(false);
				CBLine1.setSelected(false);
				CBGip2.setSelected(false);
				CBPar2.setSelected(false);
				Par2=false;
				Gip2=false;
				Gip1=true;
				Par1=false;
				Line1=false;
				Ell1=false;
			}
		});
		
	
		
	
		CBPar1 = new JCheckBox("\u041F\u0430\u0440\u0430\u0431\u043E\u043B\u0430 \u043F\u0435\u0440\u0432\u043E\u0433\u043E \u043A\u0430\u043D\u043E\u043D\u0438\u0447\u0435\u0441\u043A\u043E\u0433\u043E \u0432\u0438\u0434\u0430:");
		CBPar1.setBounds(15, 239, 301, 23);
		frame2.getContentPane().add(CBPar1);
		CBPar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CBEll1.setSelected(false);
				CBLine1.setSelected(false);
				CBGip1.setSelected(false);
				CBGip2.setSelected(false);
				CBPar2.setSelected(false);
				Par2=false;
				Gip2=false;
				Gip1=false;
				Par1=true;
				Line1=false;
				Ell1=false;
			}
		});
		
		CBLine1 = new JCheckBox("\u041B\u0438\u043D\u0438\u044F");
		CBLine1.setBounds(21, 549, 57, 23);
		frame2.getContentPane().add(CBLine1);
		CBLine1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent earg0) {
				CBPar1.setSelected(false);
				CBEll1.setSelected(false);
				CBGip1.setSelected(false);
				CBGip2.setSelected(false);
				CBPar2.setSelected(false);
				Par2=false;
				Gip2=false;
				Gip1=false;
				Par1=false;
				Line1=true;
				Ell1=false;
			}
		});
		
		CBEll1 = new JCheckBox("\u042D\u043B\u043B\u0438\u0438\u043F\u0441");
		CBEll1.setBounds(15, 350, 67, 23);
		frame2.getContentPane().add(CBEll1);
		CBEll1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CBLine1.setSelected(false);
				CBGip1.setSelected(false);
				CBGip2.setSelected(false);
				CBPar1.setSelected(false);
				CBPar2.setSelected(false);
				Par2=false;
				Gip1=false;
				Gip2=false;
				Par1=false;
				Line1=false;
				Ell1=true;
			}
		});
		
		CBGip2 = new JCheckBox("\u0413\u0438\u043F\u0435\u0440\u0431\u043E\u043B\u0430 \u043D\u0435\u043A\u0430\u043D\u043E\u043D\u0438\u0447\u0435\u0441\u043A\u043E\u0433\u043E \u0432\u0438\u0434\u0430:");
		CBGip2.setBounds(15, 188, 301, 23);
		frame2.getContentPane().add(CBGip2);
		CBGip2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CBPar1.setSelected(false);
				CBEll1.setSelected(false);
				CBLine1.setSelected(false);
				CBGip1.setSelected(false);
				CBPar2.setSelected(false);
				Par2=false;
				Gip2=true;
				Gip1=false;
				Par1=false;
				Line1=false;
				Ell1=false;
			}
		});
		
		CBPar2 = new JCheckBox("\u041F\u0430\u0440\u0430\u0431\u043E\u043B\u0430 \u0432\u0442\u043E\u0440\u043E\u0433\u043E \u043A\u0430\u043D\u043E\u043D\u0438\u0447\u0435\u0441\u043A\u043E\u0433\u043E \u0432\u0438\u0434\u0430:");
		CBPar2.setBounds(15, 293, 301, 23);
		frame2.getContentPane().add(CBPar2);
		CBPar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CBPar1.setSelected(false);
				CBEll1.setSelected(false);
				CBLine1.setSelected(false);
				CBGip1.setSelected(false);
				CBGip2.setSelected(false);
				Gip2=false;
				Gip1=false;
				Par1=false;
				Line1=false;
				Ell1=false;
				Par2=true;
			}
		});
		
		JLabel lblNewLabel = new JLabel("x+         ^2         y+         ^2");
		lblNewLabel.setBounds(21, 142, 142, 14);
		frame2.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("________   _   ________");
		label.setBounds(20, 146, 159, 14);
		frame2.getContentPane().add(label);
		
		JLabel label_1 = new JLabel(" ^2                       ^2");
		label_1.setBounds(52, 161, 111, 14);
		frame2.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("=1");
		label_2.setBounds(164, 152, 25, 14);
		frame2.getContentPane().add(label_2);
		
		TFGx2 = new JTextField();
		TFGx2.setColumns(10);
		TFGx2.setBackground(SystemColor.menu);
		TFGx2.setBounds(36, 139, 25, 20);
		frame2.getContentPane().add(TFGx2);
		
		TFGy2 = new JTextField();
		TFGy2.setColumns(10);
		TFGy2.setBackground(SystemColor.menu);
		TFGy2.setBounds(117, 139, 25, 20);
		frame2.getContentPane().add(TFGy2);
		
		TFCp1 = new JTextField();
		TFCp1.setColumns(10);
		TFCp1.setBackground(SystemColor.menu);
		TFCp1.setBounds(67, 266, 25, 20);
		frame2.getContentPane().add(TFCp1);
		
		JLabel lblNewLabel_1 = new JLabel("(y+         )*(x+         )=1");
		lblNewLabel_1.setBounds(21, 218, 142, 14);
		frame2.getContentPane().add(lblNewLabel_1);
		
		TGy2 = new JTextField();
		TGy2.setColumns(10);
		TGy2.setBackground(SystemColor.menu);
		TGy2.setBounds(40, 215, 25, 20);
		frame2.getContentPane().add(TGy2);
		
		TGx2 = new JTextField();
		TGx2.setColumns(10);
		TGx2.setBackground(SystemColor.menu);
		TGx2.setBounds(94, 215, 25, 20);
		frame2.getContentPane().add(TGx2);
		
		lblYx = new JLabel("y-         =         *(x-         )^2");
		lblYx.setBounds(21, 269, 142, 14);
		frame2.getContentPane().add(lblYx);
		
		
		
		
		
		TFCy2 = new JTextField();
		TFCy2.setColumns(10);
		TFCy2.setBackground(SystemColor.menu);
		TFCy2.setBounds(33, 323, 25, 20);
		frame2.getContentPane().add(TFCy2);
		
		TFCx2 = new JTextField();
		TFCx2.setColumns(10);
		TFCx2.setBackground(SystemColor.menu);
		TFCx2.setBounds(114, 323, 25, 20);
		frame2.getContentPane().add(TFCx2);
		
		TFCp2 = new JTextField();
		TFCp2.setColumns(10);
		TFCp2.setBackground(SystemColor.menu);
		TFCp2.setBounds(67, 323, 25, 20);
		frame2.getContentPane().add(TFCp2);
		
		lblXy = new JLabel("x-         =         *(y-         )^2");
		lblXy.setBounds(21, 326, 142, 14);
		frame2.getContentPane().add(lblXy);
		
		
		
		
		
	}
	}


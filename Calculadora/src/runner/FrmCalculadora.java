package runner;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JLabel;

public class FrmCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField txtMain;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn0;
	private JButton btnpoint;
	private JButton btnEquals;
	private JButton btnSum;
	private JButton btnMinus;
	private JButton btnMultiply;
	private JButton btnDivision;
	private JRadioButton rdbtnoff;
	private JRadioButton on;
	private JButton btnC;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCalculadora frame = new FrmCalculadora();
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
	public FrmCalculadora() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 256, 317);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtMain = new JTextField();
		txtMain.setFont(new Font("Consolas", Font.PLAIN, 16));
		txtMain.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMain.setBackground(Color.WHITE);
		txtMain.setBounds(10, 31, 214, 32);
		contentPane.add(txtMain);
		txtMain.setColumns(10);

		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtn7(e);
			}
		});
		btn7.setBounds(10, 107, 46, 32);
		contentPane.add(btn7);

		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtn8(e);
			}
		});
		btn8.setBounds(66, 107, 46, 32);
		contentPane.add(btn8);

		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtn9(e);
			}
		});
		btn9.setBounds(122, 107, 46, 32);
		contentPane.add(btn9);

		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtn4(e);
			}
		});
		btn4.setBounds(10, 150, 46, 32);
		contentPane.add(btn4);

		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtn5(e);
			}
		});
		btn5.setBounds(66, 150, 46, 32);
		contentPane.add(btn5);

		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtn6(e);
			}
		});
		btn6.setBounds(122, 150, 46, 32);
		contentPane.add(btn6);

		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionPerformedBtn1(arg0);
			}
		});
		btn1.setBounds(10, 193, 46, 32);
		contentPane.add(btn1);

		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtn2(e);
			}
		});
		btn2.setBounds(66, 193, 46, 32);
		contentPane.add(btn2);

		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtn3(e);
			}
		});
		btn3.setBounds(122, 193, 46, 32);
		contentPane.add(btn3);

		btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnDivision(e);
			}
		});
		btnDivision.setBounds(178, 74, 46, 32);
		contentPane.add(btnDivision);

		btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnMultiply(e);
			}
		});
		btnMultiply.setBounds(178, 117, 46, 32);
		contentPane.add(btnMultiply);

		btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnMinus(e);
			}
		});
		btnMinus.setBounds(178, 160, 46, 32);
		contentPane.add(btnMinus);

		btnSum = new JButton("+");
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnSum(e);
			}
		});
		btnSum.setBounds(178, 203, 46, 65);
		contentPane.add(btnSum);

		btnpoint = new JButton(".");
		btnpoint.setBounds(66, 236, 46, 32);
		contentPane.add(btnpoint);

		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtn0(e);
			}
		});
		btn0.setBounds(10, 236, 46, 32);
		contentPane.add(btn0);

		btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionPerformedBtnEquals(arg0);
			}
		});
		btnEquals.setBounds(122, 236, 46, 32);
		contentPane.add(btnEquals);

		btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnC(e);
			}
		});
		btnC.setBounds(122, 72, 46, 32);
		contentPane.add(btnC);

		on = new JRadioButton("On");
		on.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedOn(e);
			}
		});
		on.setBounds(10, 89, 46, 11);
		contentPane.add(on);

		rdbtnoff = new JRadioButton("Off");
		rdbtnoff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedRdbtnoff(e);
			}
		});
		rdbtnoff.setBounds(10, 75, 46, 11);
		contentPane.add(rdbtnoff);
		on.setEnabled(false);

		btnBack = new JButton("<-");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedBtnBack(e);
			}
		});
		btnBack.setBounds(66, 72, 46, 32);
		contentPane.add(btnBack);
		
		label = new JLabel("");
		label.setFont(new Font("Consolas", Font.BOLD, 12));
		label.setForeground(new Color(0, 0, 0));
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBackground(Color.WHITE);
		label.setBounds(66, 11, 158, 17);
		contentPane.add(label);
	}

	double ans, num;
	int calcu;
	private JLabel label;

	public void operaciones() {
		switch (calcu) 
		{
		case 1:
				ans = num+Double.parseDouble(txtMain.getText());
				txtMain.setText(Double.toString(ans));
				break;
		case 2:
			ans = num-Double.parseDouble(txtMain.getText());
			txtMain.setText(Double.toString(ans));
			break;
		case 3:
			ans = num*Double.parseDouble(txtMain.getText());
			txtMain.setText(Double.toString(ans));
			break;
		case 4:
			ans = num/Double.parseDouble(txtMain.getText());
			txtMain.setText(Double.toString(ans));
			break;
		}
	}

	protected void actionPerformedBtn1(ActionEvent arg0) {
		txtMain.setText(txtMain.getText() + "1");
	}

	protected void actionPerformedBtn2(ActionEvent e) {
		txtMain.setText(txtMain.getText() + "2");
	}

	protected void actionPerformedBtn3(ActionEvent e) {
		txtMain.setText(txtMain.getText() + "3");
	}

	protected void actionPerformedBtn4(ActionEvent e) {
		txtMain.setText(txtMain.getText() + "4");
	}

	protected void actionPerformedBtn5(ActionEvent e) {
		txtMain.setText(txtMain.getText() + "5");
	}

	protected void actionPerformedBtn6(ActionEvent e) {
		txtMain.setText(txtMain.getText() + "6");
	}

	protected void actionPerformedBtn9(ActionEvent e) {
		txtMain.setText(txtMain.getText() + "9");
	}

	protected void actionPerformedBtn7(ActionEvent e) {
		txtMain.setText(txtMain.getText() + "7");
	}

	protected void actionPerformedBtn8(ActionEvent e) {
		txtMain.setText(txtMain.getText() + "8");
	}

	protected void actionPerformedBtn0(ActionEvent e) {
		txtMain.setText(txtMain.getText() + "0");
	}

	protected void actionPerformedBtnSum(ActionEvent e) {
		num=Double.parseDouble(txtMain.getText());
		calcu=1;
		txtMain.setText("");
		label.setText(num+"+");
		
	}

	protected void actionPerformedOn(ActionEvent e) {
		able();

	}

	protected void actionPerformedBtnDivision(ActionEvent e) {
		num=Double.parseDouble(txtMain.getText());
		calcu=4;
		txtMain.setText("");
		label.setText(num+"/");
	}

	protected void actionPerformedBtnMultiply(ActionEvent e) {
		num=Double.parseDouble(txtMain.getText());
		calcu=3;
		txtMain.setText("");
		label.setText(num+"*");
	}

	protected void actionPerformedBtnMinus(ActionEvent e) {
		num=Double.parseDouble(txtMain.getText());
		calcu=2;
		txtMain.setText("");
		label.setText(num+"+");

	}

	public void disable() {
		btn0.setEnabled(false);
		btn1.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
		btn8.setEnabled(false);
		btn9.setEnabled(false);
		btnpoint.setEnabled(false);
		btnDivision.setEnabled(false);
		btnMultiply.setEnabled(false);
		btnSum.setEnabled(false);
		btnMinus.setEnabled(false);
		btnC.setEnabled(false);
		on.setEnabled(true);

	}

	public void able() {
		btn0.setEnabled(true);
		btn1.setEnabled(true);
		btn2.setEnabled(true);
		btn3.setEnabled(true);
		btn4.setEnabled(true);
		btn5.setEnabled(true);
		btn6.setEnabled(true);
		btn7.setEnabled(true);
		btn8.setEnabled(true);
		btn9.setEnabled(true);
		btnpoint.setEnabled(true);
		btnDivision.setEnabled(true);
		btnMultiply.setEnabled(true);
		btnSum.setEnabled(true);
		btnMinus.setEnabled(true);
		btnC.setEnabled(true);

	}

	protected void actionPerformedRdbtnoff(ActionEvent e) {
		disable();
	}

	protected void actionPerformedBtnBack(ActionEvent e) {
		int number = txtMain.getText().length() - 1;
		String store;
		int lenght = txtMain.getText().length();

		if (lenght > 0) {
			StringBuilder back = new StringBuilder(txtMain.getText());
			back.deleteCharAt(number);
			store = back.toString();
			txtMain.setText(store);

		}
	}
	protected void actionPerformedBtnEquals(ActionEvent arg0) {
		operaciones();
	}
	protected void actionPerformedBtnC(ActionEvent e) {
		txtMain.setText("");
		label.setText("");
	}
}

package es.deusto.ingenieria.sd.strava.client.gui.GraphicalWindows;
import javax.swing.*;

import es.deusto.ingenieria.sd.strava.client.gui.HomeWindow;
import es.deusto.ingenieria.sd.strava.client.gui.LoginDialog;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegisterSNW extends JFrame{

    private JPanel principal;
    private JTextField JTmail;
    private JPasswordField JTpassword;
    private JTextField name;
    private JSpinner day;
    private JSpinner month;
    private JSpinner year;
    private JSpinner weight;
    private JSpinner height;
    private JSpinner MaxHR;
    private JSpinner MinHR;
    private JButton backButton;
    private JButton registerButton;
    private LoginDialog l;
    private HomeWindow h;
    private int i;

	private String mail;
	private String password;

    public RegisterSNW(int i,LoginDialog l,HomeWindow h,String mail, String password) {
    	this.l = l;
    	this.h = h;
    	this.i = i;
    	this.mail = mail;
    	this.password = password;
    	$$$setupUI$$$();
    	System.out.println("   ~ credentials "+this.mail+"   "+this.password);
    	setContentPane(this.principal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(370, 600);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);        
    	
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	dispose();
            	(new WelcomeW(l,h,mail, password)).setVisible(true);
            }
        });
        
        registerButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			@Override
            public void actionPerformed(ActionEvent e) {
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");	
				Date d1 = null;
				try {
					d1 = format.parse( year.getValue()+"-"+month.getValue()+"-"+day.getValue() );
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}  
				System.out.println(d1);
				l.register(i, JTmail.getText(), JTpassword.getText(), name.getText(), d1,(double)((int)weight.getValue()/100), (int)height.getValue(), (int)MinHR.getValue(), (int)MaxHR.getValue());
                dispose();
        		new HomeW(h.getUser(l.getToken()),l,h);
            }
        });
    }

	/**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        principal = new JPanel();
        principal.setLayout(new GridBagLayout());
        principal.setOpaque(true);
        principal.setPreferredSize(new Dimension(370, 600));
        final JPanel spacer1 = new JPanel();
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.VERTICAL;
        principal.add(spacer1, gbc);
        final JPanel spacer2 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        principal.add(spacer2, gbc);
        JTmail = new JTextField();
        JTmail.setText(mail);
        JTmail.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.weightx = 0.2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        principal.add(JTmail, gbc);
        final JLabel label1 = new JLabel();
        label1.setText("Email:");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        principal.add(label1, gbc);
        final JLabel label2 = new JLabel();
        label2.setText("Password:");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        principal.add(label2, gbc);
        JTpassword = new JPasswordField();
        JTpassword.setText(password);
        JTpassword.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        principal.add(JTpassword, gbc);
        name = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        principal.add(name, gbc);
        final JLabel label3 = new JLabel();
        label3.setText("Name:");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        principal.add(label3, gbc);
        final JLabel label4 = new JLabel();
        label4.setText("Birthday:");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        principal.add(label4, gbc);
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        principal.add(panel1, gbc);
        day = new JSpinner();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(day, gbc);
        month = new JSpinner();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(month, gbc);
        year = new JSpinner();
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(year, gbc);
        final JLabel label5 = new JLabel();
        label5.setText("Weight:");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.WEST;
        principal.add(label5, gbc);
        final JLabel label6 = new JLabel();
        label6.setText("Height:");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.WEST;
        principal.add(label6, gbc);
        weight = new JSpinner();
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        principal.add(weight, gbc);
        height = new JSpinner();
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        principal.add(height, gbc);
        MaxHR = new JSpinner();
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        principal.add(MaxHR, gbc);
        MinHR = new JSpinner();
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 8;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        principal.add(MinHR, gbc);
        final JLabel label7 = new JLabel();
        label7.setText("Maximum heart rate:");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 7;
        gbc.anchor = GridBagConstraints.WEST;
        principal.add(label7, gbc);
        final JLabel label8 = new JLabel();
        label8.setText("Resting heart rate:");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 8;
        gbc.anchor = GridBagConstraints.WEST;
        principal.add(label8, gbc);
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.BOTH;
        principal.add(panel2, gbc);
        final JLabel label9 = new JLabel();
        label9.setText("Register");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panel2.add(label9, gbc);
        final JPanel spacer3 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel2.add(spacer3, gbc);
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 10;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.BOTH;
        principal.add(panel3, gbc);
        backButton = new JButton();
        backButton.setText("Back");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(backButton, gbc);
        final JPanel spacer4 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(spacer4, gbc);
        final JPanel spacer5 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel3.add(spacer5, gbc);
        registerButton = new JButton();
        registerButton.setText("Register");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(registerButton, gbc);
        final JPanel spacer6 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 9;
        gbc.fill = GridBagConstraints.VERTICAL;
        principal.add(spacer6, gbc);
    }
}


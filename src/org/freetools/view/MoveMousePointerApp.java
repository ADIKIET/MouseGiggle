package org.freetools.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.freetools.businessLogic.AppStart;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MoveMousePointerApp extends JFrame {

	private JPanel contentPane;
	private JTextField timeInMinutes;
	private AppStart obj;
	private JTextField applicationConsole;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MoveMousePointerApp frame = new MoveMousePointerApp();
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
	public MoveMousePointerApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 383, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSetTimeout = new JLabel("Set TimeOut in Minutes");
		lblSetTimeout.setBounds(12, 0, 206, 35);
		contentPane.add(lblSetTimeout);
		
		timeInMinutes = new JTextField();
		timeInMinutes.setBounds(12, 36, 206, 38);
		contentPane.add(timeInMinutes);
		timeInMinutes.setColumns(10);
		
		JButton btnStart = new JButton("START");
		btnStart.setBounds(12, 87, 97, 25);
		contentPane.add(btnStart);
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					//Start Event Logic
					String strTimeOut = timeInMinutes.getText();
					Integer minutes = Integer.parseInt(strTimeOut);
					obj = new AppStart(minutes);
					obj.taskScheduler();
					
					applicationConsole.setText("Application Running");
					
			 	}
			 });
		
		JButton btnStop = new JButton("STOP");
		btnStop.setBounds(121, 87, 97, 25);
		contentPane.add(btnStop);
	
		
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//Stop Event Logic 
			applicationConsole.setText("Application Terminating");
			System.out.println("Application Terminates");
	        System.exit(0);
			
	 	}
	 });
		
		applicationConsole = new JTextField();
		applicationConsole.setBounds(12, 160, 341, 58);
		contentPane.add(applicationConsole);
		applicationConsole.setColumns(10);
		applicationConsole.setText("Application Started");
		
		JLabel lblApplicationStatus = new JLabel("Application Status");
		lblApplicationStatus.setBounds(12, 131, 206, 16);
		contentPane.add(lblApplicationStatus);
		
	}
}

package com.bit.Day0623;

import java.sql.*;
import java.util.Properties;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

import javax.swing.JTextField;

public class Ex01 extends JFrame {

	JLabel[] table = new JLabel[50];
	
	
	
	
	private JPanel contentPane;
	private JTextField addNumtf;
	private JTextField addNametf;
	private JTextField addKortf;
	private JTextField addEngtf;
	private JTextField addMathtf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex01 frame = new Ex01();
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
	public Ex01() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 814, 688);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel label = new JLabel("학생성적관리프로그램 (ver 0.4.0)");
		label.setFont(new Font("맑은 고딕", Font.BOLD, 24));
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.WEST);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.EAST);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JButton btn1 = new JButton("전체보기");
		GridBagConstraints gbc_btn1 = new GridBagConstraints();
		gbc_btn1.fill = GridBagConstraints.BOTH;
		gbc_btn1.insets = new Insets(0, 0, 5, 0);
		gbc_btn1.gridx = 0;
		gbc_btn1.gridy = 1;
		panel_2.add(btn1, gbc_btn1);
		
		JButton btn2 = new JButton("입력");
		GridBagConstraints gbc_btn2 = new GridBagConstraints();
		gbc_btn2.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn2.insets = new Insets(0, 0, 5, 0);
		gbc_btn2.gridx = 0;
		gbc_btn2.gridy = 3;
		panel_2.add(btn2, gbc_btn2);
		
		JButton btn3 = new JButton("수정");
		GridBagConstraints gbc_btn3 = new GridBagConstraints();
		gbc_btn3.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn3.insets = new Insets(0, 0, 5, 0);
		gbc_btn3.gridx = 0;
		gbc_btn3.gridy = 6;
		panel_2.add(btn3, gbc_btn3);
		
		JButton btn4 = new JButton("삭제");
		GridBagConstraints gbc_btn4 = new GridBagConstraints();
		gbc_btn4.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn4.insets = new Insets(0, 0, 5, 0);
		gbc_btn4.gridx = 0;
		gbc_btn4.gridy = 9;
		panel_2.add(btn4, gbc_btn4);
		
		JButton btn5 = new JButton("종료");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		GridBagConstraints gbc_btn5 = new GridBagConstraints();
		gbc_btn5.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn5.gridx = 0;
		gbc_btn5.gridy = 11;
		panel_2.add(btn5, gbc_btn5);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.SOUTH);
		
		JPanel center = new JPanel();
		
		
		
		contentPane.add(center, BorderLayout.CENTER);
		center.setLayout(new GridLayout(11, 5, 0, 0));
		
		
		
		
		JLabel label1 = new JLabel("학번");
		center.add(label1);
		
		JLabel label2 = new JLabel("이름");
		center.add(label2);
		
		JLabel label3 = new JLabel("국어");
		center.add(label3);
		
		JLabel label4 = new JLabel("영어");
		center.add(label4);
		
		JLabel label5 = new JLabel("수학");
		center.add(label5);
		
		for(int i=0; i<table.length; i++){
			table[i]=new JLabel();
			center.add(table[i]);
		}
		
		
		
		JPanel center2 =new JPanel();
		contentPane.add(center2, BorderLayout.CENTER);
		
		GridBagLayout gbl_center2 = new GridBagLayout();
		gbl_center2.columnWidths = new int[] {50, 0, 0};
		gbl_center2.rowHeights = new int[]{30, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_center2.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_center2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		center2.setLayout(gbl_center2);
		
		JLabel label_1 = new JLabel("입력페이지");
		label_1.setFont(new Font("맑은 고딕", Font.BOLD, 19));
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 0);
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 0;
		center2.add(label_1, gbc_label_1);
		
		JLabel lblNewLabel = new JLabel("학번");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		center2.add(lblNewLabel, gbc_lblNewLabel);
		
		addNumtf = new JTextField();
		GridBagConstraints gbc_addNumtf = new GridBagConstraints();
		gbc_addNumtf.insets = new Insets(0, 0, 5, 0);
		gbc_addNumtf.fill = GridBagConstraints.HORIZONTAL;
		gbc_addNumtf.gridx = 1;
		gbc_addNumtf.gridy = 1;
		center2.add(addNumtf, gbc_addNumtf);
		addNumtf.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("이름");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		center2.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		addNametf = new JTextField();
		GridBagConstraints gbc_addNametf = new GridBagConstraints();
		gbc_addNametf.insets = new Insets(0, 0, 5, 0);
		gbc_addNametf.fill = GridBagConstraints.HORIZONTAL;
		gbc_addNametf.gridx = 1;
		gbc_addNametf.gridy = 2;
		center2.add(addNametf, gbc_addNametf);
		addNametf.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("국어");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 3;
		center2.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		addKortf = new JTextField();
		GridBagConstraints gbc_addKortf = new GridBagConstraints();
		gbc_addKortf.insets = new Insets(0, 0, 5, 0);
		gbc_addKortf.fill = GridBagConstraints.HORIZONTAL;
		gbc_addKortf.gridx = 1;
		gbc_addKortf.gridy = 3;
		center2.add(addKortf, gbc_addKortf);
		addKortf.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("영어");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 4;
		center2.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		addEngtf = new JTextField();
		GridBagConstraints gbc_addEngtf = new GridBagConstraints();
		gbc_addEngtf.insets = new Insets(0, 0, 5, 0);
		gbc_addEngtf.fill = GridBagConstraints.HORIZONTAL;
		gbc_addEngtf.gridx = 1;
		gbc_addEngtf.gridy = 4;
		center2.add(addEngtf, gbc_addEngtf);
		addEngtf.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("수학");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 5;
		center2.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		addMathtf = new JTextField();
		GridBagConstraints gbc_addMathtf = new GridBagConstraints();
		gbc_addMathtf.insets = new Insets(0, 0, 5, 0);
		gbc_addMathtf.fill = GridBagConstraints.HORIZONTAL;
		gbc_addMathtf.gridx = 1;
		gbc_addMathtf.gridy = 5;
		center2.add(addMathtf, gbc_addMathtf);
		addMathtf.setColumns(10);
		
		JButton addBtn = new JButton("입력");
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_addBtn = new GridBagConstraints();
		gbc_addBtn.fill = GridBagConstraints.BOTH;
		gbc_addBtn.insets = new Insets(0, 0, 5, 0);
		gbc_addBtn.gridx = 1;
		gbc_addBtn.gridy = 6;
		center2.add(addBtn, gbc_addBtn);
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane.add(center, BorderLayout.CENTER);
				
				center.setVisible(true);
				center2.setVisible(false);
				
				String sql ="select * from student01";
				new oracle.jdbc.driver.OracleDriver();
				String url="jdbc:oracle:thin:@localhost:1521:xe";
				
				java.util.Properties prop = new Properties();
				prop.setProperty("user", "scott");
				prop.setProperty("password", "tiger");
				
				Connection conn =null;
				Statement stmt =null;
				ResultSet rs=null;
				
				try {
					conn =DriverManager.getConnection(url,prop);
					stmt = conn.createStatement();
					rs =stmt.executeQuery(sql);
					
					int cnt=0;
					while(rs.next()){
						
						for(int i=1;i<6;i++){
							table[cnt++].setText(rs.getString(i));
						}
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}finally{
					try {
						if(stmt!=null)stmt.close();
						if(conn!=null)conn.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
				
				
			}
		});
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				contentPane.add(center2, BorderLayout.CENTER);
				center.setVisible(false);
				center2.setVisible(true);
			}
		});
		
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String param1=addNumtf.getText();
				String param2=addNametf.getText();
				String param3=addKortf.getText();
				String param4=addEngtf.getText();
				String param5=addMathtf.getText();
				
				addNumtf.setText("");
				addNametf.setText("");
				addKortf.setText("");
				addEngtf.setText("");
				addMathtf.setText("");
				
				String sql="insert into student01 values ("+param1+",'"+param2+"',"+param3+","+param4+","+param5+")";
//				System.out.println(sql);
				String url="jdbc:oracle:thin:@localhost:1521:xe";
				Properties prop =new Properties();
				prop.setProperty("user", "scott");
				prop.setProperty("password","tiger");
				new oracle.jdbc.driver.OracleDriver();
				
				Connection conn=null;
				Statement stmt=null;
				
				try {
					conn=DriverManager.getConnection(url,prop);
					stmt=conn.createStatement();
					stmt.executeQuery(sql);
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}finally{
					
						try {
							if(stmt!=null)stmt.close();
							if(conn!=null)conn.close();
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
				}
				
				
				
			}
		});
	}

}

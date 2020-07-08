package com.bit.day23;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Ex17 extends Frame implements ActionListener,WindowListener{

   TextArea ta;
   MenuItem mn1_1,mn1_2,mn1_3,mn1_4,mn2_1;
   FileDialog diaOpen,diaSave;
   Ex17 ex17;

   public Ex17(){

      this.addWindowListener(this);
      
      ta= new TextArea();
      ta.setSize(getWidth(), getHeight());
      add(ta);
      
      MenuBar mb= new MenuBar();
      Menu mn1 =new Menu("파일");
      mn1_1 =new MenuItem("새파일");
      mn1_2 =new MenuItem("열기");
      mn1_3 =new MenuItem("저장");
      mn1_4 =new MenuItem("종료");
      
      mn1.add(mn1_1);
      mn1.addSeparator();
      mn1.add(mn1_2);
      mn1.add(mn1_3);
      mn1.addSeparator();
      mn1.add(mn1_4);
      
      mb.add(mn1);
      
      Menu mn2 =new Menu("도움말");
      mn2_1 =new MenuItem("정보");
      
      mn1_1.addActionListener(this);
      mn1_2.addActionListener(this);
      mn1_3.addActionListener(this);
      mn1_4.addActionListener(this);
      mn2_1.addActionListener(this);
      
      mn2.add(mn2_1);
      mb.add(mn2);
      
      setTitle("제목 없음");
      setMenuBar(mb);
      
      setSize(500, 300);
      setLocation(300, 200);
      setVisible(true);
   }
   public static void main(String[] args) {
      new Ex17();
   }
   public void mouseClicked(MouseEvent e) {
      System.out.println("mouseClicked");
   }
   public void mousePressed(MouseEvent e) {
      System.out.println("mousePressed");
   }
   @Override
   public void windowOpened(WindowEvent e) {
//      System.out.println("windowOpened");
   }
   @Override
   public void windowClosing(WindowEvent e) {
      dispose();
   }
   @Override
   public void windowClosed(WindowEvent e) {
   }
   @Override
   public void windowIconified(WindowEvent e) {
      System.out.println("windowIconified"+e);
      
   }
   @Override
   public void windowDeiconified(WindowEvent e) {
      System.out.println("windowDeiconified");
   }
   @Override
   public void windowActivated(WindowEvent e) {
//      System.out.println("windowActivated");
   }
   @Override
   public void windowDeactivated(WindowEvent e) {
   }
   @Override
   public void actionPerformed(ActionEvent e) {
      if(e.getSource() == mn2_1){
         Dialog imp = new Dialog(this,"정보");
         imp.setSize(200,200);
         imp.setLocation(this.getX()+160,this.getY()+80);
         
         imp.addWindowListener(new WindowAdapter() {
        	 @Override
        	public void windowClosing(WindowEvent e) {
        		 imp.dispose();
        	}
		});
         
         
         
         imp.setLayout(new GridLayout(4,1));
         Label label1 = new Label("by 이성범",Label.CENTER);
         Label label2 = new Label("( ver 0.0.1 )",Label.CENTER);
         Label label3 = new Label("  2020.06.07  ",Label.CENTER);
         
         Button bt = new Button("Exit");
         
         bt.setSize(10,10);
         bt.setLocation(imp.getWidth()/2, 150);
         imp.add(label1);
         imp.add(label2);
         imp.add(label3);
         imp.add(bt);
         
         bt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               imp.dispose();
            }
         });
         imp.setVisible(true);
         
      }else if(e.getSource() == mn1_1){

    	  
      }else if(e.getSource() == mn1_2){
    	 diaOpen = new FileDialog(this,"Open",0);
         diaOpen.setVisible(true);
         String path = diaOpen.getDirectory();
         System.out.println(path);
         System.out.println("----------------");
         path +=diaOpen.getFile();
         System.out.println(path);
         File openFile =new File(path);
         FileInputStream fis = null;
         ArrayList<Byte> temp = new ArrayList<>();
         try {
        	 fis =new FileInputStream(openFile);
        	 
        	 while(true){
        		 int su = fis.read();
        		 if(su==-1){break;}
        		 temp.add((byte)su);
        	 }
        	 
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}finally{
			if(fis!=null){
				try {
					fis.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		}
         Object[] objs = temp.toArray();
         byte[] by = new byte[objs.length];
         for(int i=0; i<objs.length;i++){
        	 by[i] = (byte)objs[i];
         }
         ta.setText(new String(by));
         
         
      }else if(e.getSource() == mn1_3){
    	 diaSave =new FileDialog(this,"Save",FileDialog.SAVE);
         diaSave.setVisible(true);
         
         String path = diaSave.getDirectory();
         path +="\\"+diaSave.getFile();
         File saveFile = new File(path);
         if(!saveFile.exists()){
        	 try {
				saveFile.createNewFile();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
         }
         String msg = ta.getText();
         byte[] by = msg.getBytes();
         
         FileOutputStream fos=null;
         try {
			fos =new FileOutputStream(saveFile);
			for(int i=0;i<by.length;i++){
				fos.write((int)by[i]);
			}
			
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}finally{
			if(fos!=null){
				try {
					fos.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
         
         
      }else if(e.getSource() == mn1_4){
         dispose();
      }
   }

}












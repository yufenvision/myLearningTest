package io.io_Reader_Writter;

import java.awt.FileDialog;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;

import javax.swing.JFrame;

public class NotePad {

	public static void main(String[] args) {
		final JFrame f = new JFrame("�߼����±�");
		
		MenuBar mb = new MenuBar();
		Menu file = new Menu("�ļ�");
		MenuItem open = new MenuItem("��");
		MenuItem save = new MenuItem("����");
		
		file.add(open);
		file.add(save);
		mb.add(file);
		f.setMenuBar(mb);
		
		final TextArea ta = new TextArea();
		f.add(ta);
		
		//��Ӽ���
		open.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FileDialog fd = new FileDialog(f);
				fd.setVisible(true);
				
				//����һ���������Ķ���׼����ȡ����
				try {
					InputStream is = new FileInputStream(fd.getDirectory()+fd.getFile());
					//��ȡ����
					
					byte[] b = new byte[10];
					int len;
					while((len = is.read(b)) != -1){
						//System.out.println(new String(b,0,len));
						ta.append(new String(b,0,len));
					}
					is.close();
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		//��ӱ���
		save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FileDialog fd1 = new FileDialog(f);
				fd1.setVisible(true);
				//����һ�����������
				try {
					Writer ot = new FileWriter(fd1.getDirectory());
					
					ot.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		f.setSize(400, 500);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}

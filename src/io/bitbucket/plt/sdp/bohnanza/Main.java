package io.bitbucket.plt.sdp.bohnanza;

import javax.swing.JButton;
import javax.swing.JFrame;

import io.bitbucket.plt.sdp.bohnanza.gui.Color;
import io.bitbucket.plt.sdp.bohnanza.gui.GUI;
import io.bitbucket.plt.sdp.bohnanza.gui.Size;

import java.awt.event.ActionEvent;


public class Main {
  
  /**
 * @param args
 */
public static void main(String[] args) {

		
		  GUI gui = new GUI(new Size(1000, 800), new Size(60, 80), new Color(50,50,50),
		  new Color(255,255,255));

		  new Thread(new Game(gui, args)).start();

		  gui.start();


/*	JFrame f=new JFrame("Welcome to Bonanza Game"); JButton b=new
			JButton("Click Here"); b.setBounds(50,100,95,30); f.add(b);
	f.setSize(400,400); f.setLayout(null); f.setVisible(true);*/

  }
	  public void actionPerformed(ActionEvent e){
	  }
  }



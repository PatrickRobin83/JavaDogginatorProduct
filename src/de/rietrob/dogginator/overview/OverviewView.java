/**
 * -----------------------------------------------------------------------------
 *	  
 *	 Projectname	:	Dogginator_Product 
 *   Filename		:   OverviewView.java
 *   Date			:   14.07.2019
 *   All rights reserved
 * 
 * -----------------------------------------------------------------------------
 * @author     Patrick Robin <support@rietrob.de>
 * @since      1.0.0
 */
package de.rietrob.dogginator.overview;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

@SuppressWarnings("serial")
public class OverviewView extends JPanel {
	public OverviewView() {
		
		JLabel lbl_headline = new JLabel("\u00DCbersicht");
		lbl_headline.setForeground(Color.WHITE);
		lbl_headline.setFont(new Font("Tahoma", Font.PLAIN, 40));
		add(lbl_headline);
		Color bg = Color.black;
		this.setBackground(bg);
	}
	
}
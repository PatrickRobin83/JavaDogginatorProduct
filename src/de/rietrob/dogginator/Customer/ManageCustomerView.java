/**
 * -----------------------------------------------------------------------------
 *	  
 *	 Projectname	:	Dogginator_Product 
 *   Filename		:   ManageCustomerView.java
 *   Date			:   20.07.2019
 *   All rights reserved
 * 
 * -----------------------------------------------------------------------------
 * @author     Patrick Robin <support@rietrob.de>
 * @since      1.0.0
 */
package de.rietrob.dogginator.Customer;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ManageCustomerView extends JPanel {
	
	public ManageCustomerView() {
		
		JLabel lbl_headline = new JLabel("Kunden Verwaltung");
		lbl_headline.setForeground(Color.WHITE);
		lbl_headline.setFont(new Font("Tahoma", Font.PLAIN, 40));
		add(lbl_headline);
		Color bg = Color.black;
		this.setBackground(bg);
		this.setName("Das ist das KundenverwaltungsPanel");
	}
	
}

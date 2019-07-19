/**
 * -----------------------------------------------------------------------------
 *	  
 *	 Projectname	:	Dogginator_Product 
 *   Filename		:   GlobalConfig.java
 *   Date			:   19.07.2019
 *   All rights reserved
 * 
 * -----------------------------------------------------------------------------
 * @author     Patrick Robin <support@rietrob.de>
 * @since      1.0.0
 */
package de.rietrob.dogginator.Library;

import javax.swing.JPanel;

public class GlobalConfig {
	
	private static GlobalConfig instance;
	
	private GlobalConfig() {
		
	}
	
	public static GlobalConfig getInstance() {
		if(instance == null) {
			GlobalConfig.instance = new GlobalConfig();
		}
		return GlobalConfig.instance;
	}
	
	
	public void changeView(JPanel parentPanel, JPanel viewToDisplay) {
		parentPanel.removeAll();
		parentPanel.add(viewToDisplay);
		parentPanel.revalidate();
		parentPanel.repaint();
		
	}
	
}

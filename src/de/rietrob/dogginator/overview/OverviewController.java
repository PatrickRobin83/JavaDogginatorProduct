/**
 * -----------------------------------------------------------------------------
 *	  
 *	 Projectname	:	Dogginator_Product 
 *   Filename		:   OverviewController.java
 *   Date			:   14.07.2019
 *   All rights reserved
 * 
 * -----------------------------------------------------------------------------
 * @author     Patrick Robin <support@rietrob.de>
 * @since      1.0.0
 */
package de.rietrob.dogginator.overview;

import java.awt.Dimension;

import javax.swing.JPanel;

public class OverviewController {
	
	private OverviewView _overView;
	
	public OverviewController() {
		this._overView = new OverviewView();
		_overView.setVisible(true);
		_overView.setEnabled(true);
		Dimension dim = new Dimension(1236, 842);
		_overView.setPreferredSize(dim);
		
	}
	
	public JPanel getOverviewView() {
		return this._overView;
	}
	
	
	
}

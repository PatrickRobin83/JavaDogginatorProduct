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

import javax.swing.JPanel;

public class OverviewController {
	
	private OverviewView _overView;
	
	public OverviewController() {
		this._overView = new OverviewView();
	}
	
	public JPanel getOverviewView() {
		return _overView;
	}
	
	
	
}

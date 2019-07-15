/**
 * -----------------------------------------------------------------------------
 *	  
 *	 Projectname	:	Dogginator_Product 
 *   Filename		:   ApplicationStart.java
 *   Date			:   14.07.2019
 *   All rights reserved
 * 
 * -----------------------------------------------------------------------------
 * @author     Patrick Robin <support@rietrob.de>
 * @since      1.0.0
 */
package de.rietrob.dogginator.Main;

public class ApplicationStart {
	static ShellController shellController;
	
	public static void main(String[] args) {
		shellController = new ShellController();
        shellController.showShellView();
		
	}
	
}

/**
 * -----------------------------------------------------------------------------
 *	  
 *	 Projectname	:	Dogginator_Product 
 *   Filename		:   ManageCustomerController.java
 *   Date			:   20.07.2019
 *   All rights reserved
 * 
 * -----------------------------------------------------------------------------
 * @author     Patrick Robin <support@rietrob.de>
 * @since      1.0.0
 */
package de.rietrob.dogginator.Customer;

import javax.swing.JPanel;

public class ManageCustomerController {
	
private ManageCustomerView _manageCustomerView;
	
	public ManageCustomerController() {
	
		this._manageCustomerView = new ManageCustomerView();
		_manageCustomerView.setVisible(true);
	}
	
	public JPanel getManageCustomerView() {
		return _manageCustomerView;
	}
	
}

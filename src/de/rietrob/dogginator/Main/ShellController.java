/**
 * -----------------------------------------------------------------------------
 *	  
 *	 Projectname	:	Dogginator_Product 
 *   Filename		:   ShellController.java
 *   Date			:   14.07.2019
 *   All rights reserved
 * 
 * -----------------------------------------------------------------------------
 * @author     Patrick Robin <support@rietrob.de>
 * @since      1.0.0
 */
package de.rietrob.dogginator.Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import de.rietrob.dogginator.Customer.ManageCustomerController;
import de.rietrob.dogginator.Library.GlobalConfig;
import de.rietrob.dogginator.overview.OverviewController;

public class ShellController {
	
	private ShellViewView _shellView;
	private OverviewController _overview;
	private ManageCustomerController _manageCustomerController;
	
    public ShellController(){
        this._shellView = new ShellViewView();
        addListener();
        _overview = new OverviewController();
        _manageCustomerController = new ManageCustomerController();
        GlobalConfig.getInstance().changeView(_shellView.getContentPanel(), _overview.getOverviewView());
    }
    
    public void showShellView(){
        this._shellView.setVisible(true);
    }
    
    private void addListener(){
        this._shellView.OpenOverviewListener(new OverViewListener());
        this._shellView.OpenCustomersListener(new ManageCustomerListener());
        this._shellView.OpenDogsListener(new ManageDogsListener());
        this._shellView.OpenAppointmentListener(new ManageAppointmentListener());
        this._shellView.OpenConsistedBookListener(new ConsistedBookListener());
        this._shellView.OpenProductsListener(new ManageProductsListener());
        this._shellView.OpenInvoicesListener(new ManageInvoicesListener());
        this._shellView.LogoutUserListener(new LogoutUserListener());
        this._shellView.CloseApplicationListener(new CloseListener());
    }
    
    class OverViewListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e){
            	
            	GlobalConfig.getInstance().changeView(_shellView.getContentPanel(), _overview.getOverviewView());
            }
    }
    
    class ManageCustomerListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e){
            	GlobalConfig.getInstance().changeView(_shellView.getContentPanel(), _manageCustomerController.getManageCustomerView());
                System.out.println("Kunden Verwaltung laden");
            }
    }
    
    class ManageDogsListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Hunde Verwaltung laden");
            }
    }
    
    class ManageAppointmentListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Termin Verwaltung laden");
            }
    }
    
    class ConsistedBookListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Bestandsbuch laden");
            }
    }
    
    class ManageProductsListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Produkt Verwaltung laden");
            }
    }
    
    class ManageInvoicesListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Rechnugs Verwaltung laden");
            }
    }
    
    class LogoutUserListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Benutzer ausloggen");
            }
    }
    
    class CloseListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.err.println("Button Exit Click!");
            System.exit(0);
        }
    }
}

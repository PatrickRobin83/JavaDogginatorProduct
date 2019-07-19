/**
 * -----------------------------------------------------------------------------
 *	  
 *	 Projectname	:	Dogginator_Product 
 *   Filename		:   ShellViewView.java
 *   Date			:   14.07.2019
 *   All rights reserved
 * 
 * -----------------------------------------------------------------------------
 * @author     Patrick Robin <support@rietrob.de>
 * @since      1.0.0
 */
package de.rietrob.dogginator.Main;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Dimension;
import java.awt.CardLayout;

@SuppressWarnings("serial")
public class ShellViewView extends JFrame {
	
	public ShellViewView() {
        initComponents();
    }
    
    private void initComponents() {
        pan_MainMenu = new javax.swing.JPanel();
        btn_exit = new javax.swing.JButton();
        btn_overview = new javax.swing.JButton();
        btn_manageDogs = new javax.swing.JButton();
        btn_manageCustomer = new javax.swing.JButton();
        btn_manageAppointments = new javax.swing.JButton();
        btn_consistedBook = new javax.swing.JButton();
        btn_manageProducts = new javax.swing.JButton();
        btn_manageInvoices = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dogginator");
        setPreferredSize(new java.awt.Dimension(1236, 842));
        setResizable(false);

        btn_exit.setText("Beenden");

        btn_overview.setText("Übersicht");

        btn_manageDogs.setText("Hunde Verwaltung");

        btn_manageCustomer.setText("Kunden Verwaltung");

        btn_manageAppointments.setText("Termin Verwaltung");

        btn_consistedBook.setText("Bestandsbuch");

        btn_manageProducts.setText("Artikel Verwaltung");

        btn_manageInvoices.setText("Rechnungs Verwaltung");

        btn_logout.setText("Ausloggen");

        javax.swing.GroupLayout pan_MainMenuLayout = new javax.swing.GroupLayout(pan_MainMenu);
        pan_MainMenu.setLayout(pan_MainMenuLayout);
        pan_MainMenuLayout.setHorizontalGroup(
            pan_MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_MainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan_MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_manageDogs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_overview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_manageCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_manageAppointments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_consistedBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_manageProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pan_MainMenuLayout.createSequentialGroup()
                        .addComponent(btn_manageInvoices)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pan_MainMenuLayout.setVerticalGroup(
            pan_MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan_MainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_overview)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_manageCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_manageDogs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_manageAppointments)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_consistedBook)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_manageProducts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_manageInvoices)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_logout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_exit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        
        pan_shellViewMainContentDisplayArea = new JPanel();
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addComponent(pan_MainMenu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(pan_shellViewMainContentDisplayArea, GroupLayout.DEFAULT_SIZE, 1051, Short.MAX_VALUE)
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(pan_shellViewMainContentDisplayArea, GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
        					.addGap(11))
        				.addComponent(pan_MainMenu, GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE)))
        );
        pan_shellViewMainContentDisplayArea.setLayout(new CardLayout(0, 0));
        
        pan_content = new JPanel();
        pan_content.setPreferredSize(new Dimension(100, 100));
        pan_content.setName("Das ist das ContentPanel");
        pan_content.setBackground(Color.RED);
        pan_shellViewMainContentDisplayArea.add(pan_content, "name_24939871190100");
        
        label = new JLabel("ShellViewPanel");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Tahoma", Font.PLAIN, 40));
        GroupLayout gl_pan_content = new GroupLayout(pan_content);
        gl_pan_content.setHorizontalGroup(
        	gl_pan_content.createParallelGroup(Alignment.LEADING)
        		.addGap(0, 119, Short.MAX_VALUE)
        		.addGroup(gl_pan_content.createSequentialGroup()
        			.addGap(386)
        			.addComponent(label)
        			.addContainerGap(488, Short.MAX_VALUE))
        );
        gl_pan_content.setVerticalGroup(
        	gl_pan_content.createParallelGroup(Alignment.LEADING)
        		.addGap(0, 169, Short.MAX_VALUE)
        		.addGroup(gl_pan_content.createSequentialGroup()
        			.addGap(334)
        			.addComponent(label)
        			.addContainerGap(390, Short.MAX_VALUE))
        );
        pan_content.setLayout(gl_pan_content);
        getContentPane().setLayout(layout);

        pack();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_consistedBook;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_manageAppointments;
    private javax.swing.JButton btn_manageCustomer;
    private javax.swing.JButton btn_manageDogs;
    private javax.swing.JButton btn_manageInvoices;
    private javax.swing.JButton btn_manageProducts;
    private javax.swing.JButton btn_overview;
    private javax.swing.JPanel pan_MainMenu;
    private javax.swing.JPanel pan_shellViewMainContentDisplayArea;
    private JPanel pan_content;
    private JLabel label;
    // End of variables declaration//GEN-END:variables
    
    public void OpenOverviewListener (ActionListener OpenOverview){
        this.btn_overview.addActionListener(OpenOverview);
    }
    public void OpenCustomersListener (ActionListener OpenManageCustomer){
        this.btn_manageCustomer.addActionListener(OpenManageCustomer);
    }
    public void OpenDogsListener(ActionListener OpenManageDogs){
        this.btn_manageDogs.addActionListener(OpenManageDogs);
    }
    public void OpenAppointmentListener(ActionListener OpenAppointments){
        this.btn_manageAppointments.addActionListener(OpenAppointments);
    }
    public void OpenConsistedBookListener(ActionListener OpenConsistedBook){
        this.btn_consistedBook.addActionListener(OpenConsistedBook);
    }
    public void OpenProductsListener(ActionListener OpenProducts){
        this.btn_manageProducts.addActionListener(OpenProducts);
    }
    public void OpenInvoicesListener(ActionListener OpenInvoices){
        this.btn_manageInvoices.addActionListener(OpenInvoices);
    }
    public void LogoutUserListener(ActionListener LogoutUser){
        this.btn_logout.addActionListener(LogoutUser);
    }
    public void CloseApplicationListener(ActionListener close){
        this.btn_exit.addActionListener(close);
    }
    
    public javax.swing.JButton getOvervievButton(){
        return btn_overview;
    }
    public javax.swing.JPanel getContentPanel(){
    	return pan_shellViewMainContentDisplayArea;
    }
}

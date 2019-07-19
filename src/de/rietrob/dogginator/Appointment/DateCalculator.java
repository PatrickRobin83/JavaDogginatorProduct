/**
 * -----------------------------------------------------------------------------
 *	  
 *	 Projectname	:	Dogginator_Product 
 *   Filename		:   DateCalculator.java
 *   Date			:   20.07.2019
 *   All rights reserved
 * 
 * -----------------------------------------------------------------------------
 * @author     Patrick Robin <support@rietrob.de>
 * @since      1.0.0
 */
package de.rietrob.dogginator.Appointment;

public class DateCalculator {

	private static DateCalculator instance;
	
	private DateCalculator() {
		
	}
	
	public static DateCalculator getInstance() {
		if(instance == null) {
			DateCalculator.instance = new DateCalculator();
		}
		return DateCalculator.instance;
	}
	
}

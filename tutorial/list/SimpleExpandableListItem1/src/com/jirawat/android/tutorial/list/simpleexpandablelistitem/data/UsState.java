package com.jirawat.android.tutorial.list.simpleexpandablelistitem.data;

import java.util.Calendar;
import java.util.Locale;

/**
 * Info on United States of America.
 *
 * @author Jirawat Uttayaya <a
 *         href="mailto:admin@apps.jirawat.com">admin@apps.jirawat.com</a>
 * @version 1.0
 * @since 1.0
 *
 */
public enum UsState {
    DE("Delaware", "Dover", 1787, 12, 7),
    PA("Pennsylvania", "Harrisburg", 1787, 12, 7),
    NJ("New Jersey", "Trenton", 1787, 12, 18),
    GA("Georgia", "Atlanta", 1788, 1, 2),
    CT("Connecticut", "Hartford", 1788, 1, 9),
    MA("Massachusetts", "Boston", 1788, 2, 6),
    MD("Maryland", "Annapolis", 1788, 4, 28),
    SC("South Carolina", "Columbia", 1788, 5, 23),
    NH("New Hampshire", "Concord", 1788, 6, 21),
    VA("Virginia", "Richmond", 1788, 6, 25),
    NY("New York", "Albany", 1788, 7, 26),
    NC("North Carolina", "Raleigh", 1789, 11, 21),
    RI("Rhode Island", "Providence", 1790, 5, 29);

    private String stateName;
    private String capital;
    private Calendar unionAdmission;
    
	private UsState(final String name,final String stateCapital, 
			        final int admitYear, final int admitMonth, final int admitDay) {
        this.stateName = name;
        this.capital = stateCapital;
        final Calendar cal = Calendar.getInstance(Locale.US);
        cal.set(admitYear, admitMonth,admitDay, 0,0,0);
        this.unionAdmission = cal;
	}

	public String getStateName() {
	    return this.stateName;	
	}
	
	public String getAbbreviation() {
	    return this.name();
	}
	
	public String getCapital() {
		return this.capital;
	}
	
	public Calendar getUnionAdmission() {
		return (Calendar)this.unionAdmission.clone();
	}
	
	@Override
	public String toString() {
		return getAbbreviation() + ":" + getStateName();
	}
}

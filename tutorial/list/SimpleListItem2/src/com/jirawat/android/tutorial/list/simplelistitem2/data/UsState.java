package com.jirawat.android.tutorial.list.simplelistitem2.data;

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
    DE("Delaware"),
    PA("Pennsylvania"),
    NJ("New Jersey"),
    GA("Georgia"),
    CT("Connecticut"),
    MA("Massachusetts"),
    MD("Maryland"),
    SC("South Carolina"),
    NH("New Hampshire"),
    VA("Virginia"),
    NY("New York"),
    NC("North Carolina"),
    RI("Rhode Island");

    private String stateName;
    
	private UsState(final String name) {
        this.stateName = name;
	}

	public String getStateName() {
	    return this.stateName;	
	}
	
	public String getAbbreviation() {
	    return this.name();
	}
	
	@Override
	public String toString() {
		return getAbbreviation() + ":" + getStateName();
	}
}

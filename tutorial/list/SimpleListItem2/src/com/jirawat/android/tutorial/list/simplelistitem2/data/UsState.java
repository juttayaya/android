package com.jirawat.android.tutorial.list.simplelistitem2.data;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Info on United States of America.
 *
 * @author Jirawat Uttayaya <a
 *         href="mailto:admin@apps.jirawat.com">admin@apps.jirawat.com</a>
 * @version 1.0
 * @since 1.0
 *
 */
public final class UsState {
    /**
     * The 13 US original colonies and abbreviations, in order of statehood.
     */
    public static final Map<String, String> ORIGINAL_COLONIES = initColonies();

    private UsState() { }

    private static Map<String, String> initColonies() {
        final Map<String, String> colonies = new LinkedHashMap<String, String>();
        colonies.put("Delaware", "DE");
        colonies.put("Pennsylvania", "PA");
        colonies.put("New Jersey", "NJ");
        colonies.put("Georgia", "GA");
        colonies.put("Connecticut", "CT");
        colonies.put("Massachusetts", "MA");
        colonies.put("Maryland", "MD");
        colonies.put("South Carolina", "SC");
        colonies.put("New Hampshire", "NH");
        colonies.put("Virgina", "VA");
        colonies.put("New York", "NY");
        colonies.put("North Carolina", "NC");
        colonies.put("Rhode Island", "RI");

        return Collections.unmodifiableMap(colonies);
    }
}

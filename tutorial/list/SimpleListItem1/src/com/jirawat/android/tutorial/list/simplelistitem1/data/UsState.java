package com.jirawat.android.tutorial.list.simplelistitem1.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Info on United States of America.
 *
 * @author Jirawat Uttayaya <a href="mailto:admin@apps.jirawat.com">admin@apps.jirawat.com</a>
 * @version 1.0
 * @since 1.0
 *
 */
public final class UsState {
    /**
     * The 13 US original colonies, in order of statehood.
     */
    public static final List<String> ORIGINAL_COLONIES = initColonies();

    private UsState() { }

    private static List<String> initColonies() {
        final List<String> colonies = new ArrayList<String>();
        colonies.add("Delaware");
        colonies.add("Pennsylvania");
        colonies.add("New Jersey");
        colonies.add("Georgia");
        colonies.add("Connecticut");
        colonies.add("Massachusetts");
        colonies.add("Maryland");
        colonies.add("South Carolina");
        colonies.add("New Hampshire");
        colonies.add("Virgina");
        colonies.add("New York");
        colonies.add("North Carolina");
        colonies.add("Rhode Island");

        return Collections.unmodifiableList(colonies);
    }
}

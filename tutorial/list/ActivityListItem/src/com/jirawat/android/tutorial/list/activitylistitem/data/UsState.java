package com.jirawat.android.tutorial.list.activitylistitem.data;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import com.jirawat.android.tutorial.list.activitylistitem.R;

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
    public static final Map<String, Integer> ORIGINAL_COLONIES = initColonies();

    private UsState() { }

    private static Map<String, Integer> initColonies() {
        final Map<String, Integer> colonies = new LinkedHashMap<String, Integer>();
        colonies.put("Delaware", R.drawable.delaware);
        colonies.put("Pennsylvania", R.drawable.pennsylvania);
        colonies.put("New Jersey", R.drawable.new_jersey);
        colonies.put("Georgia", R.drawable.georgia);
        colonies.put("Connecticut", R.drawable.connecticut);
        colonies.put("Massachusetts", R.drawable.massachusetts);
        colonies.put("Maryland", R.drawable.maryland);
        colonies.put("South Carolina", R.drawable.south_carolina);
        colonies.put("New Hampshire", R.drawable.new_hampshire);
        colonies.put("Virginia", R.drawable.virginia);
        colonies.put("New York", R.drawable.new_york);
        colonies.put("North Carolina", R.drawable.north_carolina);
        colonies.put("Rhode Island", R.drawable.rhode_island);

        return Collections.unmodifiableMap(colonies);
    }
}

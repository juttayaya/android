package com.jirawat.android.tutorial.list.simpleexpandablelistitem1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.ExpandableListActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.ExpandableListAdapter;
import android.widget.SimpleExpandableListAdapter;

import com.jirawat.android.tutorial.list.simpleexpandablelistitem.data.UsState;

/**
 * Demo of Android <a href=
 * "http://developer.android.com/reference/android/R.layout.html#simple_list_item_2"
 * > simple_list_item_2</a> and displaying a <a
 * href="http://docs.oracle.com/javase/6/docs/api/java/util/List.html">List</a>
 * of Maps in the UI.
 *
 * @author Jirawat Uttayaya <a
 *         href="mailto:admin@apps.jirawat.com">admin@apps.jirawat.com</a>
 * @version 1.0
 * @since 1.0
 *
 */
public class MainActivity extends ExpandableListActivity {
    private static final String TEXT1 = "text1";
    private static final String TEXT2 = "text2";

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final UsState[] usStates = UsState.values();
        final ExpandableListAdapter listAdapter = createListAdapter(usStates);
        setListAdapter(listAdapter);
    }

    /**
     * A <a href=
     * "http://developer.android.com/reference/android/widget/ListAdapter.html">
     * ListAdapter</a> converts the List of data into the Android UI <a href=
     * "http://developer.android.com/guide/topics/ui/layout/listview.html"> List
     * View</a>.
     *
     * @since 1.0
     *
     * @param map
     *            A map of String key/value pairs
     * @return An Adapter using the <a href=
     *         "http://developer.android.com/reference/android/R.layout.html#simple_list_item_2"
     *         > simple_list_item_2</a> layout to display a Map of strings
     *         key/value pairs
     */
    private ExpandableListAdapter createListAdapter(final UsState[] usStates) {
        final String[] fromMapKey = new String[] {TEXT1, TEXT2};
        final int[] toLayoutId = new int[] {android.R.id.text1, android.R.id.text2};
        final List<Map<String, String>> list = convertToListItems(usStates);
        final List<List<Map<String, String>>> childList = convertToChildListItems(usStates);

        return new SimpleExpandableListAdapter(this, 
        		list,
                android.R.layout.simple_expandable_list_item_1, fromMapKey, toLayoutId,
                childList,
                android.R.layout.simple_list_item_2, fromMapKey, toLayoutId);
        
    }

    private List<Map<String, String>> convertToListItems(final UsState[] usStates) {
        final List<Map<String, String>> listItem = 
            new ArrayList<Map<String, String>>(usStates.length);

        for (final UsState state : usStates) {
            final Map<String, String> listItemMap = new HashMap<String, String>();
            listItemMap.put(TEXT1, state.getStateName());
            listItem.add(Collections.unmodifiableMap(listItemMap));
        }

        return Collections.unmodifiableList(listItem);
    }
    
    private List<List<Map<String, String>>> convertToChildListItems(final UsState[] usStates) {
        final List<List<Map<String, String>>> parentListItems = 
            new ArrayList<List<Map<String, String>>>(usStates.length);

        for (final UsState state : usStates) {
            final List<Map<String,String>> childListItems = initChildListItems(state);
            parentListItems.add(childListItems);                
        }

        return Collections.unmodifiableList(parentListItems);
    }
    
    private List<Map<String,String>> initChildListItems(final UsState usState) {
        final List<Map<String,String>> childListItems = new ArrayList<Map<String,String>>(3);
        initChildListItemMap(childListItems, "Abbreviation", usState.getAbbreviation());
        initChildListItemMap(childListItems, "Admission To Union", formatUnionAdmission(usState));
        initChildListItemMap(childListItems, "Capital", usState.getCapital());        

        return Collections.unmodifiableList(childListItems);
    }
    
    private void initChildListItemMap(
      final List<Map<String, String>> childListItems, String text1, String text2) {
        Map<String,String> childListItemMap = new HashMap<String, String>();
        childListItemMap.put(TEXT1, text1);
        childListItemMap.put(TEXT2, text2);        
        
        childListItems.add(Collections.unmodifiableMap(childListItemMap));    	
    }
    
    private String formatUnionAdmission(final UsState usState) {
    	return DateFormat.format("EEEE, MMMM dd, yyyy", usState.getUnionAdmission()).toString();
    }
    
}

package com.jirawat.android.tutorial.list.simplelistitem1;

import java.util.List;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

import com.jirawat.android.tutorial.list.simplelistitem1.data.UsState;

/**
 * Demo of Android
 * <a href="http://developer.android.com/reference/android/R.layout.html#simple_list_item_1">
 * simple_list_item_1</a> and displaying a
 * <a href="http://docs.oracle.com/javase/6/docs/api/java/util/List.html">List</a>
 * of Strings in the UI.
 *
 * @author Jirawat Uttayaya <a href="mailto:admin@apps.jirawat.com">admin@apps.jirawat.com</a>
 * @version 1.0
 * @since 1.0
 *
 */
public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ListAdapter listAdapter = createListAdapter(UsState.ORIGINAL_COLONIES);
        setListAdapter(listAdapter);
    }

    /**
     * A <a href="http://developer.android.com/reference/android/widget/ListAdapter.html">
     * ListAdapter</a> converts the List of data into the Android UI 
     * <a href="http://developer.android.com/guide/topics/ui/layout/listview.html">
     * List View</a>
     * <p />
     * Note: This example also works if we replace the List of Strings parameter
     * with a String[]
     * 
     * @since 1.0
     *
     * @param list A List of Strings to be displayed in the Android UI
     * @return An Adapter using the 
     * <a href="http://developer.android.com/reference/android/R.layout.html#simple_list_item_1">
     * simple_list_item_1</a> layout to display the list of strings
     */
    private ListAdapter createListAdapter(final List<String> list) {
        return new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
    }
}

package com.jirawat.android.tutorial.list.simplelistitem1;

import java.util.List;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

import com.jirawat.android.tutorial.list.simplelistitem1.data.UsState;

/**
 * Demo using the built-in Android
 * <a href="http://developer.android.com/reference/android/R.layout.html#simple_list_item_1">
 * android.R.layout.simple_list_item_1</a> to display a
 * <a href="http://docs.oracle.com/javase/6/docs/api/java/util/List.html">List</a>
 * of <a href="http://docs.oracle.com/javase/6/docs/api/java/util/String.html">Strings</a>
 * in the UI.
 * <p />
 * The demo displays a list of the original US 13 colonies in order of statehood.
 * <p />
 *  The basic technical steps are
 * <ol>
 * <li>Create class extending
 * <a href="http://developer.android.com/reference/android/app/ListActivity.html">ListActivity</a></li>
 * <li>Obtain data in List of Strings data structure</li>
 * <li>Create an
 * <a href="http://developer.android.com/reference/android/widget/ArrayAdapter.html">ArrayAdapter</a>
 * that connects the List of Strings data to simple_list_item1</li>
 * <li>Bind the ListAdapter using the
 * <a href="http://developer.android.com/reference/android/app/ListActivity.html#setListAdapter(android.widget.ListAdapter)">ListActivity.setListAdapter</a> method</li>
 * </ol>
 * 
 * @author Jirawat Uttayaya <a href="mailto:admin@apps.jirawat.com">admin@apps.jirawat.com</a>
 * @version 1.0
 * @since 1.0
 *
 */
public class MainActivity extends ListActivity {

    /**
     * This overridden method initializes the ListActivity.
     * After calling the parent onCreate method, it binds the ListAdapter to the
     * ListActivity via setListAdapter method.
     * 
     * @param savedInstanceState If the activity is being re-initialized 
     * after previously being shut down then this Bundle contains the data 
     * it most recently supplied in
     * {@link android.app.Activity#onSaveInstanceState(Bundle)}.
     * <b>Note: Otherwise it is null.</b>
     */
    @Override
    protected final void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ListAdapter listAdapter = createListAdapter(UsState.ORIGINAL_COLONIES);
        setListAdapter(listAdapter);
    }

    /**
     * A <a href="http://developer.android.com/reference/android/widget/ListAdapter.html">ListAdapter</a>
     * connects the List of data to the Android UI
     * <a href="http://developer.android.com/guide/topics/ui/layout/listview.html">ListView</a>.
     * <p />
     * Note: This example also works if we replace the List of Strings parameter
     * with a String[]
     * @since 1.0
     * 
     * @param list A List of Strings to be displayed in the Android UI
     * @return An <a href="http://developer.android.com/reference/android/widget/ArrayAdapter.html">ArrayAdapter</a>
     * using the
     * <a href="http://developer.android.com/reference/android/R.layout.html#simple_list_item_1">simple_list_item_1</a>
     * layout to display the list of strings
     */
    private ListAdapter createListAdapter(final List<String> list) {
        return new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
    }
}

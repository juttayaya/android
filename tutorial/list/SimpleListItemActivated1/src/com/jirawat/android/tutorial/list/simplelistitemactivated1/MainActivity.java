package com.jirawat.android.tutorial.list.simplelistitemactivated1;

import java.util.List;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

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
        // This make activatedBackgroundIndicator work
        getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
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
        return new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, list);
    }
    
/*    
    @Override
    protected void onListItemClick(final ListView listView, View view, int position, long id) {
        listView.setItemChecked(position, true);
        final String stateClicked = (String)listView.getItemAtPosition(position);
        final String popupMsg = stateClicked + " is at position " + position + " and id " + id;
        Toast toast = Toast.makeText(this, popupMsg, Toast.LENGTH_SHORT);
        toast.show();
    }
*/     
    
}

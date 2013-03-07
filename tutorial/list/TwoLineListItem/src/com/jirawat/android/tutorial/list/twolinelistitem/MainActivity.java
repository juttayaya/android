package com.jirawat.android.tutorial.list.twolinelistitem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.SimpleAdapter;

import com.jirawat.android.tutorial.list.simplelistitem2.data.UsState;

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
public class MainActivity extends ListActivity {
	private static final String TEXT1 = "text1";
	private static final String TEXT2 = "text2";

	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		final UsState[] states = UsState.values(); 
		final ListAdapter listAdapter = createAdapter(states);
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
	private ListAdapter createAdapter(final UsState[] states) {
		final String[] fromMapKey = new String[] {TEXT1, TEXT2};
		final int[] toLayoutId = new int[] {android.R.id.text1, android.R.id.text2};
		final List<Map<String, String>> list = convertToListItems(states);
        
		return new SimpleAdapter(this, list,
				android.R.layout.two_line_list_item, fromMapKey, toLayoutId);
	}

	private List<Map<String, String>> convertToListItems(final UsState[] states) {
		final List<Map<String, String>> listItem = new ArrayList<Map<String, String>>(states.length);

		for (final UsState state: states) {
			final Map<String, String> listItemMap = new HashMap<String, String>();
			listItemMap.put(TEXT1, state.getStateName());
			listItemMap.put(TEXT2, state.getAbbreviation());
			listItem.add(Collections.unmodifiableMap(listItemMap));
		}

		return Collections.unmodifiableList(listItem);
	}
}

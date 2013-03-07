package com.jirawat.android.tutorial.list.activitylistitem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.SimpleAdapter;

import com.jirawat.android.tutorial.list.activitylistitem.data.UsState;

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
	private static final String ICON = "icon";

	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		final ListAdapter listAdapter = createListAdapter(UsState.ORIGINAL_COLONIES);
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
	private ListAdapter createListAdapter(final Map<String, Integer> map) {
		final String[] fromMapKey = new String[] {TEXT1, ICON};
		final int[] toLayoutId = new int[] {android.R.id.text1, android.R.id.icon};
		final List<Map<String, Object>> list = convertMapToList(map);

		return new SimpleAdapter(this, list,
				android.R.layout.activity_list_item, fromMapKey, toLayoutId);
	}

	private List<Map<String, Object>> convertMapToList(final Map<String, Integer> map) {
		final List<Map<String, Object>> list = new ArrayList<Map<String, Object>>(
				map.size());

		for (final Map.Entry<String, Integer> entry : map.entrySet()) {
			final Map<String, Object> adapterMap = new HashMap<String, Object>();
			adapterMap.put(TEXT1, entry.getKey());
			adapterMap.put(ICON, entry.getValue());
			list.add(adapterMap);
		}

		return Collections.unmodifiableList(list);
	}
}

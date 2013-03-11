package com.jirawat.android.tutorial.list.simplelistitem2;

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
 * Demo using the built-in Android
 * <a href="http://developer.android.com/reference/android/R.layout.html#simple_list_item_2">
 * android.R.layout.simple_list_item_2</a> to display an
 * array of Java enum entries in the UI.
 * <p />
 * The demo displays a list of the original US 13 colonies and its state abbreviation,
 * in order of statehood.
 * <p />
 *  The basic technical steps are
 * <ol>
 * <li>Create class extending
 * <a href="http://developer.android.com/reference/android/app/ListActivity.html">ListActivity</a></li>
 * <li>Obtain data as a array of enum entries</li>
 * <li>Create a
 * <a href="http://developer.android.com/reference/android/widget/SimpleAdapter.html">SimpleAdapter</a>
 * that connects the array of enum entries to simple_list_item2</li>
 * <li>Bind the ListAdapter using the
 * <a href="http://developer.android.com/reference/android/app/ListActivity.html#setListAdapter(android.widget.ListAdapter)">ListActivity.setListAdapter</a> method</li>
 * </ol>
 *
 * @author Jirawat Uttayaya <a
 *         href="mailto:admin@apps.jirawat.com">admin@apps.jirawat.com</a>
 * @version 1.0
 * @since 1.0
 *
 */
public class MainActivity extends ListActivity {
	/**
	 * The key in the SimpleAdapter Map<String, String> to map to
	 * <a href="http://developer.android.com/reference/android/R.id.html#text1">android.R.id.text1</a>.
	 */
	private static final String TEXT1 = "text1";
	/**
	 * The key in the SimpleAdapter Map<String, String> to map to
	 * <a href="http://developer.android.com/reference/android/R.id.html#text2">android.R.id.text2</a>.
	 */
	private static final String TEXT2 = "text2";

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
		final UsState[] states = UsState.values();
		final ListAdapter listAdapter = createListAdapter(states);
		setListAdapter(listAdapter);
	}

	/**
     * A <a href="http://developer.android.com/reference/android/widget/ListAdapter.html">ListAdapter</a>
     * connects the array of enum entries to the Android UI
     * <a href="http://developer.android.com/guide/topics/ui/layout/listview.html">ListView</a>.
     * <p />
     * Note: This example also works if we replace the array of enum entries parameter
     * with an array or
     * <a href="http://docs.oracle.com/javase/6/docs/api/java/util/List.html">List</a>
     * of JavaBeans.
	 * @since 1.0
	 *
	 * @param states An array of {@link UsState} enum entries
	 * @return A <a href="http://developer.android.com/reference/android/widget/SimpleAdapter.html">SimpleAdapter</a>
	 * using the
	 * <a href="http://developer.android.com/reference/android/R.layout.html#simple_list_item_2">simple_list_item_2</a>
	 * layout to display an array of enum entries
	 */
	private ListAdapter createListAdapter(final UsState[] states) {
		final String[] fromMapKey = new String[] {TEXT1, TEXT2};
		final int[] toLayoutId = new int[] {android.R.id.text1, android.R.id.text2};
		final List<Map<String, String>> list = convertToListItems(states);

		return new SimpleAdapter(this, list,
				android.R.layout.simple_list_item_2, fromMapKey, toLayoutId);
	}

	/**
	 * Convert an array of {@link UsState} into a List of Map<String, String>.
	 * The List of Map<String, String> will be used as part of the constructor for
	 * a <a href="http://developer.android.com/reference/android/widget/SimpleAdapter.html">SimpleAdapter</a>.
	 * <p />
	 * Each element in the List will correspond to a entry in the Android UI list.
	 * The Map<String, String> maps the attributes on the Object to the
	 * <a href="http://developer.android.com/reference/android/R.id.html#text1">android.R.id.text1</a>
	 * and
	 * <a href="http://developer.android.com/reference/android/R.id.html#text2">android.R.id.text2</a>
	 * UI fields.
	 * <p />
	 * For example, if you input
	 * UsState[] =
	 *   [ DE("Delaware"),
	 *     PA("Pennsylvania"),
     *     NJ("New Jersey")
     *    ];
     *
	 * the output will be
	 * List<Map<String, String>> =
	 *   [ {text1="Delaware", text2="DE"},
	 *     {text1="Pennsylvania", text2="PA"},
	 *     {text1="New Jersey", text2="NJ"}
	 *   ];
	 * @since 1.0
	 *
	 * @param states An array of {@link UsState} enum entries
	 * @return An unmodifiable List of Map<String, String> that will be passed
	 * as a SimpleAdapter constructor parameter
	 */
	private List<Map<String, String>> convertToListItems(final UsState[] states) {
		final List<Map<String, String>> listItem =
	        new ArrayList<Map<String, String>>(states.length);

		for (final UsState state: states) {
			final Map<String, String> listItemMap = new HashMap<String, String>();
			listItemMap.put(TEXT1, state.getStateName());
			listItemMap.put(TEXT2, state.getAbbreviation());
			listItem.add(Collections.unmodifiableMap(listItemMap));
		}

		return Collections.unmodifiableList(listItem);
	}
}

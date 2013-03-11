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
 * @author Jirawat Uttayaya <a href="mailto:admin@apps.jirawat.com">admin@apps.jirawat.com</a>
 * @since 1.0
 */
package com.jirawat.android.tutorial.list.simplelistitem2;

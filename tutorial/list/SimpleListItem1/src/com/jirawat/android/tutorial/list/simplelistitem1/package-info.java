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
 * @since 1.0
 */
package com.jirawat.android.tutorial.list.simplelistitem1;

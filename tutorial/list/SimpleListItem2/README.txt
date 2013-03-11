Demo using the built-in Android android.R.layout.simple_list_item_2 to display an
array of Java enum entries in the UI.

The demo displays a list of the original US 13 colonies and its state abbreviation,
in order of statehood.

The basic technical steps are

1. Create class extending ListActivity
2. Obtain data as a array of enum entries
3. Create a SimpleAdapter that connects the array of enum entries to simple_list_item2
4. Bind the ListAdapter using the ListActivity.setListAdapter method

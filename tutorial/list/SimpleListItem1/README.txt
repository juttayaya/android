Demo using the built-in Android android.R.layout.simple_list_item_1
to display a List of Strings in the UI.

The demo displays a list of the original US 13 colonies in order of statehood.

The basic technical steps are

1. Create class extending ListActivity
2. Obtain data in List of Strings data structure
3. Create an ArrayAdapter that connects the List of Strings data to simple_list_item1
4. Bind the ListAdapter using the ListActivity.setListAdapter method
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
 * Demo of Android
 * <a href="http://developer.android.com/reference/android/R.layout.html#simple_list_item_2">
 * simple_list_item_2</a> and displaying a
 * <a href="http://docs.oracle.com/javase/6/docs/api/java/util/List.html">List</a>
 * of Maps in the UI.
 *  
 * @author Jirawat Uttayaya <a href="mailto:admin@apps.jirawat.com">admin@apps.jirawat.com</a>
 * @version 1.0
 * @since 1.0
 *
 */
public class MainActivity extends ListActivity {
    private static final String TEXT1="text1";
    private static final String TEXT2="text2";
    
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ListAdapter listAdapter = createAdapter(UsState.ORIGINAL_COLONIES);
        setListAdapter(listAdapter);        
    }
    
    private ListAdapter createAdapter(final Map<String,String> map) {
    	final String[] fromMapKey = new String[] {TEXT1, TEXT2};
    	final int[] toLayoutId = new int[] {android.R.id.text1, android.R.id.text2};
    	final List<Map<String,String>> list = convertMapToList(map);

    	return new SimpleAdapter(this, list, android.R.layout.simple_list_item_2, 
        	                     fromMapKey, toLayoutId); 
    }
    
    private List<Map<String,String>> convertMapToList(final Map<String,String> map) {
        final List<Map<String,String>> list = new ArrayList<Map<String,String>>(map.size());
    	
        for(final Map.Entry<String, String> entry: map.entrySet()) {
    		final Map<String,String> adapterMap = new HashMap<String,String>();
    		adapterMap.put(TEXT1, entry.getKey());
    		adapterMap.put(TEXT2, entry.getValue());
    		list.add(adapterMap);
    	}
    	
    	return Collections.unmodifiableList(list);
   }
}

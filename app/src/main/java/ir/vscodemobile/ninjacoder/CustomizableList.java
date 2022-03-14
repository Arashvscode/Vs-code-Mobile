package ir.vscodemobile.ninjacoder;

import android.app.Activity;
import android.widget.BaseAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.EditText;
import android.view.ViewGroup;
import android.app.AlertDialog;
import android.graphics.Color;

import java.lang.CharSequence;
import java.util.HashMap;
import java.util.ArrayList;

public class CustomizableList extends BaseAdapter {
    protected ArrayList<String> data = new ArrayList<>();
	protected AlertDialog _Dialog;
	protected MainActivity selectedActivity;
	
	public CustomizableList(ArrayList<? extends CharSequence> list, MainActivity _Activity, AlertDialog actualDialog) {
		data = (ArrayList<String>)list;
		_Dialog = actualDialog;
		selectedActivity = _Activity;
	}
	
	@Override
	public int getCount() {
		return data.size();
	}
		
	@Override
	public HashMap<String, Object> getItem(int _index) {
		throw new UnsupportedOperationException();
	}
		
	@Override
	public long getItemId(int _index) {
		return _index;
    }
	
	@Override
	public View getView(final int _position, View _v, ViewGroup _container) {
		LayoutInflater _LayoutInflater = (LayoutInflater)selectedActivity.getSystemService(selectedActivity.LAYOUT_INFLATER_SERVICE);
		LinearLayout totalView = (LinearLayout)_LayoutInflater.inflate(R.layout.fields_view, null);
		TextView listTextView1 = totalView.findViewById(R.id.listTextView1);
		final String element = data.get(_position);
		
		listTextView1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _View) {
				CustomizableList.this.executeAction(_position);
			}
		});
		listTextView1.setText(element);
		return totalView;
	}
	
	protected void executeAction(int index) {
		
	}
}

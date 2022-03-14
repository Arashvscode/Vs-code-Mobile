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

public class DialogListViewParametersAdapter extends CustomizableList {
	protected EditText selectedEditText;
	
	public DialogListViewParametersAdapter(ArrayList<? extends CharSequence> list, MainActivity _Activity, AlertDialog actualDialog, EditText updateWithEdittext) {
		super(list, _Activity, actualDialog);
		selectedEditText = updateWithEdittext;
	}
	
	@Override
	public View getView(final int _position, View _v, ViewGroup _container) {
		LayoutInflater _LayoutInflater = (LayoutInflater)selectedActivity.getSystemService(selectedActivity.LAYOUT_INFLATER_SERVICE);
		LinearLayout totalView = (LinearLayout)_LayoutInflater.inflate(R.layout.fields_view, null);
		TextView listTextView1 = totalView.findViewById(R.id.listTextView1);
		
		listTextView1.setTextColor(Color.BLUE);
		listTextView1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _View) {
				DialogListViewParametersAdapter.this.executeAction(_position);
			}
		});
		listTextView1.setText(data.get(_position).substring(0, data.get(_position).indexOf(":")));
		return totalView;
	}
	
	@Override
	protected void executeAction(int index) {
		String element = super.data.get(index).substring(data.get(index).indexOf(":") + 1);
		element = element.contains("[]")? element.substring(0, element.indexOf("[")) : element;
		if(Util.isPrimitive(element)) {
			super.selectedActivity.showMessage("primitive type " + element);
		}else {
			DialogListViewParametersAdapter.this.selectedEditText.setText(element);
			_Dialog.hide();
		}
	}
}

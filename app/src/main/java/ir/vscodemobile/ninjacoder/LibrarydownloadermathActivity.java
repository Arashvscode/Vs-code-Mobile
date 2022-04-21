package ir.vscodemobile.ninjacoder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import java.util.ArrayList;
import java.util.HashMap;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.AdapterView;
import android.net.Uri;
import android.graphics.Typeface;
import com.lwb.piechart.*;
import com.jtv7.rippleswitchlib.*;
import com.rohitop.rlottie.*;
import s4u.restore.swb.*;
import mrAr.Stop.notmeDicompile.*;
import androidx.webkit.*;
import com.android.tools.r8.*;
import xyz.ninjacoder.edittext.Animator.main.*;
import org.antlr.v4.runtime.*;
import com.caverock.androidsvg.*;
import com.blogspot.atifsoftwares.animatoolib.*;
import ninja.toska.path.*;
import com.oguzdev.circularfloatingactionmenu.library.*;
import com.googlecode.d2j.*;
import com.android.*;
import io.github.rosemoe.sora.langs.textmate.*;
import net.lingala.zip4j.*;
import io.github.rosemoe.sora.langs.base.*;
import org.jetbrains.kotlin.*;
import com.example.myapp.*;
import com.github.underscore.lodash.*;
import com.suke.widget.*;
import com.google.gson.*;
import com.google.android.material.*;
import com.github.angads25.filepicker.*;
import io.github.rosemoe.sora.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;
import androidx.core.content.ContextCompat;
import androidx.core.app.ActivityCompat;
import android.Manifest;
import android.content.pm.PackageManager;
import ir.vscodemobile.ninjacoder.LibraryDownloaderUtils;
import a.a.a.bB;
import mod.agus.jcoderz.lib.FileUtil;
import mod.hey.studios.project.library.LibraryDownloader;
import mod.hey.studios.util.Helper;

public class LibrarydownloadermathActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private String subtitle = "";
	private String Folder = "";
	private double position = 0;
	
	private ArrayList<String> liststring = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> File_map = new ArrayList<>();
	
	private LinearLayout linear1;
	private ListView listview1;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.librarydownloadermath);
		initialize(_savedInstanceState);
		
		if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE}, 1000);
		} else {
			initializeLogic();
		}
	}
	
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == 1000) {
			initializeLogic();
		}
	}
	
	private void initialize(Bundle _savedInstanceState) {
		_app_bar = findViewById(R.id._app_bar);
		_coordinator = findViewById(R.id._coordinator);
		_toolbar = findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		linear1 = findViewById(R.id.linear1);
		listview1 = findViewById(R.id.listview1);
		
		listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				if (FileUtil.isDirectory(liststring.get((int)(_position)))) {
					_RefreshData();
				}
				else {
					
				}
			}
		});
	}
	
	private void initializeLogic() {
		_RefreshData();
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) { 
				   Window ninjacoder = this.getWindow();
			 ninjacoder.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			 ninjacoder.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			
				   ninjacoder.setStatusBarColor(Color.parseColor("#FF000027")); ninjacoder.setNavigationBarColor(Color.parseColor("#FF000027"));
		}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuItem menuitem1 = menu.add(Menu.NONE, 0, Menu.NONE, "");
		menuitem1.setIcon(R.drawable.briefcase);
		menuitem1.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		final int _id = item.getItemId();
		final String _title = (String) item.getTitle();
		if (_id == 0) {
			final AlertDialog dialog1 = new AlertDialog.Builder(LibrarydownloadermathActivity.this).create();
			View inflate = getLayoutInflater().inflate(R.layout.gitlibdownloader,null); 
			dialog1.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
			dialog1.setView(inflate);
			LinearLayout bg = (LinearLayout) inflate.findViewById(R.id.bg);
			androidx.cardview.widget.CardView card = (androidx.cardview.widget.CardView) inflate.findViewById(R.id.card);
			TextView d8 = (TextView) inflate.findViewById(R.id.d8);
			TextView dx = (TextView) inflate.findViewById(R.id.dx);
			TextView no = (TextView) inflate.findViewById(R.id.no);
			card.setCardBackgroundColor(0xFF00003A);
			card.setRadius((float)19);
			card.setCardElevation((float)0);
			d8.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
							
						{
							try{
									int count;
									java.io.InputStream input= LibrarydownloadermathActivity.this._getMyContext(LibrarydownloadermathActivity.this).getAssets().open("libs/core-lambda-stubs.jar");
									java.io.OutputStream output = new  java.io.FileOutputStream("/storage/emulated/0/.sketchware/libs/local_libs/.main/class_path.jar");
									byte data[] = new byte[1024];
									while ((count = input.read(data))>0) {
											output.write(data, 0, count);
									}
									output.flush();
									output.close();
									input.close();
									
								}catch(Exception e){
											
								}
					}
					{
							try{
									int count;
									java.io.InputStream input= LibrarydownloadermathActivity.this._getMyContext(LibrarydownloadermathActivity.this).getAssets().open("libs/android.jar");
									java.io.OutputStream output = new  java.io.FileOutputStream("/storage/emulated/0/.sketchware/libs/local_libs/.main/android.jar");
									byte data[] = new byte[1024];
									while ((count = input.read(data))>0) {
											output.write(data, 0, count);
									}
									output.flush();
									output.close();
									input.close();
									
								}catch(Exception e){
											
								}
					}
					
					{
						new mod.hey.studios.project.library.LibraryDownloader(LibrarydownloadermathActivity.this._getMyContext(LibrarydownloadermathActivity.this), true,"/storage/emulated/0/.sketchware/libs/local_libs/" , "/storage/emulated/0/.sketchware/libs/local_libs/.main/android.jar" , "/storage/emulated/0/.sketchware/libs/local_libs/.main/class_path.jar").showDialog(new LibraryDownloader.OnCompleteListener() {
							
							@Override
							public void onComplete() {
								SketchwareUtil.showMessage(getApplicationContext(), "lib");
								_RefreshData();
							}
						});
					}
					dialog1.dismiss();
					
					}
			});
			dx.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
							
						{
							try{
									int count;
									java.io.InputStream input= LibrarydownloadermathActivity.this._getMyContext(LibrarydownloadermathActivity.this).getAssets().open("libs/core-lambda-stubs.jar");
									java.io.OutputStream output = new  java.io.FileOutputStream("/storage/emulated/0/.sketchware/libs/local_libs/.main/class_path.jar");
									byte data[] = new byte[1024];
									while ((count = input.read(data))>0) {
											output.write(data, 0, count);
									}
									output.flush();
									output.close();
									input.close();
									
								}catch(Exception e){
											
								}
					}
					{
							try{
									int count;
									java.io.InputStream input= LibrarydownloadermathActivity.this._getMyContext(LibrarydownloadermathActivity.this).getAssets().open("libs/android.jar");
									java.io.OutputStream output = new  java.io.FileOutputStream("/storage/emulated/0/.sketchware/libs/local_libs/.main/android.jar");
									byte data[] = new byte[1024];
									while ((count = input.read(data))>0) {
											output.write(data, 0, count);
									}
									output.flush();
									output.close();
									input.close();
									
								}catch(Exception e){
											
								}
					}
					
					{
						new mod.hey.studios.project.library.LibraryDownloader(LibrarydownloadermathActivity.this._getMyContext(LibrarydownloadermathActivity.this), false,"/storage/emulated/0/.sketchware/libs/local_libs/" , "/storage/emulated/0/.sketchware/libs/local_libs/.main/android.jar" , "/storage/emulated/0/.sketchware/libs/local_libs/.main/class_path.jar").showDialog(new LibraryDownloader.OnCompleteListener() {
							
							@Override
							public void onComplete() {
								SketchwareUtil.showMessage(getApplicationContext(), "lib");
								_RefreshData();
							}
						});
					}
					dialog1.dismiss();
					
					}
			});
			no.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
							
						dialog1.dismiss();
					
					}
			});
			dialog1.setCancelable(true);
			dialog1.show();
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void _RefreshData() {
		listview1.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE); listview1.setItemsCanFocus(false);
		File_map.clear();
		subtitle = Folder;
		FileUtil.listDir("/storage/emulated/0/.sketchware/libs/local_libs/", liststring);
		Collections.sort(liststring, String.CASE_INSENSITIVE_ORDER);
		position = 0;
		for(int _repeat14 = 0; _repeat14 < (int)(liststring.size()); _repeat14++) {
			{
				HashMap<String, Object> _item = new HashMap<>();
				_item.put("file", liststring.get((int)(position)));
				File_map.add(_item);
			}
			
			position++;
		}
		listview1.setAdapter(new Listview1Adapter(File_map));
		((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
	}
	
	
	public void _lib() {
	}
	public Context _getMyContext(Context c) {
		return c;
	}
	public Context _getMyContext(Fragment f) {
		return f.getActivity();
	}
	public Context _getMyContext(DialogFragment df) {
		return df.getActivity();
	}
	{
	}
	
	public class Listview1Adapter extends BaseAdapter {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Listview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		
		@Override
		public View getView(final int _position, View _v, ViewGroup _container) {
			LayoutInflater _inflater = getLayoutInflater();
			View _view = _v;
			if (_view == null) {
				_view = _inflater.inflate(R.layout.lib, null);
			}
			
			final androidx.cardview.widget.CardView cardview1 = _view.findViewById(R.id.cardview1);
			final LinearLayout linear1 = _view.findViewById(R.id.linear1);
			final ImageView imageview1 = _view.findViewById(R.id.imageview1);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			
			textview1.setText(Uri.parse(liststring.get((int)(_position))).getLastPathSegment());
			textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/myf.ttf"), 1);
			cardview1.setCardBackgroundColor(Color.TRANSPARENT);
			cardview1.setRadius((float)0);
			cardview1.setCardElevation((float)0);
			
			return _view;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}
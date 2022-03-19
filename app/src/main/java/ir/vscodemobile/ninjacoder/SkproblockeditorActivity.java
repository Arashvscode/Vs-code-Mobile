package ir.vscodemobile.ninjacoder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
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
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.HorizontalScrollView;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.View;
import androidx.webkit.*;
import mrAr.Stop.notmeDicompile.*;
import s4u.restore.swb.*;
import com.jtv7.rippleswitchlib.*;
import com.android.tools.r8.*;
import com.lwb.piechart.*;
import net.lingala.zip4j.*;
import io.github.rosemoe.sora.langs.textmate.*;
import io.github.rosemoe.sora.langs.base.*;
import com.github.underscore.lodash.*;
import com.example.myapp.*;
import org.jetbrains.kotlin.*;
import com.suke.widget.*;
import com.google.gson.*;
import com.github.angads25.filepicker.*;
import io.github.rosemoe.sora.*;
import com.android.*;
import com.googlecode.d2j.*;
import org.antlr.v4.runtime.*;
import com.caverock.androidsvg.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;
import androidx.core.content.ContextCompat;
import androidx.core.app.ActivityCompat;
import android.Manifest;
import android.content.pm.PackageManager;
import io.github.rosemoe.sora.widget.CodeEditor;

public class SkproblockeditorActivity extends AppCompatActivity {
	
	private FloatingActionButton _fab;
	private String blockpath = "";
	private String paletpath = "";
	private boolean isDark = false;
	private String type = "";
	private double returnNumber = 0;
	private double isExpanded = 0;
	
	private ArrayList<String> listStr = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linearAllData;
	private LinearLayout linearEditorContainer;
	private CardView cardview1;
	private LinearLayout linear4;
	private CardView cardview2;
	private LinearLayout linear7;
	private CardView cardview3;
	private LinearLayout linear12;
	private CardView cardview4;
	private LinearLayout linear15;
	private LinearLayout linear16;
	private LinearLayout linear17;
	private CardView cardview5;
	private LinearLayout linear23;
	private LinearLayout linear2;
	private EditText nameEdit;
	private TextView textview1;
	private LinearLayout linear24;
	private LinearLayout linear5;
	private EditText typeEdit;
	private ImageView imageview2;
	private TextView textview2;
	private LinearLayout linear25;
	private LinearLayout linear10;
	private EditText typeNameEdit;
	private TextView textview3;
	private LinearLayout linearSpecContainer;
	private LinearLayout linear52;
	private LinearLayout linearSpec2;
	private LinearLayout linear14;
	private HorizontalScrollView hscroll4;
	private TextView textview4;
	private EditText specEdit;
	private LinearLayout Spec2Lin;
	private LinearLayout linear50;
	private HorizontalScrollView hscroll10;
	private TextView textview51;
	private LinearLayout linear51;
	private EditText spec2Edit;
	private HorizontalScrollView hscroll5;
	private LinearLayout linearFirstRow;
	private TextView textview8;
	private TextView textview9;
	private TextView textview10;
	private TextView textview11;
	private TextView textview12;
	private TextView textview13;
	private TextView textview14;
	private TextView textview15;
	private TextView textview16;
	private TextView textview18;
	private TextView textview19;
	private TextView textview20;
	private TextView textview21;
	private TextView textview22;
	private TextView textview24;
	private TextView textview25;
	private TextView textview26;
	private TextView textview27;
	private HorizontalScrollView hscroll7;
	private LinearLayout linearRowTwo;
	private TextView textview28;
	private TextView textview29;
	private TextView textview30;
	private TextView textview31;
	private TextView textview32;
	private TextView textview33;
	private TextView textview34;
	private TextView textview35;
	private HorizontalScrollView hscroll8;
	private LinearLayout linearRowThree;
	private TextView textview36;
	private TextView textview37;
	private TextView textview38;
	private TextView textview39;
	private TextView textview40;
	private TextView textview41;
	private TextView textview42;
	private TextView textview43;
	private TextView textview44;
	private TextView textview45;
	private TextView textview46;
	private TextView textview47;
	private TextView textview48;
	private TextView textview49;
	private TextView textview50;
	private LinearLayout linear28;
	private LinearLayout linear19;
	private ImageView imgPickColor;
	private TextView textColor;
	private LinearLayout linearColor;
	private TextView textview5;
	private CodeEditor editor;
	
	private SharedPreferences sp;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.skproblockeditor);
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
		_fab = findViewById(R.id._fab);
		
		linear1 = findViewById(R.id.linear1);
		linearAllData = findViewById(R.id.linearAllData);
		linearEditorContainer = findViewById(R.id.linearEditorContainer);
		cardview1 = findViewById(R.id.cardview1);
		linear4 = findViewById(R.id.linear4);
		cardview2 = findViewById(R.id.cardview2);
		linear7 = findViewById(R.id.linear7);
		cardview3 = findViewById(R.id.cardview3);
		linear12 = findViewById(R.id.linear12);
		cardview4 = findViewById(R.id.cardview4);
		linear15 = findViewById(R.id.linear15);
		linear16 = findViewById(R.id.linear16);
		linear17 = findViewById(R.id.linear17);
		cardview5 = findViewById(R.id.cardview5);
		linear23 = findViewById(R.id.linear23);
		linear2 = findViewById(R.id.linear2);
		nameEdit = findViewById(R.id.nameEdit);
		textview1 = findViewById(R.id.textview1);
		linear24 = findViewById(R.id.linear24);
		linear5 = findViewById(R.id.linear5);
		typeEdit = findViewById(R.id.typeEdit);
		imageview2 = findViewById(R.id.imageview2);
		textview2 = findViewById(R.id.textview2);
		linear25 = findViewById(R.id.linear25);
		linear10 = findViewById(R.id.linear10);
		typeNameEdit = findViewById(R.id.typeNameEdit);
		textview3 = findViewById(R.id.textview3);
		linearSpecContainer = findViewById(R.id.linearSpecContainer);
		linear52 = findViewById(R.id.linear52);
		linearSpec2 = findViewById(R.id.linearSpec2);
		linear14 = findViewById(R.id.linear14);
		hscroll4 = findViewById(R.id.hscroll4);
		textview4 = findViewById(R.id.textview4);
		specEdit = findViewById(R.id.specEdit);
		Spec2Lin = findViewById(R.id.Spec2Lin);
		linear50 = findViewById(R.id.linear50);
		hscroll10 = findViewById(R.id.hscroll10);
		textview51 = findViewById(R.id.textview51);
		linear51 = findViewById(R.id.linear51);
		spec2Edit = findViewById(R.id.spec2Edit);
		hscroll5 = findViewById(R.id.hscroll5);
		linearFirstRow = findViewById(R.id.linearFirstRow);
		textview8 = findViewById(R.id.textview8);
		textview9 = findViewById(R.id.textview9);
		textview10 = findViewById(R.id.textview10);
		textview11 = findViewById(R.id.textview11);
		textview12 = findViewById(R.id.textview12);
		textview13 = findViewById(R.id.textview13);
		textview14 = findViewById(R.id.textview14);
		textview15 = findViewById(R.id.textview15);
		textview16 = findViewById(R.id.textview16);
		textview18 = findViewById(R.id.textview18);
		textview19 = findViewById(R.id.textview19);
		textview20 = findViewById(R.id.textview20);
		textview21 = findViewById(R.id.textview21);
		textview22 = findViewById(R.id.textview22);
		textview24 = findViewById(R.id.textview24);
		textview25 = findViewById(R.id.textview25);
		textview26 = findViewById(R.id.textview26);
		textview27 = findViewById(R.id.textview27);
		hscroll7 = findViewById(R.id.hscroll7);
		linearRowTwo = findViewById(R.id.linearRowTwo);
		textview28 = findViewById(R.id.textview28);
		textview29 = findViewById(R.id.textview29);
		textview30 = findViewById(R.id.textview30);
		textview31 = findViewById(R.id.textview31);
		textview32 = findViewById(R.id.textview32);
		textview33 = findViewById(R.id.textview33);
		textview34 = findViewById(R.id.textview34);
		textview35 = findViewById(R.id.textview35);
		hscroll8 = findViewById(R.id.hscroll8);
		linearRowThree = findViewById(R.id.linearRowThree);
		textview36 = findViewById(R.id.textview36);
		textview37 = findViewById(R.id.textview37);
		textview38 = findViewById(R.id.textview38);
		textview39 = findViewById(R.id.textview39);
		textview40 = findViewById(R.id.textview40);
		textview41 = findViewById(R.id.textview41);
		textview42 = findViewById(R.id.textview42);
		textview43 = findViewById(R.id.textview43);
		textview44 = findViewById(R.id.textview44);
		textview45 = findViewById(R.id.textview45);
		textview46 = findViewById(R.id.textview46);
		textview47 = findViewById(R.id.textview47);
		textview48 = findViewById(R.id.textview48);
		textview49 = findViewById(R.id.textview49);
		textview50 = findViewById(R.id.textview50);
		linear28 = findViewById(R.id.linear28);
		linear19 = findViewById(R.id.linear19);
		imgPickColor = findViewById(R.id.imgPickColor);
		textColor = findViewById(R.id.textColor);
		linearColor = findViewById(R.id.linearColor);
		textview5 = findViewById(R.id.textview5);
		editor = findViewById(R.id.editor);
		sp = getSharedPreferences("block", Activity.MODE_PRIVATE);
		
		imageview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				listStr.add("regular");
				listStr.add("c");
				listStr.add("s");
				listStr.add("d");
				listStr.add("b");
				listStr.add("e");
				listStr.add("v");
				listStr.add("a");
				listStr.add("f");
				listStr.add("l");
				listStr.add("p");
				listStr.add("h");
				{
					final String[] array = listStr.toArray(new String[0]);
					final String[] chosen = {""};
					AlertDialog.Builder builder;
					
					boolean dark = true;
					
					if (dark) {
							builder = new AlertDialog.Builder(SkproblockeditorActivity.this, AlertDialog.THEME_DEVICE_DEFAULT_DARK);
					} else {
							builder = new AlertDialog.Builder(SkproblockeditorActivity.this);
					}
					
					
					builder.setCancelable(false);
					        //builder.setIcon(R.drawable.icon);
					        builder.setTitle("Select");
					        builder.setSingleChoiceItems(array, -1, new DialogInterface
					                .OnClickListener() {
						            public void onClick(DialogInterface dialog, int item) {
							              
							              chosen[0] = array[item];
							              
							            }
						        });
					        
					        builder.setPositiveButton("✅", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface dialog, int _which) {
							
							
									
							}
					});
					
					builder.setNegativeButton("🚪", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
							
							
									
							}
					});
					
					        final AlertDialog alert = builder.create();
					        alert.show();
					
					alert.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener(new View.OnClickListener()
					 { 
							 @Override
							 public void onClick(View v)
							 {
									 Boolean wantToCloseDialog = false;
							
							
							String item = chosen[0];
							if (item.isEmpty()){
								
							} else {
								typeEdit.setText(_setType(item));
								alert.dismiss();
							}
									 if(wantToCloseDialog) {
											 
											 }
									 }
							 });
					
				}
			}
		});
		
		imgPickColor.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ColorPicker seekColorPicker = new ColorPicker(SkproblockeditorActivity.this);
				
						final AlertDialog.Builder buildPicker = new AlertDialog.Builder(SkproblockeditorActivity.this);
				
						final LinearLayout linPicker = new LinearLayout(getApplicationContext());
				
				
						
				
				
				
						linPicker.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
				
						linPicker.setOrientation(LinearLayout.VERTICAL);
				
						linPicker.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL);
				
				
				
						buildPicker.setPositiveButton("✔️", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialogInterface, int i) {
						textColor.setTextColor(Color.parseColor(hex.getText().toString()));
						linearColor.setBackgroundColor(Color.parseColor(hex.getText().toString()));
								}
						});
				
				
				
						linPicker.addView(seekColorPicker);
						buildPicker.setView(linPicker);
						buildPicker.show();
			}
		});
		
		_fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "soon addet");
			}
		});
	}
	
	private void initializeLogic() {
		editor.setColorScheme(new  ir.vscodemobile.ninjacoder.theme());
		cardview1.setCardBackgroundColor(0xFF00003A);
		cardview2.setCardBackgroundColor(0xFF00003A);
		cardview3.setCardBackgroundColor(0xFF00003A);
		cardview4.setCardBackgroundColor(0xFF00003A);
		cardview5.setCardBackgroundColor(0xFF00003A);
		cardview1.setRadius((float)21);
		cardview2.setRadius((float)21);
		cardview3.setRadius((float)21);
		cardview4.setRadius((float)21);
		cardview5.setRadius((float)21);
		cardview1.setCardElevation((float)0);
		cardview2.setCardElevation((float)0);
		cardview3.setCardElevation((float)0);
		cardview4.setCardElevation((float)0);
		cardview5.setCardElevation((float)0);
		blockpath = FileUtil.getExternalStorageDir().concat("/.sketchware/resources/block/My Block/block.json");
		paletpath = FileUtil.getPackageDataDir(getApplicationContext()).concat("/.sketchware/resources/block/My Block/palette.json");
		typeEdit.setText("regular");
		try {
			try {
				nameEdit.setText(getIntent().getStringExtra("name"));
				typeEdit.setText(getIntent().getStringExtra("spce"));
				typeNameEdit.setText(getIntent().getStringExtra("typeName"));
				specEdit.setText(getIntent().getStringExtra("spec"));
				linearColor.setBackgroundColor(Color.parseColor(getIntent().getStringExtra("color")));
				textColor.setText(getIntent().getStringExtra("color"));
				{
						StringBuilder stringBuilder = new StringBuilder();
						
						try {
								
								Scanner scanner = new Scanner(getIntent().getStringExtra("code")).useDelimiter("\\Z");
								while (scanner.hasNext()) {
										stringBuilder .append(scanner.next());
								}
								editor.setText(stringBuilder );
						} catch (Exception rt) {
								rt.printStackTrace();
						}
				}
			} catch (Exception e) {
				 
			}
			if (getIntent().getStringExtra("type").equals("e")) {
				linearSpec2.setVisibility(View.GONE);
			}
			else {
				if (getIntent().hasExtra("spec2")) {
					spec2Edit.setText(getIntent().getStringExtra("spec2"));
					linearSpec2.setVisibility(View.VISIBLE);
				}
			}
		} catch (Exception e) {
			SketchwareUtil.showMessage(getApplicationContext(), e.toString());
		}
		_clickAddText();
		returnNumber = linearAllData.getHeight();
		getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE|WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
	}
	
	public void _clickAddText() {
		for(int _repeat10 = 0; _repeat10 < (int)(linearFirstRow.getChildCount()); _repeat10++) {
				final View vv = linearFirstRow.getChildAt((int)_repeat10);
				if (vv instanceof TextView) {
						((TextView)vv).setOnClickListener(new View.OnClickListener() {
								@Override
								public void onClick(View _view) {
										String textoo = ((TextView)vv).getTag().toString();
										int start = specEdit.getSelectionStart(); 
										specEdit.getText().insert(start, textoo);
								}
						});
						((TextView)vv).setOnTouchListener(new View.OnTouchListener() {
								@Override
								public boolean onTouch(View v, MotionEvent event) {
										switch (event.getAction()){
												case MotionEvent.ACTION_DOWN:{
														ObjectAnimator scaleX = new ObjectAnimator();
														scaleX.setTarget(((TextView)vv));
														scaleX.setPropertyName("scaleX");
														scaleX.setFloatValues(0.9f);
														scaleX.setDuration((int)5);
														scaleX.start();
														
														ObjectAnimator scaleY = new ObjectAnimator();
														scaleY.setTarget(((TextView)vv));
														scaleY.setPropertyName("scaleY");
														scaleY.setFloatValues(0.9f);
														scaleY.setDuration((int)5);
														scaleY.start();
														break;
												}
												case MotionEvent.ACTION_UP:{
														
														ObjectAnimator scaleX = new ObjectAnimator();
														scaleX.setTarget(((TextView)vv));
														scaleX.setPropertyName("scaleX");
														scaleX.setFloatValues((float)1);
														scaleX.setDuration((int)5);
														scaleX.start();
														
														ObjectAnimator scaleY = new ObjectAnimator();
														scaleY.setTarget(((TextView)vv));
														scaleY.setPropertyName("scaleY");
														scaleY.setFloatValues((float)1);
														scaleY.setDuration((int)5);
														scaleY.start();
														
														break;
												}
										}
										return false;
								}
						});
						((TextView)vv).setOnLongClickListener(new View.OnLongClickListener() {
									         @Override
									         public boolean onLongClick(View v) {
												      
												String txt = "";
												
												txt = v.getTag().toString();
												
												ClipData.Item item = new ClipData.Item(txt);
														ClipData dragData = new ClipData(txt, new String[]{
																		ClipDescription.MIMETYPE_TEXT_PLAIN }, item);
														DragShadowBuilder myShadow = new View.DragShadowBuilder(((TextView)vv));
														if (Build.VERSION.SDK_INT >= 24){v.startDragAndDrop(dragData, myShadow, ((TextView)vv), 0); } else {
																		v.startDrag(dragData, myShadow, ((TextView)vv), 0); }
												
												 
														  
												            return true;
												         }
									      });
						((TextView)vv).setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c) { this.setStroke(a, b); this.setColor(c); return this; } }.getIns((int)2, 0xFFBDBDBD, Color.TRANSPARENT));
						((TextView)vv).setPadding(8,3,8,3);
						if (isDark) {
								((TextView)vv).setTextColor(0xFFFFAB91);
						}
						else {
								((TextView)vv).setTextColor(0xFFBF360C);
						}
				}
		}
		for(int _repeat11 = 0; _repeat11 < (int)(linearRowTwo.getChildCount()); _repeat11++) {
				final View vv = linearRowTwo.getChildAt((int)_repeat11);
				if (vv instanceof TextView) {
						((TextView)vv).setOnClickListener(new View.OnClickListener() {
								@Override
								public void onClick(View _view) {
										String textoo = ((TextView)vv).getTag().toString();
										int start = specEdit.getSelectionStart(); 
										specEdit.getText().insert(start, textoo);
								}
						});
						((TextView)vv).setOnTouchListener(new View.OnTouchListener() {
								@Override
								public boolean onTouch(View v, MotionEvent event) {
										switch (event.getAction()){
												case MotionEvent.ACTION_DOWN:{
														ObjectAnimator scaleX = new ObjectAnimator();
														scaleX.setTarget(((TextView)vv));
														scaleX.setPropertyName("scaleX");
														scaleX.setFloatValues(0.9f);
														scaleX.setDuration((int)5);
														scaleX.start();
														
														ObjectAnimator scaleY = new ObjectAnimator();
														scaleY.setTarget(((TextView)vv));
														scaleY.setPropertyName("scaleY");
														scaleY.setFloatValues(0.9f);
														scaleY.setDuration((int)5);
														scaleY.start();
														break;
												}
												case MotionEvent.ACTION_UP:{
														
														ObjectAnimator scaleX = new ObjectAnimator();
														scaleX.setTarget(((TextView)vv));
														scaleX.setPropertyName("scaleX");
														scaleX.setFloatValues((float)1);
														scaleX.setDuration((int)5);
														scaleX.start();
														
														ObjectAnimator scaleY = new ObjectAnimator();
														scaleY.setTarget(((TextView)vv));
														scaleY.setPropertyName("scaleY");
														scaleY.setFloatValues((float)1);
														scaleY.setDuration((int)5);
														scaleY.start();
														
														break;
												}
										}
										return false;
								}
						});
						((TextView)vv).setOnLongClickListener(new View.OnLongClickListener() {
									         @Override
									         public boolean onLongClick(View v) {
												      
												String txt = "";
												
												txt = v.getTag().toString();
												
												ClipData.Item item = new ClipData.Item(txt);
														ClipData dragData = new ClipData(txt, new String[]{
																		ClipDescription.MIMETYPE_TEXT_PLAIN }, item);
														DragShadowBuilder myShadow = new View.DragShadowBuilder(((TextView)vv));
														if (Build.VERSION.SDK_INT >= 24){v.startDragAndDrop(dragData, myShadow, ((TextView)vv), 0);
																 } else {
																		v.startDrag(dragData, myShadow, ((TextView)vv), 0); }
												
												 
														  
												            return true;
												         }
									      });
						((TextView)vv).setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c) { this.setStroke(a, b); this.setColor(c); return this; } }.getIns((int)2, 0xFFBDBDBD, Color.TRANSPARENT));
						((TextView)vv).setPadding(8,3,8,3);
				}
		}
		for(int _repeat12 = 0; _repeat12 < (int)(linearRowThree.getChildCount()); _repeat12++) {
				final View vv = linearRowThree.getChildAt((int)_repeat12);
				if (vv instanceof TextView) {
						((TextView)vv).setOnClickListener(new View.OnClickListener() {
								@Override
								public void onClick(View _view) {
										String textoo = ((TextView)vv).getTag().toString();
										int start = specEdit.getSelectionStart(); 
										specEdit.getText().insert(start, textoo);
								}
						});
						((TextView)vv).setOnTouchListener(new View.OnTouchListener() {
								@Override
								public boolean onTouch(View v, MotionEvent event) {
										switch (event.getAction()){
												case MotionEvent.ACTION_DOWN:{
														ObjectAnimator scaleX = new ObjectAnimator();
														scaleX.setTarget(((TextView)vv));
														scaleX.setPropertyName("scaleX");
														scaleX.setFloatValues(0.9f);
														scaleX.setDuration((int)5);
														scaleX.start();
														
														ObjectAnimator scaleY = new ObjectAnimator();
														scaleY.setTarget(((TextView)vv));
														scaleY.setPropertyName("scaleY");
														scaleY.setFloatValues(0.9f);
														scaleY.setDuration((int)5);
														scaleY.start();
														break;
												}
												case MotionEvent.ACTION_UP:{
														
														ObjectAnimator scaleX = new ObjectAnimator();
														scaleX.setTarget(((TextView)vv));
														scaleX.setPropertyName("scaleX");
														scaleX.setFloatValues((float)1);
														scaleX.setDuration((int)5);
														scaleX.start();
														
														ObjectAnimator scaleY = new ObjectAnimator();
														scaleY.setTarget(((TextView)vv));
														scaleY.setPropertyName("scaleY");
														scaleY.setFloatValues((float)1);
														scaleY.setDuration((int)5);
														scaleY.start();
														
														break;
												}
										}
										return false;
								}
						});
						((TextView)vv).setOnLongClickListener(new View.OnLongClickListener() {
									         @Override
									         public boolean onLongClick(View v) {
												      
												String txt = "";
												
												txt = v.getTag().toString();
												
												ClipData.Item item = new ClipData.Item(txt);
														ClipData dragData = new ClipData(txt, new String[]{
																		ClipDescription.MIMETYPE_TEXT_PLAIN }, item);
														DragShadowBuilder myShadow = new View.DragShadowBuilder(((TextView)vv));
														if (Build.VERSION.SDK_INT >= 24){v.startDragAndDrop(dragData, myShadow, ((TextView)vv), 0); } else {
																		v.startDrag(dragData, myShadow, ((TextView)vv), 0); }
												
												 
														  
												            return true;
												         }
									      });
						((TextView)vv).setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c) { this.setStroke(a, b); this.setColor(c); return this; } }.getIns((int)2, 0xFFBDBDBD, Color.TRANSPARENT));
						((TextView)vv).setPadding(8,3,8,3);
				}
		}
		specEdit.setOnDragListener( new OnDragListener(){
					         @Override
					         public boolean onDrag(View v,  DragEvent event){
								View view = (View) event.getLocalState();
								int offset = specEdit.getOffsetForPosition(event.getX(), event.getY()); 
								         switch(event.getAction())                   
								         {
											            case DragEvent.ACTION_DRAG_STARTED:
											if (event.getClipDescription().hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN)) {
														//vib.vibrate((long)100);
														v.invalidate();
														return true;
											}
											return false;
											case DragEvent.ACTION_DRAG_ENTERED:
											v.invalidate();
											return true;
											case DragEvent.ACTION_DRAG_LOCATION:
											final int x = (int)event.getX();
											final int y =(int) event.getY();
											
											
											   
											   specEdit.setSelection(offset);
											
											return true;
											case DragEvent.ACTION_DRAG_EXITED:
											
											v.invalidate();
											return true;
											case DragEvent.ACTION_DROP:
											ClipData.Item item = event.getClipData().getItemAt(0);
											String dragData = item.getText().toString();
											
											
											               
													
											   
											   specEdit.setSelection(offset);
											   
															specEdit.getText().insert(offset, " "+view.getTag().toString()+ " ");
															
															
											
											v.invalidate();
											return true;
											case DragEvent.ACTION_DRAG_ENDED:
											v.invalidate();
											if (event.getResult()) {
														 
											} else {
														 
											}
											return true;
											default:
											break;
											            }
								            return true;
								         }
					      });
		typeNameEdit.setOnDragListener( new OnDragListener(){
				         @Override
				         public boolean onDrag(View v,  DragEvent event){
						View view = (View) event.getLocalState();
						         switch(event.getAction())                   
						         {
								            case DragEvent.ACTION_DRAG_STARTED:
								if (event.getClipDescription().hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN)) {
										//vib.vibrate((long)100);
										v.invalidate();
										return true;
								}
								return false;
								case DragEvent.ACTION_DRAG_ENTERED:
								v.invalidate();
								return true;
								case DragEvent.ACTION_DRAG_LOCATION:
								final int x = (int)event.getX();
								final int y =(int) event.getY();
								
								return true;
								case DragEvent.ACTION_DRAG_EXITED:
								
								v.invalidate();
								return true;
								case DragEvent.ACTION_DROP:
								ClipData.Item item = event.getClipData().getItemAt(0);
								String dragData = item.getText().toString();
								
								
								               String textoo = ((TextView)view).getText().toString();
								int start = typeNameEdit.getSelectionStart(); 
								typeNameEdit.getText().insert(start, textoo);
								
								v.invalidate();
								return true;
								case DragEvent.ACTION_DRAG_ENDED:
								v.invalidate();
								if (event.getResult()) {
										 
								} else {
										 
								}
								return true;
								default:
								break;
								            }
						            return true;
						         }
				      });
	}
	
	
	public String _setType(final String _text) {
		if (_text.equals("regular")) {
			type = " ";
		}
		else {
			if (_text.startsWith("c")) {
				type = "c";
			}
			else {
				if (_text.startsWith("s")) {
					type = "s";
				}
				else {
					if (_text.startsWith("d")) {
						type = "d";
					}
					else {
						if (_text.startsWith("b")) {
							type = "b";
						}
						else {
							if (_text.startsWith("e")) {
								type = "e";
							}
							else {
								if (_text.startsWith("v")) {
									type = "v";
								}
								else {
									if (_text.startsWith("a")) {
										type = "a";
									}
									else {
										if (_text.startsWith("f")) {
											type = "f";
										}
										else {
											if (_text.startsWith("l")) {
												type = "l";
											}
											else {
												if (_text.startsWith("p")) {
													type = "p";
												}
												else {
													if (_text.startsWith("h")) {
														type = "h";
													}
													else {
														type = " ";
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return type;
	}
	
	
	public void _colorpickerlib() {
	}
		 private Button btnCopy;
		 private EditText hex;
		 private EditText hex2;
		 private boolean isSimleDialog = false;
		 public static interface OnColorChangedListener
		 {
				 public void onColorChanged(ColorPicker picker, int color);
			 }
		 class ColorPicker extends LinearLayout
		 {
				 private SeekBar r;
				 private SeekBar g;
				 private SeekBar b;
				 private TextView colorShow;
				 private SeekBar.OnSeekBarChangeListener listener;
				 private OnColorChangedListener l;
				 public ColorPicker(Context c)
				 {
						 super(c);
						 init();
					 }
		
				 private void init(){
						 setPadding(16, 16, 16, 16);
						 setGravity(Gravity.CENTER);
						 setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
						 colorShow = new TextView(getContext());
						 colorShow.setLayoutParams(new ViewGroup.LayoutParams(60, 60));
						 addView(colorShow);
						 listener = new SeekBar.OnSeekBarChangeListener(){
								 @Override
								 public void onProgressChanged(SeekBar p1, int p2, boolean p3)
								 {
										 int color = Color.rgb(r.getProgress(), g.getProgress(), b.getProgress());
										 String temp = String.format("0x%08X", color);
										 String result = temp.substring(2);
										 hex.setText("#" + result);
										 hex2.setText("0x" + result);
										 hex.getBackground().setColorFilter(color, PorterDuff.Mode.SRC_IN);
										 colorShow.setBackgroundColor(color);
										 btnCopy.setBackgroundColor(color);
					
										 double darkness = 1-(0.299*Color.red(color) + 0.587*Color.green(color) + 0.114*Color.blue(color))/255;
					
										 if(darkness<0.5){
												 btnCopy.setTextColor(Color.BLACK);
											 }else{
												 btnCopy.setTextColor(Color.WHITE);
											 }
					
					
					
										 if(l != null) l.onColorChanged(ColorPicker.this, color);
									 }
								 @Override public void onStartTrackingTouch(SeekBar p1){}
								 @Override public void onStopTrackingTouch(SeekBar p1){}
							 };
						 LinearLayout lay2 = new LinearLayout(getContext());
						 lay2.setOrientation(VERTICAL);
						 lay2.setPadding(8, 0, 8, 8);
						 lay2.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
						 hex = new EditText(getContext());
						 hex2 = new EditText(getContext());
						 ViewGroup.MarginLayoutParams params = new ViewGroup.MarginLayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
						 params.setMargins(16, 0, 16, 0);
						 hex.setLayoutParams(params);
						 hex2.setLayoutParams(params);
						 hex.setCursorVisible(false);
			
						 hex.setImeOptions(android.view.inputmethod.EditorInfo.IME_ACTION_DONE);
						 hex.setText("#000000");
						 hex2.setText("0xFF000000");
						 hex.setOnEditorActionListener(new TextView.OnEditorActionListener(){
								 @Override
								 public boolean onEditorAction(TextView text, int code, KeyEvent event)
								 {
										 try {
												 int color = Color.parseColor(text.getText().toString());
												 r.setProgress(Color.red(color));
												 g.setProgress(Color.green(color));
												 b.setProgress(Color.blue(color));
											 } catch(Exception e){
												 Toast.makeText(getContext(), "Color code is wrong", Toast.LENGTH_SHORT).show();
											 }
										 return true;
									 }
							 });
			
						 btnCopy = new Button(getApplicationContext());
			
						 btnCopy.setTextSize(15);
			
			if (isSimleDialog) {
							 if (Locale.getDefault().getDisplayLanguage().equals("العربية")){
									 btnCopy.setText("کپی");
								 } else {
									 btnCopy.setText("Copy");
								 }
							     btnCopy.setClickable(true);
							 } if (! isSimleDialog) {
								 btnCopy.setText("");
								 btnCopy.setClickable(false);
							 }
			
						 btnCopy.setTypeface(Typeface.MONOSPACE);
			
						 btnCopy.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
						 
						 btnCopy.setPadding(0,0,0,0);
						 
						 btnCopy.setBackgroundColor(Color.BLACK);
						 
						 btnCopy.setTextColor(Color.WHITE);
			
						 btnCopy.setOnClickListener(new View.OnClickListener() {
								 @Override
								 public void onClick(View view) {
										 try {
												 android.content.ClipboardManager clipboard = (android.content.ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
												 ClipData clip = ClipData.newPlainText("label", hex.getText().toString());
												 clipboard.setPrimaryClip(clip);
												 Toast.makeText(getApplicationContext(), "✓", Toast.LENGTH_SHORT).show();
											 } catch (Exception e) {
												 e.printStackTrace();
											 }
									 }
							 });
			
						 lay2.addView(hex);
						 lay2.addView(hex2);
						 r = new SeekBar(getContext());
						 setProgressColor(r, 0xffcc5577);
						 r.setMax(255);
						 r.setOnSeekBarChangeListener(listener);
						 lay2.addView(r);
						 g = new SeekBar(getContext());
						 setProgressColor(g, 0xff339977);
						 g.setMax(255);
						 g.setOnSeekBarChangeListener(listener);
						 lay2.addView(g);
						 b = new SeekBar(getContext());
						 setProgressColor(b, 0xff6077bb);
						 b.setMax(255);
						 b.setOnSeekBarChangeListener(listener);
						 lay2.addView(b);
						 addView(lay2);
						 int color = Color.parseColor(hex.getText().toString());
						 r.setProgress(Color.red(color));
						 g.setProgress(Color.green(color));
						 b.setProgress(Color.blue(color));
						 colorShow.setBackgroundColor(color);
						 lay2.addView(btnCopy);
					 }
				 public void setColor(int color)
				 {
						 hex.setText("#" + String.format("0x%08X", color).substring(2));
						 hex2.setText("0x" + String.format("0x%08X", color).substring(2));
						 r.setProgress(Color.red(color));
						 g.setProgress(Color.green(color));
						 b.setProgress(Color.blue(color));
			
			
			
					 }
				 public int getColor(boolean refreshFromSlider)
				 {
						 if(refreshFromSlider)
							 listener.onProgressChanged(null, 0, false);
						 return Color.parseColor(hex.getText().toString());
					 }
				 public int getColor()
				 {
						 return getColor(true);
					 }
				 public void setOnColorChangedListener(OnColorChangedListener l)
				 {
						 this.l = l;
					 }
				 private void setProgressColor(AbsSeekBar bar, int color)
				 {
						 bar.getProgressDrawable().setColorFilter(color, PorterDuff.Mode.SRC_IN); bar.getThumb().setColorFilter(color, PorterDuff.Mode.SRC_IN);
					 }
			 }
		 {
		
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
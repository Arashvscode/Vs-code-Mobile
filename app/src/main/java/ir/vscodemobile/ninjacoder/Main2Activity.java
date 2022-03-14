package ir.vscodemobile.ninjacoder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
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
import android.widget.Button;
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
import org.antlr.v4.runtime.*;
import com.caverock.androidsvg.*;
import dos.ir.res.*;
import com.googlecode.d2j.*;
import com.android.*;
import io.github.rosemoe.sora.*;
import com.github.angads25.filepicker.*;
import com.google.gson.*;
import com.suke.widget.*;
import javaxml.*;
import com.github.underscore.lodash.*;
import com.example.myapp.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;
import androidx.core.content.ContextCompat;
import androidx.core.app.ActivityCompat;
import android.Manifest;
import android.content.pm.PackageManager;
import io.github.rosemoe.sora.widget.CodeEditor;
import ir.vscodemobile.ninjacoder.theme;
import io.github.rosemoe.sora.langs.java.JavaLanguage;
import dalvik.system.*;
import com.bobur.util.CompileLogHelper;

public class Main2Activity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private FloatingActionButton _fab;
	
	private ArrayList<String> otp = new ArrayList<>();
	private ArrayList<String> opt = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private CodeEditor editor;
	private Button run;
	private Button btn_smali;
	private Button btn_s2j;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main2);
		initialize(_savedInstanceState);
		
		if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED
		|| ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1000);
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
		_fab = findViewById(R.id._fab);
		
		linear1 = findViewById(R.id.linear1);
		linear3 = findViewById(R.id.linear3);
		linear4 = findViewById(R.id.linear4);
		linear5 = findViewById(R.id.linear5);
		linear6 = findViewById(R.id.linear6);
		linear7 = findViewById(R.id.linear7);
		linear8 = findViewById(R.id.linear8);
		linear9 = findViewById(R.id.linear9);
		editor = findViewById(R.id.editor);
		run = findViewById(R.id.run);
		btn_smali = findViewById(R.id.btn_smali);
		btn_s2j = findViewById(R.id.btn_s2j);
		
		run.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				new AsyncTask<String, String, String>() {
					ProgressDialog pr;
					long ecjTime, dxTime;
					@Override
					protected void onPreExecute() {
						pr = new ProgressDialog(Main2Activity.this);
						
						pr.setMessage("Running...");
						
						pr.setCancelable(false);
						
						pr.show();
					}
					@Override
					protected String doInBackground(String... params) {
						String _param = params[0];
						//code that prepares the files
						FileUtil.deleteFile(FileUtil.getPackageDataDir(getApplicationContext()).concat("/vscodeandroid/"));
						FileUtil.makeDir(FileUtil.getPackageDataDir(getApplicationContext()).concat("/vscodeandroid/"));
						FileUtil.writeFile(FileUtil.getPackageDataDir(getApplicationContext()).concat("/vscodeandroid/Main.java"), editor.getText().toString());
						//code that copies cp.jar from assets to temp folder (if not exists)
						if (!FileUtil.isExistFile(FileUtil.getPackageDataDir(getApplicationContext()).concat("/bin/cp.jar"))) {
							try (InputStream input = getAssets().open("cp.jar");
							OutputStream output = new FileOutputStream(
							FileUtil.getPackageDataDir(getApplicationContext()).concat("/vscodeandroid/cp.jar")
							)) {
										byte[] buffer = new byte[input.available()];
										int length;
										while ((length = input.read(buffer)) != -1) {
													output.write(buffer, 0, length);
										}
										
							} catch (FileNotFoundException e) {
										
							} catch (IOException e) {
										
							}
							
						}
						//code that runs ecj
						long time = System.currentTimeMillis();
						publishProgress("Compiling Java...");
						opt.clear();
						opt.add("-1.8");
						opt.add("-nowarn");
						opt.add("-deprecation");
						opt.add("-d");
						opt.add(FileUtil.getPackageDataDir(getApplicationContext()).concat("/vscodeandroid/classes"));
						opt.add("-cp");
						opt.add(FileUtil.getPackageDataDir(getApplicationContext()).concat("/vscodeandroid/cp.jar"));
						opt.add("-proc:none");
						opt.add("-sourcepath");
						opt.add("ignore");
						opt.add(FileUtil.getPackageDataDir(getApplicationContext()).concat("/vscodeandroid/Main.java"));
						PrintWriter printWriter = new PrintWriter(new OutputStream() {
									@Override
									public void write(int p1) throws IOException
									{
												//do nothing
									}
						});
						
						final StringBuilder errs = new StringBuilder();
						
						PrintWriter printWriter2 = new PrintWriter(new OutputStream() {
									@Override
									public void write(int p1) throws IOException
									{
												errs.append((char)p1);
									}
						});
						
						org.eclipse.jdt.internal.compiler.batch.Main main = new org.eclipse.jdt.internal.compiler.batch.Main(printWriter2, printWriter2, false, null, null);
						
						main.compile(opt.toArray(new String[0]));
						
						if(main.globalErrorsCount > 0) {
							    return errs.toString();
						}
						ecjTime = System.currentTimeMillis() - time;
						//code that packages classes to a JAR
						publishProgress("Packaging JAR...");
						try {
							new JarPackager(
							
							FileUtil.getPackageDataDir(getApplicationContext()).concat("/vscodeandroid/classes/"),
							
							FileUtil.getPackageDataDir(getApplicationContext()).concat("/vscodeandroid/classes.jar")
							
							).create();
						} catch (Exception e) {
							return "Packaging JAR failed: " + e.toString();
						}
						//code that runs d8 //dx
						time = System.currentTimeMillis();
						try {
							publishProgress("Dexing with D8...");
							/*

*/
							opt.clear();
							opt.add("--output");
							opt.add(FileUtil.getPackageDataDir(getApplicationContext()).concat("/vscodeandroid/"));
							opt.add("--lib");
							opt.add(FileUtil.getPackageDataDir(getApplicationContext()).concat("/vscodeandroid/cp.jar"));
							opt.add(FileUtil.getPackageDataDir(getApplicationContext()).concat("/vscodeandroid/classes.jar"));
							D8.main(opt.toArray(new String[0]));
						} catch (Exception e) {
							return "Dex failed: " + e.toString();
						}
						dxTime = System.currentTimeMillis() - time;
						return "";
					}
					@Override
					protected void onProgressUpdate(String... values) {
						pr.setMessage(values[0]);
					}
					@Override
					protected void onPostExecute(String _result) {
						pr.dismiss();
						if (TextUtils.isEmpty(_result)) {
							final TextView tx = new TextView(Main2Activity.this);
							tx.setLayoutParams(new LinearLayout.LayoutParams(-2,-2));
							tx.setTextSize(15);
							//tx.setTextColor(Color.BLACK);
							tx.setTextColor(0xFF2196F3);
							tx.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/myf.ttf"), 2);
							tx.setPadding(30,30,30,30);
							tx.setTextIsSelectable(true);
							
							final ScrollView sc = new ScrollView(Main2Activity.this);
							sc.setLayoutParams(new LinearLayout.LayoutParams(-1,-2));
							sc.addView(tx);
							//final 
							//code that starts listening to system prints
							OutputStream _outstream = new OutputStream() {
								    @Override
								    public void write(int b) {
									         tx.append(String.valueOf((char)b));
									    }
								
								@Override
								public String toString() {
									return tx.getText().toString();
								}
								
							};
							
							System.setOut(new PrintStream(_outstream));
							System.setErr(new PrintStream(_outstream));
							//code that loads the final dex
							try {
								String optimizedDir = getApplicationContext().getDir("odex", MODE_PRIVATE).getAbsolutePath();
								
								DexClassLoader dcl = new DexClassLoader( 
								FileUtil.getPackageDataDir(getApplicationContext()).concat("/bin/classes.dex")
								, optimizedDir, null, getClassLoader() ); 
								
								Class calledClass = dcl.loadClass("Main");
								
								java.lang.reflect.Method method = calledClass.getDeclaredMethod("main", String[].class); 
								
								String[] param = {};
								
								Object result = method.invoke(null, new Object[] {param});
								btn_smali.performClick();
							} catch(java.lang.reflect.InvocationTargetException i) {
								dialog("Failed..", "Runtime error: " + i.getCause().toString());
								return;
							} catch(Exception e) {
								dialog("Failed..", "Couldn't execute the dex: " + e.toString() + "\n\nSystem logs:\n" + _outstream.toString() );
								return;
							}
							/*
//code that shows the dialog
new AlertDialog.Builder(Main2Activity.this)
.setTitle("Output (ecj:" + ecjTime + "ms | d8:" + dxTime + "ms)")
.setView(sc)
.setPositiveButton("OK", null)
.setNegativeButton("Cancel", null)
.setOnDismissListener(new DialogInterface.OnDismissListener() {
		@Override
		public void onDismiss(DialogInterface dialogInterface) {
		    
		}
})
.create().show();
*/
						}
						else {
							dialog("Failed..", _result);
						}
					}
					public void dialog(String title, String message) {
								AlertDialog.Builder dialog =	new AlertDialog.Builder(Main2Activity.this)
								.setTitle(title)
								.setMessage(CompileLogHelper.colorErrsAndWarnings(message))
								.setPositiveButton("OK", null)
								.setNegativeButton("Cancel", null);
								
								AlertDialog dlg = dialog.create();
								dlg.show();
								
								View messageView = dlg.findViewById(android.R.id.message);
								if (messageView instanceof TextView) {
											((TextView) messageView).setTextIsSelectable(true);
								}
					}
				}.execute("");
			}
		});
		
		btn_smali.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				new AsyncTask<String, String, String>() {
					ProgressDialog prog;
					@Override
					protected void onPreExecute() {
						prog = new ProgressDialog(Main2Activity.this);
						
						prog.setMessage("Running baksmali...");
						
						prog.setCancelable(false);
						
						prog.show();
						
					}
					@Override
					protected String doInBackground(String... params) {
						String _param = params[0];
						String[] str = new String[] {
							"-f", "-o",
							
							FileUtil.getPackageDataDir(getApplicationContext()).concat("/vscodeandroid/smali/"),
							 FileUtil.getPackageDataDir(getApplicationContext()).concat("/vscodeandroid/classes.dex")
						};
						com.googlecode.d2j.smali.BaksmaliCmd.main(str);
						return "";
					}
					@Override
					protected void onPostExecute(String _result) {
						//code that Dismiss progress dialog
						prog.dismiss();
						_v();
						//code that Create custom dialog
						final AlertDialog d = new AlertDialog.Builder(Main2Activity.this).create();
						View dinflate = getLayoutInflater().inflate(R.layout.dialog,null); d.setView(dinflate);
						//code that Find Views
						io.github.rosemoe.sora.widget.CodeEditor editor_d = (io.github.rosemoe.sora.widget.CodeEditor)dinflate.findViewById(R.id.editor);
						LinearLayout d_nav = (LinearLayout)dinflate.findViewById(R.id.nav);
						LinearLayout save = (LinearLayout)dinflate.findViewById(R.id.save);
						LinearLayout convert = (LinearLayout)dinflate.findViewById(R.id.convert);
						TextView title = (TextView)dinflate.findViewById(R.id.title);
						ImageView close = (ImageView)dinflate.findViewById(R.id.close);
						androidx.cardview.widget.CardView cardview1 = (androidx.cardview.widget.CardView)dinflate.findViewById(R.id.cardview1);
						androidx.cardview.widget.CardView cardview2 = (androidx.cardview.widget.CardView)dinflate.findViewById(R.id.cardview2);
						cardview1.setCardBackgroundColor(0xFF000027);
						cardview2.setCardBackgroundColor(0xFF000027);
						cardview1.setRadius((float)25);
						cardview2.setRadius((float)25);
						title.setText("Java to Smali");
						d_nav.setOnClickListener(new OnClickListener() { public void onClick(View view) { 
								d.dismiss();
							} });
						close.setOnClickListener(new OnClickListener() { public void onClick(View view) { 
								d.dismiss();
							} });
						//code that Ripple effect
						 
						save.setOnClickListener(new OnClickListener() { public void onClick(View view) { 
								d.dismiss();
								//code that Do in background
								new _BackgroundTaskClass(Main2Activity.this) {
										        @Override
										        public void doInBackground() {
										FileUtil.writeFile(FileUtil.getExternalStorageDir().concat("/Java to Smali/main.smali"),  formatSmali(
										    FileUtil.readFile(FileUtil.getPackageDataDir(getApplicationContext()).concat("/vscodeandroid/smali/Main.smali"))
										));
										
												        }
										
										        @Override
										        public void onPostExecute() {
												 
										SketchwareUtil.showMessage(getApplicationContext(), "Successfully saved - ".concat(FileUtil.getExternalStorageDir().concat("/vscodeandroid/main.smali")));
												        }
										    }.execute();
							} });
						convert.setOnClickListener(new OnClickListener() { public void onClick(View view) { 
								d.dismiss();
								btn_s2j.performClick();
							} });
						editor_d.setText( formatSmali(
						    FileUtil.readFile(FileUtil.getPackageDataDir(getApplicationContext()).concat("/vscodeandroid/smali/Main.smali"))
						));
						//code that CodeEditor
						editor_d.setTypefaceText(Typeface.MONOSPACE);
						editor_d.setTextActionMode(CodeEditor.TextActionMode.POPUP_WINDOW);
						 editor.setEdgeEffectColor(Color.TRANSPARENT);
						
						editor_d.setOverScrollEnabled(true);
						
						editor_d.setEditorLanguage(new JavaLanguage());
						
						editor_d.setColorScheme(new theme());
						
						editor_d.setTextSize(15);
						
						editor_d.setOverScrollEnabled(false);
						
						android.graphics.drawable.GradientDrawable _BackgroundOf_editor = new android.graphics.drawable.GradientDrawable();
						_BackgroundOf_editor.setColors(new int[]{0xFF424242, 0xFF424242});
						_BackgroundOf_editor.setOrientation(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM);
						editor_d.setBackground(_BackgroundOf_editor);
						
						//code that show dialog
						d.requestWindowFeature(Window.FEATURE_NO_TITLE); 
						d.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(Color.TRANSPARENT));
						d.show();
					}
				}.execute("");
			}
			private String formatSmali(String in) {
				    
				    List<String> lines = new ArrayList<>(Arrays.asList(in.split("\n")));
				    
				    boolean insideMethod = false;
				    
				    for(int i = 0; i < lines.size(); i++) {
					        
					        String line = lines.get(i);
					        
					        if(line.startsWith(".method")) {
						            insideMethod = true;
						        }
					        
					        if(line.startsWith(".end method")) {
						            insideMethod = false;
						        }
					        
					        if(insideMethod && !shouldSkip(line)) {
						            lines.set(i, line + "\n");
						        }
					    }
				    
				    StringBuilder result = new StringBuilder();
				    
				    for(int i = 0; i < lines.size(); i++) {
					        
					        if(i != 0) {
						            result.append("\n");
						        }
					        
					        result.append(lines.get(i));
					    }
				    
				    return result.toString();
				    
			}
			
			private boolean shouldSkip(String smaliLine) {
				    
				    String[] ops = {
					        ".line",
					        ":",
					        ".prologue"
					    };
				    
				    for(String op : ops) {
					        
					        if(smaliLine.trim().startsWith(op)) {
						            return true;
						        }
					        
					    }
				    
				    return false;
			}
			{
			}
		});
		
		btn_s2j.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				new AsyncTask<String, String, String>() {
					ProgressDialog prog;
					@Override
					protected void onPreExecute() {
						prog = new ProgressDialog(Main2Activity.this);
						
						prog.setMessage("Running CFR...");
						
						prog.setCancelable(false);
						
						prog.show();
					}
					@Override
					protected String doInBackground(String... params) {
						String _param = params[0];
						String[] args = {
								//	"-jar",
							 FileUtil.getPackageDataDir(getApplicationContext()).concat("/vscodeandroid/classes.jar"),
							
							"--extraclasspath",
							
							FileUtil.getPackageDataDir(getApplicationContext()).concat("/vscodeandroid/cp.jar"),
							
							"--outputdir",
									FileUtil.getPackageDataDir(getApplicationContext()).concat("/vscodeandroid/cfr/")
						};
						try {
									org.benf.cfr.reader.Main.main(args);
						}catch(final Exception e) {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									SketchwareUtil.showMessage(getApplicationContext(), e.toString());
								}
							});
						}
						return "";
					}
					@Override
					protected void onPostExecute(String _result) {
						prog.dismiss();
						_v();
						//code that Create custom dialog
						final AlertDialog d = new AlertDialog.Builder(Main2Activity.this).create();
						View dinflate = getLayoutInflater().inflate(R.layout.dialog,null); d.setView(dinflate);
						//code that Find Views
						io.github.rosemoe.sora.widget.CodeEditor editor_d = (io.github.rosemoe.sora.widget.CodeEditor)dinflate.findViewById(R.id.editor);
						LinearLayout d_nav = (LinearLayout)dinflate.findViewById(R.id.nav);
						LinearLayout save = (LinearLayout)dinflate.findViewById(R.id.save);
						LinearLayout convert = (LinearLayout)dinflate.findViewById(R.id.convert);
						TextView title = (TextView)dinflate.findViewById(R.id.title);
						ImageView close = (ImageView)dinflate.findViewById(R.id.close);
						androidx.cardview.widget.CardView cardview1 = (androidx.cardview.widget.CardView)dinflate.findViewById(R.id.cardview1);
						androidx.cardview.widget.CardView cardview2 = (androidx.cardview.widget.CardView)dinflate.findViewById(R.id.cardview2);
						cardview1.setCardBackgroundColor(0xFF000027);
						cardview2.setCardBackgroundColor(0xFF000027);
						cardview1.setRadius((float)25);
						cardview2.setRadius((float)25);
						convert.setVisibility(View.GONE);
						title.setText("Smali to Java");
						d_nav.setOnClickListener(new OnClickListener() { public void onClick(View view) { 
								d.dismiss();
							} });
						close.setOnClickListener(new OnClickListener() { public void onClick(View view) { 
								d.dismiss();
							} });
						//code that Ripple effect
						 
						save.setOnClickListener(new OnClickListener() { public void onClick(View view) { 
								d.dismiss();
								//code that Do in background
								new _BackgroundTaskClass(Main2Activity.this) {
										        @Override
										        public void doInBackground() {
										FileUtil.writeFile(FileUtil.getExternalStorageDir().concat("/Java to Smali/Smali to Java/main.java"), FileUtil.readFile(FileUtil.getPackageDataDir(getApplicationContext()).concat("/vscodeandroid/cfr/Main.java")));
										
												        }
										
										        @Override
										        public void onPostExecute() {
												 
										SketchwareUtil.showMessage(getApplicationContext(), "Successfully saved - ".concat(FileUtil.getExternalStorageDir().concat("/Java to Smali/Smali to Java/main.java")));
												        }
										    }.execute();
							} });
						editor_d.setText(FileUtil.readFile(FileUtil.getPackageDataDir(getApplicationContext()).concat("/vscodeandroid/cfr/Main.java")));
						//code that CodeEditor
						editor_d.setTypefaceText(Typeface.MONOSPACE);
						editor_d.setTextActionMode(CodeEditor.TextActionMode.POPUP_WINDOW);
						 editor.setEdgeEffectColor(Color.TRANSPARENT);
						
						editor_d.setOverScrollEnabled(true);
						
						editor_d.setEditorLanguage(new JavaLanguage());
						
						editor_d.setColorScheme(new theme());
						
						editor_d.setTextSize(12);
						
						editor_d.setOverScrollEnabled(false);
						
						android.graphics.drawable.GradientDrawable _BackgroundOf_editor = new android.graphics.drawable.GradientDrawable();
						_BackgroundOf_editor.setColors(new int[]{0xFF000027, 0xFF000027});
						_BackgroundOf_editor.setOrientation(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM);
						editor_d.setBackground(_BackgroundOf_editor);
						
						//code that show dialog
						d.requestWindowFeature(Window.FEATURE_NO_TITLE); 
						d.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(Color.TRANSPARENT));
						d.show();
					}
				}.execute("");
			}
		});
		
		_fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				run.performClick();
			}
		});
	}
	
	private void initializeLogic() {
		linear9.setVisibility(View.GONE);
		FileUtil.writeFile("/sdcard/vscodeandroid/Main.java", "/*\n\n\n#Note: Do not add your package.\n#Note: Do not change the Main class' name\n#Note: Do not remove its main method.\n*/\n\nimport java.util.*;\n\npublic class Main {\n\n	public static void main(String[] args) {\n		\n		System.out.print(\"Hello, World!\");\n		\n	}\n	\n}");
		editor.setColorScheme(new theme());
		editor.setEditorLanguage(new JavaLanguage()); 
		if (FileUtil.isExistFile(FileUtil.getPackageDataDir(getApplicationContext()).concat("/vscodeandroid/Main.java"))) {
			editor.setText(FileUtil.readFile(FileUtil.getPackageDataDir(getApplicationContext()).concat("/vscodeandroid/Main.java")));
		}
		else {
			editor.setText("/*\n\n\n#Note: Do not add your package.\n#Note: Do not change the Main class' name\n#Note: Do not remove its main method.\n*/\n\nimport java.util.*;\n\npublic class Main {\n\n	public static void main(String[] args) {\n		\n		System.out.print(\"Hello, World!\");\n		\n	}\n	\n}");
		}
	}
	public static void a(StringBuilder var0, int var1) {
		        for (int var2 = 0; var2 < var1; ++var2)
		        {
			            var0.append('\t');
			        }
		
		    }
	
	    public static String j(String var0) {
		        StringBuilder var1 = new StringBuilder(4096);
		        char[] var2 = var0.toCharArray();
		        int var3 = var2.length;
		        int var4 = 0;
		        boolean var5 = false;
		        boolean var6 = false;
		        boolean var7 = false;
		        int var8 = 0;
		        boolean var9 = false;
		
		        int var19;
		        for (boolean var10 = false; var4 < var3; var4 = var19)
		        {
			            int var13;
			            boolean var14;
			            boolean var15;
			            boolean var16;
			            boolean var17;
			            int var18;
			            label82:
			            {
				                char var11 = var2[var4];
				                if (var5)
				                {
					                    if (var11 == 10)
					                    {
						                        var1.append(var11);
						                        a(var1, var8);
						                        var5 = false;
						                    }
					                    else
					                    {
						                        var1.append(var11);
						                    }
					                }
				                else if (var6)
				                {
					                    label79:
					                    {
						                        if (var11 == 42)
						                        {
							                            int var40 = var4 + 1;
							                            char var41 = var2[var40];
							                            if (var41 == 47)
							                            {
								                                var1.append(var11);
								                                var1.append(var41);
								                                var4 = var40;
								                                var6 = false;
								                                break label79;
								                            }
							                        }
						
						                        var1.append(var11);
						                    }
					                }
				                else if (var7)
				                {
					                    var1.append(var11);
					                    var7 = false;
					                }
				                else if (var11 == 92)
				                {
					                    var1.append(var11);
					                    var7 = true;
					                }
				                else if (var9)
				                {
					                    if (var11 == 39)
					                    {
						                        var1.append(var11);
						                        var9 = false;
						                    }
					                    else
					                    {
						                        var1.append(var11);
						                    }
					                }
				                else if (var10)
				                {
					                    if (var11 == 34)
					                    {
						                        var1.append(var11);
						                        var10 = false;
						                    }
					                    else
					                    {
						                        var1.append(var11);
						                    }
					                }
				                else
				                {
					                    label88:
					                    {
						                        if (var11 == 47)
						                        {
							                            int var27 = var4 + 1;
							                            char var28 = var2[var27];
							                            if (var28 == 47)
							                            {
								                                var1.append(var11);
								                                var1.append(var28);
								                                var5 = true;
								                                var4 = var27;
								                                break label88;
								                            }
							
							                            if (var28 == 42)
							                            {
								                                var1.append(var11);
								                                var1.append(var28);
								                                var6 = true;
								                                var4 = var27;
								                                break label88;
								                            }
							                        }
						
						                        if (var11 != 10)
						                        {
							                            boolean var20;
							                            if (var11 == 39)
							                            {
								                                var20 = true;
								                            }
							                            else
							                            {
								                                var20 = var9;
								                            }
							
							                            boolean var21;
							                            if (var11 == 34)
							                            {
								                                var21 = true;
								                            }
							                            else
							                            {
								                                var21 = var10;
								                            }
							
							                            int var22;
							                            if (var11 == 123)
							                            {
								                                var22 = var8 + 1;
								                            }
							                            else
							                            {
								                                var22 = var8;
								                            }
							
							                            if (var11 == 125)
							                            {
								                                --var22;
								                                if (var1.charAt(-1 + var1.length()) == 9)
								                                {
									                                    var1.deleteCharAt(-1 + var1.length());
									                                }
								                            }
							
							                            var1.append(var11);
							                            var18 = var22;
							                            var10 = var21;
							                            var13 = var4;
							                            var14 = var5;
							                            var15 = var6;
							                            var16 = var7;
							                            var17 = var20;
							                            break label82;
							                        }
						
						                        var1.append(var11);
						                        a(var1, var8);
						                    }
					                }
				
				                var13 = var4;
				                var14 = var5;
				                var15 = var6;
				                var16 = var7;
				                var17 = var9;
				                var18 = var8;
				            }
			
			            var19 = var13 + 1;
			            var8 = var18;
			            var9 = var17;
			            var7 = var16;
			            var6 = var15;
			            var5 = var14;
			        }
		
		        return var1.toString();
		    }
	{
	}
	
	@Override
	public void onStart() {
		super.onStart();
		
	}
	
	public void _v() {
		new _BackgroundTaskClass(Main2Activity.this) {
				        @Override
				        public void doInBackground() {
				FileUtil.writeFile(FileUtil.getExternalStorageDir().concat("/vscodemobile/ninjacoder.api"), "code");
				
						        }
				
				        @Override
				        public void onPostExecute() {
						 
						        }
				    }.execute();
	}
	
	
	public void _DoInBackground() {
	}
	public static abstract class _BackgroundTaskClass {
		
		    private Activity activity;
		    public _BackgroundTaskClass(Activity activity) {
				        this.activity = activity;
				    }
		public _BackgroundTaskClass(Fragment activity) {
				        this.activity = activity.getActivity();
				    }
		public _BackgroundTaskClass(DialogFragment activity) {
				        this.activity = activity.getActivity();
				    }
		
		    private void startBackground() {
				        new Thread(new Runnable() {
						            public void run() {
								Looper.prepare();
								                doInBackground();
								                activity.runOnUiThread(new Runnable() {
										                    public void run() {
												
												                        onPostExecute();
												                    }
										                });
								            }
						        }).start();
				    }
		    public void execute(){
				        startBackground();
				    }
		
		    public abstract void doInBackground();
		    public abstract void onPostExecute();
		
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
package ir.vscodemobile.ninjacoder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
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
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.*;
import com.google.android.material.button.*;
import android.widget.EditText;
import android.widget.CheckBox;
import android.app.Activity;
import android.content.SharedPreferences;
import android.widget.CompoundButton;
import android.view.View;
import android.content.ClipData;
import android.content.ClipboardManager;
import ninja.toska.path.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;
//Base64
import android.util.Base64;
//MD5
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ScpEncryptActivity extends AppCompatActivity {
	
	private String morse = "";
	private String input = "";
	private String result = "";
	private String md5 = "";
	private String scp_th_dark = "";
	private String scp_th_light = "";
	private String scp_th_back_dark = "";
	private String scp_th_back_light = "";
	
	private LinearLayout background;
	private LinearLayout linear_encrypted;
	private LinearLayout linear2;
	private LinearLayout linear1;
	private LinearLayout linear10;
	private TextView textview_logo_enc;
	private TextInputLayout textinputlayout1;
	private TextInputLayout textinputlayout2;
	private MaterialButton SCP_Material;
	private TextView textview_logores_enc;
	private LinearLayout linear_result;
	private EditText edittext_data;
	private EditText edittext_pass;
	private EditText textview_ed;
	private TextView textview2;
	private CheckBox checkbox1;
	private CheckBox checkbox2;
	private TextView textview1;
	private LinearLayout linear3;
	private RadioButton radiobutton1;
	private RadioButton radiobutton2;
	private RadioButton radiobutton3;
	private RadioButton radiobutton4;
	private RadioButton radiobutton5;
	private RadioButton radiobutton6;
	
	private SharedPreferences scp_share;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.scp_encrypt);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		background = findViewById(R.id.background);
		linear_encrypted = findViewById(R.id.linear_encrypted);
		linear2 = findViewById(R.id.linear2);
		linear1 = findViewById(R.id.linear1);
		linear10 = findViewById(R.id.linear10);
		textview_logo_enc = findViewById(R.id.textview_logo_enc);
		textinputlayout1 = findViewById(R.id.textinputlayout1);
		textinputlayout2 = findViewById(R.id.textinputlayout2);
		SCP_Material = findViewById(R.id.SCP_Material);
		textview_logores_enc = findViewById(R.id.textview_logores_enc);
		linear_result = findViewById(R.id.linear_result);
		edittext_data = findViewById(R.id.edittext_data);
		edittext_pass = findViewById(R.id.edittext_pass);
		textview_ed = findViewById(R.id.textview_ed);
		textview2 = findViewById(R.id.textview2);
		checkbox1 = findViewById(R.id.checkbox1);
		checkbox2 = findViewById(R.id.checkbox2);
		textview1 = findViewById(R.id.textview1);
		linear3 = findViewById(R.id.linear3);
		radiobutton1 = findViewById(R.id.radiobutton1);
		radiobutton2 = findViewById(R.id.radiobutton2);
		radiobutton3 = findViewById(R.id.radiobutton3);
		radiobutton4 = findViewById(R.id.radiobutton4);
		radiobutton5 = findViewById(R.id.radiobutton5);
		radiobutton6 = findViewById(R.id.radiobutton6);
		scp_share = getSharedPreferences("scp_share", Activity.MODE_PRIVATE);
		
		linear1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (linear3.getVisibility() == View.GONE) {
					_TransitionManager(linear1, 300);
					linear3.setVisibility(View.VISIBLE);
				}
				else {
					if (linear3.getVisibility() == View.VISIBLE) {
						_TransitionManager(linear1, 300);
						linear3.setVisibility(View.GONE);
					}
					else {
						
					}
				}
			}
		});
		
		SCP_Material.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (scp_share.getString("type", "").equals("enc")) {
					if (scp_share.getString("encrypt", "").equals("AES V1")) {
						if (edittext_data.getText().toString().equals("")) {
							//Activity
							LayoutInflater Inflater = getLayoutInflater();
							View toastview= Inflater.inflate(R.layout.scp_toast,null);
							//Linear
							LinearLayout lin =(LinearLayout) toastview.findViewById(R.id.linear1);
							//Textview
							TextView txt =(TextView) toastview.findViewById(R.id.textview1);
							
							//SCP
							lin.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)5, 0xFFFF0000, 0xFFFFFFFF));
							txt.setTextColor(0xFFFF0000);
							txt.setText("Data is empty");
							//Toast Show
							Toast toast = new Toast(getApplicationContext()); toast.setDuration(Toast.LENGTH_SHORT);
							toast.setView(toastview);
							toast.setGravity(Gravity.TOP, 0, 130);
							toast.show();
							
							//SCP Toast
						}
						else {
							try {
								keyGenerator = javax.crypto.KeyGenerator.getInstance("AES");
								keyGenerator.init(256);
								secretKey = keyGenerator.generateKey();
								secretKeyen=secretKey.getEncoded();
								cipherText = encrypt(edittext_data.getText().toString().getBytes(), secretKey, IV);
								textview_ed.setText(android.util.Base64.encodeToString(cipherText, android.util.Base64.DEFAULT));
							} catch ( java.security.NoSuchAlgorithmException e){
								showMessage(e.toString());
							} catch (Exception e){
								showMessage(e.toString());
							}
							linear_result.setVisibility(View.VISIBLE);
							//Activity
							LayoutInflater Inflater = getLayoutInflater();
							View toastview= Inflater.inflate(R.layout.scp_toast,null);
							//Linear
							LinearLayout lin =(LinearLayout) toastview.findViewById(R.id.linear1);
							//Textview
							TextView txt =(TextView) toastview.findViewById(R.id.textview1);
							
							//SCP
							lin.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)5, 0xFF4CAF50, 0xFFFFFFFF));
							txt.setTextColor(0xFF4CAF50);
							txt.setText("Encrypt Data ={\"".concat(edittext_data.getText().toString().concat("\")")));
							//Toast Show
							Toast toast = new Toast(getApplicationContext()); toast.setDuration(Toast.LENGTH_SHORT);
							toast.setView(toastview);
							toast.setGravity(Gravity.TOP, 0, 130);
							toast.show();
							
							//SCP Toast
						}
					}
					else {
						if (scp_share.getString("encrypt", "").equals("AES V2")) {
							if (edittext_data.getText().toString().equals("") && edittext_pass.getText().toString().equals("")) {
								//Activity
								LayoutInflater Inflater = getLayoutInflater();
								View toastview= Inflater.inflate(R.layout.scp_toast,null);
								//Linear
								LinearLayout lin =(LinearLayout) toastview.findViewById(R.id.linear1);
								//Textview
								TextView txt =(TextView) toastview.findViewById(R.id.textview1);
								
								//SCP
								lin.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)5, 0xFFFF0000, 0xFFFFFFFF));
								txt.setTextColor(0xFFFF0000);
								txt.setText("Empty");
								//Toast Show
								Toast toast = new Toast(getApplicationContext()); toast.setDuration(Toast.LENGTH_SHORT);
								toast.setView(toastview);
								toast.setGravity(Gravity.TOP, 0, 130);
								toast.show();
								
								//SCP Toast
							}
							else {
								if (edittext_data.getText().toString().equals("")) {
									//Activity
									LayoutInflater Inflater = getLayoutInflater();
									View toastview= Inflater.inflate(R.layout.scp_toast,null);
									//Linear
									LinearLayout lin =(LinearLayout) toastview.findViewById(R.id.linear1);
									//Textview
									TextView txt =(TextView) toastview.findViewById(R.id.textview1);
									
									//SCP
									lin.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)5, 0xFFFF0000, 0xFFFFFFFF));
									txt.setTextColor(0xFFFF0000);
									txt.setText("Data is empty");
									//Toast Show
									Toast toast = new Toast(getApplicationContext()); toast.setDuration(Toast.LENGTH_SHORT);
									toast.setView(toastview);
									toast.setGravity(Gravity.TOP, 0, 130);
									toast.show();
									
									//SCP Toast
								}
								else {
									if (edittext_pass.getText().toString().equals("")) {
										//Activity
										LayoutInflater Inflater = getLayoutInflater();
										View toastview= Inflater.inflate(R.layout.scp_toast,null);
										//Linear
										LinearLayout lin =(LinearLayout) toastview.findViewById(R.id.linear1);
										//Textview
										TextView txt =(TextView) toastview.findViewById(R.id.textview1);
										
										//SCP
										lin.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)5, 0xFFFF0000, 0xFFFFFFFF));
										txt.setTextColor(0xFFFF0000);
										txt.setText("Password is empty");
										//Toast Show
										Toast toast = new Toast(getApplicationContext()); toast.setDuration(Toast.LENGTH_SHORT);
										toast.setView(toastview);
										toast.setGravity(Gravity.TOP, 0, 130);
										toast.show();
										
										//SCP Toast
									}
									else {
										  try {
											  textview_ed.setText(AESCrypt.encrypt(edittext_pass.getText().toString(), edittext_data.getText().toString()));
											  } catch (java.security.GeneralSecurityException e){
											      showMessage("password incorrect !" + "\n" + e.toString());
											  }
										linear_result.setVisibility(View.VISIBLE);
										//Activity
										LayoutInflater Inflater = getLayoutInflater();
										View toastview= Inflater.inflate(R.layout.scp_toast,null);
										//Linear
										LinearLayout lin =(LinearLayout) toastview.findViewById(R.id.linear1);
										//Textview
										TextView txt =(TextView) toastview.findViewById(R.id.textview1);
										
										//SCP
										lin.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)5, 0xFF4CAF50, 0xFFFFFFFF));
										txt.setTextColor(0xFF4CAF50);
										txt.setText("Encrypt Data ={\"".concat(edittext_data.getText().toString().concat("\"}\nWith Password ={\"".concat(edittext_pass.getText().toString().concat("\"}")))));
										//Toast Show
										Toast toast = new Toast(getApplicationContext()); toast.setDuration(Toast.LENGTH_SHORT);
										toast.setView(toastview);
										toast.setGravity(Gravity.TOP, 0, 130);
										toast.show();
										
										//SCP Toast
									}
								}
							}
						}
						else {
							if (scp_share.getString("encrypt", "").equals("Morse")) {
								if (edittext_data.getText().toString().equals("")) {
									//Activity
									LayoutInflater Inflater = getLayoutInflater();
									View toastview= Inflater.inflate(R.layout.scp_toast,null);
									//Linear
									LinearLayout lin =(LinearLayout) toastview.findViewById(R.id.linear1);
									//Textview
									TextView txt =(TextView) toastview.findViewById(R.id.textview1);
									
									//SCP
									lin.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)5, 0xFFFF0000, 0xFFFFFFFF));
									txt.setTextColor(0xFFFF0000);
									txt.setText("Data is empty");
									//Toast Show
									Toast toast = new Toast(getApplicationContext()); toast.setDuration(Toast.LENGTH_SHORT);
									toast.setView(toastview);
									toast.setGravity(Gravity.TOP, 0, 130);
									toast.show();
									
									//SCP Toast
								}
								else {
									morse = edittext_data.getText().toString();
									result = DidDogMorseCode.encode(morse);
									textview_ed.setText(morse);
									linear_result.setVisibility(View.VISIBLE);
									//Activity
									LayoutInflater Inflater = getLayoutInflater();
									View toastview= Inflater.inflate(R.layout.scp_toast,null);
									//Linear
									LinearLayout lin =(LinearLayout) toastview.findViewById(R.id.linear1);
									//Textview
									TextView txt =(TextView) toastview.findViewById(R.id.textview1);
									
									//SCP
									lin.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)5, 0xFF4CAF50, 0xFFFFFFFF));
									txt.setTextColor(0xFF4CAF50);
									txt.setText("Encrypt Data ={\"".concat(edittext_data.getText().toString().concat("\")")));
									//Toast Show
									Toast toast = new Toast(getApplicationContext()); toast.setDuration(Toast.LENGTH_SHORT);
									toast.setView(toastview);
									toast.setGravity(Gravity.TOP, 0, 130);
									toast.show();
									
									//SCP Toast
								}
							}
							else {
								if (scp_share.getString("encrypt", "").equals("Base64")) {
									if (edittext_data.getText().toString().equals("")) {
										//Activity
										LayoutInflater Inflater = getLayoutInflater();
										View toastview= Inflater.inflate(R.layout.scp_toast,null);
										//Linear
										LinearLayout lin =(LinearLayout) toastview.findViewById(R.id.linear1);
										//Textview
										TextView txt =(TextView) toastview.findViewById(R.id.textview1);
										
										//SCP
										lin.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)5, 0xFFFF0000, 0xFFFFFFFF));
										txt.setTextColor(0xFFFF0000);
										txt.setText("Data is empty");
										//Toast Show
										Toast toast = new Toast(getApplicationContext()); toast.setDuration(Toast.LENGTH_SHORT);
										toast.setView(toastview);
										toast.setGravity(Gravity.TOP, 0, 130);
										toast.show();
										
										//SCP Toast
									}
									else {
										linear_result.setVisibility(View.VISIBLE);
										input = edittext_data.getText().toString();
										byte[] data;
														try {
																data = input.getBytes("UTF-8");
																String base64 = Base64.encodeToString(data, Base64.DEFAULT);
																textview_ed.setText(base64);
														} catch (UnsupportedEncodingException e) {
																// Illegal Padding Exception in case of Base64
																Toast.makeText(getApplicationContext(), "Unsupported Text",
																		Toast.LENGTH_SHORT).show();
																e.printStackTrace();
														}
										//Activity
										LayoutInflater Inflater = getLayoutInflater();
										View toastview= Inflater.inflate(R.layout.scp_toast,null);
										//Linear
										LinearLayout lin =(LinearLayout) toastview.findViewById(R.id.linear1);
										//Textview
										TextView txt =(TextView) toastview.findViewById(R.id.textview1);
										
										//SCP
										lin.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)5, 0xFF4CAF50, 0xFFFFFFFF));
										txt.setTextColor(0xFF4CAF50);
										txt.setText("Encrypt Data ={\"".concat(edittext_data.getText().toString().concat("\")")));
										//Toast Show
										Toast toast = new Toast(getApplicationContext()); toast.setDuration(Toast.LENGTH_SHORT);
										toast.setView(toastview);
										toast.setGravity(Gravity.TOP, 0, 130);
										toast.show();
										
										//SCP Toast
									}
								}
								else {
									if (scp_share.getString("encrypt", "").equals("MD5")) {
										if (edittext_data.getText().toString().equals("")) {
											//Activity
											LayoutInflater Inflater = getLayoutInflater();
											View toastview= Inflater.inflate(R.layout.scp_toast,null);
											//Linear
											LinearLayout lin =(LinearLayout) toastview.findViewById(R.id.linear1);
											//Textview
											TextView txt =(TextView) toastview.findViewById(R.id.textview1);
											
											//SCP
											lin.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)5, 0xFFFF0000, 0xFFFFFFFF));
											txt.setTextColor(0xFFFF0000);
											txt.setText("Data is empty");
											//Toast Show
											Toast toast = new Toast(getApplicationContext()); toast.setDuration(Toast.LENGTH_SHORT);
											toast.setView(toastview);
											toast.setGravity(Gravity.TOP, 0, 130);
											toast.show();
											
											//SCP Toast
										}
										else {
											linear_result.setVisibility(View.VISIBLE);
											md5 = _nader_generateMD5(edittext_data.getText().toString());
											textview_ed.setText(md5);
											//Activity
											LayoutInflater Inflater = getLayoutInflater();
											View toastview= Inflater.inflate(R.layout.scp_toast,null);
											//Linear
											LinearLayout lin =(LinearLayout) toastview.findViewById(R.id.linear1);
											//Textview
											TextView txt =(TextView) toastview.findViewById(R.id.textview1);
											
											//SCP
											lin.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)5, 0xFF4CAF50, 0xFFFFFFFF));
											txt.setTextColor(0xFF4CAF50);
											txt.setText("Encrypt Data ={\"".concat(edittext_data.getText().toString().concat("\")")));
											//Toast Show
											Toast toast = new Toast(getApplicationContext()); toast.setDuration(Toast.LENGTH_SHORT);
											toast.setView(toastview);
											toast.setGravity(Gravity.TOP, 0, 130);
											toast.show();
											
											//SCP Toast
										}
									}
									else {
										if (scp_share.getString("encrypt", "").equals("Banary")) {
											if (edittext_data.getText().toString().equals("")) {
												//Activity
												LayoutInflater Inflater = getLayoutInflater();
												View toastview= Inflater.inflate(R.layout.scp_toast,null);
												//Linear
												LinearLayout lin =(LinearLayout) toastview.findViewById(R.id.linear1);
												//Textview
												TextView txt =(TextView) toastview.findViewById(R.id.textview1);
												
												//SCP
												lin.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)5, 0xFFFF0000, 0xFFFFFFFF));
												txt.setTextColor(0xFFFF0000);
												txt.setText("Data is empty");
												//Toast Show
												Toast toast = new Toast(getApplicationContext()); toast.setDuration(Toast.LENGTH_SHORT);
												toast.setView(toastview);
												toast.setGravity(Gravity.TOP, 0, 130);
												toast.show();
												
												//SCP Toast
											}
											else {
												String text = edittext_data.getText().toString();
												try {
													byte[] bytes = text.getBytes("utf-8");
													StringBuilder binary = new StringBuilder();
													  for (byte b : bytes)
													  {
														     int val = b;
														     for (int i = 0; i < 8; i++)
														     {
															        binary.append((val & 128) == 0 ? 0 : 1);
															        val <<= 1;
															     }
														     binary.append(' ');
														  }
													textview_ed.setText(binary.toString());
												} catch (Exception e) {
													showMessage("bruh error");
												}
												linear_result.setVisibility(View.VISIBLE);
												//Activity
												LayoutInflater Inflater = getLayoutInflater();
												View toastview= Inflater.inflate(R.layout.scp_toast,null);
												//Linear
												LinearLayout lin =(LinearLayout) toastview.findViewById(R.id.linear1);
												//Textview
												TextView txt =(TextView) toastview.findViewById(R.id.textview1);
												
												//SCP
												lin.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)5, 0xFF4CAF50, 0xFFFFFFFF));
												txt.setTextColor(0xFF4CAF50);
												txt.setText("Encrypt Data ={\"".concat(edittext_data.getText().toString().concat("\")")));
												//Toast Show
												Toast toast = new Toast(getApplicationContext()); toast.setDuration(Toast.LENGTH_SHORT);
												toast.setView(toastview);
												toast.setGravity(Gravity.TOP, 0, 130);
												toast.show();
												
												//SCP Toast
											}
										}
										else {
											
										}
									}
								}
							}
						}
					}
				}
				else {
					if (scp_share.getString("type", "").equals("dec")) {
						if (scp_share.getString("encrypt", "").equals("AES V1")) {
							if (edittext_data.getText().toString().equals("")) {
								//Activity
								LayoutInflater Inflater = getLayoutInflater();
								View toastview= Inflater.inflate(R.layout.scp_toast,null);
								//Linear
								LinearLayout lin =(LinearLayout) toastview.findViewById(R.id.linear1);
								//Textview
								TextView txt =(TextView) toastview.findViewById(R.id.textview1);
								
								//SCP
								lin.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)5, 0xFFFF0000, 0xFFFFFFFF));
								txt.setTextColor(0xFFFF0000);
								txt.setText("Data is empty");
								//Toast Show
								Toast toast = new Toast(getApplicationContext()); toast.setDuration(Toast.LENGTH_SHORT);
								toast.setView(toastview);
								toast.setGravity(Gravity.TOP, 0, 130);
								toast.show();
								
								//SCP Toast
							}
							else {
								try {
									javax.crypto.SecretKey originalSecretKey = new javax.crypto.spec.SecretKeySpec(secretKeyen, 0, secretKeyen.length, "AES");
									String decryptedText = decrypt(cipherText, originalSecretKey, IV); textview_ed.setText(decryptedText);
								} catch (Exception e) {
									e.printStackTrace();
								}
								linear_result.setVisibility(View.VISIBLE);
								//Activity
								LayoutInflater Inflater = getLayoutInflater();
								View toastview= Inflater.inflate(R.layout.scp_toast,null);
								//Linear
								LinearLayout lin =(LinearLayout) toastview.findViewById(R.id.linear1);
								//Textview
								TextView txt =(TextView) toastview.findViewById(R.id.textview1);
								
								//SCP
								lin.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)5, 0xFF4CAF50, 0xFFFFFFFF));
								txt.setTextColor(0xFF4CAF50);
								txt.setText("Decrypt Data ={\"".concat(edittext_data.getText().toString().concat("\")")));
								//Toast Show
								Toast toast = new Toast(getApplicationContext()); toast.setDuration(Toast.LENGTH_SHORT);
								toast.setView(toastview);
								toast.setGravity(Gravity.TOP, 0, 130);
								toast.show();
								
								//SCP Toast
							}
						}
						else {
							if (scp_share.getString("encrypt", "").equals("AES V2")) {
								if (edittext_data.getText().toString().equals("") && edittext_pass.getText().toString().equals("")) {
									//Activity
									LayoutInflater Inflater = getLayoutInflater();
									View toastview= Inflater.inflate(R.layout.scp_toast,null);
									//Linear
									LinearLayout lin =(LinearLayout) toastview.findViewById(R.id.linear1);
									//Textview
									TextView txt =(TextView) toastview.findViewById(R.id.textview1);
									
									//SCP
									lin.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)5, 0xFFFF0000, 0xFFFFFFFF));
									txt.setTextColor(0xFFFF0000);
									txt.setText("Empty");
									//Toast Show
									Toast toast = new Toast(getApplicationContext()); toast.setDuration(Toast.LENGTH_SHORT);
									toast.setView(toastview);
									toast.setGravity(Gravity.TOP, 0, 130);
									toast.show();
									
									//SCP Toast
								}
								else {
									if (edittext_data.getText().toString().equals("")) {
										//Activity
										LayoutInflater Inflater = getLayoutInflater();
										View toastview= Inflater.inflate(R.layout.scp_toast,null);
										//Linear
										LinearLayout lin =(LinearLayout) toastview.findViewById(R.id.linear1);
										//Textview
										TextView txt =(TextView) toastview.findViewById(R.id.textview1);
										
										//SCP
										lin.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)5, 0xFFFF0000, 0xFFFFFFFF));
										txt.setTextColor(0xFFFF0000);
										txt.setText("Data is empty");
										//Toast Show
										Toast toast = new Toast(getApplicationContext()); toast.setDuration(Toast.LENGTH_SHORT);
										toast.setView(toastview);
										toast.setGravity(Gravity.TOP, 0, 130);
										toast.show();
										
										//SCP Toast
									}
									else {
										if (edittext_data.getText().toString().equals("")) {
											//Activity
											LayoutInflater Inflater = getLayoutInflater();
											View toastview= Inflater.inflate(R.layout.scp_toast,null);
											//Linear
											LinearLayout lin =(LinearLayout) toastview.findViewById(R.id.linear1);
											//Textview
											TextView txt =(TextView) toastview.findViewById(R.id.textview1);
											
											//SCP
											lin.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)5, 0xFFFF0000, 0xFFFFFFFF));
											txt.setTextColor(0xFFFF0000);
											txt.setText("Password is empty");
											//Toast Show
											Toast toast = new Toast(getApplicationContext()); toast.setDuration(Toast.LENGTH_SHORT);
											toast.setView(toastview);
											toast.setGravity(Gravity.TOP, 0, 130);
											toast.show();
											
											//SCP Toast
										}
										else {
											  try {
												  textview_ed.setText(AESCrypt.decrypt(edittext_pass.getText().toString(), edittext_data.getText().toString()));
												  } catch (java.security.GeneralSecurityException e){
												      showMessage("password incorrect !" + "\n" + e.toString());
												  }
											linear_result.setVisibility(View.VISIBLE);
											//Activity
											LayoutInflater Inflater = getLayoutInflater();
											View toastview= Inflater.inflate(R.layout.scp_toast,null);
											//Linear
											LinearLayout lin =(LinearLayout) toastview.findViewById(R.id.linear1);
											//Textview
											TextView txt =(TextView) toastview.findViewById(R.id.textview1);
											
											//SCP
											lin.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)5, 0xFF4CAF50, 0xFFFFFFFF));
											txt.setTextColor(0xFF4CAF50);
											txt.setText("Decrypt Data ={\"".concat(edittext_data.getText().toString().concat("\"}\nWith Password ={\"".concat(edittext_pass.getText().toString().concat("\"}")))));
											//Toast Show
											Toast toast = new Toast(getApplicationContext()); toast.setDuration(Toast.LENGTH_SHORT);
											toast.setView(toastview);
											toast.setGravity(Gravity.TOP, 0, 130);
											toast.show();
											
											//SCP Toast
										}
									}
								}
							}
							else {
								if (scp_share.getString("encrypt", "").equals("Morse")) {
									if (edittext_data.getText().toString().equals("")) {
										//Activity
										LayoutInflater Inflater = getLayoutInflater();
										View toastview= Inflater.inflate(R.layout.scp_toast,null);
										//Linear
										LinearLayout lin =(LinearLayout) toastview.findViewById(R.id.linear1);
										//Textview
										TextView txt =(TextView) toastview.findViewById(R.id.textview1);
										
										//SCP
										lin.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)5, 0xFFFF0000, 0xFFFFFFFF));
										txt.setTextColor(0xFFFF0000);
										txt.setText("Data is empty");
										//Toast Show
										Toast toast = new Toast(getApplicationContext()); toast.setDuration(Toast.LENGTH_SHORT);
										toast.setView(toastview);
										toast.setGravity(Gravity.TOP, 0, 130);
										toast.show();
										
										//SCP Toast
									}
									else {
										morse = edittext_data.getText().toString();
										result = DidDogMorseCode.decode(morse);
										textview_ed.setText(morse);
										linear_result.setVisibility(View.VISIBLE);
										//Activity
										LayoutInflater Inflater = getLayoutInflater();
										View toastview= Inflater.inflate(R.layout.scp_toast,null);
										//Linear
										LinearLayout lin =(LinearLayout) toastview.findViewById(R.id.linear1);
										//Textview
										TextView txt =(TextView) toastview.findViewById(R.id.textview1);
										
										//SCP
										lin.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)5, 0xFF4CAF50, 0xFFFFFFFF));
										txt.setTextColor(0xFF4CAF50);
										txt.setText("Decrypt Data ={\"".concat(edittext_data.getText().toString().concat("\")")));
										//Toast Show
										Toast toast = new Toast(getApplicationContext()); toast.setDuration(Toast.LENGTH_SHORT);
										toast.setView(toastview);
										toast.setGravity(Gravity.TOP, 0, 130);
										toast.show();
										
										//SCP Toast
									}
								}
								else {
									if (scp_share.getString("encrypt", "").equals("Base64")) {
										if (edittext_data.getText().toString().equals("")) {
											//Activity
											LayoutInflater Inflater = getLayoutInflater();
											View toastview= Inflater.inflate(R.layout.scp_toast,null);
											//Linear
											LinearLayout lin =(LinearLayout) toastview.findViewById(R.id.linear1);
											//Textview
											TextView txt =(TextView) toastview.findViewById(R.id.textview1);
											
											//SCP
											lin.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)5, 0xFFFF0000, 0xFFFFFFFF));
											txt.setTextColor(0xFFFF0000);
											txt.setText("Data is empty");
											//Toast Show
											Toast toast = new Toast(getApplicationContext()); toast.setDuration(Toast.LENGTH_SHORT);
											toast.setView(toastview);
											toast.setGravity(Gravity.TOP, 0, 130);
											toast.show();
											
											//SCP Toast
										}
										else {
											input = edittext_data.getText().toString();
											try {
																	byte[] data = Base64.decode(input, Base64.DEFAULT);
																	String text = new String(data, "UTF-8");
																	textview_ed.setText(text);
															} catch (UnsupportedEncodingException e) {
																	e.printStackTrace();
															} catch (IllegalArgumentException ar) {
																	ar.printStackTrace();
																	// Illegal Padding Exception in case of Base64
																	Toast.makeText(getApplicationContext(), "Unsupported Text",
																			Toast.LENGTH_SHORT).show();
															}
											linear_result.setVisibility(View.VISIBLE);
											//Activity
											LayoutInflater Inflater = getLayoutInflater();
											View toastview= Inflater.inflate(R.layout.scp_toast,null);
											//Linear
											LinearLayout lin =(LinearLayout) toastview.findViewById(R.id.linear1);
											//Textview
											TextView txt =(TextView) toastview.findViewById(R.id.textview1);
											
											//SCP
											lin.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)5, 0xFF4CAF50, 0xFFFFFFFF));
											txt.setTextColor(0xFF4CAF50);
											txt.setText("Decrypt Data ={\"".concat(edittext_data.getText().toString().concat("\")")));
											//Toast Show
											Toast toast = new Toast(getApplicationContext()); toast.setDuration(Toast.LENGTH_SHORT);
											toast.setView(toastview);
											toast.setGravity(Gravity.TOP, 0, 130);
											toast.show();
											
											//SCP Toast
										}
									}
									else {
										if (scp_share.getString("encrypt", "").equals("Banary")) {
											if (edittext_data.getText().toString().equals("")) {
												//Activity
												LayoutInflater Inflater = getLayoutInflater();
												View toastview= Inflater.inflate(R.layout.scp_toast,null);
												//Linear
												LinearLayout lin =(LinearLayout) toastview.findViewById(R.id.linear1);
												//Textview
												TextView txt =(TextView) toastview.findViewById(R.id.textview1);
												
												//SCP
												lin.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)5, 0xFFFF0000, 0xFFFFFFFF));
												txt.setTextColor(0xFFFF0000);
												txt.setText("Data is empty");
												//Toast Show
												Toast toast = new Toast(getApplicationContext()); toast.setDuration(Toast.LENGTH_SHORT);
												toast.setView(toastview);
												toast.setGravity(Gravity.TOP, 0, 130);
												toast.show();
												
												//SCP Toast
											}
											else {
												String biner = edittext_data.getText().toString(); String hasil = ""; char nextChar;
												
												for(int i = 0; i <= biner.length()-8; i += 9) { 	nextChar = (char)Integer.parseInt(biner.substring(i, i+8), 2); 	hasil += nextChar; }
												
												textview_ed.setText(String.valueOf(hasil)); 
												linear_result.setVisibility(View.VISIBLE);
												//Activity
												LayoutInflater Inflater = getLayoutInflater();
												View toastview= Inflater.inflate(R.layout.scp_toast,null);
												//Linear
												LinearLayout lin =(LinearLayout) toastview.findViewById(R.id.linear1);
												//Textview
												TextView txt =(TextView) toastview.findViewById(R.id.textview1);
												
												//SCP
												lin.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)5, 0xFF4CAF50, 0xFFFFFFFF));
												txt.setTextColor(0xFF4CAF50);
												txt.setText("Decrypt Data ={\"".concat(edittext_data.getText().toString().concat("\")")));
												//Toast Show
												Toast toast = new Toast(getApplicationContext()); toast.setDuration(Toast.LENGTH_SHORT);
												toast.setView(toastview);
												toast.setGravity(Gravity.TOP, 0, 130);
												toast.show();
												
												//SCP Toast
											}
										}
										else {
											
										}
									}
								}
							}
						}
					}
					else {
						
					}
				}
			}
		});
		
		linear_result.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", textview_ed.getText().toString()));
				return true;
			}
		});
		
		checkbox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					scp_share.edit().putString("type", "enc").commit();
					  try {
						  SCP_Material.setText(AESCrypt.decrypt("2004", "2B7cZ00uA/iLjoI70ht5tA=="));
						  } catch (java.security.GeneralSecurityException e){
						      showMessage("password incorrect !" + "\n" + e.toString());
						  }
					checkbox1.setChecked(true);
					checkbox2.setChecked(false);
					if (scp_share.getString("encrypt", "").equals("AES V1")) {
						textview_logo_enc.setText("AES V1 Encryption");
					}
					else {
						if (scp_share.getString("encrypt", "").equals("AES V2")) {
							textview_logo_enc.setText("AES V2 Encryption");
						}
						else {
							if (scp_share.getString("encrypt", "").equals("Morse")) {
								textview_logo_enc.setText("Morse Encryption");
							}
							else {
								if (scp_share.getString("encrypt", "").equals("Base64")) {
									textview_logo_enc.setText("Base64 Encryption");
								}
								else {
									if (scp_share.getString("encrypt", "").equals("MD5")) {
										textview_logo_enc.setText("MD5 Encryption");
									}
									else {
										if (scp_share.getString("encrypt", "").equals("Banary")) {
											textview_logo_enc.setText("Banary Encryption");
										}
										else {
											
										}
									}
								}
							}
						}
					}
				}
			}
		});
		
		checkbox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					scp_share.edit().putString("type", "dec").commit();
					  try {
						  SCP_Material.setText(AESCrypt.decrypt("2004", "5NvKz5KK7878K49lk3HoUA=="));
						  } catch (java.security.GeneralSecurityException e){
						      showMessage("password incorrect !" + "\n" + e.toString());
						  }
					checkbox1.setChecked(false);
					checkbox2.setChecked(true);
					if (scp_share.getString("encrypt", "").equals("AES V1")) {
						textview_logo_enc.setText("AES V1 Decryption");
					}
					else {
						if (scp_share.getString("encrypt", "").equals("AES V2")) {
							textview_logo_enc.setText("AES V2 Decryption");
						}
						else {
							if (scp_share.getString("encrypt", "").equals("Morse")) {
								textview_logo_enc.setText("Morse Decryption");
							}
							else {
								if (scp_share.getString("encrypt", "").equals("Base64")) {
									textview_logo_enc.setText("Base64 Decryption");
								}
								else {
									if (scp_share.getString("encrypt", "").equals("MD5")) {
										textview_logo_enc.setText("MD5 Decryption");
									}
									else {
										if (scp_share.getString("encrypt", "").equals("Banary")) {
											textview_logo_enc.setText("Banary Decryption");
										}
										else {
											
										}
									}
								}
							}
						}
					}
				}
			}
		});
		
		radiobutton1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					textview1.setText("AES V1");
					scp_share.edit().putString("encrypt", "AES V1").commit();
					textinputlayout2.setVisibility(View.GONE);
					radiobutton1.setChecked(true);
					radiobutton2.setChecked(false);
					radiobutton3.setChecked(false);
					radiobutton4.setChecked(false);
					radiobutton5.setChecked(false);
					radiobutton6.setChecked(false);
					if (linear3.getVisibility() == View.VISIBLE) {
						_TransitionManager(linear1, 300);
						linear3.setVisibility(View.GONE);
					}
					else {
						
					}
				}
			}
		});
		
		radiobutton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					textview1.setText("AES V2 with Password");
					scp_share.edit().putString("encrypt", "AES V2").commit();
					textinputlayout2.setVisibility(View.VISIBLE);
					radiobutton1.setChecked(false);
					radiobutton2.setChecked(true);
					radiobutton3.setChecked(false);
					radiobutton4.setChecked(false);
					radiobutton5.setChecked(false);
					radiobutton6.setChecked(false);
					if (linear3.getVisibility() == View.VISIBLE) {
						_TransitionManager(linear1, 300);
						linear3.setVisibility(View.GONE);
					}
					else {
						
					}
				}
			}
		});
		
		radiobutton3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					textview1.setText("Morse");
					scp_share.edit().putString("encrypt", "Morse").commit();
					textinputlayout2.setVisibility(View.GONE);
					radiobutton1.setChecked(false);
					radiobutton2.setChecked(false);
					radiobutton3.setChecked(true);
					radiobutton4.setChecked(false);
					radiobutton5.setChecked(false);
					radiobutton6.setChecked(false);
					if (linear3.getVisibility() == View.VISIBLE) {
						_TransitionManager(linear1, 300);
						linear3.setVisibility(View.GONE);
					}
					else {
						
					}
				}
			}
		});
		
		radiobutton4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					textview1.setText("Base64");
					scp_share.edit().putString("encrypt", "Base64").commit();
					textinputlayout2.setVisibility(View.GONE);
					radiobutton1.setChecked(false);
					radiobutton2.setChecked(false);
					radiobutton3.setChecked(false);
					radiobutton4.setChecked(true);
					radiobutton5.setChecked(false);
					radiobutton6.setChecked(false);
					if (linear3.getVisibility() == View.VISIBLE) {
						_TransitionManager(linear1, 300);
						linear3.setVisibility(View.GONE);
					}
					else {
						
					}
				}
			}
		});
		
		radiobutton5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					textview1.setText("MD5");
					scp_share.edit().putString("encrypt", "MD5").commit();
					textinputlayout2.setVisibility(View.GONE);
					radiobutton1.setChecked(false);
					radiobutton2.setChecked(false);
					radiobutton3.setChecked(false);
					radiobutton4.setChecked(false);
					radiobutton5.setChecked(true);
					radiobutton6.setChecked(false);
					if (linear3.getVisibility() == View.VISIBLE) {
						_TransitionManager(linear1, 300);
						linear3.setVisibility(View.GONE);
					}
					else {
						
					}
				}
			}
		});
		
		radiobutton6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					textview1.setText("Banary Code");
					scp_share.edit().putString("encrypt", "Banary").commit();
					textinputlayout2.setVisibility(View.GONE);
					radiobutton1.setChecked(false);
					radiobutton2.setChecked(false);
					radiobutton3.setChecked(false);
					radiobutton4.setChecked(false);
					radiobutton5.setChecked(false);
					radiobutton6.setChecked(true);
					if (linear3.getVisibility() == View.VISIBLE) {
						_TransitionManager(linear1, 300);
						linear3.setVisibility(View.GONE);
					}
					else {
						
					}
				}
			}
		});
	}
	
	private void initializeLogic() {
		try {
			if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) { 
					   Window code = this.getWindow();
				 code.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
				 code.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
				
					   code.setStatusBarColor(Color.parseColor("#FF000027")); code.setNavigationBarColor(Color.parseColor("#FF000027"));
			}
		} catch (Exception e) {
			 
		}
		_Security_Type();
		_Security_Mode();
		_initSlideActivity();
	}
	
	public void _Security() {
	}
	public static final class AESCrypt {
		    private static final String TAG = "AESCrypt";
		    private static final String AES_MODE = "AES/CBC/PKCS7Padding";
		    private static final String CHARSET = "UTF-8";
		    private static final String HASH_ALGORITHM = "SHA-256";
		    private static final byte[] ivBytes = {0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
		    public static boolean DEBUG_LOG_ENABLED = false;
		    private static javax.crypto.spec.SecretKeySpec generateKey(final String password) throws java.security.NoSuchAlgorithmException, java.io.UnsupportedEncodingException {
			        final java.security.MessageDigest digest = java.security.MessageDigest.getInstance(HASH_ALGORITHM);
			        byte[] bytes = password.getBytes("UTF-8");
			        digest.update(bytes, 0, bytes.length);
			        byte[] key = digest.digest();
			        log("SHA-256 key ", key);
			        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(key, "AES");
			        return secretKeySpec;
			    }
		    public static String encrypt(final String password, String message)
		            throws java.security.GeneralSecurityException {
			        try {
				            final javax.crypto.spec.SecretKeySpec key = generateKey(password);
				            log("message", message);
				            byte[] cipherText = encrypt(key, ivBytes, message.getBytes(CHARSET));
				            String encoded = android.util.Base64.encodeToString(cipherText, android.util.Base64.NO_WRAP);
				            log("Base64.NO_WRAP", encoded);
				            return encoded;
				        } catch (java.io.UnsupportedEncodingException e) {
				            if (DEBUG_LOG_ENABLED)
				                android.util.Log.e(TAG, "UnsupportedEncodingException ", e);
				            throw new java.security.GeneralSecurityException(e);
				        }
			    }
		    public static byte[] encrypt(final javax.crypto.spec.SecretKeySpec key, final byte[] iv, final byte[] message)
		            throws java.security.GeneralSecurityException {
			        final javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(AES_MODE);
			        javax.crypto.spec.IvParameterSpec ivSpec = new javax.crypto.spec.IvParameterSpec(iv);
			        cipher.init(javax.crypto.Cipher.ENCRYPT_MODE, key, ivSpec);
			        byte[] cipherText = cipher.doFinal(message);
			        log("cipherText", cipherText);
			        return cipherText;
			    }
		    public static String decrypt(final String password, String base64EncodedCipherText)
		            throws java.security.GeneralSecurityException {
			        try {
				            final javax.crypto.spec.SecretKeySpec key = generateKey(password);
				            log("base64EncodedCipherText", base64EncodedCipherText);
				            byte[] decodedCipherText = android.util.Base64.decode(base64EncodedCipherText, android.util.Base64.NO_WRAP);
				            log("decodedCipherText", decodedCipherText);
				            byte[] decryptedBytes = decrypt(key, ivBytes, decodedCipherText);
				            log("decryptedBytes", decryptedBytes);
				            String message = new String(decryptedBytes, CHARSET);
				            log("message", message);
				            return message;
				        } catch (java.io.UnsupportedEncodingException e) {
				            if (DEBUG_LOG_ENABLED)
				                android.util.Log.e(TAG, "UnsupportedEncodingException ", e);
				            throw new java.security.GeneralSecurityException(e);
				        }
			    }
		    public static byte[] decrypt(final javax.crypto.spec.SecretKeySpec key, final byte[] iv, final byte[] decodedCipherText)
		            throws java.security.GeneralSecurityException {
			            final javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(AES_MODE);
			            javax.crypto.spec.IvParameterSpec ivSpec = new javax.crypto.spec.IvParameterSpec(iv);
			            cipher.init(javax.crypto.Cipher.DECRYPT_MODE, key, ivSpec);
			            byte[] decryptedBytes = cipher.doFinal(decodedCipherText);
			            log("decryptedBytes", decryptedBytes);
			            return decryptedBytes;
			    }
		    private static void log(String what, byte[] bytes) {
			        if (DEBUG_LOG_ENABLED)
			            android.util.Log.d(TAG, what + "[" + bytes.length + "] [" + bytesToHex(bytes) + "]");
			    }
		    private static void log(String what, String value) {
			        if (DEBUG_LOG_ENABLED)
			            android.util.Log.d(TAG, what + "[" + value.length() + "] [" + value + "]");
			    }
		    private static String bytesToHex(byte[] bytes) {
			        final char[] hexArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8',
				                '9', 'A', 'B', 'C', 'D', 'E', 'F'};
			        char[] hexChars = new char[bytes.length * 2];
			        int v;
			        for (int j = 0; j < bytes.length; j++) {
				            v = bytes[j] & 0xFF;
				            hexChars[j * 2] = hexArray[v >>> 4];
				            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
				        }
			        return new String(hexChars);
			    }
		    private AESCrypt() {
			    }
	}
	private String cryptedOutput;
	private String decryptedOutput; 
	
	public void encryptText(String text, String key){
		  
		try {    	
			 cryptedOutput =  AESCrypt.encrypt(key, text);
		}catch (java.security.GeneralSecurityException e){
				showMessage("password not correct !" + "\n" + e.toString());
		}
	}
	
	public void decryptCode(String code, String key){
		  
		  try {
			  decryptedOutput =	AESCrypt.decrypt(key, code);
			  } catch (java.security.GeneralSecurityException e){
			      showMessage("password incorrect !" + "\n" + e.toString());
			  }
	}
	{
	}
	
	javax.crypto.KeyGenerator keyGenerator;
	javax.crypto.SecretKey secretKey;
	byte[] secretKeyen;
	String strSecretKey;
	byte[] IV = new byte[16];
	byte[] cipherText;
	
	public static byte[] encrypt(byte[] plaintext, javax.crypto.SecretKey key, byte[] IV) throws Exception{
		javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES");
		javax.crypto.spec.SecretKeySpec keySpec = new javax.crypto.spec.SecretKeySpec(key.getEncoded(), "AES");
		javax.crypto.spec.IvParameterSpec ivSpec = new javax.crypto.spec.IvParameterSpec(IV);
		cipher.init(javax.crypto.Cipher.ENCRYPT_MODE, keySpec, ivSpec);
		byte[] cipherText = cipher.doFinal(plaintext);
		return cipherText;
	}
	
	public static String decrypt(byte[] cipherText, javax.crypto.SecretKey key, byte[] IV){
		try {
			javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES");
			javax.crypto.spec.SecretKeySpec keySpec = new javax.crypto.spec.SecretKeySpec(key.getEncoded(), "AES");
			javax.crypto.spec.IvParameterSpec ivSpec = new javax.crypto.spec.IvParameterSpec(IV);
			cipher.init(javax.crypto.Cipher.DECRYPT_MODE, keySpec, ivSpec);
			byte[] decryptedText = cipher.doFinal(cipherText);
			return new String(decryptedText);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	{
		//Morse
	}
	/**
MorseCode library created by SCP.
Anyone can use this library by giving me a little credit.
I made this library with the reference of
**/
	public static class DidDogMorseCode {
		private static String[] AlphaNumeric = new String[37];
		private static String[] AlphaNumeric1 = new String[37];
		
		public static String encode(String text) {
			Initialize();
			
			String input = text;
			String output = "";
			int l = input.length();
			int i, j;
			for (i = 0; i < l; i++) {
				String ch = input.substring(i, i + 1);
				for (j = 0; j < 37; j++) { 
					if (ch.equalsIgnoreCase(AlphaNumeric[j])) {
						output = output.concat(AlphaNumeric1[j]).concat(" ");
					}
				}
			}
			return output;
		}
		
		public static String decode(String text) {
			Initialize();
			
			String input1 = text;
			String input = input1.concat(" ");
			int l = input.length();
			int i, j, p = 0;
			int pos = 0;
			String letter = "";
			String output = "";
			for (i = 0; i < l; i++) {
				int flag = 0;
				String ch = input.substring(i, i + 1);
				if (ch.equalsIgnoreCase(" ")) {
					p = i;
					letter = input.substring(pos, p);
					pos = p + 1;
					flag = 1;
				}
				String letter1 = letter.trim();
				if (flag == 1) {
					for (j = 0; j <= 36; j++) {
						if (letter1.equalsIgnoreCase(AlphaNumeric1[j])) {
							output = output.concat(AlphaNumeric[j]);
							break;
						}
					}
				}
			}
			return output;
		}
		
		private static void Initialize() {
			//AlphaNumeric setting values
			AlphaNumeric[0] = "A"; 
			
			AlphaNumeric[1] = "B"; 
			
			AlphaNumeric[2] = "C"; 
			
			AlphaNumeric[3] = "D"; 
			
			AlphaNumeric[4] = "E"; 
			
			AlphaNumeric[5] = "F"; 
			
			AlphaNumeric[6] = "G"; 
			
			AlphaNumeric[7] = "H"; 
			
			AlphaNumeric[8] = "I"; 
			
			AlphaNumeric[9] = "J"; 
			
			AlphaNumeric[10] = "K"; 
			
			AlphaNumeric[11] = "L"; 
			
			AlphaNumeric[12] = "M"; 
			
			AlphaNumeric[13] = "N"; 
			
			AlphaNumeric[14] = "O"; 
			
			AlphaNumeric[15] = "P"; 
			
			AlphaNumeric[16] = "Q"; 
			
			AlphaNumeric[17] = "R"; 
			
			AlphaNumeric[18] = "S"; 
			
			AlphaNumeric[19] = "T"; 
			
			AlphaNumeric[20] = "U"; 
			
			AlphaNumeric[21] = "V"; 
			
			AlphaNumeric[22] = "W"; 
			
			AlphaNumeric[23] = "X"; 
			
			AlphaNumeric[24] = "Y"; 
			
			AlphaNumeric[25] = "Z"; 
			
			AlphaNumeric[26] = "0"; 
			
			AlphaNumeric[27] = "1"; 
			
			AlphaNumeric[28] = "2"; 
			
			AlphaNumeric[29] = "3"; 
			
			AlphaNumeric[30] = "4"; 
			
			AlphaNumeric[31] = "5"; 
			
			AlphaNumeric[32] = "6"; 
			
			AlphaNumeric[33] = "7"; 
			
			AlphaNumeric[34] = "8"; 
			
			AlphaNumeric[35] = "9"; 
			
			AlphaNumeric[36] = " "; 
			
			
			//AlphaNumeric1 setting values
			AlphaNumeric1[0] = ".-"; 
			
			AlphaNumeric1[1] = "-..."; 
			
			AlphaNumeric1[2] = "-.-."; 
			
			AlphaNumeric1[3] = "-.."; 
			
			AlphaNumeric1[4] = "."; 
			
			AlphaNumeric1[5] = "..-."; 
			
			AlphaNumeric1[6] = "--."; 
			
			AlphaNumeric1[7] = "...."; 
			
			AlphaNumeric1[8] = ".."; 
			
			AlphaNumeric1[9] = ".---"; 
			
			AlphaNumeric1[10] = "-.-"; 
			
			AlphaNumeric1[11] = ".-.."; 
			
			AlphaNumeric1[12] = "--"; 
			
			AlphaNumeric1[13] = "-."; 
			
			AlphaNumeric1[14] = "---"; 
			
			AlphaNumeric1[15] = ".--."; 
			
			AlphaNumeric1[16] = "--.-"; 
			
			AlphaNumeric1[17] = ".-."; 
			
			AlphaNumeric1[18] = "..."; 
			
			AlphaNumeric1[19] = "-"; 
			
			AlphaNumeric1[20] = "..-"; 
			
			AlphaNumeric1[21] = "...-"; 
			
			AlphaNumeric1[22] = ".--"; 
			
			AlphaNumeric1[23] = "-..-"; 
			
			AlphaNumeric1[24] = "-.--"; 
			
			AlphaNumeric1[25] = "--.."; 
			
			AlphaNumeric1[26] = "-----"; 
			
			AlphaNumeric1[27] = ".----"; 
			
			AlphaNumeric1[28] = "..---"; 
			
			AlphaNumeric1[29] = "...--"; 
			
			AlphaNumeric1[30] = "....-"; 
			
			AlphaNumeric1[31] = "....."; 
			
			AlphaNumeric1[32] = "-...."; 
			
			AlphaNumeric1[33] = "--..."; 
			
			AlphaNumeric1[34] = "---.."; 
			
			AlphaNumeric1[35] = "----."; 
			
			AlphaNumeric1[36] = "/";
			
		}
		
	}
	{
	}
	
	
	public void _Security_Type() {
		if (scp_share.getString("type", "").equals("")) {
			scp_share.edit().putString("type", "enc").commit();
		}
		else {
			if (scp_share.getString("type", "").equals("enc")) {
				checkbox1.setChecked(true);
				checkbox2.setChecked(false);
			}
			else {
				if (scp_share.getString("type", "").equals("dec")) {
					checkbox1.setChecked(false);
					checkbox2.setChecked(true);
				}
				else {
					
				}
			}
		}
	}
	
	
	public void _Security_Mode() {
		if (scp_share.getString("encrypt", "").equals("")) {
			scp_share.edit().putString("encrypt", "AES V1").commit();
		}
		else {
			if (scp_share.getString("encrypt", "").equals("AES V1")) {
				textview1.setText("AES V1");
				textinputlayout2.setVisibility(View.GONE);
				radiobutton1.setChecked(true);
				radiobutton2.setChecked(false);
				radiobutton3.setChecked(false);
				radiobutton4.setChecked(false);
				radiobutton5.setChecked(false);
				radiobutton6.setChecked(false);
			}
			else {
				if (scp_share.getString("encrypt", "").equals("AES V2")) {
					textview1.setText("AES V2 with Password");
					textinputlayout2.setVisibility(View.VISIBLE);
					radiobutton1.setChecked(false);
					radiobutton2.setChecked(true);
					radiobutton3.setChecked(false);
					radiobutton4.setChecked(false);
					radiobutton5.setChecked(false);
					radiobutton6.setChecked(false);
				}
				else {
					if (scp_share.getString("encrypt", "").equals("Morse")) {
						textview1.setText("Morse");
						textinputlayout2.setVisibility(View.GONE);
						radiobutton1.setChecked(false);
						radiobutton2.setChecked(false);
						radiobutton3.setChecked(true);
						radiobutton4.setChecked(false);
						radiobutton5.setChecked(false);
						radiobutton6.setChecked(false);
					}
					else {
						if (scp_share.getString("encrypt", "").equals("Base64")) {
							textview1.setText("Base64");
							textinputlayout2.setVisibility(View.GONE);
							radiobutton1.setChecked(false);
							radiobutton2.setChecked(false);
							radiobutton3.setChecked(false);
							radiobutton4.setChecked(true);
							radiobutton5.setChecked(false);
							radiobutton6.setChecked(false);
						}
						else {
							if (scp_share.getString("encrypt", "").equals("MD5")) {
								textview1.setText("MD5");
								textinputlayout2.setVisibility(View.GONE);
								radiobutton1.setChecked(false);
								radiobutton2.setChecked(false);
								radiobutton3.setChecked(false);
								radiobutton4.setChecked(false);
								radiobutton5.setChecked(true);
								radiobutton6.setChecked(false);
							}
							else {
								if (scp_share.getString("encrypt", "").equals("Banary")) {
									textview1.setText("Banary Code");
									textinputlayout2.setVisibility(View.GONE);
									radiobutton1.setChecked(false);
									radiobutton2.setChecked(false);
									radiobutton3.setChecked(false);
									radiobutton4.setChecked(false);
									radiobutton5.setChecked(false);
									radiobutton6.setChecked(true);
								}
								else {
									
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	public String _nader_generateMD5(final String _input) {
		
		  try { 
			
			            // Static getInstance method is called with hashing MD5 
			
			            MessageDigest md = MessageDigest.getInstance("MD5"); 
			
			  
			
			            // digest() method is called to calculate message digest 
			
			            //  of an input digest() return array of byte 
			
			            byte[] messageDigest = md.digest(_input.getBytes()); 
			
			  
			
			            // Convert byte array into signum representation 
			
			            BigInteger no = new BigInteger(1, messageDigest); 
			
			  
			
			            // Convert message digest into hex value 
			
			            String hashtext = no.toString(16); 
			
			            while (hashtext.length() < 32) { 
				
				                hashtext = "0" + hashtext; 
			}
			           
			
			            return hashtext; 
			
			       }
		  catch (NoSuchAlgorithmException e) { 
			
			    throw new RuntimeException(e); 
		} 
		
		
	}
	
	
	public void _TransitionManager(final View _view, final double _duration) {
		LinearLayout viewgroup =(LinearLayout) _view;
		
		android.transition.AutoTransition autoTransition = new android.transition.AutoTransition(); autoTransition.setDuration((long)_duration); android.transition.TransitionManager.beginDelayedTransition(viewgroup, autoTransition);
	}
	
	
	public void _shape(final double _top1, final double _top2, final double _bottom2, final double _bottom1, final String _inside_color, final String _side_color, final double _side_size, final View _view) {
		Double tlr = _top1;
		Double trr = _top2;
		Double blr = _bottom2;
		Double brr = _bottom1;
		Double sw = _side_size;
		android.graphics.drawable.GradientDrawable s = new android.graphics.drawable.GradientDrawable();
		s.setShape(android.graphics.drawable.GradientDrawable.RECTANGLE);
		s.setCornerRadii(new float[] {tlr.floatValue(),tlr.floatValue(), trr.floatValue(),trr.floatValue(), blr.floatValue(),blr.floatValue(), brr.floatValue(),brr.floatValue()}); 
		
		s.setColor(Color.parseColor(_inside_color));
		s.setStroke(sw.intValue(), Color.parseColor(_side_color));
		_view.setBackground(s);
	}
	
	
	public void _initSlideActivity() {
		getWindow().getDecorView().setBackgroundResource(android.R.color.transparent);
		ViewConfiguration vc = ViewConfiguration.get(this);
		MIN_DISTANCE = vc.getScaledTouchSlop();
		
		rootView = (ViewGroup) ((ViewGroup) this .findViewById(android.R.id.content)).getChildAt(0);
	}
	// Custom Variables
	ViewGroup rootView ;
	boolean enableSwipe= false;
	boolean lockSwipe = false;
	float downX;
	float downY;
	float MIN_DISTANCE ;
	// Detect touch Events
	 @Override public boolean dispatchTouchEvent(MotionEvent event) { 
		switch(event.getAction()) { 
			case MotionEvent.ACTION_DOWN: 
			downX = event.getRawX();
			downY =event.getRawY();
			enableSwipe = false;
			lockSwipe = false;
			//convert activity to transparent
			
			try { 	java.lang.reflect.Method getActivityOptions = Activity.class.getDeclaredMethod("getActivityOptions"); getActivityOptions.setAccessible(true); Object options = getActivityOptions.invoke(this); Class<?>[] classes = Activity.class.getDeclaredClasses(); Class<?> translucentConversionListenerClazz = null; for (Class clazz : classes) { if (clazz.getSimpleName().contains("TranslucentConversionListener")) { translucentConversionListenerClazz = clazz; } } 
				java.lang.reflect.Method convertToTranslucent = Activity.class.getDeclaredMethod("convertToTranslucent", translucentConversionListenerClazz, ActivityOptions.class); convertToTranslucent.setAccessible(true); convertToTranslucent.invoke(this, null, options); } catch (Throwable t) {
			}
			break; 
			case MotionEvent.ACTION_MOVE: 
			if (!lockSwipe){
				if(enableSwipe){
					float translation = event.getRawX() -downX - MIN_DISTANCE;
					if (translation >= rootView.getWidth() || translation<= 0){
						rootView.setTranslationX(0);
					}else{
						rootView.setTranslationX(translation);
					}
				}else{
					float translation = event.getRawX() -downX;
					if(Math.abs(event.getRawY() - downY) >= MIN_DISTANCE){
						enableSwipe = false;
						lockSwipe = true;
					}else{
						enableSwipe = event.getRawX() -downX >= MIN_DISTANCE;
					}
				}
			}
			break; 
			case MotionEvent.ACTION_UP: 
			if(rootView.getTranslationX() > rootView.getWidth() / 5){
				rootView.animate() 
				.translationX(rootView.getWidth())
				.setListener(
				new AnimatorListenerAdapter() { 
							@Override public void onAnimationEnd(Animator animation) { 
						
							super.onAnimationEnd(animation);
						finish();
						overridePendingTransition(0, 0);
						
					} });
			}else{
				rootView.animate() 
				.translationX(0)
				.setListener(
				new AnimatorListenerAdapter() { 
							@Override public void onAnimationEnd(Animator animation) { 
						super.onAnimationEnd(animation);
						// convert activity back to normal
						try {
							            java.lang.reflect.Method method = Activity.class.getDeclaredMethod("convertFromTranslucent");
							            method.setAccessible(true);
							            method.invoke(this);
							        } catch (Throwable t) {
							        }
					} });
				enableSwipe =false;
				lockSwipe = false;
			}
			break; 
			default:
			enableSwipe =false;
			lockSwipe = false;
			break; 
		}
		if (enableSwipe){
			event.setAction(MotionEvent.ACTION_CANCEL);
		}
		return super.dispatchTouchEvent(event);
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
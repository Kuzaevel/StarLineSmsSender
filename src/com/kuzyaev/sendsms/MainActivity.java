package com.kuzyaev.sendsms;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import android.telephony.gsm.SmsManager;


@SuppressWarnings("deprecation")
public class MainActivity extends Activity {
	
	   TextView tvOut;
	   Button btnOk;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	     // ������ View-��������
	     tvOut = (TextView) findViewById(R.id.textView1);
	     btnOk = (Button) findViewById(R.id.button1);
	     
	  // ������� ���������� �������
	     OnClickListener oclBtnOk = new OnClickListener() {
	       @Override
	       public void onClick(View v) {
	         // ������ ����� � TextView (tvOut)
	         tvOut.setText("��������� ��� ������� ��������� ����������!");
	         
             String phoneNumber = new String("89117398272");
             String message = new String("21");         
              SendSms(phoneNumber, message);
	         
	         
	       }
	     };
	 
	     // �������� ���������� ������ OK (btnOk)
	     btnOk.setOnClickListener(oclBtnOk);	     
	     
	}

	protected void SendSms(String phoneNumber, String message) {
		// TODO Auto-generated method stub
		SmsManager manager = SmsManager.getDefault();//new SmsMessage()
		manager.sendTextMessage(phoneNumber, null, message, null, null);
		Toast.makeText(getApplicationContext(), "send sucsessfully", Toast.LENGTH_LONG).show();
	}
}

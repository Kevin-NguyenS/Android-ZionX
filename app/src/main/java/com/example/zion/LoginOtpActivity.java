package com.example.zion;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.Firebase;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;


public class LoginOtpActivity extends AppCompatActivity {
    String phoneNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login_otp);

        phoneNumber = getIntent().getExtras().getString("phone");
        Toast.makeText(getApplicationContext(),phoneNumber, Toast.LENGTH_LONG).show();

        Map<String, String > data = new HashMap<>();
        data.put("fisrtname", "Hehe");
        FirebaseFirestore.getInstance().collection("test").add(data);
    }
}
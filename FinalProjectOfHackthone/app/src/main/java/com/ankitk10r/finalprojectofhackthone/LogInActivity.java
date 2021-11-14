package com.ankitk10r.finalprojectofhackthone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ankitk10r.finalprojectofhackthone.databinding.ActivityLogInBinding;

public class LogInActivity extends AppCompatActivity {
    ActivityLogInBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_log_in );
        binding = ActivityLogInBinding.inflate( getLayoutInflater() );
        setContentView( binding.getRoot() );
        binding.LoginBtn.setOnClickListener( view -> {
            Intent i=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(i);
            finish();
        } );
        binding.SignUpBTN.setOnClickListener( view -> {
            Intent i=new Intent(getApplicationContext(),SinUpActivity.class);
            startActivity(i);
            finish();
        } );

    }
}
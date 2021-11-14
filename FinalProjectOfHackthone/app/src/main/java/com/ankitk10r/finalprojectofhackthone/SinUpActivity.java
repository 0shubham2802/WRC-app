package com.ankitk10r.finalprojectofhackthone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.ankitk10r.finalprojectofhackthone.databinding.ActivitySinUpBinding;

public class SinUpActivity extends AppCompatActivity {
    ActivitySinUpBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_sin_up );
        binding = ActivitySinUpBinding.inflate( getLayoutInflater() );
        setContentView( binding.getRoot() );
        binding.SignUPBtn.setOnClickListener( view -> {
            Intent i=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(i);
            finish();
        } );
        binding.GotoLoginPageBtn.setOnClickListener( view -> {
            Intent i=new Intent(getApplicationContext(),LogInActivity.class);
            startActivity(i);
            finish();
        } );
    }
}
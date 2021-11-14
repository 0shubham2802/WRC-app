package com.ankitk10r.finalprojectofhackthone.BuyWaste;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.View;

import com.ankitk10r.finalprojectofhackthone.R;
import com.ankitk10r.finalprojectofhackthone.databinding.ActivityDetailsBinding;
import com.bumptech.glide.Glide;

public class DetailsActivity extends AppCompatActivity {
    ActivityDetailsBinding binding;
    int count = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_details );
        binding = ActivityDetailsBinding.inflate( getLayoutInflater() );
        setContentView( binding.getRoot() );


        binding.WasteName.setText( getIntent().getStringExtra( "name" )+" "+  getIntent().getStringExtra( "location" )+" "+ getIntent().getStringExtra( "contact" ));
        binding.Price.setText( getIntent().getStringExtra( "price" ) );
        binding.Quentity.setText( getIntent().getStringExtra( "quantity" ) );
        Glide.with( this ). load( getIntent().getStringExtra( "img" ) ).into( binding.WasteIMG );

        binding.OrderBtn.setOnClickListener( view -> {
            switch (count){
                case 1: binding.AddressLayout.getLayoutParams().height = ActionBar.LayoutParams.WRAP_CONTENT;
                    binding.AddressLayout.requestLayout();
                    binding.OrderBtn.setText( "Cancel" );
                    count++;
                    break;
                case 2:  binding.AddressLayout.getLayoutParams().height = 0;
                    binding.AddressLayout.requestLayout();
                    binding.OrderBtn.setText( "Orders" );
                    count = 1;
                    break;
            }
        } );
    }
}
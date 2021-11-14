package com.ankitk10r.finalprojectofhackthone.TabMenu.RecyclerAdapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ankitk10r.finalprojectofhackthone.R;
import com.ankitk10r.finalprojectofhackthone.TabMenu.AllModel.Sell_waste_model;
import com.ankitk10r.finalprojectofhackthone.TabMenu.AllModel.waste_model;
import com.ankitk10r.finalprojectofhackthone.TabMenu.HomeFragment;
import com.ankitk10r.finalprojectofhackthone.databinding.SellWasteRecyclerItemsDesignBinding;
import com.ankitk10r.finalprojectofhackthone.databinding.WasteRecyclerItemsDesignBinding;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Sell_waste_Recycler_Adapter extends RecyclerView.Adapter<Sell_waste_Recycler_Adapter.Holder> {
    private Context context;
    ArrayList<Sell_waste_model> wasteModels;

    public Sell_waste_Recycler_Adapter(Context context, ArrayList<Sell_waste_model> wasteModels) {
        this.context = context;
        this.wasteModels = wasteModels;
    }



    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( context ).inflate( R.layout.sell_waste_recycler_items_design,parent,false );
        return new Holder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        if (!(wasteModels.get( position ).getSellOrNot() != true)){
            holder.binding.Unselles.setText( "Sold out" );
            holder.binding.Unselles.setBackgroundColor( 0xFF12FF45 );
        }

        holder.binding.TitleOfWaste.setText( wasteModels.get( position ).getWaste_name());
        holder.binding.WastePrice.setText( wasteModels.get( position ).getWaste_price());
        holder.binding.WasteLocation.setText( "Waste Location: "+wasteModels.get( position ).getWaste_location());
        holder.binding.quentity.setText( "Quantity: "+ wasteModels.get( position ).getWaste_Quantity());
        holder.binding.contactNo.setText( wasteModels.get( position ).getContact_no() );
        Glide.with( context ). load(  wasteModels.get( position) .getWaste_image_url() ).into( holder.binding.WasteImg );
    }

    @Override
    public int getItemCount() {
        return wasteModels.size();
    }

    class Holder extends RecyclerView.ViewHolder{
        SellWasteRecyclerItemsDesignBinding binding;
        public Holder(@NonNull View itemView) {
            super( itemView );
            binding = SellWasteRecyclerItemsDesignBinding.bind( itemView );
        }
    }
}

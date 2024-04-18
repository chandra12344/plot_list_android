package com.example.ploatapp.adapters;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ploatapp.R;
import com.example.ploatapp.models.Plot;

import java.util.List;

public class PlotAdapter extends RecyclerView.Adapter<PlotAdapter.ViewHolder> {
    private List<Plot> plotList;

    public PlotAdapter(List<Plot> plotList) {
        this.plotList = plotList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_plot, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        if (plotList.get(position).isBooked()) {
            holder.btnBook.setBackgroundColor(Color.GREEN); // Change color to green for booked plots
            holder.btnBook.setText("Booked");
        }else{
            holder.btnBook.setBackgroundColor(Color.RED); // Change color to green for booked plots
            holder.btnBook.setText("Book");
        }
        Plot plot = plotList.get(position);
        holder.txtPlotNumber.setText(plot.getPlotNumber());
        holder.txtStatus.setText(plot.getStatus());
        holder.layout.setBackgroundColor(plot.getColor());

        holder.btnBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plotList.get(position).setBooked(true);
                Toast.makeText(v.getContext(), "Plot Book Successfully", Toast.LENGTH_SHORT).show();
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return plotList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtPlotNumber, txtStatus;
        LinearLayout layout;
        AppCompatButton btnBook;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtPlotNumber = itemView.findViewById(R.id.txtPlotNumber);
            txtStatus = itemView.findViewById(R.id.txtStatus);
            layout = itemView.findViewById(R.id.layoutItem);
             btnBook = itemView.findViewById(R.id.btnBook);
        }
    }
}

package com.example.ploatapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.graphics.Color;
import android.os.Bundle;

import com.example.ploatapp.adapters.PlotAdapter;
import com.example.ploatapp.databinding.ActivityMainBinding;
import com.example.ploatapp.models.Plot;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
    private PlotAdapter plotAdapter;
    private List<Plot> plotList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        initView();
        setContentView(binding.getRoot());
    }

    private void initView() {
       binding.recyclerViewPlots.setLayoutManager(new LinearLayoutManager(this));
        // Sample data
        plotList = new ArrayList<>();
        plotList.add(new Plot("Plot 1", "Available", Color.YELLOW,false));
        plotList.add(new Plot("Plot 2", "Occupied", Color.GRAY,false));
        plotList.add(new Plot("Plot 3", "Reserved", Color.YELLOW,false));
        plotList.add(new Plot("Plot 3", "Reserved", Color.YELLOW,false));
        plotList.add(new Plot("Plot 3", "Reserved", Color.YELLOW,false));
        plotList.add(new Plot("Plot 3", "Reserved", Color.YELLOW,false));

        plotAdapter = new PlotAdapter(plotList);
        binding.recyclerViewPlots.setAdapter(plotAdapter);
    }
}
package com.example.ploatapp.models;

public class Plot {
    private String plotNumber;
    private String status;
    private int color;
    private boolean isBooked ;

    public Plot(String plotNumber, String status, int color, boolean isBooked) {
        this.plotNumber = plotNumber;
        this.status = status;
        this.color = color;
        this.isBooked = isBooked;
    }

    public String getPlotNumber() {
        return plotNumber;
    }

    public void setPlotNumber(String plotNumber) {
        this.plotNumber = plotNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }
}

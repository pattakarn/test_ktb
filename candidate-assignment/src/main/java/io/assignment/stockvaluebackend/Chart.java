package io.assignment.stockvaluebackend;

public class Chart {
    private float close;
    private float high;
    private float low;
    private float open;
    private String symbol;
    private int volume;

    public float getClose() {
        return close;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public float getOpen() {
        return open;
    }

    public void setOpen(float open) {
        this.open = open;
    }

    public float getLow() {
        return low;
    }

    public void setLow(float low) {
        this.low = low;
    }

    public float getHigh() {
        return high;
    }

    public void setHigh(float high) {
        this.high = high;
    }

    public void setClose(float close) {
        this.close = close;
    }

    
}

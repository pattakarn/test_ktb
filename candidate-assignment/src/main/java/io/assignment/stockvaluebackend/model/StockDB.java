package io.assignment.stockvaluebackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StockDB {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long No;
    private String companyName;
    private float close;
    private float high;
    private float low;
    private float open;
    private String symbol;
    private long volume;
    private String id;
    private String key;
    private String subkey;
    private String date;
    private long updated;
    private long changeOverTime;
    private long marketChangeOverTime;
    private long uOpen;
    private long uClose;
    private long uHigh;
    private long uLow;
    private long uVolume;
    private long fOpen;
    private long fClose;
    private long fHigh;
    private long fLow;
    private long fVolume;
    private String label;
    private long change;
    private long changePercent;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public float getClose() {
        return close;
    }

    public long getChangePercent() {
        return changePercent;
    }

    public void setChangePercent(long changePercent) {
        this.changePercent = changePercent;
    }

    public long getChange() {
        return change;
    }

    public void setChange(long change) {
        this.change = change;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public long getfVolume() {
        return fVolume;
    }

    public void setfVolume(long fVolume) {
        this.fVolume = fVolume;
    }

    public long getfLow() {
        return fLow;
    }

    public void setfLow(long fLow) {
        this.fLow = fLow;
    }

    public long getfHigh() {
        return fHigh;
    }

    public void setfHigh(long fHigh) {
        this.fHigh = fHigh;
    }

    public long getfClose() {
        return fClose;
    }

    public void setfClose(long fClose) {
        this.fClose = fClose;
    }

    public long getfOpen() {
        return fOpen;
    }

    public void setfOpen(long fOpen) {
        this.fOpen = fOpen;
    }

    public long getuVolume() {
        return uVolume;
    }

    public void setuVolume(long uVolume) {
        this.uVolume = uVolume;
    }

    public long getuLow() {
        return uLow;
    }

    public void setuLow(long uLow) {
        this.uLow = uLow;
    }

    public long getuHigh() {
        return uHigh;
    }

    public void setuHigh(long uHigh) {
        this.uHigh = uHigh;
    }

    public long getuClose() {
        return uClose;
    }

    public void setuClose(long uClose) {
        this.uClose = uClose;
    }

    public long getuOpen() {
        return uOpen;
    }

    public void setuOpen(long uOpen) {
        this.uOpen = uOpen;
    }

    public long getMarketChangeOverTime() {
        return marketChangeOverTime;
    }

    public void setMarketChangeOverTime(long marketChangeOverTime) {
        this.marketChangeOverTime = marketChangeOverTime;
    }

    public long getChangeOverTime() {
        return changeOverTime;
    }

    public void setChangeOverTime(long changeOverTime) {
        this.changeOverTime = changeOverTime;
    }

    public long getUpdated() {
        return updated;
    }

    public void setUpdated(long updated) {
        this.updated = updated;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSubkey() {
        return subkey;
    }

    public void setSubkey(String subkey) {
        this.subkey = subkey;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getVolume() {
        return volume;
    }

    public void setVolume(long volume) {
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

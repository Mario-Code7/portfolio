package com.pluralsight.finance;

import java.util.ArrayList;

public class Portfolio implements Valuable {
    private String name;
    private String owner;
    private ArrayList<Valuable> assets = new ArrayList<>();

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void addAsset(Valuable asset) {
        assets.add(asset);
    }

    @Override
    public double getValue() {
        double total = 0;
        for (Valuable asset: assets) {
            total += asset.getValue();
        }
        return total;
    }
    public Valuable getMostValuable() {
        Valuable mostValuable = assets.get(0);
        for (Valuable asset: assets) {
            if (asset.getValue() > mostValuable.getValue()) {
                mostValuable = asset;
            }
        }
        return mostValuable;
    }

    public Valuable getLeastValuable() {
        if (assets.isEmpty()){
            return null;
        }
        Valuable leastValuable = assets.get(0);
        for (Valuable asset: assets) {
            if(asset.getValue() < leastValuable.getValue()) {
                leastValuable = asset;
            }
        }
        return leastValuable;
    }

    @Override
    public String toString() {
        return "Portfolio{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", assets=" + assets +
                '}';
    }
}

package com.example.rewardsmanager.Models;

public class Store {
    private String storeName;
    private String storeImageUrl;

    public Store(String storeName, String storeImageUrl) {
        this.storeName = storeName;
        this.storeImageUrl = storeImageUrl;
    }

    public Store() {

    }

    public String getStoreName() {
        return storeName;
    }

    public String getStoreImageUrl() {
        return storeImageUrl;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setStoreImageUrl(String storeImageUrl) {
        this.storeImageUrl = storeImageUrl;
    }
}

package com.zx.mvvmdemo.bean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 


import android.databinding.Bindable;

import com.zx.mvvmdemo.BR;
import com.zx.mvvmdemo.base.BaseModel;

/**
 * Entity mapped to table SCADVERTISEMENT_MODEL.
 */
public class SCAdvertisementModel extends BaseModel {

    public Long id;
    public String advertId;
    @Bindable
    public String picture;
    @Bindable
    public String url;
    public String comCode;
    @Bindable
    public String picLocation;

    public SCAdvertisementModel() {
    }

    public SCAdvertisementModel(Long id) {
        this.id = id;
    }

    public SCAdvertisementModel(Long id, String advertId, String picture, String url, String comCode, String picLocation) {
        this.id = id;
        this.advertId = advertId;
        this.picture = picture;
        this.url = url;
        this.comCode = comCode;
        this.picLocation = picLocation;
    }

    public void setPicture(String picture) {
        this.picture = picture;
        notifyPropertyChanged(BR.picture);
    }

    public void setUrl(String url) {
        this.url = url;
        notifyPropertyChanged(BR.url);
    }

    public void setPicLocation(String picLocation) {
        this.picLocation = picLocation;
        notifyPropertyChanged(BR.picLocation);
    }
}
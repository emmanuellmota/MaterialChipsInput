package com.pchmn.sample.materialchipsinput;


import android.graphics.drawable.Drawable;
import android.net.Uri;

import com.pchmn.materialchips.model.ChipInterface;

public class ContactChip implements ChipInterface {

    private String id;
    private String name;
    private String phoneNumber;

    public ContactChip(String id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public Object getId() {
        return id;
    }

    @Override
    public String getLabel() {
        return name;
    }

    @Override
    public String getInfo() {
        return phoneNumber;
    }
}

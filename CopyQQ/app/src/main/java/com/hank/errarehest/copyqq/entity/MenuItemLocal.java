package com.hank.errarehest.copyqq.entity;

/**
 * Created by Administrator on 2016/12/31 0031.
 */

public class MenuItemLocal {
    private int icon;
    private String text;

    public MenuItemLocal() {}

    public MenuItemLocal(String text) {
        this.text = text;
    }

    public MenuItemLocal(int iconId, String text) {
        this.icon = iconId;
        this.text = text;
    }

    public int getIcon() {
        return icon;

    }
    public void setIcon(int iconId) {
        this.icon = iconId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

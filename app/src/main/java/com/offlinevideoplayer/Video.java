package com.offlinevideoplayer;

public  class Video {
    public String name;
    public String duration;
    public int imageResourceId;
    public Video(String name, String duration,int imageResourceId) {
        this.name = name;
        this.duration = duration;
        this.imageResourceId = imageResourceId;
    }
}

package com.android.launcher3.customview.model;

import android.content.Intent;
import android.graphics.drawable.Drawable;

public class AppInfor {
	private String title;
	private String packetName;
	private Intent intent;
	private Drawable Drawable;
	private String name;
	private String label;
	
	
	public AppInfor(String packetName, Drawable Drawable, String name, String label) {
		super();
		this.packetName = packetName;
		this.Drawable = Drawable;
		this.name = name;
		this.label = label;
	}
	
	

	public AppInfor(String packetName, String name, String label) {
		super();
		this.packetName = packetName;
		this.name = name;
		this.label = label;
	}


	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPacketName() {
		return packetName;
	}
	public void setPacketName(String packetName) {
		this.packetName = packetName;
	}
	public Intent getIntent() {
		return intent;
	}
	public void setIntent(Intent intent) {
		this.intent = intent;
	}
	public Drawable getDrawable() {
		return Drawable;
	}
	public void setDrawable(Drawable Drawable) {
		this.Drawable = Drawable;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
}

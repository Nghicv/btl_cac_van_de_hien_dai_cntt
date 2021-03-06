package com.android.launcher3.customview;

import android.content.Intent;
import android.graphics.drawable.Drawable;

public class AppInfor {
	private String title;
	private String packetName;
	private Intent intent;
	private Drawable icon;
	private String name;
	private String label;
	
	
	public AppInfor() {
		super();
	}

	public AppInfor(String packetName, Drawable Drawable, String name, String label) {
		super();
		this.packetName = packetName;
		this.icon = Drawable;
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
		String s = label.substring(0, 1);
		title = s.toUpperCase();
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
	public Drawable getIcon() {
		return icon;
	}
	public void setIcon(Drawable icon) {
		this.icon = icon;
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

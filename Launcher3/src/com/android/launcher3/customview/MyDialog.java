package com.android.launcher3.customview;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.view.View.OnClickListener;

import com.android.launcher3.AppsCustomizePagedView;
import com.android.launcher3.Launcher;
import com.android.launcher3.R;

public class MyDialog extends Dialog{
	Activity activity;
	RelativeLayout dialog_layout;
	Button bt_my_all_app , bt_all_app_default;
	
	public MyDialog(Activity activity) {
		super(activity);
		this.activity = activity;
		
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().getAttributes().windowAnimations = R.style.Animations_Dialog;

		
		setContentView(R.layout.dialog_layout);
		dialog_layout = (RelativeLayout) findViewById(R.id.layout_dialog);
		dialog_layout.getLayoutParams().height = activity.getWindowManager()
				.getDefaultDisplay().getHeight() * 1 / 4;
		dialog_layout.getLayoutParams().width = activity.getWindowManager()
				.getDefaultDisplay().getWidth() * 8 / 10;
		
		bt_all_app_default = (Button)findViewById(R.id.bt_all_app_default);
		bt_my_all_app = (Button)findViewById(R.id.bt_my_all_app);
		
		bt_all_app_default.setOnClickListener(new android.view.View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Launcher.thiz.showAllApps(true, AppsCustomizePagedView.ContentType.Applications, true);
				Launcher.thiz.mFragment.getView().setVisibility( View.GONE);
				
				dismiss();
			}

		});
	}

}

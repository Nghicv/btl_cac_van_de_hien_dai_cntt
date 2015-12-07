package phuong;

import java.util.List;

import org.askerov.dynamicgrid.BaseDynamicGridAdapter;

import com.android.launcher3.R;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class DrawerAdapter extends BaseDynamicGridAdapter {

	public DrawerAdapter(Context c, List<Pac> list , int count) {
		super(c, list, count);
	}


	@Override
	public View getView(int pos, View convertView, ViewGroup arg2) {
		// TODO Auto-generated method stub
		ViewHolder viewHolder;
		
		if(convertView == null){
			convertView  = LayoutInflater.from(getContext()).inflate(R.layout.aaa_drawer_item, null);
			viewHolder  = new ViewHolder();
			viewHolder.icon = (ImageView) convertView.findViewById(R.id.icon_image);
			viewHolder.text = (TextView) convertView.findViewById(R.id.icon_text);
			
			convertView.setTag(viewHolder);
		} else {
			
			viewHolder = (ViewHolder) convertView.getTag();
			
		}
		viewHolder.text.setText(((Pac)getItem(pos)).label);
		viewHolder.icon.setImageDrawable( ((Pac) getItem(pos)).icon);
		
		return convertView;
	}

	static class ViewHolder {
		TextView text;
		ImageView icon;
	}

}

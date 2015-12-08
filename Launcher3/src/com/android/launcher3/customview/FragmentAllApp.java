package com.android.launcher3.customview;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Pack200.Packer;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.launcher3.R;
import com.android.launcher3.customview.SimpleSectionedGridAdapter.Section;
import com.android.launcher3.customview.model.AppInfor;

public class FragmentAllApp extends android.app.Fragment {
	
	private List<AppInfor> data = new ArrayList<AppInfor>();
	private GridView grid;
	private ImageAdapter mAdapter;
	private ArrayList<Section> sections = new ArrayList<Section>();
	private View view;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		view= LayoutInflater.from(getActivity().getBaseContext()).inflate(R.layout.activity_grid, null);
		initControls();
		
		return view;
	}

	private void initControls() {
		grid = (GridView)view.findViewById(R.id.grid);
		mAdapter = new ImageAdapter(getActivity());
		for (int i = 0; i < mHeaderPositions.length; i++) {
			sections.add(new Section(mHeaderPositions[i], mHeaderNames[i]));
		}
		SimpleSectionedGridAdapter simpleSectionedGridAdapter = new SimpleSectionedGridAdapter(getActivity(), mAdapter,
				R.layout.grid_item_header, R.id.header_layout, R.id.header);
		simpleSectionedGridAdapter.setGridView(grid);
		simpleSectionedGridAdapter.setSections(sections.toArray(new Section[0]));
		grid.setAdapter(simpleSectionedGridAdapter);
		grid.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				Toast.makeText(getActivity(), "clicked: "+position, 3).show();
			}
		});
		grid.setOnItemLongClickListener(new OnItemLongClickListener() {

			@Override
			public boolean onItemLongClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				Toast.makeText(getActivity(), "clicked: "+position, 3).show();
				return true;
			}
		});
	}
	private void initData(){
		
		
	}
	
	private class ImageAdapter extends BaseAdapter{
		
		private LayoutInflater mInflater;

		public ImageAdapter(Context context) {
			mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		}

		@Override
		public int getCount() {
			return mImageIds.length;
		}

		@Override
		public Object getItem(int position) {
			return null;
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			ImageView image;
			
			if (convertView == null) {
				convertView = mInflater.inflate(R.layout.grid_item, parent, false);
			}

			image = ViewHolder.get(convertView, R.id.image);
			image.setImageResource(mImageIds[position]);
			return convertView;
		}

	}
	
    private Integer[] mImageIds = { 
    		R.drawable.cat1,R.drawable.cat2,R.drawable.cat3,R.drawable.cat4,R.drawable.cat5,R.drawable.cat6,R.drawable.cat7,R.drawable.cat8,R.drawable.cat9,R.drawable.cat10,
    		R.drawable.cat11,R.drawable.cat12,R.drawable.cat13,R.drawable.cat14,R.drawable.cat15,R.drawable.cat16,R.drawable.cat17,R.drawable.cat18,R.drawable.cat19,R.drawable.cat20,
    		R.drawable.cat21,R.drawable.cat22,R.drawable.cat23,R.drawable.cat24,R.drawable.cat25,R.drawable.cat26,R.drawable.cat27,R.drawable.cat28,R.drawable.cat29,R.drawable.cat30,
    		R.drawable.cat31,R.drawable.cat32,R.drawable.cat33,R.drawable.cat34,R.drawable.cat35,R.drawable.cat36,R.drawable.cat37,R.drawable.cat38,R.drawable.cat39,R.drawable.cat40,
    		R.drawable.cat41,R.drawable.cat42,R.drawable.cat43,R.drawable.cat44,R.drawable.cat45,R.drawable.cat46,R.drawable.cat47,R.drawable.cat48,R.drawable.cat49,R.drawable.cat50,
    		R.drawable.cat51,R.drawable.cat52,R.drawable.cat53,R.drawable.cat54,R.drawable.cat55,R.drawable.cat56,R.drawable.cat57,R.drawable.cat58,R.drawable.cat59,R.drawable.cat60,
    		R.drawable.cat61,R.drawable.cat62,R.drawable.cat63,R.drawable.cat64,R.drawable.cat65,R.drawable.cat66,R.drawable.cat67,R.drawable.cat68,R.drawable.cat69,R.drawable.cat70,
    		R.drawable.cat71,R.drawable.cat72,R.drawable.cat73,R.drawable.cat74,R.drawable.cat75,R.drawable.cat76,R.drawable.cat77,R.drawable.cat78,R.drawable.cat79,R.drawable.cat80,
    		R.drawable.cat81,R.drawable.cat82,R.drawable.cat83,R.drawable.cat84,R.drawable.cat85,R.drawable.cat86,R.drawable.cat87,R.drawable.cat88,R.drawable.cat89,R.drawable.cat90,
    		R.drawable.cat91,R.drawable.cat92,R.drawable.cat93,R.drawable.cat94,R.drawable.cat95,R.drawable.cat96,R.drawable.cat97,R.drawable.cat98,R.drawable.cat99,R.drawable.cat100,
    };
    
    private String[] mHeaderNames = { "Cute Cats", "Few Cats", "Some Cats", "Some More Cats", "Some More More Cats", "Many Cats", "Many Many Cats", "So Many Cats" };
    private Integer[] mHeaderPositions = { 0, 6, 11, 37, 38, 60, 77, 89 };

	public static class ViewHolder {
		@SuppressWarnings("unchecked")
		public static <T extends View> T get(View view, int id) {
			SparseArray<View> viewHolder = (SparseArray<View>) view.getTag();
			if (viewHolder == null) {
				viewHolder = new SparseArray<View>();
				view.setTag(viewHolder);
			}
			View childView = viewHolder.get(id);
			if (childView == null) {
				childView = view.findViewById(id);
				viewHolder.put(id, childView);
			}
			return (T) childView;
		}
	}
	
	private void onScroll() {
		// TODO Auto-generated method stub
	}
}
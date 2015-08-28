package com.example.recyclerviewdemo;

import java.util.List;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RecAadpter extends RecyclerView.Adapter<MyViewHolder>{
	private List<String> myData;
	private Context context;
	private LayoutInflater inflater;

	
	public RecAadpter(Context mContext, List<String> data) {
		this.context = mContext;
		this.myData = data;
		inflater = LayoutInflater.from(mContext);
	}

	@Override
	public int getItemCount() {
		return myData.size();
	}

	@Override
	public void onBindViewHolder(MyViewHolder holder, int pos) {
		holder.textView.setText(myData.get(pos));
	}

	@Override
	public MyViewHolder onCreateViewHolder(ViewGroup arg0, int arg1) {
		View view = inflater.inflate(R.layout.item_recycler, arg0, false);
		MyViewHolder holder = new MyViewHolder(view);
		return holder;
	}

}

class MyViewHolder extends ViewHolder
{
	TextView textView ;

	public MyViewHolder(View arg0) {
		super(arg0);
		textView = (TextView) arg0.findViewById(R.id.recyc_item);
	}
	
}

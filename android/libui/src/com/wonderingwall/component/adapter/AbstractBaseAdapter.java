/** 
 * Project Name:libui 
 * File Name:AbstractBaseAdapter.java 
 * Package Name:com.wonderingwall.view.adapter 
 * Date:2014年11月13日下午3:19:32 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */  
 
package com.wonderingwall.component.adapter;  

import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.List;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.wonderingwall.ui.BaseViewHolder;

/** 
 * ClassName:AbstractBaseAdapter <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年11月13日 下午3:19:32 <br/> 
 * @author   DavidZou
 * @version   
 * @see       
 */
public abstract class AbstractBaseAdapter<T extends BaseViewHolder, D> extends BaseAdapter {
	/**
	 */
	private SoftReference<T> viewHolder;
	/**
	 * 
	 */
	private List<D> datas = Collections.emptyList();
	
	/**
	 * 
	 */
	protected ListView listView;
	
	public AbstractBaseAdapter(ListView listView, List<D> datas, T viewHolder) {
		this.listView = listView;
		this.datas = datas;
		this.viewHolder = new SoftReference<T>(viewHolder);
	}

	@Override
	public int getCount() {
		return datas == null ? 0 : datas.size();
	}

	@Override
	public Object getItem(int position) {
		return datas == null ? 0 : datas.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		BaseViewHolder viewHolder;
		if (convertView == null) {
			viewHolder = this.viewHolder.get();
			convertView = viewHolder.getRootView();
			convertView.setTag(viewHolder);
		} else {
			viewHolder = (BaseViewHolder) convertView.getTag();
		}
		viewHolder.updateView(getData(position));
		return convertView;
	}
	
	/**
	 * Description(描述):<br/> 
	 * Conditions(适用条件):<br/> 
	 * Execution flow(执行流程):<br/> 
	 * Usage(用法):<br/> 
	 * Cautions(注意事项):<br/> 
	 * 
	 * @return 
	 */ 
	public List<D> getDatas() {
		return datas;
	}

	/**
	 * Description(描述):<br/> 
	 * Conditions(适用条件):<br/> 
	 * Execution flow(执行流程):<br/> 
	 * Usage(用法):<br/> 
	 * Cautions(注意事项):<br/> 
	 * 
	 * @param datas 
	 */ 
	public void setDatas(List<D> datas) {
		this.datas = datas;
	}

	/**
	 * Description(描述): 获取数据<br/> 
	 * Conditions(适用条件):<br/> 
	 * Execution flow(执行流程):<br/> 
	 * Usage(用法):<br/> 
	 * Cautions(注意事项):<br/> 
	 * 
	 * @param position
	 * @return 
	 */ 
	public abstract D getData(int position);
}
 
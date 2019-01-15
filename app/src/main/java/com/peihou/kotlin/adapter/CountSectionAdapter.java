package com.peihou.kotlin.adapter;

import android.content.Context;
import android.provider.CalendarContract;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.peihou.kotlin.R;
import com.peihou.kotlin.viewholders.CountFooterViewHolder;
import com.peihou.kotlin.viewholders.CountHeaderViewHolder;
import com.peihou.kotlin.viewholders.CountItemViewHolder;
import com.truizlop.sectionedrecyclerview.SectionedRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class CountSectionAdapter extends SectionedRecyclerViewAdapter<
        CountHeaderViewHolder,
        CountItemViewHolder,
        CountFooterViewHolder> {
    protected Context context=null;
    private List<Integer> group;
    private List<List<Integer>> childs;

    public CountSectionAdapter(Context context,List<Integer> group,List<List<Integer>> childs) {
        this.context = context;
        this.group=group;
        this.childs=childs;

    }

    @Override
    protected int getSectionCount() {
        return group.size();
    }

    @Override
    protected int getItemCountForSection(int section) {
        Log.i("CountForSection","-->"+section);
        return childs.get(section).size();
    }

    @Override
    protected boolean hasFooterInSection(int section) {
        return true;
    }

    protected LayoutInflater getLayoutInflater(){
        return LayoutInflater.from(context);
    }
    @Override
    protected CountHeaderViewHolder onCreateSectionHeaderViewHolder(ViewGroup parent, int viewType) {
        View view=getLayoutInflater().inflate(R.layout.view_count_header,parent,false);
        return new CountHeaderViewHolder(view);
    }

    @Override
    protected CountFooterViewHolder onCreateSectionFooterViewHolder(ViewGroup parent, int viewType) {
        View view=getLayoutInflater().inflate(R.layout.view_count_footer,parent,false);
        return new CountFooterViewHolder(view);
    }

    @Override
    protected CountItemViewHolder onCreateItemViewHolder(ViewGroup parent, int viewType) {
        View view=getLayoutInflater().inflate(R.layout.view_count_item,parent,false);
        return new CountItemViewHolder(view);
    }

    @Override
    protected void onBindSectionHeaderViewHolder(CountHeaderViewHolder holder, int section) {
        holder.render("Header "+(section+1));
    }

    @Override
    protected void onBindSectionFooterViewHolder(CountFooterViewHolder holder, int section) {
        holder.render("Footer"+(section+1));
    }

    protected int[] colors = new int[]{0xfff44336, 0xff2196f3, 0xff009688, 0xff8bc34a, 0xffff9800,0xfff44336, 0xff2196f3, 0xff009688, 0xff8bc34a, 0xffff9800};
    @Override
    protected void onBindItemViewHolder(CountItemViewHolder holder, int section, int position) {
        int ss=childs.get(section).get(position);
        holder.render(String.valueOf(ss),colors[section]);

    }
}

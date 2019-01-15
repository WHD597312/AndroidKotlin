package com.peihou.kotlin.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.peihou.kotlin.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CountHeaderViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.title)
    TextView textView;

    public CountHeaderViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void render(String text){
        textView.setText(text);
    }
}

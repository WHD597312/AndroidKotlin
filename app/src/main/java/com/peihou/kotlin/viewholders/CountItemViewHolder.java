package com.peihou.kotlin.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.peihou.kotlin.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CountItemViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.title)
    TextView textView;
    @BindView(R.id.container)
    View containerView;

    public CountItemViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void render(String text, int color){
        textView.setText(text);
        containerView.setBackgroundColor(color);
    }
}

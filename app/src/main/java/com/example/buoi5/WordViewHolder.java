package com.example.buoi5;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class WordViewHolder extends RecyclerView.ViewHolder {

    public ImageView mImageView;
    public TextView mTitleView;
    public TextView mTextView;

    public WordViewHolder(View itemView) {
        super(itemView);
        mImageView = itemView.findViewById(R.id.item_image);
        mTitleView = itemView.findViewById(R.id.item_title);
        mTextView = itemView.findViewById(R.id.item_text);

    }

}

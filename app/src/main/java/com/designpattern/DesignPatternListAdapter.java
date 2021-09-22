/*
 * Copyright (C) 2017 Sony Mobile Communications Inc.
 * All rights, including trade secret rights, reserved.
 */
package com.designpattern;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * class of BlackListAdapter.
 */
public class DesignPatternListAdapter extends
        RecyclerView.Adapter<DesignPatternListAdapter.ViewHolder> {
    private static final String TAG = DesignPatternListAdapter.class.getSimpleName();

    public static class ViewHolder extends RecyclerView.ViewHolder {
        Button itembutton;

        public ViewHolder(View v) {
            super(v);
        }
    }

    private LayoutInflater mInflater;
    private int mResourceId;
    private List<PatternItem> mItems;

    /**
     * Constructor.
     *
     * @param context    Context.
     * @param resourceId Resource ID.
     * @param items      List of PatternItem.
     */
    public DesignPatternListAdapter(Context context, int resourceId, List<PatternItem> items) {
        mResourceId = resourceId;
        mItems = items;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (mItems == null || mItems.isEmpty()) {
            return null;
        }
        View convertView = mInflater.inflate(mResourceId, parent, false);
        ViewHolder holder = new ViewHolder(convertView);
        holder.itembutton = (Button) convertView.findViewById(R.id.button);
        convertView.setTag(holder);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if (mItems == null || mItems.isEmpty()) {
            return;
        }

        final PatternItem item = mItems.get(position);
        final String patternName = item.mPatternName;

        holder.itembutton.setText(patternName);
        holder.itembutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                item.startActivity();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }
}
package com.amin.lw_01_1;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ibm.icu.text.RuleBasedNumberFormat;

public class RecyclerViewHolder  extends RecyclerView.ViewHolder
{
    private LinearLayout    _linearLayout;
    private TextView        _itemText;

    public RecyclerViewHolder(@NonNull View itemView)
    {
        super(itemView);

        _linearLayout   = (LinearLayout) itemView.findViewById(R.id.layoutItemId);
        _itemText       = itemView.findViewById(R.id.tvTextId);
    }

    void bind(int listIndex)
    {
        _itemText.setText(App.RuleNumberFormat.format(listIndex + 1));
        _linearLayout.setBackgroundColor(App.Colors[listIndex % 2]);
    }
}

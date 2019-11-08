package com.example.customview29072019;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DefaultSolarItem extends RelativeLayout {
    private EditText edt;
    private TextView mTextCell;
    private String mValueCell;

    public DefaultSolarItem(Context context) {
        super(context);
        init(null);
    }

    public DefaultSolarItem(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public DefaultSolarItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void init(AttributeSet attributeSet) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View view = layoutInflater.inflate(R.layout.item_edit_default_solor_panel, null, false);
        mapview(view);
        loadAttrsView(attributeSet);
        setupView();
    }

    private void setupView() {
        mTextCell.setText(mValueCell);
    }

    private void loadAttrsView(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArray = getContext().obtainStyledAttributes(attributeSet, R.styleable.DefaultSolarItem);
        mValueCell = typedArray.getString(R.styleable.DefaultSolarItem_textValueCell);
        typedArray.recycle();
    }

    private void mapview(View view) {
        edt = view.findViewById(R.id.edittextDefaultSolar);
        mTextCell = view.findViewById(R.id.textviewDefault);
    }
}

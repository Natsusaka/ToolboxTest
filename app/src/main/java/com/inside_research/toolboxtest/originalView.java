package com.inside_research.toolboxtest;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by inside on 2016/11/08.
 */

public class originalView extends View {

    public originalView(Context context) {
        this(context, null);
    }

    public originalView(Context context, AttributeSet attrs) {
        //this(context, attrs, R.attr.originalViewStyle);
        this(context, attrs, 1);
    }

    public originalView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        // このへんで初期化処理

    }
}
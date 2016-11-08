package com.inside_research.toolboxtest;

import android.app.Application;
import android.support.v7.widget.Toolbar;

/**
 * Created by NTSK on 2016/11/08.
 */

public class ToolBoxTest extends Application {
    private Toolbar mToolbar;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public void setToolbar(Toolbar toolbar){
        mToolbar = toolbar;
    }

    public Toolbar getToolbar() {
        return mToolbar;
    }

}

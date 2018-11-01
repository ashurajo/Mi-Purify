package com.coderstory.Purify.activity;


import com.coderstory.Purify.fragment.AboutFragment;

import androidx.fragment.app.Fragment;

public class AboutActivity extends ToolbarActivity {


    @Override
    protected Fragment setFragment() {
        return new AboutFragment();
    }

    @Override
    protected String getToolbarTitle() {
        return "关于";
    }
}

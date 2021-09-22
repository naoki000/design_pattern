package com.designpattern;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

class PatternItem {
    final Context mContext;
    final String mPatternName;
    final Class mLaunchClass;

    PatternItem(Context context, Class launchClass) {
        mContext = context;
        mPatternName = launchClass.getSimpleName();
        mLaunchClass = launchClass;
    }

    void startActivity() {
        Intent intent = new Intent();
        intent.setClass(mContext, mLaunchClass);
        mContext.startActivity(intent);
    }
}

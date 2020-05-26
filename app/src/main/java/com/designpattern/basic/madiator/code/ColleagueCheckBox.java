package com.designpattern.basic.madiator.code;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;

public class ColleagueCheckBox
        extends androidx.appcompat.widget.AppCompatCheckBox
        implements Colleague, CompoundButton.OnCheckedChangeListener {
    static String TAG = ColleagueCheckBox.class.getSimpleName();

    private Mediator mMediator;

    public ColleagueCheckBox(Context context) {
        super(context);
    }

    public ColleagueCheckBox(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ColleagueCheckBox(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ColleagueCheckBox(Context context, String name, boolean enable) {
        super(context);
    }

    @Override
    public void setMediator(Mediator mediator) {
        mMediator = mediator;
    }

    @Override
    public void setColleagueEnable(boolean b) {
        setEnabled(b);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        mMediator.colleagueChanged();
    }
}
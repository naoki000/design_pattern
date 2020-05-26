package com.designpattern.basic.madiator.code;

import android.content.Context;
import android.util.AttributeSet;

public class ColleagueButton
        extends androidx.appcompat.widget.AppCompatButton
        implements Colleague {
    static String TAG = ColleagueButton.class.getSimpleName();

    private Mediator mMediator;

    public ColleagueButton(Context context) {
        super(context);
    }

    public ColleagueButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ColleagueButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setMediator(Mediator mediator) {
        mMediator = mediator;
    }

    @Override
    public void setColleagueEnable(boolean b) {
        setEnabled(b);
    }
}
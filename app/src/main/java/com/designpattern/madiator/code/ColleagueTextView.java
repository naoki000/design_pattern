package com.designpattern.madiator.code;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.TextView;

public class ColleagueTextView extends androidx.appcompat.widget.AppCompatTextView implements Colleague, TextView.OnEditorActionListener {
    static String TAG = ColleagueTextView.class.getSimpleName();

    private Mediator mMediator;

    public ColleagueTextView(Context context) {
        super(context);
    }

    public ColleagueTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ColleagueTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setMediator(Mediator mediator) {
        mMediator = mediator;
    }

    @Override
    public void setColleagueEnable(boolean b) {
        setEnabled(b);
        setBackgroundColor(b ? Color.WHITE : Color.LTGRAY);
    }

    @Override
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        mMediator.colleagueChanged();
        return false;
    }
}
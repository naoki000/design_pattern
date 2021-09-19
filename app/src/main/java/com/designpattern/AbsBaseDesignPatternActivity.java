package com.designpattern;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public abstract class AbsBaseDesignPatternActivity extends AppCompatActivity {

    private ArrayList<String> mSummaryDesc;
    private ArrayList<String> mMeritDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.design_pattern_base);
        setTitle(getClass().getSimpleName());
        mSummaryDesc = summaryDesc();
        mMeritDesc = meritDesc();
        setSummaryDesc();
        setMeritDesc();
        mMainCode = makeMainCode();
        startCode();
    }

    AbsMainCode mMainCode;

    protected abstract AbsMainCode makeMainCode();

    protected abstract ArrayList<String> summaryDesc();

    protected abstract ArrayList<String> meritDesc();

    protected void startCode() {
        mMainCode.main();
    }

    private void setSummaryDesc() {
        TextView textView = findViewById(R.id.description);
        textView.setText(getStrings(mSummaryDesc));
    }

    private void setMeritDesc() {
        TextView textView = findViewById(R.id.merit);
        textView.setText(getStrings(mMeritDesc));
    }

    protected String getStrings(ArrayList<String> strings) {
        String res = "";
        for (String str : strings) {
            res = res + "・" + str + "\n";
        }

        return res;
    }
}

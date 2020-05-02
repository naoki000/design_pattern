package com.designpattern;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public abstract class AbsBaseDesignPatternActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.design_pattern_base);
        setTitle(getClass().getSimpleName());
        serDescription();
        setMerit();
        mMainCode = makeMainCode();
        startCode();
    }

    AbsMainCode mMainCode;

    protected abstract AbsMainCode makeMainCode();

    protected abstract void serDescription();

    protected abstract void setMerit();

    protected void startCode() {
        mMainCode.main();
    }

    protected void description(ArrayList<String> description) {
        TextView textView = findViewById(R.id.description);
        textView.setText(getStrings(description));
    }

    protected void merit(ArrayList<String> description) {
        TextView textView = findViewById(R.id.merit);
        textView.setText(getStrings(description));
    }

    protected String getStrings(ArrayList<String> strings) {
        String res = "";
        for (String str: strings) {
            res = res + "・" + str + "\n";
        }

        return res;
    }
}

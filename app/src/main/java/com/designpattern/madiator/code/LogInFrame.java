package com.designpattern.madiator.code;

import android.content.Context;

public class LogInFrame implements Mediator {

    private Context mContext;

    LogInFrame(Context context) {
        mContext = context;
        createColleagues();
    }

    public void createColleagues() {
        //ここでViewを追加する
    }

    //何か変化があったらここに飛ぶ
    @Override
    public void colleagueChanged() {
        //条件によって各インスタンス（CollagueButton, CollaegueCheckBox, ColleagueTextView）のsetColleageEnable()の値をかえる
    }
}

package com.designpattern;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.designpattern.adapter.AdapterPatternActivity;
import com.designpattern.builder.BuilderPatternActivity;
import com.designpattern.factorymethod.FactoryMethodPatternActivity;
import com.designpattern.iterator.IteratorPatternActivity;
import com.designpattern.prototype.PrototypePatternActivity;
import com.designpattern.singleton.SingletonPatternActivity;
import com.designpattern.templatemethod.TemplateMethodPatternActivity;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

public class DesignPatternMainActivity extends AppCompatActivity implements View.OnClickListener {

    private Context mContext;
    private List<View> mDesignPatternList;

    private View mIteratorPattern;
    private View mAdapterPattern;
    private View mTemplateMethodPattern;
    private View mFactoryMethodPattern;
    private View mSingletonPattern;
    private View mPrototypePattern;
    private View mBuilderPattern;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getApplicationContext();
        setContentView(R.layout.activity_main);
        mDesignPatternList = new ArrayList<>();

        mIteratorPattern = makeInstance(R.id.iterator);
        mAdapterPattern = makeInstance(R.id.adapter);
        mTemplateMethodPattern = makeInstance(R.id.template_method);
        mFactoryMethodPattern = makeInstance(R.id.factory_method);
        mSingletonPattern = makeInstance(R.id.singleton);
        mPrototypePattern = makeInstance(R.id.prototype);
        mBuilderPattern = makeInstance(R.id.builder);

        setListener();
    }

    private View makeInstance(int id) {
        View view = findViewById(id);
        mDesignPatternList.add(view);
        return view;
    }

    private void setListener() {
        for(View view: mDesignPatternList) {
            view.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();

        switch (view.getId()) {
            case R.id.iterator:
                intent.setClass(mContext, IteratorPatternActivity.class);
                break;
            case R.id.adapter:
                intent.setClass(mContext, AdapterPatternActivity.class);
                break;
            case R.id.template_method:
                intent.setClass(mContext, TemplateMethodPatternActivity.class);
                break;
            case R.id.factory_method:
                intent.setClass(mContext, FactoryMethodPatternActivity.class);
                break;
            case R.id.singleton:
                intent.setClass(mContext, SingletonPatternActivity.class);
                break;
            case R.id.prototype:
                intent.setClass(mContext, PrototypePatternActivity.class);
                break;
            case R.id.builder:
                intent.setClass(mContext, BuilderPatternActivity.class);
                break;
            default:
                break;
        }
        startActivity(intent);
    }
}

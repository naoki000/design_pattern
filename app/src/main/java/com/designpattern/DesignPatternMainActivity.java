package com.designpattern;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.designpattern.abstractfactory.AbstractFactoryPatternActivity;
import com.designpattern.adapter.AdapterPatternActivity;
import com.designpattern.bridge.BridgePatternActivity;
import com.designpattern.builder.BuilderPatternActivity;
import com.designpattern.chainofresponsibility.ChainOfResponsibilityPatternActivity;
import com.designpattern.composite.CompositePatternActivity;
import com.designpattern.decorator.DecoratorPatternActivity;
import com.designpattern.facade.FacadePatternActivity;
import com.designpattern.factorymethod.FactoryMethodPatternActivity;
import com.designpattern.iterator.IteratorPatternActivity;
import com.designpattern.madiator.MediatorPatternActivity;
import com.designpattern.memento.MementoPatternActivity;
import com.designpattern.observer.ObserverPatternActivity;
import com.designpattern.prototype.PrototypePatternActivity;
import com.designpattern.singleton.SingletonPatternActivity;
import com.designpattern.state.StatePatternActivity;
import com.designpattern.strategy.StrategyPatternActivity;
import com.designpattern.templatemethod.TemplateMethodPatternActivity;
import com.designpattern.visitor.VisitorPatternActivity;

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
    private View mAbstractFactoryPattern;
    private View mBridgePattern;
    private View mStrategyPattern;
    private View mCompositePattern;
    private View mDecoratorPattern;
    private View mVisitorPattern;
    private View mChainOfResponsibilityPattern;
    private View mFacadePattern;
    private View mMediatorPattern;
    private View mObserverPattern;
    private View mMementoPattern;
    private View mStatePattern;

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
        mAbstractFactoryPattern = makeInstance(R.id.abstract_factory);
        mBridgePattern = makeInstance(R.id.bridge);
        mStrategyPattern = makeInstance(R.id.strategy);
        mCompositePattern = makeInstance(R.id.composite);
        mDecoratorPattern = makeInstance(R.id.decorator);
        mVisitorPattern = makeInstance(R.id.visitor);
        mChainOfResponsibilityPattern = makeInstance(R.id.chain_of_responsibility);
        mFacadePattern = makeInstance(R.id.facade);
        mMediatorPattern = makeInstance(R.id.mediator);
        mObserverPattern = makeInstance(R.id.observer);
        mMementoPattern = makeInstance(R.id.memento);
        mStatePattern = makeInstance(R.id.state);

        setListener();
    }

    private View makeInstance(int id) {
        View view = findViewById(id);
        mDesignPatternList.add(view);
        return view;
    }

    private void setListener() {
        for (View view : mDesignPatternList) {
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
            case R.id.abstract_factory:
                intent.setClass(mContext, AbstractFactoryPatternActivity.class);
                break;
            case R.id.bridge:
                intent.setClass(mContext, BridgePatternActivity.class);
                break;
            case R.id.strategy:
                intent.setClass(mContext, StrategyPatternActivity.class);
                break;
            case R.id.composite:
                intent.setClass(mContext, CompositePatternActivity.class);
                break;
            case R.id.decorator:
                intent.setClass(mContext, DecoratorPatternActivity.class);
                break;
            case R.id.visitor:
                intent.setClass(mContext, VisitorPatternActivity.class);
                break;
            case R.id.chain_of_responsibility:
                intent.setClass(mContext, ChainOfResponsibilityPatternActivity.class);
                break;
            case R.id.facade:
                intent.setClass(mContext, FacadePatternActivity.class);
                break;
            case R.id.mediator:
                intent.setClass(mContext, MediatorPatternActivity.class);
                break;
            case R.id.observer:
                intent.setClass(mContext, ObserverPatternActivity.class);
                break;
            case R.id.memento:
                intent.setClass(mContext, MementoPatternActivity.class);
                break;
            case R.id.state:
                intent.setClass(mContext, StatePatternActivity.class);
                break;
            default:
                break;
        }
        startActivity(intent);
    }
}
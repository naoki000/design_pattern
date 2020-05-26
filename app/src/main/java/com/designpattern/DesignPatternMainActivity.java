package com.designpattern;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.designpattern.R;
import com.designpattern.basic.abstractfactory.AbstractFactoryPatternActivity;
import com.designpattern.basic.adapter.AdapterPatternActivity;
import com.designpattern.basic.bridge.BridgePatternActivity;
import com.designpattern.basic.builder.BuilderPatternActivity;
import com.designpattern.basic.chainofresponsibility.ChainOfResponsibilityPatternActivity;
import com.designpattern.basic.command.CommandPatternActivity;
import com.designpattern.basic.composite.CompositePatternActivity;
import com.designpattern.basic.decorator.DecoratorPatternActivity;
import com.designpattern.basic.facade.FacadePatternActivity;
import com.designpattern.basic.factorymethod.FactoryMethodPatternActivity;
import com.designpattern.basic.flyweight.FlyweightPatternActivity;
import com.designpattern.basic.interpreter.InterpreterPatternActivity;
import com.designpattern.basic.iterator.IteratorPatternActivity;
import com.designpattern.basic.madiator.MediatorPatternActivity;
import com.designpattern.basic.memento.MementoPatternActivity;
import com.designpattern.basic.observer.ObserverPatternActivity;
import com.designpattern.basic.prototype.PrototypePatternActivity;
import com.designpattern.basic.proxy.ProxyPatternActivity;
import com.designpattern.basic.singleton.SingletonPatternActivity;
import com.designpattern.basic.state.StatePatternActivity;
import com.designpattern.basic.strategy.StrategyPatternActivity;
import com.designpattern.basic.templatemethod.TemplateMethodPatternActivity;
import com.designpattern.basic.visitor.VisitorPatternActivity;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

public class DesignPatternMainActivity extends AppCompatActivity implements View.OnClickListener {

    private Context mContext;
    private List<View> mDesignPatternList;

    /*Basic Design Pattern*/
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
    private View mFlyWeightPattern;
    private View mProxyPattern;
    private View mCommandPattern;
    private View mInterpreterPattern;

    /*Multi Thread Design Pattern*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getApplicationContext();
        setContentView(R.layout.activity_main);
        mDesignPatternList = new ArrayList<>();

        setBasicDesignPattern();
        setMultiThreadDesignPattern();


        setListener();
    }

    private void setBasicDesignPattern() {
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
        mFlyWeightPattern = makeInstance(R.id.flyweight);
        mProxyPattern = makeInstance(R.id.proxy);
        mCommandPattern = makeInstance(R.id.command);
        mInterpreterPattern = makeInstance(R.id.interpreter);
    }

    private View makeInstance(int id) {
        View view = findViewById(id);
        mDesignPatternList.add(view);
        return view;
    }

    private void setMultiThreadDesignPattern() {
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
            /*Basic Design Pattern*/
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
            case R.id.flyweight:
                intent.setClass(mContext, FlyweightPatternActivity.class);
                break;
            case R.id.proxy:
                intent.setClass(mContext, ProxyPatternActivity.class);
                break;
            case R.id.command:
                intent.setClass(mContext, CommandPatternActivity.class);
                break;
            case R.id.interpreter:
                intent.setClass(mContext, InterpreterPatternActivity.class);
                break;
            /*Multi Thread Design Pattern*/

            default:
                break;
        }
        startActivity(intent);
    }
}

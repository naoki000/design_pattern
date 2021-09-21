package com.designpattern;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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
import com.designpattern.multithread.immutable.ImmutablePatternActivity;
import com.designpattern.multithread.singlethread.SingleThreadExecutionPatternActivity;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

public class DesignPatternMainActivity extends AppCompatActivity implements View.OnClickListener {

    private Context mContext;
    private List<ActivityItem> mDesignPatternItemList;

    /*Basic Design Pattern*/
    private ActivityItem mIteratorPattern;
    private ActivityItem mAdapterPattern;
    private ActivityItem mTemplateMethodPattern;
    private ActivityItem mFactoryMethodPattern;
    private ActivityItem mSingletonPattern;
    private ActivityItem mPrototypePattern;
    private ActivityItem mBuilderPattern;
    private ActivityItem mAbstractFactoryPattern;
    private ActivityItem mBridgePattern;
    private ActivityItem mStrategyPattern;
    private ActivityItem mCompositePattern;
    private ActivityItem mDecoratorPattern;
    private ActivityItem mVisitorPattern;
    private ActivityItem mChainOfResponsibilityPattern;
    private ActivityItem mFacadePattern;
    private ActivityItem mMediatorPattern;
    private ActivityItem mObserverPattern;
    private ActivityItem mMementoPattern;
    private ActivityItem mStatePattern;
    private ActivityItem mFlyWeightPattern;
    private ActivityItem mProxyPattern;
    private ActivityItem mCommandPattern;
    private ActivityItem mInterpreterPattern;

    // multi thread
    private ActivityItem mSingleThreadExecutionPattern;
    private ActivityItem mImmutablePattern;
    private ActivityItem mBeforeAfterPattern;

    /*Multi Thread Design Pattern*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getApplicationContext();
        setContentView(R.layout.activity_main);
        mDesignPatternItemList = new ArrayList<>();

        setBasicDesignPattern();
        setMultiThreadDesignPattern();


        setListener();
    }

    private void setBasicDesignPattern() {
        mIteratorPattern = makeInstance(R.id.iterator, IteratorPatternActivity.class);
        mAdapterPattern = makeInstance(R.id.adapter, AdapterPatternActivity.class);
        mTemplateMethodPattern = makeInstance(R.id.template_method,
                TemplateMethodPatternActivity.class);
        mFactoryMethodPattern = makeInstance(R.id.factory_method, FactoryMethodPatternActivity.class);
        mSingletonPattern = makeInstance(R.id.singleton, SingletonPatternActivity.class);
        mPrototypePattern = makeInstance(R.id.prototype, PrototypePatternActivity.class);
        mBuilderPattern = makeInstance(R.id.builder, BuilderPatternActivity.class);
        mAbstractFactoryPattern = makeInstance(R.id.abstract_factory,
                AbstractFactoryPatternActivity.class);
        mBridgePattern = makeInstance(R.id.bridge, BridgePatternActivity.class);
        mStrategyPattern = makeInstance(R.id.strategy, StrategyPatternActivity.class);
        mCompositePattern = makeInstance(R.id.composite, CompositePatternActivity.class);
        mDecoratorPattern = makeInstance(R.id.decorator, DecoratorPatternActivity.class);
        mVisitorPattern = makeInstance(R.id.visitor, VisitorPatternActivity.class);
        mChainOfResponsibilityPattern = makeInstance(R.id.chain_of_responsibility,
                ChainOfResponsibilityPatternActivity.class);
        mFacadePattern = makeInstance(R.id.facade, FacadePatternActivity.class);
        mMediatorPattern = makeInstance(R.id.mediator, MediatorPatternActivity.class);
        mObserverPattern = makeInstance(R.id.observer, ObserverPatternActivity.class);
        mMementoPattern = makeInstance(R.id.memento, MementoPatternActivity.class);
        mStatePattern = makeInstance(R.id.state, StatePatternActivity.class);
        mFlyWeightPattern = makeInstance(R.id.flyweight, FlyweightPatternActivity.class);
        mProxyPattern = makeInstance(R.id.proxy, ProxyPatternActivity.class);
        mCommandPattern = makeInstance(R.id.command, CommandPatternActivity.class);
        mInterpreterPattern = makeInstance(R.id.interpreter, InterpreterPatternActivity.class);
    }

    private void setMultiThreadDesignPattern() {
        /*Multi Thread Design Pattern*/
        mSingleThreadExecutionPattern = makeInstance(R.id.SingleThreadExecutionPattern,
                SingleThreadExecutionPatternActivity.class);
        mImmutablePattern = makeInstance(R.id.ImmutablePattern, ImmutablePatternActivity.class);
    }

    private ActivityItem makeInstance(int id, Class launchClass) {
        ActivityItem activityItem = new ActivityItem(id, launchClass);
        mDesignPatternItemList.add(activityItem);
        return activityItem;
    }

    private void setListener() {
        for (ActivityItem activityItem : mDesignPatternItemList) {
            activityItem.mView.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        for (ActivityItem activityItem : mDesignPatternItemList) {
            if (view.getId() == activityItem.mId) {
                intent.setClass(mContext, activityItem.mLaunchClass);
            }
        }
        startActivity(intent);
    }

    private class ActivityItem {
        private final View mView;
        private final int mId;
        private final Class mLaunchClass;

        ActivityItem(int id, Class launchClass) {
            mId = id;
            mView = makeViewInstance(id);
            mLaunchClass = launchClass;
        }

        private View makeViewInstance(int id) {
            View view = findViewById(id);
            return view;
        }
    }
}

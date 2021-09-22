package com.designpattern;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.designpattern.basic.abstractfactory.AbstractFactoryPattern;
import com.designpattern.basic.adapter.AdapterPattern;
import com.designpattern.basic.bridge.BridgePattern;
import com.designpattern.basic.builder.BuilderPattern;
import com.designpattern.basic.chainofresponsibility.ChainOfResponsibilityPattern;
import com.designpattern.basic.command.CommandPattern;
import com.designpattern.basic.composite.CompositePattern;
import com.designpattern.basic.decorator.DecoratorPattern;
import com.designpattern.basic.facade.FacadePattern;
import com.designpattern.basic.factorymethod.FactoryMethodPattern;
import com.designpattern.basic.flyweight.FlyweightPattern;
import com.designpattern.basic.interpreter.InterpreterPattern;
import com.designpattern.basic.iterator.IteratorPattern;
import com.designpattern.basic.madiator.MediatorPattern;
import com.designpattern.basic.memento.MementoPattern;
import com.designpattern.basic.observer.ObserverPattern;
import com.designpattern.basic.prototype.PrototypePattern;
import com.designpattern.basic.proxy.ProxyPattern;
import com.designpattern.basic.singleton.SingletonPattern;
import com.designpattern.basic.state.StatePattern;
import com.designpattern.basic.strategy.StrategyPattern;
import com.designpattern.basic.templatemethod.TemplateMethodPattern;
import com.designpattern.basic.visitor.VisitorPattern;
import com.designpattern.multithread.activeobject.ActiveObjectPattern;
import com.designpattern.multithread.balking.BalkingPattern;
import com.designpattern.multithread.future.FuturePattern;
import com.designpattern.multithread.guardedsuspension.GuardedSuspensionPattern;
import com.designpattern.multithread.immutable.ImmutablePattern;
import com.designpattern.multithread.producerconsumer.ProducerConsumerPattern;
import com.designpattern.multithread.readwritelock.ReadWriteLockPattern;
import com.designpattern.multithread.singlethread.SingleThreadExecutionPattern;
import com.designpattern.multithread.threadpermessage.ThreadPerMessagePattern;
import com.designpattern.multithread.threadspecificstorage.ThreadSpecificStoragePattern;
import com.designpattern.multithread.twophrasetermination.TwoPhaseTerminationPattern;
import com.designpattern.multithread.workerthread.WorkerThreadPattern;

import java.util.ArrayList;
import java.util.List;

public class DesignPatternMainActivity extends AppCompatActivity {

    private Context mContext;
    private RecyclerView mRecyclerView;
    private List<PatternItem> mDesignPatternItemList;

    /*Basic Design Pattern*/
    private PatternItem mIteratorPattern;
    private PatternItem mAdapterPattern;
    private PatternItem mTemplateMethodPattern;
    private PatternItem mFactoryMethodPattern;
    private PatternItem mSingletonPattern;
    private PatternItem mPrototypePattern;
    private PatternItem mBuilderPattern;
    private PatternItem mAbstractFactoryPattern;
    private PatternItem mBridgePattern;
    private PatternItem mStrategyPattern;
    private PatternItem mCompositePattern;
    private PatternItem mDecoratorPattern;
    private PatternItem mVisitorPattern;
    private PatternItem mChainOfResponsibilityPattern;
    private PatternItem mFacadePattern;
    private PatternItem mMediatorPattern;
    private PatternItem mObserverPattern;
    private PatternItem mMementoPattern;
    private PatternItem mStatePattern;
    private PatternItem mFlyWeightPattern;
    private PatternItem mProxyPattern;
    private PatternItem mCommandPattern;
    private PatternItem mInterpreterPattern;

    // multi thread
    private PatternItem mSingleThreadExecutionPattern;
    private PatternItem mImmutablePattern;
    private PatternItem mGuardedSuspensionPattern;
    private PatternItem mBalkingPattern;
    private PatternItem mProducerConsumerPattern;
    private PatternItem mReadWriteLockPattern;
    private PatternItem mThreadPerMessagePatternPattern;
    private PatternItem mWorkerThreadPattern;
    private PatternItem mFuturePattern;
    private PatternItem mTwoPhaseTerminationPattern;
    private PatternItem mThreadSpecificStoragePattern;
    private PatternItem mActiveObjectPattern;
    private PatternItem mBeforeAfterPattern;

    /*Multi Thread Design Pattern*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getApplicationContext();
        setContentView(R.layout.activity_main);
        mDesignPatternItemList = new ArrayList<>();
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        setBasicDesignPattern();
        setMultiThreadDesignPattern();
        setRecyclerViewList();
    }

    private void setBasicDesignPattern() {
        mIteratorPattern = makeInstance(IteratorPattern.class);
        mAdapterPattern = makeInstance(AdapterPattern.class);
        mTemplateMethodPattern = makeInstance(TemplateMethodPattern.class);
        mFactoryMethodPattern = makeInstance(FactoryMethodPattern.class);
        mSingletonPattern = makeInstance(SingletonPattern.class);
        mPrototypePattern = makeInstance(PrototypePattern.class);
        mBuilderPattern = makeInstance(BuilderPattern.class);
        mAbstractFactoryPattern = makeInstance(AbstractFactoryPattern.class);
        mBridgePattern = makeInstance(BridgePattern.class);
        mStrategyPattern = makeInstance(StrategyPattern.class);
        mCompositePattern = makeInstance(CompositePattern.class);
        mDecoratorPattern = makeInstance(DecoratorPattern.class);
        mVisitorPattern = makeInstance(VisitorPattern.class);
        mChainOfResponsibilityPattern = makeInstance(ChainOfResponsibilityPattern.class);
        mFacadePattern = makeInstance(FacadePattern.class);
        mMediatorPattern = makeInstance(MediatorPattern.class);
        mObserverPattern = makeInstance(ObserverPattern.class);
        mMementoPattern = makeInstance(MementoPattern.class);
        mStatePattern = makeInstance(StatePattern.class);
        mFlyWeightPattern = makeInstance(FlyweightPattern.class);
        mProxyPattern = makeInstance(ProxyPattern.class);
        mCommandPattern = makeInstance(CommandPattern.class);
        mInterpreterPattern = makeInstance(InterpreterPattern.class);
    }

    private void setMultiThreadDesignPattern() {
        /*Multi Thread Design Pattern*/
        mSingleThreadExecutionPattern = makeInstance(SingleThreadExecutionPattern.class);
        mImmutablePattern = makeInstance(ImmutablePattern.class);
        mGuardedSuspensionPattern = makeInstance(GuardedSuspensionPattern.class);
        mBalkingPattern = makeInstance(BalkingPattern.class);
        mProducerConsumerPattern = makeInstance(ProducerConsumerPattern.class);
        mReadWriteLockPattern = makeInstance(ReadWriteLockPattern.class);
        mThreadPerMessagePatternPattern = makeInstance(ThreadPerMessagePattern.class);
        mWorkerThreadPattern = makeInstance(WorkerThreadPattern.class);
        mFuturePattern = makeInstance(FuturePattern.class);
        mTwoPhaseTerminationPattern = makeInstance(TwoPhaseTerminationPattern.class);
        mThreadSpecificStoragePattern = makeInstance(ThreadSpecificStoragePattern.class);
        mActiveObjectPattern = makeInstance(ActiveObjectPattern.class);
    }

    private PatternItem makeInstance(Class launchClass) {
        PatternItem patternItem = new PatternItem(this, launchClass);
        mDesignPatternItemList.add(patternItem);
        return patternItem;
    }

    private void setRecyclerViewList() {
        final DesignPatternListAdapter adapter =
                new DesignPatternListAdapter(this,
                        R.layout.desing_pattern_item, mDesignPatternItemList);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(adapter);
    }
}

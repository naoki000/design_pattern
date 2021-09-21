package com.designpattern.multithread.guardedsuspension.code;

import java.util.Queue;
        import java.util.LinkedList;

public class RequestQueue {
    // non thread safe
    // この仕組みはLiknedBlockingQueue(スレッドセーフなキュー)で提供される
    private final Queue<Request> queue = new LinkedList<Request>();
    // synchronized -> queueを守っている
    public synchronized Request getRequest() {
        //ガード条件 queue.peek() != null
        while (queue.peek() == null) {
            try {
                //ガード条件が満たされていないときはwait(notifyされるのを待つ)
                wait();
            } catch (InterruptedException e) {
            }
        }
        return queue.remove();
    }

    public synchronized void putRequest(Request request) {
        queue.offer(request);
        notifyAll();
    }
    //import java.util.concurrent.BlockingQueue;
//import java.util.concurrent.LinkedBlockingQueue;
//
//    private final BlockingQueue<Request> queue = new LinkedBlockingQueue<Request>();
//    public Request getRequest() {
//        Request req = null;
//        try {
//            req = queue.take();
//        } catch (InterruptedException e) {
//        }
//        return req;
//    }
//    public void putRequest(Request request) {
//        try {
//            queue.put(request);
//        } catch (InterruptedException e) {
//        }
//    }

}

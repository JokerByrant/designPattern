package com.sxh.newfolder.DP17_责任链模式.demo2.handler;

/**
 * 抽象责任链
 * @author sxh
 * @date 2020/1/20
 */
public abstract class AbstractHandler <TData, TFilter> {
    // 任务链传递的数据
    private TData tData;

    // 当前任务的下一个任务链，即当前任务完成后，交给他下面的任务继续执行，知道nextHandler为null
    private AbstractHandler<TData, TFilter> nextHandler = null;

    public TData gettData() {
        return tData;
    }

    public void settData(TData tData) {
        this.tData = tData;
    }

    public AbstractHandler<TData, TFilter> getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(AbstractHandler<TData, TFilter> nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract TData filter(TFilter filter);


    public static <TFilter> Object process(AbstractHandler handler, TFilter filter) {
        AbstractHandler nextHandler =  handler;
        Object data = handler.gettData();
        while (nextHandler != null) {
            nextHandler.settData(data);
            data = nextHandler.filter(filter);
            nextHandler = nextHandler.getNextHandler();
        }

        return data;
    }
}

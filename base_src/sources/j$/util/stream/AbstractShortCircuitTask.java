package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractShortCircuitTask extends AbstractTask {
    protected volatile boolean canceled;
    protected final AtomicReference sharedResult;

    protected AbstractShortCircuitTask(AbstractShortCircuitTask abstractShortCircuitTask, Spliterator spliterator) {
        super(abstractShortCircuitTask, spliterator);
        this.sharedResult = abstractShortCircuitTask.sharedResult;
    }

    protected AbstractShortCircuitTask(PipelineHelper pipelineHelper, Spliterator spliterator) {
        super(pipelineHelper, spliterator);
        this.sharedResult = new AtomicReference(null);
    }

    protected void cancel() {
        this.canceled = true;
    }

    protected void cancelLaterNodes() {
        AbstractShortCircuitTask abstractShortCircuitTask = this;
        for (AbstractShortCircuitTask abstractShortCircuitTask2 = (AbstractShortCircuitTask) getParent(); abstractShortCircuitTask2 != null; abstractShortCircuitTask2 = (AbstractShortCircuitTask) abstractShortCircuitTask2.getParent()) {
            if (abstractShortCircuitTask2.leftChild == abstractShortCircuitTask) {
                AbstractShortCircuitTask abstractShortCircuitTask3 = (AbstractShortCircuitTask) abstractShortCircuitTask2.rightChild;
                if (!abstractShortCircuitTask3.canceled) {
                    abstractShortCircuitTask3.cancel();
                }
            }
            abstractShortCircuitTask = abstractShortCircuitTask2;
        }
    }

    @Override // j$.util.stream.AbstractTask, java.util.concurrent.CountedCompleter
    public void compute() {
        Object emptyResult;
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.spliterator;
        long jEstimateSize = spliterator.estimateSize();
        long targetSize = getTargetSize(jEstimateSize);
        AtomicReference atomicReference = this.sharedResult;
        boolean z = false;
        AbstractShortCircuitTask abstractShortCircuitTask = this;
        while (true) {
            emptyResult = atomicReference.get();
            if (emptyResult != null) {
                break;
            }
            if (abstractShortCircuitTask.taskCanceled()) {
                emptyResult = abstractShortCircuitTask.getEmptyResult();
                break;
            }
            if (jEstimateSize <= targetSize || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                emptyResult = abstractShortCircuitTask.doLeaf();
                break;
            }
            AbstractShortCircuitTask abstractShortCircuitTask2 = (AbstractShortCircuitTask) abstractShortCircuitTask.makeChild(spliteratorTrySplit);
            abstractShortCircuitTask.leftChild = abstractShortCircuitTask2;
            AbstractShortCircuitTask abstractShortCircuitTask3 = (AbstractShortCircuitTask) abstractShortCircuitTask.makeChild(spliterator);
            abstractShortCircuitTask.rightChild = abstractShortCircuitTask3;
            abstractShortCircuitTask.setPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
                abstractShortCircuitTask = abstractShortCircuitTask2;
                abstractShortCircuitTask2 = abstractShortCircuitTask3;
            } else {
                abstractShortCircuitTask = abstractShortCircuitTask3;
            }
            z = !z;
            abstractShortCircuitTask2.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        abstractShortCircuitTask.setLocalResult(emptyResult);
        abstractShortCircuitTask.tryComplete();
    }

    protected abstract Object getEmptyResult();

    @Override // j$.util.stream.AbstractTask
    public Object getLocalResult() {
        if (!isRoot()) {
            return super.getLocalResult();
        }
        Object obj = this.sharedResult.get();
        return obj == null ? getEmptyResult() : obj;
    }

    @Override // j$.util.stream.AbstractTask, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return getLocalResult();
    }

    @Override // j$.util.stream.AbstractTask
    protected void setLocalResult(Object obj) {
        if (!isRoot()) {
            super.setLocalResult(obj);
        } else if (obj != null) {
            this.sharedResult.compareAndSet(null, obj);
        }
    }

    protected void shortCircuit(Object obj) {
        if (obj != null) {
            this.sharedResult.compareAndSet(null, obj);
        }
    }

    protected boolean taskCanceled() {
        boolean z = this.canceled;
        if (!z) {
            AbstractTask parent = getParent();
            while (true) {
                AbstractShortCircuitTask abstractShortCircuitTask = (AbstractShortCircuitTask) parent;
                if (z || abstractShortCircuitTask == null) {
                    break;
                }
                z = abstractShortCircuitTask.canceled;
                parent = abstractShortCircuitTask.getParent();
            }
        }
        return z;
    }
}

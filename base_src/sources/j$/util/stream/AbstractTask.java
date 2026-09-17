package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractTask extends CountedCompleter {
    private static final int LEAF_TARGET = ForkJoinPool.getCommonPoolParallelism() << 2;
    protected final PipelineHelper helper;
    protected AbstractTask leftChild;
    private Object localResult;
    protected AbstractTask rightChild;
    protected Spliterator spliterator;
    protected long targetSize;

    protected AbstractTask(AbstractTask abstractTask, Spliterator spliterator) {
        super(abstractTask);
        this.spliterator = spliterator;
        this.helper = abstractTask.helper;
        this.targetSize = abstractTask.targetSize;
    }

    protected AbstractTask(PipelineHelper pipelineHelper, Spliterator spliterator) {
        super(null);
        this.helper = pipelineHelper;
        this.spliterator = spliterator;
        this.targetSize = 0L;
    }

    public static int getLeafTarget() {
        return LEAF_TARGET;
    }

    public static long suggestTargetSize(long j) {
        long leafTarget = j / ((long) getLeafTarget());
        if (leafTarget > 0) {
            return leafTarget;
        }
        return 1L;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.spliterator;
        long jEstimateSize = spliterator.estimateSize();
        long targetSize = getTargetSize(jEstimateSize);
        boolean z = false;
        AbstractTask abstractTask = this;
        while (jEstimateSize > targetSize && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            AbstractTask abstractTaskMakeChild = abstractTask.makeChild(spliteratorTrySplit);
            abstractTask.leftChild = abstractTaskMakeChild;
            AbstractTask abstractTaskMakeChild2 = abstractTask.makeChild(spliterator);
            abstractTask.rightChild = abstractTaskMakeChild2;
            abstractTask.setPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
                abstractTask = abstractTaskMakeChild;
                abstractTaskMakeChild = abstractTaskMakeChild2;
            } else {
                abstractTask = abstractTaskMakeChild2;
            }
            z = !z;
            abstractTaskMakeChild.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        abstractTask.setLocalResult(abstractTask.doLeaf());
        abstractTask.tryComplete();
    }

    protected abstract Object doLeaf();

    protected Object getLocalResult() {
        return this.localResult;
    }

    protected AbstractTask getParent() {
        return (AbstractTask) getCompleter();
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.localResult;
    }

    protected final long getTargetSize(long j) {
        long j2 = this.targetSize;
        if (j2 != 0) {
            return j2;
        }
        long jSuggestTargetSize = suggestTargetSize(j);
        this.targetSize = jSuggestTargetSize;
        return jSuggestTargetSize;
    }

    protected boolean isLeaf() {
        return this.leftChild == null;
    }

    protected boolean isLeftmostNode() {
        AbstractTask abstractTask = this;
        while (abstractTask != null) {
            AbstractTask parent = abstractTask.getParent();
            if (parent != null && parent.leftChild != abstractTask) {
                return false;
            }
            abstractTask = parent;
        }
        return true;
    }

    protected boolean isRoot() {
        return getParent() == null;
    }

    protected abstract AbstractTask makeChild(Spliterator spliterator);

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.spliterator = null;
        this.rightChild = null;
        this.leftChild = null;
    }

    protected void setLocalResult(Object obj) {
        this.localResult = obj;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    protected void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }
}

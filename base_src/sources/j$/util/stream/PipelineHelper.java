package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
abstract class PipelineHelper {
    PipelineHelper() {
    }

    abstract void copyInto(Sink sink, Spliterator spliterator);

    abstract boolean copyIntoWithCancel(Sink sink, Spliterator spliterator);

    abstract Node evaluate(Spliterator spliterator, boolean z, IntFunction intFunction);

    abstract long exactOutputSizeIfKnown(Spliterator spliterator);

    abstract StreamShape getSourceShape();

    abstract int getStreamAndOpFlags();

    abstract Node.Builder makeNodeBuilder(long j, IntFunction intFunction);

    abstract Sink wrapAndCopyInto(Sink sink, Spliterator spliterator);

    abstract Sink wrapSink(Sink sink);

    abstract Spliterator wrapSpliterator(Spliterator spliterator);
}

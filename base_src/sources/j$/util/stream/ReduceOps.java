package j$.util.stream;

import j$.util.OptionalLong;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.BinaryOperator;
import j$.util.function.Consumer;
import j$.util.function.LongBinaryOperator;
import j$.util.function.Supplier;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: loaded from: classes2.dex */
abstract class ReduceOps {

    /* JADX INFO: renamed from: j$.util.stream.ReduceOps$3ReducingSink, reason: invalid class name */
    class C3ReducingSink extends Box implements AccumulatingSink {
        final /* synthetic */ BiConsumer val$accumulator;
        final /* synthetic */ BinaryOperator val$combiner;
        final /* synthetic */ Supplier val$supplier;

        C3ReducingSink(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator) {
            this.val$supplier = supplier;
            this.val$accumulator = biConsumer;
            this.val$combiner = binaryOperator;
        }

        @Override // j$.util.stream.Sink
        public /* synthetic */ void accept(long j) {
            Sink.CC.$default$accept(this, j);
        }

        @Override // j$.util.function.Consumer
        public void accept(Object obj) {
            this.val$accumulator.accept(this.state, obj);
        }

        @Override // j$.util.function.Consumer
        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return Consumer.CC.$default$andThen(this, consumer);
        }

        @Override // j$.util.stream.Sink
        public void begin(long j) {
            this.state = this.val$supplier.get();
        }

        @Override // j$.util.stream.Sink
        public /* synthetic */ boolean cancellationRequested() {
            return Sink.CC.$default$cancellationRequested(this);
        }

        @Override // j$.util.stream.ReduceOps.AccumulatingSink
        public void combine(C3ReducingSink c3ReducingSink) {
            this.state = this.val$combiner.apply(this.state, c3ReducingSink.state);
        }

        @Override // j$.util.stream.Sink
        public /* synthetic */ void end() {
            Sink.CC.$default$end(this);
        }
    }

    /* JADX INFO: renamed from: j$.util.stream.ReduceOps$9ReducingSink, reason: invalid class name */
    class C9ReducingSink implements AccumulatingSink, Sink.OfLong {
        private boolean empty;
        private long state;
        final /* synthetic */ LongBinaryOperator val$operator;

        C9ReducingSink(LongBinaryOperator longBinaryOperator) {
            this.val$operator = longBinaryOperator;
        }

        @Override // j$.util.stream.Sink
        public void accept(long j) {
            if (!this.empty) {
                this.state = this.val$operator.applyAsLong(this.state, j);
            } else {
                this.empty = false;
                this.state = j;
            }
        }

        @Override // j$.util.stream.Sink.OfLong
        public /* synthetic */ void accept(Long l) {
            Sink.OfLong.CC.$default$accept((Sink.OfLong) this, l);
        }

        @Override // j$.util.function.Consumer
        public /* bridge */ /* synthetic */ void accept(Object obj) {
            accept((Long) obj);
        }

        @Override // j$.util.function.Consumer
        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return Consumer.CC.$default$andThen(this, consumer);
        }

        @Override // j$.util.stream.Sink
        public void begin(long j) {
            this.empty = true;
            this.state = 0L;
        }

        @Override // j$.util.stream.Sink
        public /* synthetic */ boolean cancellationRequested() {
            return Sink.CC.$default$cancellationRequested(this);
        }

        @Override // j$.util.stream.ReduceOps.AccumulatingSink
        public void combine(C9ReducingSink c9ReducingSink) {
            if (c9ReducingSink.empty) {
                return;
            }
            accept(c9ReducingSink.state);
        }

        @Override // j$.util.stream.Sink
        public /* synthetic */ void end() {
            Sink.CC.$default$end(this);
        }

        @Override // j$.util.function.Supplier
        public OptionalLong get() {
            return this.empty ? OptionalLong.empty() : OptionalLong.of(this.state);
        }
    }

    interface AccumulatingSink extends TerminalSink {
        void combine(AccumulatingSink accumulatingSink);
    }

    abstract class Box {
        Object state;

        Box() {
        }

        public Object get() {
            return this.state;
        }
    }

    abstract class CountingSink extends Box implements AccumulatingSink {
        long count;

        final class OfRef extends CountingSink {
            OfRef() {
            }

            @Override // j$.util.function.Consumer
            public void accept(Object obj) {
                this.count++;
            }
        }

        CountingSink() {
        }

        @Override // j$.util.stream.Sink
        public /* synthetic */ void accept(long j) {
            Sink.CC.$default$accept(this, j);
        }

        @Override // j$.util.function.Consumer
        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return Consumer.CC.$default$andThen(this, consumer);
        }

        @Override // j$.util.stream.Sink
        public void begin(long j) {
            this.count = 0L;
        }

        @Override // j$.util.stream.Sink
        public /* synthetic */ boolean cancellationRequested() {
            return Sink.CC.$default$cancellationRequested(this);
        }

        @Override // j$.util.stream.ReduceOps.AccumulatingSink
        public void combine(CountingSink countingSink) {
            this.count += countingSink.count;
        }

        @Override // j$.util.stream.Sink
        public /* synthetic */ void end() {
            Sink.CC.$default$end(this);
        }

        @Override // j$.util.stream.ReduceOps.Box, j$.util.function.Supplier
        public Long get() {
            return Long.valueOf(this.count);
        }
    }

    abstract class ReduceOp implements TerminalOp {
        private final StreamShape inputShape;

        ReduceOp(StreamShape streamShape) {
            this.inputShape = streamShape;
        }

        @Override // j$.util.stream.TerminalOp
        public Object evaluateParallel(PipelineHelper pipelineHelper, Spliterator spliterator) {
            return ((AccumulatingSink) new ReduceTask(this, pipelineHelper, spliterator).invoke()).get();
        }

        @Override // j$.util.stream.TerminalOp
        public Object evaluateSequential(PipelineHelper pipelineHelper, Spliterator spliterator) {
            return ((AccumulatingSink) pipelineHelper.wrapAndCopyInto(makeSink(), spliterator)).get();
        }

        @Override // j$.util.stream.TerminalOp
        public /* synthetic */ int getOpFlags() {
            return TerminalOp.CC.$default$getOpFlags(this);
        }

        public abstract AccumulatingSink makeSink();
    }

    final class ReduceTask extends AbstractTask {
        private final ReduceOp op;

        ReduceTask(ReduceOp reduceOp, PipelineHelper pipelineHelper, Spliterator spliterator) {
            super(pipelineHelper, spliterator);
            this.op = reduceOp;
        }

        ReduceTask(ReduceTask reduceTask, Spliterator spliterator) {
            super(reduceTask, spliterator);
            this.op = reduceTask.op;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.AbstractTask
        public AccumulatingSink doLeaf() {
            return (AccumulatingSink) this.helper.wrapAndCopyInto(this.op.makeSink(), this.spliterator);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.AbstractTask
        public ReduceTask makeChild(Spliterator spliterator) {
            return new ReduceTask(this, spliterator);
        }

        @Override // j$.util.stream.AbstractTask, java.util.concurrent.CountedCompleter
        public void onCompletion(CountedCompleter countedCompleter) {
            if (!isLeaf()) {
                AccumulatingSink accumulatingSink = (AccumulatingSink) ((ReduceTask) this.leftChild).getLocalResult();
                accumulatingSink.combine((AccumulatingSink) ((ReduceTask) this.rightChild).getLocalResult());
                setLocalResult(accumulatingSink);
            }
            super.onCompletion(countedCompleter);
        }
    }

    public static TerminalOp makeLong(final LongBinaryOperator longBinaryOperator) {
        longBinaryOperator.getClass();
        return new ReduceOp(StreamShape.LONG_VALUE) { // from class: j$.util.stream.ReduceOps.11
            @Override // j$.util.stream.ReduceOps.ReduceOp
            public C9ReducingSink makeSink() {
                return new C9ReducingSink(longBinaryOperator);
            }
        };
    }

    public static TerminalOp makeRef(final Collector collector) {
        collector.getClass();
        final Supplier supplier = collector.supplier();
        final BiConsumer biConsumerAccumulator = collector.accumulator();
        final BinaryOperator binaryOperatorCombiner = collector.combiner();
        return new ReduceOp(StreamShape.REFERENCE) { // from class: j$.util.stream.ReduceOps.3
            @Override // j$.util.stream.ReduceOps.ReduceOp, j$.util.stream.TerminalOp
            public int getOpFlags() {
                if (collector.characteristics().contains(Collector.Characteristics.UNORDERED)) {
                    return StreamOpFlag.NOT_ORDERED;
                }
                return 0;
            }

            @Override // j$.util.stream.ReduceOps.ReduceOp
            public C3ReducingSink makeSink() {
                return new C3ReducingSink(supplier, biConsumerAccumulator, binaryOperatorCombiner);
            }
        };
    }

    public static TerminalOp makeRefCounting() {
        return new ReduceOp(StreamShape.REFERENCE) { // from class: j$.util.stream.ReduceOps.5
            @Override // j$.util.stream.ReduceOps.ReduceOp, j$.util.stream.TerminalOp
            public Long evaluateParallel(PipelineHelper pipelineHelper, Spliterator spliterator) {
                return StreamOpFlag.SIZED.isKnown(pipelineHelper.getStreamAndOpFlags()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.evaluateParallel(pipelineHelper, spliterator);
            }

            @Override // j$.util.stream.ReduceOps.ReduceOp, j$.util.stream.TerminalOp
            public Long evaluateSequential(PipelineHelper pipelineHelper, Spliterator spliterator) {
                return StreamOpFlag.SIZED.isKnown(pipelineHelper.getStreamAndOpFlags()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.evaluateSequential(pipelineHelper, spliterator);
            }

            @Override // j$.util.stream.ReduceOps.ReduceOp, j$.util.stream.TerminalOp
            public int getOpFlags() {
                return StreamOpFlag.NOT_ORDERED;
            }

            @Override // j$.util.stream.ReduceOps.ReduceOp
            public CountingSink makeSink() {
                return new CountingSink.OfRef();
            }
        };
    }
}

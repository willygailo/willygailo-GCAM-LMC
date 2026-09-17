package j$.util.stream;

import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.function.Supplier;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: loaded from: classes2.dex */
abstract class FindOps {

    final class FindOp implements TerminalOp {
        final Object emptyValue;
        final int opFlags;
        final Predicate presentPredicate;
        private final StreamShape shape;
        final Supplier sinkSupplier;

        FindOp(boolean z, StreamShape streamShape, Object obj, Predicate predicate, Supplier supplier) {
            this.opFlags = (z ? 0 : StreamOpFlag.NOT_ORDERED) | StreamOpFlag.IS_SHORT_CIRCUIT;
            this.shape = streamShape;
            this.emptyValue = obj;
            this.presentPredicate = predicate;
            this.sinkSupplier = supplier;
        }

        @Override // j$.util.stream.TerminalOp
        public Object evaluateParallel(PipelineHelper pipelineHelper, Spliterator spliterator) {
            return new FindTask(this, StreamOpFlag.ORDERED.isKnown(pipelineHelper.getStreamAndOpFlags()), pipelineHelper, spliterator).invoke();
        }

        @Override // j$.util.stream.TerminalOp
        public Object evaluateSequential(PipelineHelper pipelineHelper, Spliterator spliterator) {
            Object obj = ((TerminalSink) pipelineHelper.wrapAndCopyInto((TerminalSink) this.sinkSupplier.get(), spliterator)).get();
            return obj != null ? obj : this.emptyValue;
        }

        @Override // j$.util.stream.TerminalOp
        public int getOpFlags() {
            return this.opFlags;
        }
    }

    abstract class FindSink implements TerminalSink {
        boolean hasValue;
        Object value;

        final class OfRef extends FindSink {
            static final TerminalOp OP_FIND_ANY;
            static final TerminalOp OP_FIND_FIRST;

            static {
                StreamShape streamShape = StreamShape.REFERENCE;
                Optional optionalEmpty = Optional.empty();
                FindOps$FindSink$OfRef$$ExternalSyntheticLambda0 findOps$FindSink$OfRef$$ExternalSyntheticLambda0 = new Predicate() { // from class: j$.util.stream.FindOps$FindSink$OfRef$$ExternalSyntheticLambda0
                    @Override // j$.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate.CC.$default$and(this, predicate);
                    }

                    @Override // j$.util.function.Predicate
                    public /* synthetic */ Predicate negate() {
                        return Predicate.CC.$default$negate(this);
                    }

                    @Override // j$.util.function.Predicate
                    public /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate.CC.$default$or(this, predicate);
                    }

                    @Override // j$.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ((Optional) obj).isPresent();
                    }
                };
                FindOps$FindSink$OfRef$$ExternalSyntheticLambda1 findOps$FindSink$OfRef$$ExternalSyntheticLambda1 = new Supplier() { // from class: j$.util.stream.FindOps$FindSink$OfRef$$ExternalSyntheticLambda1
                    @Override // j$.util.function.Supplier
                    public final Object get() {
                        return new FindOps.FindSink.OfRef();
                    }
                };
                OP_FIND_FIRST = new FindOp(true, streamShape, optionalEmpty, findOps$FindSink$OfRef$$ExternalSyntheticLambda0, findOps$FindSink$OfRef$$ExternalSyntheticLambda1);
                OP_FIND_ANY = new FindOp(false, streamShape, Optional.empty(), findOps$FindSink$OfRef$$ExternalSyntheticLambda0, findOps$FindSink$OfRef$$ExternalSyntheticLambda1);
            }

            OfRef() {
            }

            @Override // j$.util.function.Supplier
            public Optional get() {
                if (this.hasValue) {
                    return Optional.of(this.value);
                }
                return null;
            }
        }

        FindSink() {
        }

        @Override // j$.util.stream.Sink
        public /* synthetic */ void accept(long j) {
            Sink.CC.$default$accept(this, j);
        }

        @Override // j$.util.function.Consumer
        public void accept(Object obj) {
            if (this.hasValue) {
                return;
            }
            this.hasValue = true;
            this.value = obj;
        }

        @Override // j$.util.function.Consumer
        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return Consumer.CC.$default$andThen(this, consumer);
        }

        @Override // j$.util.stream.Sink
        public /* synthetic */ void begin(long j) {
            Sink.CC.$default$begin(this, j);
        }

        @Override // j$.util.stream.Sink
        public boolean cancellationRequested() {
            return this.hasValue;
        }

        @Override // j$.util.stream.Sink
        public /* synthetic */ void end() {
            Sink.CC.$default$end(this);
        }
    }

    final class FindTask extends AbstractShortCircuitTask {
        private final boolean mustFindFirst;
        private final FindOp op;

        FindTask(FindOp findOp, boolean z, PipelineHelper pipelineHelper, Spliterator spliterator) {
            super(pipelineHelper, spliterator);
            this.mustFindFirst = z;
            this.op = findOp;
        }

        FindTask(FindTask findTask, Spliterator spliterator) {
            super(findTask, spliterator);
            this.mustFindFirst = findTask.mustFindFirst;
            this.op = findTask.op;
        }

        private void foundResult(Object obj) {
            if (isLeftmostNode()) {
                shortCircuit(obj);
            } else {
                cancelLaterNodes();
            }
        }

        @Override // j$.util.stream.AbstractTask
        protected Object doLeaf() {
            Object obj = ((TerminalSink) this.helper.wrapAndCopyInto((TerminalSink) this.op.sinkSupplier.get(), this.spliterator)).get();
            if (!this.mustFindFirst) {
                if (obj != null) {
                    shortCircuit(obj);
                }
                return null;
            }
            if (obj == null) {
                return null;
            }
            foundResult(obj);
            return obj;
        }

        @Override // j$.util.stream.AbstractShortCircuitTask
        protected Object getEmptyResult() {
            return this.op.emptyValue;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.AbstractTask
        public FindTask makeChild(Spliterator spliterator) {
            return new FindTask(this, spliterator);
        }

        @Override // j$.util.stream.AbstractTask, java.util.concurrent.CountedCompleter
        public void onCompletion(CountedCompleter countedCompleter) {
            if (this.mustFindFirst) {
                FindTask findTask = (FindTask) this.leftChild;
                FindTask findTask2 = null;
                while (findTask != findTask2) {
                    Object localResult = findTask.getLocalResult();
                    if (localResult != null && this.op.presentPredicate.test(localResult)) {
                        setLocalResult(localResult);
                        foundResult(localResult);
                        break;
                    } else {
                        findTask2 = findTask;
                        findTask = (FindTask) this.rightChild;
                    }
                }
            }
            super.onCompletion(countedCompleter);
        }
    }

    public static TerminalOp makeRef(boolean z) {
        return z ? FindSink.OfRef.OP_FIND_FIRST : FindSink.OfRef.OP_FIND_ANY;
    }
}

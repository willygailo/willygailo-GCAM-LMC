package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.DoubleConsumer;
import j$.util.function.IntConsumer;
import j$.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
interface Sink extends Consumer {

    /* JADX INFO: renamed from: j$.util.stream.Sink$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static void $default$accept(Sink sink, long j) {
            throw new IllegalStateException("called wrong accept method");
        }

        public static void $default$begin(Sink sink, long j) {
        }

        public static boolean $default$cancellationRequested(Sink sink) {
            return false;
        }

        public static void $default$end(Sink sink) {
        }
    }

    public abstract class ChainedReference implements Sink {
        protected final Sink downstream;

        public ChainedReference(Sink sink) {
            sink.getClass();
            this.downstream = sink;
        }

        @Override // j$.util.stream.Sink
        public /* synthetic */ void accept(long j) {
            CC.$default$accept(this, j);
        }

        @Override // j$.util.function.Consumer
        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return Consumer.CC.$default$andThen(this, consumer);
        }

        @Override // j$.util.stream.Sink
        public void begin(long j) {
            this.downstream.begin(j);
        }

        @Override // j$.util.stream.Sink
        public boolean cancellationRequested() {
            return this.downstream.cancellationRequested();
        }

        @Override // j$.util.stream.Sink
        public void end() {
            this.downstream.end();
        }
    }

    public interface OfDouble extends Sink, DoubleConsumer {

        /* JADX INFO: renamed from: j$.util.stream.Sink$OfDouble$-CC, reason: invalid class name */
        public abstract /* synthetic */ class CC {
            public static void $default$accept(OfDouble ofDouble, Double d) {
                if (Tripwire.ENABLED) {
                    Tripwire.trip(ofDouble.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
                }
                ofDouble.accept(d.doubleValue());
            }
        }

        @Override // j$.util.function.DoubleConsumer
        void accept(double d);

        void accept(Double d);
    }

    public interface OfInt extends Sink, IntConsumer {

        /* JADX INFO: renamed from: j$.util.stream.Sink$OfInt$-CC, reason: invalid class name */
        public abstract /* synthetic */ class CC {
            public static void $default$accept(OfInt ofInt, Integer num) {
                if (Tripwire.ENABLED) {
                    Tripwire.trip(ofInt.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
                }
                ofInt.accept(num.intValue());
            }
        }

        @Override // j$.util.function.IntConsumer
        void accept(int i);

        void accept(Integer num);
    }

    public interface OfLong extends Sink, LongConsumer {

        /* JADX INFO: renamed from: j$.util.stream.Sink$OfLong$-CC, reason: invalid class name */
        public abstract /* synthetic */ class CC {
            public static void $default$accept(OfLong ofLong, Long l) {
                if (Tripwire.ENABLED) {
                    Tripwire.trip(ofLong.getClass(), "{0} calling Sink.OfLong.accept(Long)");
                }
                ofLong.accept(l.longValue());
            }
        }

        @Override // j$.util.stream.Sink
        void accept(long j);

        void accept(Long l);
    }

    void accept(long j);

    void begin(long j);

    boolean cancellationRequested();

    void end();
}

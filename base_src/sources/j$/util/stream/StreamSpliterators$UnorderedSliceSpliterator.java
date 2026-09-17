package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
abstract class StreamSpliterators$UnorderedSliceSpliterator {
    protected final int chunkSize;
    private final AtomicLong permits;
    protected final Spliterator s;
    private final long skipThreshold;
    protected final boolean unlimited;

    final class OfRef extends StreamSpliterators$UnorderedSliceSpliterator implements Spliterator, Consumer {
        Object tmpSlot;

        OfRef(Spliterator spliterator, long j, long j2) {
            super(spliterator, j, j2);
        }

        OfRef(Spliterator spliterator, OfRef ofRef) {
            super(spliterator, ofRef);
        }

        @Override // j$.util.function.Consumer
        public final void accept(Object obj) {
            this.tmpSlot = obj;
        }

        @Override // j$.util.function.Consumer
        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return Consumer.CC.$default$andThen(this, consumer);
        }

        @Override // j$.util.Spliterator
        public void forEachRemaining(Consumer consumer) {
            consumer.getClass();
            StreamSpliterators$ArrayBuffer.OfRef ofRef = null;
            while (true) {
                PermitStatus permitStatus = permitStatus();
                if (permitStatus == PermitStatus.NO_MORE) {
                    return;
                }
                if (permitStatus != PermitStatus.MAYBE_MORE) {
                    this.s.forEachRemaining(consumer);
                    return;
                }
                if (ofRef == null) {
                    ofRef = new StreamSpliterators$ArrayBuffer.OfRef(this.chunkSize);
                } else {
                    ofRef.reset();
                }
                long j = 0;
                while (this.s.tryAdvance(ofRef)) {
                    j++;
                    if (j >= this.chunkSize) {
                        break;
                    }
                }
                if (j == 0) {
                    return;
                } else {
                    ofRef.forEach(consumer, acquirePermits(j));
                }
            }
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ Comparator getComparator() {
            return Spliterator.CC.$default$getComparator(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i) {
            return Spliterator.CC.$default$hasCharacteristics(this, i);
        }

        @Override // j$.util.stream.StreamSpliterators$UnorderedSliceSpliterator
        protected Spliterator makeSpliterator(Spliterator spliterator) {
            return new OfRef(spliterator, this);
        }

        @Override // j$.util.Spliterator
        public boolean tryAdvance(Consumer consumer) {
            consumer.getClass();
            while (permitStatus() != PermitStatus.NO_MORE && this.s.tryAdvance(this)) {
                if (acquirePermits(1L) == 1) {
                    consumer.accept(this.tmpSlot);
                    this.tmpSlot = null;
                    return true;
                }
            }
            return false;
        }
    }

    enum PermitStatus {
        NO_MORE,
        MAYBE_MORE,
        UNLIMITED
    }

    StreamSpliterators$UnorderedSliceSpliterator(Spliterator spliterator, long j, long j2) {
        this.s = spliterator;
        this.unlimited = j2 < 0;
        this.skipThreshold = j2 >= 0 ? j2 : 0L;
        this.chunkSize = 128;
        this.permits = new AtomicLong(j2 >= 0 ? j + j2 : j);
    }

    StreamSpliterators$UnorderedSliceSpliterator(Spliterator spliterator, StreamSpliterators$UnorderedSliceSpliterator streamSpliterators$UnorderedSliceSpliterator) {
        this.s = spliterator;
        this.unlimited = streamSpliterators$UnorderedSliceSpliterator.unlimited;
        this.permits = streamSpliterators$UnorderedSliceSpliterator.permits;
        this.skipThreshold = streamSpliterators$UnorderedSliceSpliterator.skipThreshold;
        this.chunkSize = streamSpliterators$UnorderedSliceSpliterator.chunkSize;
    }

    protected final long acquirePermits(long j) {
        long j2;
        long jMin;
        do {
            j2 = this.permits.get();
            if (j2 != 0) {
                jMin = Math.min(j2, j);
                if (jMin <= 0) {
                    break;
                }
            } else {
                if (this.unlimited) {
                    return j;
                }
                return 0L;
            }
        } while (!this.permits.compareAndSet(j2, j2 - jMin));
        if (this.unlimited) {
            return Math.max(j - jMin, 0L);
        }
        long j3 = this.skipThreshold;
        return j2 > j3 ? Math.max(jMin - (j2 - j3), 0L) : jMin;
    }

    public final int characteristics() {
        return this.s.characteristics() & (-16465);
    }

    public final long estimateSize() {
        return this.s.estimateSize();
    }

    protected abstract Spliterator makeSpliterator(Spliterator spliterator);

    protected final PermitStatus permitStatus() {
        if (this.permits.get() > 0) {
            return PermitStatus.MAYBE_MORE;
        }
        return this.unlimited ? PermitStatus.UNLIMITED : PermitStatus.NO_MORE;
    }

    public final Spliterator trySplit() {
        Spliterator spliteratorTrySplit;
        if (this.permits.get() == 0 || (spliteratorTrySplit = this.s.trySplit()) == null) {
            return null;
        }
        return makeSpliterator(spliteratorTrySplit);
    }
}

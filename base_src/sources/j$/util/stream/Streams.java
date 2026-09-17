package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
abstract class Streams {

    abstract class ConcatSpliterator implements Spliterator {
        protected final Spliterator aSpliterator;
        protected final Spliterator bSpliterator;
        boolean beforeSplit = true;
        final boolean unsized;

        class OfRef extends ConcatSpliterator {
            OfRef(Spliterator spliterator, Spliterator spliterator2) {
                super(spliterator, spliterator2);
            }
        }

        public ConcatSpliterator(Spliterator spliterator, Spliterator spliterator2) {
            this.aSpliterator = spliterator;
            this.bSpliterator = spliterator2;
            this.unsized = spliterator.estimateSize() + spliterator2.estimateSize() < 0;
        }

        @Override // j$.util.Spliterator
        public int characteristics() {
            if (this.beforeSplit) {
                return this.aSpliterator.characteristics() & this.bSpliterator.characteristics() & (((this.unsized ? 16448 : 0) | 5) ^ (-1));
            }
            return this.bSpliterator.characteristics();
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            if (!this.beforeSplit) {
                return this.bSpliterator.estimateSize();
            }
            long jEstimateSize = this.aSpliterator.estimateSize() + this.bSpliterator.estimateSize();
            if (jEstimateSize >= 0) {
                return jEstimateSize;
            }
            return Long.MAX_VALUE;
        }

        @Override // j$.util.Spliterator
        public void forEachRemaining(Consumer consumer) {
            if (this.beforeSplit) {
                this.aSpliterator.forEachRemaining(consumer);
            }
            this.bSpliterator.forEachRemaining(consumer);
        }

        @Override // j$.util.Spliterator
        public Comparator getComparator() {
            if (this.beforeSplit) {
                throw new IllegalStateException();
            }
            return this.bSpliterator.getComparator();
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i) {
            return Spliterator.CC.$default$hasCharacteristics(this, i);
        }

        @Override // j$.util.Spliterator
        public boolean tryAdvance(Consumer consumer) {
            if (!this.beforeSplit) {
                return this.bSpliterator.tryAdvance(consumer);
            }
            boolean zTryAdvance = this.aSpliterator.tryAdvance(consumer);
            if (zTryAdvance) {
                return zTryAdvance;
            }
            this.beforeSplit = false;
            return this.bSpliterator.tryAdvance(consumer);
        }

        @Override // j$.util.Spliterator
        public Spliterator trySplit() {
            Spliterator spliteratorTrySplit = this.beforeSplit ? this.aSpliterator : this.bSpliterator.trySplit();
            this.beforeSplit = false;
            return spliteratorTrySplit;
        }
    }

    static Runnable composeWithExceptions(final Runnable runnable, final Runnable runnable2) {
        return new Runnable() { // from class: j$.util.stream.Streams.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    runnable.run();
                    runnable2.run();
                } catch (Throwable th) {
                    try {
                        runnable2.run();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            }
        };
    }

    static Runnable composedClose(final BaseStream baseStream, final BaseStream baseStream2) {
        return new Runnable() { // from class: j$.util.stream.Streams.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    baseStream.close();
                    baseStream2.close();
                } catch (Throwable th) {
                    try {
                        baseStream2.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            }
        };
    }
}

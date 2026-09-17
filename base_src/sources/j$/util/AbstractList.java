package j$.util;

import j$.util.function.Consumer;
import java.util.AbstractCollection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractList extends AbstractCollection implements List {

    final class RandomAccessSpliterator implements Spliterator {
        private final AbstractList alist;
        private int expectedModCount;
        private int fence;
        private int index;
        private final List list;

        private RandomAccessSpliterator(RandomAccessSpliterator randomAccessSpliterator, int i, int i2) {
            this.list = randomAccessSpliterator.list;
            this.index = i;
            this.fence = i2;
            this.expectedModCount = randomAccessSpliterator.expectedModCount;
        }

        RandomAccessSpliterator(List list) {
            this.list = list;
            this.index = 0;
            this.fence = -1;
            this.expectedModCount = 0;
        }

        static void checkAbstractListModCount(AbstractList abstractList, int i) {
        }

        private static Object get(List list, int i) {
            try {
                return list.get(i);
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }

        private int getFence() {
            List list = this.list;
            int i = this.fence;
            if (i >= 0) {
                return i;
            }
            int size = list.size();
            this.fence = size;
            return size;
        }

        @Override // j$.util.Spliterator
        public int characteristics() {
            return 16464;
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            return getFence() - this.index;
        }

        @Override // j$.util.Spliterator
        public void forEachRemaining(Consumer consumer) {
            consumer.getClass();
            List list = this.list;
            int fence = getFence();
            this.index = fence;
            for (int i = this.index; i < fence; i++) {
                consumer.accept(get(list, i));
            }
            checkAbstractListModCount(this.alist, this.expectedModCount);
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

        @Override // j$.util.Spliterator
        public boolean tryAdvance(Consumer consumer) {
            if (consumer == null) {
                throw null;
            }
            int fence = getFence();
            int i = this.index;
            if (i >= fence) {
                return false;
            }
            this.index = i + 1;
            consumer.accept(get(this.list, i));
            checkAbstractListModCount(this.alist, this.expectedModCount);
            return true;
        }

        @Override // j$.util.Spliterator
        public Spliterator trySplit() {
            int fence = getFence();
            int i = this.index;
            int i2 = (fence + i) >>> 1;
            if (i >= i2) {
                return null;
            }
            this.index = i2;
            return new RandomAccessSpliterator(this, i, i2);
        }
    }
}

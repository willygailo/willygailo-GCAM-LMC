package j$.util.stream;

import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
abstract class StreamSpliterators$ArrayBuffer {
    int index;

    final class OfRef extends StreamSpliterators$ArrayBuffer implements Consumer {
        final Object[] array;

        OfRef(int i) {
            this.array = new Object[i];
        }

        @Override // j$.util.function.Consumer
        public void accept(Object obj) {
            Object[] objArr = this.array;
            int i = this.index;
            this.index = i + 1;
            objArr[i] = obj;
        }

        @Override // j$.util.function.Consumer
        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return Consumer.CC.$default$andThen(this, consumer);
        }

        public void forEach(Consumer consumer, long j) {
            for (int i = 0; i < j; i++) {
                consumer.accept(this.array[i]);
            }
        }
    }

    StreamSpliterators$ArrayBuffer() {
    }

    void reset() {
        this.index = 0;
    }
}

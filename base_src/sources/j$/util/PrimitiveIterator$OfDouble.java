package j$.util;

import j$.util.function.Consumer;
import j$.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public interface PrimitiveIterator$OfDouble extends java.util.Iterator {

    /* JADX INFO: renamed from: j$.util.PrimitiveIterator$OfDouble$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static void $default$forEachRemaining(PrimitiveIterator$OfDouble primitiveIterator$OfDouble, Consumer consumer) {
            if (consumer instanceof DoubleConsumer) {
                primitiveIterator$OfDouble.forEachRemaining((DoubleConsumer) consumer);
                return;
            }
            consumer.getClass();
            if (Tripwire.ENABLED) {
                Tripwire.trip(primitiveIterator$OfDouble.getClass(), "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            }
            primitiveIterator$OfDouble.forEachRemaining(new PrimitiveIterator$OfDouble$$ExternalSyntheticLambda0(consumer));
        }

        public static void $default$forEachRemaining(PrimitiveIterator$OfDouble primitiveIterator$OfDouble, DoubleConsumer doubleConsumer) {
            doubleConsumer.getClass();
            while (primitiveIterator$OfDouble.hasNext()) {
                doubleConsumer.accept(primitiveIterator$OfDouble.nextDouble());
            }
        }

        public static Double $default$next(PrimitiveIterator$OfDouble primitiveIterator$OfDouble) {
            if (Tripwire.ENABLED) {
                Tripwire.trip(primitiveIterator$OfDouble.getClass(), "{0} calling PrimitiveIterator.OfDouble.nextLong()");
            }
            return Double.valueOf(primitiveIterator$OfDouble.nextDouble());
        }
    }

    void forEachRemaining(DoubleConsumer doubleConsumer);

    @Override // java.util.Iterator
    Double next();

    double nextDouble();
}

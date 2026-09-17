package j$.util.stream;

import j$.util.Optional;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.IntFunction;
import j$.util.function.Predicate;
import j$.util.function.ToLongFunction;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public interface Stream extends BaseStream {

    /* JADX INFO: renamed from: j$.util.stream.Stream$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Stream concat(Stream stream, Stream stream2) {
            stream.getClass();
            stream2.getClass();
            return (Stream) StreamSupport.stream(new Streams.ConcatSpliterator.OfRef(stream.spliterator(), stream2.spliterator()), stream.isParallel() || stream2.isParallel()).onClose(Streams.composedClose(stream, stream2));
        }
    }

    boolean allMatch(Predicate predicate);

    boolean anyMatch(Predicate predicate);

    Object collect(Collector collector);

    long count();

    Stream filter(Predicate predicate);

    Optional findFirst();

    void forEach(Consumer consumer);

    void forEachOrdered(Consumer consumer);

    Stream limit(long j);

    Stream map(Function function);

    LongStream mapToLong(ToLongFunction toLongFunction);

    boolean noneMatch(Predicate predicate);

    Stream sorted(Comparator comparator);

    Object[] toArray(IntFunction intFunction);
}

package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class StreamSupport {
    public static Stream stream(Spliterator spliterator, boolean z) {
        spliterator.getClass();
        return new ReferencePipeline.Head(spliterator, StreamOpFlag.fromCharacteristics(spliterator), z);
    }
}

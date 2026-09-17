package com.google.googlex.gcam.base;

/* JADX INFO: loaded from: classes.dex */
public class OwningNativePointer implements AutoCloseable {
    private long nativeSharedPointer;

    protected OwningNativePointer(long j) {
        this.nativeSharedPointer = j;
    }

    private native void delete(long j);

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        long j = this.nativeSharedPointer;
        if (j != 0) {
            delete(j);
            this.nativeSharedPointer = 0L;
        }
    }

    protected final synchronized void finalize() {
        if (this.nativeSharedPointer == 0) {
            return;
        }
        System.err.printf("OwningNativePointer finalized with a non-zero nativeSharedPointer (0x%x), this indicates a resource management error%n", Long.valueOf(this.nativeSharedPointer));
        close();
    }
}

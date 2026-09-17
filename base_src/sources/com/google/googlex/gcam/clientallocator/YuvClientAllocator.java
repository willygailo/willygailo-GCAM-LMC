package com.google.googlex.gcam.clientallocator;

import com.google.googlex.gcam.base.LongPair;

/* JADX INFO: loaded from: classes.dex */
public interface YuvClientAllocator {
    LongPair allocate(int i, int i2, int i3);

    void doneWriting(long j);
}

package com.google.googlex.gcam.base;

import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class LongPair {
    public long first;
    public long second;

    public LongPair() {
        this.first = 0L;
        this.second = 0L;
    }

    public LongPair(long j, long j2) {
        this.first = j;
        this.second = j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LongPair) {
            LongPair longPair = (LongPair) obj;
            if (this.first == longPair.first && this.second == longPair.second) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.first), Long.valueOf(this.second));
    }
}

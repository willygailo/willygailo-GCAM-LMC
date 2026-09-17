package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class qid implements qdk {
    static final int a = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final Object j = new Object();
    final int c;
    long d;
    final int e;
    AtomicReferenceArray f;
    final int g;
    AtomicReferenceArray h;
    final AtomicLong b = new AtomicLong();
    final AtomicLong i = new AtomicLong();

    public qid(int i) {
        int iT = qmd.T(Math.max(8, i));
        int i2 = iT - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(iT + 1);
        this.f = atomicReferenceArray;
        this.e = i2;
        this.c = Math.min(iT / 4, a);
        this.h = atomicReferenceArray;
        this.g = i2;
        this.d = i2 - 1;
        d(0L);
    }

    private final void a(long j2) {
        this.i.lazySet(j2);
    }

    private final void d(long j2) {
        this.b.lazySet(j2);
    }

    private final void e(AtomicReferenceArray atomicReferenceArray, Object obj, long j2, int i) {
        atomicReferenceArray.lazySet(i, obj);
        d(j2 + 1);
    }

    @Override // defpackage.qdl
    public final void c() {
        while (true) {
            if (gS() == null && i()) {
                return;
            }
        }
    }

    @Override // defpackage.qdk, defpackage.qdl
    public final Object gS() {
        AtomicReferenceArray atomicReferenceArray = this.h;
        long j2 = this.i.get();
        int i = this.g;
        int i2 = ((int) j2) & i;
        Object obj = atomicReferenceArray.get(i2);
        Object obj2 = j;
        if (obj != null) {
            if (obj != obj2) {
                atomicReferenceArray.lazySet(i2, null);
                a(j2 + 1);
                return obj;
            }
        } else if (obj2 != null) {
            return null;
        }
        int i3 = i + 1;
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i3);
        atomicReferenceArray.lazySet(i3, null);
        this.h = atomicReferenceArray2;
        Object obj3 = atomicReferenceArray2.get(i2);
        if (obj3 != null) {
            atomicReferenceArray2.lazySet(i2, null);
            a(j2 + 1);
        }
        return obj3;
    }

    @Override // defpackage.qdl
    public final boolean gU(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray = this.f;
        long j2 = this.b.get();
        int i = this.e;
        int i2 = ((int) j2) & i;
        if (j2 < this.d) {
            e(atomicReferenceArray, obj, j2, i2);
            return true;
        }
        long j3 = ((long) this.c) + j2;
        if (atomicReferenceArray.get(((int) j3) & i) == null) {
            this.d = j3 - 1;
            e(atomicReferenceArray, obj, j2, i2);
            return true;
        }
        long j4 = 1 + j2;
        if (atomicReferenceArray.get(((int) j4) & i) == null) {
            e(atomicReferenceArray, obj, j2, i2);
            return true;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f = atomicReferenceArray2;
        this.d = (j2 + ((long) i)) - 1;
        atomicReferenceArray2.lazySet(i2, obj);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i2, j);
        d(j4);
        return true;
    }

    @Override // defpackage.qdl
    public final boolean i() {
        return this.b.get() == this.i.get();
    }
}

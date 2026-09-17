package defpackage;

import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.base.LongPair;
import com.google.googlex.gcam.clientallocator.RawClientAllocator;

/* JADX INFO: loaded from: classes2.dex */
public final class pjq implements RawClientAllocator {
    public pjj a;
    public boolean b = false;

    public pjq() {
        obr.aF(GcamModuleJNI.kInvalidAllocationId_get() != 0);
    }

    @Override // com.google.googlex.gcam.clientallocator.RawClientAllocator
    public final LongPair allocate(int i, int i2, int i3) {
        obr.aR(this.a == null, "allocate() should be called at most once.");
        this.a = new pjj(GcamModuleJNI.new_RawImage__SWIG_1(i, i2, i3));
        return new LongPair(0L, RawWriteView.c(this.a));
    }

    @Override // com.google.googlex.gcam.clientallocator.RawClientAllocator
    public final void doneWriting(long j) {
        obr.aF(j == 0);
        obr.aR(this.a != null, "doneWriting() was called before allocate().");
        obr.aR(!this.b, "doneWriting() should be called at most once.");
        this.b = true;
    }
}

package defpackage;

import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.YuvImage;
import com.google.googlex.gcam.YuvWriteView;
import com.google.googlex.gcam.base.LongPair;
import com.google.googlex.gcam.clientallocator.YuvClientAllocator;

/* JADX INFO: loaded from: classes2.dex */
public final class pjr implements YuvClientAllocator {
    private YuvImage a;
    private boolean b = false;

    public pjr() {
        obr.aF(GcamModuleJNI.kInvalidAllocationId_get() != 0);
    }

    public final YuvImage a() {
        obr.aR(this.b, "doneWriting() must be called before getImage.");
        return this.a;
    }

    @Override // com.google.googlex.gcam.clientallocator.YuvClientAllocator
    public final LongPair allocate(int i, int i2, int i3) {
        obr.aR(this.a == null, "allocate() should be called at most once.");
        this.a = new YuvImage(i, i2, i3);
        return new LongPair(0L, YuvWriteView.e(this.a));
    }

    @Override // com.google.googlex.gcam.clientallocator.YuvClientAllocator
    public final void doneWriting(long j) {
        obr.aF(j == 0);
        obr.aR(this.a != null, "doneWriting() was called before allocate().");
        obr.aR(!this.b, "doneWriting() should be called at most once.");
        this.b = true;
    }
}

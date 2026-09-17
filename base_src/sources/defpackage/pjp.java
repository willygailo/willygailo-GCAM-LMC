package defpackage;

import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.base.LongPair;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;

/* JADX INFO: loaded from: classes2.dex */
public final class pjp implements InterleavedU8ClientAllocator {
    public InterleavedImageU8 a;
    public boolean b = false;
    private InterleavedWriteViewU8 c;

    public pjp() {
        obr.aF(GcamModuleJNI.kInvalidAllocationId_get() != 0);
    }

    @Override // com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator
    public final LongPair allocate(int i, int i2, int i3) {
        obr.aR(this.a == null, "allocate() should be called at most once.");
        InterleavedImageU8 interleavedImageU8 = new InterleavedImageU8(i, i2, i3);
        this.a = interleavedImageU8;
        this.c = interleavedImageU8.d();
        return new LongPair(0L, InterleavedWriteViewU8.a(this.c));
    }

    @Override // com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator
    public final void doneWriting(long j) {
        obr.aF(j == 0);
        obr.aR(this.a != null, "doneWriting() was called before allocate().");
        obr.aR(!this.b, "doneWriting() should be called at most once.");
        this.b = true;
    }
}

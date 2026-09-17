package defpackage;

import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedImageU16;
import com.google.googlex.gcam.InterleavedWriteViewU16;
import com.google.googlex.gcam.base.LongPair;
import com.google.googlex.gcam.clientallocator.InterleavedU16ClientAllocator;

/* JADX INFO: loaded from: classes2.dex */
public final class pjo implements InterleavedU16ClientAllocator {
    public InterleavedImageU16 a;
    public boolean b = false;
    private InterleavedWriteViewU16 c;

    public pjo() {
        obr.aF(GcamModuleJNI.kInvalidAllocationId_get() != 0);
    }

    @Override // com.google.googlex.gcam.clientallocator.InterleavedU16ClientAllocator
    public final LongPair allocate(int i, int i2, int i3) {
        obr.aR(this.a == null, "allocate() should be called at most once.");
        InterleavedImageU16 interleavedImageU16 = new InterleavedImageU16(GcamModuleJNI.new_InterleavedImageU16__SWIG_1(i, i2, i3));
        this.a = interleavedImageU16;
        this.c = new InterleavedWriteViewU16(GcamModuleJNI.InterleavedImageU16_write_view(interleavedImageU16.a, interleavedImageU16));
        InterleavedWriteViewU16 interleavedWriteViewU16 = this.c;
        return new LongPair(0L, interleavedWriteViewU16 == null ? 0L : interleavedWriteViewU16.a);
    }

    @Override // com.google.googlex.gcam.clientallocator.InterleavedU16ClientAllocator
    public final void doneWriting(long j) {
        obr.aF(j == 0);
        obr.aR(this.a != null, "doneWriting() was called before allocate().");
        obr.aR(!this.b, "doneWriting() should be called at most once.");
        this.b = true;
    }
}

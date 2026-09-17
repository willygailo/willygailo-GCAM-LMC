package defpackage;

import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.LockedHardwareBuffer;
import com.google.googlex.gcam.base.LongPair;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;

/* JADX INFO: loaded from: classes2.dex */
public final class pjn implements InterleavedU8ClientAllocator {
    private final long a;
    private final long b;
    private HardwareBuffer c;
    private LockedHardwareBuffer d;

    public pjn(long j, long j2) {
        obr.aF(GcamModuleJNI.kInvalidAllocationId_get() != 0);
        obr.aG(true, "allocateUsage must contain USAGE_CPU_WRITE_RARELY.");
        obr.aG(true, "lockUsage must contain USAGE_CPU_WRITE_RARELY.");
        this.a = j;
        this.b = j2;
    }

    public final HardwareBuffer a() {
        boolean z = false;
        if (this.c != null && this.d == null) {
            z = true;
        }
        obr.aR(z, "doneWriting() must be called before getImage.");
        return this.c;
    }

    @Override // com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator
    public final LongPair allocate(int i, int i2, int i3) {
        obr.aL(i3 == 4, "Server requested an InterleavedImageU8 of %s channels, but UniqueHardwareBufferInterleavedU8ClientAllocator only supports %s.", i3, 4);
        obr.aR(this.c == null, "allocate() should be called at most once.");
        HardwareBuffer hardwareBufferCreate = HardwareBuffer.create(i, i2, 1, 1, this.a);
        this.c = hardwareBufferCreate;
        this.d = LockedHardwareBuffer.c(hardwareBufferCreate, this.b);
        return new LongPair(0L, InterleavedWriteViewU8.a(this.d.b()));
    }

    @Override // com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator
    public final void doneWriting(long j) {
        obr.aF(j == 0);
        obr.aR(this.c != null, "doneWriting() was called before allocate().");
        obr.aR(this.d != null, "doneWriting() was called more than once.");
        this.d.close();
        this.d = null;
    }
}

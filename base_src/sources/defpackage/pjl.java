package defpackage;

import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.base.LongPair;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class pjl implements InterleavedU8ClientAllocator {
    private final Object a = new Object();
    private final Object b = new Object();
    private long c = 0;
    private final Map d = new HashMap();
    private final Map e = new HashMap();
    private final Map f = new HashMap();

    public final ojc a(long j) {
        ojc ojcVarH;
        synchronized (this.b) {
            ojcVarH = ojc.h((InterleavedImageU8) this.f.remove(Long.valueOf(j)));
        }
        return ojcVarH;
    }

    @Override // com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator
    public final LongPair allocate(int i, int i2, int i3) {
        LongPair longPair;
        InterleavedImageU8 interleavedImageU8 = new InterleavedImageU8(i, i2, i3);
        InterleavedWriteViewU8 interleavedWriteViewU8D = interleavedImageU8.d();
        synchronized (this.a) {
            long j = this.c;
            this.c = 1 + j;
            Map map = this.d;
            Long lValueOf = Long.valueOf(j);
            map.put(lValueOf, interleavedImageU8);
            this.e.put(lValueOf, interleavedWriteViewU8D);
            longPair = new LongPair(j, InterleavedWriteViewU8.a(interleavedWriteViewU8D));
        }
        return longPair;
    }

    @Override // com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator
    public final void doneWriting(long j) {
        Long lValueOf;
        InterleavedImageU8 interleavedImageU8;
        synchronized (this.a) {
            Map map = this.d;
            lValueOf = Long.valueOf(j);
            interleavedImageU8 = (InterleavedImageU8) map.remove(lValueOf);
            this.e.remove(lValueOf);
        }
        interleavedImageU8.getClass();
        synchronized (this.b) {
            this.f.put(lValueOf, interleavedImageU8);
        }
    }
}

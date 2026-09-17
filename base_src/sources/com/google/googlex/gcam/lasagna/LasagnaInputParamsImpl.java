package com.google.googlex.gcam.lasagna;

import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.RawWriteView;
import defpackage.obr;
import defpackage.plj;
import defpackage.pll;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class LasagnaInputParamsImpl implements pll {
    private static final AtomicBoolean a = new AtomicBoolean();
    private long b;

    public LasagnaInputParamsImpl(long j, long j2, long j3, long j4, List list, int i) {
        if (a.compareAndSet(false, true)) {
            init();
        }
        obr.aG(j != 0, "staticMetadataPtr is 0.");
        obr.aG(j2 != 0, "shotParamsPtr is 0.");
        obr.aG(j3 != 0, "shotMetadataPtr is 0.");
        obr.aG(j4 != 0, "rawImagePlanarWriteView16Ptr is 0.");
        int size = list.size();
        long[] jArr = new long[size];
        long[] jArr2 = new long[size];
        long[] jArr3 = new long[size];
        Runnable[] runnableArr = new Runnable[size];
        for (int i2 = 0; i2 < size; i2++) {
            plj pljVar = (plj) list.get(i2);
            jArr[i2] = pljVar.c.a;
            jArr2[i2] = FrameMetadata.b(pljVar.b);
            jArr3[i2] = RawWriteView.c(pljVar.a);
            runnableArr[i2] = pljVar.d;
        }
        long jAlloc = alloc(j, j2, j3, j4, jArr3, jArr2, jArr, runnableArr, i);
        obr.aR(jAlloc != 0, "alloc() failed!");
        this.b = jAlloc;
    }

    private static native long alloc(long j, long j2, long j3, long j4, long[] jArr, long[] jArr2, long[] jArr3, Runnable[] runnableArr, int i);

    private static native void dealloc(long j);

    private static native void init();

    @Override // defpackage.pll
    public final synchronized long a() {
        return this.b;
    }

    @Override // defpackage.pll
    public final synchronized void b() {
        dealloc(this.b);
        this.b = 0L;
    }
}

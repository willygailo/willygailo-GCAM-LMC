package defpackage;

import com.google.babelfish.device.avenh.l2l.apps.common.VideoProcessorUtils;
import j$.time.Duration;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class igw implements ihd {
    public boolean a;
    private final ihn b;
    private final ddf c;
    private final ojc d;
    private final ckg e;
    private final bqg f;

    public igw(ojc ojcVar, ckg ckgVar, ihn ihnVar, bqg bqgVar, ddf ddfVar) {
        this.d = ojcVar;
        this.e = ckgVar;
        this.b = ihnVar;
        this.f = bqgVar;
        this.c = ddfVar;
        if (ojcVar.g()) {
            bqgVar.i().c(((ihb) ojcVar.c()).a(new igv(this)));
        }
    }

    @Override // defpackage.ihd
    public final void a() {
        this.a = false;
    }

    @Override // defpackage.ihd
    public final void b() {
        this.b.a.clear();
    }

    @Override // defpackage.ihd
    public final void c(mad madVar) {
        if (this.d.g()) {
            ihn ihnVar = this.b;
            long jD = madVar.d();
            if (!ihnVar.a.isEmpty() && !ihnVar.a.isEmpty()) {
                int size = ihnVar.a.size();
                Long l = (Long) ihnVar.a.peek();
                l.getClass();
                double d = size;
                double dA = pfe.a(Duration.ofNanos(jD - l.longValue()));
                Double.isNaN(d);
                if (d / dA > 20.0d) {
                    return;
                }
            }
            ihnVar.a.offer(Long.valueOf(jD));
            if (ihnVar.a.size() > 20) {
                ihnVar.a.poll();
            }
            if (this.a) {
                return;
            }
            lig ligVarH = lig.h(madVar.c(), madVar.b());
            lic licVar = (lic) ((lce) this.e.a()).d;
            ByteBuffer buffer = ((mac) madVar.g().get(0)).getBuffer();
            int i = ligVarH.a;
            int i2 = ligVarH.b;
            int i3 = licVar.e;
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i * i2);
            VideoProcessorUtils.nativeRotateFrame(buffer, i, i2, (360 - i3) % 360, byteBufferAllocateDirect);
            ihb ihbVar = (ihb) this.d.c();
            int i4 = ligVarH.a;
            int i5 = ligVarH.b;
            int i6 = licVar.e;
            long jD2 = madVar.d();
            ddf ddfVar = this.c;
            ddi ddiVar = dcu.a;
            ddfVar.d();
            ihbVar.f(byteBufferAllocateDirect, i4, i5, i6, jD2, oih.a);
        }
    }
}

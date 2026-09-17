package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class hcg {
    public final lnx a;
    public final lnx b;
    public final lnx c;
    public final lnx d;
    public final lnx e;
    public final lnx f;
    public final lnx g;

    public hcg(Map map) {
        this.a = (lnx) map.get(hdr.RAW_HDRPLUS);
        this.b = (lnx) map.get(hdr.RAW_WIDE);
        this.c = (lnx) map.get(hdr.RAW_TELE);
        this.d = (lnx) map.get(hdr.RAW_ULTRAWIDE);
        this.e = (lnx) map.get(hdr.PD);
        this.f = (lnx) map.get(hdr.DEPTH);
        this.g = (lnx) map.get(hdr.YUV_ANALYSIS);
    }

    public final hcf a(lmr lmrVar) {
        return new hcf(this, lmrVar);
    }
}

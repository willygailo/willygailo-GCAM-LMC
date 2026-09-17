package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class gqe {
    public static final ope a = ope.J(hdr.RAW_WIDE, hdr.RAW_TELE, hdr.RAW_ULTRAWIDE);

    static ojc a(Map map) {
        return ojc.h((lnx) map.get(hdr.DEPTH));
    }

    static ojc b(Map map) {
        return ojc.h((lnx) map.get(hdr.PD));
    }

    static ojc c(Map map) {
        return ojc.h((lnx) map.get(hdr.RAW_HDRPLUS));
    }

    static ojc d(Map map) {
        return ojc.h((lnx) map.get(hdr.YUV_ANALYSIS));
    }

    static ojc e(Map map) {
        return ojc.h((lnx) map.get(hdr.YUV_LARGE));
    }

    public static boolean f(ojc ojcVar, Map map) {
        return ojcVar.g() || !map.isEmpty();
    }
}

package defpackage;

import android.os.Trace;

/* JADX INFO: loaded from: classes2.dex */
public final class vm {
    public final vq a;
    private final vr b;

    public vm(vq vqVar, vr vrVar) {
        vqVar.getClass();
        vrVar.getClass();
        this.a = vqVar;
        this.b = vrVar;
    }

    public final vo a(String str) {
        vo voVarA;
        vr vrVar = this.b;
        try {
            Trace.beginSection("Camera-" + str + "#awaitMetadata");
            synchronized (vrVar.b) {
                voVarA = (vo) vrVar.b.get(str);
                if (voVarA == null) {
                    wl wlVar = vrVar.a;
                    if (!wlVar.b) {
                        Trace.beginSection("CXCP#checkCameraPermission");
                        if (vj.a(wlVar.a, "android.permission.CAMERA") == 0) {
                            wlVar.b = true;
                        }
                        Trace.endSection();
                    }
                    if (wlVar.b) {
                        voVarA = vrVar.a(str, false);
                        vrVar.b.put(str, voVarA);
                    } else {
                        voVarA = vrVar.a(str, true);
                    }
                }
            }
            Trace.endSection();
            return voVarA;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}

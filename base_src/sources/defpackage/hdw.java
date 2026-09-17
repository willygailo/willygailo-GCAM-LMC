package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class hdw {
    private static final ouj a = ouj.h("com/google/android/apps/camera/pixelcamerakit/payloadprocessor/HdrPlusPayloadUtils");

    public static lzv a(hcf hcfVar, boolean z) {
        String str;
        lzv lzvVarC = hcfVar.a.c();
        if (lzvVarC == null) {
            ((oug) ((oug) a.c()).G((char) 2382)).o("Couldn't acquire metadata from the frame.");
            return null;
        }
        if (!hcfVar.h()) {
            return lzvVarC;
        }
        if (z) {
            str = hcfVar.a().c().a;
        } else {
            lnx lnxVarB = hcfVar.b();
            if (lnxVarB == null) {
                return null;
            }
            str = lnxVarB.c().a;
        }
        return b(lzvVarC, str);
    }

    public static lzv b(lzv lzvVar, String str) {
        Map mapG = lzvVar.g();
        if (mapG.isEmpty()) {
            return lzvVar;
        }
        lzr lzrVar = (lzr) mapG.get(str);
        if (lzrVar != null) {
            return new lzu(lzrVar);
        }
        ((oug) ((oug) a.c()).G((char) 2383)).r("Physical metadata is null for images from camera %s", str);
        return lzvVar;
    }
}

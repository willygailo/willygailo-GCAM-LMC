package com.google.android.apps.camera.legacy.lightcycle.panorama;

import defpackage.fcy;
import defpackage.fcz;
import defpackage.fdx;
import defpackage.lif;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class LightCycle$LightCycleProgressCallback {
    private LightCycle$LightCycleProgressCallback() {
    }

    public /* synthetic */ LightCycle$LightCycleProgressCallback(fcy fcyVar) {
        this();
    }

    public static void onProgress(int i, int i2) {
        Map map = fcz.c;
        Integer numValueOf = Integer.valueOf(i);
        if (map.containsKey(numValueOf)) {
            fdx fdxVar = (fdx) fcz.c.get(numValueOf);
            synchronized (fdxVar.d.b) {
                if (fdxVar.d.b.get()) {
                    return;
                }
                fdxVar.d.a.b.b(lif.c(i2));
                long length = fdxVar.c.length();
                if (length != fdxVar.a) {
                    fdxVar.d.a.b.K();
                    fdxVar.a = length;
                }
                fdxVar.d.h();
            }
        }
    }
}

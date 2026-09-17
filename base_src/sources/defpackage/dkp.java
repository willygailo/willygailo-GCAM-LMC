package defpackage;

import com.google.android.apps.camera.dynamicdepth.DynamicDepthResult;

/* JADX INFO: loaded from: classes.dex */
public final class dkp {
    public final DynamicDepthResult a;
    public final hlr b;

    public dkp(DynamicDepthResult dynamicDepthResult, hlr hlrVar) {
        this.a = dynamicDepthResult;
        this.b = hlrVar;
    }

    public final void a() {
        this.a.close();
        hlr hlrVar = this.b;
        if (hlrVar != null) {
            hlrVar.close();
        }
    }
}

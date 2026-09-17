package defpackage;

import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
final class ogd extends ofv implements ofx {
    private final Exception a;
    private final boolean b;

    public ogd(String str, ofx ofxVar, ogh oghVar, boolean z) {
        super(str, ofxVar);
        obr.aF(oghVar.b);
        this.a = ofxVar.e();
        this.b = z;
    }

    public ogd(String str, ogh oghVar, boolean z) {
        super(str, ofy.a.b());
        obr.aF(oghVar.b);
        this.a = ogc.a;
        this.b = z;
    }

    @Override // defpackage.ofx
    public final ogi d(String str, ogh oghVar, boolean z) {
        if (z && !this.b) {
            WeakHashMap weakHashMap = ogq.a;
        }
        boolean z2 = true;
        if ((!z || this.b) && !this.b) {
            z2 = false;
        }
        return new ogd(str, this, oghVar, z2);
    }

    @Override // defpackage.ofx
    public final Exception e() {
        return this.a;
    }

    @Override // defpackage.ogi
    public final ogi f(String str, ogh oghVar) {
        return d(str, oghVar, true);
    }
}

package defpackage;

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class hrd implements hsb {
    public final Set a = new HashSet();
    public final Map b = new HashMap();

    @Override // defpackage.hsb
    public final /* synthetic */ void j(hsp hspVar) {
    }

    @Override // defpackage.hsb
    public final void k(hsp hspVar, Bitmap bitmap, int i) {
        this.a.remove(hspVar);
    }

    @Override // defpackage.hsb
    public final void l(hsp hspVar) {
        this.a.remove(hspVar);
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void m(long j) {
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void n(Bitmap bitmap) {
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void o(hsp hspVar, lif lifVar) {
    }

    @Override // defpackage.hsb
    public final void p(hsp hspVar, hsj hsjVar, hss hssVar) {
        this.a.add(hspVar);
        this.b.put(hspVar, hsjVar);
    }

    @Override // defpackage.hsb
    public final void q(hsp hspVar) {
        this.a.remove(hspVar);
    }

    @Override // defpackage.hsb
    public final /* synthetic */ void w(hsp hspVar) {
    }
}

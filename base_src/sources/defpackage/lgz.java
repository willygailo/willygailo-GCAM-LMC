package defpackage;

import android.location.Location;
import android.media.MediaCodec;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import java.io.FileDescriptor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lgz implements lfk {
    public final phv a;
    public final ljf b;
    public lee c;
    public leh d;
    public int f;
    public final Handler g;
    public Surface s;
    public lfl t;
    public MediaCodec.Callback u;
    public lxm v;
    private pht x;
    public ley e = ley.SURFACE;
    public int w = 6;
    public int h = 0;
    public long i = 4000000000L;
    public pht j = plk.V(0L);
    public int k = 0;
    public lfc l = new lex();
    public final List m = new ArrayList();
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;
    public pht r = plk.V(oih.a);

    public lgz(phv phvVar, Handler handler, ljf ljfVar) {
        this.a = phvVar;
        this.g = handler;
        this.b = ljfVar;
    }

    @Override // defpackage.lfk
    public final /* bridge */ /* synthetic */ lfj a() {
        if (this.x != null) {
            return new lgy(this);
        }
        throw new IllegalArgumentException("Either output video file path or descriptor is required");
    }

    @Override // defpackage.lfk
    public final /* synthetic */ lfk b(lfl lflVar) {
        this.t = lflVar;
        return this;
    }

    @Override // defpackage.lfk
    public final void c(lee leeVar) {
        this.c = leeVar;
    }

    @Override // defpackage.lfk
    public final void d(int i) {
        this.w = i;
    }

    @Override // defpackage.lfk
    public final void e(ley leyVar) {
        this.e = leyVar;
    }

    @Override // defpackage.lfk
    public final void f(int i) {
        this.f = i;
    }

    @Override // defpackage.lfk
    public final void g(Surface surface) {
        if (this.e != ley.SURFACE) {
            Log.w("VidRMedCodBdr", "colorformat will be set to SURFACE as a surface is provided");
            this.e = ley.SURFACE;
        }
        this.s = surface;
    }

    @Override // defpackage.lfk
    public final void h(Location location) {
        this.r = plk.V(ojc.i(location));
    }

    @Override // defpackage.lfk
    public final void i(pht phtVar) {
        this.r = phtVar;
    }

    @Override // defpackage.lfk
    public final void j(int i) {
        this.h = i;
    }

    @Override // defpackage.lfk
    public final void k(long j) {
        this.j = plk.V(Long.valueOf(j));
    }

    @Override // defpackage.lfk
    public final void l(long j) {
        this.i = j;
    }

    @Override // defpackage.lfk
    public final void m(MediaCodec.Callback callback) {
        this.u = callback;
    }

    @Override // defpackage.lfk
    public final void n(boolean z) {
        this.o = z;
    }

    @Override // defpackage.lfk
    public final void o(int i) {
        this.k = i;
    }

    @Override // defpackage.lfk
    public final void p(pht phtVar) {
        this.x = phtVar;
    }

    @Override // defpackage.lfk
    public final void q(FileDescriptor fileDescriptor) {
        this.x = plk.V(fileDescriptor);
    }

    @Override // defpackage.lfk
    public final void r(leh lehVar) {
        this.d = lehVar;
    }

    @Override // defpackage.lfk
    public final void s(boolean z) {
        this.p = z;
    }

    public final pht t() {
        pht phtVar = this.x;
        return phtVar != null ? phtVar : plk.V(null);
    }
}

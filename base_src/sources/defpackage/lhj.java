package defpackage;

import android.location.Location;
import android.media.MediaCodec;
import android.util.Log;
import android.view.Surface;
import java.io.FileDescriptor;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class lhj implements lfk {
    public final phv a;
    public final lhd b;
    public final lhc c;
    public lee d;
    public leh e;
    public pht i;
    public Location j;
    public Surface k;
    public lfl l;
    public int f = 0;
    public long g = 0;
    public int h = 0;
    public int m = 6;

    public lhj(lhd lhdVar, phv phvVar, lhc lhcVar) {
        this.a = phvVar;
        this.b = lhdVar;
        this.c = lhcVar;
    }

    @Override // defpackage.lfk
    public final /* bridge */ /* synthetic */ lfj a() {
        if (this.i != null) {
            return new lhk(this);
        }
        throw new IllegalArgumentException("Either Output video file path or descriptor is required");
    }

    @Override // defpackage.lfk
    public final lfk b(lfl lflVar) {
        this.l = lflVar;
        return this;
    }

    @Override // defpackage.lfk
    public final void c(lee leeVar) {
        this.d = leeVar;
    }

    @Override // defpackage.lfk
    public final void d(int i) {
        this.m = i;
    }

    @Override // defpackage.lfk
    public final void e(ley leyVar) {
        if (leyVar == ley.SURFACE) {
            return;
        }
        String strValueOf = String.valueOf(ley.SURFACE);
        String simpleName = lhk.class.getSimpleName();
        String strValueOf2 = String.valueOf(leyVar);
        int length = String.valueOf(strValueOf).length();
        StringBuilder sb = new StringBuilder(length + 36 + String.valueOf(simpleName).length() + String.valueOf(strValueOf2).length());
        sb.append("Only ");
        sb.append(strValueOf);
        sb.append(" is supported for ");
        sb.append(simpleName);
        sb.append(", but we get ");
        sb.append(strValueOf2);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.lfk
    public final void f(int i) {
        throw new UnsupportedOperationException("Color standard is not supported, please use VideoRecorderMediaCodec");
    }

    @Override // defpackage.lfk
    public final void g(Surface surface) {
        this.k = surface;
    }

    @Override // defpackage.lfk
    public final void h(Location location) {
        this.j = location;
    }

    @Override // defpackage.lfk
    public final void i(pht phtVar) {
        try {
            ojc ojcVar = (ojc) phtVar.get();
            if (ojcVar.g()) {
                this.j = (Location) ojcVar.c();
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.w("VidRecMedRec", "Failed to set the location, Ignoring.", e);
        }
    }

    @Override // defpackage.lfk
    public final void j(int i) {
        this.f = i;
    }

    @Override // defpackage.lfk
    public final void k(long j) {
        this.g = j;
    }

    @Override // defpackage.lfk
    public final void l(long j) {
    }

    @Override // defpackage.lfk
    public final void m(MediaCodec.Callback callback) {
        throw new UnsupportedOperationException("Cannot add a MediaCodec's callback with VideoRecorderMediaRecorder, please use VideoRecorderMediaCodec");
    }

    @Override // defpackage.lfk
    public final void n(boolean z) {
        throw new UnsupportedOperationException("Cannot apply synchronous mode with VideoRecorderMediaRecorder, please use VideoRecorderMediaCodec");
    }

    @Override // defpackage.lfk
    public final void o(int i) {
        this.h = i;
    }

    @Override // defpackage.lfk
    public final void p(pht phtVar) {
        this.i = phtVar;
    }

    @Override // defpackage.lfk
    public final void q(FileDescriptor fileDescriptor) {
        this.i = plk.V(fileDescriptor);
    }

    @Override // defpackage.lfk
    public final void r(leh lehVar) {
        this.e = lehVar;
    }

    @Override // defpackage.lfk
    public final void s(boolean z) {
    }
}

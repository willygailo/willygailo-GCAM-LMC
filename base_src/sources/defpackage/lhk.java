package defpackage;

import android.location.Location;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;
import java.io.File;
import java.io.FileDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final class lhk implements lfj {
    public final Object a = new Object();
    public final lhd b;
    public lfl c;
    public int d;
    private final Location e;
    private final FileDescriptor f;
    private final phv g;
    private final int h;
    private final int i;

    public lhk(lhj lhjVar) throws lhb {
        this.g = lhjVar.a;
        pht phtVar = lhjVar.i;
        FileDescriptor fileDescriptor = phtVar != null ? (FileDescriptor) plk.ae(phtVar) : null;
        this.f = fileDescriptor;
        this.h = lhjVar.h;
        this.e = lhjVar.j;
        lhd lhdVar = lhjVar.b;
        this.b = lhdVar;
        int i = lhjVar.m;
        this.i = i;
        lhdVar.f();
        ojc ojcVarH = ojc.h(lhjVar.k);
        leh lehVar = lhjVar.e;
        lee leeVar = lhjVar.d;
        ojc ojcVarH2 = ojc.h(fileDescriptor);
        ojc ojcVarH3 = ojc.h(null);
        ojc ojcVarH4 = ojc.h(lhjVar.j);
        int i2 = lhjVar.h;
        int i3 = lhjVar.f;
        long j = lhjVar.g;
        lhdVar.f();
        if (ojcVarH2.g()) {
            ojcVarH2.c();
            lhdVar.v((FileDescriptor) ojcVarH2.c());
        } else {
            if (!ojcVarH3.g()) {
                Log.e("MedRecPrep", "Either output file path or descriptor should present");
                throw new IllegalArgumentException("Either output file path or descriptor should present");
            }
            ojcVarH3.c();
            lhdVar.w(((File) ojcVarH3.c()).getAbsolutePath());
        }
        if (ojcVarH.g()) {
            ojcVarH.c();
            lhdVar.n((Surface) ojcVarH.c());
        }
        if (leeVar != null) {
            if (i == 0) {
                throw null;
            }
            lhdVar.l(i != 2 ? 5 : 1);
        }
        lhdVar.E();
        lhdVar.x(lehVar.a.d);
        lhdVar.y(lehVar.d);
        if (lehVar.e != -1 && lehVar.f != -1) {
            kde.d(lhdVar.a(), lehVar.e, lehVar.f);
        }
        String.valueOf(String.valueOf(lehVar.b)).length();
        lhdVar.B(lehVar.b.c().a, lehVar.b.c().b);
        lehVar.b();
        lhdVar.z(lehVar.b());
        lehVar.c();
        lhdVar.A(lehVar.c());
        lehVar.a();
        lhdVar.m(lehVar.a());
        if (leeVar != null) {
            lhdVar.j(leeVar.b);
            lhdVar.h(leeVar.e);
            lhdVar.k(leeVar.c);
            String.valueOf(String.valueOf(leeVar.a)).length();
            lhdVar.i(leeVar.a.g);
        }
        if (ojcVarH4.g()) {
            ojcVarH4.c();
            lhdVar.o((float) ((Location) ojcVarH4.c()).getLatitude(), (float) ((Location) ojcVarH4.c()).getLongitude());
        }
        lhdVar.u(i2);
        if (i3 > 0) {
            lhdVar.p(i3);
        }
        if (j > 0) {
            lhdVar.q(j);
        }
        try {
            lhdVar.d();
            lhdVar.s(new lhi(lhjVar));
            lfl lflVar = lhjVar.l;
            if (lflVar != null) {
                this.c = lflVar;
            }
            this.d = 1;
        } catch (lhb e) {
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 58);
            sb.append("immediateFailedFuture: MediaRecorder.prepare() exception: ");
            sb.append(strValueOf);
            Log.e("MedRecPrep", sb.toString());
            throw e;
        }
    }

    @Override // defpackage.lfj
    public final int a() {
        return this.h;
    }

    @Override // defpackage.lfj
    public final MediaCodec b() {
        throw new UnsupportedOperationException("Unsupported operation, please use VideoRecorderMediaCodec instead");
    }

    @Override // defpackage.lfj
    public final ojc c() {
        ojc ojcVarH;
        synchronized (this.a) {
            obr.aQ(this.d != 3);
            ojcVarH = ojc.h(this.b.b());
        }
        return ojcVarH;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            if (this.d == 3) {
                Log.w("VidRecMedRec", "Already stopped");
                return;
            }
            try {
                this.b.D();
                lfl lflVar = this.c;
                if (lflVar != null) {
                    lflVar.c();
                }
            } catch (lhb e) {
                Log.e("VidRecMedRec", "Fails to stop mediarecorder. Perhaps the recording is too short");
            }
            this.d = 3;
        }
    }

    @Override // defpackage.lfj
    public final ojc d() {
        return ojc.h(this.e);
    }

    @Override // defpackage.lfj
    public final ojc e() {
        throw new UnsupportedOperationException("Unsupported operation, please use VideoRecorderMediaCodec instead");
    }

    @Override // defpackage.lfj
    public final ojc f() {
        throw new UnsupportedOperationException("Unsupported operation, please use VideoRecorderMediaCodec instead");
    }

    @Override // defpackage.lfj
    public final pht g() {
        return this.g.submit(new lhe(this, 1));
    }

    @Override // defpackage.lfj
    public final pht h() {
        return this.g.submit(new lhe(this, 0));
    }

    @Override // defpackage.lfj
    public final pht i() {
        throw new UnsupportedOperationException("fast shutdown is not supported, please use VideoRecorderMediaCodec");
    }

    @Override // defpackage.lfj
    public final pht j(lff lffVar) {
        return this.g.submit(new lhg(this, lffVar));
    }

    @Override // defpackage.lfj
    public final pht k() {
        return this.g.submit(new lhh(this));
    }

    @Override // defpackage.lfj
    public final void l(MediaFormat mediaFormat) {
        throw new UnsupportedOperationException("Not supported operation, please use VideoRecorderMediaCodec instead");
    }

    @Override // defpackage.lfj
    public final void m(FileDescriptor fileDescriptor) {
        synchronized (this.a) {
            int i = this.d;
            boolean z = true;
            if (i != 2 && i != 4) {
                z = false;
            }
            obr.aQ(z);
            try {
                this.b.r(fileDescriptor);
            } catch (lhb e) {
                Log.e("VidRecMedRec", "Fail to set next file descriptor.");
                throw new IllegalStateException("Fail to set next file descriptor.", e);
            }
        }
    }

    @Override // defpackage.lfj
    public final void n(int i, MediaCodec.BufferInfo bufferInfo) {
        throw new UnsupportedOperationException("Not supported operation, please use VideoRecorderMediaCodec instead");
    }

    @Override // defpackage.lfj
    public final void o(Object obj) {
        throw new UnsupportedOperationException("Not supported operation, please use VideoRecorderMediaCodec instead");
    }

    @Override // defpackage.lfj
    public final ojc p() {
        return oih.a;
    }

    @Override // defpackage.lfj
    public final void q(float f) {
        throw new UnsupportedOperationException("changeBitrate is not supported, please use VideoRecorderMediaCodec");
    }
}

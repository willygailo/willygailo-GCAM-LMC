package defpackage;

import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.ShotMetadata;

/* JADX INFO: loaded from: classes.dex */
public final class ecp {
    public InterleavedImageU8 a;
    public edo b;
    public HardwareBuffer c;
    public ShotMetadata d;
    public Long e;
    public dzu f;
    public eck g;
    public hlr h;
    private lic i;
    private lzv j;
    private pht k;
    private gog l;

    public ecp() {
    }

    public ecp(ecq ecqVar) {
        this.a = ecqVar.a;
        this.b = ecqVar.b;
        this.c = ecqVar.c;
        this.d = ecqVar.d;
        this.i = ecqVar.e;
        this.j = ecqVar.f;
        this.e = Long.valueOf(ecqVar.g);
        this.f = ecqVar.h;
        this.g = ecqVar.i;
        this.k = ecqVar.j;
        this.l = ecqVar.k;
        this.h = ecqVar.l;
    }

    public final ecq a() {
        lic licVar;
        lzv lzvVar;
        Long l;
        ShotMetadata shotMetadata = this.d;
        if (shotMetadata != null && (licVar = this.i) != null && (lzvVar = this.j) != null && (l = this.e) != null && this.f != null && this.k != null && this.l != null) {
            ecq ecqVar = new ecq(this.a, this.b, this.c, shotMetadata, licVar, lzvVar, l.longValue(), this.f, this.g, this.k, this.l, this.h);
            int i = ecqVar.a != null ? 1 : 0;
            if (ecqVar.b != null) {
                i++;
            }
            if (ecqVar.c != null) {
                i++;
            }
            if (i == 1) {
                return ecqVar;
            }
            StringBuilder sb = new StringBuilder(50);
            sb.append("We need exactly one image set; we have ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.d == null) {
            sb2.append(" shotMetadata");
        }
        if (this.i == null) {
            sb2.append(" orientation");
        }
        if (this.j == null) {
            sb2.append(" metadata");
        }
        if (this.e == null) {
            sb2.append(" timestampNs");
        }
        if (this.f == null) {
            sb2.append(" gcaShotSettings");
        }
        if (this.k == null) {
            sb2.append(" mergedPdData");
        }
        if (this.l == null) {
            sb2.append(" pictureTakerParameters");
        }
        String strValueOf = String.valueOf(sb2);
        StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb3.append("Missing required properties:");
        sb3.append(strValueOf);
        throw new IllegalStateException(sb3.toString());
    }

    public final void b() {
        this.b = null;
        this.a = null;
        this.c = null;
    }

    public final void c(pht phtVar) {
        if (phtVar == null) {
            throw new NullPointerException("Null mergedPdData");
        }
        this.k = phtVar;
    }

    public final void d(lzv lzvVar) {
        if (lzvVar == null) {
            throw new NullPointerException("Null metadata");
        }
        this.j = lzvVar;
    }

    public final void e(lic licVar) {
        if (licVar == null) {
            throw new NullPointerException("Null orientation");
        }
        this.i = licVar;
    }

    public final void f(gog gogVar) {
        if (gogVar == null) {
            throw new NullPointerException("Null pictureTakerParameters");
        }
        this.l = gogVar;
    }

    public final void g(long j) {
        this.e = Long.valueOf(j);
    }
}

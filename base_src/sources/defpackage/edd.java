package defpackage;

import android.util.DisplayMetrics;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.ShotParams;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;
import com.google.googlex.gcam.hdrplus.HdrPlusInterface;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class edd {
    public static final ouj a = ouj.h("com/google/android/apps/camera/hdrplus/Shot");
    public final gog c;
    public final List d;
    public final List e;
    public final HdrPlusInterface f;
    public final pkz g;
    public final InterleavedU8ClientAllocator h;
    public final pjr i;
    public final InterleavedU8ClientAllocator j;
    public final pjr k;
    public final pjo l;
    public final edf m;
    public final ShotParams n;
    public final ecb o;
    public final lzv p;
    public final edc r;
    public int q = 1;
    public int b = GcamModuleJNI.kInvalidShotId_get();

    public edd(edf edfVar, DisplayMetrics displayMetrics, gog gogVar, int i, iio iioVar, dei deiVar, djs djsVar, ShotParams shotParams, ecb ecbVar, lzv lzvVar) {
        HdrPlusInterface hdrPlusInterface = new HdrPlusInterface();
        this.f = hdrPlusInterface;
        this.g = new pkz(hdrPlusInterface);
        this.m = edfVar;
        this.c = gogVar;
        this.n = new ShotParams(shotParams);
        this.o = ecbVar;
        this.p = lzvVar;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.r = new edc(this, i, edfVar, deiVar, djsVar, iioVar);
        if (edfVar.g().g()) {
            this.h = new pjm(displayMetrics);
            this.i = null;
        } else if (edfVar.h().g()) {
            this.h = null;
            this.i = new pjr();
        } else {
            if (edfVar.f().g()) {
                this.h = new pjn(288L, 32L);
            } else {
                this.h = null;
            }
            this.i = null;
        }
        if (edfVar.e().g()) {
            this.l = new pjo();
        } else {
            this.l = null;
        }
        if (edfVar.k().g()) {
            this.j = new pjp();
            this.k = null;
        } else if (edfVar.l().g()) {
            this.j = new pjn(307L, 51L);
            this.k = null;
        } else if (edfVar.n().g()) {
            this.k = new pjr();
            this.j = null;
        } else {
            this.j = null;
            this.k = null;
        }
    }

    public final int a() {
        obr.aR(this.b != GcamModuleJNI.kInvalidShotId_get(), "setShotId() has not been called on this Shot.");
        return this.b;
    }
}

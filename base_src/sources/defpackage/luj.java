package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class luj {
    public final lue a;
    public final lnf b;
    public final ljf c;
    public final lis d;
    public final lrx e;
    public final Set f;
    public final int g;
    public final lap h;

    public luj(lnf lnfVar, lue lueVar, lap lapVar, lis lisVar, ljf ljfVar, lrx lrxVar, lvq lvqVar) {
        this.b = lnfVar;
        this.a = lueVar;
        this.h = lapVar;
        this.c = ljfVar;
        this.e = lrxVar;
        this.d = lisVar.a("StreamMap");
        this.f = ((lvo) lvqVar.a(lnfVar.a)).b;
        this.g = 64 - ((Byte) lvqVar.a(lnfVar.a).m(CameraCharacteristics.REQUEST_PIPELINE_MAX_DEPTH, (byte) 8)).byteValue();
    }
}

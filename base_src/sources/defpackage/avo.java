package defpackage;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes.dex */
final class avo extends awr {
    public static final axo a = new axo("AndCamAgntImp");
    private static final axg h = new auu();
    public awz b;
    public avp c;
    public final avh d;
    public final axi e;
    public final axk f;
    public axg g;
    private final HandlerThread j;

    public avo() {
        this.g = h;
        HandlerThread handlerThread = new HandlerThread("Camera Handler Thread");
        this.j = handlerThread;
        handlerThread.start();
        avh avhVar = new avh(this, this, handlerThread.getLooper());
        this.d = avhVar;
        this.g = new axg(avhVar);
        this.e = new axi();
        axk axkVar = new axk(avhVar, handlerThread);
        this.f = axkVar;
        axkVar.start();
    }

    @Override // defpackage.awr
    protected final Handler a() {
        return this.d;
    }

    @Override // defpackage.awr
    public final axa b() {
        return auw.c();
    }

    @Override // defpackage.awr
    public final axg c() {
        return this.g;
    }

    @Override // defpackage.awr
    protected final axi d() {
        return this.e;
    }

    @Override // defpackage.awr
    public final axk e() {
        return this.f;
    }

    @Override // defpackage.awr
    public final void f(axg axgVar) {
        this.g = axgVar;
    }
}

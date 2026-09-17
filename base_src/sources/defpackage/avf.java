package defpackage;

import android.hardware.Camera;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
final class avf extends awl {
    final /* synthetic */ avo a;
    private final awr b;
    private final int c;
    private final Camera d;
    private final avp e;

    public avf(avo avoVar, awr awrVar, int i, Camera camera, avp avpVar) {
        this.a = avoVar;
        this.b = awrVar;
        this.d = camera;
        this.c = i;
        this.e = avpVar;
    }

    @Override // defpackage.awl
    public final int a() {
        return this.c;
    }

    @Override // defpackage.awl
    @Deprecated
    public final Camera.Parameters b() {
        awq awqVar = new awq();
        Camera.Parameters[] parametersArr = new Camera.Parameters[1];
        try {
            this.a.f.b(new aux(this, parametersArr, awqVar), awqVar.b, "get parameters");
        } catch (RuntimeException e) {
            ((avo) this.b).g.c(e);
        }
        return parametersArr[0];
    }

    @Override // defpackage.awl
    public final Handler c() {
        return this.a.d;
    }

    @Override // defpackage.awl
    public final awr d() {
        return this.b;
    }

    @Override // defpackage.awl
    public final awy e() {
        return new avp(this.e);
    }

    @Override // defpackage.awl
    public final axh f() {
        return new avq(this.e, b());
    }

    @Override // defpackage.awl
    public final axi g() {
        return this.a.e;
    }

    @Override // defpackage.awl
    public final axk h() {
        return this.a.f;
    }

    @Override // defpackage.awl
    public final void j(Handler handler, avu avuVar) {
        this.a.f.a(new avb(this, new ava(this, handler, avuVar)));
    }

    @Override // defpackage.awl
    public final void m(axh axhVar) {
        s(axhVar, 6);
    }

    @Override // defpackage.awl
    public final void o(Handler handler, fde fdeVar, awc awcVar, awc awcVar2) {
        try {
            this.a.f.a(new ave(this, handler, fdeVar, awcVar, new avd(this, handler, awcVar2)));
        } catch (RuntimeException e) {
            ((avo) this.b).g.c(e);
        }
    }

    @Override // defpackage.awl
    public final void p(Handler handler, fde fdeVar) {
        this.a.f.a(new auy(this, handler, fdeVar, 1, null));
    }

    @Override // defpackage.awl
    public final void q(Handler handler, fde fdeVar) {
        this.a.f.a(new auy(this, handler, fdeVar, 0, null));
    }
}

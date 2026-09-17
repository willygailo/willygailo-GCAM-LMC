package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
final class aui extends awl {
    public final awz a;
    final /* synthetic */ aur c;
    private final aur d;
    private final int e;
    private final aus f;
    private axh g = null;
    public boolean b = true;

    public aui(aur aurVar, aur aurVar2, int i, awz awzVar, CameraCharacteristics cameraCharacteristics) {
        this.c = aurVar;
        this.d = aurVar2;
        this.e = i;
        this.a = awzVar;
        this.f = new aus(cameraCharacteristics);
    }

    @Override // defpackage.awl
    public final int a() {
        return this.e;
    }

    @Override // defpackage.awl
    public final Camera.Parameters b() {
        return null;
    }

    @Override // defpackage.awl
    public final Handler c() {
        return this.c.b;
    }

    @Override // defpackage.awl
    public final awr d() {
        return this.d;
    }

    @Override // defpackage.awl
    public final awy e() {
        return this.f;
    }

    @Override // defpackage.awl
    public final axh f() {
        if (this.g == null) {
            this.g = this.c.b.b();
        }
        return this.g;
    }

    @Override // defpackage.awl
    public final axi g() {
        return this.c.c;
    }

    @Override // defpackage.awl
    public final axk h() {
        return this.c.d;
    }

    @Override // defpackage.awl
    public final void i(byte[] bArr) {
    }

    @Override // defpackage.awl
    public final void j(Handler handler, avu avuVar) {
        try {
            this.c.d.a(new aue(this, avuVar, handler));
        } catch (RuntimeException e) {
            this.d.g.c(e);
        }
    }

    @Override // defpackage.awl
    public final void k(boolean z) {
        this.b = z;
    }

    @Override // defpackage.awl
    public final void l(SurfaceTexture surfaceTexture) {
        f().g = true;
        super.l(surfaceTexture);
    }

    @Override // defpackage.awl
    public final void m(axh axhVar) {
        if (axhVar == null) {
            axp.c(aur.a, "null parameters in applySettings()");
        } else if (!(axhVar instanceof aut)) {
            axp.a(aur.a, "Provided settings not compatible with the backing framework API");
        } else if (s(axhVar, -2)) {
            this.g = axhVar;
        }
    }

    @Override // defpackage.awl
    public final void n() {
        f().g = true;
        super.l(null);
    }

    @Override // defpackage.awl
    public final void o(Handler handler, fde fdeVar, awc awcVar, awc awcVar2) {
        try {
            this.c.d.a(new auh(this, new auq(this, fdeVar, handler, awcVar2)));
        } catch (RuntimeException e) {
            this.d.g.c(e);
        }
    }

    @Override // defpackage.awl
    public final void p(Handler handler, fde fdeVar) {
    }

    @Override // defpackage.awl
    public final void q(Handler handler, fde fdeVar) {
    }
}

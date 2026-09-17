package defpackage;

import android.view.Window;
import android.view.WindowManager;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: loaded from: classes.dex */
public class crw extends csa {
    private final kas a;
    private final Window b;
    private final jfn c;
    private final jdy d;
    public final BottomBarController e;
    public final jlb f;
    public final jak g;
    public final csb h;
    public csa i;

    public crw(BottomBarController bottomBarController, jlb jlbVar, kas kasVar, Window window, jak jakVar, jdy jdyVar, jfn jfnVar, csb csbVar, byte[] bArr, byte[] bArr2) {
        this.e = bottomBarController;
        this.f = jlbVar;
        this.a = kasVar;
        this.b = window;
        this.g = jakVar;
        this.d = jdyVar;
        this.c = jfnVar;
        this.h = csbVar;
    }

    @Override // defpackage.csa, defpackage.ihs, defpackage.iht
    public void f() {
        this.d.h();
        this.e.switchToMode(jrl.VIDEO_INTENT);
        this.f.ai(jrl.VIDEO_INTENT);
        WindowManager.LayoutParams attributes = this.b.getAttributes();
        attributes.rotationAnimation = 3;
        this.b.setAttributes(attributes);
        this.a.p(false);
        this.a.v(true);
        kas kasVar = this.a;
        if (((kbi) kasVar).L) {
            kasVar.h();
        }
        this.c.c();
        this.g.d(true);
    }

    @Override // defpackage.crx
    public final boolean fK() {
        return this.i.fK();
    }

    @Override // defpackage.csa, defpackage.ihs, defpackage.iht
    public void g() {
        this.a.v(false);
        this.a.p(false);
        this.c.m();
    }

    @Override // defpackage.crx
    public final int j() {
        this.i.j();
        return this.i.j();
    }
}

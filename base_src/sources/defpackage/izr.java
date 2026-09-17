package defpackage;

import android.view.Window;
import android.view.WindowManager;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: loaded from: classes2.dex */
public class izr extends izo {
    private final lda a;
    private final Window b;
    private final jfn c;
    public final BottomBarController d;
    public final jlb e;
    public final kas f;
    public final jak g;
    public final gtg h;
    private final jdy i;

    public izr(lda ldaVar, BottomBarController bottomBarController, jlb jlbVar, kas kasVar, Window window, jak jakVar, jdy jdyVar, gtg gtgVar, jfn jfnVar, byte[] bArr, byte[] bArr2) {
        this.a = ldaVar;
        this.d = bottomBarController;
        this.e = jlbVar;
        this.b = window;
        this.g = jakVar;
        this.i = jdyVar;
        bottomBarController.switchToMode(jrl.IMAGE_INTENT);
        jlbVar.ai(jrl.IMAGE_INTENT);
        this.f = kasVar;
        this.h = gtgVar;
        this.c = jfnVar;
    }

    @Override // defpackage.izo, defpackage.ihs, defpackage.iht
    public void f() {
        WindowManager.LayoutParams attributes = this.b.getAttributes();
        attributes.rotationAnimation = 3;
        this.b.setAttributes(attributes);
        this.i.h();
        this.a.fB(jrl.IMAGE_INTENT);
        this.f.v(true);
        kas kasVar = this.f;
        if (((kbi) kasVar).L) {
            kasVar.h();
        }
        this.f.p(false);
        this.c.c();
    }

    @Override // defpackage.izo, defpackage.ihs, defpackage.iht
    public void g() {
        this.f.v(false);
        this.f.p(false);
        this.c.m();
    }
}

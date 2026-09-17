package defpackage;

import android.content.Context;
import com.google.android.apps.camera.ui.mars.MarsSwitch;
import com.google.android.apps.camera.ui.popupmenu.PopupMenuButton;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class jdk implements fik, fii, fig {
    public static final ouj a = ouj.h("com/google/android/apps/camera/ui/mars/MarsSwitchController");
    public final Context b;
    public final lar c;
    public final Executor d;
    public final hug e;
    public final jcz f;
    public final ddf g;
    public boolean h = false;
    public MarsSwitch i;
    public jsh j;
    public jhs k;

    public jdk(Context context, hug hugVar, jcz jczVar, lar larVar, Executor executor, ddf ddfVar) {
        this.b = context;
        this.c = larVar;
        this.d = executor;
        this.e = hugVar;
        this.f = jczVar;
        this.g = ddfVar;
    }

    public static pht a(Executor executor, Context context) {
        return plk.Z(new nhv(context, 1), executor);
    }

    public final void b() {
        MarsSwitch marsSwitch = this.i;
        if (marsSwitch != null) {
            marsSwitch.a.b();
        }
        jsh jshVar = this.j;
        if (jshVar != null) {
            jshVar.c();
        }
    }

    public final void e() {
        jsh jshVar = this.j;
        if (jshVar != null) {
            jshVar.d();
        }
    }

    public final void f() {
        lar larVar = this.c;
        larVar.getClass();
        larVar.c(new Runnable() { // from class: jdf
            @Override // java.lang.Runnable
            public final void run() {
                jdk jdkVar = this.a;
                jhs jhsVar = jdkVar.k;
                if (jhsVar != null) {
                    jhsVar.e(hss.MEDIA_STORE);
                }
                hug hugVar = jdkVar.e;
                hugVar.getClass();
                hugVar.e(htu.ab, false);
                ((oug) ((oug) jdk.a.c()).G((char) 3260)).o("Mars not set up");
            }
        });
    }

    @Override // defpackage.fig
    public final void fV() {
        plk.af(a(this.d, this.b), new jdi(this), this.d);
    }

    @Override // defpackage.fii
    public final void fW() {
        MarsSwitch marsSwitch = this.i;
        if (marsSwitch == null) {
            return;
        }
        final PopupMenuButton popupMenuButton = marsSwitch.b;
        if (popupMenuButton.getVisibility() == 0 && mip.en(popupMenuButton)) {
            popupMenuButton.setVisibility(4);
            popupMenuButton.postDelayed(new Runnable() { // from class: jdg
                @Override // java.lang.Runnable
                public final void run() {
                    popupMenuButton.setVisibility(0);
                }
            }, 2000L);
        }
    }

    public final void g(boolean z) {
        jhs jhsVar = this.k;
        if (jhsVar != null) {
            jhsVar.e(z ? hss.MARS_STORE : hss.MEDIA_STORE);
        } else {
            this.h = z;
        }
    }
}

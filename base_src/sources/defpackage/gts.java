package defpackage;

import android.util.SparseArray;
import android.view.View;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.optionsbar.common.LinearMinibarImpl;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class gts implements gtu {
    public final qkg a;
    public LinearMinibarImpl b;
    private final SparseArray c = new SparseArray();
    private final SparseArray d = new SparseArray();

    public gts(qkg qkgVar) {
        this.a = qkgVar;
    }

    private final boolean m() {
        return this.c.indexOfKey(R.drawable.gm_filled_record_voice_over_white_24) >= 0;
    }

    @Override // defpackage.gtu
    public final void a() {
        LinearMinibarImpl linearMinibarImpl = this.b;
        linearMinibarImpl.a().animate().rotationX(0.0f).setDuration(250L).start();
        linearMinibarImpl.a().setContentDescription(linearMinibarImpl.getResources().getString(R.string.options_menu_button_desc));
    }

    @Override // defpackage.gtu
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.gtu
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.gtu
    public final void d() {
        LinearMinibarImpl linearMinibarImpl = this.b;
        linearMinibarImpl.a().animate().rotationX(180.0f).setDuration(60L).start();
        linearMinibarImpl.a().setContentDescription(linearMinibarImpl.getResources().getString(R.string.options_menu_close_desc));
    }

    public final void e() {
        this.b.setEnabled(false);
        LinearMinibarImpl linearMinibarImpl = this.b;
        linearMinibarImpl.a().setVisibility(8);
        linearMinibarImpl.b().setVisibility(8);
    }

    public final void f() {
        if (this.b.v()) {
            this.b.a().setVisibility(0);
            g();
            this.b.setEnabled(true);
        }
    }

    public final void g() {
        LinearMinibarImpl linearMinibarImpl = this.b;
        for (int childCount = linearMinibarImpl.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = linearMinibarImpl.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && !childAt.equals(linearMinibarImpl.a())) {
                return;
            }
        }
        this.b.n(true);
    }

    public final void h(htf htfVar) {
        if (htf.OFF.equals(htfVar)) {
            this.b.l(htf.OFF);
            f();
        } else {
            e();
            this.b.l(htfVar);
        }
    }

    public final void i(boolean z) {
        if (z) {
            this.b.n(false);
            this.b.m(true);
        } else {
            this.b.m(false);
            g();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [gtt, java.lang.Object] */
    public final void j(hth hthVar, String str) {
        boolean zH = this.a.get().H();
        hth hthVar2 = hth.EXT_WIRED;
        hth hthVar3 = hth.EXT_BLUETOOTH;
        if (zH) {
            if (hthVar == hthVar2) {
                this.b.t(false, str);
                this.b.n(false);
                this.b.u(true);
                return;
            } else if (hthVar == hthVar3) {
                this.b.u(false);
                this.b.n(false);
                this.b.t(true, str);
                return;
            }
        }
        this.b.t(false, str);
        this.b.u(false);
        g();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [gtt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [gtt, java.lang.Object] */
    public final void k() {
        boolean zD = this.a.get().D();
        boolean z = zD && this.a.get().G() && this.b.v();
        this.b.setVisibility(true != zD ? 8 : 0);
        this.b.setEnabled(z);
    }

    public final void l(String str, boolean z) {
        gtr gtrVar;
        try {
            if (!this.d.contains(R.drawable.gm_filled_record_voice_over_white_24)) {
                this.d.put(R.drawable.gm_filled_record_voice_over_white_24, new HashSet());
            }
        } catch (Throwable unused) {
        }
        Set set = (Set) this.d.get(R.drawable.gm_filled_record_voice_over_white_24);
        if (z) {
            set.add(str);
        } else {
            set.remove(str);
        }
        if (!set.isEmpty()) {
            if (m()) {
                return;
            }
            if (this.c.indexOfValue(gtr.ITEM_1) < 0) {
                this.b.j(true, R.drawable.gm_filled_record_voice_over_white_24, R.string.speech_enhance_on_desc);
                gtrVar = gtr.ITEM_1;
            } else {
                if (this.c.indexOfValue(gtr.ITEM_2) >= 0) {
                    throw new IllegalStateException("Both extended items are occupied.");
                }
                this.b.k(true, R.drawable.gm_filled_record_voice_over_white_24, R.string.speech_enhance_on_desc);
                gtrVar = gtr.ITEM_2;
            }
            this.c.put(R.drawable.gm_filled_record_voice_over_white_24, gtrVar);
            return;
        }
        if (m()) {
            gtr gtrVar2 = (gtr) this.c.get(R.drawable.gm_filled_record_voice_over_white_24);
            this.c.delete(R.drawable.gm_filled_record_voice_over_white_24);
            gtr gtrVar3 = gtr.ITEM_1;
            switch (gtrVar2) {
                case ITEM_1:
                    this.b.j(false, 0, 0);
                    return;
                case ITEM_2:
                    this.b.k(false, 0, 0);
                    return;
                default:
                    return;
            }
        }
    }
}

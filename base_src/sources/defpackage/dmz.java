package defpackage;

import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.evcomp.EvCompView;

/* JADX INFO: loaded from: classes.dex */
class dmz extends dmu {
    final /* synthetic */ dna a;

    public dmz(dna dnaVar) {
        this.a = dnaVar;
    }

    @Override // defpackage.dmu
    public void b(dmg dmgVar) {
        String string;
        EvCompView evCompView = this.a.a;
        if (((dme) ((lce) evCompView.b).d).equals(dme.SINGLE)) {
            string = evCompView.getContext().getResources().getString(R.string.ev_announcement, EvCompView.d(evCompView.k));
        } else if (dmgVar.equals(dmg.BRIGHTNESS)) {
            string = evCompView.getContext().getResources().getString(R.string.brightness_ev_announcement, EvCompView.d(evCompView.k));
        } else {
            if (!dmgVar.equals(dmg.SHADOW)) {
                return;
            }
            string = evCompView.getContext().getResources().getString(R.string.shadow_ev_announcement, EvCompView.d(evCompView.l));
        }
        evCompView.announceForAccessibility(string);
    }

    @Override // defpackage.dmu
    public final void d(float f, dmg dmgVar) {
        this.a.k.fB(false);
        this.a.m(f, dmgVar);
    }

    @Override // defpackage.dmu, defpackage.ihs, defpackage.iht
    public final void f() {
        this.a.c.fB(true);
    }

    @Override // defpackage.dmu, defpackage.ihs, defpackage.iht
    public final void g() {
        this.a.c.fB(false);
    }
}

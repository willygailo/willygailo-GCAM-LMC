package defpackage;

import android.animation.ObjectAnimator;
import android.widget.CheckBox;
import com.google.android.apps.camera.evcomp.EvCompView;

/* JADX INFO: loaded from: classes.dex */
public class dmt extends dmo {
    public final EvCompView a;
    public final CheckBox b;
    public final ObjectAnimator c;
    public final dna d;
    public final lda e;

    public dmt(EvCompView evCompView, CheckBox checkBox, ObjectAnimator objectAnimator, dna dnaVar, huq huqVar, byte[] bArr) {
        this.a = evCompView;
        this.b = checkBox;
        this.c = objectAnimator;
        this.d = dnaVar;
        this.e = huqVar.b;
        objectAnimator.addListener(new dmp(evCompView));
    }

    public final void i(boolean z, boolean z2) {
        if (z2) {
            this.d.j();
        }
        if (z) {
            this.c.start();
        } else {
            this.c.cancel();
            this.a.setAlpha(1.0f);
        }
    }
}

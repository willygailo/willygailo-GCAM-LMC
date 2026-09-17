package defpackage;

import android.R;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
final class eps implements oct {
    final /* synthetic */ AnimatedVectorDrawable a;
    final /* synthetic */ AnimatedVectorDrawable b;
    final /* synthetic */ epw c;

    public eps(epw epwVar, AnimatedVectorDrawable animatedVectorDrawable, AnimatedVectorDrawable animatedVectorDrawable2) {
        this.c = epwVar;
        this.a = animatedVectorDrawable;
        this.b = animatedVectorDrawable2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0048 A[Catch: all -> 0x0058, TRY_LEAVE, TryCatch #0 {all -> 0x0058, blocks: (B:7:0x0038, B:9:0x003c, B:12:0x0048), top: B:20:0x0038 }] */
    @Override // defpackage.ocs
    public final void a(ocx ocxVar) {
        View view = ocxVar.e;
        view.getClass();
        epw.b((TextView) view.findViewById(R.id.text1), epr.a);
        Object obj = ocxVar.a;
        obj.getClass();
        epw epwVar = this.c;
        AnimatedVectorDrawable animatedVectorDrawable = ((esn) obj).equals(esn.ACTION) ? this.a : this.b;
        animatedVectorDrawable.registerAnimationCallback(new epu(epwVar, animatedVectorDrawable));
        animatedVectorDrawable.start();
        epw epwVar2 = this.c;
        try {
            if (epwVar2.d) {
                epwVar2.e = (esn) obj;
            } else {
                if (((esn) obj).equals(epwVar2.c)) {
                    epwVar2.e = (esn) obj;
                }
            }
            epwVar2.d = true;
            iuv iuvVar = this.c.i;
            if (iuvVar != null) {
                iuvVar.d = 0;
            }
        } catch (Throwable th) {
            epwVar2.d = true;
            throw th;
        }
    }

    @Override // defpackage.ocs
    public final void b(ocx ocxVar) {
        View view = ocxVar.e;
        view.getClass();
        epw.b((TextView) view.findViewById(R.id.text1), epr.c);
        Object obj = ocxVar.a;
        obj.getClass();
        epw.c(((esn) obj).equals(esn.ACTION) ? this.a : this.b);
        this.c.a();
    }

    @Override // defpackage.ocs
    public final void c() {
    }
}

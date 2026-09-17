package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class jfd extends AnimatorListenerAdapter {
    final /* synthetic */ jfj a;

    public jfd(jfj jfjVar) {
        this.a = jfjVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.e();
        jfj jfjVar = this.a;
        if (jfjVar.t.g()) {
            ((Runnable) jfjVar.t.c()).run();
            jfjVar.t = oih.a;
        }
        try {
            Iterator it = jfjVar.E.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            jfjVar.E.clear();
        } catch (Throwable th) {
            jfjVar.E.clear();
            throw th;
        }
    }
}

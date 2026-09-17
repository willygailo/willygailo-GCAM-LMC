package defpackage;

import android.animation.Animator;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
final class jfq implements jrp {
    final /* synthetic */ jfs a;
    private final /* synthetic */ int b;

    public jfq(jfs jfsVar, int i) {
        this.b = i;
        this.a = jfsVar;
    }

    @Override // defpackage.jrp
    public final void setColor(int i) {
        switch (this.b) {
            case 0:
                Animator animator = this.a.n;
                if (animator != null) {
                    animator.end();
                }
                jfs jfsVar = this.a;
                jfsVar.i = i;
                TextView textView = jfsVar.h;
                if (textView != null) {
                    textView.setTextColor(i);
                }
                break;
            case 1:
                jfs jfsVar2 = this.a;
                jfsVar2.k = i;
                jfsVar2.m.setTint(i);
                this.a.invalidate();
                break;
            default:
                Animator animator2 = this.a.n;
                if (animator2 != null) {
                    animator2.end();
                }
                jfs jfsVar3 = this.a;
                jfsVar3.j = i;
                for (TextView textView2 : jfsVar3.b.values()) {
                    if (textView2.equals(this.a.h)) {
                        textView2.setTextColor(this.a.i);
                    } else {
                        textView2.setTextColor(this.a.j);
                    }
                }
                break;
        }
    }
}

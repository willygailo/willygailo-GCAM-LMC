package defpackage;

import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class emg implements pys {
    private final emb a;

    public emg(emb embVar) {
        this.a = embVar;
    }

    public static Window b(emb embVar) {
        Window window = embVar.a.getWindow();
        qmd.ae(window);
        return window;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Window get() {
        return b(this.a);
    }
}

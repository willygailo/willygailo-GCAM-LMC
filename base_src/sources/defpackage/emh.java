package defpackage;

import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public final class emh implements pys {
    private final emb a;

    public emh(emb embVar) {
        this.a = embVar;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final WindowManager get() {
        WindowManager windowManager = this.a.a.getWindowManager();
        qmd.ae(windowManager);
        return windowManager;
    }
}

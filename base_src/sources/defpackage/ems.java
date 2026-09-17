package defpackage;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
public final class ems implements pys {
    private final qkg a;

    public ems(qkg qkgVar) {
        this.a = qkgVar;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AccessibilityManager get() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) ((emr) this.a.get()).a(emr.d);
        qmd.ae(accessibilityManager);
        return accessibilityManager;
    }
}

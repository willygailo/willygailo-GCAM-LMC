package defpackage;

import com.google.android.apps.camera.focusindicator.FocusIndicatorRingView;

/* JADX INFO: loaded from: classes.dex */
public final class dur implements pys {
    private final dup a;

    public dur(dup dupVar) {
        this.a = dupVar;
    }

    public static FocusIndicatorRingView b(dup dupVar) {
        FocusIndicatorRingView focusIndicatorRingView = dupVar.c;
        qmd.ae(focusIndicatorRingView);
        return focusIndicatorRingView;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final FocusIndicatorRingView get() {
        return b(this.a);
    }
}

package defpackage;

import com.google.android.apps.camera.ui.views.ToggleUi;

/* JADX INFO: loaded from: classes2.dex */
public final class jbq {
    public final ddf a;
    public ToggleUi b;

    public jbq(ddf ddfVar) {
        this.a = ddfVar;
    }

    public final void a() {
        ToggleUi toggleUi = this.b;
        if (toggleUi != null) {
            toggleUi.setVisibility(8);
        }
    }

    public final void b() {
        ToggleUi toggleUi = this.b;
        if (toggleUi != null) {
            toggleUi.setVisibility(0);
        }
    }
}

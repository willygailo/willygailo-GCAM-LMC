package defpackage;

import android.view.Window;
import com.google.android.apps.camera.bottombar.R;

/* JADX INFO: loaded from: classes2.dex */
final class je implements lj {
    final /* synthetic */ jh a;
    private boolean b;

    public je(jh jhVar) {
        this.a = jhVar;
    }

    @Override // defpackage.lj
    public final void a(kw kwVar, boolean z) {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.a.f();
        Window.Callback callback = this.a.c;
        if (callback != null) {
            callback.onPanelClosed(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, kwVar);
        }
        this.b = false;
    }

    @Override // defpackage.lj
    public final boolean b(kw kwVar) {
        Window.Callback callback = this.a.c;
        if (callback == null) {
            return false;
        }
        callback.onMenuOpened(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, kwVar);
        return true;
    }
}

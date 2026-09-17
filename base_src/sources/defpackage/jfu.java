package defpackage;

import android.view.View;
import com.google.android.apps.camera.ui.modeswitcher.ModeSwitcher;

/* JADX INFO: loaded from: classes2.dex */
public final class jfu implements View.OnClickListener {
    final /* synthetic */ jrl a;
    final /* synthetic */ ModeSwitcher b;

    public jfu(ModeSwitcher modeSwitcher, jrl jrlVar) {
        this.b = modeSwitcher;
        this.a = jrlVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        jty.e(view);
        ModeSwitcher modeSwitcher = this.b;
        fjs fjsVar = modeSwitcher.h;
        if (fjsVar != null) {
            fjsVar.aa(3, modeSwitcher.k.toString(), this.a.toString());
        }
        this.b.h(this.a);
    }
}

package defpackage;

import android.content.Context;
import android.view.ViewStub;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.views.MainActivityLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class jpg implements jqn {
    private final ojc a;
    private final qkg b;
    private final Context c;

    public jpg(ojc ojcVar, qkg qkgVar, Context context) {
        this.a = ojcVar;
        this.b = qkgVar;
        this.c = context;
    }

    @Override // defpackage.jqn
    public final void a() {
        if (this.a.g()) {
            ((bys) this.a.c()).g((ViewStub) ((jnr) this.b.get()).c.c(R.id.toggle_ui), this.c);
            MainActivityLayout mainActivityLayout = (MainActivityLayout) ((jnr) this.b.get()).c.c(R.id.activity_root_view);
            mainActivityLayout.l = this.a;
            mainActivityLayout.j();
        }
    }
}

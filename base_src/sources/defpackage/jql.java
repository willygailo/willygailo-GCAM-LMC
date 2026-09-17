package defpackage;

import android.view.ViewStub;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class jql implements jqn {
    private final jiy a;
    private final qkg b;
    private final ddf c;
    private final elw d;
    private final fhv e;

    public jql(jiy jiyVar, qkg qkgVar, ddf ddfVar, fhv fhvVar, elw elwVar) {
        this.a = jiyVar;
        this.b = qkgVar;
        this.c = ddfVar;
        this.e = fhvVar;
        this.d = elwVar;
    }

    @Override // defpackage.jqn
    public final void a() {
        if (this.c.k(ddl.ba)) {
            ViewStub viewStub = (ViewStub) ((jnr) this.b.get()).c.c(R.id.camera_remote_control_layout_stub);
            jiy jiyVar = this.a;
            elw elwVar = this.d;
            jiyVar.d = viewStub;
            jiyVar.e = elwVar;
            this.e.e(jiyVar);
        }
    }
}

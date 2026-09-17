package defpackage;

import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.gridlines.GridLinesUi;

/* JADX INFO: loaded from: classes2.dex */
public final class jps implements jqn {
    private final qkg a;
    private final lco b;
    private final lar c;
    private final bqg d;

    public jps(qkg qkgVar, bqg bqgVar, huf hufVar, lar larVar) {
        this.a = qkgVar;
        this.d = bqgVar;
        this.b = hufVar.a(htu.c);
        this.c = larVar;
    }

    @Override // defpackage.jqn
    public final void a() {
        this.d.i().c(this.b.a(new jpr((GridLinesUi) ((jnr) this.a.get()).c.c(R.id.grid_lines)), this.c));
    }
}

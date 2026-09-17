package defpackage;

import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes.dex */
public final class fkt implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;

    public fkt(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fks get() {
        fks fksVar = new fks(((emd) this.a).get(), (lar) this.b.get(), (pht) this.c.get(), (ddf) this.d.get(), (iud) this.e.get());
        fksVar.b.add(fksVar.h(fksVar.k.getString(R.string.cuttlefish_capture_text_1), 4000, 9));
        fksVar.b.add(fksVar.h(fksVar.k.getString(R.string.cuttlefish_capture_text_2), 4000, 9));
        fksVar.f = fksVar.h(fksVar.k.getString(R.string.cuttlefish_capture_text_3), 4000, 9);
        fksVar.d = fksVar.h(fksVar.k.getString(R.string.cuttlefish_stable_text), -1, 7);
        fksVar.e = fksVar.h(fksVar.k.getString(R.string.cuttlefish_hold_steady_advice), -1, 10);
        fksVar.g = fksVar.h(fksVar.k.getString(R.string.cuttlefish_capturing_first), -1, 9);
        fksVar.c = fksVar.h(fksVar.k.getString(R.string.cuttlefish_almost_stable_text), -1, 7);
        fksVar.h = fksVar.h(fksVar.k.getString(R.string.cuttlefish_zoom_advice_text), -1, 7);
        return fksVar;
    }
}

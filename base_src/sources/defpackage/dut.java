package defpackage;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class dut implements pys {
    private final dup a;

    public dut(dup dupVar) {
        this.a = dupVar;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Resources get() {
        Resources resources = this.a.b;
        qmd.ae(resources);
        return resources;
    }
}

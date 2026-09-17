package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class qot implements qoj {
    public final qoj a;
    public final qmu b;
    private final /* synthetic */ int c;

    public qot(qoj qojVar, qmu qmuVar, int i) {
        this.c = i;
        this.a = qojVar;
        this.b = qmuVar;
    }

    @Override // defpackage.qoj
    public final Iterator a() {
        switch (this.c) {
            case 0:
                return new qos(this);
            default:
                return new qoe(this, null);
        }
    }
}

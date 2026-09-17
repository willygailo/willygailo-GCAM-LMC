package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class bfz implements bfh {
    private final Context a;
    private final /* synthetic */ int b;

    public bfz(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    @Override // defpackage.bfh
    public final bfg b(bfn bfnVar) {
        switch (this.b) {
            case 0:
                return new bga(this.a, 0);
            case 1:
                return new bga(this.a, 1, (byte[]) null);
            default:
                return new bga(this.a, 2, (char[]) null);
        }
    }
}

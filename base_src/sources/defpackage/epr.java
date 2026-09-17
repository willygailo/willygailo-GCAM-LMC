package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class epr implements mlu {
    private final /* synthetic */ int d;
    public static final /* synthetic */ epr c = new epr(2);
    public static final /* synthetic */ epr b = new epr(1);
    public static final /* synthetic */ epr a = new epr(0);

    private /* synthetic */ epr(int i) {
        this.d = i;
    }

    @Override // defpackage.mlu
    public final Object a(Object obj) {
        switch (this.d) {
            case 0:
                return Integer.valueOf(mip.dN((View) obj));
            case 1:
                return Integer.valueOf(mip.dO((View) obj));
            default:
                return Integer.valueOf(mip.dO((View) obj));
        }
    }
}

package defpackage;

import android.graphics.Rect;
import j$.util.function.IntFunction;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dbh implements IntFunction {
    private final /* synthetic */ int d;
    public static final /* synthetic */ dbh c = new dbh(2);
    public static final /* synthetic */ dbh b = new dbh(1);
    public static final /* synthetic */ dbh a = new dbh(0);

    private /* synthetic */ dbh(int i) {
        this.d = i;
    }

    @Override // j$.util.function.IntFunction
    public final Object apply(int i) {
        switch (this.d) {
            case 0:
                return new Rect[i];
            case 1:
                return new cxy[i];
            default:
                return new hjy[i];
        }
    }
}

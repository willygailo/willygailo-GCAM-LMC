package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
public class ge {
    static void a(View view, int i, int i2) {
        view.setScrollIndicators(i, 3);
    }

    public static /* synthetic */ String c(int i) {
        switch (i) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            default:
                return "METERED";
        }
    }

    public static ge d() {
        return new amu();
    }

    public static ge e() {
        return new amv();
    }

    public static ge f() {
        return new amw(amq.a);
    }

    public EdgeEffect b(RecyclerView recyclerView) {
        throw null;
    }
}

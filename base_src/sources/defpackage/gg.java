package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class gg {
    public gg() {
    }

    public gg(byte[] bArr) {
        Collections.emptyList();
        Collections.emptyList();
    }

    static int a(View view) {
        return view.getImportantForAutofill();
    }

    static void b(View view, int i) {
        view.setImportantForAutofill(8);
    }

    public static /* synthetic */ String e(int i) {
        switch (i) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case 5:
                return "BLOCKED";
            case 6:
                return "CANCELLED";
            default:
                return "null";
        }
    }

    public static boolean f(int i) {
        return i == 3 || i == 4 || i == 6;
    }

    public static /* synthetic */ void g(int i) {
        if (i == 0) {
            throw null;
        }
    }

    public void c(RecyclerView recyclerView, int i, int i2) {
    }

    public void d(int i) {
    }
}

package defpackage;

import android.app.Activity;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class jup implements jut {
    public final Activity a;

    public jup(Activity activity) {
        this.a = activity;
    }

    @Override // defpackage.jut
    public final View a(int i) {
        return this.a.findViewById(i);
    }
}

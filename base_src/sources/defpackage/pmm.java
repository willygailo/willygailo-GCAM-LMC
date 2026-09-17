package defpackage;

import android.app.Activity;
import com.google.lens.sdk.LensApi;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pmm implements Runnable {
    public final /* synthetic */ LensApi a;
    public final /* synthetic */ Activity b;
    private final /* synthetic */ int c;

    public /* synthetic */ pmm(LensApi lensApi, Activity activity, int i) {
        this.c = i;
        this.a = lensApi;
        this.b = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                this.a.d(this.b);
                break;
            default:
                this.a.d(this.b);
                break;
        }
    }
}

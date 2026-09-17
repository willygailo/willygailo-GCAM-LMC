package defpackage;

import android.view.PixelCopy;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jnd implements PixelCopy.OnPixelCopyFinishedListener {
    private final /* synthetic */ int f;
    public static final /* synthetic */ jnd e = new jnd(4);
    public static final /* synthetic */ jnd d = new jnd(3);
    public static final /* synthetic */ jnd c = new jnd(2);
    public static final /* synthetic */ jnd b = new jnd(1);
    public static final /* synthetic */ jnd a = new jnd(0);

    private /* synthetic */ jnd(int i) {
        this.f = i;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        int i2 = this.f;
    }
}

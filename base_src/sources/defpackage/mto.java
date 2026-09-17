package defpackage;

import com.google.android.libraries.oliveoil.natives.NativeMemCopier;

/* JADX INFO: loaded from: classes2.dex */
public final class mto {
    public static final mtn a;
    private static final mtn b;
    private static final mtn c;
    private static final mtn d;

    static {
        NativeMemCopier nativeMemCopier = new NativeMemCopier();
        b = nativeMemCopier;
        mtk mtkVar = new mtk(1);
        c = mtkVar;
        mtk mtkVar2 = new mtk(0);
        d = mtkVar2;
        a = new mtm(new mtm(new mtl(nativeMemCopier, mtkVar, mtkVar2), 0), 1);
    }
}

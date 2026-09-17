package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class bgb implements bfh {
    private final Context a;
    private final Class b;

    public bgb(Context context, Class cls) {
        this.a = context;
        this.b = cls;
    }

    @Override // defpackage.bfh
    public final bfg b(bfn bfnVar) {
        return new bgd(this.a, bfnVar.a(File.class, this.b), bfnVar.a(Uri.class, this.b), this.b);
    }
}

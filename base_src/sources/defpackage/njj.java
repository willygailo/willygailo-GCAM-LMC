package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class njj implements nji {
    protected Uri a(Uri uri) {
        throw null;
    }

    protected abstract nji b();

    @Override // defpackage.nji
    public /* synthetic */ File c(Uri uri) {
        throw null;
    }

    @Override // defpackage.nji
    public InputStream d(Uri uri) {
        throw null;
    }

    @Override // defpackage.nji
    public boolean f(Uri uri) {
        throw null;
    }

    @Override // defpackage.nji
    public final void g(Uri uri, Uri uri2) {
        b().g(a(uri), a(uri2));
    }

    @Override // defpackage.nji
    public final OutputStream j(Uri uri) {
        return b().j(a(uri));
    }

    @Override // defpackage.nji
    public final void k(Uri uri) {
        b().k(a(uri));
    }
}

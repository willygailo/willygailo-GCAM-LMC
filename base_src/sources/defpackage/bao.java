package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class bao implements bac {
    private final Uri a;
    private final ContentResolver b;
    private Object c;

    public bao(ContentResolver contentResolver, Uri uri) {
        this.b = contentResolver;
        this.a = uri;
    }

    protected abstract Object b(Uri uri, ContentResolver contentResolver);

    protected abstract void c(Object obj);

    @Override // defpackage.bac
    public final void d() {
        Object obj = this.c;
        if (obj != null) {
            try {
                c(obj);
            } catch (IOException e) {
            }
        }
    }

    @Override // defpackage.bac
    public final void f(ayc aycVar, bab babVar) {
        try {
            Object objB = b(this.a, this.b);
            this.c = objB;
            babVar.b(objB);
        } catch (FileNotFoundException e) {
            babVar.e(e);
        }
    }

    @Override // defpackage.bac
    public final void fu() {
    }

    @Override // defpackage.bac
    public final int g() {
        return 1;
    }
}

package defpackage;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
final class beo implements bac {
    private final String a;
    private Object b;

    public beo(String str) {
        this.a = str;
    }

    @Override // defpackage.bac
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.bac
    public final void d() {
        try {
            ((InputStream) this.b).close();
        } catch (IOException e) {
        }
    }

    @Override // defpackage.bac
    public final void f(ayc aycVar, bab babVar) {
        try {
            String str = this.a;
            if (!str.startsWith("data:image")) {
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
            int iIndexOf = str.indexOf(44);
            if (iIndexOf == -1) {
                throw new IllegalArgumentException("Missing comma in data URL.");
            }
            if (!str.substring(0, iIndexOf).endsWith(";base64")) {
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
            this.b = byteArrayInputStream;
            babVar.b(byteArrayInputStream);
        } catch (IllegalArgumentException e) {
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

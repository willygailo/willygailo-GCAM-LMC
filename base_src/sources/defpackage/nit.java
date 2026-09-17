package defpackage;

import android.net.Uri;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class nit implements nji {
    public nit() {
        new ConcurrentHashMap();
    }

    public nit(byte[] bArr) {
    }

    @Override // defpackage.nji
    public final File c(Uri uri) {
        return myw.c(uri);
    }

    @Override // defpackage.nji
    public final InputStream d(Uri uri) throws nix {
        File fileC = myw.c(uri);
        return new nja(new FileInputStream(fileC), fileC);
    }

    @Override // defpackage.nji
    public final String e() {
        return "file";
    }

    @Override // defpackage.nji
    public final boolean f(Uri uri) {
        return myw.c(uri).exists();
    }

    @Override // defpackage.nji
    public final void g(Uri uri, Uri uri2) throws IOException {
        File fileC = myw.c(uri);
        File fileC2 = myw.c(uri2);
        oxh.v(fileC2);
        if (!fileC.renameTo(fileC2)) {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }

    @Override // defpackage.nji
    public final OutputStream j(Uri uri) throws IOException {
        File fileC = myw.c(uri);
        oxh.v(fileC);
        return new njb(new FileOutputStream(fileC), fileC);
    }

    @Override // defpackage.nji
    public final void k(Uri uri) throws IOException {
        File fileC = myw.c(uri);
        if (fileC.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (fileC.delete()) {
            return;
        }
        if (!fileC.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }
}

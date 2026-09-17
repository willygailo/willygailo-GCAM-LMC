package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.FileDescriptor;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class ckx implements cle {
    private static final ouj a = ouj.h("com/google/android/apps/camera/camcorder/file/FileDescriptorOutputVideo");
    private final ParcelFileDescriptor b;
    private final FileDescriptor c;

    public ckx(ParcelFileDescriptor parcelFileDescriptor) {
        this.b = parcelFileDescriptor;
        this.c = parcelFileDescriptor.getFileDescriptor();
    }

    @Override // defpackage.cle
    public final long a() {
        return this.b.getStatSize();
    }

    @Override // defpackage.cle
    public final /* synthetic */ hss b() {
        return adg.d(this);
    }

    @Override // defpackage.cle
    public final ojc c() {
        return oih.a;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        try {
            this.b.close();
        } catch (IOException e) {
            ((oug) ((oug) ((oug) a.b()).h(e)).G((char) 458)).o("Error closing parcelFileDescriptor.");
        }
    }

    @Override // defpackage.cle
    public final ojc d() {
        return oih.a;
    }

    @Override // defpackage.cle
    public final pht e() {
        return plk.V(this.c);
    }

    @Override // defpackage.cle
    public final FileDescriptor f() {
        throw null;
    }

    @Override // defpackage.cle
    public final void g() {
    }

    @Override // defpackage.cle
    public final boolean h() {
        return true;
    }

    @Override // defpackage.cle
    public final void i() {
    }
}

package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class bem implements bac {
    private final File a;

    public bem(File file) {
        this.a = file;
    }

    @Override // defpackage.bac
    public final Class a() {
        return ByteBuffer.class;
    }

    @Override // defpackage.bac
    public final void d() {
    }

    @Override // defpackage.bac
    public final void f(ayc aycVar, bab babVar) {
        try {
            babVar.b(blr.b(this.a));
        } catch (IOException e) {
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

package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class ber implements bac {
    private final File a;
    private final bes b;
    private Object c;

    public ber(File file, bes besVar) {
        this.a = file;
        this.b = besVar;
    }

    @Override // defpackage.bac
    public final Class a() {
        return this.b.a();
    }

    @Override // defpackage.bac
    public final void d() {
        Object obj = this.c;
        if (obj != null) {
            try {
                this.b.c(obj);
            } catch (IOException e) {
            }
        }
    }

    @Override // defpackage.bac
    public final void f(ayc aycVar, bab babVar) {
        try {
            Object objB = this.b.b(this.a);
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

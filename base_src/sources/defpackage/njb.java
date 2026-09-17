package defpackage;

import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class njb extends njd implements niv {
    public final FileOutputStream a;
    private final File b;

    public njb(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.a = fileOutputStream;
        this.b = file;
    }

    @Override // defpackage.niv
    public final File a() {
        return this.b;
    }
}

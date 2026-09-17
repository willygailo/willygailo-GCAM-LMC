package defpackage;

import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class nja extends njc implements niv {
    private final FileInputStream a;
    private final File b;

    public nja(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.a = fileInputStream;
        this.b = file;
    }

    @Override // defpackage.niv
    public final File a() {
        return this.b;
    }
}

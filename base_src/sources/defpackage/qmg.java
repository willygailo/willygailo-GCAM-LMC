package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class qmg extends qmh {
    private boolean b;

    public qmg(File file) {
        super(file);
    }

    @Override // defpackage.qmh
    public final File a() {
        if (this.b) {
            return null;
        }
        this.b = true;
        return this.a;
    }
}

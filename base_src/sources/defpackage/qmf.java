package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class qmf extends qmh {
    private boolean b;
    private File[] c;
    private int d;
    private boolean e;

    public qmf(File file) {
        super(file);
    }

    @Override // defpackage.qmh
    public final File a() {
        int i;
        if (!this.e && this.c == null) {
            File[] fileArrListFiles = this.a.listFiles();
            this.c = fileArrListFiles;
            if (fileArrListFiles == null) {
                this.e = true;
            }
        }
        File[] fileArr = this.c;
        if (fileArr != null && (i = this.d) < fileArr.length) {
            this.d = i + 1;
            return fileArr[i];
        }
        if (this.b) {
            return null;
        }
        this.b = true;
        return this.a;
    }
}

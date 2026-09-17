package defpackage;

import java.io.File;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ceo {
    public final ljf a;
    public final Set b;
    private cen c;

    public ceo(ljf ljfVar, Set set) {
        this.a = ljfVar;
        this.b = set;
    }

    public final void a(String str) {
        cen cenVar = new cen(this);
        this.c = cenVar;
        cenVar.execute(str);
    }

    public final void b(File file) {
        for (File file2 : (File[]) obr.ao(file.listFiles())) {
            if (file2.isDirectory()) {
                b(file2);
            } else {
                file2.delete();
            }
        }
        file.delete();
    }
}

package defpackage;

import android.content.Context;
import android.os.Environment;

/* JADX INFO: loaded from: classes2.dex */
public final class hqa implements pys {
    private final qkg a;

    public hqa(qkg qkgVar) {
        this.a = qkgVar;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final hrz get() {
        ika ikaVarA = iiy.a();
        Context contextA = ((emp) this.a).a();
        return new hrz(Environment.isExternalStorageEmulated() ? contextA.getExternalFilesDir(null) : contextA.getNoBackupFilesDir(), contextA.getExternalFilesDir(null), ikaVarA);
    }
}

package defpackage;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class dwd {
    public final Context a;
    public final lda b;
    public final fjs c;

    public dwd(Context context, lda ldaVar, fjs fjsVar) {
        this.a = context;
        this.b = ldaVar;
        this.c = fjsVar;
    }

    public dwd(Context context, lda ldaVar, fjs fjsVar, ddf ddfVar) {
        this.a = context;
        this.b = ldaVar;
        this.c = fjsVar;
        if (((Boolean) ldaVar.fA()).booleanValue()) {
            return;
        }
        ddg ddgVar = ddd.a;
        ddfVar.d();
        a(context);
    }

    public static void a(Context context) {
        File file = new File(context.getNoBackupFilesDir(), "/ff.pb");
        if (file.exists()) {
            file.delete();
        }
        File file2 = new File(context.getNoBackupFilesDir(), "/ff.pb_tmp");
        if (file2.exists()) {
            file2.delete();
        }
    }
}

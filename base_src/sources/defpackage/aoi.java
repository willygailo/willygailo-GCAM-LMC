package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class aoi {
    final Context a;
    final apx b;
    final amj c;
    final WorkDatabase d;
    final String e;
    List f;
    final aso g;

    public aoi(Context context, amj amjVar, aso asoVar, apx apxVar, WorkDatabase workDatabase, String str) {
        new gg(null);
        this.a = context.getApplicationContext();
        this.g = asoVar;
        this.b = apxVar;
        this.c = amjVar;
        this.d = workDatabase;
        this.e = str;
    }
}

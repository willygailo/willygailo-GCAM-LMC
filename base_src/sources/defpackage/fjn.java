package defpackage;

import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class fjn implements emr {
    final /* synthetic */ emr a;
    final /* synthetic */ TimeUnit b;
    final /* synthetic */ String n = "AppSettings";

    public fjn(emr emrVar, TimeUnit timeUnit) {
        this.a = emrVar;
        this.b = timeUnit;
    }

    @Override // defpackage.emr
    public final Object a(emq emqVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object objA = this.a.a(emqVar);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > TimeUnit.MILLISECONDS.convert(5L, this.b)) {
            String str = this.n;
            String str2 = emqVar.b;
            StringBuilder sb = new StringBuilder(str2.length() + 63);
            sb.append("Warning: providing system service ");
            sb.append(str2);
            sb.append(" took ");
            sb.append(jCurrentTimeMillis2);
            sb.append(" ms");
            Log.w(str, sb.toString());
        }
        return objA;
    }
}

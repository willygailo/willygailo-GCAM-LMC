package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lgj implements oiu {
    public final /* synthetic */ long a;
    private final /* synthetic */ int b;

    public /* synthetic */ lgj(long j, int i) {
        this.b = i;
        this.a = j;
    }

    @Override // defpackage.oiu
    public final Object a(Object obj) {
        switch (this.b) {
            case 0:
                long j = this.a;
                long jLongValue = ((Long) obj).longValue();
                if (j <= 0) {
                    j = Long.MAX_VALUE;
                }
                if (jLongValue <= 0) {
                    jLongValue = Long.MAX_VALUE;
                }
                return new lfa(j, jLongValue);
            case 1:
                long j2 = this.a;
                kqz kqzVar = (kqz) obj;
                mdf mdfVar = kqzVar.b;
                long jCurrentTimeMillis = System.currentTimeMillis() - j2;
                SQLiteDatabase sQLiteDatabase = kqzVar.a;
                StringBuilder sb = new StringBuilder(26);
                sb.append("time< ");
                sb.append(jCurrentTimeMillis);
                String.format("Cleared %s records older than %s", Integer.valueOf(sQLiteDatabase.delete("collections", sb.toString(), new String[0])), SimpleDateFormat.getDateTimeInstance().format(new Date(jCurrentTimeMillis)));
                int i = kra.e;
                return null;
            default:
                return Long.valueOf(((Long) obj).longValue() / this.a);
        }
    }
}

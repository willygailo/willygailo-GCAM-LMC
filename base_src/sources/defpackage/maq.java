package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class maq {
    public final mbj a;
    public final ScheduledExecutorService b;
    public final ExecutorService c;
    public final lis d;
    public final Object e = new Object();
    public final Map f = new HashMap();
    public final Map g = new HashMap();
    private final Context h;
    private final ContentResolver i;

    public maq(Context context, ContentResolver contentResolver, mbj mbjVar, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, lis lisVar) {
        this.h = context;
        this.i = contentResolver;
        this.a = mbjVar;
        this.b = scheduledExecutorService;
        this.c = executorService;
        this.d = lisVar.a("PublishNotifier");
    }

    public final void a(max maxVar) {
        oti otiVarListIterator = maxVar.e.listIterator();
        while (otiVarListIterator.hasNext()) {
            mam mamVar = (mam) otiVarListIterator.next();
            Uri uriH = mamVar.e.h();
            if (uriH != null && !oje.d(uriH.getAuthority())) {
                this.i.notifyChange(uriH, null);
                lis lisVar = this.d;
                String strValueOf = String.valueOf(maxVar.a);
                String strValueOf2 = String.valueOf(uriH);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 15 + String.valueOf(strValueOf2).length());
                sb.append(strValueOf);
                sb.append(" NotifyChange: ");
                sb.append(strValueOf2);
                lisVar.f(sb.toString());
                mce mceVar = mamVar.e;
                mbs mbsVarA = mbs.a(mceVar.i().e);
                if (mbsVarA.b() || mbsVarA.c()) {
                    String str = true != mbsVarA.b() ? "android.hardware.action.NEW_VIDEO" : "android.hardware.action.NEW_PICTURE";
                    Uri uriH2 = mceVar.h();
                    lis lisVar2 = this.d;
                    String strValueOf3 = String.valueOf(uriH2);
                    StringBuilder sb2 = new StringBuilder(str.length() + 18 + String.valueOf(strValueOf3).length());
                    sb2.append("Broadcasting: ");
                    sb2.append(str);
                    sb2.append(" -> ");
                    sb2.append(strValueOf3);
                    lisVar2.f(sb2.toString());
                    Intent intent = new Intent(str, uriH2);
                    intent.addFlags(1073741824);
                    intent.addFlags(1);
                    this.h.sendBroadcast(intent);
                }
            }
        }
        this.f.remove(maxVar.a);
    }
}

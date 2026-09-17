package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class aqa implements apc, ank {
    public static final String a = kus.g("SystemFgDispatcher");
    public final aof b;
    final Object c = new Object();
    String d;
    final Map e;
    final Map f;
    final Set g;
    final apd h;
    public apz i;
    public final aso j;
    private final Context k;

    public aqa(Context context) {
        this.k = context;
        aof aofVarE = aof.e(context);
        this.b = aofVarE;
        aso asoVar = aofVarE.i;
        this.j = asoVar;
        this.d = null;
        this.e = new LinkedHashMap();
        this.g = new HashSet();
        this.f = new HashMap();
        this.h = new apd(context, asoVar, this);
        aofVarE.f.b(this);
    }

    public static Intent b(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    @Override // defpackage.ank
    public final void a(String str, boolean z) {
        Map.Entry entry;
        synchronized (this.c) {
            aqt aqtVar = (aqt) this.f.remove(str);
            if (aqtVar != null && this.g.remove(aqtVar)) {
                this.h.a(this.g);
            }
        }
        ams amsVar = (ams) this.e.remove(str);
        if (str.equals(this.d) && this.e.size() > 0) {
            Iterator it = this.e.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.d = (String) entry.getKey();
            if (this.i != null) {
                ams amsVar2 = (ams) entry.getValue();
                this.i.c(amsVar2.a, amsVar2.b, amsVar2.c);
                this.i.a(amsVar2.a);
            }
        }
        apz apzVar = this.i;
        if (amsVar == null || apzVar == null) {
            return;
        }
        kus kusVarL = kus.l();
        String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(amsVar.a), str, Integer.valueOf(amsVar.b));
        kusVarL.h(new Throwable[0]);
        apzVar.a(amsVar.a);
    }

    public final void c(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        kus kusVarL = kus.l();
        String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2));
        kusVarL.h(new Throwable[0]);
        if (notification == null || this.i == null) {
            return;
        }
        this.e.put(stringExtra, new ams(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.d)) {
            this.d = stringExtra;
            this.i.c(intExtra, intExtra2, notification);
            return;
        }
        this.i.b(intExtra, notification);
        if (intExtra2 != 0) {
            Iterator it = this.e.entrySet().iterator();
            while (it.hasNext()) {
                i |= ((ams) ((Map.Entry) it.next()).getValue()).b;
            }
            ams amsVar = (ams) this.e.get(this.d);
            if (amsVar != null) {
                this.i.c(amsVar.a, i, amsVar.c);
            }
        }
    }

    public final void d() {
        this.i = null;
        synchronized (this.c) {
            this.h.b();
        }
        this.b.f.c(this);
    }

    @Override // defpackage.apc
    public final void e(List list) {
    }

    @Override // defpackage.apc
    public final void f(List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            kus kusVarL = kus.l();
            String.format("Constraints unmet for WorkSpec %s", str);
            kusVarL.h(new Throwable[0]);
            aof aofVar = this.b;
            aofVar.i.a(new art(aofVar, str, true));
        }
    }
}

package androidx.work.impl;

import android.content.Context;
import defpackage.aig;
import defpackage.aii;
import defpackage.anr;
import defpackage.ans;
import defpackage.aoa;
import defpackage.aob;
import defpackage.aoc;
import defpackage.aod;
import defpackage.aqk;
import defpackage.aqq;
import defpackage.aqu;
import defpackage.arg;
import defpackage.fw;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class WorkDatabase extends aii {
    private static final long m = TimeUnit.DAYS.toMillis(1);

    public static WorkDatabase r(Context context, Executor executor, boolean z) {
        aig aigVarI;
        if (z) {
            aigVarI = new aig(context, WorkDatabase.class, null);
            aigVarI.c();
        } else {
            aigVarI = fw.i(context, WorkDatabase.class, aod.b());
            aigVarI.c = new anr(context);
        }
        aigVarI.b = executor;
        ans ansVar = new ans();
        if (aigVarI.a == null) {
            aigVarI.a = new ArrayList();
        }
        aigVarI.a.add(ansVar);
        aigVarI.b(aoc.a);
        aigVarI.b(new aoa(context, 2, 3));
        aigVarI.b(aoc.b);
        aigVarI.b(aoc.c);
        aigVarI.b(new aoa(context, 5, 6));
        aigVarI.b(aoc.d);
        aigVarI.b(aoc.e);
        aigVarI.b(aoc.f);
        aigVarI.b(new aob(context));
        aigVarI.b(new aoa(context, 10, 11));
        aigVarI.b(aoc.g);
        aigVarI.d();
        return (WorkDatabase) aigVarI.a();
    }

    public static String t() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - m) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public abstract aqu s();

    public abstract aqk u();

    public abstract aqq v();

    public abstract arg w();

    public abstract arg x();

    public abstract arg y();

    public abstract arg z();
}

package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class aof extends and {
    public static final Object a;
    private static aof k;
    private static aof l;
    public final Context b;
    public final amj c;
    public final WorkDatabase d;
    public final List e;
    public final ann f;
    public boolean g;
    public BroadcastReceiver.PendingResult h;
    public final aso i;
    public final arm j;

    static {
        kus.g("WorkManagerImpl");
        k = null;
        l = null;
        a = new Object();
    }

    public aof(Context context, amj amjVar, aso asoVar) {
        WorkDatabase workDatabaseR = WorkDatabase.r(context.getApplicationContext(), asoVar.a, context.getResources().getBoolean(R.bool.workmanager_test_configuration));
        Context applicationContext = context.getApplicationContext();
        kus.m(new kus(4));
        List listAsList = Arrays.asList(anp.a(applicationContext, this), new aom(applicationContext, amjVar, asoVar, this));
        ann annVar = new ann(context, amjVar, asoVar, workDatabaseR, listAsList);
        Context applicationContext2 = context.getApplicationContext();
        this.b = applicationContext2;
        this.c = amjVar;
        this.i = asoVar;
        this.d = workDatabaseR;
        this.e = listAsList;
        this.f = annVar;
        this.j = new arm(workDatabaseR);
        this.g = false;
        if (applicationContext2.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        asoVar.a(new arl(applicationContext2, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static aof e(Context context) {
        aof aofVarE;
        Object obj = a;
        synchronized (obj) {
            synchronized (obj) {
                aofVarE = k;
                if (aofVarE == null) {
                    aofVarE = l;
                }
            }
            return aofVarE;
        }
        if (aofVarE == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof ami)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            amj amjVarA = ((ami) applicationContext).a();
            synchronized (obj) {
                aof aofVar = k;
                if (aofVar != null && l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (aofVar == null) {
                    Context applicationContext2 = applicationContext.getApplicationContext();
                    if (l == null) {
                        l = new aof(applicationContext2, amjVarA, new aso(amjVarA.b));
                    }
                    k = l;
                }
                aofVarE = e(applicationContext);
            }
        }
        return aofVarE;
    }

    @Override // defpackage.and
    public final pht a(String str) {
        ars arsVar = new ars(this, str);
        this.i.a.execute(arsVar);
        return arsVar.c;
    }

    @Override // defpackage.and
    public final ana b(String str, int i, List list) {
        return new anq(this, str, i, list).d();
    }

    @Override // defpackage.and
    public final ana d() {
        arj arjVarB = arj.b("F250_WORKER_TAG", this, true);
        this.i.a(arjVarB);
        return arjVarB.d;
    }

    public final void f() {
        synchronized (a) {
            this.g = true;
            BroadcastReceiver.PendingResult pendingResult = this.h;
            if (pendingResult != null) {
                pendingResult.finish();
                this.h = null;
            }
        }
    }

    public final void g() {
        aoz.a(this.b);
        aqu aquVarS = this.d.s();
        are areVar = (are) aquVarS;
        areVar.a.g();
        ake akeVarE = areVar.e.e();
        areVar.a.h();
        try {
            akeVarE.a();
            ((are) aquVarS).a.j();
            areVar.a.i();
            areVar.e.f(akeVarE);
            anp.b(this.c, this.d, this.e);
        } catch (Throwable th) {
            areVar.a.i();
            areVar.e.f(akeVarE);
            throw th;
        }
    }

    public final void h(String str) {
        j(str, null);
    }

    public final void i(String str) {
        this.i.a(new art(this, str, false));
    }

    public final void j(String str, gg ggVar) {
        this.i.a(new arr(this, str, ggVar, null));
    }
}

package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.net.NetworkRequest;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class aoz implements ano {
    private static final String a = kus.g("SystemJobScheduler");
    private final Context b;
    private final JobScheduler c;
    private final aof d;
    private final aoy e;

    public aoz(Context context, aof aofVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        aoy aoyVar = new aoy(context);
        this.b = context;
        this.d = aofVar;
        this.c = jobScheduler;
        this.e = aoyVar;
    }

    public static void a(Context context) {
        List listH;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (listH = h(context, jobScheduler)) == null || listH.isEmpty()) {
            return;
        }
        Iterator it = listH.iterator();
        while (it.hasNext()) {
            i(jobScheduler, ((JobInfo) it.next()).getId());
        }
    }

    public static boolean f(Context context, aof aofVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> listH = h(context, jobScheduler);
        aqk aqkVarU = aofVar.d.u();
        boolean z = false;
        ais aisVarA = ais.a("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        aqkVarU.a.g();
        Cursor cursorI = fy.i(aqkVarU.a, aisVarA, false);
        try {
            ArrayList arrayList = new ArrayList(cursorI.getCount());
            while (cursorI.moveToNext()) {
                arrayList.add(cursorI.getString(0));
            }
            cursorI.close();
            aisVarA.j();
            HashSet hashSet = new HashSet(listH != null ? listH.size() : 0);
            if (listH != null && !listH.isEmpty()) {
                for (JobInfo jobInfo : listH) {
                    String strG = g(jobInfo);
                    if (TextUtils.isEmpty(strG)) {
                        i(jobScheduler, jobInfo.getId());
                    } else {
                        hashSet.add(strG);
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!hashSet.contains((String) it.next())) {
                    kus.l().h(new Throwable[0]);
                    z = true;
                    break;
                }
            }
            if (z) {
                WorkDatabase workDatabase = aofVar.d;
                workDatabase.h();
                try {
                    aqu aquVarS = workDatabase.s();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        aquVarS.j((String) it2.next(), -1L);
                    }
                    workDatabase.j();
                } finally {
                    workDatabase.i();
                }
            }
            return z;
        } catch (Throwable th) {
            cursorI.close();
            aisVarA.j();
            throw th;
        }
    }

    private static String g(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException e) {
            return null;
        }
    }

    private static List h(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            kus.l();
            kus.i(a, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    private static void i(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            kus.l();
            kus.i(a, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    @Override // defpackage.ano
    public final void b(String str) {
        ArrayList arrayList;
        List<JobInfo> listH = h(this.b, this.c);
        if (listH == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            for (JobInfo jobInfo : listH) {
                if (str.equals(g(jobInfo))) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i(this.c, ((Integer) it.next()).intValue());
        }
        this.d.d.u().c(str);
    }

    @Override // defpackage.ano
    public final void c(aqt... aqtVarArr) {
        int i;
        WorkDatabase workDatabase = this.d.d;
        arm armVar = new arm(workDatabase);
        for (aqt aqtVar : aqtVarArr) {
            workDatabase.h();
            try {
                aqt aqtVarA = workDatabase.s().a(aqtVar.a);
                if (aqtVarA == null) {
                    kus.l();
                    kus.k(a, "Skipping scheduling " + aqtVar.a + " because it's no longer in the DB", new Throwable[0]);
                    workDatabase.j();
                } else if (aqtVarA.p != 1) {
                    kus.l();
                    kus.k(a, "Skipping scheduling " + aqtVar.a + " because it is no longer enqueued", new Throwable[0]);
                    workDatabase.j();
                } else {
                    aqh aqhVarA = workDatabase.u().a(aqtVar.a);
                    if (aqhVarA != null) {
                        i = aqhVarA.b;
                    } else {
                        int i2 = this.d.c.d;
                        synchronized (arm.class) {
                            int iA = armVar.a("next_job_scheduler_id");
                            if (iA < 0) {
                                armVar.b("next_job_scheduler_id", 1);
                                i = 0;
                            } else {
                                i = iA;
                            }
                        }
                    }
                    if (aqhVarA == null) {
                        this.d.d.u().b(new aqh(aqtVar.a, i));
                    }
                    e(aqtVar, i);
                    workDatabase.j();
                }
                workDatabase.i();
            } catch (Throwable th) {
                workDatabase.i();
                throw th;
            }
        }
    }

    @Override // defpackage.ano
    public final boolean d() {
        return true;
    }

    public final void e(aqt aqtVar, int i) {
        int i2;
        aoy aoyVar = this.e;
        aml amlVar = aqtVar.i;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", aqtVar.a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", aqtVar.d());
        JobInfo.Builder extras = new JobInfo.Builder(i, aoyVar.a).setRequiresCharging(amlVar.b).setRequiresDeviceIdle(amlVar.c).setExtras(persistableBundle);
        int i3 = amlVar.i;
        if (i3 == 6) {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        } else {
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            switch (i4) {
                case 0:
                    i2 = 0;
                    break;
                case 1:
                    i2 = 1;
                    break;
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 3;
                    break;
                case 4:
                    i2 = 4;
                    break;
                default:
                    kus kusVarL = kus.l();
                    String.format("API version too low. Cannot convert network type value %s", ge.c(i3));
                    kusVarL.h(new Throwable[0]);
                    i2 = 1;
                    break;
            }
            extras.setRequiredNetworkType(i2);
        }
        if (!amlVar.c) {
            extras.setBackoffCriteria(aqtVar.k, aqtVar.q == 2 ? 0 : 1);
        }
        long jMax = Math.max(aqtVar.a() - System.currentTimeMillis(), 0L);
        if (jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!aqtVar.o) {
            extras.setImportantWhileForeground(true);
        }
        if (amlVar.a()) {
            for (amm ammVar : amlVar.h.a) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(ammVar.a, ammVar.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(amlVar.f);
            extras.setTriggerContentMaxDelay(amlVar.g);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(amlVar.d);
        extras.setRequiresStorageNotLow(amlVar.e);
        int i5 = aqtVar.j;
        if (aqtVar.o && i5 <= 0) {
            extras.setExpedited(true);
        }
        JobInfo jobInfoBuild = extras.build();
        kus kusVarL2 = kus.l();
        String.format("Scheduling work ID %s Job ID %s", aqtVar.a, Integer.valueOf(i));
        kusVarL2.h(new Throwable[0]);
        try {
            if (this.c.schedule(jobInfoBuild) == 0) {
                kus.l();
                kus.k(a, String.format("Unable to schedule work ID %s", aqtVar.a), new Throwable[0]);
                if (aqtVar.o && aqtVar.r == 1) {
                    aqtVar.o = false;
                    String.format("Scheduling a non-expedited job (work ID %s)", aqtVar.a);
                    kus.l().h(new Throwable[0]);
                    e(aqtVar, i);
                }
            }
        } catch (IllegalStateException e) {
            List listH = h(this.b, this.c);
            int size = listH != null ? listH.size() : 0;
            Locale locale = Locale.getDefault();
            int i6 = this.d.c.e;
            String str = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(size), Integer.valueOf(this.d.d.s().c().size()), 20);
            kus.l();
            kus.i(a, str, new Throwable[0]);
            throw new IllegalStateException(str, e);
        } catch (Throwable th) {
            kus.l();
            kus.i(a, String.format("Unable to schedule %s", aqtVar), th);
        }
    }
}

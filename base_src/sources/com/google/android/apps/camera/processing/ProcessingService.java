package com.google.android.apps.camera.processing;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager;
import com.Helper;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.processing.ProcessingService;
import defpackage.afp;
import defpackage.enc;
import defpackage.enw;
import defpackage.fjq;
import defpackage.fjr;
import defpackage.hhj;
import defpackage.hhk;
import defpackage.hhl;
import defpackage.hhn;
import defpackage.hho;
import defpackage.hhp;
import defpackage.jmo;
import defpackage.lab;
import defpackage.lar;
import defpackage.lif;
import defpackage.lis;
import defpackage.ljf;
import defpackage.lzh;
import defpackage.pih;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ProcessingService extends Service implements hho {
    private static final long t = TimeUnit.SECONDS.toMillis(60);
    public Notification.Builder a;
    public hhp c;
    public hhn d;
    public boolean g;
    public boolean h;
    public boolean i;
    public NotificationManager j;
    public hhl k;
    public PowerManager l;
    public afp m;
    public ljf n;
    public lar o;
    public Handler p;
    public lzh q;
    public fjr r;
    public enw s;
    private Thread v;
    private boolean w;
    private final hhk u = new hhk(this);
    public final Object b = new Object();
    public volatile boolean e = false;
    public final Object f = new Object();

    private final void d() {
        if (this.w) {
            return;
        }
        this.w = true;
        ((hhj) ((enc) getApplication()).c(hhj.class)).q(this);
        if (this.q.d) {
            this.j.deleteNotificationChannel("camera");
            Iterator<NotificationChannel> it = this.j.getNotificationChannels().iterator();
            while (it.hasNext()) {
                if ("processing".equals(it.next().getId())) {
                    return;
                }
            }
            NotificationChannel notificationChannel = new NotificationChannel("processing", getText(R.string.processing_notification_channel), 2);
            notificationChannel.setShowBadge(false);
            this.j.createNotificationChannel(notificationChannel);
        }
    }

    @Override // defpackage.hho
    public final void a(lif lifVar) {
        this.a.setProgress(100, lifVar.e, false);
        c();
    }

    @Override // defpackage.hho
    public final void b(jmo jmoVar) {
        this.a.setContentText(jmoVar.a(getResources()));
        c();
    }

    public final void c() {
        synchronized (this.f) {
            if (!this.g || this.i) {
                this.h = true;
            } else {
                this.j.notify(2, this.a.build());
                this.g = false;
                this.h = false;
                this.p.postDelayed(new Runnable() { // from class: hhh
                    @Override // java.lang.Runnable
                    public final void run() {
                        ProcessingService processingService = this.a;
                        synchronized (processingService.f) {
                            processingService.g = true;
                            if (processingService.h) {
                                processingService.c();
                            }
                        }
                    }
                }, 1000L);
                Helper.sHdr_process = 1;
                Helper.sHdrProcessTime(1);
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        d();
        super.onCreate();
        synchronized (this.f) {
            this.g = true;
            this.h = false;
            this.i = false;
        }
        this.n.e("ProcessingService#onCreate");
        this.n.e("WakeLock#new");
        hhp hhpVar = new hhp(this.l, t);
        this.c = hhpVar;
        hhpVar.a("onCreate");
        this.s.a();
        this.n.f();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.apps.camera.legacy.app.processing.PAUSE");
        intentFilter.addAction("com.google.android.apps.camera.legacy.app.processing.RESUME");
        this.m.b(this.u, intentFilter);
        this.a = (this.q.d ? new Notification.Builder(this, "processing") : new Notification.Builder(this)).setSmallIcon(R.drawable.ic_notification).setColor(getResources().getColor(R.color.processing_notification)).setWhen(System.currentTimeMillis()).setOngoing(true).setContentTitle(getText(R.string.app_name));
        this.n.f();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        pih pihVar;
        this.c.b();
        this.s.b();
        this.m.c(this.u);
        stopForeground(true);
        hhl hhlVar = this.k;
        synchronized (hhlVar.b) {
            hhlVar.g = 3;
            lis lisVar = hhlVar.a;
            String str = true != hhlVar.d ? "No" : "Yes";
            lisVar.f(str.length() != 0 ? "Service destroyed, restarting? ".concat(str) : new String("Service destroyed, restarting? "));
            if (hhlVar.d) {
                hhlVar.d = false;
                hhlVar.b();
                pihVar = null;
            } else {
                if (!hhlVar.c.isEmpty()) {
                    throw new IllegalStateException("Service destroyed, not restarting but queue has items.");
                }
                pihVar = hhlVar.f;
                hhlVar.f = pih.f();
            }
        }
        if (pihVar != null) {
            pihVar.o(Object.class);
        }
        Helper.sHdr_process = 0;
        Helper.sHdrProcessTime(0);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        d();
        startForeground(2, this.a.build());
        if (this.v != null) {
            return 1;
        }
        final fjq fjqVar = new fjq(this.r);
        lab labVar = new lab(9, new Runnable() { // from class: hhi
            @Override // java.lang.Runnable
            public final void run() {
                hhn hhnVar;
                ProcessingService processingService = this.a;
                fjq fjqVar2 = fjqVar;
                while (true) {
                    try {
                        hhl hhlVar = processingService.k;
                        synchronized (hhlVar.b) {
                            if (hhlVar.c.isEmpty() || hhlVar.e) {
                                lis lisVar = hhlVar.a;
                                boolean z = hhlVar.e;
                                StringBuilder sb = new StringBuilder(28);
                                sb.append("Popping null. On hold? ");
                                sb.append(z);
                                lisVar.b(sb.toString());
                                hhlVar.g = 2;
                                hhnVar = null;
                            } else {
                                hhnVar = (hhn) hhlVar.c.remove();
                                lis lisVar2 = hhlVar.a;
                                int size = hhlVar.c.size();
                                String strValueOf = String.valueOf(hhnVar);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 49);
                                sb2.append("Popping a session. Remaining: ");
                                sb2.append(size);
                                sb2.append(" , task ");
                                sb2.append(strValueOf);
                                lisVar2.b(sb2.toString());
                            }
                        }
                        if (hhnVar == null) {
                            break;
                        }
                        synchronized (processingService.b) {
                            processingService.d = hhnVar;
                            if (processingService.e) {
                                processingService.d.g();
                            }
                        }
                        fjqVar2.d(hhnVar.b());
                        processingService.a.setContentText("…").setProgress(100, 0, false);
                        processingService.c();
                        hhm hhmVarA = hhnVar.a();
                        if (hhmVarA != null) {
                            hhmVarA.c(processingService);
                        }
                        System.gc();
                        processingService.c.a(hhnVar.b());
                        hhnVar.d(processingService);
                        fjqVar2.b();
                    } catch (Throwable th) {
                        processingService.o.execute(new kqn(th, 1));
                    }
                    try {
                        processingService.o.execute(new kqn(th, 1));
                    } finally {
                        fjqVar2.a();
                        processingService.stopSelf();
                    }
                }
                synchronized (processingService.b) {
                    processingService.d = null;
                }
                synchronized (processingService.f) {
                    processingService.g = false;
                    processingService.h = false;
                    processingService.i = true;
                }
            }
        }, "CameraProcessingThread");
        this.v = labVar;
        labVar.start();
        return 1;
    }
}

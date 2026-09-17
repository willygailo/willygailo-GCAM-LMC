package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.Vibrator;
import android.text.TextUtils;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.gms.common.api.Status;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class jyq implements fgq, jxo, kwl, fik, fhy, fii, fij, fib {
    private final HandlerThread A;
    private final Handler B;
    private final Activity C;
    private final jyh D;
    private final ifn E;
    private final fjs F;
    private final jyt G;
    private final Context H;
    private final lap I;
    private final jlb J;
    private final BottomBarController K;
    private final jac L;
    private final lda M;
    private final ojc N;
    private final jye O;
    Runnable f;
    Runnable g;
    public boolean h;
    public boolean i;
    public final jxz j;
    public final lda k;
    public final lis l;
    public final ljf m;
    public final kas o;
    public final lda p;
    public final jng q;
    public String s;
    public String t;
    public final lzb u;
    private String w;
    private Intent x;
    private static final long[] v = {0, 400};
    public static boolean a = false;
    long b = 0;
    boolean c = false;
    int d = 480;
    int e = 480;
    private int y = 0;
    private long z = -1;
    public final Object n = new Object();
    final idd r = new jyp(this);

    public jyq(Activity activity, Context context, lzb lzbVar, jxz jxzVar, lda ldaVar, jyh jyhVar, kas kasVar, lda ldaVar2, ifn ifnVar, fjs fjsVar, jyt jytVar, jng jngVar, jlb jlbVar, BottomBarController bottomBarController, jac jacVar, lda ldaVar3, ojc ojcVar, jye jyeVar, lis lisVar, ljf ljfVar) {
        this.C = activity;
        this.u = lzbVar;
        this.j = jxzVar;
        this.k = ldaVar;
        this.D = jyhVar;
        this.o = kasVar;
        this.E = ifnVar;
        this.F = fjsVar;
        this.G = jytVar;
        this.l = lisVar.a("WearRemoteShutterListenerV2");
        this.m = ljfVar;
        this.H = context;
        this.p = ldaVar2;
        this.q = jngVar;
        this.J = jlbVar;
        this.K = bottomBarController;
        this.L = jacVar;
        this.M = ldaVar3;
        this.N = ojcVar;
        this.O = jyeVar;
        HandlerThread handlerThread = new HandlerThread("WRSListenerV2 bkg");
        this.A = handlerThread;
        handlerThread.start();
        this.B = mip.bV(handlerThread.getLooper());
        this.I = new lap();
        enl.f(jyhVar.b, jyhVar.a, jyhVar);
        this.i = true;
    }

    private final void m() {
        if (l()) {
            this.G.c.b();
        }
    }

    private final void n() {
        this.w = null;
        this.z = -1L;
    }

    private final void o() {
        this.B.post(new jyo(this, 5));
    }

    private final void p(final String str, final long j) {
        this.B.post(new Runnable() { // from class: jym
            @Override // java.lang.Runnable
            public final void run() {
                byte[] bArrG;
                jyq jyqVar = this.a;
                String str2 = str;
                long j2 = j;
                jxz jxzVar = jyqVar.j;
                if (j2 >= 0) {
                    poy poyVarM = jxq.b.m();
                    if (poyVarM.c) {
                        poyVarM.m();
                        poyVarM.c = false;
                    }
                    ((jxq) poyVarM.b).a = j2;
                    bArrG = ((jxq) poyVarM.j()).g();
                } else {
                    bArrG = null;
                }
                jxzVar.d(str2, bArrG);
            }
        });
    }

    private final void q() {
        final String str = true != a ? "onPause" : "onResume";
        this.B.post(new Runnable() { // from class: jyl
            @Override // java.lang.Runnable
            public final void run() {
                jyq jyqVar = this.a;
                jyqVar.j.d(str, null);
            }
        });
    }

    private final void r(int i) {
        if (s(true)) {
            if (i <= 0 && this.L.e()) {
                this.J.u();
                return;
            }
            hti htiVar = (hti) this.M.fA();
            if (htiVar.g != i) {
                this.M.fB(hti.a(i));
            }
            try {
                this.F.ak(2);
                this.J.v();
                this.J.A(false);
                this.J.u();
                if (htiVar.g != i) {
                }
            } finally {
                if (htiVar.g != i) {
                    this.M.fB(htiVar);
                }
            }
        }
    }

    private final boolean s(boolean z) {
        boolean z2;
        synchronized (this.n) {
            z2 = true;
            if (TextUtils.isEmpty(this.s) || !a || (!z && !this.c)) {
                z2 = false;
            }
        }
        return z2;
    }

    @Override // defpackage.fhy
    public final void F() {
        this.f = new jyo(this, 8);
        this.g = new jyo(this, 2);
        kij kijVar = this.j.c;
        IntentFilter intentFilter = new IntentFilter("com.google.android.gms.wearable.MESSAGE_RECEIVED");
        intentFilter.addDataScheme("wear");
        intentFilter.addDataAuthority("*", null);
        final IntentFilter[] intentFilterArr = {intentFilter};
        final kkt kktVarDD = mip.dD(this, kijVar.h, "MessageListener");
        kkz kkzVarA = kla.a();
        kkzVarA.c = kktVarDD;
        kkzVarA.a = new klb() { // from class: kyu
            @Override // defpackage.klb
            public final void a(Object obj, Object obj2) {
                kwl kwlVar = this;
                kkt kktVar = kktVarDD;
                IntentFilter[] intentFilterArr2 = intentFilterArr;
                kzq kzqVar = (kzq) obj;
                kzk kzkVar = new kzk((kvm) obj2, 0);
                nvb nvbVar = kzqVar.a;
                kzs kzsVar = new kzs(intentFilterArr2);
                kzsVar.a = kktVar;
                synchronized (nvbVar.a) {
                    if (nvbVar.a.get(kwlVar) != null) {
                        kzkVar.c(new Status(4001));
                        return;
                    }
                    nvbVar.a.put(kwlVar, kzsVar);
                    try {
                        ((kyo) kzqVar.u()).e(new kyp(nvbVar.a, kwlVar, kzkVar), new kwx(kzsVar));
                    } catch (RemoteException e) {
                        nvbVar.a.remove(kwlVar);
                        throw e;
                    }
                }
            }
        };
        kkzVarA.b = new klb() { // from class: kyt
            @Override // defpackage.klb
            public final void a(Object obj, Object obj2) {
                kwl kwlVar = this;
                kzq kzqVar = (kzq) obj;
                kzk kzkVar = new kzk((kvm) obj2, 1);
                nvb nvbVar = kzqVar.a;
                synchronized (nvbVar.a) {
                    kzs kzsVar = (kzs) nvbVar.a.remove(kwlVar);
                    if (kzsVar == null) {
                        kzkVar.c(new Status(4002));
                        return;
                    }
                    kzsVar.l();
                    kyo kyoVar = (kyo) kzqVar.u();
                    kyq kyqVar = new kyq(nvbVar.a, kwlVar, kzkVar);
                    kzf kzfVar = new kzf(kzsVar);
                    Parcel parcelA = kyoVar.a();
                    bmp.e(parcelA, kyqVar);
                    bmp.c(parcelA, kzfVar);
                    kyoVar.z(17, parcelA);
                }
            }
        };
        kkzVarA.d = 24016;
        kijVar.n(kkzVarA.a());
        jxz jxzVar = this.j;
        jxzVar.b.f("sendMessageAsync to /check_status");
        jxzVar.b("/check_status", null);
        this.B.post(new jyo(this, 0));
        q();
        o();
        this.B.post(new jyo(this, 1));
        h(0L);
        this.o.e(new kar() { // from class: jyj
            @Override // defpackage.kar
            public final void a() {
                this.a.j();
            }
        });
        this.I.c(this.p.a(new lij() { // from class: jyn
            @Override // defpackage.lij
            public final void fB(Object obj) {
                this.a.k();
            }
        }, pgr.INSTANCE));
        if (this.N.g()) {
            ((idc) this.N.c()).a(this.r);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:120:0x0269  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f8  */
    @Override // defpackage.kwk
    public final void a(kyw kywVar) {
        Long lValueOf;
        int i;
        lis lisVar = this.l;
        int i2 = kywVar.a;
        String str = kywVar.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 66);
        sb.append("onMessageReceived() A message from watch was received:");
        sb.append(i2);
        sb.append(" ");
        sb.append(str);
        lisVar.g(sb.toString());
        int i3 = 3;
        switch (kywVar.b) {
            case "/check_status":
                q();
                o();
                this.B.post(new jyo(this, i3));
                if (TextUtils.isEmpty(this.w)) {
                    return;
                }
                p(this.w, this.z);
                return;
            case "/sending_time":
                try {
                    lValueOf = Long.valueOf(((jxr) ppd.p(jxr.c, kywVar.c)).b);
                    break;
                } catch (ppp e) {
                    this.l.i("Error when get WearImageBundle", e);
                    lValueOf = null;
                }
                if (lValueOf != null) {
                    this.b = System.currentTimeMillis() - lValueOf.longValue();
                    this.i = true;
                    h(0L);
                    jyt jytVar = this.G;
                    long j = this.b;
                    jytVar.f += j;
                    jytVar.g++;
                    lis lisVar2 = this.l;
                    StringBuilder sb2 = new StringBuilder(57);
                    sb2.append("Receive image callback with time gap ");
                    sb2.append(j);
                    lisVar2.b(sb2.toString());
                    return;
                }
                return;
            case "onResume":
                this.c = true;
                q();
                o();
                j();
                h(0L);
                m();
                this.l.b("Wear onResume");
                return;
            case "onPause":
                this.c = false;
                this.l.b("Wear onPause");
                return;
            case "onDestroy":
                this.l.b("Wear onDestroy");
                this.C.finish();
                return;
            case "/enter_ambient":
                this.l.b("Wear enter ambient");
                this.G.d.b();
                return;
            case "/leave_ambient":
                this.l.b("Wear leave ambient");
                jys jysVar = this.G.d;
                if (!jysVar.c) {
                    jysVar.d.h("onSessionStop failed because session is not started!");
                    return;
                }
                jysVar.c = false;
                long jCurrentTimeMillis = jysVar.b + (System.currentTimeMillis() - jysVar.a);
                jysVar.b = jCurrentTimeMillis;
                lis lisVar3 = jysVar.d;
                StringBuilder sb3 = new StringBuilder(50);
                sb3.append("onSessionStop, elapseTimeMs = ");
                sb3.append(jCurrentTimeMillis);
                lisVar3.f(sb3.toString());
                return;
            case "/log_lost_connection":
                this.l.b("Wear came back from connection lost");
                this.G.e++;
                return;
            case "/snapshot":
                r(0);
                return;
            case "/flip_camera":
                if (l()) {
                    this.K.switchCamera();
                    return;
                }
                return;
            case "/play_sound_from_wear":
                switch (new String(kywVar.c)) {
                    case "TIMER_START_SOUND":
                        i = R.raw.timer_start;
                        break;
                    case "TIMER_FINAL_SECOND_SOUND":
                        i = R.raw.timer_final;
                        break;
                    case "TIMER_INCREMENT_SOUND":
                        i = R.raw.timer_increment;
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
                this.E.b(i);
                return;
            case "/launch_from_notification":
                poy poyVar = this.G.h;
                if (poyVar.c) {
                    poyVar.m();
                    poyVar.c = false;
                }
                pep pepVar = (pep) poyVar.b;
                pep pepVar2 = pep.g;
                pepVar.f = 1;
                pepVar.a |= 128;
                return;
            case "/wear_size":
                String str2 = new String(kywVar.c);
                String[] strArrSplit = str2.split("x", -1);
                if (strArrSplit.length == 2) {
                    this.d = Integer.parseInt(strArrSplit[0]);
                    this.e = Integer.parseInt(strArrSplit[1]);
                }
                this.l.b(str2.length() != 0 ? "Wear size, ".concat(str2) : new String("Wear size, "));
                return;
            case "/zoom_value":
                try {
                    float f = ((jxv) ppd.p(jxv.b, kywVar.c)).a;
                    if (l()) {
                        this.y++;
                        this.p.fB(Float.valueOf(f));
                        return;
                    }
                    return;
                } catch (ppp e2) {
                    this.l.i("Error when get zoom value", e2);
                    return;
                }
            case "/zoom":
                try {
                    float f2 = ((jxt) ppd.p(jxt.b, kywVar.c)).a;
                    if (l()) {
                        this.o.l();
                        this.o.k(f2 > 0.0f ? 1.01f : 0.99f);
                        kas kasVar = this.o;
                        ((kbi) kasVar).z.n();
                        if (!((kbi) kasVar).l) {
                            ((kbi) kasVar).z.w();
                        }
                        ((kbi) kasVar).z.z(8, ((kbi) kasVar).O, ((Float) ((kbi) kasVar).g.fA()).floatValue());
                        return;
                    }
                    return;
                } catch (ppp e3) {
                    this.l.i("Error when get zoom delta", e3);
                    return;
                }
            case "/support_feature_version":
                try {
                    jye jyeVar = this.O;
                    byte[] bArr = kywVar.c;
                    if (bArr != null) {
                        jyeVar.b = ((jxs) ppd.s(jxs.b, bArr, pos.b())).a;
                    }
                    lis lisVar4 = this.l;
                    int i4 = this.O.b;
                    StringBuilder sb4 = new StringBuilder(42);
                    sb4.append("Get version from wear, version=");
                    sb4.append(i4);
                    lisVar4.f(sb4.toString());
                    return;
                } catch (ppp e4) {
                    this.l.i("Fail to parse version!", e4);
                    return;
                }
            case "/count_down_from_phone":
                try {
                    r(((jxp) ppd.s(jxp.b, kywVar.c, pos.b())).a);
                    return;
                } catch (ppp e5) {
                    this.l.i("Error when parsing count down time", e5);
                    return;
                }
            default:
                return;
        }
    }

    @Override // defpackage.jxo
    public final void b() {
        boolean zL = l();
        synchronized (this.n) {
            this.s = null;
        }
        n();
        if (zL) {
            this.B.post(new jyo(this, 4));
        }
    }

    @Override // defpackage.jxo
    public final void c(String str) {
        synchronized (this.n) {
            this.s = str;
        }
        if (l()) {
            o();
            h(0L);
        }
        m();
    }

    @Override // defpackage.fij
    public final void e() {
        synchronized (this.n) {
            this.t = this.s;
        }
        b();
        a = false;
        q();
    }

    @Override // defpackage.jxo
    public final void f(final Bitmap bitmap) {
        if (s(true)) {
            this.B.post(new Runnable() { // from class: jyk
                @Override // java.lang.Runnable
                public final void run() {
                    jyq jyqVar = this.a;
                    Bitmap bitmapCreateScaledBitmap = bitmap;
                    float fMax = Math.max(Math.max(bitmapCreateScaledBitmap.getWidth() / jyqVar.d, bitmapCreateScaledBitmap.getHeight() / jyqVar.e) / 2.0f, 1.0f);
                    ljf ljfVar = jyqVar.m;
                    lis lisVar = jyqVar.l;
                    if (fMax > 1.0f) {
                        ljfVar.e("resizeBitmap");
                        bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, (int) (bitmapCreateScaledBitmap.getWidth() / fMax), (int) (bitmapCreateScaledBitmap.getHeight() / fMax), false);
                        ljfVar.f();
                        lisVar.b(mip.bp("Size:%d/%d, resizeScale:%.3f", Integer.valueOf(bitmapCreateScaledBitmap.getWidth()), Integer.valueOf(bitmapCreateScaledBitmap.getHeight()), Float.valueOf(fMax)));
                    }
                    jyqVar.i(bitmapCreateScaledBitmap, false);
                }
            });
        }
    }

    @Override // defpackage.fib
    public final void fT() {
        String string;
        jyt jytVar = this.G;
        if (jytVar.c.a() <= 0) {
            jytVar.b.f("Session is not started. No need to send usage log.");
        } else {
            poy poyVar = jytVar.h;
            long jA = jytVar.c.a();
            if (poyVar.c) {
                poyVar.m();
                poyVar.c = false;
            }
            pep pepVar = (pep) poyVar.b;
            pep pepVar2 = pep.g;
            pepVar.a |= 1;
            pepVar.b = jA;
            long jA2 = jytVar.d.a();
            if (poyVar.c) {
                poyVar.m();
                poyVar.c = false;
            }
            pep pepVar3 = (pep) poyVar.b;
            int i = pepVar3.a | 2;
            pepVar3.a = i;
            pepVar3.c = jA2;
            int i2 = jytVar.e;
            pepVar3.a = i | 4;
            pepVar3.d = i2;
            long j = jytVar.g;
            if (j > 0) {
                poy poyVar2 = jytVar.h;
                int i3 = (int) (jytVar.f / j);
                if (poyVar2.c) {
                    poyVar2.m();
                    poyVar2.c = false;
                }
                pep pepVar4 = (pep) poyVar2.b;
                pepVar4.a |= 64;
                pepVar4.e = i3;
            }
            pep pepVar5 = (pep) jytVar.h.j();
            jytVar.a.L(pepVar5);
            lis lisVar = jytVar.b;
            long j2 = pepVar5.b;
            long j3 = pepVar5.c;
            int iU = oxh.U(pepVar5.f);
            String string2 = Integer.toString((iU != 0 ? iU : 1) - 1);
            int i4 = pepVar5.d;
            if (jytVar.g > 0) {
                int i5 = pepVar5.e;
                StringBuilder sb = new StringBuilder(37);
                sb.append(", LatencyAveragePreviewMs=");
                sb.append(i5);
                string = sb.toString();
            } else {
                string = "";
            }
            StringBuilder sb2 = new StringBuilder(string2.length() + 157 + String.valueOf(string).length());
            sb2.append("sendUsageLog done, SessionDurationMs=");
            sb2.append(j2);
            sb2.append(", SessionAmbientDurationMs=");
            sb2.append(j3);
            sb2.append(", LaunchType=");
            sb2.append(string2);
            sb2.append(", FailureLostConnectionTimes=");
            sb2.append(i4);
            sb2.append(string);
            lisVar.f(sb2.toString());
        }
        jxz jxzVar = this.j;
        Runnable runnable = this.g;
        obr.ao(runnable);
        jxzVar.b("onDestroy", runnable);
        kij kijVar = this.j.c;
        kkr kkrVar = mip.dD(this, kijVar.h, "MessageListener").b;
        ew.d(kkrVar, "Key must not be null");
        kijVar.e(kkrVar, 24007);
        this.A.quitSafely();
        this.I.close();
    }

    @Override // defpackage.fii
    public final void fW() {
        a = true;
        q();
        if (TextUtils.isEmpty(this.t)) {
            o();
        } else {
            c(this.t);
        }
        h(0L);
        m();
        this.y = 0;
        Intent intent = this.C.getIntent();
        if (intent == null || !intent.equals(this.x)) {
            this.x = intent;
            if (intent.getBooleanExtra("extra_launch_fom_wear", false)) {
                poy poyVar = this.G.h;
                if (poyVar.c) {
                    poyVar.m();
                    poyVar.c = false;
                }
                pep pepVar = (pep) poyVar.b;
                pep pepVar2 = pep.g;
                pepVar.f = 2;
                pepVar.a |= 128;
                Vibrator vibrator = (Vibrator) this.H.getSystemService("vibrator");
                if (vibrator == null || !vibrator.hasVibrator()) {
                    return;
                }
                vibrator.vibrate(v, -1);
            }
        }
    }

    @Override // defpackage.jxo
    public final void g(String str, long j) {
        if (l()) {
            p(str, j);
        }
        if (!"/video_state_paused".equals(str) || !"/video_state_recording".equals(this.w)) {
            this.z = j;
        }
        this.w = str;
        if ("/video_state_stopped".equals(str)) {
            n();
        }
    }

    public final void h(long j) {
        Runnable runnable;
        if (!l() || (runnable = this.f) == null) {
            return;
        }
        this.B.removeCallbacks(runnable);
        if (j <= 0) {
            this.B.post(this.f);
        } else {
            this.B.postDelayed(this.f, j);
        }
    }

    public final void i(Bitmap bitmap, boolean z) {
        byte[] byteArray;
        int i = true != z ? 65 : 30;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
                byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                }
                throw th;
            }
        } catch (IOException e) {
            this.l.i("Error when compressBitmap", e);
            byteArray = null;
        }
        if (z) {
            bitmap.recycle();
        }
        if (byteArray == null) {
            this.l.d("Compress bitmap failed!");
            return;
        }
        poy poyVarM = jxr.c.m();
        poc pocVarT = poc.t(byteArray);
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        ((jxr) poyVarM.b).a = pocVarT;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        ((jxr) poyVarM.b).b = jCurrentTimeMillis;
        jxr jxrVar = (jxr) poyVarM.j();
        String str = true != z ? "/image" : "/preview";
        if (s(!z)) {
            this.j.d(str, jxrVar.g());
        } else {
            this.l.f("Not active now. Skip sending preview");
        }
    }

    public final void j() {
        this.B.post(new jyo(this, 6));
        k();
    }

    public final void k() {
        int i = this.y;
        if (i > 0) {
            this.y = i - 1;
        } else {
            this.B.post(new jyo(this, 7));
        }
    }

    final boolean l() {
        return s(false);
    }

    @Override // defpackage.fgq
    public final void z(Intent intent) {
        this.t = null;
    }
}

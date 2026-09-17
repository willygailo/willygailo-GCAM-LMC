package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.location.Location;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.apps.camera.bottombar.R;
import com.google.android.gms.location.LocationRequest;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class fis implements fiw, ksz {
    public static final ouj a = ouj.h("com/google/android/apps/camera/location/FusedLocationController");
    public static final int b = mip.dZ(20);
    public static final int c = mip.dZ(60);
    private static final Uri j = Uri.parse("content://com.google.settings/partner");
    public boolean d = false;
    public Location e;
    public long f;
    public long g;
    public boolean h;
    public final kij i;
    private final Executor k;

    public fis(Context context, Executor executor) {
        this.i = new kij(context, ktb.a, kid.r, kii.a);
        this.k = executor;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0063 A[PHI: r0 r2
      0x0063: PHI (r0v6 java.lang.String) = (r0v15 java.lang.String), (r0v12 java.lang.String) binds: [B:20:0x0061, B:13:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x0063: PHI (r2v6 android.database.Cursor) = (r2v5 android.database.Cursor), (r2v7 android.database.Cursor) binds: [B:20:0x0061, B:13:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0077  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public static boolean d(Context context) throws Throwable {
        RuntimeException e;
        Cursor cursorQuery;
        if (context.getPackageManager().resolveActivity(new Intent("com.google.android.gsf.GOOGLE_APPS_LOCATION_SETTINGS"), 65536) != null) {
            ContentResolver contentResolver = context.getContentResolver();
            ?? r0 = 0;
            string = null;
            string = null;
            string = null;
            String string = null;
            try {
                try {
                    cursorQuery = contentResolver.query(j, new String[]{"value"}, "name=?", new String[]{"use_location_for_services"}, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToNext()) {
                                string = cursorQuery.getString(0);
                            }
                        } catch (RuntimeException e2) {
                            e = e2;
                            ((oug) ((oug) ((oug) a.c()).h(e)).G(1684)).o("Failed to get 'Use My Location' setting");
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    r0 = contentResolver;
                    if (r0 != 0) {
                        r0.close();
                    }
                    throw th;
                }
            } catch (RuntimeException e3) {
                e = e3;
                cursorQuery = null;
            } catch (Throwable th2) {
                th = th2;
                if (r0 != 0) {
                    r0.close();
                }
                throw th;
            }
            if (string != null) {
                try {
                    if (Integer.parseInt(string) == 1) {
                    }
                } catch (NumberFormatException e4) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean e(Location location) {
        if (location == null) {
            ((oug) ((oug) a.c()).G((char) 1700)).o("Fused location API did not provide a location.");
            return false;
        }
        if (Double.isInfinite(location.getLatitude()) || Double.isNaN(location.getLatitude()) || Double.isInfinite(location.getLongitude()) || Double.isNaN(location.getLongitude()) || (location.getLatitude() == 0.0d && location.getLongitude() == 0.0d)) {
            ((oug) ((oug) a.c()).G((char) 1698)).r("Fused location API provided a location that is probably incorrect: %s", location);
            return false;
        }
        long jEb = mip.eb(SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos());
        if (jEb <= mip.dZ(1800)) {
            return true;
        }
        ((oug) ((oug) a.c()).G((char) 1699)).r("Fused location API provided a location from %g seconds ago. Ignoring location.", Float.valueOf(mip.dW(jEb)));
        return false;
    }

    private final void f() {
        synchronized (this) {
            this.h = true;
            if (this.d) {
                try {
                    kij kijVar = this.i;
                    String simpleName = ksz.class.getSimpleName();
                    mip.du(simpleName, "Listener type must not be null");
                    mip.dt(simpleName, "Listener type must not be empty");
                    kijVar.h(new kkr(this, simpleName));
                } catch (Exception e) {
                    ((oug) ((oug) ((oug) a.c()).h(e)).G(1697)).o("Failed to remove location listeners. ");
                }
                this.d = false;
            } else {
                this.d = false;
            }
            throw th;
        }
    }

    @Override // defpackage.fiw
    public final pht a() {
        final pih pihVarF = pih.f();
        Location location = null;
        if (this.e == null || System.currentTimeMillis() - this.f >= 1000) {
            this.e = null;
        } else {
            System.currentTimeMillis();
            location = this.e;
        }
        if (location != null) {
            pihVarF.o(location);
            return pihVarF;
        }
        this.i.g().g(this.k, new kvc() { // from class: fir
            @Override // defpackage.kvc
            public final void a(kvk kvkVar) {
                fis fisVar = this.a;
                pih pihVar = pihVarF;
                try {
                    Location location2 = (Location) kvkVar.c();
                    if (!fis.e(location2)) {
                        pihVar.o(null);
                        return;
                    }
                    fisVar.e = location2;
                    fisVar.f = System.currentTimeMillis();
                    pihVar.o(location2);
                } catch (kvj e) {
                    ((oug) ((oug) ((oug) fis.a.c()).h(e)).G((char) 1687)).o("getCurrentLocation meet exception!");
                    pihVar.o(null);
                }
            }
        });
        return pihVarF;
    }

    @Override // defpackage.ksz
    public final void b(Location location) {
        if (e(location)) {
            int iCurrentTimeMillis = (int) ((((System.currentTimeMillis() - this.g) / mip.dZ(10)) + 1.0f) * 50.0f);
            boolean z = System.currentTimeMillis() - this.g > ((long) c);
            if (location.getAccuracy() >= iCurrentTimeMillis) {
                if (!z) {
                    return;
                } else {
                    z = true;
                }
            }
            f();
            String str = true != z ? "got useful location" : "timeout";
            if (str.length() != 0) {
                "onLocationChanged, ".concat(str);
            } else {
                new String("onLocationChanged, ");
            }
            location.getAccuracy();
        }
    }

    @Override // defpackage.fiw
    public final void c(boolean z) {
        if (!z) {
            f();
            return;
        }
        synchronized (this) {
            if (this.d) {
                return;
            }
            this.h = false;
            this.i.g().g(this.k, new kvc() { // from class: fiq
                @Override // defpackage.kvc
                public final void a(kvk kvkVar) {
                    Location location;
                    fis fisVar = this.a;
                    synchronized (fisVar) {
                        if (fisVar.h) {
                            fisVar.h = false;
                            return;
                        }
                        try {
                            location = (Location) kvkVar.c();
                        } catch (kvj e) {
                            ((oug) ((oug) ((oug) fis.a.c()).h(e)).G(1691)).o("getCurrentLocation meet exception!");
                            location = null;
                        }
                        if (fis.e(location) && mip.eb(SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos()) < mip.dZ(60) && location.getAccuracy() < 50.0f) {
                            location.getAccuracy();
                            return;
                        }
                        LocationRequest locationRequest = new LocationRequest(R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 3600000L, 600000L, false, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, 0L, true);
                        long j2 = fis.b;
                        mip.dn(true, "illegal interval: %d", Long.valueOf(j2));
                        locationRequest.b = j2;
                        if (!locationRequest.d) {
                            double d = j2;
                            Double.isNaN(d);
                            locationRequest.c = (long) (d / 6.0d);
                        }
                        mip.dn(true, "illegal priority: %d", 100);
                        locationRequest.a = 100;
                        long j3 = fis.c;
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        long j4 = Long.MAX_VALUE;
                        if (j3 > Long.MAX_VALUE - jElapsedRealtime) {
                            locationRequest.e = Long.MAX_VALUE;
                        } else {
                            j4 = j3 + jElapsedRealtime;
                            locationRequest.e = j4;
                        }
                        if (j4 < 0) {
                            locationRequest.e = 0L;
                        }
                        try {
                            final kij kijVar = fisVar.i;
                            final kkt kktVarDD = mip.dD(fisVar, kijVar.h, ksz.class.getSimpleName());
                            final ktl ktlVar = new ktl(locationRequest, oom.l(), null, false, false, false, null, false, false, null, Long.MAX_VALUE);
                            final ksp kspVar = new ksp(kktVarDD);
                            klb klbVar = new klb() { // from class: ksl
                                @Override // defpackage.klb
                                public final void a(Object obj, Object obj2) {
                                    ksx ksxVar;
                                    kij kijVar2 = kijVar;
                                    ksp kspVar2 = kspVar;
                                    kkt kktVar = kktVarDD;
                                    ktl ktlVar2 = ktlVar;
                                    ktk ktkVar = (ktk) obj;
                                    ksn ksnVar = new ksn((kvm) obj2, new ksj(kijVar2, kspVar2, kktVar));
                                    ktlVar2.k = kijVar2.d;
                                    kkr kkrVar = kktVar.b;
                                    if (kkrVar == null) {
                                        Log.e("LocationClientImpl", "requested location updates on dead listener", new RuntimeException());
                                        return;
                                    }
                                    Context context = ktkVar.c;
                                    synchronized (ktkVar) {
                                        synchronized (ktkVar.a) {
                                            ksx ksxVar2 = (ksx) ktkVar.a.get(kkrVar);
                                            if (ksxVar2 == null) {
                                                ksx ksxVar3 = new ksx(kktVar);
                                                ktkVar.a.put(kkrVar, ksxVar3);
                                                ksxVar = ksxVar3;
                                            } else {
                                                ksxVar = ksxVar2;
                                            }
                                        }
                                        kti ktiVar = (kti) ktkVar.u();
                                        String str = kkrVar.b;
                                        int iIdentityHashCode = System.identityHashCode(kkrVar.a);
                                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                                        sb.append(str);
                                        sb.append("@");
                                        sb.append(iIdentityHashCode);
                                        ktiVar.e(new ktm(1, ktlVar2, ksxVar, null, null, ksnVar, sb.toString()));
                                    }
                                }
                            };
                            kkz kkzVarA = kla.a();
                            kkzVarA.a = klbVar;
                            kkzVarA.b = kspVar;
                            kkzVarA.c = kktVarDD;
                            kkzVarA.d = 2435;
                            kijVar.n(kkzVarA.a());
                            fisVar.d = true;
                            fisVar.g = System.currentTimeMillis();
                        } catch (Exception e2) {
                            ((oug) ((oug) ((oug) fis.a.c()).h(e2)).G(1689)).o("requestLocationUpdates failed!");
                        }
                    }
                }
            });
        }
    }
}

package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.util.Log;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.libraries.barhopper.Barcode;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class czq {
    public final Context a;
    public final nmb b;
    public final ljf c;
    public final AtomicBoolean d = new AtomicBoolean(false);
    private final mgo e;
    private final pyn f;
    private final pyn g;

    public czq(Context context, mgo mgoVar, nmb nmbVar, pyn pynVar, pyn pynVar2, ljf ljfVar) {
        this.a = context;
        this.e = mgoVar;
        this.b = nmbVar;
        this.f = pynVar;
        this.g = pynVar2;
        this.c = ljfVar;
    }

    private static final String d(String str) {
        return str.length() > 25 ? String.valueOf(str.substring(0, 24)).concat("…") : str;
    }

    private static final boolean e(nlf nlfVar) {
        switch (nlfVar.ordinal()) {
            case 2:
            case 4:
            case 24:
            case 28:
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:207:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:208:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:211:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:213:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:215:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:222:0x0714  */
    /* JADX WARN: Code duplicated, block: B:224:0x071c  */
    /* JADX WARN: Code duplicated, block: B:227:0x073b  */
    /* JADX WARN: Code duplicated, block: B:229:0x0744  */
    /* JADX WARN: Code duplicated, block: B:230:0x0746  */
    /* JADX WARN: Code duplicated, block: B:231:0x074a  */
    /* JADX WARN: Code duplicated, block: B:232:0x074e  */
    /* JADX WARN: Code duplicated, block: B:233:0x0752  */
    /* JADX WARN: Code duplicated, block: B:234:0x0756  */
    /* JADX WARN: Code duplicated, block: B:235:0x075a  */
    /* JADX WARN: Code duplicated, block: B:237:0x075f  */
    /* JADX WARN: Code duplicated, block: B:240:0x0771  */
    /* JADX WARN: Code duplicated, block: B:242:0x0775  */
    /* JADX WARN: Code duplicated, block: B:245:0x0789  */
    /* JADX WARN: Code duplicated, block: B:248:0x0797  */
    /* JADX WARN: Code duplicated, block: B:252:0x07b8 A[LOOP:0: B:246:0x0791->B:252:0x07b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:253:0x07ba A[Catch: SecurityException -> 0x07cb, TryCatch #0 {SecurityException -> 0x07cb, blocks: (B:251:0x07ac, B:254:0x07c6, B:253:0x07ba), top: B:281:0x0786 }] */
    /* JADX WARN: Code duplicated, block: B:257:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:260:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:261:0x07dd  */
    /* JADX WARN: Code duplicated, block: B:264:0x0801  */
    /* JADX WARN: Code duplicated, block: B:284:0x07ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:0x07ab A[SYNTHETIC] */
    public final cyk a(nme nmeVar, long j, Runnable runnable) {
        mga mgaVar;
        String str;
        int i;
        int i2;
        final mgk mgcVar;
        mgo mgoVar;
        boolean z;
        int i3;
        int i4;
        ojc ojcVarI;
        PackageManager packageManager;
        Intent intentA;
        ResolveInfo resolveInfoResolveActivity;
        Drawable drawable;
        Iterator<ResolveInfo> it;
        mgn mgnVar;
        ojc ojcVarI2;
        cyj cyjVarA = cyk.a();
        nmf nmfVar = nmeVar.a;
        ojc ojcVar = nmfVar.b;
        String str2 = nmfVar.a;
        if (ojcVar.g()) {
            str2 = (String) ojcVar.c();
        }
        String strD = d(str2);
        if (nmeVar.b == nlf.QR && strD.length() == 0) {
            strD = this.a.getString(R.string.qr_unsupported);
        }
        cyjVarA.a = strD;
        mgm mgmVar = (mgm) mfy.a.get(nmeVar.b);
        if (mgmVar == null) {
            int i5 = nmeVar.b.I;
            StringBuilder sb = new StringBuilder(37);
            sb.append("Not supported ResultType: ");
            sb.append(i5);
            throw new IllegalArgumentException(sb.toString());
        }
        mfz mfzVar = new mfz(null);
        mfzVar.a(mga.NONE);
        mfzVar.a = mgmVar;
        mfzVar.a((mga) mfy.b.get(nmeVar.c));
        nmf nmfVar2 = nmeVar.a;
        mfzVar.c = nmfVar2.a;
        if (nmfVar2.b.g()) {
            mfzVar.d = ojc.i((String) nmeVar.a.b.c());
        }
        if (nmeVar.h.g()) {
            Barcode.CalendarEvent calendarEvent = (Barcode.CalendarEvent) nmeVar.h.c();
            poy poyVarM = mih.h.m();
            String str3 = calendarEvent.summary;
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            mih mihVar = (mih) poyVarM.b;
            str3.getClass();
            mihVar.a = str3;
            String str4 = calendarEvent.description;
            str4.getClass();
            mihVar.b = str4;
            String str5 = calendarEvent.location;
            str5.getClass();
            mihVar.c = str5;
            String str6 = calendarEvent.organizer;
            str6.getClass();
            mihVar.d = str6;
            String str7 = calendarEvent.status;
            str7.getClass();
            mihVar.e = str7;
            mig migVarA = mfy.a(calendarEvent.start);
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            mih mihVar2 = (mih) poyVarM.b;
            migVarA.getClass();
            mihVar2.f = migVarA;
            mig migVarA2 = mfy.a(calendarEvent.end);
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            mih mihVar3 = (mih) poyVarM.b;
            migVarA2.getClass();
            mihVar3.g = migVarA2;
            mfzVar.e = ojc.i((mih) poyVarM.j());
        }
        if (nmeVar.e.g()) {
            nma nmaVar = (nma) nmeVar.e.c();
            poy poyVarM2 = mii.h.m();
            if (nmaVar.a.g()) {
                String str8 = (String) nmaVar.a.c();
                if (poyVarM2.c) {
                    poyVarM2.m();
                    poyVarM2.c = false;
                }
                ((mii) poyVarM2.b).a = str8;
            }
            if (nmaVar.d.g()) {
                String str9 = (String) nmaVar.d.c();
                if (poyVarM2.c) {
                    poyVarM2.m();
                    poyVarM2.c = false;
                }
                ((mii) poyVarM2.b).d = str9;
            }
            if (nmaVar.f.g()) {
                String str10 = (String) nmaVar.f.c();
                if (poyVarM2.c) {
                    poyVarM2.m();
                    poyVarM2.c = false;
                }
                ((mii) poyVarM2.b).f = str10;
            }
            if (nmaVar.e.g()) {
                String str11 = (String) nmaVar.e.c();
                if (poyVarM2.c) {
                    poyVarM2.m();
                    poyVarM2.c = false;
                }
                ((mii) poyVarM2.b).e = str11;
            }
            if (!nmaVar.b.isEmpty()) {
                oom oomVar = nmaVar.b;
                if (poyVarM2.c) {
                    poyVarM2.m();
                    poyVarM2.c = false;
                }
                mii miiVar = (mii) poyVarM2.b;
                ppm ppmVar = miiVar.b;
                if (!ppmVar.c()) {
                    miiVar.b = ppd.B(ppmVar);
                }
                pnl.e(oomVar, miiVar.b);
            }
            if (!nmaVar.c.isEmpty()) {
                oom oomVar2 = nmaVar.c;
                if (poyVarM2.c) {
                    poyVarM2.m();
                    poyVarM2.c = false;
                }
                mii miiVar2 = (mii) poyVarM2.b;
                ppm ppmVar2 = miiVar2.c;
                if (!ppmVar2.c()) {
                    miiVar2.c = ppd.B(ppmVar2);
                }
                pnl.e(oomVar2, miiVar2.c);
            }
            if (nmaVar.g.g()) {
                String str12 = (String) nmaVar.g.c();
                if (poyVarM2.c) {
                    poyVarM2.m();
                    poyVarM2.c = false;
                }
                ((mii) poyVarM2.b).g = str12;
            }
            mfzVar.h = ojc.i((mii) poyVarM2.j());
        }
        if (nmeVar.i.g()) {
            Barcode.GeoPoint geoPoint = (Barcode.GeoPoint) nmeVar.i.c();
            poy poyVarM3 = mij.c.m();
            double d = geoPoint.lat;
            if (poyVarM3.c) {
                poyVarM3.m();
                poyVarM3.c = false;
            }
            mij mijVar = (mij) poyVarM3.b;
            mijVar.a = d;
            mijVar.b = geoPoint.lng;
            mfzVar.i = ojc.i((mij) poyVarM3.j());
        }
        if (nmeVar.g.g()) {
            Barcode.Sms sms = (Barcode.Sms) nmeVar.g.c();
            poy poyVarM4 = mil.c.m();
            String str13 = sms.message;
            if (poyVarM4.c) {
                poyVarM4.m();
                poyVarM4.c = false;
            }
            mil milVar = (mil) poyVarM4.b;
            str13.getClass();
            milVar.a = str13;
            String str14 = sms.phoneNumber;
            str14.getClass();
            milVar.b = str14;
            mfzVar.j = ojc.i((mil) poyVarM4.j());
        }
        if (nmeVar.f.g()) {
            Barcode.WiFi wiFi = (Barcode.WiFi) nmeVar.f.c();
            poy poyVarM5 = min.e.m();
            mim mimVarB = mim.b(wiFi.encryptionType);
            if (poyVarM5.c) {
                poyVarM5.m();
                poyVarM5.c = false;
            }
            ((min) poyVarM5.b).b = mimVarB.a();
            String str15 = wiFi.ssid;
            if (poyVarM5.c) {
                poyVarM5.m();
                poyVarM5.c = false;
            }
            min minVar = (min) poyVarM5.b;
            str15.getClass();
            minVar.a = str15;
            String str16 = wiFi.password;
            str16.getClass();
            minVar.c = str16;
            minVar.d = wiFi.isHidden;
            mfzVar.k = ojc.i((min) poyVarM5.j());
        }
        mgm mgmVar2 = mfzVar.a;
        if (mgmVar2 == null || (mgaVar = mfzVar.b) == null || (str = mfzVar.c) == null) {
            StringBuilder sb2 = new StringBuilder();
            if (mfzVar.a == null) {
                sb2.append(" actionType");
            }
            if (mfzVar.b == null) {
                sb2.append(" engineType");
            }
            if (mfzVar.c == null) {
                sb2.append(" actionText");
            }
            String strValueOf = String.valueOf(sb2);
            StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
            sb3.append("Missing required properties:");
            sb3.append(strValueOf);
            throw new IllegalStateException(sb3.toString());
        }
        mgb mgbVar = new mgb(mgmVar2, mgaVar, str, mfzVar.d, mfzVar.e, mfzVar.f, mfzVar.g, mfzVar.h, mfzVar.i, mfzVar.j, mfzVar.k);
        mgo mgoVar2 = this.e;
        int i6 = mgoVar2.b;
        Context context = mgoVar2.a;
        dae daeVar = mgoVar2.c;
        odu oduVar = new odu(context, null, null);
        switch (mgbVar.a) {
            case CALENDAR:
                i = 1;
                i2 = 2;
                mgcVar = new mgc(oduVar, mgbVar, mgoVar2.a, null, null);
                if (e(nmeVar.b)) {
                    cyjVarA.e = i;
                } else {
                    cyjVarA.e = i2;
                    cyjVarA.b = new Runnable() { // from class: czp
                        @Override // java.lang.Runnable
                        public final void run() {
                            mgcVar.b();
                        }
                    };
                }
                if (!e(nmeVar.b)) {
                    mgoVar = this.e;
                    z = mgcVar instanceof mgn;
                    i3 = R.drawable.ic_signal_wifi_4_bar_lock_black_round_24dp;
                    if (z) {
                        mgnVar = (mgn) mgcVar;
                        if (oje.d(mgnVar.a.preSharedKey) && (mgnVar.a.wepKeys.length <= 0 || oje.d(mgnVar.a.wepKeys[0]))) {
                            i3 = R.drawable.ic_signal_wifi_4_bar_black_round_24dp;
                        }
                        Drawable drawable2 = mgoVar.a.getDrawable(i3);
                        drawable2.getClass();
                        ojcVarI = ojc.i(drawable2);
                    } else if (r15.j.g() || ((min) mgbVar.j.c()).equals(min.e)) {
                        switch (r15.a.ordinal()) {
                            case 1:
                                i4 = R.drawable.quantum_ic_phone_white_24;
                                break;
                            case 2:
                                i4 = R.drawable.quantum_ic_contacts_product_white_24;
                                break;
                            case 3:
                            default:
                                i4 = -1;
                                break;
                            case 4:
                                i4 = R.drawable.quantum_ic_email_white_24;
                                break;
                            case 5:
                                i4 = R.drawable.quantum_ic_location_on_white_24;
                                break;
                            case 6:
                                i4 = R.drawable.quantum_ic_public_white_24;
                                break;
                            case 7:
                            case 8:
                                i4 = R.drawable.quantum_ic_barcode_scanner_white_24;
                                break;
                        }
                        if (i4 < 0 && !(mgcVar instanceof mgg)) {
                            Drawable drawable3 = mgoVar.a.getDrawable(i4);
                            drawable3.getClass();
                            ojcVarI = ojc.i(drawable3);
                        } else if (mgcVar instanceof mgg) {
                            packageManager = mgoVar.a.getPackageManager();
                            intentA = ((mgg) mgcVar).a();
                            resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                            try {
                                if (resolveInfoResolveActivity == null) {
                                    drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity2 = packageManager.resolveActivity(intentA, 0);
                                            resolveInfoResolveActivity2.getClass();
                                            drawable = resolveInfoResolveActivity2.loadIcon(packageManager);
                                        }
                                    }
                                }
                                ojcVarI = ojc.i(drawable);
                            } catch (SecurityException e) {
                                ojcVarI = oih.a;
                            }
                        } else {
                            ojcVarI = oih.a;
                        }
                    } else {
                        Drawable drawable4 = mgoVar.a.getDrawable(R.drawable.ic_signal_wifi_4_bar_lock_black_round_24dp);
                        drawable4.getClass();
                        ojcVarI = ojc.i(drawable4);
                    }
                    if (ojcVarI.g()) {
                        cyjVarA.c = (Drawable) ojcVarI.c();
                    } else {
                        cyjVarA.c = this.a.getResources().getDrawable(R.drawable.product_logo_lens_new_color_24, null);
                    }
                    break;
                } else {
                    cyjVarA.c = this.a.getResources().getDrawable(R.drawable.product_logo_lens_new_color_24, null);
                }
                cyjVarA.e(j);
                cyjVarA.d(runnable);
                cyjVarA.f = i2;
                if (nmeVar.d.g()) {
                    cyjVarA.b(((Barcode) nmeVar.d.c()).format);
                    cyjVarA.c(((Barcode) nmeVar.d.c()).valueFormat);
                }
                return cyjVarA.a();
            case CALL:
                mgcVar = new mge(oduVar, mgbVar.c, 1, null, null);
                i = 1;
                i2 = 2;
                if (e(nmeVar.b)) {
                    cyjVarA.e = i;
                } else {
                    cyjVarA.e = i2;
                    cyjVarA.b = new Runnable() { // from class: czp
                        @Override // java.lang.Runnable
                        public final void run() {
                            mgcVar.b();
                        }
                    };
                }
                if (!e(nmeVar.b)) {
                    mgoVar = this.e;
                    z = mgcVar instanceof mgn;
                    i3 = R.drawable.ic_signal_wifi_4_bar_lock_black_round_24dp;
                    if (z) {
                        mgnVar = (mgn) mgcVar;
                        if (oje.d(mgnVar.a.preSharedKey)) {
                            i3 = R.drawable.ic_signal_wifi_4_bar_black_round_24dp;
                        }
                        Drawable drawable5 = mgoVar.a.getDrawable(i3);
                        drawable5.getClass();
                        ojcVarI = ojc.i(drawable5);
                    } else if (r15.j.g()) {
                        switch (r15.a.ordinal()) {
                            case 1:
                                i4 = R.drawable.quantum_ic_phone_white_24;
                                break;
                            case 2:
                                i4 = R.drawable.quantum_ic_contacts_product_white_24;
                                break;
                            case 3:
                            default:
                                i4 = -1;
                                break;
                            case 4:
                                i4 = R.drawable.quantum_ic_email_white_24;
                                break;
                            case 5:
                                i4 = R.drawable.quantum_ic_location_on_white_24;
                                break;
                            case 6:
                                i4 = R.drawable.quantum_ic_public_white_24;
                                break;
                            case 7:
                            case 8:
                                i4 = R.drawable.quantum_ic_barcode_scanner_white_24;
                                break;
                        }
                        if (i4 < 0) {
                            if (mgcVar instanceof mgg) {
                                packageManager = mgoVar.a.getPackageManager();
                                intentA = ((mgg) mgcVar).a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity3 = packageManager.resolveActivity(intentA, 0);
                                            resolveInfoResolveActivity3.getClass();
                                            drawable = resolveInfoResolveActivity3.loadIcon(packageManager);
                                        }
                                    }
                                }
                                ojcVarI = ojc.i(drawable);
                            } else {
                                ojcVarI = oih.a;
                            }
                        } else if (mgcVar instanceof mgg) {
                            packageManager = mgoVar.a.getPackageManager();
                            intentA = ((mgg) mgcVar).a();
                            resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                            if (resolveInfoResolveActivity == null) {
                                drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                drawable.getClass();
                            } else {
                                it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                        ResolveInfo resolveInfoResolveActivity4 = packageManager.resolveActivity(intentA, 0);
                                        resolveInfoResolveActivity4.getClass();
                                        drawable = resolveInfoResolveActivity4.loadIcon(packageManager);
                                    }
                                }
                            }
                            ojcVarI = ojc.i(drawable);
                        } else {
                            ojcVarI = oih.a;
                        }
                    } else {
                        switch (r15.a.ordinal()) {
                            case 1:
                                i4 = R.drawable.quantum_ic_phone_white_24;
                                break;
                            case 2:
                                i4 = R.drawable.quantum_ic_contacts_product_white_24;
                                break;
                            case 3:
                            default:
                                i4 = -1;
                                break;
                            case 4:
                                i4 = R.drawable.quantum_ic_email_white_24;
                                break;
                            case 5:
                                i4 = R.drawable.quantum_ic_location_on_white_24;
                                break;
                            case 6:
                                i4 = R.drawable.quantum_ic_public_white_24;
                                break;
                            case 7:
                            case 8:
                                i4 = R.drawable.quantum_ic_barcode_scanner_white_24;
                                break;
                        }
                        if (i4 < 0) {
                            if (mgcVar instanceof mgg) {
                                packageManager = mgoVar.a.getPackageManager();
                                intentA = ((mgg) mgcVar).a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity5 = packageManager.resolveActivity(intentA, 0);
                                            resolveInfoResolveActivity5.getClass();
                                            drawable = resolveInfoResolveActivity5.loadIcon(packageManager);
                                        }
                                    }
                                }
                                ojcVarI = ojc.i(drawable);
                            } else {
                                ojcVarI = oih.a;
                            }
                        } else if (mgcVar instanceof mgg) {
                            packageManager = mgoVar.a.getPackageManager();
                            intentA = ((mgg) mgcVar).a();
                            resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                            if (resolveInfoResolveActivity == null) {
                                drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                drawable.getClass();
                            } else {
                                it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                        ResolveInfo resolveInfoResolveActivity6 = packageManager.resolveActivity(intentA, 0);
                                        resolveInfoResolveActivity6.getClass();
                                        drawable = resolveInfoResolveActivity6.loadIcon(packageManager);
                                    }
                                }
                            }
                            ojcVarI = ojc.i(drawable);
                        } else {
                            ojcVarI = oih.a;
                        }
                    }
                    if (ojcVarI.g()) {
                        cyjVarA.c = (Drawable) ojcVarI.c();
                    } else {
                        cyjVarA.c = this.a.getResources().getDrawable(R.drawable.product_logo_lens_new_color_24, null);
                    }
                    break;
                } else {
                    cyjVarA.c = this.a.getResources().getDrawable(R.drawable.product_logo_lens_new_color_24, null);
                }
                cyjVarA.e(j);
                cyjVarA.d(runnable);
                cyjVarA.f = i2;
                if (nmeVar.d.g()) {
                    cyjVarA.b(((Barcode) nmeVar.d.c()).format);
                    cyjVarA.c(((Barcode) nmeVar.d.c()).valueFormat);
                }
                return cyjVarA.a();
            case CONTACT:
                dae daeVar2 = mgoVar2.c;
                ojc ojcVar2 = mgbVar.g;
                String str17 = mgbVar.c;
                mgoVar2.a.getString(R.string.iris_talkback_label_contact);
                mgcVar = new mgh(oduVar, ojcVar2, str17, 1, (byte[]) null, (byte[]) null);
                i = 1;
                i2 = 2;
                if (e(nmeVar.b)) {
                    cyjVarA.e = i;
                } else {
                    cyjVarA.e = i2;
                    cyjVarA.b = new Runnable() { // from class: czp
                        @Override // java.lang.Runnable
                        public final void run() {
                            mgcVar.b();
                        }
                    };
                }
                if (!e(nmeVar.b)) {
                    mgoVar = this.e;
                    z = mgcVar instanceof mgn;
                    i3 = R.drawable.ic_signal_wifi_4_bar_lock_black_round_24dp;
                    if (z) {
                        mgnVar = (mgn) mgcVar;
                        if (oje.d(mgnVar.a.preSharedKey)) {
                            i3 = R.drawable.ic_signal_wifi_4_bar_black_round_24dp;
                        }
                        Drawable drawable6 = mgoVar.a.getDrawable(i3);
                        drawable6.getClass();
                        ojcVarI = ojc.i(drawable6);
                    } else if (r15.j.g()) {
                        switch (r15.a.ordinal()) {
                            case 1:
                                i4 = R.drawable.quantum_ic_phone_white_24;
                                break;
                            case 2:
                                i4 = R.drawable.quantum_ic_contacts_product_white_24;
                                break;
                            case 3:
                            default:
                                i4 = -1;
                                break;
                            case 4:
                                i4 = R.drawable.quantum_ic_email_white_24;
                                break;
                            case 5:
                                i4 = R.drawable.quantum_ic_location_on_white_24;
                                break;
                            case 6:
                                i4 = R.drawable.quantum_ic_public_white_24;
                                break;
                            case 7:
                            case 8:
                                i4 = R.drawable.quantum_ic_barcode_scanner_white_24;
                                break;
                        }
                        if (i4 < 0) {
                            if (mgcVar instanceof mgg) {
                                packageManager = mgoVar.a.getPackageManager();
                                intentA = ((mgg) mgcVar).a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity7 = packageManager.resolveActivity(intentA, 0);
                                            resolveInfoResolveActivity7.getClass();
                                            drawable = resolveInfoResolveActivity7.loadIcon(packageManager);
                                        }
                                    }
                                }
                                ojcVarI = ojc.i(drawable);
                            } else {
                                ojcVarI = oih.a;
                            }
                        } else if (mgcVar instanceof mgg) {
                            packageManager = mgoVar.a.getPackageManager();
                            intentA = ((mgg) mgcVar).a();
                            resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                            if (resolveInfoResolveActivity == null) {
                                drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                drawable.getClass();
                            } else {
                                it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                        ResolveInfo resolveInfoResolveActivity8 = packageManager.resolveActivity(intentA, 0);
                                        resolveInfoResolveActivity8.getClass();
                                        drawable = resolveInfoResolveActivity8.loadIcon(packageManager);
                                    }
                                }
                            }
                            ojcVarI = ojc.i(drawable);
                        } else {
                            ojcVarI = oih.a;
                        }
                    } else {
                        switch (r15.a.ordinal()) {
                            case 1:
                                i4 = R.drawable.quantum_ic_phone_white_24;
                                break;
                            case 2:
                                i4 = R.drawable.quantum_ic_contacts_product_white_24;
                                break;
                            case 3:
                            default:
                                i4 = -1;
                                break;
                            case 4:
                                i4 = R.drawable.quantum_ic_email_white_24;
                                break;
                            case 5:
                                i4 = R.drawable.quantum_ic_location_on_white_24;
                                break;
                            case 6:
                                i4 = R.drawable.quantum_ic_public_white_24;
                                break;
                            case 7:
                            case 8:
                                i4 = R.drawable.quantum_ic_barcode_scanner_white_24;
                                break;
                        }
                        if (i4 < 0) {
                            if (mgcVar instanceof mgg) {
                                packageManager = mgoVar.a.getPackageManager();
                                intentA = ((mgg) mgcVar).a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity9 = packageManager.resolveActivity(intentA, 0);
                                            resolveInfoResolveActivity9.getClass();
                                            drawable = resolveInfoResolveActivity9.loadIcon(packageManager);
                                        }
                                    }
                                }
                                ojcVarI = ojc.i(drawable);
                            } else {
                                ojcVarI = oih.a;
                            }
                        } else if (mgcVar instanceof mgg) {
                            packageManager = mgoVar.a.getPackageManager();
                            intentA = ((mgg) mgcVar).a();
                            resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                            if (resolveInfoResolveActivity == null) {
                                drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                drawable.getClass();
                            } else {
                                it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                        ResolveInfo resolveInfoResolveActivity10 = packageManager.resolveActivity(intentA, 0);
                                        resolveInfoResolveActivity10.getClass();
                                        drawable = resolveInfoResolveActivity10.loadIcon(packageManager);
                                    }
                                }
                            }
                            ojcVarI = ojc.i(drawable);
                        } else {
                            ojcVarI = oih.a;
                        }
                    }
                    if (ojcVarI.g()) {
                        cyjVarA.c = (Drawable) ojcVarI.c();
                    } else {
                        cyjVarA.c = this.a.getResources().getDrawable(R.drawable.product_logo_lens_new_color_24, null);
                    }
                    break;
                } else {
                    cyjVarA.c = this.a.getResources().getDrawable(R.drawable.product_logo_lens_new_color_24, null);
                }
                cyjVarA.e(j);
                cyjVarA.d(runnable);
                cyjVarA.f = i2;
                if (nmeVar.d.g()) {
                    cyjVarA.b(((Barcode) nmeVar.d.c()).format);
                    cyjVarA.c(((Barcode) nmeVar.d.c()).valueFormat);
                }
                return cyjVarA.a();
            case COPY:
                Context context2 = mgoVar2.a;
                dae daeVar3 = mgoVar2.c;
                mgcVar = new mgd(context2, mgbVar.c);
                i = 1;
                i2 = 2;
                if (e(nmeVar.b)) {
                    cyjVarA.e = i;
                } else {
                    cyjVarA.e = i2;
                    cyjVarA.b = new Runnable() { // from class: czp
                        @Override // java.lang.Runnable
                        public final void run() {
                            mgcVar.b();
                        }
                    };
                }
                if (!e(nmeVar.b)) {
                    mgoVar = this.e;
                    z = mgcVar instanceof mgn;
                    i3 = R.drawable.ic_signal_wifi_4_bar_lock_black_round_24dp;
                    if (z) {
                        mgnVar = (mgn) mgcVar;
                        if (oje.d(mgnVar.a.preSharedKey)) {
                            i3 = R.drawable.ic_signal_wifi_4_bar_black_round_24dp;
                        }
                        Drawable drawable7 = mgoVar.a.getDrawable(i3);
                        drawable7.getClass();
                        ojcVarI = ojc.i(drawable7);
                    } else if (r15.j.g()) {
                        switch (r15.a.ordinal()) {
                            case 1:
                                i4 = R.drawable.quantum_ic_phone_white_24;
                                break;
                            case 2:
                                i4 = R.drawable.quantum_ic_contacts_product_white_24;
                                break;
                            case 3:
                            default:
                                i4 = -1;
                                break;
                            case 4:
                                i4 = R.drawable.quantum_ic_email_white_24;
                                break;
                            case 5:
                                i4 = R.drawable.quantum_ic_location_on_white_24;
                                break;
                            case 6:
                                i4 = R.drawable.quantum_ic_public_white_24;
                                break;
                            case 7:
                            case 8:
                                i4 = R.drawable.quantum_ic_barcode_scanner_white_24;
                                break;
                        }
                        if (i4 < 0) {
                            if (mgcVar instanceof mgg) {
                                packageManager = mgoVar.a.getPackageManager();
                                intentA = ((mgg) mgcVar).a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity11 = packageManager.resolveActivity(intentA, 0);
                                            resolveInfoResolveActivity11.getClass();
                                            drawable = resolveInfoResolveActivity11.loadIcon(packageManager);
                                        }
                                    }
                                }
                                ojcVarI = ojc.i(drawable);
                            } else {
                                ojcVarI = oih.a;
                            }
                        } else if (mgcVar instanceof mgg) {
                            packageManager = mgoVar.a.getPackageManager();
                            intentA = ((mgg) mgcVar).a();
                            resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                            if (resolveInfoResolveActivity == null) {
                                drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                drawable.getClass();
                            } else {
                                it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                        ResolveInfo resolveInfoResolveActivity12 = packageManager.resolveActivity(intentA, 0);
                                        resolveInfoResolveActivity12.getClass();
                                        drawable = resolveInfoResolveActivity12.loadIcon(packageManager);
                                    }
                                }
                            }
                            ojcVarI = ojc.i(drawable);
                        } else {
                            ojcVarI = oih.a;
                        }
                    } else {
                        switch (r15.a.ordinal()) {
                            case 1:
                                i4 = R.drawable.quantum_ic_phone_white_24;
                                break;
                            case 2:
                                i4 = R.drawable.quantum_ic_contacts_product_white_24;
                                break;
                            case 3:
                            default:
                                i4 = -1;
                                break;
                            case 4:
                                i4 = R.drawable.quantum_ic_email_white_24;
                                break;
                            case 5:
                                i4 = R.drawable.quantum_ic_location_on_white_24;
                                break;
                            case 6:
                                i4 = R.drawable.quantum_ic_public_white_24;
                                break;
                            case 7:
                            case 8:
                                i4 = R.drawable.quantum_ic_barcode_scanner_white_24;
                                break;
                        }
                        if (i4 < 0) {
                            if (mgcVar instanceof mgg) {
                                packageManager = mgoVar.a.getPackageManager();
                                intentA = ((mgg) mgcVar).a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity13 = packageManager.resolveActivity(intentA, 0);
                                            resolveInfoResolveActivity13.getClass();
                                            drawable = resolveInfoResolveActivity13.loadIcon(packageManager);
                                        }
                                    }
                                }
                                ojcVarI = ojc.i(drawable);
                            } else {
                                ojcVarI = oih.a;
                            }
                        } else if (mgcVar instanceof mgg) {
                            packageManager = mgoVar.a.getPackageManager();
                            intentA = ((mgg) mgcVar).a();
                            resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                            if (resolveInfoResolveActivity == null) {
                                drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                drawable.getClass();
                            } else {
                                it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                        ResolveInfo resolveInfoResolveActivity14 = packageManager.resolveActivity(intentA, 0);
                                        resolveInfoResolveActivity14.getClass();
                                        drawable = resolveInfoResolveActivity14.loadIcon(packageManager);
                                    }
                                }
                            }
                            ojcVarI = ojc.i(drawable);
                        } else {
                            ojcVarI = oih.a;
                        }
                    }
                    if (ojcVarI.g()) {
                        cyjVarA.c = (Drawable) ojcVarI.c();
                    } else {
                        cyjVarA.c = this.a.getResources().getDrawable(R.drawable.product_logo_lens_new_color_24, null);
                    }
                    break;
                } else {
                    cyjVarA.c = this.a.getResources().getDrawable(R.drawable.product_logo_lens_new_color_24, null);
                }
                cyjVarA.e(j);
                cyjVarA.d(runnable);
                cyjVarA.f = i2;
                if (nmeVar.d.g()) {
                    cyjVarA.b(((Barcode) nmeVar.d.c()).format);
                    cyjVarA.c(((Barcode) nmeVar.d.c()).valueFormat);
                }
                return cyjVarA.a();
            case EMAIL:
                mgcVar = new mge(oduVar, mgbVar.c, 0, null, null);
                i = 1;
                i2 = 2;
                if (e(nmeVar.b)) {
                    cyjVarA.e = i;
                } else {
                    cyjVarA.e = i2;
                    cyjVarA.b = new Runnable() { // from class: czp
                        @Override // java.lang.Runnable
                        public final void run() {
                            mgcVar.b();
                        }
                    };
                }
                if (!e(nmeVar.b)) {
                    mgoVar = this.e;
                    z = mgcVar instanceof mgn;
                    i3 = R.drawable.ic_signal_wifi_4_bar_lock_black_round_24dp;
                    if (z) {
                        mgnVar = (mgn) mgcVar;
                        if (oje.d(mgnVar.a.preSharedKey)) {
                            i3 = R.drawable.ic_signal_wifi_4_bar_black_round_24dp;
                        }
                        Drawable drawable8 = mgoVar.a.getDrawable(i3);
                        drawable8.getClass();
                        ojcVarI = ojc.i(drawable8);
                    } else if (r15.j.g()) {
                        switch (r15.a.ordinal()) {
                            case 1:
                                i4 = R.drawable.quantum_ic_phone_white_24;
                                break;
                            case 2:
                                i4 = R.drawable.quantum_ic_contacts_product_white_24;
                                break;
                            case 3:
                            default:
                                i4 = -1;
                                break;
                            case 4:
                                i4 = R.drawable.quantum_ic_email_white_24;
                                break;
                            case 5:
                                i4 = R.drawable.quantum_ic_location_on_white_24;
                                break;
                            case 6:
                                i4 = R.drawable.quantum_ic_public_white_24;
                                break;
                            case 7:
                            case 8:
                                i4 = R.drawable.quantum_ic_barcode_scanner_white_24;
                                break;
                        }
                        if (i4 < 0) {
                            if (mgcVar instanceof mgg) {
                                packageManager = mgoVar.a.getPackageManager();
                                intentA = ((mgg) mgcVar).a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity15 = packageManager.resolveActivity(intentA, 0);
                                            resolveInfoResolveActivity15.getClass();
                                            drawable = resolveInfoResolveActivity15.loadIcon(packageManager);
                                        }
                                    }
                                }
                                ojcVarI = ojc.i(drawable);
                            } else {
                                ojcVarI = oih.a;
                            }
                        } else if (mgcVar instanceof mgg) {
                            packageManager = mgoVar.a.getPackageManager();
                            intentA = ((mgg) mgcVar).a();
                            resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                            if (resolveInfoResolveActivity == null) {
                                drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                drawable.getClass();
                            } else {
                                it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                        ResolveInfo resolveInfoResolveActivity16 = packageManager.resolveActivity(intentA, 0);
                                        resolveInfoResolveActivity16.getClass();
                                        drawable = resolveInfoResolveActivity16.loadIcon(packageManager);
                                    }
                                }
                            }
                            ojcVarI = ojc.i(drawable);
                        } else {
                            ojcVarI = oih.a;
                        }
                    } else {
                        switch (r15.a.ordinal()) {
                            case 1:
                                i4 = R.drawable.quantum_ic_phone_white_24;
                                break;
                            case 2:
                                i4 = R.drawable.quantum_ic_contacts_product_white_24;
                                break;
                            case 3:
                            default:
                                i4 = -1;
                                break;
                            case 4:
                                i4 = R.drawable.quantum_ic_email_white_24;
                                break;
                            case 5:
                                i4 = R.drawable.quantum_ic_location_on_white_24;
                                break;
                            case 6:
                                i4 = R.drawable.quantum_ic_public_white_24;
                                break;
                            case 7:
                            case 8:
                                i4 = R.drawable.quantum_ic_barcode_scanner_white_24;
                                break;
                        }
                        if (i4 < 0) {
                            if (mgcVar instanceof mgg) {
                                packageManager = mgoVar.a.getPackageManager();
                                intentA = ((mgg) mgcVar).a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity17 = packageManager.resolveActivity(intentA, 0);
                                            resolveInfoResolveActivity17.getClass();
                                            drawable = resolveInfoResolveActivity17.loadIcon(packageManager);
                                        }
                                    }
                                }
                                ojcVarI = ojc.i(drawable);
                            } else {
                                ojcVarI = oih.a;
                            }
                        } else if (mgcVar instanceof mgg) {
                            packageManager = mgoVar.a.getPackageManager();
                            intentA = ((mgg) mgcVar).a();
                            resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                            if (resolveInfoResolveActivity == null) {
                                drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                drawable.getClass();
                            } else {
                                it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                        ResolveInfo resolveInfoResolveActivity18 = packageManager.resolveActivity(intentA, 0);
                                        resolveInfoResolveActivity18.getClass();
                                        drawable = resolveInfoResolveActivity18.loadIcon(packageManager);
                                    }
                                }
                            }
                            ojcVarI = ojc.i(drawable);
                        } else {
                            ojcVarI = oih.a;
                        }
                    }
                    if (ojcVarI.g()) {
                        cyjVarA.c = (Drawable) ojcVarI.c();
                    } else {
                        cyjVarA.c = this.a.getResources().getDrawable(R.drawable.product_logo_lens_new_color_24, null);
                    }
                    break;
                } else {
                    cyjVarA.c = this.a.getResources().getDrawable(R.drawable.product_logo_lens_new_color_24, null);
                }
                cyjVarA.e(j);
                cyjVarA.d(runnable);
                cyjVarA.f = i2;
                if (nmeVar.d.g()) {
                    cyjVarA.b(((Barcode) nmeVar.d.c()).format);
                    cyjVarA.c(((Barcode) nmeVar.d.c()).valueFormat);
                }
                return cyjVarA.a();
            case MAP:
                mgcVar = new mgh(oduVar, mgbVar.c, mgbVar.h, 0, (byte[]) null, (byte[]) null);
                i = 1;
                i2 = 2;
                if (e(nmeVar.b)) {
                    cyjVarA.e = i;
                } else {
                    cyjVarA.e = i2;
                    cyjVarA.b = new Runnable() { // from class: czp
                        @Override // java.lang.Runnable
                        public final void run() {
                            mgcVar.b();
                        }
                    };
                }
                if (!e(nmeVar.b)) {
                    mgoVar = this.e;
                    z = mgcVar instanceof mgn;
                    i3 = R.drawable.ic_signal_wifi_4_bar_lock_black_round_24dp;
                    if (z) {
                        mgnVar = (mgn) mgcVar;
                        if (oje.d(mgnVar.a.preSharedKey)) {
                            i3 = R.drawable.ic_signal_wifi_4_bar_black_round_24dp;
                        }
                        Drawable drawable9 = mgoVar.a.getDrawable(i3);
                        drawable9.getClass();
                        ojcVarI = ojc.i(drawable9);
                    } else if (r15.j.g()) {
                        switch (r15.a.ordinal()) {
                            case 1:
                                i4 = R.drawable.quantum_ic_phone_white_24;
                                break;
                            case 2:
                                i4 = R.drawable.quantum_ic_contacts_product_white_24;
                                break;
                            case 3:
                            default:
                                i4 = -1;
                                break;
                            case 4:
                                i4 = R.drawable.quantum_ic_email_white_24;
                                break;
                            case 5:
                                i4 = R.drawable.quantum_ic_location_on_white_24;
                                break;
                            case 6:
                                i4 = R.drawable.quantum_ic_public_white_24;
                                break;
                            case 7:
                            case 8:
                                i4 = R.drawable.quantum_ic_barcode_scanner_white_24;
                                break;
                        }
                        if (i4 < 0) {
                            if (mgcVar instanceof mgg) {
                                packageManager = mgoVar.a.getPackageManager();
                                intentA = ((mgg) mgcVar).a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity19 = packageManager.resolveActivity(intentA, 0);
                                            resolveInfoResolveActivity19.getClass();
                                            drawable = resolveInfoResolveActivity19.loadIcon(packageManager);
                                        }
                                    }
                                }
                                ojcVarI = ojc.i(drawable);
                            } else {
                                ojcVarI = oih.a;
                            }
                        } else if (mgcVar instanceof mgg) {
                            packageManager = mgoVar.a.getPackageManager();
                            intentA = ((mgg) mgcVar).a();
                            resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                            if (resolveInfoResolveActivity == null) {
                                drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                drawable.getClass();
                            } else {
                                it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                        ResolveInfo resolveInfoResolveActivity110 = packageManager.resolveActivity(intentA, 0);
                                        resolveInfoResolveActivity110.getClass();
                                        drawable = resolveInfoResolveActivity110.loadIcon(packageManager);
                                    }
                                }
                            }
                            ojcVarI = ojc.i(drawable);
                        } else {
                            ojcVarI = oih.a;
                        }
                    } else {
                        switch (r15.a.ordinal()) {
                            case 1:
                                i4 = R.drawable.quantum_ic_phone_white_24;
                                break;
                            case 2:
                                i4 = R.drawable.quantum_ic_contacts_product_white_24;
                                break;
                            case 3:
                            default:
                                i4 = -1;
                                break;
                            case 4:
                                i4 = R.drawable.quantum_ic_email_white_24;
                                break;
                            case 5:
                                i4 = R.drawable.quantum_ic_location_on_white_24;
                                break;
                            case 6:
                                i4 = R.drawable.quantum_ic_public_white_24;
                                break;
                            case 7:
                            case 8:
                                i4 = R.drawable.quantum_ic_barcode_scanner_white_24;
                                break;
                        }
                        if (i4 < 0) {
                            if (mgcVar instanceof mgg) {
                                packageManager = mgoVar.a.getPackageManager();
                                intentA = ((mgg) mgcVar).a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity111 = packageManager.resolveActivity(intentA, 0);
                                            resolveInfoResolveActivity111.getClass();
                                            drawable = resolveInfoResolveActivity111.loadIcon(packageManager);
                                        }
                                    }
                                }
                                ojcVarI = ojc.i(drawable);
                            } else {
                                ojcVarI = oih.a;
                            }
                        } else if (mgcVar instanceof mgg) {
                            packageManager = mgoVar.a.getPackageManager();
                            intentA = ((mgg) mgcVar).a();
                            resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                            if (resolveInfoResolveActivity == null) {
                                drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                drawable.getClass();
                            } else {
                                it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                        ResolveInfo resolveInfoResolveActivity112 = packageManager.resolveActivity(intentA, 0);
                                        resolveInfoResolveActivity112.getClass();
                                        drawable = resolveInfoResolveActivity112.loadIcon(packageManager);
                                    }
                                }
                            }
                            ojcVarI = ojc.i(drawable);
                        } else {
                            ojcVarI = oih.a;
                        }
                    }
                    if (ojcVarI.g()) {
                        cyjVarA.c = (Drawable) ojcVarI.c();
                    } else {
                        cyjVarA.c = this.a.getResources().getDrawable(R.drawable.product_logo_lens_new_color_24, null);
                    }
                    break;
                } else {
                    cyjVarA.c = this.a.getResources().getDrawable(R.drawable.product_logo_lens_new_color_24, null);
                }
                cyjVarA.e(j);
                cyjVarA.d(runnable);
                cyjVarA.f = i2;
                if (nmeVar.d.g()) {
                    cyjVarA.b(((Barcode) nmeVar.d.c()).format);
                    cyjVarA.c(((Barcode) nmeVar.d.c()).valueFormat);
                }
                return cyjVarA.a();
            case OPEN_URL:
                mgcVar = new mge(oduVar, mgbVar.c, 2, null, null);
                i = 1;
                i2 = 2;
                if (e(nmeVar.b)) {
                    cyjVarA.e = i;
                } else {
                    cyjVarA.e = i2;
                    cyjVarA.b = new Runnable() { // from class: czp
                        @Override // java.lang.Runnable
                        public final void run() {
                            mgcVar.b();
                        }
                    };
                }
                if (!e(nmeVar.b)) {
                    mgoVar = this.e;
                    z = mgcVar instanceof mgn;
                    i3 = R.drawable.ic_signal_wifi_4_bar_lock_black_round_24dp;
                    if (z) {
                        mgnVar = (mgn) mgcVar;
                        if (oje.d(mgnVar.a.preSharedKey)) {
                            i3 = R.drawable.ic_signal_wifi_4_bar_black_round_24dp;
                        }
                        Drawable drawable10 = mgoVar.a.getDrawable(i3);
                        drawable10.getClass();
                        ojcVarI = ojc.i(drawable10);
                    } else if (r15.j.g()) {
                        switch (r15.a.ordinal()) {
                            case 1:
                                i4 = R.drawable.quantum_ic_phone_white_24;
                                break;
                            case 2:
                                i4 = R.drawable.quantum_ic_contacts_product_white_24;
                                break;
                            case 3:
                            default:
                                i4 = -1;
                                break;
                            case 4:
                                i4 = R.drawable.quantum_ic_email_white_24;
                                break;
                            case 5:
                                i4 = R.drawable.quantum_ic_location_on_white_24;
                                break;
                            case 6:
                                i4 = R.drawable.quantum_ic_public_white_24;
                                break;
                            case 7:
                            case 8:
                                i4 = R.drawable.quantum_ic_barcode_scanner_white_24;
                                break;
                        }
                        if (i4 < 0) {
                            if (mgcVar instanceof mgg) {
                                packageManager = mgoVar.a.getPackageManager();
                                intentA = ((mgg) mgcVar).a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity113 = packageManager.resolveActivity(intentA, 0);
                                            resolveInfoResolveActivity113.getClass();
                                            drawable = resolveInfoResolveActivity113.loadIcon(packageManager);
                                        }
                                    }
                                }
                                ojcVarI = ojc.i(drawable);
                            } else {
                                ojcVarI = oih.a;
                            }
                        } else if (mgcVar instanceof mgg) {
                            packageManager = mgoVar.a.getPackageManager();
                            intentA = ((mgg) mgcVar).a();
                            resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                            if (resolveInfoResolveActivity == null) {
                                drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                drawable.getClass();
                            } else {
                                it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                        ResolveInfo resolveInfoResolveActivity114 = packageManager.resolveActivity(intentA, 0);
                                        resolveInfoResolveActivity114.getClass();
                                        drawable = resolveInfoResolveActivity114.loadIcon(packageManager);
                                    }
                                }
                            }
                            ojcVarI = ojc.i(drawable);
                        } else {
                            ojcVarI = oih.a;
                        }
                    } else {
                        switch (r15.a.ordinal()) {
                            case 1:
                                i4 = R.drawable.quantum_ic_phone_white_24;
                                break;
                            case 2:
                                i4 = R.drawable.quantum_ic_contacts_product_white_24;
                                break;
                            case 3:
                            default:
                                i4 = -1;
                                break;
                            case 4:
                                i4 = R.drawable.quantum_ic_email_white_24;
                                break;
                            case 5:
                                i4 = R.drawable.quantum_ic_location_on_white_24;
                                break;
                            case 6:
                                i4 = R.drawable.quantum_ic_public_white_24;
                                break;
                            case 7:
                            case 8:
                                i4 = R.drawable.quantum_ic_barcode_scanner_white_24;
                                break;
                        }
                        if (i4 < 0) {
                            if (mgcVar instanceof mgg) {
                                packageManager = mgoVar.a.getPackageManager();
                                intentA = ((mgg) mgcVar).a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity115 = packageManager.resolveActivity(intentA, 0);
                                            resolveInfoResolveActivity115.getClass();
                                            drawable = resolveInfoResolveActivity115.loadIcon(packageManager);
                                        }
                                    }
                                }
                                ojcVarI = ojc.i(drawable);
                            } else {
                                ojcVarI = oih.a;
                            }
                        } else if (mgcVar instanceof mgg) {
                            packageManager = mgoVar.a.getPackageManager();
                            intentA = ((mgg) mgcVar).a();
                            resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                            if (resolveInfoResolveActivity == null) {
                                drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                drawable.getClass();
                            } else {
                                it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                        ResolveInfo resolveInfoResolveActivity116 = packageManager.resolveActivity(intentA, 0);
                                        resolveInfoResolveActivity116.getClass();
                                        drawable = resolveInfoResolveActivity116.loadIcon(packageManager);
                                    }
                                }
                            }
                            ojcVarI = ojc.i(drawable);
                        } else {
                            ojcVarI = oih.a;
                        }
                    }
                    if (ojcVarI.g()) {
                        cyjVarA.c = (Drawable) ojcVarI.c();
                    } else {
                        cyjVarA.c = this.a.getResources().getDrawable(R.drawable.product_logo_lens_new_color_24, null);
                    }
                    break;
                } else {
                    cyjVarA.c = this.a.getResources().getDrawable(R.drawable.product_logo_lens_new_color_24, null);
                }
                cyjVarA.e(j);
                cyjVarA.d(runnable);
                cyjVarA.f = i2;
                if (nmeVar.d.g()) {
                    cyjVarA.b(((Barcode) nmeVar.d.c()).format);
                    cyjVarA.c(((Barcode) nmeVar.d.c()).valueFormat);
                }
                return cyjVarA.a();
            case SEARCH:
                mgcVar = new mge(oduVar, mgbVar.c, 3, null, null);
                i = 1;
                i2 = 2;
                if (e(nmeVar.b)) {
                    cyjVarA.e = i;
                } else {
                    cyjVarA.e = i2;
                    cyjVarA.b = new Runnable() { // from class: czp
                        @Override // java.lang.Runnable
                        public final void run() {
                            mgcVar.b();
                        }
                    };
                }
                if (!e(nmeVar.b)) {
                    mgoVar = this.e;
                    z = mgcVar instanceof mgn;
                    i3 = R.drawable.ic_signal_wifi_4_bar_lock_black_round_24dp;
                    if (z) {
                        mgnVar = (mgn) mgcVar;
                        if (oje.d(mgnVar.a.preSharedKey)) {
                            i3 = R.drawable.ic_signal_wifi_4_bar_black_round_24dp;
                        }
                        Drawable drawable11 = mgoVar.a.getDrawable(i3);
                        drawable11.getClass();
                        ojcVarI = ojc.i(drawable11);
                    } else if (r15.j.g()) {
                        switch (r15.a.ordinal()) {
                            case 1:
                                i4 = R.drawable.quantum_ic_phone_white_24;
                                break;
                            case 2:
                                i4 = R.drawable.quantum_ic_contacts_product_white_24;
                                break;
                            case 3:
                            default:
                                i4 = -1;
                                break;
                            case 4:
                                i4 = R.drawable.quantum_ic_email_white_24;
                                break;
                            case 5:
                                i4 = R.drawable.quantum_ic_location_on_white_24;
                                break;
                            case 6:
                                i4 = R.drawable.quantum_ic_public_white_24;
                                break;
                            case 7:
                            case 8:
                                i4 = R.drawable.quantum_ic_barcode_scanner_white_24;
                                break;
                        }
                        if (i4 < 0) {
                            if (mgcVar instanceof mgg) {
                                packageManager = mgoVar.a.getPackageManager();
                                intentA = ((mgg) mgcVar).a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity117 = packageManager.resolveActivity(intentA, 0);
                                            resolveInfoResolveActivity117.getClass();
                                            drawable = resolveInfoResolveActivity117.loadIcon(packageManager);
                                        }
                                    }
                                }
                                ojcVarI = ojc.i(drawable);
                            } else {
                                ojcVarI = oih.a;
                            }
                        } else if (mgcVar instanceof mgg) {
                            packageManager = mgoVar.a.getPackageManager();
                            intentA = ((mgg) mgcVar).a();
                            resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                            if (resolveInfoResolveActivity == null) {
                                drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                drawable.getClass();
                            } else {
                                it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                        ResolveInfo resolveInfoResolveActivity118 = packageManager.resolveActivity(intentA, 0);
                                        resolveInfoResolveActivity118.getClass();
                                        drawable = resolveInfoResolveActivity118.loadIcon(packageManager);
                                    }
                                }
                            }
                            ojcVarI = ojc.i(drawable);
                        } else {
                            ojcVarI = oih.a;
                        }
                    } else {
                        switch (r15.a.ordinal()) {
                            case 1:
                                i4 = R.drawable.quantum_ic_phone_white_24;
                                break;
                            case 2:
                                i4 = R.drawable.quantum_ic_contacts_product_white_24;
                                break;
                            case 3:
                            default:
                                i4 = -1;
                                break;
                            case 4:
                                i4 = R.drawable.quantum_ic_email_white_24;
                                break;
                            case 5:
                                i4 = R.drawable.quantum_ic_location_on_white_24;
                                break;
                            case 6:
                                i4 = R.drawable.quantum_ic_public_white_24;
                                break;
                            case 7:
                            case 8:
                                i4 = R.drawable.quantum_ic_barcode_scanner_white_24;
                                break;
                        }
                        if (i4 < 0) {
                            if (mgcVar instanceof mgg) {
                                packageManager = mgoVar.a.getPackageManager();
                                intentA = ((mgg) mgcVar).a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity119 = packageManager.resolveActivity(intentA, 0);
                                            resolveInfoResolveActivity119.getClass();
                                            drawable = resolveInfoResolveActivity119.loadIcon(packageManager);
                                        }
                                    }
                                }
                                ojcVarI = ojc.i(drawable);
                            } else {
                                ojcVarI = oih.a;
                            }
                        } else if (mgcVar instanceof mgg) {
                            packageManager = mgoVar.a.getPackageManager();
                            intentA = ((mgg) mgcVar).a();
                            resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                            if (resolveInfoResolveActivity == null) {
                                drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                drawable.getClass();
                            } else {
                                it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                        ResolveInfo resolveInfoResolveActivity1110 = packageManager.resolveActivity(intentA, 0);
                                        resolveInfoResolveActivity1110.getClass();
                                        drawable = resolveInfoResolveActivity1110.loadIcon(packageManager);
                                    }
                                }
                            }
                            ojcVarI = ojc.i(drawable);
                        } else {
                            ojcVarI = oih.a;
                        }
                    }
                    if (ojcVarI.g()) {
                        cyjVarA.c = (Drawable) ojcVarI.c();
                    } else {
                        cyjVarA.c = this.a.getResources().getDrawable(R.drawable.product_logo_lens_new_color_24, null);
                    }
                    break;
                } else {
                    cyjVarA.c = this.a.getResources().getDrawable(R.drawable.product_logo_lens_new_color_24, null);
                }
                cyjVarA.e(j);
                cyjVarA.d(runnable);
                cyjVarA.f = i2;
                if (nmeVar.d.g()) {
                    cyjVarA.b(((Barcode) nmeVar.d.c()).format);
                    cyjVarA.c(((Barcode) nmeVar.d.c()).valueFormat);
                }
                return cyjVarA.a();
            case SHOPPING:
                mgcVar = new mgj(oduVar, mgbVar.c, null, null);
                i = 1;
                i2 = 2;
                if (e(nmeVar.b)) {
                    cyjVarA.e = i;
                } else {
                    cyjVarA.e = i2;
                    cyjVarA.b = new Runnable() { // from class: czp
                        @Override // java.lang.Runnable
                        public final void run() {
                            mgcVar.b();
                        }
                    };
                }
                if (!e(nmeVar.b)) {
                    mgoVar = this.e;
                    z = mgcVar instanceof mgn;
                    i3 = R.drawable.ic_signal_wifi_4_bar_lock_black_round_24dp;
                    if (z) {
                        mgnVar = (mgn) mgcVar;
                        if (oje.d(mgnVar.a.preSharedKey)) {
                            i3 = R.drawable.ic_signal_wifi_4_bar_black_round_24dp;
                        }
                        Drawable drawable12 = mgoVar.a.getDrawable(i3);
                        drawable12.getClass();
                        ojcVarI = ojc.i(drawable12);
                    } else if (r15.j.g()) {
                        switch (r15.a.ordinal()) {
                            case 1:
                                i4 = R.drawable.quantum_ic_phone_white_24;
                                break;
                            case 2:
                                i4 = R.drawable.quantum_ic_contacts_product_white_24;
                                break;
                            case 3:
                            default:
                                i4 = -1;
                                break;
                            case 4:
                                i4 = R.drawable.quantum_ic_email_white_24;
                                break;
                            case 5:
                                i4 = R.drawable.quantum_ic_location_on_white_24;
                                break;
                            case 6:
                                i4 = R.drawable.quantum_ic_public_white_24;
                                break;
                            case 7:
                            case 8:
                                i4 = R.drawable.quantum_ic_barcode_scanner_white_24;
                                break;
                        }
                        if (i4 < 0) {
                            if (mgcVar instanceof mgg) {
                                packageManager = mgoVar.a.getPackageManager();
                                intentA = ((mgg) mgcVar).a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity1111 = packageManager.resolveActivity(intentA, 0);
                                            resolveInfoResolveActivity1111.getClass();
                                            drawable = resolveInfoResolveActivity1111.loadIcon(packageManager);
                                        }
                                    }
                                }
                                ojcVarI = ojc.i(drawable);
                            } else {
                                ojcVarI = oih.a;
                            }
                        } else if (mgcVar instanceof mgg) {
                            packageManager = mgoVar.a.getPackageManager();
                            intentA = ((mgg) mgcVar).a();
                            resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                            if (resolveInfoResolveActivity == null) {
                                drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                drawable.getClass();
                            } else {
                                it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                        ResolveInfo resolveInfoResolveActivity1112 = packageManager.resolveActivity(intentA, 0);
                                        resolveInfoResolveActivity1112.getClass();
                                        drawable = resolveInfoResolveActivity1112.loadIcon(packageManager);
                                    }
                                }
                            }
                            ojcVarI = ojc.i(drawable);
                        } else {
                            ojcVarI = oih.a;
                        }
                    } else {
                        switch (r15.a.ordinal()) {
                            case 1:
                                i4 = R.drawable.quantum_ic_phone_white_24;
                                break;
                            case 2:
                                i4 = R.drawable.quantum_ic_contacts_product_white_24;
                                break;
                            case 3:
                            default:
                                i4 = -1;
                                break;
                            case 4:
                                i4 = R.drawable.quantum_ic_email_white_24;
                                break;
                            case 5:
                                i4 = R.drawable.quantum_ic_location_on_white_24;
                                break;
                            case 6:
                                i4 = R.drawable.quantum_ic_public_white_24;
                                break;
                            case 7:
                            case 8:
                                i4 = R.drawable.quantum_ic_barcode_scanner_white_24;
                                break;
                        }
                        if (i4 < 0) {
                            if (mgcVar instanceof mgg) {
                                packageManager = mgoVar.a.getPackageManager();
                                intentA = ((mgg) mgcVar).a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity1113 = packageManager.resolveActivity(intentA, 0);
                                            resolveInfoResolveActivity1113.getClass();
                                            drawable = resolveInfoResolveActivity1113.loadIcon(packageManager);
                                        }
                                    }
                                }
                                ojcVarI = ojc.i(drawable);
                            } else {
                                ojcVarI = oih.a;
                            }
                        } else if (mgcVar instanceof mgg) {
                            packageManager = mgoVar.a.getPackageManager();
                            intentA = ((mgg) mgcVar).a();
                            resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                            if (resolveInfoResolveActivity == null) {
                                drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                drawable.getClass();
                            } else {
                                it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                        ResolveInfo resolveInfoResolveActivity1114 = packageManager.resolveActivity(intentA, 0);
                                        resolveInfoResolveActivity1114.getClass();
                                        drawable = resolveInfoResolveActivity1114.loadIcon(packageManager);
                                    }
                                }
                            }
                            ojcVarI = ojc.i(drawable);
                        } else {
                            ojcVarI = oih.a;
                        }
                    }
                    if (ojcVarI.g()) {
                        cyjVarA.c = (Drawable) ojcVarI.c();
                    } else {
                        cyjVarA.c = this.a.getResources().getDrawable(R.drawable.product_logo_lens_new_color_24, null);
                    }
                    break;
                } else {
                    cyjVarA.c = this.a.getResources().getDrawable(R.drawable.product_logo_lens_new_color_24, null);
                }
                cyjVarA.e(j);
                cyjVarA.d(runnable);
                cyjVarA.f = i2;
                if (nmeVar.d.g()) {
                    cyjVarA.b(((Barcode) nmeVar.d.c()).format);
                    cyjVarA.c(((Barcode) nmeVar.d.c()).valueFormat);
                }
                return cyjVarA.a();
            case SMS:
                mgcVar = new mgi(oduVar, mgoVar2.a, mgbVar.i, null, null);
                i = 1;
                i2 = 2;
                if (e(nmeVar.b)) {
                    cyjVarA.e = i;
                } else {
                    cyjVarA.e = i2;
                    cyjVarA.b = new Runnable() { // from class: czp
                        @Override // java.lang.Runnable
                        public final void run() {
                            mgcVar.b();
                        }
                    };
                }
                if (!e(nmeVar.b)) {
                    mgoVar = this.e;
                    z = mgcVar instanceof mgn;
                    i3 = R.drawable.ic_signal_wifi_4_bar_lock_black_round_24dp;
                    if (z) {
                        mgnVar = (mgn) mgcVar;
                        if (oje.d(mgnVar.a.preSharedKey)) {
                            i3 = R.drawable.ic_signal_wifi_4_bar_black_round_24dp;
                        }
                        Drawable drawable13 = mgoVar.a.getDrawable(i3);
                        drawable13.getClass();
                        ojcVarI = ojc.i(drawable13);
                    } else if (r15.j.g()) {
                        switch (r15.a.ordinal()) {
                            case 1:
                                i4 = R.drawable.quantum_ic_phone_white_24;
                                break;
                            case 2:
                                i4 = R.drawable.quantum_ic_contacts_product_white_24;
                                break;
                            case 3:
                            default:
                                i4 = -1;
                                break;
                            case 4:
                                i4 = R.drawable.quantum_ic_email_white_24;
                                break;
                            case 5:
                                i4 = R.drawable.quantum_ic_location_on_white_24;
                                break;
                            case 6:
                                i4 = R.drawable.quantum_ic_public_white_24;
                                break;
                            case 7:
                            case 8:
                                i4 = R.drawable.quantum_ic_barcode_scanner_white_24;
                                break;
                        }
                        if (i4 < 0) {
                            if (mgcVar instanceof mgg) {
                                packageManager = mgoVar.a.getPackageManager();
                                intentA = ((mgg) mgcVar).a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity1115 = packageManager.resolveActivity(intentA, 0);
                                            resolveInfoResolveActivity1115.getClass();
                                            drawable = resolveInfoResolveActivity1115.loadIcon(packageManager);
                                        }
                                    }
                                }
                                ojcVarI = ojc.i(drawable);
                            } else {
                                ojcVarI = oih.a;
                            }
                        } else if (mgcVar instanceof mgg) {
                            packageManager = mgoVar.a.getPackageManager();
                            intentA = ((mgg) mgcVar).a();
                            resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                            if (resolveInfoResolveActivity == null) {
                                drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                drawable.getClass();
                            } else {
                                it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                        ResolveInfo resolveInfoResolveActivity1116 = packageManager.resolveActivity(intentA, 0);
                                        resolveInfoResolveActivity1116.getClass();
                                        drawable = resolveInfoResolveActivity1116.loadIcon(packageManager);
                                    }
                                }
                            }
                            ojcVarI = ojc.i(drawable);
                        } else {
                            ojcVarI = oih.a;
                        }
                    } else {
                        switch (r15.a.ordinal()) {
                            case 1:
                                i4 = R.drawable.quantum_ic_phone_white_24;
                                break;
                            case 2:
                                i4 = R.drawable.quantum_ic_contacts_product_white_24;
                                break;
                            case 3:
                            default:
                                i4 = -1;
                                break;
                            case 4:
                                i4 = R.drawable.quantum_ic_email_white_24;
                                break;
                            case 5:
                                i4 = R.drawable.quantum_ic_location_on_white_24;
                                break;
                            case 6:
                                i4 = R.drawable.quantum_ic_public_white_24;
                                break;
                            case 7:
                            case 8:
                                i4 = R.drawable.quantum_ic_barcode_scanner_white_24;
                                break;
                        }
                        if (i4 < 0) {
                            if (mgcVar instanceof mgg) {
                                packageManager = mgoVar.a.getPackageManager();
                                intentA = ((mgg) mgcVar).a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity1117 = packageManager.resolveActivity(intentA, 0);
                                            resolveInfoResolveActivity1117.getClass();
                                            drawable = resolveInfoResolveActivity1117.loadIcon(packageManager);
                                        }
                                    }
                                }
                                ojcVarI = ojc.i(drawable);
                            } else {
                                ojcVarI = oih.a;
                            }
                        } else if (mgcVar instanceof mgg) {
                            packageManager = mgoVar.a.getPackageManager();
                            intentA = ((mgg) mgcVar).a();
                            resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                            if (resolveInfoResolveActivity == null) {
                                drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                drawable.getClass();
                            } else {
                                it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                        ResolveInfo resolveInfoResolveActivity1118 = packageManager.resolveActivity(intentA, 0);
                                        resolveInfoResolveActivity1118.getClass();
                                        drawable = resolveInfoResolveActivity1118.loadIcon(packageManager);
                                    }
                                }
                            }
                            ojcVarI = ojc.i(drawable);
                        } else {
                            ojcVarI = oih.a;
                        }
                    }
                    if (ojcVarI.g()) {
                        cyjVarA.c = (Drawable) ojcVarI.c();
                    } else {
                        cyjVarA.c = this.a.getResources().getDrawable(R.drawable.product_logo_lens_new_color_24, null);
                    }
                    break;
                } else {
                    cyjVarA.c = this.a.getResources().getDrawable(R.drawable.product_logo_lens_new_color_24, null);
                }
                cyjVarA.e(j);
                cyjVarA.d(runnable);
                cyjVarA.f = i2;
                if (nmeVar.d.g()) {
                    cyjVarA.b(((Barcode) nmeVar.d.c()).format);
                    cyjVarA.c(((Barcode) nmeVar.d.c()).valueFormat);
                }
                return cyjVarA.a();
            case TRANSLATE:
                mgcVar = new mgl(oduVar, mgoVar2.a, mgbVar.c, Locale.getDefault(), null, null);
                i = 1;
                i2 = 2;
                if (e(nmeVar.b)) {
                    cyjVarA.e = i;
                } else {
                    cyjVarA.e = i2;
                    cyjVarA.b = new Runnable() { // from class: czp
                        @Override // java.lang.Runnable
                        public final void run() {
                            mgcVar.b();
                        }
                    };
                }
                if (!e(nmeVar.b)) {
                    mgoVar = this.e;
                    z = mgcVar instanceof mgn;
                    i3 = R.drawable.ic_signal_wifi_4_bar_lock_black_round_24dp;
                    if (z) {
                        mgnVar = (mgn) mgcVar;
                        if (oje.d(mgnVar.a.preSharedKey)) {
                            i3 = R.drawable.ic_signal_wifi_4_bar_black_round_24dp;
                        }
                        Drawable drawable14 = mgoVar.a.getDrawable(i3);
                        drawable14.getClass();
                        ojcVarI = ojc.i(drawable14);
                    } else if (r15.j.g()) {
                        switch (r15.a.ordinal()) {
                            case 1:
                                i4 = R.drawable.quantum_ic_phone_white_24;
                                break;
                            case 2:
                                i4 = R.drawable.quantum_ic_contacts_product_white_24;
                                break;
                            case 3:
                            default:
                                i4 = -1;
                                break;
                            case 4:
                                i4 = R.drawable.quantum_ic_email_white_24;
                                break;
                            case 5:
                                i4 = R.drawable.quantum_ic_location_on_white_24;
                                break;
                            case 6:
                                i4 = R.drawable.quantum_ic_public_white_24;
                                break;
                            case 7:
                            case 8:
                                i4 = R.drawable.quantum_ic_barcode_scanner_white_24;
                                break;
                        }
                        if (i4 < 0) {
                            if (mgcVar instanceof mgg) {
                                packageManager = mgoVar.a.getPackageManager();
                                intentA = ((mgg) mgcVar).a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity1119 = packageManager.resolveActivity(intentA, 0);
                                            resolveInfoResolveActivity1119.getClass();
                                            drawable = resolveInfoResolveActivity1119.loadIcon(packageManager);
                                        }
                                    }
                                }
                                ojcVarI = ojc.i(drawable);
                            } else {
                                ojcVarI = oih.a;
                            }
                        } else if (mgcVar instanceof mgg) {
                            packageManager = mgoVar.a.getPackageManager();
                            intentA = ((mgg) mgcVar).a();
                            resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                            if (resolveInfoResolveActivity == null) {
                                drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                drawable.getClass();
                            } else {
                                it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                        ResolveInfo resolveInfoResolveActivity11110 = packageManager.resolveActivity(intentA, 0);
                                        resolveInfoResolveActivity11110.getClass();
                                        drawable = resolveInfoResolveActivity11110.loadIcon(packageManager);
                                    }
                                }
                            }
                            ojcVarI = ojc.i(drawable);
                        } else {
                            ojcVarI = oih.a;
                        }
                    } else {
                        switch (r15.a.ordinal()) {
                            case 1:
                                i4 = R.drawable.quantum_ic_phone_white_24;
                                break;
                            case 2:
                                i4 = R.drawable.quantum_ic_contacts_product_white_24;
                                break;
                            case 3:
                            default:
                                i4 = -1;
                                break;
                            case 4:
                                i4 = R.drawable.quantum_ic_email_white_24;
                                break;
                            case 5:
                                i4 = R.drawable.quantum_ic_location_on_white_24;
                                break;
                            case 6:
                                i4 = R.drawable.quantum_ic_public_white_24;
                                break;
                            case 7:
                            case 8:
                                i4 = R.drawable.quantum_ic_barcode_scanner_white_24;
                                break;
                        }
                        if (i4 < 0) {
                            if (mgcVar instanceof mgg) {
                                packageManager = mgoVar.a.getPackageManager();
                                intentA = ((mgg) mgcVar).a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity11111 = packageManager.resolveActivity(intentA, 0);
                                            resolveInfoResolveActivity11111.getClass();
                                            drawable = resolveInfoResolveActivity11111.loadIcon(packageManager);
                                        }
                                    }
                                }
                                ojcVarI = ojc.i(drawable);
                            } else {
                                ojcVarI = oih.a;
                            }
                        } else if (mgcVar instanceof mgg) {
                            packageManager = mgoVar.a.getPackageManager();
                            intentA = ((mgg) mgcVar).a();
                            resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                            if (resolveInfoResolveActivity == null) {
                                drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                drawable.getClass();
                            } else {
                                it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                        ResolveInfo resolveInfoResolveActivity11112 = packageManager.resolveActivity(intentA, 0);
                                        resolveInfoResolveActivity11112.getClass();
                                        drawable = resolveInfoResolveActivity11112.loadIcon(packageManager);
                                    }
                                }
                            }
                            ojcVarI = ojc.i(drawable);
                        } else {
                            ojcVarI = oih.a;
                        }
                    }
                    if (ojcVarI.g()) {
                        cyjVarA.c = (Drawable) ojcVarI.c();
                    } else {
                        cyjVarA.c = this.a.getResources().getDrawable(R.drawable.product_logo_lens_new_color_24, null);
                    }
                    break;
                } else {
                    cyjVarA.c = this.a.getResources().getDrawable(R.drawable.product_logo_lens_new_color_24, null);
                }
                cyjVarA.e(j);
                cyjVarA.d(runnable);
                cyjVarA.f = i2;
                if (nmeVar.d.g()) {
                    cyjVarA.b(((Barcode) nmeVar.d.c()).format);
                    cyjVarA.c(((Barcode) nmeVar.d.c()).valueFormat);
                }
                return cyjVarA.a();
            case WIFI:
                if (!mgbVar.j.g()) {
                    throw new IllegalStateException("Wifi actions must have wifi network data");
                }
                Context context3 = mgoVar2.a;
                WifiManager wifiManager = (WifiManager) aas.b(context3, WifiManager.class);
                dae daeVar4 = mgoVar2.c;
                min minVar2 = (min) mgbVar.j.c();
                if (wifiManager != null && aav.b(context3, "android.permission.CHANGE_WIFI_STATE") == 0) {
                    mim mimVar = mim.UNKNOWN;
                    mim mimVarB2 = mim.b(minVar2.b);
                    if (mimVarB2 == null) {
                        mimVarB2 = mim.UNRECOGNIZED;
                    }
                    switch (mimVarB2.ordinal()) {
                        case 1:
                            ojcVarI2 = ojc.i(nky.OPEN);
                            break;
                        case 2:
                            ojcVarI2 = ojc.i(nky.WPA);
                            break;
                        case 3:
                            ojcVarI2 = ojc.i(nky.WEP);
                            break;
                        default:
                            nmk nmkVar = nmk.a;
                            Object[] objArr = new Object[1];
                            mim mimVarB3 = mim.b(minVar2.b);
                            if (mimVarB3 == null) {
                                mimVarB3 = mim.UNRECOGNIZED;
                            }
                            objArr[0] = mimVarB3;
                            nmkVar.c(mgn.class, "Unexpected WifiInt: %s", objArr);
                            ojcVarI2 = oih.a;
                            break;
                    }
                    if (ojcVarI2.g()) {
                        try {
                            nla nlaVar = new nla();
                            nlaVar.a = oje.c(minVar2.a);
                            nlaVar.b = oje.c(minVar2.c);
                            nlaVar.c = (nky) ojcVarI2.c();
                            nlaVar.d = Boolean.valueOf(minVar2.d);
                            WifiConfiguration wifiConfiguration = new WifiConfiguration();
                            String str18 = nlaVar.a;
                            if (!nla.c(str18, 1, 32)) {
                                throw nkz.a(1, "SSID must have a length of 1-32 chars. SSID is: %s", str18);
                            }
                            wifiConfiguration.SSID = nla.a(str18);
                            switch (nlaVar.c) {
                                case OPEN:
                                    if (!nlaVar.b.isEmpty()) {
                                        throw nkz.a(2, "Open WiFi network should not have a password specified", new Object[0]);
                                    }
                                    wifiConfiguration.allowedKeyManagement.set(0);
                                    wifiConfiguration.allowedProtocols.set(1);
                                    wifiConfiguration.allowedProtocols.set(0);
                                    wifiConfiguration.allowedAuthAlgorithms.clear();
                                    wifiConfiguration.allowedPairwiseCiphers.set(2);
                                    wifiConfiguration.allowedPairwiseCiphers.set(1);
                                    wifiConfiguration.allowedGroupCiphers.set(0);
                                    wifiConfiguration.allowedGroupCiphers.set(1);
                                    wifiConfiguration.allowedGroupCiphers.set(3);
                                    wifiConfiguration.allowedGroupCiphers.set(2);
                                    break;
                                    break;
                                case WEP:
                                    String[] strArr = wifiConfiguration.wepKeys;
                                    String strA = nlaVar.b;
                                    switch (strA.length()) {
                                        case 0:
                                            throw nkz.a(3, "No WEP password was specified", new Object[0]);
                                        case 5:
                                        case 13:
                                        case 16:
                                        case 29:
                                            strA = nla.a(strA);
                                            break;
                                        case 10:
                                        case 26:
                                        case 32:
                                        case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                                            if (!nla.b(strA)) {
                                                throw nkz.a(4, "WEP password %s is not a hex string, but has a length such that it must be one. %s", strA, "WEP passwords must be 5, 13, 16, or 29 ASCII characters, or 10, 26, 32, or 58 hex characters.");
                                            }
                                            break;
                                            break;
                                        default:
                                            Object[] objArr2 = new Object[2];
                                            objArr2[0] = strA;
                                            objArr2[1] = "WEP passwords must be 5, 13, 16, or 29 ASCII characters, or 10, 26, 32, or 58 hex characters.";
                                            throw nkz.a(4, "Invalid WEP password %s. %s", objArr2);
                                    }
                                    strArr[0] = strA;
                                    wifiConfiguration.allowedKeyManagement.set(0);
                                    wifiConfiguration.allowedProtocols.set(1);
                                    wifiConfiguration.allowedProtocols.set(0);
                                    wifiConfiguration.allowedAuthAlgorithms.set(0);
                                    wifiConfiguration.allowedAuthAlgorithms.set(1);
                                    wifiConfiguration.allowedPairwiseCiphers.set(2);
                                    wifiConfiguration.allowedPairwiseCiphers.set(1);
                                    wifiConfiguration.allowedGroupCiphers.set(0);
                                    wifiConfiguration.allowedGroupCiphers.set(1);
                                    wifiConfiguration.wepTxKeyIndex = 0;
                                    break;
                                case WPA:
                                    String strA2 = nlaVar.b;
                                    if (strA2.isEmpty()) {
                                        throw nkz.a(3, "No WPA PSK was specified", new Object[0]);
                                    }
                                    if (nla.c(strA2, 8, 63)) {
                                        strA2 = nla.a(strA2);
                                    } else {
                                        if (strA2.length() != 64) {
                                            throw nkz.a(4, "WPA PSK %s has an invalid length. %s", strA2, "WPA PSKs must be 8-63 ASCII characters, or exactly 64 hex characters");
                                        }
                                        if (!nla.b(strA2)) {
                                            throw nkz.a(4, "WPA PSK %s is 64 chars, which means it must be hex; but it was not", strA2);
                                        }
                                    }
                                    wifiConfiguration.preSharedKey = strA2;
                                    wifiConfiguration.allowedProtocols.set(1);
                                    wifiConfiguration.allowedProtocols.set(0);
                                    wifiConfiguration.allowedKeyManagement.set(1);
                                    wifiConfiguration.allowedPairwiseCiphers.set(2);
                                    wifiConfiguration.allowedPairwiseCiphers.set(1);
                                    wifiConfiguration.allowedGroupCiphers.set(0);
                                    wifiConfiguration.allowedGroupCiphers.set(1);
                                    wifiConfiguration.allowedGroupCiphers.set(3);
                                    wifiConfiguration.allowedGroupCiphers.set(2);
                                    break;
                            }
                            wifiConfiguration.hiddenSSID = nlaVar.d.booleanValue();
                            mgcVar = new mgn(wifiManager, wifiConfiguration, oduVar, null, null);
                            i = 1;
                            i2 = 2;
                        } catch (nkz e2) {
                            nmk nmkVar2 = nmk.a;
                            Object[] objArr3 = {e2};
                            if (nmkVar2.e(5)) {
                                Log.w(nmkVar2.b, nmkVar2.a("QR code contained invalid wifi. Details: %s", objArr3), e2);
                            }
                            int i7 = e2.a;
                            int i8 = i7 - 1;
                            if (i7 == 0) {
                                throw null;
                            }
                            switch (i8) {
                                case 0:
                                    mgcVar = new mgf(minVar2.a);
                                    i = 1;
                                    i2 = 2;
                                    break;
                                case 1:
                                case 2:
                                case 3:
                                    mgcVar = new mgf(minVar2.a);
                                    i = 1;
                                    i2 = 2;
                                    break;
                                default:
                                    nmk.a.c(mgn.class, "Unhandled WifiConfigurationBuilder exception %s", e2);
                                    mgcVar = new mgf(minVar2.a);
                                    i = 1;
                                    i2 = 2;
                                    break;
                            }
                        }
                    } else {
                        mgcVar = new mgf(minVar2.a);
                        i = 1;
                        i2 = 2;
                    }
                } else {
                    mgcVar = new mgf(minVar2.a);
                    i = 1;
                    i2 = 2;
                }
                if (e(nmeVar.b)) {
                    cyjVarA.e = i;
                } else {
                    cyjVarA.e = i2;
                    cyjVarA.b = new Runnable() { // from class: czp
                        @Override // java.lang.Runnable
                        public final void run() {
                            mgcVar.b();
                        }
                    };
                }
                if (!e(nmeVar.b)) {
                    mgoVar = this.e;
                    z = mgcVar instanceof mgn;
                    i3 = R.drawable.ic_signal_wifi_4_bar_lock_black_round_24dp;
                    if (z) {
                        mgnVar = (mgn) mgcVar;
                        if (oje.d(mgnVar.a.preSharedKey)) {
                            i3 = R.drawable.ic_signal_wifi_4_bar_black_round_24dp;
                        }
                        Drawable drawable15 = mgoVar.a.getDrawable(i3);
                        drawable15.getClass();
                        ojcVarI = ojc.i(drawable15);
                    } else if (r15.j.g()) {
                        switch (r15.a.ordinal()) {
                            case 1:
                                i4 = R.drawable.quantum_ic_phone_white_24;
                                break;
                            case 2:
                                i4 = R.drawable.quantum_ic_contacts_product_white_24;
                                break;
                            case 3:
                            default:
                                i4 = -1;
                                break;
                            case 4:
                                i4 = R.drawable.quantum_ic_email_white_24;
                                break;
                            case 5:
                                i4 = R.drawable.quantum_ic_location_on_white_24;
                                break;
                            case 6:
                                i4 = R.drawable.quantum_ic_public_white_24;
                                break;
                            case 7:
                            case 8:
                                i4 = R.drawable.quantum_ic_barcode_scanner_white_24;
                                break;
                        }
                        if (i4 < 0) {
                            if (mgcVar instanceof mgg) {
                                packageManager = mgoVar.a.getPackageManager();
                                intentA = ((mgg) mgcVar).a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity11113 = packageManager.resolveActivity(intentA, 0);
                                            resolveInfoResolveActivity11113.getClass();
                                            drawable = resolveInfoResolveActivity11113.loadIcon(packageManager);
                                        }
                                    }
                                }
                                ojcVarI = ojc.i(drawable);
                            } else {
                                ojcVarI = oih.a;
                            }
                        } else if (mgcVar instanceof mgg) {
                            packageManager = mgoVar.a.getPackageManager();
                            intentA = ((mgg) mgcVar).a();
                            resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                            if (resolveInfoResolveActivity == null) {
                                drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                drawable.getClass();
                            } else {
                                it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                        ResolveInfo resolveInfoResolveActivity11114 = packageManager.resolveActivity(intentA, 0);
                                        resolveInfoResolveActivity11114.getClass();
                                        drawable = resolveInfoResolveActivity11114.loadIcon(packageManager);
                                    }
                                }
                            }
                            ojcVarI = ojc.i(drawable);
                        } else {
                            ojcVarI = oih.a;
                        }
                    } else {
                        switch (r15.a.ordinal()) {
                            case 1:
                                i4 = R.drawable.quantum_ic_phone_white_24;
                                break;
                            case 2:
                                i4 = R.drawable.quantum_ic_contacts_product_white_24;
                                break;
                            case 3:
                            default:
                                i4 = -1;
                                break;
                            case 4:
                                i4 = R.drawable.quantum_ic_email_white_24;
                                break;
                            case 5:
                                i4 = R.drawable.quantum_ic_location_on_white_24;
                                break;
                            case 6:
                                i4 = R.drawable.quantum_ic_public_white_24;
                                break;
                            case 7:
                            case 8:
                                i4 = R.drawable.quantum_ic_barcode_scanner_white_24;
                                break;
                        }
                        if (i4 < 0) {
                            if (mgcVar instanceof mgg) {
                                packageManager = mgoVar.a.getPackageManager();
                                intentA = ((mgg) mgcVar).a();
                                resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                                if (resolveInfoResolveActivity == null) {
                                    drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                    drawable.getClass();
                                } else {
                                    it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                            drawable.getClass();
                                        } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                            ResolveInfo resolveInfoResolveActivity11115 = packageManager.resolveActivity(intentA, 0);
                                            resolveInfoResolveActivity11115.getClass();
                                            drawable = resolveInfoResolveActivity11115.loadIcon(packageManager);
                                        }
                                    }
                                }
                                ojcVarI = ojc.i(drawable);
                            } else {
                                ojcVarI = oih.a;
                            }
                        } else if (mgcVar instanceof mgg) {
                            packageManager = mgoVar.a.getPackageManager();
                            intentA = ((mgg) mgcVar).a();
                            resolveInfoResolveActivity = packageManager.resolveActivity(intentA, 0);
                            if (resolveInfoResolveActivity == null) {
                                drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                drawable.getClass();
                            } else {
                                it = packageManager.queryIntentActivities(intentA, 0).iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        drawable = mgoVar.a.getDrawable(R.drawable.quantum_ic_open_in_new_grey600_24);
                                        drawable.getClass();
                                    } else if (obr.bc(it.next().activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                                        ResolveInfo resolveInfoResolveActivity11116 = packageManager.resolveActivity(intentA, 0);
                                        resolveInfoResolveActivity11116.getClass();
                                        drawable = resolveInfoResolveActivity11116.loadIcon(packageManager);
                                    }
                                }
                            }
                            ojcVarI = ojc.i(drawable);
                        } else {
                            ojcVarI = oih.a;
                        }
                    }
                    if (ojcVarI.g()) {
                        cyjVarA.c = (Drawable) ojcVarI.c();
                    } else {
                        cyjVarA.c = this.a.getResources().getDrawable(R.drawable.product_logo_lens_new_color_24, null);
                    }
                    break;
                } else {
                    cyjVarA.c = this.a.getResources().getDrawable(R.drawable.product_logo_lens_new_color_24, null);
                }
                cyjVarA.e(j);
                cyjVarA.d(runnable);
                cyjVarA.f = i2;
                if (nmeVar.d.g()) {
                    cyjVarA.b(((Barcode) nmeVar.d.c()).format);
                    cyjVarA.c(((Barcode) nmeVar.d.c()).valueFormat);
                }
                return cyjVarA.a();
            default:
                String strValueOf2 = String.valueOf(mgbVar.a);
                StringBuilder sb4 = new StringBuilder(String.valueOf(strValueOf2).length() + 19);
                sb4.append("Unsupported action ");
                sb4.append(strValueOf2);
                throw new IllegalStateException(sb4.toString());
        }
    }

    public final nlo b() {
        return (nlo) this.g.get();
    }

    public final nlw c() {
        return (nlw) this.f.get();
    }
}

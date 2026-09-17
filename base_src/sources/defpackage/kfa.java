package defpackage;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class kfa extends kdu {
    public static kfa a;

    public kfa(kdx kdxVar) {
        super(kdxVar);
    }

    protected static final String C(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (!(obj instanceof Long)) {
            if (obj instanceof Boolean) {
                return String.valueOf(obj);
            }
            return obj instanceof Throwable ? obj.getClass().getCanonicalName() : "-";
        }
        Long l = (Long) obj;
        if (Math.abs(l.longValue()) < 100) {
            return String.valueOf(obj);
        }
        String str = String.valueOf(obj).charAt(0) != '-' ? "" : "-";
        String strValueOf = String.valueOf(Math.abs(l.longValue()));
        return str + Math.round(Math.pow(10.0d, strValueOf.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
    }

    @Override // defpackage.kdu
    protected final void a() {
        synchronized (kfa.class) {
            a = this;
        }
    }

    public final void b(kex kexVar, String str) {
        u(str.length() != 0 ? "Discarding hit. ".concat(str) : new String("Discarding hit. "), kexVar != null ? kexVar.toString() : "no hit data");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x017a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:66:0x0125 A[Catch: all -> 0x01db, TryCatch #5 {, blocks: (B:3:0x0001, B:5:0x000f, B:59:0x00c5, B:60:0x00c6, B:64:0x00d3, B:66:0x0125, B:67:0x0129, B:69:0x012f, B:72:0x0136, B:74:0x013a, B:76:0x014e, B:79:0x0179, B:95:0x01da, B:6:0x0010, B:8:0x0014, B:10:0x0020, B:12:0x0024, B:13:0x002a, B:35:0x007d, B:20:0x0064, B:30:0x0073, B:31:0x0076, B:34:0x0079, B:36:0x007f, B:38:0x0083, B:40:0x0087, B:44:0x0090, B:45:0x0096, B:47:0x009a, B:52:0x00ae, B:54:0x00b2, B:49:0x00a2, B:51:0x00aa, B:55:0x00c1, B:80:0x017a, B:82:0x018c, B:83:0x01a5, B:86:0x01a8, B:88:0x01c4, B:89:0x01cb, B:90:0x01d5), top: B:101:0x0001, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x013a A[Catch: all -> 0x01db, TryCatch #5 {, blocks: (B:3:0x0001, B:5:0x000f, B:59:0x00c5, B:60:0x00c6, B:64:0x00d3, B:66:0x0125, B:67:0x0129, B:69:0x012f, B:72:0x0136, B:74:0x013a, B:76:0x014e, B:79:0x0179, B:95:0x01da, B:6:0x0010, B:8:0x0014, B:10:0x0020, B:12:0x0024, B:13:0x002a, B:35:0x007d, B:20:0x0064, B:30:0x0073, B:31:0x0076, B:34:0x0079, B:36:0x007f, B:38:0x0083, B:40:0x0087, B:44:0x0090, B:45:0x0096, B:47:0x009a, B:52:0x00ae, B:54:0x00b2, B:49:0x00a2, B:51:0x00aa, B:55:0x00c1, B:80:0x017a, B:82:0x018c, B:83:0x01a5, B:86:0x01a8, B:88:0x01c4, B:89:0x01cb, B:90:0x01d5), top: B:101:0x0001, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x014e A[Catch: all -> 0x01db, TryCatch #5 {, blocks: (B:3:0x0001, B:5:0x000f, B:59:0x00c5, B:60:0x00c6, B:64:0x00d3, B:66:0x0125, B:67:0x0129, B:69:0x012f, B:72:0x0136, B:74:0x013a, B:76:0x014e, B:79:0x0179, B:95:0x01da, B:6:0x0010, B:8:0x0014, B:10:0x0020, B:12:0x0024, B:13:0x002a, B:35:0x007d, B:20:0x0064, B:30:0x0073, B:31:0x0076, B:34:0x0079, B:36:0x007f, B:38:0x0083, B:40:0x0087, B:44:0x0090, B:45:0x0096, B:47:0x009a, B:52:0x00ae, B:54:0x00b2, B:49:0x00a2, B:51:0x00aa, B:55:0x00c1, B:80:0x017a, B:82:0x018c, B:83:0x01a5, B:86:0x01a8, B:88:0x01c4, B:89:0x01cb, B:90:0x01d5), top: B:101:0x0001, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0176  */
    /* JADX WARN: Code duplicated, block: B:82:0x018c A[Catch: all -> 0x01d8, TryCatch #3 {, blocks: (B:80:0x017a, B:82:0x018c, B:83:0x01a5, B:86:0x01a8, B:88:0x01c4, B:89:0x01cb, B:90:0x01d5), top: B:100:0x017a, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01a8 A[Catch: all -> 0x01d8, TRY_ENTER, TryCatch #3 {, blocks: (B:80:0x017a, B:82:0x018c, B:83:0x01a5, B:86:0x01a8, B:88:0x01c4, B:89:0x01cb, B:90:0x01d5), top: B:100:0x017a, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01c4 A[Catch: all -> 0x01d8, TryCatch #3 {, blocks: (B:80:0x017a, B:82:0x018c, B:83:0x01a5, B:86:0x01a8, B:88:0x01c4, B:89:0x01cb, B:90:0x01d5), top: B:100:0x017a, outer: #5 }] */
    public final synchronized void c(int i, String str, Object obj, Object obj2, Object obj3) {
        char c;
        String string;
        kdx kdxVar;
        kff kffVar;
        kfe kfeVar;
        long j;
        long leastSignificantBits;
        long j2;
        SharedPreferences.Editor editorEdit;
        BufferedReader bufferedReader;
        String strTrim;
        mip.dk(str);
        ken kenVarG = g();
        kff kffVar2 = null;
        BufferedReader bufferedReader2 = null;
        kffVar2 = null;
        if (kenVarG.b != null) {
            if (true != kenVarG.b.booleanValue()) {
                c = 'c';
            } else {
                c = 'C';
            }
            char cCharAt = "01VDIWEA?".charAt(i);
            String str2 = kdv.a;
            String strL = l(str, C(obj), C(obj2), C(obj3));
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(strL).length());
            sb.append("3");
            sb.append(cCharAt);
            sb.append(c);
            sb.append(str2);
            sb.append(":");
            sb.append(strL);
            string = sb.toString();
            if (string.length() > 1024) {
                string = string.substring(0, 1024);
            }
            kdxVar = this.b;
            kffVar = kdxVar.f;
            if (kffVar != null) {
                kffVar2 = kdxVar.f;
            }
            if (kffVar2 != null) {
                kfeVar = kffVar2.d;
                if (kfeVar.a.a.getLong(kfeVar.b(), 0L) == 0) {
                    kff kffVar3 = kfeVar.a;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    SharedPreferences.Editor editorEdit2 = kfeVar.a.a.edit();
                    editorEdit2.remove(kfeVar.a());
                    editorEdit2.remove(kfeVar.c());
                    editorEdit2.putLong(kfeVar.b(), jCurrentTimeMillis);
                    editorEdit2.commit();
                }
                if (string == null) {
                    string = "";
                }
                synchronized (kfeVar) {
                    j = kfeVar.a.a.getLong(kfeVar.a(), 0L);
                    if (j <= 0) {
                        SharedPreferences.Editor editorEdit3 = kfeVar.a.a.edit();
                        editorEdit3.putString(kfeVar.c(), string);
                        editorEdit3.putLong(kfeVar.a(), 1L);
                        editorEdit3.apply();
                        return;
                    }
                    leastSignificantBits = UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE;
                    long j3 = j + 1;
                    j2 = Long.MAX_VALUE / j3;
                    editorEdit = kfeVar.a.a.edit();
                    if (leastSignificantBits < j2) {
                        editorEdit.putString(kfeVar.c(), string);
                    }
                    editorEdit.putLong(kfeVar.a(), j3);
                    editorEdit.apply();
                }
            }
            return;
        }
        synchronized (kenVarG) {
            if (kenVarG.b == null) {
                ApplicationInfo applicationInfo = kenVarG.a.a.getApplicationInfo();
                if (kob.a == null) {
                    if (kob.b == 0) {
                        kob.b = Process.myPid();
                    }
                    int i2 = kob.b;
                    if (i2 <= 0) {
                        strTrim = null;
                    } else {
                        try {
                            StringBuilder sb2 = new StringBuilder(25);
                            sb2.append("/proc/");
                            sb2.append(i2);
                            sb2.append("/cmdline");
                            String string2 = sb2.toString();
                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            try {
                                bufferedReader = new BufferedReader(new FileReader(string2));
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                try {
                                    String line = bufferedReader.readLine();
                                    mip.dk(line);
                                    strTrim = line.trim();
                                    koa.a(bufferedReader);
                                } catch (IOException e) {
                                    koa.a(bufferedReader);
                                    strTrim = null;
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedReader2 = bufferedReader;
                                    koa.a(bufferedReader2);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                throw th2;
                            }
                        } catch (IOException e2) {
                            bufferedReader = null;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    kob.a = strTrim;
                }
                String str3 = kob.a;
                if (applicationInfo != null) {
                    String str4 = applicationInfo.processName;
                    kenVarG.b = Boolean.valueOf(str4 != null && str4.equals(str3));
                }
                if ((kenVarG.b == null || !kenVarG.b.booleanValue()) && "com.google.android.gms.analytics".equals(str3)) {
                    kenVarG.b = Boolean.TRUE;
                }
                if (kenVarG.b == null) {
                    kenVarG.b = Boolean.TRUE;
                    kenVarG.a.d().n("My process not in the list of running processes");
                }
            }
        }
        if (true != kenVarG.b.booleanValue()) {
            c = 'c';
        } else {
            c = 'C';
        }
        char cCharAt2 = "01VDIWEA?".charAt(i);
        String str5 = kdv.a;
        String strL2 = l(str, C(obj), C(obj2), C(obj3));
        StringBuilder sb3 = new StringBuilder(String.valueOf(str5).length() + 4 + String.valueOf(strL2).length());
        sb3.append("3");
        sb3.append(cCharAt2);
        sb3.append(c);
        sb3.append(str5);
        sb3.append(":");
        sb3.append(strL2);
        string = sb3.toString();
        if (string.length() > 1024) {
            string = string.substring(0, 1024);
        }
        kdxVar = this.b;
        kffVar = kdxVar.f;
        if (kffVar != null && kffVar.B()) {
            kffVar2 = kdxVar.f;
        }
        if (kffVar2 != null) {
            kfeVar = kffVar2.d;
            if (kfeVar.a.a.getLong(kfeVar.b(), 0L) == 0) {
                kff kffVar4 = kfeVar.a;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                SharedPreferences.Editor editorEdit4 = kfeVar.a.a.edit();
                editorEdit4.remove(kfeVar.a());
                editorEdit4.remove(kfeVar.c());
                editorEdit4.putLong(kfeVar.b(), jCurrentTimeMillis2);
                editorEdit4.commit();
            }
            if (string == null) {
                string = "";
            }
            synchronized (kfeVar) {
                j = kfeVar.a.a.getLong(kfeVar.a(), 0L);
                if (j <= 0) {
                    SharedPreferences.Editor editorEdit5 = kfeVar.a.a.edit();
                    editorEdit5.putString(kfeVar.c(), string);
                    editorEdit5.putLong(kfeVar.a(), 1L);
                    editorEdit5.apply();
                    return;
                }
                leastSignificantBits = UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE;
                long j4 = j + 1;
                j2 = Long.MAX_VALUE / j4;
                editorEdit = kfeVar.a.a.edit();
                if (leastSignificantBits < j2) {
                    editorEdit.putString(kfeVar.c(), string);
                }
                editorEdit.putLong(kfeVar.a(), j4);
                editorEdit.apply();
            }
        }
        return;
        throw th;
    }
}

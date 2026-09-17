package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.PowerManager;
import android.os.StrictMode;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class mzz {
    private static final ouj a = ouj.h("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture");
    private static ojz b = obr.au(fob.f);
    private final qkg c;
    private final Context d;

    public mzz(qkg qkgVar, Context context) {
        this.c = qkgVar;
        this.d = context;
    }

    public static /* synthetic */ ojc a() {
        try {
            return ojc.i(Debug.MemoryInfo.class.getDeclaredMethod("getOtherPss", Integer.TYPE));
        } catch (Error e) {
            e = e;
            ((oug) ((oug) ((oug) a.b()).h(e)).G((char) 3641)).o("MemoryInfo.getOtherPss(which) failure");
            return oih.a;
        } catch (NoSuchMethodException e2) {
            return oih.a;
        } catch (Exception e3) {
            e = e3;
            ((oug) ((oug) ((oug) a.b()).h(e)).G((char) 3641)).o("MemoryInfo.getOtherPss(which) failure");
            return oih.a;
        }
    }

    private static int c(Debug.MemoryInfo memoryInfo) {
        Method method = (Method) ((ojc) b.a()).f();
        if (method == null) {
            return -1;
        }
        try {
            return ((Integer) method.invoke(memoryInfo, 14)).intValue();
        } catch (Error | Exception e) {
            b = fob.g;
            ((oug) ((oug) ((oug) a.b()).h(e)).G((char) 3637)).o("MemoryInfo.getOtherPss(which) invocation failure");
            return -1;
        }
    }

    private static Integer d(String str) {
        if (str == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    private static Long e(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        try {
            if (!matcher.find()) {
                return null;
            }
            String strGroup = matcher.group(1);
            obr.ao(strGroup);
            return Long.valueOf(Long.parseLong(strGroup));
        } catch (NumberFormatException e) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r8v3, types: [poy, ppa] */
    final qxi b(int i, int i2, String str, String str2) {
        ActivityManager.MemoryInfo memoryInfo;
        mzm mzmVar = ((muy) this.c).get();
        myw.f();
        mzy mzyVar = null;
        Debug.MemoryInfo memoryInfo2 = mzmVar.d ? mwh.a(this.d).getProcessMemoryInfo(new int[]{i2})[0] : null;
        if (mzmVar.e) {
            ActivityManager.MemoryInfo memoryInfo3 = new ActivityManager.MemoryInfo();
            mwh.a(this.d).getMemoryInfo(memoryInfo3);
            memoryInfo = memoryInfo3;
        } else {
            memoryInfo = null;
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                File file = new File("/proc/self/status");
                Charset charsetDefaultCharset = Charset.defaultCharset();
                charsetDefaultCharset.getClass();
                String str3 = new String(ozk.a(file), charsetDefaultCharset);
                if (str3.isEmpty()) {
                    ((oug) ((oug) a.b()).G((char) 3639)).o("Null or empty proc status");
                } else {
                    mzy mzyVar2 = new mzy();
                    mzyVar2.f = e(mzy.a, str3);
                    mzyVar2.g = e(mzy.b, str3);
                    mzyVar2.h = e(mzy.c, str3);
                    mzyVar2.i = e(mzy.d, str3);
                    mzyVar2.j = e(mzy.e, str3);
                    mzyVar = mzyVar2;
                }
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th;
            }
        } catch (IOException e) {
            ((oug) ((oug) ((oug) a.b()).h(e)).G(3638)).o("Error reading proc status");
        }
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        threadPolicyAllowThreadDiskReads = (ppa) qxi.g.m();
        poy poyVarM = qxh.c.m();
        poy poyVarM2 = qxf.z.m();
        if (memoryInfo2 != null) {
            int i3 = memoryInfo2.dalvikPss;
            if (poyVarM2.c) {
                poyVarM2.m();
                poyVarM2.c = false;
            }
            qxf qxfVar = (qxf) poyVarM2.b;
            qxfVar.a |= 1;
            qxfVar.b = i3;
            int i4 = memoryInfo2.nativePss;
            if (poyVarM2.c) {
                poyVarM2.m();
                poyVarM2.c = false;
            }
            qxf qxfVar2 = (qxf) poyVarM2.b;
            qxfVar2.a |= 2;
            qxfVar2.c = i4;
            int i5 = memoryInfo2.otherPss;
            if (poyVarM2.c) {
                poyVarM2.m();
                poyVarM2.c = false;
            }
            qxf qxfVar3 = (qxf) poyVarM2.b;
            qxfVar3.a |= 4;
            qxfVar3.d = i5;
            int i6 = memoryInfo2.dalvikPrivateDirty;
            if (poyVarM2.c) {
                poyVarM2.m();
                poyVarM2.c = false;
            }
            qxf qxfVar4 = (qxf) poyVarM2.b;
            qxfVar4.a |= 8;
            qxfVar4.e = i6;
            int i7 = memoryInfo2.nativePrivateDirty;
            if (poyVarM2.c) {
                poyVarM2.m();
                poyVarM2.c = false;
            }
            qxf qxfVar5 = (qxf) poyVarM2.b;
            qxfVar5.a |= 16;
            qxfVar5.f = i7;
            int i8 = memoryInfo2.otherPrivateDirty;
            if (poyVarM2.c) {
                poyVarM2.m();
                poyVarM2.c = false;
            }
            qxf qxfVar6 = (qxf) poyVarM2.b;
            qxfVar6.a |= 32;
            qxfVar6.g = i8;
            int totalPss = memoryInfo2.getTotalPss();
            if (poyVarM2.c) {
                poyVarM2.m();
                poyVarM2.c = false;
            }
            qxf qxfVar7 = (qxf) poyVarM2.b;
            qxfVar7.a |= 64;
            qxfVar7.h = totalPss;
            int totalPrivateClean = memoryInfo2.getTotalPrivateClean();
            if (poyVarM2.c) {
                poyVarM2.m();
                poyVarM2.c = false;
            }
            qxf qxfVar8 = (qxf) poyVarM2.b;
            qxfVar8.a |= 128;
            qxfVar8.i = totalPrivateClean;
            int totalSwappablePss = memoryInfo2.getTotalSwappablePss();
            if (poyVarM2.c) {
                poyVarM2.m();
                poyVarM2.c = false;
            }
            qxf qxfVar9 = (qxf) poyVarM2.b;
            qxfVar9.a |= 512;
            qxfVar9.k = totalSwappablePss;
            int totalSharedDirty = memoryInfo2.getTotalSharedDirty();
            if (poyVarM2.c) {
                poyVarM2.m();
                poyVarM2.c = false;
            }
            qxf qxfVar10 = (qxf) poyVarM2.b;
            qxfVar10.a |= 256;
            qxfVar10.j = totalSharedDirty;
            int iC = c(memoryInfo2);
            if (iC != -1) {
                if (poyVarM2.c) {
                    poyVarM2.m();
                    poyVarM2.c = false;
                }
                qxf qxfVar11 = (qxf) poyVarM2.b;
                qxfVar11.a |= 1024;
                qxfVar11.l = iC;
            }
            try {
                Map<String, String> memoryStats = memoryInfo2.getMemoryStats();
                Integer numD = d(memoryStats.get("summary.code"));
                if (numD != null) {
                    int iIntValue = numD.intValue();
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    qxf qxfVar12 = (qxf) poyVarM2.b;
                    qxfVar12.a |= 4096;
                    qxfVar12.n = iIntValue;
                }
                Integer numD2 = d(memoryStats.get("summary.stack"));
                if (numD2 != null) {
                    int iIntValue2 = numD2.intValue();
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    qxf qxfVar13 = (qxf) poyVarM2.b;
                    qxfVar13.a |= 8192;
                    qxfVar13.o = iIntValue2;
                }
                Integer numD3 = d(memoryStats.get("summary.graphics"));
                if (numD3 != null) {
                    int iIntValue3 = numD3.intValue();
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    qxf qxfVar14 = (qxf) poyVarM2.b;
                    qxfVar14.a |= 16384;
                    qxfVar14.p = iIntValue3;
                }
                Integer numD4 = d(memoryStats.get("summary.system"));
                if (numD4 != null) {
                    int iIntValue4 = numD4.intValue();
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    qxf qxfVar15 = (qxf) poyVarM2.b;
                    qxfVar15.a |= 65536;
                    qxfVar15.r = iIntValue4;
                }
                Integer numD5 = d(memoryStats.get("summary.java-heap"));
                if (numD5 != null) {
                    int iIntValue5 = numD5.intValue();
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    qxf qxfVar16 = (qxf) poyVarM2.b;
                    qxfVar16.a |= 2048;
                    qxfVar16.m = iIntValue5;
                }
                Integer numD6 = d(memoryStats.get("summary.private-other"));
                if (numD6 != null) {
                    int iIntValue6 = numD6.intValue();
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    qxf qxfVar17 = (qxf) poyVarM2.b;
                    qxfVar17.a |= 32768;
                    qxfVar17.q = iIntValue6;
                }
            } catch (NumberFormatException e2) {
                ((oug) ((oug) ((oug) a.b()).h(e2)).G((char) 3642)).o("failed to collect memory summary stats");
            }
        }
        if (memoryInfo != null) {
            int i9 = (int) (memoryInfo.availMem >> 10);
            if (poyVarM2.c) {
                poyVarM2.m();
                poyVarM2.c = false;
            }
            qxf qxfVar18 = (qxf) poyVarM2.b;
            qxfVar18.a |= 131072;
            qxfVar18.s = i9;
            int i10 = (int) (memoryInfo.totalMem >> 20);
            if (poyVarM2.c) {
                poyVarM2.m();
                poyVarM2.c = false;
            }
            qxf qxfVar19 = (qxf) poyVarM2.b;
            qxfVar19.a |= 262144;
            qxfVar19.t = i10;
        }
        if (mzyVar != null) {
            Long l = mzyVar.f;
            if (l != null) {
                long jLongValue = l.longValue();
                if (poyVarM2.c) {
                    poyVarM2.m();
                    poyVarM2.c = false;
                }
                qxf qxfVar20 = (qxf) poyVarM2.b;
                qxfVar20.a |= 524288;
                qxfVar20.u = jLongValue;
            }
            Long l2 = mzyVar.g;
            if (l2 != null) {
                long jLongValue2 = l2.longValue();
                if (poyVarM2.c) {
                    poyVarM2.m();
                    poyVarM2.c = false;
                }
                qxf qxfVar21 = (qxf) poyVarM2.b;
                qxfVar21.a |= 1048576;
                qxfVar21.v = jLongValue2;
            }
            Long l3 = mzyVar.h;
            if (l3 != null) {
                long jLongValue3 = l3.longValue();
                if (poyVarM2.c) {
                    poyVarM2.m();
                    poyVarM2.c = false;
                }
                qxf qxfVar22 = (qxf) poyVarM2.b;
                qxfVar22.a |= 2097152;
                qxfVar22.w = jLongValue3;
            }
            Long l4 = mzyVar.i;
            if (l4 != null) {
                long jLongValue4 = l4.longValue();
                if (poyVarM2.c) {
                    poyVarM2.m();
                    poyVarM2.c = false;
                }
                qxf qxfVar23 = (qxf) poyVarM2.b;
                qxfVar23.a |= 4194304;
                qxfVar23.x = jLongValue4;
            }
            Long l5 = mzyVar.j;
            if (l5 != null) {
                long jLongValue5 = l5.longValue();
                if (poyVarM2.c) {
                    poyVarM2.m();
                    poyVarM2.c = false;
                }
                qxf qxfVar24 = (qxf) poyVarM2.b;
                qxfVar24.a |= 8388608;
                qxfVar24.y = jLongValue5;
            }
        }
        qxf qxfVar25 = (qxf) poyVarM2.j();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        qxh qxhVar = (qxh) poyVarM.b;
        qxfVar25.getClass();
        qxhVar.b = qxfVar25;
        qxhVar.a |= 1;
        if (threadPolicyAllowThreadDiskReads.c) {
            threadPolicyAllowThreadDiskReads.m();
            threadPolicyAllowThreadDiskReads.c = false;
        }
        qxi qxiVar = (qxi) threadPolicyAllowThreadDiskReads.b;
        qxh qxhVar2 = (qxh) poyVarM.j();
        qxhVar2.getClass();
        qxiVar.b = qxhVar2;
        qxiVar.a |= 1;
        poy poyVarM3 = qxt.c.m();
        qxs qxsVarE = mwp.e(str, this.d);
        if (poyVarM3.c) {
            poyVarM3.m();
            poyVarM3.c = false;
        }
        qxt qxtVar = (qxt) poyVarM3.b;
        qxsVarE.getClass();
        qxtVar.b = qxsVarE;
        qxtVar.a |= 1;
        if (threadPolicyAllowThreadDiskReads.c) {
            threadPolicyAllowThreadDiskReads.m();
            threadPolicyAllowThreadDiskReads.c = false;
        }
        qxi qxiVar2 = (qxi) threadPolicyAllowThreadDiskReads.b;
        qxt qxtVar2 = (qxt) poyVarM3.j();
        qxtVar2.getClass();
        qxiVar2.c = qxtVar2;
        qxiVar2.a |= 2;
        poy poyVarM4 = qxg.c.m();
        Context context = this.d;
        int i11 = mwh.b;
        Object systemService = context.getSystemService("power");
        systemService.getClass();
        boolean zIsInteractive = ((PowerManager) systemService).isInteractive();
        if (poyVarM4.c) {
            poyVarM4.m();
            poyVarM4.c = false;
        }
        qxg qxgVar = (qxg) poyVarM4.b;
        qxgVar.a = 1 | qxgVar.a;
        qxgVar.b = zIsInteractive;
        if (threadPolicyAllowThreadDiskReads.c) {
            threadPolicyAllowThreadDiskReads.m();
            threadPolicyAllowThreadDiskReads.c = false;
        }
        qxi qxiVar3 = (qxi) threadPolicyAllowThreadDiskReads.b;
        qxg qxgVar2 = (qxg) poyVarM4.j();
        qxgVar2.getClass();
        qxiVar3.e = qxgVar2;
        qxiVar3.a |= 8;
        if (threadPolicyAllowThreadDiskReads.c) {
            threadPolicyAllowThreadDiskReads.m();
            threadPolicyAllowThreadDiskReads.c = false;
        }
        qxi qxiVar4 = (qxi) threadPolicyAllowThreadDiskReads.b;
        qxiVar4.d = i - 1;
        int i12 = qxiVar4.a | 4;
        qxiVar4.a = i12;
        if (str2 != null) {
            qxiVar4.a = i12 | 16;
            qxiVar4.f = str2;
        }
        return (qxi) threadPolicyAllowThreadDiskReads.j();
    }
}

package com.google.android.apps.camera.debug.metrics;

import android.content.Context;
import android.util.PrintWriterPrinter;
import defpackage.dgu;
import defpackage.dhh;
import defpackage.enc;
import defpackage.lyd;
import defpackage.lye;
import defpackage.lys;
import defpackage.lyv;
import defpackage.lyw;
import defpackage.lyx;
import defpackage.mip;
import defpackage.nvb;
import defpackage.obr;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class MetricsProvider extends dgu {
    public lyx a;

    @Override // defpackage.dgu
    public final void a(PrintWriter printWriter) {
        nvb nvbVar;
        lyw lywVar;
        int i;
        String string;
        lyw lywVar2;
        int i2;
        if (this.a == null) {
            Context context = getContext();
            context.getClass();
            ((dhh) ((enc) context.getApplicationContext()).c(dhh.class)).g(this);
        }
        long jNanoTime = System.nanoTime();
        PrintWriterPrinter printWriterPrinter = new PrintWriterPrinter(printWriter);
        lyx lyxVar = this.a;
        obr.ao(lyxVar);
        lys lysVar = lyxVar.a;
        synchronized (lysVar.a) {
            nvb nvbVar2 = lysVar.b.b;
            lywVar = null;
            nvbVar = new nvb((byte[]) null);
            for (Map.Entry entry : nvbVar2.a.entrySet()) {
                Map map = nvbVar.a;
                String str = (String) entry.getKey();
                lyv lyvVar = (lyv) entry.getValue();
                lyv lyvVar2 = new lyv(lyvVar.a);
                for (Map.Entry entry2 : lyvVar.b.entrySet()) {
                    lyvVar2.b.put((lye) entry2.getKey(), ((lyw) entry2.getValue()).a());
                }
                map.put(str, lyvVar2);
            }
        }
        Iterator it = nvbVar.a.values().iterator();
        while (true) {
            int i3 = 1;
            if (!it.hasNext()) {
                long jNanoTime2 = System.nanoTime();
                Locale locale = Locale.ROOT;
                double d = jNanoTime2 - jNanoTime;
                Double.isNaN(d);
                printWriterPrinter.println(String.format(locale, "\n\nMetrics dumped in %.6f ms", Double.valueOf(d / 1000000.0d)));
                return;
            }
            lyv lyvVar3 = (lyv) it.next();
            if (lyvVar3 == null) {
                string = "";
            } else if (lyvVar3.b().length == 0) {
                String strA = lyvVar3.a();
                Object[] objArr = lye.a.b;
                Iterator it2 = lyvVar3.b.entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        lywVar2 = lywVar;
                        break;
                    }
                    Map.Entry entry3 = (Map.Entry) it2.next();
                    while (true) {
                        if (i2 >= objArr.length) {
                            lywVar2 = (lyw) entry3.getValue();
                            break;
                        }
                        i2 = (objArr[i2] == null || ((lye) entry3.getKey()).b[i2] == objArr[i2]) ? i2 + 1 : 0;
                    }
                }
                String strV = mip.V(lywVar2);
                StringBuilder sb = new StringBuilder(strA.length() + 2 + String.valueOf(strV).length());
                sb.append(strA);
                sb.append(": ");
                sb.append(strV);
                string = sb.toString();
            } else {
                lyd[] lydVarArrB = lyvVar3.b();
                Set<Map.Entry> setEntrySet = lyvVar3.b.entrySet();
                int length = lydVarArrB.length;
                int i4 = length + 1;
                int[] iArr = new int[i4];
                String[][] strArr = (String[][]) Array.newInstance((Class<?>) String.class, setEntrySet.size() + 1, i4);
                for (int i5 = 0; i5 < length; i5++) {
                    strArr[0][i5] = lydVarArrB[i5].a;
                    iArr[i5] = lydVarArrB[i5].a.length();
                }
                strArr[0][length] = "";
                iArr[length] = 1;
                int i6 = 1;
                for (Map.Entry entry4 : setEntrySet) {
                    int i7 = 0;
                    while (i7 < length) {
                        Locale locale2 = Locale.ROOT;
                        Object[] objArr2 = new Object[i3];
                        objArr2[0] = ((lye) entry4.getKey()).b[i7];
                        String str2 = String.format(locale2, "%s", objArr2);
                        iArr[i7] = Math.max(iArr[i7], str2.length());
                        strArr[i6][i7] = str2;
                        i7++;
                        i3 = 1;
                    }
                    String strV2 = mip.V((lyw) entry4.getValue());
                    iArr[length] = Math.max(iArr[length], strV2.length());
                    strArr[i6][length] = strV2;
                    i6++;
                    i3 = 1;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("  ");
                int i8 = 0;
                while (true) {
                    i = length - 1;
                    if (i8 >= i) {
                        break;
                    }
                    sb2.append("%-");
                    sb2.append(iArr[i8] + 1);
                    sb2.append("s");
                    i8++;
                }
                String strValueOf = String.valueOf(sb2);
                StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf).length() + 2);
                sb3.append(strValueOf);
                sb3.append("%s");
                String string2 = sb3.toString();
                sb2.append("%-");
                sb2.append(iArr[i]);
                sb2.append("s:%");
                sb2.append(iArr[length] + 1);
                sb2.append("s");
                String string3 = sb2.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(lyvVar3.a());
                sb4.append("\n");
                sb4.append(String.format(Locale.ROOT, string2, strArr[0]));
                for (int i9 = 1; i9 < strArr.length; i9++) {
                    sb4.append("\n");
                    sb4.append(String.format(Locale.ROOT, string3, strArr[i9]));
                }
                string = sb4.toString();
            }
            printWriterPrinter.println(string);
            lywVar = null;
        }
    }
}

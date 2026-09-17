package com.google.android.apps.camera.debug.shottracker.db;

import android.content.Context;
import android.database.Cursor;
import defpackage.aig;
import defpackage.ais;
import defpackage.dgu;
import defpackage.dil;
import defpackage.dir;
import defpackage.dit;
import defpackage.diu;
import defpackage.diy;
import defpackage.diz;
import defpackage.fw;
import defpackage.fy;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public class DbDebugDumper extends dgu {
    private static final DateTimeFormatter a = DateTimeFormatter.ofPattern("MM-dd HH:mm:ss.SSS").withZone(ZoneId.systemDefault());

    private static void b(Map map, List list, PrintWriter printWriter) {
        Iterator it;
        PrintWriter printWriter2;
        String str;
        PrintWriter printWriter3 = printWriter;
        Iterator it2 = list.iterator();
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        Instant instant = null;
        while (it2.hasNext()) {
            diz dizVar = (diz) it2.next();
            dit ditVar = (dit) map.get(Long.valueOf(dizVar.b));
            if (ditVar != null) {
                if (dizVar.b != j2) {
                    if (j2 < j) {
                        printWriter3.println("");
                        printWriter.flush();
                    }
                    long j3 = ditVar.a;
                    String str2 = ditVar.i;
                    long j4 = ditVar.j;
                    String str3 = ditVar.b;
                    String str4 = ditVar.h;
                    long j5 = ditVar.c;
                    long j6 = ditVar.d;
                    long j7 = ditVar.e;
                    long j8 = ditVar.f;
                    long j9 = ditVar.g;
                    boolean z = ditVar.l;
                    it = it2;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 241 + String.valueOf(str3).length() + String.valueOf(str4).length());
                    sb.append(j3);
                    sb.append(" ");
                    sb.append(str2);
                    sb.append("[pid=");
                    sb.append(j4);
                    sb.append("] title=");
                    sb.append(str3);
                    sb.append(" captureSessionType=");
                    sb.append(str4);
                    sb.append(" start=");
                    sb.append(j5);
                    sb.append(" persisted=");
                    sb.append(j6);
                    sb.append(" canceled=");
                    sb.append(j7);
                    sb.append(" deleted=");
                    sb.append(j8);
                    sb.append(" mostRecentEvent=");
                    sb.append(j9);
                    sb.append(" failed=");
                    sb.append(z);
                    printWriter2 = printWriter;
                    printWriter2.println(sb.toString());
                    instant = null;
                } else {
                    it = it2;
                    printWriter2 = printWriter3;
                }
                Instant instantOfEpochMilli = Instant.ofEpochMilli(dizVar.c);
                Duration durationBetween = instant == null ? Duration.ZERO : Duration.between(instant, instantOfEpochMilli);
                long j10 = dizVar.c;
                String str5 = a.format(instantOfEpochMilli);
                long millis = durationBetween.toMillis();
                if (millis >= 1000) {
                    double d = millis;
                    Double.isNaN(d);
                    str = String.format("%10.3fs", Double.valueOf(d / 1000.0d));
                } else {
                    str = String.format("      .%03ds", Long.valueOf(millis));
                }
                String str6 = dizVar.d;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 26 + String.valueOf(str).length() + String.valueOf(str6).length());
                sb2.append("  ");
                sb2.append(j10);
                sb2.append("  ");
                sb2.append(str5);
                sb2.append(str);
                sb2.append(": ");
                sb2.append(str6);
                printWriter2.println(sb2.toString());
                j2 = dizVar.b;
                instant = instantOfEpochMilli;
                printWriter3 = printWriter2;
                it2 = it;
                j = Long.MAX_VALUE;
            } else {
                it2 = it2;
                j = Long.MAX_VALUE;
            }
        }
        printWriter.flush();
    }

    @Override // defpackage.dgu
    public final void a(PrintWriter printWriter) throws Throwable {
        ais aisVar;
        Context context = getContext();
        context.getClass();
        aig aigVarI = fw.i(context, ShotDatabase.class, "shot_db");
        aigVarI.c();
        ShotDatabase shotDatabase = (ShotDatabase) aigVarI.a();
        dil dilVarR = shotDatabase.r();
        ais aisVarA = ais.a("SELECT * FROM shots ORDER BY shot_id", 0);
        dir dirVar = (dir) dilVarR;
        dirVar.a.g();
        Cursor cursorI = fy.i(dirVar.a, aisVarA, false);
        try {
            int iL = fy.l(cursorI, "shot_id");
            int iL2 = fy.l(cursorI, "title");
            int iL3 = fy.l(cursorI, "start_millis");
            int iL4 = fy.l(cursorI, "persisted_millis");
            int iL5 = fy.l(cursorI, "canceled_millis");
            int iL6 = fy.l(cursorI, "deleted_millis");
            int iL7 = fy.l(cursorI, "most_recent_event_millis");
            int iL8 = fy.l(cursorI, "capture_session_type");
            int iL9 = fy.l(cursorI, "capture_session_shot_id");
            int iL10 = fy.l(cursorI, "pid");
            int iL11 = fy.l(cursorI, "stuck");
            int iL12 = fy.l(cursorI, "failed");
            ArrayList<dit> arrayList = new ArrayList(cursorI.getCount());
            while (true) {
                aisVar = aisVarA;
                if (!cursorI.moveToNext()) {
                    break;
                }
                try {
                    dit ditVar = new dit();
                    int i = iL11;
                    ditVar.a = cursorI.getLong(iL);
                    if (cursorI.isNull(iL2)) {
                        ditVar.b = null;
                    } else {
                        ditVar.b = cursorI.getString(iL2);
                    }
                    ditVar.c = cursorI.getLong(iL3);
                    ditVar.d = cursorI.getLong(iL4);
                    ditVar.e = cursorI.getLong(iL5);
                    ditVar.f = cursorI.getLong(iL6);
                    ditVar.g = cursorI.getLong(iL7);
                    if (cursorI.isNull(iL8)) {
                        ditVar.h = null;
                    } else {
                        ditVar.h = cursorI.getString(iL8);
                    }
                    if (cursorI.isNull(iL9)) {
                        ditVar.i = null;
                    } else {
                        ditVar.i = cursorI.getString(iL9);
                    }
                    ditVar.j = cursorI.getLong(iL10);
                    ditVar.k = cursorI.getInt(i) != 0;
                    ditVar.l = cursorI.getInt(iL12) != 0;
                    arrayList.add(ditVar);
                    iL11 = i;
                    aisVarA = aisVar;
                } catch (Throwable th) {
                    th = th;
                    cursorI.close();
                    aisVar.j();
                    throw th;
                }
            }
            cursorI.close();
            aisVar.j();
            diu diuVarS = shotDatabase.s();
            ais aisVarA2 = ais.a("SELECT * FROM shot_log ORDER BY shot_id DESC, sequence", 0);
            diy diyVar = (diy) diuVarS;
            diyVar.a.g();
            Cursor cursorI2 = fy.i(diyVar.a, aisVarA2, false);
            try {
                int iL13 = fy.l(cursorI2, "sequence");
                int iL14 = fy.l(cursorI2, "shot_id");
                int iL15 = fy.l(cursorI2, "time_millis");
                int iL16 = fy.l(cursorI2, "message");
                ArrayList arrayList2 = new ArrayList(cursorI2.getCount());
                while (cursorI2.moveToNext()) {
                    diz dizVar = new diz();
                    dizVar.a = cursorI2.getInt(iL13);
                    dizVar.b = cursorI2.getLong(iL14);
                    dizVar.c = cursorI2.getLong(iL15);
                    if (cursorI2.isNull(iL16)) {
                        dizVar.d = null;
                    } else {
                        dizVar.d = cursorI2.getString(iL16);
                    }
                    arrayList2.add(dizVar);
                }
                cursorI2.close();
                aisVarA2.j();
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                for (dit ditVar2 : arrayList) {
                    if (ditVar2.l || (ditVar2.d == 0 && ditVar2.e == 0 && ditVar2.f == 0)) {
                        map2.put(Long.valueOf(ditVar2.a), ditVar2);
                    } else {
                        map.put(Long.valueOf(ditVar2.a), ditVar2);
                    }
                }
                int size = map2.size();
                int size2 = map.size();
                StringBuilder sb = new StringBuilder(44);
                sb.append("DUMPING: ");
                sb.append(size);
                sb.append(" SUSPECT, ");
                sb.append(size2);
                sb.append(" OK");
                printWriter.println(sb.toString());
                printWriter.flush();
                if (!map2.isEmpty()) {
                    printWriter.println("\nSUSPECT SHOTS");
                    b(map2, arrayList2, printWriter);
                }
                if (!map.isEmpty()) {
                    printWriter.println("\nOK SHOTS");
                    b(map, arrayList2, printWriter);
                }
                int size3 = map2.size();
                int size4 = map.size();
                StringBuilder sb2 = new StringBuilder(44);
                sb2.append("\nDUMPED: ");
                sb2.append(size3);
                sb2.append(" SUSPECT, ");
                sb2.append(size4);
                sb2.append(" OK");
                printWriter.println(sb2.toString());
                printWriter.flush();
                if (shotDatabase.l()) {
                    ReentrantReadWriteLock.WriteLock writeLock = shotDatabase.h.writeLock();
                    writeLock.lock();
                    try {
                        fw fwVar = shotDatabase.d.l;
                        shotDatabase.c.close();
                    } finally {
                        writeLock.unlock();
                    }
                }
            } catch (Throwable th2) {
                cursorI2.close();
                aisVarA2.j();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            aisVar = aisVarA;
        }
    }
}

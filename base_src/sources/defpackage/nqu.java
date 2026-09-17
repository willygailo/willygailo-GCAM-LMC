package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class nqu extends nql {
    public final aii a;
    public final aiy b;

    public nqu(aii aiiVar) {
        this.a = aiiVar;
        this.b = new nqo(aiiVar);
    }

    @Override // defpackage.nql
    public final Object a(qlh qlhVar) {
        return fx.o(this.a, new nqp(this, 1), qlhVar);
    }

    @Override // defpackage.nql
    public final Object c(long j, nnr nnrVar, qlh qlhVar) {
        return adg.c(this.a, new nqq(this, nnrVar, j), qlhVar);
    }

    @Override // defpackage.nql
    public final Object d(qlh qlhVar) {
        return fx.o(this.a, new nqp(this, 0), qlhVar);
    }

    @Override // defpackage.nql
    public final Object f(nnr nnrVar, qlh qlhVar) {
        ais aisVarA = ais.a("SELECT * FROM ResourceEntity WHERE status_uploadState IS ?", 1);
        aisVarA.e(1, npy.r(nnrVar));
        return adg.b(this.a, akf.b(), new nqs(this, aisVarA), qlhVar);
    }

    /* JADX WARN: Code duplicated, block: B:73:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b0 A[Catch: all -> 0x022f, TryCatch #0 {all -> 0x022f, blocks: (B:25:0x0091, B:30:0x009c, B:31:0x00f8, B:33:0x00fe, B:35:0x0110, B:39:0x012b, B:43:0x013e, B:47:0x0151, B:51:0x0160, B:55:0x016f, B:57:0x0179, B:59:0x017f, B:61:0x0185, B:63:0x018d, B:65:0x0197, B:84:0x0201, B:71:0x01a7, B:75:0x01b8, B:79:0x01cd, B:83:0x01e0, B:82:0x01d8, B:78:0x01c5, B:74:0x01b0, B:54:0x0169, B:50:0x015a, B:46:0x014b, B:42:0x0138, B:38:0x0127), top: B:91:0x0091 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c5 A[Catch: all -> 0x022f, TryCatch #0 {all -> 0x022f, blocks: (B:25:0x0091, B:30:0x009c, B:31:0x00f8, B:33:0x00fe, B:35:0x0110, B:39:0x012b, B:43:0x013e, B:47:0x0151, B:51:0x0160, B:55:0x016f, B:57:0x0179, B:59:0x017f, B:61:0x0185, B:63:0x018d, B:65:0x0197, B:84:0x0201, B:71:0x01a7, B:75:0x01b8, B:79:0x01cd, B:83:0x01e0, B:82:0x01d8, B:78:0x01c5, B:74:0x01b0, B:54:0x0169, B:50:0x015a, B:46:0x014b, B:42:0x0138, B:38:0x0127), top: B:91:0x0091 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d8 A[Catch: all -> 0x022f, TryCatch #0 {all -> 0x022f, blocks: (B:25:0x0091, B:30:0x009c, B:31:0x00f8, B:33:0x00fe, B:35:0x0110, B:39:0x012b, B:43:0x013e, B:47:0x0151, B:51:0x0160, B:55:0x016f, B:57:0x0179, B:59:0x017f, B:61:0x0185, B:63:0x018d, B:65:0x0197, B:84:0x0201, B:71:0x01a7, B:75:0x01b8, B:79:0x01cd, B:83:0x01e0, B:82:0x01d8, B:78:0x01c5, B:74:0x01b0, B:54:0x0169, B:50:0x015a, B:46:0x014b, B:42:0x0138, B:38:0x0127), top: B:91:0x0091 }] */
    public final void g(HashMap map) {
        int i;
        int i2;
        int i3;
        Long lValueOf;
        Long lValueOf2;
        npk npkVar;
        map = map;
        Set<Long> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            HashMap map2 = new HashMap(999);
            int i4 = 0;
            for (Long l : setKeySet) {
                map2.put(l, (ArrayList) map.get(l));
                i4++;
                if (i4 == 999) {
                    g(map2);
                    map2 = new HashMap(999);
                    i4 = 0;
                }
            }
            if (i4 > 0) {
                g(map2);
                return;
            }
            return;
        }
        StringBuilder sbE = fz.e();
        sbE.append("SELECT `resourceOnDeviceId`,`isAttachment`,`id`,`contentType`,`onDeviceSize`,`uploadTransferHandle`,`blobstoreId`,`contentHash`,`onDeviceId`,`status_addedToAirlockEpochTimestamp`,`status_uploadToF250RequestedEpochTimestamp`,`status_uploadToF250CompletedEpochTimestamp`,`status_airlockFileState`,`status_uploadState`,`status_uploadProgressPercent` FROM `AnnotachmentEntity` WHERE `resourceOnDeviceId` IN (");
        int size = setKeySet.size();
        fz.f(sbE, size);
        sbE.append(")");
        ais aisVarA = ais.a(sbE.toString(), size);
        int i5 = 1;
        for (Long l2 : setKeySet) {
            if (l2 == null) {
                aisVarA.f(i5);
            } else {
                aisVarA.e(i5, l2.longValue());
            }
            i5++;
        }
        Cursor cursorI = fy.i(this.a, aisVarA, false);
        try {
            int iK = fy.k(cursorI, "resourceOnDeviceId");
            if (iK != -1) {
                int iL = fy.l(cursorI, "resourceOnDeviceId");
                int iL2 = fy.l(cursorI, "isAttachment");
                int iL3 = fy.l(cursorI, "id");
                int iL4 = fy.l(cursorI, "contentType");
                int iL5 = fy.l(cursorI, "onDeviceSize");
                int iL6 = fy.l(cursorI, "uploadTransferHandle");
                int iL7 = fy.l(cursorI, "blobstoreId");
                int iL8 = fy.l(cursorI, "contentHash");
                int iL9 = fy.l(cursorI, "onDeviceId");
                int iL10 = fy.l(cursorI, "status_addedToAirlockEpochTimestamp");
                int iL11 = fy.l(cursorI, "status_uploadToF250RequestedEpochTimestamp");
                int iL12 = fy.l(cursorI, "status_uploadToF250CompletedEpochTimestamp");
                int iL13 = fy.l(cursorI, "status_airlockFileState");
                int iL14 = fy.l(cursorI, "status_uploadState");
                int iL15 = fy.l(cursorI, "status_uploadProgressPercent");
                while (cursorI.moveToNext()) {
                    iK = iK;
                    ArrayList arrayList = (ArrayList) map.get(Long.valueOf(cursorI.getLong(iK)));
                    if (arrayList != null) {
                        long j = cursorI.getLong(iL);
                        nmt nmtVarQ = npy.q(cursorI.getInt(iL2));
                        Long lValueOf3 = null;
                        nmz nmzVarU = npy.u(cursorI.isNull(iL3) ? null : cursorI.getString(iL3));
                        String string = cursorI.isNull(iL4) ? null : cursorI.getString(iL4);
                        long j2 = cursorI.getLong(iL5);
                        String string2 = cursorI.isNull(iL6) ? null : cursorI.getString(iL6);
                        String string3 = cursorI.isNull(iL7) ? null : cursorI.getString(iL7);
                        String string4 = cursorI.isNull(iL8) ? null : cursorI.getString(iL8);
                        long j3 = cursorI.getLong(iL9);
                        if (cursorI.isNull(iL10) && cursorI.isNull(iL11) && cursorI.isNull(iL12)) {
                            i = iL13;
                            if (cursorI.isNull(i)) {
                                i2 = iL;
                                i3 = iL14;
                                if (cursorI.isNull(i3) && cursorI.isNull(iL15)) {
                                    npkVar = null;
                                }
                                int i6 = i;
                                arrayList.add(new npe(j, nmtVarQ, nmzVarU, string, j2, string2, string3, string4, npkVar, j3));
                                iL14 = i3;
                                iL = i2;
                                iL13 = i6;
                            }
                            if (cursorI.isNull(iL10)) {
                                lValueOf = null;
                            } else {
                                lValueOf = Long.valueOf(cursorI.getLong(iL10));
                            }
                            prl prlVarH = npy.h(lValueOf);
                            if (cursorI.isNull(iL11)) {
                                lValueOf2 = null;
                            } else {
                                lValueOf2 = Long.valueOf(cursorI.getLong(iL11));
                            }
                            prl prlVarH2 = npy.h(lValueOf2);
                            if (cursorI.isNull(iL12)) {
                                lValueOf3 = Long.valueOf(cursorI.getLong(iL12));
                            }
                            npkVar = new npk(prlVarH, prlVarH2, npy.h(lValueOf3), npy.j(cursorI.getInt(i)), npy.k(cursorI.getInt(i3)), cursorI.getDouble(iL15));
                            int i7 = i;
                            arrayList.add(new npe(j, nmtVarQ, nmzVarU, string, j2, string2, string3, string4, npkVar, j3));
                            iL14 = i3;
                            iL = i2;
                            iL13 = i7;
                        } else {
                            i = iL13;
                        }
                        i2 = iL;
                        i3 = iL14;
                        if (cursorI.isNull(iL10)) {
                            lValueOf = null;
                        } else {
                            lValueOf = Long.valueOf(cursorI.getLong(iL10));
                        }
                        prl prlVarH3 = npy.h(lValueOf);
                        if (cursorI.isNull(iL11)) {
                            lValueOf2 = null;
                        } else {
                            lValueOf2 = Long.valueOf(cursorI.getLong(iL11));
                        }
                        prl prlVarH4 = npy.h(lValueOf2);
                        if (cursorI.isNull(iL12)) {
                            lValueOf3 = Long.valueOf(cursorI.getLong(iL12));
                        }
                        npkVar = new npk(prlVarH3, prlVarH4, npy.h(lValueOf3), npy.j(cursorI.getInt(i)), npy.k(cursorI.getInt(i3)), cursorI.getDouble(iL15));
                        int i8 = i;
                        arrayList.add(new npe(j, nmtVarQ, nmzVarU, string, j2, string2, string3, string4, npkVar, j3));
                        iL14 = i3;
                        iL = i2;
                        iL13 = i8;
                    } else {
                        iL14 = iL14;
                        iL = iL;
                        iL13 = iL13;
                    }
                }
            }
        } finally {
            cursorI.close();
        }
    }
}

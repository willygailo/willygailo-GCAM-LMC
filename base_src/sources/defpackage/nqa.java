package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class nqa implements Callable {
    final /* synthetic */ ajw a;
    final /* synthetic */ nqf b;

    public nqa(nqf nqfVar, ajw ajwVar) {
        this.b = nqfVar;
        this.a = ajwVar;
    }

    /* JADX WARN: Code duplicated, block: B:163:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:164:0x02d0 A[Catch: all -> 0x0362, TryCatch #0 {all -> 0x0362, blocks: (B:7:0x0023, B:134:0x0287, B:192:0x0344, B:194:0x0350, B:191:0x033f, B:188:0x032f, B:185:0x0321, B:178:0x0306, B:182:0x0317, B:181:0x030f, B:171:0x02eb, B:175:0x02fc, B:174:0x02f4, B:164:0x02d0, B:168:0x02e1, B:167:0x02d9, B:144:0x029d, B:148:0x02a7, B:152:0x02b1, B:156:0x02bb, B:160:0x02c5, B:131:0x027d, B:123:0x0263, B:127:0x0270, B:126:0x026c, B:115:0x0249, B:119:0x0256, B:118:0x0252, B:108:0x0233, B:111:0x023c, B:101:0x021d, B:104:0x0226, B:93:0x0203, B:97:0x0210, B:96:0x020c, B:87:0x01f2, B:80:0x01d6, B:84:0x01e7, B:83:0x01df, B:73:0x01ba, B:77:0x01cb, B:76:0x01c3, B:66:0x019e, B:70:0x01af, B:69:0x01a7, B:59:0x0186, B:63:0x0193, B:62:0x018f, B:53:0x0172, B:56:0x017b, B:47:0x015e, B:50:0x0167, B:44:0x0153, B:36:0x0135, B:40:0x0146, B:39:0x013e, B:29:0x0119, B:33:0x012a, B:32:0x0122, B:22:0x0101, B:26:0x010e, B:25:0x010a, B:16:0x00ed, B:19:0x00f6, B:10:0x00d9, B:13:0x00e2), top: B:216:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:167:0x02d9 A[Catch: all -> 0x0362, TryCatch #0 {all -> 0x0362, blocks: (B:7:0x0023, B:134:0x0287, B:192:0x0344, B:194:0x0350, B:191:0x033f, B:188:0x032f, B:185:0x0321, B:178:0x0306, B:182:0x0317, B:181:0x030f, B:171:0x02eb, B:175:0x02fc, B:174:0x02f4, B:164:0x02d0, B:168:0x02e1, B:167:0x02d9, B:144:0x029d, B:148:0x02a7, B:152:0x02b1, B:156:0x02bb, B:160:0x02c5, B:131:0x027d, B:123:0x0263, B:127:0x0270, B:126:0x026c, B:115:0x0249, B:119:0x0256, B:118:0x0252, B:108:0x0233, B:111:0x023c, B:101:0x021d, B:104:0x0226, B:93:0x0203, B:97:0x0210, B:96:0x020c, B:87:0x01f2, B:80:0x01d6, B:84:0x01e7, B:83:0x01df, B:73:0x01ba, B:77:0x01cb, B:76:0x01c3, B:66:0x019e, B:70:0x01af, B:69:0x01a7, B:59:0x0186, B:63:0x0193, B:62:0x018f, B:53:0x0172, B:56:0x017b, B:47:0x015e, B:50:0x0167, B:44:0x0153, B:36:0x0135, B:40:0x0146, B:39:0x013e, B:29:0x0119, B:33:0x012a, B:32:0x0122, B:22:0x0101, B:26:0x010e, B:25:0x010a, B:16:0x00ed, B:19:0x00f6, B:10:0x00d9, B:13:0x00e2), top: B:216:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:171:0x02eb A[Catch: all -> 0x0362, TryCatch #0 {all -> 0x0362, blocks: (B:7:0x0023, B:134:0x0287, B:192:0x0344, B:194:0x0350, B:191:0x033f, B:188:0x032f, B:185:0x0321, B:178:0x0306, B:182:0x0317, B:181:0x030f, B:171:0x02eb, B:175:0x02fc, B:174:0x02f4, B:164:0x02d0, B:168:0x02e1, B:167:0x02d9, B:144:0x029d, B:148:0x02a7, B:152:0x02b1, B:156:0x02bb, B:160:0x02c5, B:131:0x027d, B:123:0x0263, B:127:0x0270, B:126:0x026c, B:115:0x0249, B:119:0x0256, B:118:0x0252, B:108:0x0233, B:111:0x023c, B:101:0x021d, B:104:0x0226, B:93:0x0203, B:97:0x0210, B:96:0x020c, B:87:0x01f2, B:80:0x01d6, B:84:0x01e7, B:83:0x01df, B:73:0x01ba, B:77:0x01cb, B:76:0x01c3, B:66:0x019e, B:70:0x01af, B:69:0x01a7, B:59:0x0186, B:63:0x0193, B:62:0x018f, B:53:0x0172, B:56:0x017b, B:47:0x015e, B:50:0x0167, B:44:0x0153, B:36:0x0135, B:40:0x0146, B:39:0x013e, B:29:0x0119, B:33:0x012a, B:32:0x0122, B:22:0x0101, B:26:0x010e, B:25:0x010a, B:16:0x00ed, B:19:0x00f6, B:10:0x00d9, B:13:0x00e2), top: B:216:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:174:0x02f4 A[Catch: all -> 0x0362, TryCatch #0 {all -> 0x0362, blocks: (B:7:0x0023, B:134:0x0287, B:192:0x0344, B:194:0x0350, B:191:0x033f, B:188:0x032f, B:185:0x0321, B:178:0x0306, B:182:0x0317, B:181:0x030f, B:171:0x02eb, B:175:0x02fc, B:174:0x02f4, B:164:0x02d0, B:168:0x02e1, B:167:0x02d9, B:144:0x029d, B:148:0x02a7, B:152:0x02b1, B:156:0x02bb, B:160:0x02c5, B:131:0x027d, B:123:0x0263, B:127:0x0270, B:126:0x026c, B:115:0x0249, B:119:0x0256, B:118:0x0252, B:108:0x0233, B:111:0x023c, B:101:0x021d, B:104:0x0226, B:93:0x0203, B:97:0x0210, B:96:0x020c, B:87:0x01f2, B:80:0x01d6, B:84:0x01e7, B:83:0x01df, B:73:0x01ba, B:77:0x01cb, B:76:0x01c3, B:66:0x019e, B:70:0x01af, B:69:0x01a7, B:59:0x0186, B:63:0x0193, B:62:0x018f, B:53:0x0172, B:56:0x017b, B:47:0x015e, B:50:0x0167, B:44:0x0153, B:36:0x0135, B:40:0x0146, B:39:0x013e, B:29:0x0119, B:33:0x012a, B:32:0x0122, B:22:0x0101, B:26:0x010e, B:25:0x010a, B:16:0x00ed, B:19:0x00f6, B:10:0x00d9, B:13:0x00e2), top: B:216:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x0303  */
    /* JADX WARN: Code duplicated, block: B:178:0x0306 A[Catch: all -> 0x0362, TryCatch #0 {all -> 0x0362, blocks: (B:7:0x0023, B:134:0x0287, B:192:0x0344, B:194:0x0350, B:191:0x033f, B:188:0x032f, B:185:0x0321, B:178:0x0306, B:182:0x0317, B:181:0x030f, B:171:0x02eb, B:175:0x02fc, B:174:0x02f4, B:164:0x02d0, B:168:0x02e1, B:167:0x02d9, B:144:0x029d, B:148:0x02a7, B:152:0x02b1, B:156:0x02bb, B:160:0x02c5, B:131:0x027d, B:123:0x0263, B:127:0x0270, B:126:0x026c, B:115:0x0249, B:119:0x0256, B:118:0x0252, B:108:0x0233, B:111:0x023c, B:101:0x021d, B:104:0x0226, B:93:0x0203, B:97:0x0210, B:96:0x020c, B:87:0x01f2, B:80:0x01d6, B:84:0x01e7, B:83:0x01df, B:73:0x01ba, B:77:0x01cb, B:76:0x01c3, B:66:0x019e, B:70:0x01af, B:69:0x01a7, B:59:0x0186, B:63:0x0193, B:62:0x018f, B:53:0x0172, B:56:0x017b, B:47:0x015e, B:50:0x0167, B:44:0x0153, B:36:0x0135, B:40:0x0146, B:39:0x013e, B:29:0x0119, B:33:0x012a, B:32:0x0122, B:22:0x0101, B:26:0x010e, B:25:0x010a, B:16:0x00ed, B:19:0x00f6, B:10:0x00d9, B:13:0x00e2), top: B:216:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:180:0x030c  */
    /* JADX WARN: Code duplicated, block: B:181:0x030f A[Catch: all -> 0x0362, TryCatch #0 {all -> 0x0362, blocks: (B:7:0x0023, B:134:0x0287, B:192:0x0344, B:194:0x0350, B:191:0x033f, B:188:0x032f, B:185:0x0321, B:178:0x0306, B:182:0x0317, B:181:0x030f, B:171:0x02eb, B:175:0x02fc, B:174:0x02f4, B:164:0x02d0, B:168:0x02e1, B:167:0x02d9, B:144:0x029d, B:148:0x02a7, B:152:0x02b1, B:156:0x02bb, B:160:0x02c5, B:131:0x027d, B:123:0x0263, B:127:0x0270, B:126:0x026c, B:115:0x0249, B:119:0x0256, B:118:0x0252, B:108:0x0233, B:111:0x023c, B:101:0x021d, B:104:0x0226, B:93:0x0203, B:97:0x0210, B:96:0x020c, B:87:0x01f2, B:80:0x01d6, B:84:0x01e7, B:83:0x01df, B:73:0x01ba, B:77:0x01cb, B:76:0x01c3, B:66:0x019e, B:70:0x01af, B:69:0x01a7, B:59:0x0186, B:63:0x0193, B:62:0x018f, B:53:0x0172, B:56:0x017b, B:47:0x015e, B:50:0x0167, B:44:0x0153, B:36:0x0135, B:40:0x0146, B:39:0x013e, B:29:0x0119, B:33:0x012a, B:32:0x0122, B:22:0x0101, B:26:0x010e, B:25:0x010a, B:16:0x00ed, B:19:0x00f6, B:10:0x00d9, B:13:0x00e2), top: B:216:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:184:0x031e  */
    /* JADX WARN: Code duplicated, block: B:185:0x0321 A[Catch: all -> 0x0362, TryCatch #0 {all -> 0x0362, blocks: (B:7:0x0023, B:134:0x0287, B:192:0x0344, B:194:0x0350, B:191:0x033f, B:188:0x032f, B:185:0x0321, B:178:0x0306, B:182:0x0317, B:181:0x030f, B:171:0x02eb, B:175:0x02fc, B:174:0x02f4, B:164:0x02d0, B:168:0x02e1, B:167:0x02d9, B:144:0x029d, B:148:0x02a7, B:152:0x02b1, B:156:0x02bb, B:160:0x02c5, B:131:0x027d, B:123:0x0263, B:127:0x0270, B:126:0x026c, B:115:0x0249, B:119:0x0256, B:118:0x0252, B:108:0x0233, B:111:0x023c, B:101:0x021d, B:104:0x0226, B:93:0x0203, B:97:0x0210, B:96:0x020c, B:87:0x01f2, B:80:0x01d6, B:84:0x01e7, B:83:0x01df, B:73:0x01ba, B:77:0x01cb, B:76:0x01c3, B:66:0x019e, B:70:0x01af, B:69:0x01a7, B:59:0x0186, B:63:0x0193, B:62:0x018f, B:53:0x0172, B:56:0x017b, B:47:0x015e, B:50:0x0167, B:44:0x0153, B:36:0x0135, B:40:0x0146, B:39:0x013e, B:29:0x0119, B:33:0x012a, B:32:0x0122, B:22:0x0101, B:26:0x010e, B:25:0x010a, B:16:0x00ed, B:19:0x00f6, B:10:0x00d9, B:13:0x00e2), top: B:216:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x032c  */
    /* JADX WARN: Code duplicated, block: B:188:0x032f A[Catch: all -> 0x0362, TryCatch #0 {all -> 0x0362, blocks: (B:7:0x0023, B:134:0x0287, B:192:0x0344, B:194:0x0350, B:191:0x033f, B:188:0x032f, B:185:0x0321, B:178:0x0306, B:182:0x0317, B:181:0x030f, B:171:0x02eb, B:175:0x02fc, B:174:0x02f4, B:164:0x02d0, B:168:0x02e1, B:167:0x02d9, B:144:0x029d, B:148:0x02a7, B:152:0x02b1, B:156:0x02bb, B:160:0x02c5, B:131:0x027d, B:123:0x0263, B:127:0x0270, B:126:0x026c, B:115:0x0249, B:119:0x0256, B:118:0x0252, B:108:0x0233, B:111:0x023c, B:101:0x021d, B:104:0x0226, B:93:0x0203, B:97:0x0210, B:96:0x020c, B:87:0x01f2, B:80:0x01d6, B:84:0x01e7, B:83:0x01df, B:73:0x01ba, B:77:0x01cb, B:76:0x01c3, B:66:0x019e, B:70:0x01af, B:69:0x01a7, B:59:0x0186, B:63:0x0193, B:62:0x018f, B:53:0x0172, B:56:0x017b, B:47:0x015e, B:50:0x0167, B:44:0x0153, B:36:0x0135, B:40:0x0146, B:39:0x013e, B:29:0x0119, B:33:0x012a, B:32:0x0122, B:22:0x0101, B:26:0x010e, B:25:0x010a, B:16:0x00ed, B:19:0x00f6, B:10:0x00d9, B:13:0x00e2), top: B:216:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:190:0x033b  */
    /* JADX WARN: Code duplicated, block: B:191:0x033f A[Catch: all -> 0x0362, TryCatch #0 {all -> 0x0362, blocks: (B:7:0x0023, B:134:0x0287, B:192:0x0344, B:194:0x0350, B:191:0x033f, B:188:0x032f, B:185:0x0321, B:178:0x0306, B:182:0x0317, B:181:0x030f, B:171:0x02eb, B:175:0x02fc, B:174:0x02f4, B:164:0x02d0, B:168:0x02e1, B:167:0x02d9, B:144:0x029d, B:148:0x02a7, B:152:0x02b1, B:156:0x02bb, B:160:0x02c5, B:131:0x027d, B:123:0x0263, B:127:0x0270, B:126:0x026c, B:115:0x0249, B:119:0x0256, B:118:0x0252, B:108:0x0233, B:111:0x023c, B:101:0x021d, B:104:0x0226, B:93:0x0203, B:97:0x0210, B:96:0x020c, B:87:0x01f2, B:80:0x01d6, B:84:0x01e7, B:83:0x01df, B:73:0x01ba, B:77:0x01cb, B:76:0x01c3, B:66:0x019e, B:70:0x01af, B:69:0x01a7, B:59:0x0186, B:63:0x0193, B:62:0x018f, B:53:0x0172, B:56:0x017b, B:47:0x015e, B:50:0x0167, B:44:0x0153, B:36:0x0135, B:40:0x0146, B:39:0x013e, B:29:0x0119, B:33:0x012a, B:32:0x0122, B:22:0x0101, B:26:0x010e, B:25:0x010a, B:16:0x00ed, B:19:0x00f6, B:10:0x00d9, B:13:0x00e2), top: B:216:0x0023 }] */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List call() throws Throwable {
        List listN;
        prl prlVarH;
        pop popVarI;
        nmz nmzVarV;
        pop popVarI2;
        pop popVarI3;
        pop popVarI4;
        List listM;
        pti ptiVarC;
        plu pluVarB;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        npk npkVar;
        Long lValueOf;
        prl prlVarH2;
        Long lValueOf2;
        prl prlVarH3;
        Long lValueOf3;
        prl prlVarH4;
        nmr nmrVarJ;
        nnr nnrVarK;
        double d;
        nqa nqaVar = this;
        nqaVar.b.a.h();
        try {
            try {
                Cursor cursorI = fy.i(nqaVar.b.a, nqaVar.a, false);
                try {
                    ArrayList arrayList = new ArrayList(cursorI.getCount());
                    while (cursorI.moveToNext()) {
                        try {
                            int columnIndex = cursorI.getColumnIndex("title");
                            int columnIndex2 = cursorI.getColumnIndex("experienceId");
                            int columnIndex3 = cursorI.getColumnIndex("queryableTags");
                            int columnIndex4 = cursorI.getColumnIndex("queryableEpochTimestamp");
                            int columnIndex5 = cursorI.getColumnIndex("queryableDuration");
                            int columnIndex6 = cursorI.getColumnIndex("approximateTotalSize");
                            int columnIndex7 = cursorI.getColumnIndex("namespaceId");
                            int columnIndex8 = cursorI.getColumnIndex("partitionId");
                            int columnIndex9 = cursorI.getColumnIndex("f250ResourceId");
                            int columnIndex10 = cursorI.getColumnIndex("f250AutoUploadDelay");
                            int columnIndex11 = cursorI.getColumnIndex("airlockExpiration");
                            int columnIndex12 = cursorI.getColumnIndex("f250Expiration");
                            int columnIndex13 = cursorI.getColumnIndex("deleteAirlockFilesOnceUploaded");
                            int columnIndex14 = cursorI.getColumnIndex("nonSignedInDataOwners");
                            ArrayList arrayList2 = arrayList;
                            int columnIndex15 = cursorI.getColumnIndex("overridenObfuscatedGaiaId");
                            int columnIndex16 = cursorI.getColumnIndex("uploadTransferHandle");
                            int columnIndex17 = cursorI.getColumnIndex("relations");
                            int columnIndex18 = cursorI.getColumnIndex("indexTokens");
                            int columnIndex19 = cursorI.getColumnIndex("onDeviceId");
                            int columnIndex20 = cursorI.getColumnIndex("status_addedToAirlockEpochTimestamp");
                            int columnIndex21 = cursorI.getColumnIndex("status_uploadToF250RequestedEpochTimestamp");
                            int columnIndex22 = cursorI.getColumnIndex("status_uploadToF250CompletedEpochTimestamp");
                            int columnIndex23 = cursorI.getColumnIndex("status_airlockFileState");
                            int columnIndex24 = cursorI.getColumnIndex("status_uploadState");
                            int columnIndex25 = cursorI.getColumnIndex("status_uploadProgressPercent");
                            String string = (columnIndex == -1 || cursorI.isNull(columnIndex)) ? null : cursorI.getString(columnIndex);
                            String string2 = (columnIndex2 == -1 || cursorI.isNull(columnIndex2)) ? null : cursorI.getString(columnIndex2);
                            if (columnIndex3 == -1) {
                                listN = null;
                            } else {
                                listN = npy.n(cursorI.isNull(columnIndex3) ? null : cursorI.getString(columnIndex3));
                            }
                            if (columnIndex4 == -1) {
                                prlVarH = null;
                            } else {
                                prlVarH = npy.h(cursorI.isNull(columnIndex4) ? null : Long.valueOf(cursorI.getLong(columnIndex4)));
                            }
                            if (columnIndex5 == -1) {
                                popVarI = null;
                            } else {
                                popVarI = npy.i(cursorI.isNull(columnIndex5) ? null : Long.valueOf(cursorI.getLong(columnIndex5)));
                            }
                            long j = columnIndex6 == -1 ? 0L : cursorI.getLong(columnIndex6);
                            String string3 = (columnIndex7 == -1 || cursorI.isNull(columnIndex7)) ? null : cursorI.getString(columnIndex7);
                            String string4 = (columnIndex8 == -1 || cursorI.isNull(columnIndex8)) ? null : cursorI.getString(columnIndex8);
                            if (columnIndex9 == -1) {
                                nmzVarV = null;
                            } else {
                                nmzVarV = npy.v(cursorI.isNull(columnIndex9) ? null : cursorI.getString(columnIndex9));
                            }
                            if (columnIndex10 == -1) {
                                popVarI2 = null;
                            } else {
                                popVarI2 = npy.i(cursorI.isNull(columnIndex10) ? null : Long.valueOf(cursorI.getLong(columnIndex10)));
                            }
                            if (columnIndex11 == -1) {
                                popVarI3 = null;
                            } else {
                                popVarI3 = npy.i(cursorI.isNull(columnIndex11) ? null : Long.valueOf(cursorI.getLong(columnIndex11)));
                            }
                            if (columnIndex12 == -1) {
                                popVarI4 = null;
                            } else {
                                popVarI4 = npy.i(cursorI.isNull(columnIndex12) ? null : Long.valueOf(cursorI.getLong(columnIndex12)));
                            }
                            boolean z = (columnIndex13 == -1 || cursorI.getInt(columnIndex13) == 0) ? false : true;
                            if (columnIndex14 == -1) {
                                listM = null;
                            } else {
                                listM = npy.m(cursorI.isNull(columnIndex14) ? null : cursorI.getString(columnIndex14));
                            }
                            String string5 = (columnIndex15 == -1 || cursorI.isNull(columnIndex15)) ? null : cursorI.getString(columnIndex15);
                            String string6 = (columnIndex16 == -1 || cursorI.isNull(columnIndex16)) ? null : cursorI.getString(columnIndex16);
                            if (columnIndex17 == -1) {
                                ptiVarC = null;
                            } else {
                                ptiVarC = npy.c(cursorI.isNull(columnIndex17) ? null : cursorI.getBlob(columnIndex17));
                            }
                            if (columnIndex18 == -1) {
                                pluVarB = null;
                            } else {
                                pluVarB = npy.b(cursorI.isNull(columnIndex18) ? null : cursorI.getBlob(columnIndex18));
                            }
                            long j2 = columnIndex19 == -1 ? 0L : cursorI.getLong(columnIndex19);
                            if (columnIndex20 == -1 || cursorI.isNull(columnIndex20)) {
                                i = columnIndex21;
                                if (i == -1 || cursorI.isNull(i)) {
                                    i2 = columnIndex22;
                                    if (i2 == -1 || cursorI.isNull(i2)) {
                                        i3 = columnIndex23;
                                        if (i3 == -1 || cursorI.isNull(i3)) {
                                            i4 = columnIndex24;
                                            if (i4 == -1 || cursorI.isNull(i4)) {
                                                i5 = columnIndex25;
                                                if (i5 == -1 || cursorI.isNull(i5)) {
                                                    npkVar = null;
                                                }
                                                arrayList2.add(new nqh(string, string2, listN, prlVarH, popVarI, j, string3, string4, nmzVarV, popVarI2, popVarI3, popVarI4, z, listM, string5, string6, ptiVarC, pluVarB, npkVar, j2));
                                                arrayList = arrayList2;
                                                nqaVar = this;
                                            }
                                            if (columnIndex20 == -1) {
                                                prlVarH2 = null;
                                            } else {
                                                if (cursorI.isNull(columnIndex20)) {
                                                    lValueOf = null;
                                                } else {
                                                    lValueOf = Long.valueOf(cursorI.getLong(columnIndex20));
                                                }
                                                prlVarH2 = npy.h(lValueOf);
                                            }
                                            if (i == -1) {
                                                prlVarH3 = null;
                                            } else {
                                                if (cursorI.isNull(i)) {
                                                    lValueOf2 = null;
                                                } else {
                                                    lValueOf2 = Long.valueOf(cursorI.getLong(i));
                                                }
                                                prlVarH3 = npy.h(lValueOf2);
                                            }
                                            if (i2 == -1) {
                                                prlVarH4 = null;
                                            } else {
                                                if (cursorI.isNull(i2)) {
                                                    lValueOf3 = null;
                                                } else {
                                                    lValueOf3 = Long.valueOf(cursorI.getLong(i2));
                                                }
                                                prlVarH4 = npy.h(lValueOf3);
                                            }
                                            if (i3 == -1) {
                                                nmrVarJ = null;
                                            } else {
                                                nmrVarJ = npy.j(cursorI.getInt(i3));
                                            }
                                            if (i4 == -1) {
                                                nnrVarK = null;
                                            } else {
                                                nnrVarK = npy.k(cursorI.getInt(i4));
                                            }
                                            if (i5 == -1) {
                                                d = 0.0d;
                                            } else {
                                                d = cursorI.getDouble(i5);
                                            }
                                            npkVar = new npk(prlVarH2, prlVarH3, prlVarH4, nmrVarJ, nnrVarK, d);
                                            arrayList2.add(new nqh(string, string2, listN, prlVarH, popVarI, j, string3, string4, nmzVarV, popVarI2, popVarI3, popVarI4, z, listM, string5, string6, ptiVarC, pluVarB, npkVar, j2));
                                            arrayList = arrayList2;
                                            nqaVar = this;
                                        }
                                        i5 = columnIndex25;
                                        if (columnIndex20 == -1) {
                                            prlVarH2 = null;
                                        } else {
                                            if (cursorI.isNull(columnIndex20)) {
                                                lValueOf = null;
                                            } else {
                                                lValueOf = Long.valueOf(cursorI.getLong(columnIndex20));
                                            }
                                            prlVarH2 = npy.h(lValueOf);
                                        }
                                        if (i == -1) {
                                            prlVarH3 = null;
                                        } else {
                                            if (cursorI.isNull(i)) {
                                                lValueOf2 = null;
                                            } else {
                                                lValueOf2 = Long.valueOf(cursorI.getLong(i));
                                            }
                                            prlVarH3 = npy.h(lValueOf2);
                                        }
                                        if (i2 == -1) {
                                            prlVarH4 = null;
                                        } else {
                                            if (cursorI.isNull(i2)) {
                                                lValueOf3 = null;
                                            } else {
                                                lValueOf3 = Long.valueOf(cursorI.getLong(i2));
                                            }
                                            prlVarH4 = npy.h(lValueOf3);
                                        }
                                        if (i3 == -1) {
                                            nmrVarJ = null;
                                        } else {
                                            nmrVarJ = npy.j(cursorI.getInt(i3));
                                        }
                                        if (i4 == -1) {
                                            nnrVarK = null;
                                        } else {
                                            nnrVarK = npy.k(cursorI.getInt(i4));
                                        }
                                        if (i5 == -1) {
                                            d = 0.0d;
                                        } else {
                                            d = cursorI.getDouble(i5);
                                        }
                                        npkVar = new npk(prlVarH2, prlVarH3, prlVarH4, nmrVarJ, nnrVarK, d);
                                        arrayList2.add(new nqh(string, string2, listN, prlVarH, popVarI, j, string3, string4, nmzVarV, popVarI2, popVarI3, popVarI4, z, listM, string5, string6, ptiVarC, pluVarB, npkVar, j2));
                                        arrayList = arrayList2;
                                        nqaVar = this;
                                    }
                                    i4 = columnIndex24;
                                    i5 = columnIndex25;
                                    if (columnIndex20 == -1) {
                                        prlVarH2 = null;
                                    } else {
                                        if (cursorI.isNull(columnIndex20)) {
                                            lValueOf = null;
                                        } else {
                                            lValueOf = Long.valueOf(cursorI.getLong(columnIndex20));
                                        }
                                        prlVarH2 = npy.h(lValueOf);
                                    }
                                    if (i == -1) {
                                        prlVarH3 = null;
                                    } else {
                                        if (cursorI.isNull(i)) {
                                            lValueOf2 = null;
                                        } else {
                                            lValueOf2 = Long.valueOf(cursorI.getLong(i));
                                        }
                                        prlVarH3 = npy.h(lValueOf2);
                                    }
                                    if (i2 == -1) {
                                        prlVarH4 = null;
                                    } else {
                                        if (cursorI.isNull(i2)) {
                                            lValueOf3 = null;
                                        } else {
                                            lValueOf3 = Long.valueOf(cursorI.getLong(i2));
                                        }
                                        prlVarH4 = npy.h(lValueOf3);
                                    }
                                    if (i3 == -1) {
                                        nmrVarJ = null;
                                    } else {
                                        nmrVarJ = npy.j(cursorI.getInt(i3));
                                    }
                                    if (i4 == -1) {
                                        nnrVarK = null;
                                    } else {
                                        nnrVarK = npy.k(cursorI.getInt(i4));
                                    }
                                    if (i5 == -1) {
                                        d = 0.0d;
                                    } else {
                                        d = cursorI.getDouble(i5);
                                    }
                                    npkVar = new npk(prlVarH2, prlVarH3, prlVarH4, nmrVarJ, nnrVarK, d);
                                    arrayList2.add(new nqh(string, string2, listN, prlVarH, popVarI, j, string3, string4, nmzVarV, popVarI2, popVarI3, popVarI4, z, listM, string5, string6, ptiVarC, pluVarB, npkVar, j2));
                                    arrayList = arrayList2;
                                    nqaVar = this;
                                }
                                i3 = columnIndex23;
                                i4 = columnIndex24;
                                i5 = columnIndex25;
                                if (columnIndex20 == -1) {
                                    prlVarH2 = null;
                                } else {
                                    if (cursorI.isNull(columnIndex20)) {
                                        lValueOf = null;
                                    } else {
                                        lValueOf = Long.valueOf(cursorI.getLong(columnIndex20));
                                    }
                                    prlVarH2 = npy.h(lValueOf);
                                }
                                if (i == -1) {
                                    prlVarH3 = null;
                                } else {
                                    if (cursorI.isNull(i)) {
                                        lValueOf2 = null;
                                    } else {
                                        lValueOf2 = Long.valueOf(cursorI.getLong(i));
                                    }
                                    prlVarH3 = npy.h(lValueOf2);
                                }
                                if (i2 == -1) {
                                    prlVarH4 = null;
                                } else {
                                    if (cursorI.isNull(i2)) {
                                        lValueOf3 = null;
                                    } else {
                                        lValueOf3 = Long.valueOf(cursorI.getLong(i2));
                                    }
                                    prlVarH4 = npy.h(lValueOf3);
                                }
                                if (i3 == -1) {
                                    nmrVarJ = null;
                                } else {
                                    nmrVarJ = npy.j(cursorI.getInt(i3));
                                }
                                if (i4 == -1) {
                                    nnrVarK = null;
                                } else {
                                    nnrVarK = npy.k(cursorI.getInt(i4));
                                }
                                if (i5 == -1) {
                                    d = 0.0d;
                                } else {
                                    d = cursorI.getDouble(i5);
                                }
                                npkVar = new npk(prlVarH2, prlVarH3, prlVarH4, nmrVarJ, nnrVarK, d);
                                arrayList2.add(new nqh(string, string2, listN, prlVarH, popVarI, j, string3, string4, nmzVarV, popVarI2, popVarI3, popVarI4, z, listM, string5, string6, ptiVarC, pluVarB, npkVar, j2));
                                arrayList = arrayList2;
                                nqaVar = this;
                            } else {
                                i = columnIndex21;
                            }
                            i2 = columnIndex22;
                            i3 = columnIndex23;
                            i4 = columnIndex24;
                            i5 = columnIndex25;
                            if (columnIndex20 == -1) {
                                prlVarH2 = null;
                            } else {
                                if (cursorI.isNull(columnIndex20)) {
                                    lValueOf = null;
                                } else {
                                    lValueOf = Long.valueOf(cursorI.getLong(columnIndex20));
                                }
                                prlVarH2 = npy.h(lValueOf);
                            }
                            if (i == -1) {
                                prlVarH3 = null;
                            } else {
                                if (cursorI.isNull(i)) {
                                    lValueOf2 = null;
                                } else {
                                    lValueOf2 = Long.valueOf(cursorI.getLong(i));
                                }
                                prlVarH3 = npy.h(lValueOf2);
                            }
                            if (i2 == -1) {
                                prlVarH4 = null;
                            } else {
                                if (cursorI.isNull(i2)) {
                                    lValueOf3 = null;
                                } else {
                                    lValueOf3 = Long.valueOf(cursorI.getLong(i2));
                                }
                                prlVarH4 = npy.h(lValueOf3);
                            }
                            if (i3 == -1) {
                                nmrVarJ = null;
                            } else {
                                nmrVarJ = npy.j(cursorI.getInt(i3));
                            }
                            if (i4 == -1) {
                                nnrVarK = null;
                            } else {
                                nnrVarK = npy.k(cursorI.getInt(i4));
                            }
                            if (i5 == -1) {
                                d = 0.0d;
                            } else {
                                d = cursorI.getDouble(i5);
                            }
                            npkVar = new npk(prlVarH2, prlVarH3, prlVarH4, nmrVarJ, nnrVarK, d);
                            arrayList2.add(new nqh(string, string2, listN, prlVarH, popVarI, j, string3, string4, nmzVarV, popVarI2, popVarI3, popVarI4, z, listM, string5, string6, ptiVarC, pluVarB, npkVar, j2));
                            arrayList = arrayList2;
                            nqaVar = this;
                        } catch (Throwable th) {
                            th = th;
                            cursorI.close();
                            throw th;
                        }
                    }
                    ArrayList arrayList3 = arrayList;
                    try {
                        this.b.a.j();
                        cursorI.close();
                        this.b.a.i();
                        return arrayList3;
                    } catch (Throwable th2) {
                        th = th2;
                        cursorI.close();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                nqaVar.b.a.i();
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            nqaVar.b.a.i();
            throw th;
        }
    }
}

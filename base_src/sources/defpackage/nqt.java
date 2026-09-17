package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class nqt implements Callable {
    final /* synthetic */ ais a;
    final /* synthetic */ nqu b;

    public nqt(nqu nquVar, ais aisVar) {
        this.b = nquVar;
        this.a = aisVar;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0264  */
    /* JADX WARN: Code duplicated, block: B:103:0x0267 A[Catch: all -> 0x03e7, TryCatch #1 {all -> 0x03e7, blocks: (B:13:0x0106, B:15:0x010c, B:17:0x0112, B:19:0x0118, B:21:0x011e, B:23:0x0124, B:25:0x012a, B:27:0x0130, B:29:0x0136, B:31:0x013c, B:33:0x0142, B:35:0x0148, B:37:0x0150, B:39:0x0158, B:41:0x0160, B:43:0x016a, B:45:0x0174, B:47:0x017e, B:49:0x0188, B:51:0x0192, B:53:0x019c, B:55:0x01a6, B:57:0x01b0, B:59:0x01ba, B:61:0x01c4, B:80:0x0204, B:84:0x0213, B:88:0x0222, B:92:0x022e, B:96:0x0242, B:100:0x0256, B:104:0x026d, B:108:0x027c, B:112:0x0288, B:116:0x029c, B:120:0x02b0, B:124:0x02c4, B:128:0x02d4, B:132:0x02e0, B:136:0x02f5, B:140:0x0306, B:144:0x0314, B:148:0x0326, B:150:0x0338, B:152:0x0340, B:154:0x0348, B:156:0x0350, B:158:0x0358, B:179:0x03c2, B:180:0x03c9, B:182:0x03db, B:183:0x03e0, B:166:0x036a, B:170:0x037a, B:174:0x038e, B:178:0x03a2, B:177:0x039a, B:173:0x0386, B:169:0x0372, B:147:0x0322, B:143:0x0310, B:139:0x0300, B:135:0x02ef, B:131:0x02dc, B:123:0x02bc, B:119:0x02a8, B:115:0x0294, B:111:0x0284, B:107:0x0276, B:103:0x0267, B:99:0x024e, B:95:0x023a, B:91:0x022a, B:87:0x021c, B:83:0x020d), top: B:202:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0273  */
    /* JADX WARN: Code duplicated, block: B:107:0x0276 A[Catch: all -> 0x03e7, TryCatch #1 {all -> 0x03e7, blocks: (B:13:0x0106, B:15:0x010c, B:17:0x0112, B:19:0x0118, B:21:0x011e, B:23:0x0124, B:25:0x012a, B:27:0x0130, B:29:0x0136, B:31:0x013c, B:33:0x0142, B:35:0x0148, B:37:0x0150, B:39:0x0158, B:41:0x0160, B:43:0x016a, B:45:0x0174, B:47:0x017e, B:49:0x0188, B:51:0x0192, B:53:0x019c, B:55:0x01a6, B:57:0x01b0, B:59:0x01ba, B:61:0x01c4, B:80:0x0204, B:84:0x0213, B:88:0x0222, B:92:0x022e, B:96:0x0242, B:100:0x0256, B:104:0x026d, B:108:0x027c, B:112:0x0288, B:116:0x029c, B:120:0x02b0, B:124:0x02c4, B:128:0x02d4, B:132:0x02e0, B:136:0x02f5, B:140:0x0306, B:144:0x0314, B:148:0x0326, B:150:0x0338, B:152:0x0340, B:154:0x0348, B:156:0x0350, B:158:0x0358, B:179:0x03c2, B:180:0x03c9, B:182:0x03db, B:183:0x03e0, B:166:0x036a, B:170:0x037a, B:174:0x038e, B:178:0x03a2, B:177:0x039a, B:173:0x0386, B:169:0x0372, B:147:0x0322, B:143:0x0310, B:139:0x0300, B:135:0x02ef, B:131:0x02dc, B:123:0x02bc, B:119:0x02a8, B:115:0x0294, B:111:0x0284, B:107:0x0276, B:103:0x0267, B:99:0x024e, B:95:0x023a, B:91:0x022a, B:87:0x021c, B:83:0x020d), top: B:202:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0282  */
    /* JADX WARN: Code duplicated, block: B:111:0x0284 A[Catch: all -> 0x03e7, TryCatch #1 {all -> 0x03e7, blocks: (B:13:0x0106, B:15:0x010c, B:17:0x0112, B:19:0x0118, B:21:0x011e, B:23:0x0124, B:25:0x012a, B:27:0x0130, B:29:0x0136, B:31:0x013c, B:33:0x0142, B:35:0x0148, B:37:0x0150, B:39:0x0158, B:41:0x0160, B:43:0x016a, B:45:0x0174, B:47:0x017e, B:49:0x0188, B:51:0x0192, B:53:0x019c, B:55:0x01a6, B:57:0x01b0, B:59:0x01ba, B:61:0x01c4, B:80:0x0204, B:84:0x0213, B:88:0x0222, B:92:0x022e, B:96:0x0242, B:100:0x0256, B:104:0x026d, B:108:0x027c, B:112:0x0288, B:116:0x029c, B:120:0x02b0, B:124:0x02c4, B:128:0x02d4, B:132:0x02e0, B:136:0x02f5, B:140:0x0306, B:144:0x0314, B:148:0x0326, B:150:0x0338, B:152:0x0340, B:154:0x0348, B:156:0x0350, B:158:0x0358, B:179:0x03c2, B:180:0x03c9, B:182:0x03db, B:183:0x03e0, B:166:0x036a, B:170:0x037a, B:174:0x038e, B:178:0x03a2, B:177:0x039a, B:173:0x0386, B:169:0x0372, B:147:0x0322, B:143:0x0310, B:139:0x0300, B:135:0x02ef, B:131:0x02dc, B:123:0x02bc, B:119:0x02a8, B:115:0x0294, B:111:0x0284, B:107:0x0276, B:103:0x0267, B:99:0x024e, B:95:0x023a, B:91:0x022a, B:87:0x021c, B:83:0x020d), top: B:202:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x0292  */
    /* JADX WARN: Code duplicated, block: B:115:0x0294 A[Catch: all -> 0x03e7, TryCatch #1 {all -> 0x03e7, blocks: (B:13:0x0106, B:15:0x010c, B:17:0x0112, B:19:0x0118, B:21:0x011e, B:23:0x0124, B:25:0x012a, B:27:0x0130, B:29:0x0136, B:31:0x013c, B:33:0x0142, B:35:0x0148, B:37:0x0150, B:39:0x0158, B:41:0x0160, B:43:0x016a, B:45:0x0174, B:47:0x017e, B:49:0x0188, B:51:0x0192, B:53:0x019c, B:55:0x01a6, B:57:0x01b0, B:59:0x01ba, B:61:0x01c4, B:80:0x0204, B:84:0x0213, B:88:0x0222, B:92:0x022e, B:96:0x0242, B:100:0x0256, B:104:0x026d, B:108:0x027c, B:112:0x0288, B:116:0x029c, B:120:0x02b0, B:124:0x02c4, B:128:0x02d4, B:132:0x02e0, B:136:0x02f5, B:140:0x0306, B:144:0x0314, B:148:0x0326, B:150:0x0338, B:152:0x0340, B:154:0x0348, B:156:0x0350, B:158:0x0358, B:179:0x03c2, B:180:0x03c9, B:182:0x03db, B:183:0x03e0, B:166:0x036a, B:170:0x037a, B:174:0x038e, B:178:0x03a2, B:177:0x039a, B:173:0x0386, B:169:0x0372, B:147:0x0322, B:143:0x0310, B:139:0x0300, B:135:0x02ef, B:131:0x02dc, B:123:0x02bc, B:119:0x02a8, B:115:0x0294, B:111:0x0284, B:107:0x0276, B:103:0x0267, B:99:0x024e, B:95:0x023a, B:91:0x022a, B:87:0x021c, B:83:0x020d), top: B:202:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:119:0x02a8 A[Catch: all -> 0x03e7, TryCatch #1 {all -> 0x03e7, blocks: (B:13:0x0106, B:15:0x010c, B:17:0x0112, B:19:0x0118, B:21:0x011e, B:23:0x0124, B:25:0x012a, B:27:0x0130, B:29:0x0136, B:31:0x013c, B:33:0x0142, B:35:0x0148, B:37:0x0150, B:39:0x0158, B:41:0x0160, B:43:0x016a, B:45:0x0174, B:47:0x017e, B:49:0x0188, B:51:0x0192, B:53:0x019c, B:55:0x01a6, B:57:0x01b0, B:59:0x01ba, B:61:0x01c4, B:80:0x0204, B:84:0x0213, B:88:0x0222, B:92:0x022e, B:96:0x0242, B:100:0x0256, B:104:0x026d, B:108:0x027c, B:112:0x0288, B:116:0x029c, B:120:0x02b0, B:124:0x02c4, B:128:0x02d4, B:132:0x02e0, B:136:0x02f5, B:140:0x0306, B:144:0x0314, B:148:0x0326, B:150:0x0338, B:152:0x0340, B:154:0x0348, B:156:0x0350, B:158:0x0358, B:179:0x03c2, B:180:0x03c9, B:182:0x03db, B:183:0x03e0, B:166:0x036a, B:170:0x037a, B:174:0x038e, B:178:0x03a2, B:177:0x039a, B:173:0x0386, B:169:0x0372, B:147:0x0322, B:143:0x0310, B:139:0x0300, B:135:0x02ef, B:131:0x02dc, B:123:0x02bc, B:119:0x02a8, B:115:0x0294, B:111:0x0284, B:107:0x0276, B:103:0x0267, B:99:0x024e, B:95:0x023a, B:91:0x022a, B:87:0x021c, B:83:0x020d), top: B:202:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:123:0x02bc A[Catch: all -> 0x03e7, TryCatch #1 {all -> 0x03e7, blocks: (B:13:0x0106, B:15:0x010c, B:17:0x0112, B:19:0x0118, B:21:0x011e, B:23:0x0124, B:25:0x012a, B:27:0x0130, B:29:0x0136, B:31:0x013c, B:33:0x0142, B:35:0x0148, B:37:0x0150, B:39:0x0158, B:41:0x0160, B:43:0x016a, B:45:0x0174, B:47:0x017e, B:49:0x0188, B:51:0x0192, B:53:0x019c, B:55:0x01a6, B:57:0x01b0, B:59:0x01ba, B:61:0x01c4, B:80:0x0204, B:84:0x0213, B:88:0x0222, B:92:0x022e, B:96:0x0242, B:100:0x0256, B:104:0x026d, B:108:0x027c, B:112:0x0288, B:116:0x029c, B:120:0x02b0, B:124:0x02c4, B:128:0x02d4, B:132:0x02e0, B:136:0x02f5, B:140:0x0306, B:144:0x0314, B:148:0x0326, B:150:0x0338, B:152:0x0340, B:154:0x0348, B:156:0x0350, B:158:0x0358, B:179:0x03c2, B:180:0x03c9, B:182:0x03db, B:183:0x03e0, B:166:0x036a, B:170:0x037a, B:174:0x038e, B:178:0x03a2, B:177:0x039a, B:173:0x0386, B:169:0x0372, B:147:0x0322, B:143:0x0310, B:139:0x0300, B:135:0x02ef, B:131:0x02dc, B:123:0x02bc, B:119:0x02a8, B:115:0x0294, B:111:0x0284, B:107:0x0276, B:103:0x0267, B:99:0x024e, B:95:0x023a, B:91:0x022a, B:87:0x021c, B:83:0x020d), top: B:202:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:127:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:130:0x02da  */
    /* JADX WARN: Code duplicated, block: B:131:0x02dc A[Catch: all -> 0x03e7, TryCatch #1 {all -> 0x03e7, blocks: (B:13:0x0106, B:15:0x010c, B:17:0x0112, B:19:0x0118, B:21:0x011e, B:23:0x0124, B:25:0x012a, B:27:0x0130, B:29:0x0136, B:31:0x013c, B:33:0x0142, B:35:0x0148, B:37:0x0150, B:39:0x0158, B:41:0x0160, B:43:0x016a, B:45:0x0174, B:47:0x017e, B:49:0x0188, B:51:0x0192, B:53:0x019c, B:55:0x01a6, B:57:0x01b0, B:59:0x01ba, B:61:0x01c4, B:80:0x0204, B:84:0x0213, B:88:0x0222, B:92:0x022e, B:96:0x0242, B:100:0x0256, B:104:0x026d, B:108:0x027c, B:112:0x0288, B:116:0x029c, B:120:0x02b0, B:124:0x02c4, B:128:0x02d4, B:132:0x02e0, B:136:0x02f5, B:140:0x0306, B:144:0x0314, B:148:0x0326, B:150:0x0338, B:152:0x0340, B:154:0x0348, B:156:0x0350, B:158:0x0358, B:179:0x03c2, B:180:0x03c9, B:182:0x03db, B:183:0x03e0, B:166:0x036a, B:170:0x037a, B:174:0x038e, B:178:0x03a2, B:177:0x039a, B:173:0x0386, B:169:0x0372, B:147:0x0322, B:143:0x0310, B:139:0x0300, B:135:0x02ef, B:131:0x02dc, B:123:0x02bc, B:119:0x02a8, B:115:0x0294, B:111:0x0284, B:107:0x0276, B:103:0x0267, B:99:0x024e, B:95:0x023a, B:91:0x022a, B:87:0x021c, B:83:0x020d), top: B:202:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:135:0x02ef A[Catch: all -> 0x03e7, TryCatch #1 {all -> 0x03e7, blocks: (B:13:0x0106, B:15:0x010c, B:17:0x0112, B:19:0x0118, B:21:0x011e, B:23:0x0124, B:25:0x012a, B:27:0x0130, B:29:0x0136, B:31:0x013c, B:33:0x0142, B:35:0x0148, B:37:0x0150, B:39:0x0158, B:41:0x0160, B:43:0x016a, B:45:0x0174, B:47:0x017e, B:49:0x0188, B:51:0x0192, B:53:0x019c, B:55:0x01a6, B:57:0x01b0, B:59:0x01ba, B:61:0x01c4, B:80:0x0204, B:84:0x0213, B:88:0x0222, B:92:0x022e, B:96:0x0242, B:100:0x0256, B:104:0x026d, B:108:0x027c, B:112:0x0288, B:116:0x029c, B:120:0x02b0, B:124:0x02c4, B:128:0x02d4, B:132:0x02e0, B:136:0x02f5, B:140:0x0306, B:144:0x0314, B:148:0x0326, B:150:0x0338, B:152:0x0340, B:154:0x0348, B:156:0x0350, B:158:0x0358, B:179:0x03c2, B:180:0x03c9, B:182:0x03db, B:183:0x03e0, B:166:0x036a, B:170:0x037a, B:174:0x038e, B:178:0x03a2, B:177:0x039a, B:173:0x0386, B:169:0x0372, B:147:0x0322, B:143:0x0310, B:139:0x0300, B:135:0x02ef, B:131:0x02dc, B:123:0x02bc, B:119:0x02a8, B:115:0x0294, B:111:0x0284, B:107:0x0276, B:103:0x0267, B:99:0x024e, B:95:0x023a, B:91:0x022a, B:87:0x021c, B:83:0x020d), top: B:202:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:139:0x0300 A[Catch: all -> 0x03e7, TryCatch #1 {all -> 0x03e7, blocks: (B:13:0x0106, B:15:0x010c, B:17:0x0112, B:19:0x0118, B:21:0x011e, B:23:0x0124, B:25:0x012a, B:27:0x0130, B:29:0x0136, B:31:0x013c, B:33:0x0142, B:35:0x0148, B:37:0x0150, B:39:0x0158, B:41:0x0160, B:43:0x016a, B:45:0x0174, B:47:0x017e, B:49:0x0188, B:51:0x0192, B:53:0x019c, B:55:0x01a6, B:57:0x01b0, B:59:0x01ba, B:61:0x01c4, B:80:0x0204, B:84:0x0213, B:88:0x0222, B:92:0x022e, B:96:0x0242, B:100:0x0256, B:104:0x026d, B:108:0x027c, B:112:0x0288, B:116:0x029c, B:120:0x02b0, B:124:0x02c4, B:128:0x02d4, B:132:0x02e0, B:136:0x02f5, B:140:0x0306, B:144:0x0314, B:148:0x0326, B:150:0x0338, B:152:0x0340, B:154:0x0348, B:156:0x0350, B:158:0x0358, B:179:0x03c2, B:180:0x03c9, B:182:0x03db, B:183:0x03e0, B:166:0x036a, B:170:0x037a, B:174:0x038e, B:178:0x03a2, B:177:0x039a, B:173:0x0386, B:169:0x0372, B:147:0x0322, B:143:0x0310, B:139:0x0300, B:135:0x02ef, B:131:0x02dc, B:123:0x02bc, B:119:0x02a8, B:115:0x0294, B:111:0x0284, B:107:0x0276, B:103:0x0267, B:99:0x024e, B:95:0x023a, B:91:0x022a, B:87:0x021c, B:83:0x020d), top: B:202:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x030e  */
    /* JADX WARN: Code duplicated, block: B:143:0x0310 A[Catch: all -> 0x03e7, TryCatch #1 {all -> 0x03e7, blocks: (B:13:0x0106, B:15:0x010c, B:17:0x0112, B:19:0x0118, B:21:0x011e, B:23:0x0124, B:25:0x012a, B:27:0x0130, B:29:0x0136, B:31:0x013c, B:33:0x0142, B:35:0x0148, B:37:0x0150, B:39:0x0158, B:41:0x0160, B:43:0x016a, B:45:0x0174, B:47:0x017e, B:49:0x0188, B:51:0x0192, B:53:0x019c, B:55:0x01a6, B:57:0x01b0, B:59:0x01ba, B:61:0x01c4, B:80:0x0204, B:84:0x0213, B:88:0x0222, B:92:0x022e, B:96:0x0242, B:100:0x0256, B:104:0x026d, B:108:0x027c, B:112:0x0288, B:116:0x029c, B:120:0x02b0, B:124:0x02c4, B:128:0x02d4, B:132:0x02e0, B:136:0x02f5, B:140:0x0306, B:144:0x0314, B:148:0x0326, B:150:0x0338, B:152:0x0340, B:154:0x0348, B:156:0x0350, B:158:0x0358, B:179:0x03c2, B:180:0x03c9, B:182:0x03db, B:183:0x03e0, B:166:0x036a, B:170:0x037a, B:174:0x038e, B:178:0x03a2, B:177:0x039a, B:173:0x0386, B:169:0x0372, B:147:0x0322, B:143:0x0310, B:139:0x0300, B:135:0x02ef, B:131:0x02dc, B:123:0x02bc, B:119:0x02a8, B:115:0x0294, B:111:0x0284, B:107:0x0276, B:103:0x0267, B:99:0x024e, B:95:0x023a, B:91:0x022a, B:87:0x021c, B:83:0x020d), top: B:202:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x0320  */
    /* JADX WARN: Code duplicated, block: B:147:0x0322 A[Catch: all -> 0x03e7, TryCatch #1 {all -> 0x03e7, blocks: (B:13:0x0106, B:15:0x010c, B:17:0x0112, B:19:0x0118, B:21:0x011e, B:23:0x0124, B:25:0x012a, B:27:0x0130, B:29:0x0136, B:31:0x013c, B:33:0x0142, B:35:0x0148, B:37:0x0150, B:39:0x0158, B:41:0x0160, B:43:0x016a, B:45:0x0174, B:47:0x017e, B:49:0x0188, B:51:0x0192, B:53:0x019c, B:55:0x01a6, B:57:0x01b0, B:59:0x01ba, B:61:0x01c4, B:80:0x0204, B:84:0x0213, B:88:0x0222, B:92:0x022e, B:96:0x0242, B:100:0x0256, B:104:0x026d, B:108:0x027c, B:112:0x0288, B:116:0x029c, B:120:0x02b0, B:124:0x02c4, B:128:0x02d4, B:132:0x02e0, B:136:0x02f5, B:140:0x0306, B:144:0x0314, B:148:0x0326, B:150:0x0338, B:152:0x0340, B:154:0x0348, B:156:0x0350, B:158:0x0358, B:179:0x03c2, B:180:0x03c9, B:182:0x03db, B:183:0x03e0, B:166:0x036a, B:170:0x037a, B:174:0x038e, B:178:0x03a2, B:177:0x039a, B:173:0x0386, B:169:0x0372, B:147:0x0322, B:143:0x0310, B:139:0x0300, B:135:0x02ef, B:131:0x02dc, B:123:0x02bc, B:119:0x02a8, B:115:0x0294, B:111:0x0284, B:107:0x0276, B:103:0x0267, B:99:0x024e, B:95:0x023a, B:91:0x022a, B:87:0x021c, B:83:0x020d), top: B:202:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x0338 A[Catch: all -> 0x03e7, TryCatch #1 {all -> 0x03e7, blocks: (B:13:0x0106, B:15:0x010c, B:17:0x0112, B:19:0x0118, B:21:0x011e, B:23:0x0124, B:25:0x012a, B:27:0x0130, B:29:0x0136, B:31:0x013c, B:33:0x0142, B:35:0x0148, B:37:0x0150, B:39:0x0158, B:41:0x0160, B:43:0x016a, B:45:0x0174, B:47:0x017e, B:49:0x0188, B:51:0x0192, B:53:0x019c, B:55:0x01a6, B:57:0x01b0, B:59:0x01ba, B:61:0x01c4, B:80:0x0204, B:84:0x0213, B:88:0x0222, B:92:0x022e, B:96:0x0242, B:100:0x0256, B:104:0x026d, B:108:0x027c, B:112:0x0288, B:116:0x029c, B:120:0x02b0, B:124:0x02c4, B:128:0x02d4, B:132:0x02e0, B:136:0x02f5, B:140:0x0306, B:144:0x0314, B:148:0x0326, B:150:0x0338, B:152:0x0340, B:154:0x0348, B:156:0x0350, B:158:0x0358, B:179:0x03c2, B:180:0x03c9, B:182:0x03db, B:183:0x03e0, B:166:0x036a, B:170:0x037a, B:174:0x038e, B:178:0x03a2, B:177:0x039a, B:173:0x0386, B:169:0x0372, B:147:0x0322, B:143:0x0310, B:139:0x0300, B:135:0x02ef, B:131:0x02dc, B:123:0x02bc, B:119:0x02a8, B:115:0x0294, B:111:0x0284, B:107:0x0276, B:103:0x0267, B:99:0x024e, B:95:0x023a, B:91:0x022a, B:87:0x021c, B:83:0x020d), top: B:202:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0340 A[Catch: all -> 0x03e7, TryCatch #1 {all -> 0x03e7, blocks: (B:13:0x0106, B:15:0x010c, B:17:0x0112, B:19:0x0118, B:21:0x011e, B:23:0x0124, B:25:0x012a, B:27:0x0130, B:29:0x0136, B:31:0x013c, B:33:0x0142, B:35:0x0148, B:37:0x0150, B:39:0x0158, B:41:0x0160, B:43:0x016a, B:45:0x0174, B:47:0x017e, B:49:0x0188, B:51:0x0192, B:53:0x019c, B:55:0x01a6, B:57:0x01b0, B:59:0x01ba, B:61:0x01c4, B:80:0x0204, B:84:0x0213, B:88:0x0222, B:92:0x022e, B:96:0x0242, B:100:0x0256, B:104:0x026d, B:108:0x027c, B:112:0x0288, B:116:0x029c, B:120:0x02b0, B:124:0x02c4, B:128:0x02d4, B:132:0x02e0, B:136:0x02f5, B:140:0x0306, B:144:0x0314, B:148:0x0326, B:150:0x0338, B:152:0x0340, B:154:0x0348, B:156:0x0350, B:158:0x0358, B:179:0x03c2, B:180:0x03c9, B:182:0x03db, B:183:0x03e0, B:166:0x036a, B:170:0x037a, B:174:0x038e, B:178:0x03a2, B:177:0x039a, B:173:0x0386, B:169:0x0372, B:147:0x0322, B:143:0x0310, B:139:0x0300, B:135:0x02ef, B:131:0x02dc, B:123:0x02bc, B:119:0x02a8, B:115:0x0294, B:111:0x0284, B:107:0x0276, B:103:0x0267, B:99:0x024e, B:95:0x023a, B:91:0x022a, B:87:0x021c, B:83:0x020d), top: B:202:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x0348 A[Catch: all -> 0x03e7, TryCatch #1 {all -> 0x03e7, blocks: (B:13:0x0106, B:15:0x010c, B:17:0x0112, B:19:0x0118, B:21:0x011e, B:23:0x0124, B:25:0x012a, B:27:0x0130, B:29:0x0136, B:31:0x013c, B:33:0x0142, B:35:0x0148, B:37:0x0150, B:39:0x0158, B:41:0x0160, B:43:0x016a, B:45:0x0174, B:47:0x017e, B:49:0x0188, B:51:0x0192, B:53:0x019c, B:55:0x01a6, B:57:0x01b0, B:59:0x01ba, B:61:0x01c4, B:80:0x0204, B:84:0x0213, B:88:0x0222, B:92:0x022e, B:96:0x0242, B:100:0x0256, B:104:0x026d, B:108:0x027c, B:112:0x0288, B:116:0x029c, B:120:0x02b0, B:124:0x02c4, B:128:0x02d4, B:132:0x02e0, B:136:0x02f5, B:140:0x0306, B:144:0x0314, B:148:0x0326, B:150:0x0338, B:152:0x0340, B:154:0x0348, B:156:0x0350, B:158:0x0358, B:179:0x03c2, B:180:0x03c9, B:182:0x03db, B:183:0x03e0, B:166:0x036a, B:170:0x037a, B:174:0x038e, B:178:0x03a2, B:177:0x039a, B:173:0x0386, B:169:0x0372, B:147:0x0322, B:143:0x0310, B:139:0x0300, B:135:0x02ef, B:131:0x02dc, B:123:0x02bc, B:119:0x02a8, B:115:0x0294, B:111:0x0284, B:107:0x0276, B:103:0x0267, B:99:0x024e, B:95:0x023a, B:91:0x022a, B:87:0x021c, B:83:0x020d), top: B:202:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x0350 A[Catch: all -> 0x03e7, TryCatch #1 {all -> 0x03e7, blocks: (B:13:0x0106, B:15:0x010c, B:17:0x0112, B:19:0x0118, B:21:0x011e, B:23:0x0124, B:25:0x012a, B:27:0x0130, B:29:0x0136, B:31:0x013c, B:33:0x0142, B:35:0x0148, B:37:0x0150, B:39:0x0158, B:41:0x0160, B:43:0x016a, B:45:0x0174, B:47:0x017e, B:49:0x0188, B:51:0x0192, B:53:0x019c, B:55:0x01a6, B:57:0x01b0, B:59:0x01ba, B:61:0x01c4, B:80:0x0204, B:84:0x0213, B:88:0x0222, B:92:0x022e, B:96:0x0242, B:100:0x0256, B:104:0x026d, B:108:0x027c, B:112:0x0288, B:116:0x029c, B:120:0x02b0, B:124:0x02c4, B:128:0x02d4, B:132:0x02e0, B:136:0x02f5, B:140:0x0306, B:144:0x0314, B:148:0x0326, B:150:0x0338, B:152:0x0340, B:154:0x0348, B:156:0x0350, B:158:0x0358, B:179:0x03c2, B:180:0x03c9, B:182:0x03db, B:183:0x03e0, B:166:0x036a, B:170:0x037a, B:174:0x038e, B:178:0x03a2, B:177:0x039a, B:173:0x0386, B:169:0x0372, B:147:0x0322, B:143:0x0310, B:139:0x0300, B:135:0x02ef, B:131:0x02dc, B:123:0x02bc, B:119:0x02a8, B:115:0x0294, B:111:0x0284, B:107:0x0276, B:103:0x0267, B:99:0x024e, B:95:0x023a, B:91:0x022a, B:87:0x021c, B:83:0x020d), top: B:202:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x0358 A[Catch: all -> 0x03e7, TryCatch #1 {all -> 0x03e7, blocks: (B:13:0x0106, B:15:0x010c, B:17:0x0112, B:19:0x0118, B:21:0x011e, B:23:0x0124, B:25:0x012a, B:27:0x0130, B:29:0x0136, B:31:0x013c, B:33:0x0142, B:35:0x0148, B:37:0x0150, B:39:0x0158, B:41:0x0160, B:43:0x016a, B:45:0x0174, B:47:0x017e, B:49:0x0188, B:51:0x0192, B:53:0x019c, B:55:0x01a6, B:57:0x01b0, B:59:0x01ba, B:61:0x01c4, B:80:0x0204, B:84:0x0213, B:88:0x0222, B:92:0x022e, B:96:0x0242, B:100:0x0256, B:104:0x026d, B:108:0x027c, B:112:0x0288, B:116:0x029c, B:120:0x02b0, B:124:0x02c4, B:128:0x02d4, B:132:0x02e0, B:136:0x02f5, B:140:0x0306, B:144:0x0314, B:148:0x0326, B:150:0x0338, B:152:0x0340, B:154:0x0348, B:156:0x0350, B:158:0x0358, B:179:0x03c2, B:180:0x03c9, B:182:0x03db, B:183:0x03e0, B:166:0x036a, B:170:0x037a, B:174:0x038e, B:178:0x03a2, B:177:0x039a, B:173:0x0386, B:169:0x0372, B:147:0x0322, B:143:0x0310, B:139:0x0300, B:135:0x02ef, B:131:0x02dc, B:123:0x02bc, B:119:0x02a8, B:115:0x0294, B:111:0x0284, B:107:0x0276, B:103:0x0267, B:99:0x024e, B:95:0x023a, B:91:0x022a, B:87:0x021c, B:83:0x020d), top: B:202:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x0362  */
    /* JADX WARN: Code duplicated, block: B:168:0x0370  */
    /* JADX WARN: Code duplicated, block: B:169:0x0372 A[Catch: all -> 0x03e7, TryCatch #1 {all -> 0x03e7, blocks: (B:13:0x0106, B:15:0x010c, B:17:0x0112, B:19:0x0118, B:21:0x011e, B:23:0x0124, B:25:0x012a, B:27:0x0130, B:29:0x0136, B:31:0x013c, B:33:0x0142, B:35:0x0148, B:37:0x0150, B:39:0x0158, B:41:0x0160, B:43:0x016a, B:45:0x0174, B:47:0x017e, B:49:0x0188, B:51:0x0192, B:53:0x019c, B:55:0x01a6, B:57:0x01b0, B:59:0x01ba, B:61:0x01c4, B:80:0x0204, B:84:0x0213, B:88:0x0222, B:92:0x022e, B:96:0x0242, B:100:0x0256, B:104:0x026d, B:108:0x027c, B:112:0x0288, B:116:0x029c, B:120:0x02b0, B:124:0x02c4, B:128:0x02d4, B:132:0x02e0, B:136:0x02f5, B:140:0x0306, B:144:0x0314, B:148:0x0326, B:150:0x0338, B:152:0x0340, B:154:0x0348, B:156:0x0350, B:158:0x0358, B:179:0x03c2, B:180:0x03c9, B:182:0x03db, B:183:0x03e0, B:166:0x036a, B:170:0x037a, B:174:0x038e, B:178:0x03a2, B:177:0x039a, B:173:0x0386, B:169:0x0372, B:147:0x0322, B:143:0x0310, B:139:0x0300, B:135:0x02ef, B:131:0x02dc, B:123:0x02bc, B:119:0x02a8, B:115:0x0294, B:111:0x0284, B:107:0x0276, B:103:0x0267, B:99:0x024e, B:95:0x023a, B:91:0x022a, B:87:0x021c, B:83:0x020d), top: B:202:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x0384  */
    /* JADX WARN: Code duplicated, block: B:173:0x0386 A[Catch: all -> 0x03e7, TryCatch #1 {all -> 0x03e7, blocks: (B:13:0x0106, B:15:0x010c, B:17:0x0112, B:19:0x0118, B:21:0x011e, B:23:0x0124, B:25:0x012a, B:27:0x0130, B:29:0x0136, B:31:0x013c, B:33:0x0142, B:35:0x0148, B:37:0x0150, B:39:0x0158, B:41:0x0160, B:43:0x016a, B:45:0x0174, B:47:0x017e, B:49:0x0188, B:51:0x0192, B:53:0x019c, B:55:0x01a6, B:57:0x01b0, B:59:0x01ba, B:61:0x01c4, B:80:0x0204, B:84:0x0213, B:88:0x0222, B:92:0x022e, B:96:0x0242, B:100:0x0256, B:104:0x026d, B:108:0x027c, B:112:0x0288, B:116:0x029c, B:120:0x02b0, B:124:0x02c4, B:128:0x02d4, B:132:0x02e0, B:136:0x02f5, B:140:0x0306, B:144:0x0314, B:148:0x0326, B:150:0x0338, B:152:0x0340, B:154:0x0348, B:156:0x0350, B:158:0x0358, B:179:0x03c2, B:180:0x03c9, B:182:0x03db, B:183:0x03e0, B:166:0x036a, B:170:0x037a, B:174:0x038e, B:178:0x03a2, B:177:0x039a, B:173:0x0386, B:169:0x0372, B:147:0x0322, B:143:0x0310, B:139:0x0300, B:135:0x02ef, B:131:0x02dc, B:123:0x02bc, B:119:0x02a8, B:115:0x0294, B:111:0x0284, B:107:0x0276, B:103:0x0267, B:99:0x024e, B:95:0x023a, B:91:0x022a, B:87:0x021c, B:83:0x020d), top: B:202:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:176:0x0398  */
    /* JADX WARN: Code duplicated, block: B:177:0x039a A[Catch: all -> 0x03e7, TryCatch #1 {all -> 0x03e7, blocks: (B:13:0x0106, B:15:0x010c, B:17:0x0112, B:19:0x0118, B:21:0x011e, B:23:0x0124, B:25:0x012a, B:27:0x0130, B:29:0x0136, B:31:0x013c, B:33:0x0142, B:35:0x0148, B:37:0x0150, B:39:0x0158, B:41:0x0160, B:43:0x016a, B:45:0x0174, B:47:0x017e, B:49:0x0188, B:51:0x0192, B:53:0x019c, B:55:0x01a6, B:57:0x01b0, B:59:0x01ba, B:61:0x01c4, B:80:0x0204, B:84:0x0213, B:88:0x0222, B:92:0x022e, B:96:0x0242, B:100:0x0256, B:104:0x026d, B:108:0x027c, B:112:0x0288, B:116:0x029c, B:120:0x02b0, B:124:0x02c4, B:128:0x02d4, B:132:0x02e0, B:136:0x02f5, B:140:0x0306, B:144:0x0314, B:148:0x0326, B:150:0x0338, B:152:0x0340, B:154:0x0348, B:156:0x0350, B:158:0x0358, B:179:0x03c2, B:180:0x03c9, B:182:0x03db, B:183:0x03e0, B:166:0x036a, B:170:0x037a, B:174:0x038e, B:178:0x03a2, B:177:0x039a, B:173:0x0386, B:169:0x0372, B:147:0x0322, B:143:0x0310, B:139:0x0300, B:135:0x02ef, B:131:0x02dc, B:123:0x02bc, B:119:0x02a8, B:115:0x0294, B:111:0x0284, B:107:0x0276, B:103:0x0267, B:99:0x024e, B:95:0x023a, B:91:0x022a, B:87:0x021c, B:83:0x020d), top: B:202:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x03db A[Catch: all -> 0x03e7, TryCatch #1 {all -> 0x03e7, blocks: (B:13:0x0106, B:15:0x010c, B:17:0x0112, B:19:0x0118, B:21:0x011e, B:23:0x0124, B:25:0x012a, B:27:0x0130, B:29:0x0136, B:31:0x013c, B:33:0x0142, B:35:0x0148, B:37:0x0150, B:39:0x0158, B:41:0x0160, B:43:0x016a, B:45:0x0174, B:47:0x017e, B:49:0x0188, B:51:0x0192, B:53:0x019c, B:55:0x01a6, B:57:0x01b0, B:59:0x01ba, B:61:0x01c4, B:80:0x0204, B:84:0x0213, B:88:0x0222, B:92:0x022e, B:96:0x0242, B:100:0x0256, B:104:0x026d, B:108:0x027c, B:112:0x0288, B:116:0x029c, B:120:0x02b0, B:124:0x02c4, B:128:0x02d4, B:132:0x02e0, B:136:0x02f5, B:140:0x0306, B:144:0x0314, B:148:0x0326, B:150:0x0338, B:152:0x0340, B:154:0x0348, B:156:0x0350, B:158:0x0358, B:179:0x03c2, B:180:0x03c9, B:182:0x03db, B:183:0x03e0, B:166:0x036a, B:170:0x037a, B:174:0x038e, B:178:0x03a2, B:177:0x039a, B:173:0x0386, B:169:0x0372, B:147:0x0322, B:143:0x0310, B:139:0x0300, B:135:0x02ef, B:131:0x02dc, B:123:0x02bc, B:119:0x02a8, B:115:0x0294, B:111:0x0284, B:107:0x0276, B:103:0x0267, B:99:0x024e, B:95:0x023a, B:91:0x022a, B:87:0x021c, B:83:0x020d), top: B:202:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x020a  */
    /* JADX WARN: Code duplicated, block: B:83:0x020d A[Catch: all -> 0x03e7, TryCatch #1 {all -> 0x03e7, blocks: (B:13:0x0106, B:15:0x010c, B:17:0x0112, B:19:0x0118, B:21:0x011e, B:23:0x0124, B:25:0x012a, B:27:0x0130, B:29:0x0136, B:31:0x013c, B:33:0x0142, B:35:0x0148, B:37:0x0150, B:39:0x0158, B:41:0x0160, B:43:0x016a, B:45:0x0174, B:47:0x017e, B:49:0x0188, B:51:0x0192, B:53:0x019c, B:55:0x01a6, B:57:0x01b0, B:59:0x01ba, B:61:0x01c4, B:80:0x0204, B:84:0x0213, B:88:0x0222, B:92:0x022e, B:96:0x0242, B:100:0x0256, B:104:0x026d, B:108:0x027c, B:112:0x0288, B:116:0x029c, B:120:0x02b0, B:124:0x02c4, B:128:0x02d4, B:132:0x02e0, B:136:0x02f5, B:140:0x0306, B:144:0x0314, B:148:0x0326, B:150:0x0338, B:152:0x0340, B:154:0x0348, B:156:0x0350, B:158:0x0358, B:179:0x03c2, B:180:0x03c9, B:182:0x03db, B:183:0x03e0, B:166:0x036a, B:170:0x037a, B:174:0x038e, B:178:0x03a2, B:177:0x039a, B:173:0x0386, B:169:0x0372, B:147:0x0322, B:143:0x0310, B:139:0x0300, B:135:0x02ef, B:131:0x02dc, B:123:0x02bc, B:119:0x02a8, B:115:0x0294, B:111:0x0284, B:107:0x0276, B:103:0x0267, B:99:0x024e, B:95:0x023a, B:91:0x022a, B:87:0x021c, B:83:0x020d), top: B:202:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0219  */
    /* JADX WARN: Code duplicated, block: B:87:0x021c A[Catch: all -> 0x03e7, TryCatch #1 {all -> 0x03e7, blocks: (B:13:0x0106, B:15:0x010c, B:17:0x0112, B:19:0x0118, B:21:0x011e, B:23:0x0124, B:25:0x012a, B:27:0x0130, B:29:0x0136, B:31:0x013c, B:33:0x0142, B:35:0x0148, B:37:0x0150, B:39:0x0158, B:41:0x0160, B:43:0x016a, B:45:0x0174, B:47:0x017e, B:49:0x0188, B:51:0x0192, B:53:0x019c, B:55:0x01a6, B:57:0x01b0, B:59:0x01ba, B:61:0x01c4, B:80:0x0204, B:84:0x0213, B:88:0x0222, B:92:0x022e, B:96:0x0242, B:100:0x0256, B:104:0x026d, B:108:0x027c, B:112:0x0288, B:116:0x029c, B:120:0x02b0, B:124:0x02c4, B:128:0x02d4, B:132:0x02e0, B:136:0x02f5, B:140:0x0306, B:144:0x0314, B:148:0x0326, B:150:0x0338, B:152:0x0340, B:154:0x0348, B:156:0x0350, B:158:0x0358, B:179:0x03c2, B:180:0x03c9, B:182:0x03db, B:183:0x03e0, B:166:0x036a, B:170:0x037a, B:174:0x038e, B:178:0x03a2, B:177:0x039a, B:173:0x0386, B:169:0x0372, B:147:0x0322, B:143:0x0310, B:139:0x0300, B:135:0x02ef, B:131:0x02dc, B:123:0x02bc, B:119:0x02a8, B:115:0x0294, B:111:0x0284, B:107:0x0276, B:103:0x0267, B:99:0x024e, B:95:0x023a, B:91:0x022a, B:87:0x021c, B:83:0x020d), top: B:202:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0228  */
    /* JADX WARN: Code duplicated, block: B:91:0x022a A[Catch: all -> 0x03e7, TryCatch #1 {all -> 0x03e7, blocks: (B:13:0x0106, B:15:0x010c, B:17:0x0112, B:19:0x0118, B:21:0x011e, B:23:0x0124, B:25:0x012a, B:27:0x0130, B:29:0x0136, B:31:0x013c, B:33:0x0142, B:35:0x0148, B:37:0x0150, B:39:0x0158, B:41:0x0160, B:43:0x016a, B:45:0x0174, B:47:0x017e, B:49:0x0188, B:51:0x0192, B:53:0x019c, B:55:0x01a6, B:57:0x01b0, B:59:0x01ba, B:61:0x01c4, B:80:0x0204, B:84:0x0213, B:88:0x0222, B:92:0x022e, B:96:0x0242, B:100:0x0256, B:104:0x026d, B:108:0x027c, B:112:0x0288, B:116:0x029c, B:120:0x02b0, B:124:0x02c4, B:128:0x02d4, B:132:0x02e0, B:136:0x02f5, B:140:0x0306, B:144:0x0314, B:148:0x0326, B:150:0x0338, B:152:0x0340, B:154:0x0348, B:156:0x0350, B:158:0x0358, B:179:0x03c2, B:180:0x03c9, B:182:0x03db, B:183:0x03e0, B:166:0x036a, B:170:0x037a, B:174:0x038e, B:178:0x03a2, B:177:0x039a, B:173:0x0386, B:169:0x0372, B:147:0x0322, B:143:0x0310, B:139:0x0300, B:135:0x02ef, B:131:0x02dc, B:123:0x02bc, B:119:0x02a8, B:115:0x0294, B:111:0x0284, B:107:0x0276, B:103:0x0267, B:99:0x024e, B:95:0x023a, B:91:0x022a, B:87:0x021c, B:83:0x020d), top: B:202:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0238  */
    /* JADX WARN: Code duplicated, block: B:95:0x023a A[Catch: all -> 0x03e7, TryCatch #1 {all -> 0x03e7, blocks: (B:13:0x0106, B:15:0x010c, B:17:0x0112, B:19:0x0118, B:21:0x011e, B:23:0x0124, B:25:0x012a, B:27:0x0130, B:29:0x0136, B:31:0x013c, B:33:0x0142, B:35:0x0148, B:37:0x0150, B:39:0x0158, B:41:0x0160, B:43:0x016a, B:45:0x0174, B:47:0x017e, B:49:0x0188, B:51:0x0192, B:53:0x019c, B:55:0x01a6, B:57:0x01b0, B:59:0x01ba, B:61:0x01c4, B:80:0x0204, B:84:0x0213, B:88:0x0222, B:92:0x022e, B:96:0x0242, B:100:0x0256, B:104:0x026d, B:108:0x027c, B:112:0x0288, B:116:0x029c, B:120:0x02b0, B:124:0x02c4, B:128:0x02d4, B:132:0x02e0, B:136:0x02f5, B:140:0x0306, B:144:0x0314, B:148:0x0326, B:150:0x0338, B:152:0x0340, B:154:0x0348, B:156:0x0350, B:158:0x0358, B:179:0x03c2, B:180:0x03c9, B:182:0x03db, B:183:0x03e0, B:166:0x036a, B:170:0x037a, B:174:0x038e, B:178:0x03a2, B:177:0x039a, B:173:0x0386, B:169:0x0372, B:147:0x0322, B:143:0x0310, B:139:0x0300, B:135:0x02ef, B:131:0x02dc, B:123:0x02bc, B:119:0x02a8, B:115:0x0294, B:111:0x0284, B:107:0x0276, B:103:0x0267, B:99:0x024e, B:95:0x023a, B:91:0x022a, B:87:0x021c, B:83:0x020d), top: B:202:0x0106 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x024c  */
    /* JADX WARN: Code duplicated, block: B:99:0x024e A[Catch: all -> 0x03e7, TryCatch #1 {all -> 0x03e7, blocks: (B:13:0x0106, B:15:0x010c, B:17:0x0112, B:19:0x0118, B:21:0x011e, B:23:0x0124, B:25:0x012a, B:27:0x0130, B:29:0x0136, B:31:0x013c, B:33:0x0142, B:35:0x0148, B:37:0x0150, B:39:0x0158, B:41:0x0160, B:43:0x016a, B:45:0x0174, B:47:0x017e, B:49:0x0188, B:51:0x0192, B:53:0x019c, B:55:0x01a6, B:57:0x01b0, B:59:0x01ba, B:61:0x01c4, B:80:0x0204, B:84:0x0213, B:88:0x0222, B:92:0x022e, B:96:0x0242, B:100:0x0256, B:104:0x026d, B:108:0x027c, B:112:0x0288, B:116:0x029c, B:120:0x02b0, B:124:0x02c4, B:128:0x02d4, B:132:0x02e0, B:136:0x02f5, B:140:0x0306, B:144:0x0314, B:148:0x0326, B:150:0x0338, B:152:0x0340, B:154:0x0348, B:156:0x0350, B:158:0x0358, B:179:0x03c2, B:180:0x03c9, B:182:0x03db, B:183:0x03e0, B:166:0x036a, B:170:0x037a, B:174:0x038e, B:178:0x03a2, B:177:0x039a, B:173:0x0386, B:169:0x0372, B:147:0x0322, B:143:0x0310, B:139:0x0300, B:135:0x02ef, B:131:0x02dc, B:123:0x02bc, B:119:0x02a8, B:115:0x0294, B:111:0x0284, B:107:0x0276, B:103:0x0267, B:99:0x024e, B:95:0x023a, B:91:0x022a, B:87:0x021c, B:83:0x020d), top: B:202:0x0106 }] */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        int i;
        int i2;
        int i3;
        HashMap map;
        int i4;
        nqh nqhVar;
        int i5;
        ArrayList arrayList;
        nqi nqiVar;
        String string;
        String string2;
        String string3;
        Long lValueOf;
        Long lValueOf2;
        String string4;
        String string5;
        String string6;
        Long lValueOf3;
        Long lValueOf4;
        Long lValueOf5;
        boolean z;
        String string7;
        int i6;
        String string8;
        int i7;
        String string9;
        int i8;
        byte[] blob;
        int i9;
        byte[] blob2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Long lValueOf6;
        Long lValueOf7;
        Long lValueOf8;
        npk npkVar;
        nqt nqtVar = this;
        nqtVar.b.a.h();
        try {
            Cursor cursorI = fy.i(nqtVar.b.a, nqtVar.a, true);
            try {
                int iL = fy.l(cursorI, "title");
                int iL2 = fy.l(cursorI, "experienceId");
                int iL3 = fy.l(cursorI, "queryableTags");
                int iL4 = fy.l(cursorI, "queryableEpochTimestamp");
                int iL5 = fy.l(cursorI, "queryableDuration");
                int iL6 = fy.l(cursorI, "approximateTotalSize");
                int iL7 = fy.l(cursorI, "namespaceId");
                int iL8 = fy.l(cursorI, "partitionId");
                int iL9 = fy.l(cursorI, "f250ResourceId");
                int iL10 = fy.l(cursorI, "f250AutoUploadDelay");
                int iL11 = fy.l(cursorI, "airlockExpiration");
                int iL12 = fy.l(cursorI, "f250Expiration");
                int iL13 = fy.l(cursorI, "deleteAirlockFilesOnceUploaded");
                int iL14 = fy.l(cursorI, "nonSignedInDataOwners");
                int iL15 = fy.l(cursorI, "overridenObfuscatedGaiaId");
                int iL16 = fy.l(cursorI, "uploadTransferHandle");
                int iL17 = fy.l(cursorI, "relations");
                int iL18 = fy.l(cursorI, "indexTokens");
                int iL19 = fy.l(cursorI, "onDeviceId");
                int iL20 = fy.l(cursorI, "status_addedToAirlockEpochTimestamp");
                int iL21 = fy.l(cursorI, "status_uploadToF250RequestedEpochTimestamp");
                int iL22 = fy.l(cursorI, "status_uploadToF250CompletedEpochTimestamp");
                int iL23 = fy.l(cursorI, "status_airlockFileState");
                int iL24 = fy.l(cursorI, "status_uploadState");
                int iL25 = fy.l(cursorI, "status_uploadProgressPercent");
                HashMap map2 = new HashMap();
                while (cursorI.moveToNext()) {
                    iL19 = iL19;
                    Long lValueOf9 = Long.valueOf(cursorI.getLong(iL19));
                    if (((ArrayList) map2.get(lValueOf9)) == null) {
                        map2.put(lValueOf9, new ArrayList());
                        iL12 = iL12;
                    }
                }
                int i15 = iL19;
                int i16 = iL12;
                cursorI.moveToPosition(-1);
                nqtVar.b.g(map2);
                if (cursorI.moveToFirst()) {
                    try {
                        if (cursorI.isNull(iL) && cursorI.isNull(iL2) && cursorI.isNull(iL3) && cursorI.isNull(iL4) && cursorI.isNull(iL5) && cursorI.isNull(iL6) && cursorI.isNull(iL7) && cursorI.isNull(iL8) && cursorI.isNull(iL9) && cursorI.isNull(iL10) && cursorI.isNull(iL11)) {
                            i3 = i16;
                            if (cursorI.isNull(i3)) {
                                i2 = iL13;
                                if (cursorI.isNull(i2)) {
                                    i = iL14;
                                    if (cursorI.isNull(i)) {
                                        map = map2;
                                        if (!cursorI.isNull(iL15)) {
                                            iL15 = iL15;
                                        } else if (!cursorI.isNull(iL16)) {
                                            iL15 = iL15;
                                            iL16 = iL16;
                                        } else if (!cursorI.isNull(iL17)) {
                                            iL15 = iL15;
                                            iL16 = iL16;
                                            iL17 = iL17;
                                        } else if (!cursorI.isNull(iL18)) {
                                            iL15 = iL15;
                                            iL16 = iL16;
                                            iL17 = iL17;
                                            iL18 = iL18;
                                        } else if (!cursorI.isNull(i15)) {
                                            iL15 = iL15;
                                            iL16 = iL16;
                                            iL17 = iL17;
                                            iL18 = iL18;
                                            i15 = i15;
                                        } else if (!cursorI.isNull(iL20)) {
                                            iL15 = iL15;
                                            iL16 = iL16;
                                            iL17 = iL17;
                                            iL18 = iL18;
                                            i15 = i15;
                                            iL20 = iL20;
                                        } else if (!cursorI.isNull(iL21)) {
                                            iL15 = iL15;
                                            iL16 = iL16;
                                            iL17 = iL17;
                                            iL18 = iL18;
                                            i15 = i15;
                                            iL20 = iL20;
                                            iL21 = iL21;
                                        } else if (!cursorI.isNull(iL22)) {
                                            iL15 = iL15;
                                            iL16 = iL16;
                                            iL17 = iL17;
                                            iL18 = iL18;
                                            i15 = i15;
                                            iL20 = iL20;
                                            iL21 = iL21;
                                            iL22 = iL22;
                                        } else if (cursorI.isNull(iL23)) {
                                            if (!cursorI.isNull(iL24)) {
                                                iL15 = iL15;
                                                iL16 = iL16;
                                                iL17 = iL17;
                                                iL18 = iL18;
                                                i15 = i15;
                                                iL20 = iL20;
                                                iL21 = iL21;
                                                iL22 = iL22;
                                                iL23 = iL23;
                                                iL24 = iL24;
                                            } else if (cursorI.isNull(i4)) {
                                                iL15 = iL15;
                                                iL16 = iL16;
                                                iL17 = iL17;
                                                iL18 = iL18;
                                                i15 = i15;
                                                iL20 = iL20;
                                                iL21 = iL21;
                                                iL22 = iL22;
                                                iL23 = iL23;
                                                iL24 = iL24;
                                                i4 = iL25;
                                                i5 = i15;
                                                nqhVar = null;
                                            } else {
                                                iL15 = iL15;
                                                iL16 = iL16;
                                                iL17 = iL17;
                                                iL18 = iL18;
                                                i15 = i15;
                                                iL20 = iL20;
                                                iL21 = iL21;
                                                iL22 = iL22;
                                                iL23 = iL23;
                                                iL24 = iL24;
                                                i4 = iL25;
                                                if (cursorI.isNull(iL)) {
                                                    string = null;
                                                } else {
                                                    string = cursorI.getString(iL);
                                                }
                                                if (cursorI.isNull(iL2)) {
                                                    string2 = null;
                                                } else {
                                                    string2 = cursorI.getString(iL2);
                                                }
                                                if (cursorI.isNull(iL3)) {
                                                    string3 = null;
                                                } else {
                                                    string3 = cursorI.getString(iL3);
                                                }
                                                List listN = npy.n(string3);
                                                if (cursorI.isNull(iL4)) {
                                                    lValueOf = null;
                                                } else {
                                                    lValueOf = Long.valueOf(cursorI.getLong(iL4));
                                                }
                                                prl prlVarH = npy.h(lValueOf);
                                                if (cursorI.isNull(iL5)) {
                                                    lValueOf2 = null;
                                                } else {
                                                    lValueOf2 = Long.valueOf(cursorI.getLong(iL5));
                                                }
                                                pop popVarI = npy.i(lValueOf2);
                                                long j = cursorI.getLong(iL6);
                                                if (cursorI.isNull(iL7)) {
                                                    string4 = null;
                                                } else {
                                                    string4 = cursorI.getString(iL7);
                                                }
                                                if (cursorI.isNull(iL8)) {
                                                    string5 = null;
                                                } else {
                                                    string5 = cursorI.getString(iL8);
                                                }
                                                if (cursorI.isNull(iL9)) {
                                                    string6 = null;
                                                } else {
                                                    string6 = cursorI.getString(iL9);
                                                }
                                                nmz nmzVarV = npy.v(string6);
                                                if (cursorI.isNull(iL10)) {
                                                    lValueOf3 = null;
                                                } else {
                                                    lValueOf3 = Long.valueOf(cursorI.getLong(iL10));
                                                }
                                                pop popVarI2 = npy.i(lValueOf3);
                                                if (cursorI.isNull(iL11)) {
                                                    lValueOf4 = null;
                                                } else {
                                                    lValueOf4 = Long.valueOf(cursorI.getLong(iL11));
                                                }
                                                pop popVarI3 = npy.i(lValueOf4);
                                                if (cursorI.isNull(i3)) {
                                                    lValueOf5 = null;
                                                } else {
                                                    lValueOf5 = Long.valueOf(cursorI.getLong(i3));
                                                }
                                                pop popVarI4 = npy.i(lValueOf5);
                                                if (cursorI.getInt(i2) != 0) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                if (cursorI.isNull(i)) {
                                                    string7 = null;
                                                } else {
                                                    string7 = cursorI.getString(i);
                                                }
                                                List listM = npy.m(string7);
                                                i6 = iL15;
                                                if (cursorI.isNull(i6)) {
                                                    string8 = null;
                                                } else {
                                                    string8 = cursorI.getString(i6);
                                                }
                                                i7 = iL16;
                                                if (cursorI.isNull(i7)) {
                                                    string9 = null;
                                                } else {
                                                    string9 = cursorI.getString(i7);
                                                }
                                                i8 = iL17;
                                                if (cursorI.isNull(i8)) {
                                                    blob = null;
                                                } else {
                                                    blob = cursorI.getBlob(i8);
                                                }
                                                pti ptiVarC = npy.c(blob);
                                                i9 = iL18;
                                                if (cursorI.isNull(i9)) {
                                                    blob2 = null;
                                                } else {
                                                    blob2 = cursorI.getBlob(i9);
                                                }
                                                plu pluVarB = npy.b(blob2);
                                                i5 = i15;
                                                long j2 = cursorI.getLong(i5);
                                                i10 = iL20;
                                                if (cursorI.isNull(i10)) {
                                                    i11 = iL21;
                                                    if (cursorI.isNull(i11)) {
                                                        i12 = iL22;
                                                        if (cursorI.isNull(i12)) {
                                                            i13 = iL23;
                                                            if (cursorI.isNull(i13)) {
                                                                i14 = iL24;
                                                                if (!cursorI.isNull(i14) && cursorI.isNull(i4)) {
                                                                    npkVar = null;
                                                                }
                                                                nqhVar = new nqh(string, string2, listN, prlVarH, popVarI, j, string4, string5, nmzVarV, popVarI2, popVarI3, popVarI4, z, listM, string8, string9, ptiVarC, pluVarB, npkVar, j2);
                                                            }
                                                            if (cursorI.isNull(i10)) {
                                                                lValueOf6 = null;
                                                            } else {
                                                                lValueOf6 = Long.valueOf(cursorI.getLong(i10));
                                                            }
                                                            prl prlVarH2 = npy.h(lValueOf6);
                                                            if (cursorI.isNull(i11)) {
                                                                lValueOf7 = null;
                                                            } else {
                                                                lValueOf7 = Long.valueOf(cursorI.getLong(i11));
                                                            }
                                                            prl prlVarH3 = npy.h(lValueOf7);
                                                            if (cursorI.isNull(i12)) {
                                                                lValueOf8 = null;
                                                            } else {
                                                                lValueOf8 = Long.valueOf(cursorI.getLong(i12));
                                                            }
                                                            npkVar = new npk(prlVarH2, prlVarH3, npy.h(lValueOf8), npy.j(cursorI.getInt(i13)), npy.k(cursorI.getInt(i14)), cursorI.getDouble(i4));
                                                            nqhVar = new nqh(string, string2, listN, prlVarH, popVarI, j, string4, string5, nmzVarV, popVarI2, popVarI3, popVarI4, z, listM, string8, string9, ptiVarC, pluVarB, npkVar, j2);
                                                        }
                                                        i14 = iL24;
                                                        if (cursorI.isNull(i10)) {
                                                            lValueOf6 = null;
                                                        } else {
                                                            lValueOf6 = Long.valueOf(cursorI.getLong(i10));
                                                        }
                                                        prl prlVarH4 = npy.h(lValueOf6);
                                                        if (cursorI.isNull(i11)) {
                                                            lValueOf7 = null;
                                                        } else {
                                                            lValueOf7 = Long.valueOf(cursorI.getLong(i11));
                                                        }
                                                        prl prlVarH5 = npy.h(lValueOf7);
                                                        if (cursorI.isNull(i12)) {
                                                            lValueOf8 = null;
                                                        } else {
                                                            lValueOf8 = Long.valueOf(cursorI.getLong(i12));
                                                        }
                                                        npkVar = new npk(prlVarH4, prlVarH5, npy.h(lValueOf8), npy.j(cursorI.getInt(i13)), npy.k(cursorI.getInt(i14)), cursorI.getDouble(i4));
                                                        nqhVar = new nqh(string, string2, listN, prlVarH, popVarI, j, string4, string5, nmzVarV, popVarI2, popVarI3, popVarI4, z, listM, string8, string9, ptiVarC, pluVarB, npkVar, j2);
                                                    }
                                                    i13 = iL23;
                                                    i14 = iL24;
                                                    if (cursorI.isNull(i10)) {
                                                        lValueOf6 = null;
                                                    } else {
                                                        lValueOf6 = Long.valueOf(cursorI.getLong(i10));
                                                    }
                                                    prl prlVarH6 = npy.h(lValueOf6);
                                                    if (cursorI.isNull(i11)) {
                                                        lValueOf7 = null;
                                                    } else {
                                                        lValueOf7 = Long.valueOf(cursorI.getLong(i11));
                                                    }
                                                    prl prlVarH7 = npy.h(lValueOf7);
                                                    if (cursorI.isNull(i12)) {
                                                        lValueOf8 = null;
                                                    } else {
                                                        lValueOf8 = Long.valueOf(cursorI.getLong(i12));
                                                    }
                                                    npkVar = new npk(prlVarH6, prlVarH7, npy.h(lValueOf8), npy.j(cursorI.getInt(i13)), npy.k(cursorI.getInt(i14)), cursorI.getDouble(i4));
                                                    nqhVar = new nqh(string, string2, listN, prlVarH, popVarI, j, string4, string5, nmzVarV, popVarI2, popVarI3, popVarI4, z, listM, string8, string9, ptiVarC, pluVarB, npkVar, j2);
                                                } else {
                                                    i11 = iL21;
                                                }
                                                i12 = iL22;
                                                i13 = iL23;
                                                i14 = iL24;
                                                if (cursorI.isNull(i10)) {
                                                    lValueOf6 = null;
                                                } else {
                                                    lValueOf6 = Long.valueOf(cursorI.getLong(i10));
                                                }
                                                prl prlVarH8 = npy.h(lValueOf6);
                                                if (cursorI.isNull(i11)) {
                                                    lValueOf7 = null;
                                                } else {
                                                    lValueOf7 = Long.valueOf(cursorI.getLong(i11));
                                                }
                                                prl prlVarH9 = npy.h(lValueOf7);
                                                if (cursorI.isNull(i12)) {
                                                    lValueOf8 = null;
                                                } else {
                                                    lValueOf8 = Long.valueOf(cursorI.getLong(i12));
                                                }
                                                npkVar = new npk(prlVarH8, prlVarH9, npy.h(lValueOf8), npy.j(cursorI.getInt(i13)), npy.k(cursorI.getInt(i14)), cursorI.getDouble(i4));
                                                nqhVar = new nqh(string, string2, listN, prlVarH, popVarI, j, string4, string5, nmzVarV, popVarI2, popVarI3, popVarI4, z, listM, string8, string9, ptiVarC, pluVarB, npkVar, j2);
                                            }
                                            arrayList = (ArrayList) map.get(Long.valueOf(cursorI.getLong(i5)));
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            nqiVar = new nqi(nqhVar, arrayList);
                                        } else {
                                            iL15 = iL15;
                                            iL16 = iL16;
                                            iL17 = iL17;
                                            iL18 = iL18;
                                            i15 = i15;
                                            iL20 = iL20;
                                            iL21 = iL21;
                                            iL22 = iL22;
                                            iL23 = iL23;
                                        }
                                    }
                                    i4 = iL25;
                                    if (cursorI.isNull(iL)) {
                                        string = null;
                                    } else {
                                        string = cursorI.getString(iL);
                                    }
                                    if (cursorI.isNull(iL2)) {
                                        string2 = null;
                                    } else {
                                        string2 = cursorI.getString(iL2);
                                    }
                                    if (cursorI.isNull(iL3)) {
                                        string3 = null;
                                    } else {
                                        string3 = cursorI.getString(iL3);
                                    }
                                    List listN2 = npy.n(string3);
                                    if (cursorI.isNull(iL4)) {
                                        lValueOf = null;
                                    } else {
                                        lValueOf = Long.valueOf(cursorI.getLong(iL4));
                                    }
                                    prl prlVarH10 = npy.h(lValueOf);
                                    if (cursorI.isNull(iL5)) {
                                        lValueOf2 = null;
                                    } else {
                                        lValueOf2 = Long.valueOf(cursorI.getLong(iL5));
                                    }
                                    pop popVarI5 = npy.i(lValueOf2);
                                    long j3 = cursorI.getLong(iL6);
                                    if (cursorI.isNull(iL7)) {
                                        string4 = null;
                                    } else {
                                        string4 = cursorI.getString(iL7);
                                    }
                                    if (cursorI.isNull(iL8)) {
                                        string5 = null;
                                    } else {
                                        string5 = cursorI.getString(iL8);
                                    }
                                    if (cursorI.isNull(iL9)) {
                                        string6 = null;
                                    } else {
                                        string6 = cursorI.getString(iL9);
                                    }
                                    nmz nmzVarV2 = npy.v(string6);
                                    if (cursorI.isNull(iL10)) {
                                        lValueOf3 = null;
                                    } else {
                                        lValueOf3 = Long.valueOf(cursorI.getLong(iL10));
                                    }
                                    pop popVarI6 = npy.i(lValueOf3);
                                    if (cursorI.isNull(iL11)) {
                                        lValueOf4 = null;
                                    } else {
                                        lValueOf4 = Long.valueOf(cursorI.getLong(iL11));
                                    }
                                    pop popVarI7 = npy.i(lValueOf4);
                                    if (cursorI.isNull(i3)) {
                                        lValueOf5 = null;
                                    } else {
                                        lValueOf5 = Long.valueOf(cursorI.getLong(i3));
                                    }
                                    pop popVarI8 = npy.i(lValueOf5);
                                    if (cursorI.getInt(i2) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (cursorI.isNull(i)) {
                                        string7 = null;
                                    } else {
                                        string7 = cursorI.getString(i);
                                    }
                                    List listM2 = npy.m(string7);
                                    i6 = iL15;
                                    if (cursorI.isNull(i6)) {
                                        string8 = null;
                                    } else {
                                        string8 = cursorI.getString(i6);
                                    }
                                    i7 = iL16;
                                    if (cursorI.isNull(i7)) {
                                        string9 = null;
                                    } else {
                                        string9 = cursorI.getString(i7);
                                    }
                                    i8 = iL17;
                                    if (cursorI.isNull(i8)) {
                                        blob = null;
                                    } else {
                                        blob = cursorI.getBlob(i8);
                                    }
                                    pti ptiVarC2 = npy.c(blob);
                                    i9 = iL18;
                                    if (cursorI.isNull(i9)) {
                                        blob2 = null;
                                    } else {
                                        blob2 = cursorI.getBlob(i9);
                                    }
                                    plu pluVarB2 = npy.b(blob2);
                                    i5 = i15;
                                    long j4 = cursorI.getLong(i5);
                                    i10 = iL20;
                                    if (cursorI.isNull(i10)) {
                                        i11 = iL21;
                                        if (cursorI.isNull(i11)) {
                                            i12 = iL22;
                                            if (cursorI.isNull(i12)) {
                                                i13 = iL23;
                                                if (cursorI.isNull(i13)) {
                                                    i14 = iL24;
                                                    if (!cursorI.isNull(i14)) {
                                                    }
                                                    nqhVar = new nqh(string, string2, listN2, prlVarH10, popVarI5, j3, string4, string5, nmzVarV2, popVarI6, popVarI7, popVarI8, z, listM2, string8, string9, ptiVarC2, pluVarB2, npkVar, j4);
                                                    arrayList = (ArrayList) map.get(Long.valueOf(cursorI.getLong(i5)));
                                                    if (arrayList == null) {
                                                        arrayList = new ArrayList();
                                                    }
                                                    nqiVar = new nqi(nqhVar, arrayList);
                                                }
                                                if (cursorI.isNull(i10)) {
                                                    lValueOf6 = null;
                                                } else {
                                                    lValueOf6 = Long.valueOf(cursorI.getLong(i10));
                                                }
                                                prl prlVarH11 = npy.h(lValueOf6);
                                                if (cursorI.isNull(i11)) {
                                                    lValueOf7 = null;
                                                } else {
                                                    lValueOf7 = Long.valueOf(cursorI.getLong(i11));
                                                }
                                                prl prlVarH12 = npy.h(lValueOf7);
                                                if (cursorI.isNull(i12)) {
                                                    lValueOf8 = null;
                                                } else {
                                                    lValueOf8 = Long.valueOf(cursorI.getLong(i12));
                                                }
                                                npkVar = new npk(prlVarH11, prlVarH12, npy.h(lValueOf8), npy.j(cursorI.getInt(i13)), npy.k(cursorI.getInt(i14)), cursorI.getDouble(i4));
                                                nqhVar = new nqh(string, string2, listN2, prlVarH10, popVarI5, j3, string4, string5, nmzVarV2, popVarI6, popVarI7, popVarI8, z, listM2, string8, string9, ptiVarC2, pluVarB2, npkVar, j4);
                                                arrayList = (ArrayList) map.get(Long.valueOf(cursorI.getLong(i5)));
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                nqiVar = new nqi(nqhVar, arrayList);
                                            }
                                            i14 = iL24;
                                            if (cursorI.isNull(i10)) {
                                                lValueOf6 = null;
                                            } else {
                                                lValueOf6 = Long.valueOf(cursorI.getLong(i10));
                                            }
                                            prl prlVarH13 = npy.h(lValueOf6);
                                            if (cursorI.isNull(i11)) {
                                                lValueOf7 = null;
                                            } else {
                                                lValueOf7 = Long.valueOf(cursorI.getLong(i11));
                                            }
                                            prl prlVarH14 = npy.h(lValueOf7);
                                            if (cursorI.isNull(i12)) {
                                                lValueOf8 = null;
                                            } else {
                                                lValueOf8 = Long.valueOf(cursorI.getLong(i12));
                                            }
                                            npkVar = new npk(prlVarH13, prlVarH14, npy.h(lValueOf8), npy.j(cursorI.getInt(i13)), npy.k(cursorI.getInt(i14)), cursorI.getDouble(i4));
                                            nqhVar = new nqh(string, string2, listN2, prlVarH10, popVarI5, j3, string4, string5, nmzVarV2, popVarI6, popVarI7, popVarI8, z, listM2, string8, string9, ptiVarC2, pluVarB2, npkVar, j4);
                                            arrayList = (ArrayList) map.get(Long.valueOf(cursorI.getLong(i5)));
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            nqiVar = new nqi(nqhVar, arrayList);
                                        }
                                        i13 = iL23;
                                        i14 = iL24;
                                        if (cursorI.isNull(i10)) {
                                            lValueOf6 = null;
                                        } else {
                                            lValueOf6 = Long.valueOf(cursorI.getLong(i10));
                                        }
                                        prl prlVarH15 = npy.h(lValueOf6);
                                        if (cursorI.isNull(i11)) {
                                            lValueOf7 = null;
                                        } else {
                                            lValueOf7 = Long.valueOf(cursorI.getLong(i11));
                                        }
                                        prl prlVarH16 = npy.h(lValueOf7);
                                        if (cursorI.isNull(i12)) {
                                            lValueOf8 = null;
                                        } else {
                                            lValueOf8 = Long.valueOf(cursorI.getLong(i12));
                                        }
                                        npkVar = new npk(prlVarH15, prlVarH16, npy.h(lValueOf8), npy.j(cursorI.getInt(i13)), npy.k(cursorI.getInt(i14)), cursorI.getDouble(i4));
                                        nqhVar = new nqh(string, string2, listN2, prlVarH10, popVarI5, j3, string4, string5, nmzVarV2, popVarI6, popVarI7, popVarI8, z, listM2, string8, string9, ptiVarC2, pluVarB2, npkVar, j4);
                                        arrayList = (ArrayList) map.get(Long.valueOf(cursorI.getLong(i5)));
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        nqiVar = new nqi(nqhVar, arrayList);
                                    } else {
                                        i11 = iL21;
                                    }
                                    i12 = iL22;
                                    i13 = iL23;
                                    i14 = iL24;
                                    if (cursorI.isNull(i10)) {
                                        lValueOf6 = null;
                                    } else {
                                        lValueOf6 = Long.valueOf(cursorI.getLong(i10));
                                    }
                                    prl prlVarH17 = npy.h(lValueOf6);
                                    if (cursorI.isNull(i11)) {
                                        lValueOf7 = null;
                                    } else {
                                        lValueOf7 = Long.valueOf(cursorI.getLong(i11));
                                    }
                                    prl prlVarH18 = npy.h(lValueOf7);
                                    if (cursorI.isNull(i12)) {
                                        lValueOf8 = null;
                                    } else {
                                        lValueOf8 = Long.valueOf(cursorI.getLong(i12));
                                    }
                                    npkVar = new npk(prlVarH17, prlVarH18, npy.h(lValueOf8), npy.j(cursorI.getInt(i13)), npy.k(cursorI.getInt(i14)), cursorI.getDouble(i4));
                                    nqhVar = new nqh(string, string2, listN2, prlVarH10, popVarI5, j3, string4, string5, nmzVarV2, popVarI6, popVarI7, popVarI8, z, listM2, string8, string9, ptiVarC2, pluVarB2, npkVar, j4);
                                    arrayList = (ArrayList) map.get(Long.valueOf(cursorI.getLong(i5)));
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    nqiVar = new nqi(nqhVar, arrayList);
                                } else {
                                    i = iL14;
                                }
                            } else {
                                i = iL14;
                                i2 = iL13;
                            }
                        } else {
                            i = iL14;
                            i2 = iL13;
                            i3 = i16;
                        }
                        map = map2;
                        i4 = iL25;
                        if (cursorI.isNull(iL)) {
                            string = null;
                        } else {
                            string = cursorI.getString(iL);
                        }
                        if (cursorI.isNull(iL2)) {
                            string2 = null;
                        } else {
                            string2 = cursorI.getString(iL2);
                        }
                        if (cursorI.isNull(iL3)) {
                            string3 = null;
                        } else {
                            string3 = cursorI.getString(iL3);
                        }
                        List listN3 = npy.n(string3);
                        if (cursorI.isNull(iL4)) {
                            lValueOf = null;
                        } else {
                            lValueOf = Long.valueOf(cursorI.getLong(iL4));
                        }
                        prl prlVarH19 = npy.h(lValueOf);
                        if (cursorI.isNull(iL5)) {
                            lValueOf2 = null;
                        } else {
                            lValueOf2 = Long.valueOf(cursorI.getLong(iL5));
                        }
                        pop popVarI9 = npy.i(lValueOf2);
                        long j5 = cursorI.getLong(iL6);
                        if (cursorI.isNull(iL7)) {
                            string4 = null;
                        } else {
                            string4 = cursorI.getString(iL7);
                        }
                        if (cursorI.isNull(iL8)) {
                            string5 = null;
                        } else {
                            string5 = cursorI.getString(iL8);
                        }
                        if (cursorI.isNull(iL9)) {
                            string6 = null;
                        } else {
                            string6 = cursorI.getString(iL9);
                        }
                        nmz nmzVarV3 = npy.v(string6);
                        if (cursorI.isNull(iL10)) {
                            lValueOf3 = null;
                        } else {
                            lValueOf3 = Long.valueOf(cursorI.getLong(iL10));
                        }
                        pop popVarI10 = npy.i(lValueOf3);
                        if (cursorI.isNull(iL11)) {
                            lValueOf4 = null;
                        } else {
                            lValueOf4 = Long.valueOf(cursorI.getLong(iL11));
                        }
                        pop popVarI11 = npy.i(lValueOf4);
                        if (cursorI.isNull(i3)) {
                            lValueOf5 = null;
                        } else {
                            lValueOf5 = Long.valueOf(cursorI.getLong(i3));
                        }
                        pop popVarI12 = npy.i(lValueOf5);
                        if (cursorI.getInt(i2) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (cursorI.isNull(i)) {
                            string7 = null;
                        } else {
                            string7 = cursorI.getString(i);
                        }
                        List listM3 = npy.m(string7);
                        i6 = iL15;
                        if (cursorI.isNull(i6)) {
                            string8 = null;
                        } else {
                            string8 = cursorI.getString(i6);
                        }
                        i7 = iL16;
                        if (cursorI.isNull(i7)) {
                            string9 = null;
                        } else {
                            string9 = cursorI.getString(i7);
                        }
                        i8 = iL17;
                        if (cursorI.isNull(i8)) {
                            blob = null;
                        } else {
                            blob = cursorI.getBlob(i8);
                        }
                        pti ptiVarC3 = npy.c(blob);
                        i9 = iL18;
                        if (cursorI.isNull(i9)) {
                            blob2 = null;
                        } else {
                            blob2 = cursorI.getBlob(i9);
                        }
                        plu pluVarB3 = npy.b(blob2);
                        i5 = i15;
                        long j6 = cursorI.getLong(i5);
                        i10 = iL20;
                        if (cursorI.isNull(i10)) {
                            i11 = iL21;
                            if (cursorI.isNull(i11)) {
                                i12 = iL22;
                                if (cursorI.isNull(i12)) {
                                    i13 = iL23;
                                    if (cursorI.isNull(i13)) {
                                        i14 = iL24;
                                        if (!cursorI.isNull(i14)) {
                                        }
                                        nqhVar = new nqh(string, string2, listN3, prlVarH19, popVarI9, j5, string4, string5, nmzVarV3, popVarI10, popVarI11, popVarI12, z, listM3, string8, string9, ptiVarC3, pluVarB3, npkVar, j6);
                                        arrayList = (ArrayList) map.get(Long.valueOf(cursorI.getLong(i5)));
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        nqiVar = new nqi(nqhVar, arrayList);
                                    }
                                    if (cursorI.isNull(i10)) {
                                        lValueOf6 = null;
                                    } else {
                                        lValueOf6 = Long.valueOf(cursorI.getLong(i10));
                                    }
                                    prl prlVarH110 = npy.h(lValueOf6);
                                    if (cursorI.isNull(i11)) {
                                        lValueOf7 = null;
                                    } else {
                                        lValueOf7 = Long.valueOf(cursorI.getLong(i11));
                                    }
                                    prl prlVarH111 = npy.h(lValueOf7);
                                    if (cursorI.isNull(i12)) {
                                        lValueOf8 = null;
                                    } else {
                                        lValueOf8 = Long.valueOf(cursorI.getLong(i12));
                                    }
                                    npkVar = new npk(prlVarH110, prlVarH111, npy.h(lValueOf8), npy.j(cursorI.getInt(i13)), npy.k(cursorI.getInt(i14)), cursorI.getDouble(i4));
                                    nqhVar = new nqh(string, string2, listN3, prlVarH19, popVarI9, j5, string4, string5, nmzVarV3, popVarI10, popVarI11, popVarI12, z, listM3, string8, string9, ptiVarC3, pluVarB3, npkVar, j6);
                                    arrayList = (ArrayList) map.get(Long.valueOf(cursorI.getLong(i5)));
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    nqiVar = new nqi(nqhVar, arrayList);
                                }
                                i14 = iL24;
                                if (cursorI.isNull(i10)) {
                                    lValueOf6 = null;
                                } else {
                                    lValueOf6 = Long.valueOf(cursorI.getLong(i10));
                                }
                                prl prlVarH112 = npy.h(lValueOf6);
                                if (cursorI.isNull(i11)) {
                                    lValueOf7 = null;
                                } else {
                                    lValueOf7 = Long.valueOf(cursorI.getLong(i11));
                                }
                                prl prlVarH113 = npy.h(lValueOf7);
                                if (cursorI.isNull(i12)) {
                                    lValueOf8 = null;
                                } else {
                                    lValueOf8 = Long.valueOf(cursorI.getLong(i12));
                                }
                                npkVar = new npk(prlVarH112, prlVarH113, npy.h(lValueOf8), npy.j(cursorI.getInt(i13)), npy.k(cursorI.getInt(i14)), cursorI.getDouble(i4));
                                nqhVar = new nqh(string, string2, listN3, prlVarH19, popVarI9, j5, string4, string5, nmzVarV3, popVarI10, popVarI11, popVarI12, z, listM3, string8, string9, ptiVarC3, pluVarB3, npkVar, j6);
                                arrayList = (ArrayList) map.get(Long.valueOf(cursorI.getLong(i5)));
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                nqiVar = new nqi(nqhVar, arrayList);
                            }
                            i13 = iL23;
                            i14 = iL24;
                            if (cursorI.isNull(i10)) {
                                lValueOf6 = null;
                            } else {
                                lValueOf6 = Long.valueOf(cursorI.getLong(i10));
                            }
                            prl prlVarH114 = npy.h(lValueOf6);
                            if (cursorI.isNull(i11)) {
                                lValueOf7 = null;
                            } else {
                                lValueOf7 = Long.valueOf(cursorI.getLong(i11));
                            }
                            prl prlVarH115 = npy.h(lValueOf7);
                            if (cursorI.isNull(i12)) {
                                lValueOf8 = null;
                            } else {
                                lValueOf8 = Long.valueOf(cursorI.getLong(i12));
                            }
                            npkVar = new npk(prlVarH114, prlVarH115, npy.h(lValueOf8), npy.j(cursorI.getInt(i13)), npy.k(cursorI.getInt(i14)), cursorI.getDouble(i4));
                            nqhVar = new nqh(string, string2, listN3, prlVarH19, popVarI9, j5, string4, string5, nmzVarV3, popVarI10, popVarI11, popVarI12, z, listM3, string8, string9, ptiVarC3, pluVarB3, npkVar, j6);
                            arrayList = (ArrayList) map.get(Long.valueOf(cursorI.getLong(i5)));
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            nqiVar = new nqi(nqhVar, arrayList);
                        } else {
                            i11 = iL21;
                        }
                        i12 = iL22;
                        i13 = iL23;
                        i14 = iL24;
                        if (cursorI.isNull(i10)) {
                            lValueOf6 = null;
                        } else {
                            lValueOf6 = Long.valueOf(cursorI.getLong(i10));
                        }
                        prl prlVarH116 = npy.h(lValueOf6);
                        if (cursorI.isNull(i11)) {
                            lValueOf7 = null;
                        } else {
                            lValueOf7 = Long.valueOf(cursorI.getLong(i11));
                        }
                        prl prlVarH117 = npy.h(lValueOf7);
                        if (cursorI.isNull(i12)) {
                            lValueOf8 = null;
                        } else {
                            lValueOf8 = Long.valueOf(cursorI.getLong(i12));
                        }
                        npkVar = new npk(prlVarH116, prlVarH117, npy.h(lValueOf8), npy.j(cursorI.getInt(i13)), npy.k(cursorI.getInt(i14)), cursorI.getDouble(i4));
                        nqhVar = new nqh(string, string2, listN3, prlVarH19, popVarI9, j5, string4, string5, nmzVarV3, popVarI10, popVarI11, popVarI12, z, listM3, string8, string9, ptiVarC3, pluVarB3, npkVar, j6);
                        arrayList = (ArrayList) map.get(Long.valueOf(cursorI.getLong(i5)));
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        nqiVar = new nqi(nqhVar, arrayList);
                    } catch (Throwable th) {
                        th = th;
                        nqtVar = this;
                        cursorI.close();
                        nqtVar.a.j();
                        throw th;
                    }
                } else {
                    nqiVar = null;
                }
                nqtVar = this;
                nqtVar.b.a.j();
                cursorI.close();
                nqtVar.a.j();
                nqtVar.b.a.i();
                return nqiVar;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            nqtVar.b.a.i();
            throw th3;
        }
    }
}

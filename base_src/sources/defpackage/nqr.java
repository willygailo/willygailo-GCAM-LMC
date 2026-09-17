package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class nqr implements Callable {
    final /* synthetic */ ais a;
    final /* synthetic */ nqu b;

    public nqr(nqu nquVar, ais aisVar) {
        this.b = nquVar;
        this.a = aisVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0275 A[Catch: all -> 0x0465, TryCatch #1 {all -> 0x0465, blocks: (B:14:0x010f, B:16:0x0117, B:18:0x011d, B:20:0x0123, B:22:0x0129, B:24:0x012f, B:26:0x0135, B:28:0x013b, B:30:0x0141, B:32:0x0147, B:34:0x014d, B:36:0x0153, B:38:0x015b, B:40:0x0163, B:42:0x016d, B:44:0x0177, B:46:0x0181, B:48:0x018b, B:50:0x0195, B:52:0x019f, B:54:0x01a9, B:56:0x01b3, B:58:0x01bd, B:60:0x01c7, B:62:0x01d1, B:81:0x0228, B:85:0x0237, B:89:0x0246, B:93:0x0253, B:97:0x0268, B:101:0x027d, B:105:0x0294, B:109:0x02a3, B:113:0x02b0, B:117:0x02c5, B:121:0x02da, B:125:0x02ef, B:129:0x0300, B:133:0x030d, B:137:0x0324, B:141:0x0337, B:145:0x0348, B:149:0x035d, B:151:0x0373, B:153:0x037d, B:155:0x0387, B:157:0x0391, B:159:0x039b, B:180:0x0410, B:181:0x041b, B:183:0x0431, B:184:0x0436, B:167:0x03b6, B:171:0x03c7, B:175:0x03dc, B:179:0x03ef, B:178:0x03e7, B:174:0x03d4, B:170:0x03bf, B:148:0x0359, B:144:0x0344, B:140:0x0331, B:136:0x031e, B:132:0x0309, B:124:0x02e7, B:120:0x02d2, B:116:0x02bd, B:112:0x02ac, B:108:0x029d, B:104:0x028e, B:100:0x0275, B:96:0x0260, B:92:0x024f, B:88:0x0240, B:84:0x0231), top: B:202:0x010f }] */
    /* JADX WARN: Code duplicated, block: B:103:0x028b  */
    /* JADX WARN: Code duplicated, block: B:104:0x028e A[Catch: all -> 0x0465, TryCatch #1 {all -> 0x0465, blocks: (B:14:0x010f, B:16:0x0117, B:18:0x011d, B:20:0x0123, B:22:0x0129, B:24:0x012f, B:26:0x0135, B:28:0x013b, B:30:0x0141, B:32:0x0147, B:34:0x014d, B:36:0x0153, B:38:0x015b, B:40:0x0163, B:42:0x016d, B:44:0x0177, B:46:0x0181, B:48:0x018b, B:50:0x0195, B:52:0x019f, B:54:0x01a9, B:56:0x01b3, B:58:0x01bd, B:60:0x01c7, B:62:0x01d1, B:81:0x0228, B:85:0x0237, B:89:0x0246, B:93:0x0253, B:97:0x0268, B:101:0x027d, B:105:0x0294, B:109:0x02a3, B:113:0x02b0, B:117:0x02c5, B:121:0x02da, B:125:0x02ef, B:129:0x0300, B:133:0x030d, B:137:0x0324, B:141:0x0337, B:145:0x0348, B:149:0x035d, B:151:0x0373, B:153:0x037d, B:155:0x0387, B:157:0x0391, B:159:0x039b, B:180:0x0410, B:181:0x041b, B:183:0x0431, B:184:0x0436, B:167:0x03b6, B:171:0x03c7, B:175:0x03dc, B:179:0x03ef, B:178:0x03e7, B:174:0x03d4, B:170:0x03bf, B:148:0x0359, B:144:0x0344, B:140:0x0331, B:136:0x031e, B:132:0x0309, B:124:0x02e7, B:120:0x02d2, B:116:0x02bd, B:112:0x02ac, B:108:0x029d, B:104:0x028e, B:100:0x0275, B:96:0x0260, B:92:0x024f, B:88:0x0240, B:84:0x0231), top: B:202:0x010f }] */
    /* JADX WARN: Code duplicated, block: B:107:0x029a  */
    /* JADX WARN: Code duplicated, block: B:108:0x029d A[Catch: all -> 0x0465, TryCatch #1 {all -> 0x0465, blocks: (B:14:0x010f, B:16:0x0117, B:18:0x011d, B:20:0x0123, B:22:0x0129, B:24:0x012f, B:26:0x0135, B:28:0x013b, B:30:0x0141, B:32:0x0147, B:34:0x014d, B:36:0x0153, B:38:0x015b, B:40:0x0163, B:42:0x016d, B:44:0x0177, B:46:0x0181, B:48:0x018b, B:50:0x0195, B:52:0x019f, B:54:0x01a9, B:56:0x01b3, B:58:0x01bd, B:60:0x01c7, B:62:0x01d1, B:81:0x0228, B:85:0x0237, B:89:0x0246, B:93:0x0253, B:97:0x0268, B:101:0x027d, B:105:0x0294, B:109:0x02a3, B:113:0x02b0, B:117:0x02c5, B:121:0x02da, B:125:0x02ef, B:129:0x0300, B:133:0x030d, B:137:0x0324, B:141:0x0337, B:145:0x0348, B:149:0x035d, B:151:0x0373, B:153:0x037d, B:155:0x0387, B:157:0x0391, B:159:0x039b, B:180:0x0410, B:181:0x041b, B:183:0x0431, B:184:0x0436, B:167:0x03b6, B:171:0x03c7, B:175:0x03dc, B:179:0x03ef, B:178:0x03e7, B:174:0x03d4, B:170:0x03bf, B:148:0x0359, B:144:0x0344, B:140:0x0331, B:136:0x031e, B:132:0x0309, B:124:0x02e7, B:120:0x02d2, B:116:0x02bd, B:112:0x02ac, B:108:0x029d, B:104:0x028e, B:100:0x0275, B:96:0x0260, B:92:0x024f, B:88:0x0240, B:84:0x0231), top: B:202:0x010f }] */
    /* JADX WARN: Code duplicated, block: B:111:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:112:0x02ac A[Catch: all -> 0x0465, TryCatch #1 {all -> 0x0465, blocks: (B:14:0x010f, B:16:0x0117, B:18:0x011d, B:20:0x0123, B:22:0x0129, B:24:0x012f, B:26:0x0135, B:28:0x013b, B:30:0x0141, B:32:0x0147, B:34:0x014d, B:36:0x0153, B:38:0x015b, B:40:0x0163, B:42:0x016d, B:44:0x0177, B:46:0x0181, B:48:0x018b, B:50:0x0195, B:52:0x019f, B:54:0x01a9, B:56:0x01b3, B:58:0x01bd, B:60:0x01c7, B:62:0x01d1, B:81:0x0228, B:85:0x0237, B:89:0x0246, B:93:0x0253, B:97:0x0268, B:101:0x027d, B:105:0x0294, B:109:0x02a3, B:113:0x02b0, B:117:0x02c5, B:121:0x02da, B:125:0x02ef, B:129:0x0300, B:133:0x030d, B:137:0x0324, B:141:0x0337, B:145:0x0348, B:149:0x035d, B:151:0x0373, B:153:0x037d, B:155:0x0387, B:157:0x0391, B:159:0x039b, B:180:0x0410, B:181:0x041b, B:183:0x0431, B:184:0x0436, B:167:0x03b6, B:171:0x03c7, B:175:0x03dc, B:179:0x03ef, B:178:0x03e7, B:174:0x03d4, B:170:0x03bf, B:148:0x0359, B:144:0x0344, B:140:0x0331, B:136:0x031e, B:132:0x0309, B:124:0x02e7, B:120:0x02d2, B:116:0x02bd, B:112:0x02ac, B:108:0x029d, B:104:0x028e, B:100:0x0275, B:96:0x0260, B:92:0x024f, B:88:0x0240, B:84:0x0231), top: B:202:0x010f }] */
    /* JADX WARN: Code duplicated, block: B:115:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:116:0x02bd A[Catch: all -> 0x0465, TryCatch #1 {all -> 0x0465, blocks: (B:14:0x010f, B:16:0x0117, B:18:0x011d, B:20:0x0123, B:22:0x0129, B:24:0x012f, B:26:0x0135, B:28:0x013b, B:30:0x0141, B:32:0x0147, B:34:0x014d, B:36:0x0153, B:38:0x015b, B:40:0x0163, B:42:0x016d, B:44:0x0177, B:46:0x0181, B:48:0x018b, B:50:0x0195, B:52:0x019f, B:54:0x01a9, B:56:0x01b3, B:58:0x01bd, B:60:0x01c7, B:62:0x01d1, B:81:0x0228, B:85:0x0237, B:89:0x0246, B:93:0x0253, B:97:0x0268, B:101:0x027d, B:105:0x0294, B:109:0x02a3, B:113:0x02b0, B:117:0x02c5, B:121:0x02da, B:125:0x02ef, B:129:0x0300, B:133:0x030d, B:137:0x0324, B:141:0x0337, B:145:0x0348, B:149:0x035d, B:151:0x0373, B:153:0x037d, B:155:0x0387, B:157:0x0391, B:159:0x039b, B:180:0x0410, B:181:0x041b, B:183:0x0431, B:184:0x0436, B:167:0x03b6, B:171:0x03c7, B:175:0x03dc, B:179:0x03ef, B:178:0x03e7, B:174:0x03d4, B:170:0x03bf, B:148:0x0359, B:144:0x0344, B:140:0x0331, B:136:0x031e, B:132:0x0309, B:124:0x02e7, B:120:0x02d2, B:116:0x02bd, B:112:0x02ac, B:108:0x029d, B:104:0x028e, B:100:0x0275, B:96:0x0260, B:92:0x024f, B:88:0x0240, B:84:0x0231), top: B:202:0x010f }] */
    /* JADX WARN: Code duplicated, block: B:119:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:120:0x02d2 A[Catch: all -> 0x0465, TryCatch #1 {all -> 0x0465, blocks: (B:14:0x010f, B:16:0x0117, B:18:0x011d, B:20:0x0123, B:22:0x0129, B:24:0x012f, B:26:0x0135, B:28:0x013b, B:30:0x0141, B:32:0x0147, B:34:0x014d, B:36:0x0153, B:38:0x015b, B:40:0x0163, B:42:0x016d, B:44:0x0177, B:46:0x0181, B:48:0x018b, B:50:0x0195, B:52:0x019f, B:54:0x01a9, B:56:0x01b3, B:58:0x01bd, B:60:0x01c7, B:62:0x01d1, B:81:0x0228, B:85:0x0237, B:89:0x0246, B:93:0x0253, B:97:0x0268, B:101:0x027d, B:105:0x0294, B:109:0x02a3, B:113:0x02b0, B:117:0x02c5, B:121:0x02da, B:125:0x02ef, B:129:0x0300, B:133:0x030d, B:137:0x0324, B:141:0x0337, B:145:0x0348, B:149:0x035d, B:151:0x0373, B:153:0x037d, B:155:0x0387, B:157:0x0391, B:159:0x039b, B:180:0x0410, B:181:0x041b, B:183:0x0431, B:184:0x0436, B:167:0x03b6, B:171:0x03c7, B:175:0x03dc, B:179:0x03ef, B:178:0x03e7, B:174:0x03d4, B:170:0x03bf, B:148:0x0359, B:144:0x0344, B:140:0x0331, B:136:0x031e, B:132:0x0309, B:124:0x02e7, B:120:0x02d2, B:116:0x02bd, B:112:0x02ac, B:108:0x029d, B:104:0x028e, B:100:0x0275, B:96:0x0260, B:92:0x024f, B:88:0x0240, B:84:0x0231), top: B:202:0x010f }] */
    /* JADX WARN: Code duplicated, block: B:123:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:124:0x02e7 A[Catch: all -> 0x0465, TryCatch #1 {all -> 0x0465, blocks: (B:14:0x010f, B:16:0x0117, B:18:0x011d, B:20:0x0123, B:22:0x0129, B:24:0x012f, B:26:0x0135, B:28:0x013b, B:30:0x0141, B:32:0x0147, B:34:0x014d, B:36:0x0153, B:38:0x015b, B:40:0x0163, B:42:0x016d, B:44:0x0177, B:46:0x0181, B:48:0x018b, B:50:0x0195, B:52:0x019f, B:54:0x01a9, B:56:0x01b3, B:58:0x01bd, B:60:0x01c7, B:62:0x01d1, B:81:0x0228, B:85:0x0237, B:89:0x0246, B:93:0x0253, B:97:0x0268, B:101:0x027d, B:105:0x0294, B:109:0x02a3, B:113:0x02b0, B:117:0x02c5, B:121:0x02da, B:125:0x02ef, B:129:0x0300, B:133:0x030d, B:137:0x0324, B:141:0x0337, B:145:0x0348, B:149:0x035d, B:151:0x0373, B:153:0x037d, B:155:0x0387, B:157:0x0391, B:159:0x039b, B:180:0x0410, B:181:0x041b, B:183:0x0431, B:184:0x0436, B:167:0x03b6, B:171:0x03c7, B:175:0x03dc, B:179:0x03ef, B:178:0x03e7, B:174:0x03d4, B:170:0x03bf, B:148:0x0359, B:144:0x0344, B:140:0x0331, B:136:0x031e, B:132:0x0309, B:124:0x02e7, B:120:0x02d2, B:116:0x02bd, B:112:0x02ac, B:108:0x029d, B:104:0x028e, B:100:0x0275, B:96:0x0260, B:92:0x024f, B:88:0x0240, B:84:0x0231), top: B:202:0x010f }] */
    /* JADX WARN: Code duplicated, block: B:127:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:128:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:131:0x0306  */
    /* JADX WARN: Code duplicated, block: B:132:0x0309 A[Catch: all -> 0x0465, TryCatch #1 {all -> 0x0465, blocks: (B:14:0x010f, B:16:0x0117, B:18:0x011d, B:20:0x0123, B:22:0x0129, B:24:0x012f, B:26:0x0135, B:28:0x013b, B:30:0x0141, B:32:0x0147, B:34:0x014d, B:36:0x0153, B:38:0x015b, B:40:0x0163, B:42:0x016d, B:44:0x0177, B:46:0x0181, B:48:0x018b, B:50:0x0195, B:52:0x019f, B:54:0x01a9, B:56:0x01b3, B:58:0x01bd, B:60:0x01c7, B:62:0x01d1, B:81:0x0228, B:85:0x0237, B:89:0x0246, B:93:0x0253, B:97:0x0268, B:101:0x027d, B:105:0x0294, B:109:0x02a3, B:113:0x02b0, B:117:0x02c5, B:121:0x02da, B:125:0x02ef, B:129:0x0300, B:133:0x030d, B:137:0x0324, B:141:0x0337, B:145:0x0348, B:149:0x035d, B:151:0x0373, B:153:0x037d, B:155:0x0387, B:157:0x0391, B:159:0x039b, B:180:0x0410, B:181:0x041b, B:183:0x0431, B:184:0x0436, B:167:0x03b6, B:171:0x03c7, B:175:0x03dc, B:179:0x03ef, B:178:0x03e7, B:174:0x03d4, B:170:0x03bf, B:148:0x0359, B:144:0x0344, B:140:0x0331, B:136:0x031e, B:132:0x0309, B:124:0x02e7, B:120:0x02d2, B:116:0x02bd, B:112:0x02ac, B:108:0x029d, B:104:0x028e, B:100:0x0275, B:96:0x0260, B:92:0x024f, B:88:0x0240, B:84:0x0231), top: B:202:0x010f }] */
    /* JADX WARN: Code duplicated, block: B:135:0x031b  */
    /* JADX WARN: Code duplicated, block: B:136:0x031e A[Catch: all -> 0x0465, TryCatch #1 {all -> 0x0465, blocks: (B:14:0x010f, B:16:0x0117, B:18:0x011d, B:20:0x0123, B:22:0x0129, B:24:0x012f, B:26:0x0135, B:28:0x013b, B:30:0x0141, B:32:0x0147, B:34:0x014d, B:36:0x0153, B:38:0x015b, B:40:0x0163, B:42:0x016d, B:44:0x0177, B:46:0x0181, B:48:0x018b, B:50:0x0195, B:52:0x019f, B:54:0x01a9, B:56:0x01b3, B:58:0x01bd, B:60:0x01c7, B:62:0x01d1, B:81:0x0228, B:85:0x0237, B:89:0x0246, B:93:0x0253, B:97:0x0268, B:101:0x027d, B:105:0x0294, B:109:0x02a3, B:113:0x02b0, B:117:0x02c5, B:121:0x02da, B:125:0x02ef, B:129:0x0300, B:133:0x030d, B:137:0x0324, B:141:0x0337, B:145:0x0348, B:149:0x035d, B:151:0x0373, B:153:0x037d, B:155:0x0387, B:157:0x0391, B:159:0x039b, B:180:0x0410, B:181:0x041b, B:183:0x0431, B:184:0x0436, B:167:0x03b6, B:171:0x03c7, B:175:0x03dc, B:179:0x03ef, B:178:0x03e7, B:174:0x03d4, B:170:0x03bf, B:148:0x0359, B:144:0x0344, B:140:0x0331, B:136:0x031e, B:132:0x0309, B:124:0x02e7, B:120:0x02d2, B:116:0x02bd, B:112:0x02ac, B:108:0x029d, B:104:0x028e, B:100:0x0275, B:96:0x0260, B:92:0x024f, B:88:0x0240, B:84:0x0231), top: B:202:0x010f }] */
    /* JADX WARN: Code duplicated, block: B:139:0x032e  */
    /* JADX WARN: Code duplicated, block: B:140:0x0331 A[Catch: all -> 0x0465, TryCatch #1 {all -> 0x0465, blocks: (B:14:0x010f, B:16:0x0117, B:18:0x011d, B:20:0x0123, B:22:0x0129, B:24:0x012f, B:26:0x0135, B:28:0x013b, B:30:0x0141, B:32:0x0147, B:34:0x014d, B:36:0x0153, B:38:0x015b, B:40:0x0163, B:42:0x016d, B:44:0x0177, B:46:0x0181, B:48:0x018b, B:50:0x0195, B:52:0x019f, B:54:0x01a9, B:56:0x01b3, B:58:0x01bd, B:60:0x01c7, B:62:0x01d1, B:81:0x0228, B:85:0x0237, B:89:0x0246, B:93:0x0253, B:97:0x0268, B:101:0x027d, B:105:0x0294, B:109:0x02a3, B:113:0x02b0, B:117:0x02c5, B:121:0x02da, B:125:0x02ef, B:129:0x0300, B:133:0x030d, B:137:0x0324, B:141:0x0337, B:145:0x0348, B:149:0x035d, B:151:0x0373, B:153:0x037d, B:155:0x0387, B:157:0x0391, B:159:0x039b, B:180:0x0410, B:181:0x041b, B:183:0x0431, B:184:0x0436, B:167:0x03b6, B:171:0x03c7, B:175:0x03dc, B:179:0x03ef, B:178:0x03e7, B:174:0x03d4, B:170:0x03bf, B:148:0x0359, B:144:0x0344, B:140:0x0331, B:136:0x031e, B:132:0x0309, B:124:0x02e7, B:120:0x02d2, B:116:0x02bd, B:112:0x02ac, B:108:0x029d, B:104:0x028e, B:100:0x0275, B:96:0x0260, B:92:0x024f, B:88:0x0240, B:84:0x0231), top: B:202:0x010f }] */
    /* JADX WARN: Code duplicated, block: B:143:0x0341  */
    /* JADX WARN: Code duplicated, block: B:144:0x0344 A[Catch: all -> 0x0465, TryCatch #1 {all -> 0x0465, blocks: (B:14:0x010f, B:16:0x0117, B:18:0x011d, B:20:0x0123, B:22:0x0129, B:24:0x012f, B:26:0x0135, B:28:0x013b, B:30:0x0141, B:32:0x0147, B:34:0x014d, B:36:0x0153, B:38:0x015b, B:40:0x0163, B:42:0x016d, B:44:0x0177, B:46:0x0181, B:48:0x018b, B:50:0x0195, B:52:0x019f, B:54:0x01a9, B:56:0x01b3, B:58:0x01bd, B:60:0x01c7, B:62:0x01d1, B:81:0x0228, B:85:0x0237, B:89:0x0246, B:93:0x0253, B:97:0x0268, B:101:0x027d, B:105:0x0294, B:109:0x02a3, B:113:0x02b0, B:117:0x02c5, B:121:0x02da, B:125:0x02ef, B:129:0x0300, B:133:0x030d, B:137:0x0324, B:141:0x0337, B:145:0x0348, B:149:0x035d, B:151:0x0373, B:153:0x037d, B:155:0x0387, B:157:0x0391, B:159:0x039b, B:180:0x0410, B:181:0x041b, B:183:0x0431, B:184:0x0436, B:167:0x03b6, B:171:0x03c7, B:175:0x03dc, B:179:0x03ef, B:178:0x03e7, B:174:0x03d4, B:170:0x03bf, B:148:0x0359, B:144:0x0344, B:140:0x0331, B:136:0x031e, B:132:0x0309, B:124:0x02e7, B:120:0x02d2, B:116:0x02bd, B:112:0x02ac, B:108:0x029d, B:104:0x028e, B:100:0x0275, B:96:0x0260, B:92:0x024f, B:88:0x0240, B:84:0x0231), top: B:202:0x010f }] */
    /* JADX WARN: Code duplicated, block: B:147:0x0356  */
    /* JADX WARN: Code duplicated, block: B:148:0x0359 A[Catch: all -> 0x0465, TryCatch #1 {all -> 0x0465, blocks: (B:14:0x010f, B:16:0x0117, B:18:0x011d, B:20:0x0123, B:22:0x0129, B:24:0x012f, B:26:0x0135, B:28:0x013b, B:30:0x0141, B:32:0x0147, B:34:0x014d, B:36:0x0153, B:38:0x015b, B:40:0x0163, B:42:0x016d, B:44:0x0177, B:46:0x0181, B:48:0x018b, B:50:0x0195, B:52:0x019f, B:54:0x01a9, B:56:0x01b3, B:58:0x01bd, B:60:0x01c7, B:62:0x01d1, B:81:0x0228, B:85:0x0237, B:89:0x0246, B:93:0x0253, B:97:0x0268, B:101:0x027d, B:105:0x0294, B:109:0x02a3, B:113:0x02b0, B:117:0x02c5, B:121:0x02da, B:125:0x02ef, B:129:0x0300, B:133:0x030d, B:137:0x0324, B:141:0x0337, B:145:0x0348, B:149:0x035d, B:151:0x0373, B:153:0x037d, B:155:0x0387, B:157:0x0391, B:159:0x039b, B:180:0x0410, B:181:0x041b, B:183:0x0431, B:184:0x0436, B:167:0x03b6, B:171:0x03c7, B:175:0x03dc, B:179:0x03ef, B:178:0x03e7, B:174:0x03d4, B:170:0x03bf, B:148:0x0359, B:144:0x0344, B:140:0x0331, B:136:0x031e, B:132:0x0309, B:124:0x02e7, B:120:0x02d2, B:116:0x02bd, B:112:0x02ac, B:108:0x029d, B:104:0x028e, B:100:0x0275, B:96:0x0260, B:92:0x024f, B:88:0x0240, B:84:0x0231), top: B:202:0x010f }] */
    /* JADX WARN: Code duplicated, block: B:151:0x0373 A[Catch: all -> 0x0465, TryCatch #1 {all -> 0x0465, blocks: (B:14:0x010f, B:16:0x0117, B:18:0x011d, B:20:0x0123, B:22:0x0129, B:24:0x012f, B:26:0x0135, B:28:0x013b, B:30:0x0141, B:32:0x0147, B:34:0x014d, B:36:0x0153, B:38:0x015b, B:40:0x0163, B:42:0x016d, B:44:0x0177, B:46:0x0181, B:48:0x018b, B:50:0x0195, B:52:0x019f, B:54:0x01a9, B:56:0x01b3, B:58:0x01bd, B:60:0x01c7, B:62:0x01d1, B:81:0x0228, B:85:0x0237, B:89:0x0246, B:93:0x0253, B:97:0x0268, B:101:0x027d, B:105:0x0294, B:109:0x02a3, B:113:0x02b0, B:117:0x02c5, B:121:0x02da, B:125:0x02ef, B:129:0x0300, B:133:0x030d, B:137:0x0324, B:141:0x0337, B:145:0x0348, B:149:0x035d, B:151:0x0373, B:153:0x037d, B:155:0x0387, B:157:0x0391, B:159:0x039b, B:180:0x0410, B:181:0x041b, B:183:0x0431, B:184:0x0436, B:167:0x03b6, B:171:0x03c7, B:175:0x03dc, B:179:0x03ef, B:178:0x03e7, B:174:0x03d4, B:170:0x03bf, B:148:0x0359, B:144:0x0344, B:140:0x0331, B:136:0x031e, B:132:0x0309, B:124:0x02e7, B:120:0x02d2, B:116:0x02bd, B:112:0x02ac, B:108:0x029d, B:104:0x028e, B:100:0x0275, B:96:0x0260, B:92:0x024f, B:88:0x0240, B:84:0x0231), top: B:202:0x010f }] */
    /* JADX WARN: Code duplicated, block: B:153:0x037d A[Catch: all -> 0x0465, TryCatch #1 {all -> 0x0465, blocks: (B:14:0x010f, B:16:0x0117, B:18:0x011d, B:20:0x0123, B:22:0x0129, B:24:0x012f, B:26:0x0135, B:28:0x013b, B:30:0x0141, B:32:0x0147, B:34:0x014d, B:36:0x0153, B:38:0x015b, B:40:0x0163, B:42:0x016d, B:44:0x0177, B:46:0x0181, B:48:0x018b, B:50:0x0195, B:52:0x019f, B:54:0x01a9, B:56:0x01b3, B:58:0x01bd, B:60:0x01c7, B:62:0x01d1, B:81:0x0228, B:85:0x0237, B:89:0x0246, B:93:0x0253, B:97:0x0268, B:101:0x027d, B:105:0x0294, B:109:0x02a3, B:113:0x02b0, B:117:0x02c5, B:121:0x02da, B:125:0x02ef, B:129:0x0300, B:133:0x030d, B:137:0x0324, B:141:0x0337, B:145:0x0348, B:149:0x035d, B:151:0x0373, B:153:0x037d, B:155:0x0387, B:157:0x0391, B:159:0x039b, B:180:0x0410, B:181:0x041b, B:183:0x0431, B:184:0x0436, B:167:0x03b6, B:171:0x03c7, B:175:0x03dc, B:179:0x03ef, B:178:0x03e7, B:174:0x03d4, B:170:0x03bf, B:148:0x0359, B:144:0x0344, B:140:0x0331, B:136:0x031e, B:132:0x0309, B:124:0x02e7, B:120:0x02d2, B:116:0x02bd, B:112:0x02ac, B:108:0x029d, B:104:0x028e, B:100:0x0275, B:96:0x0260, B:92:0x024f, B:88:0x0240, B:84:0x0231), top: B:202:0x010f }] */
    /* JADX WARN: Code duplicated, block: B:155:0x0387 A[Catch: all -> 0x0465, TryCatch #1 {all -> 0x0465, blocks: (B:14:0x010f, B:16:0x0117, B:18:0x011d, B:20:0x0123, B:22:0x0129, B:24:0x012f, B:26:0x0135, B:28:0x013b, B:30:0x0141, B:32:0x0147, B:34:0x014d, B:36:0x0153, B:38:0x015b, B:40:0x0163, B:42:0x016d, B:44:0x0177, B:46:0x0181, B:48:0x018b, B:50:0x0195, B:52:0x019f, B:54:0x01a9, B:56:0x01b3, B:58:0x01bd, B:60:0x01c7, B:62:0x01d1, B:81:0x0228, B:85:0x0237, B:89:0x0246, B:93:0x0253, B:97:0x0268, B:101:0x027d, B:105:0x0294, B:109:0x02a3, B:113:0x02b0, B:117:0x02c5, B:121:0x02da, B:125:0x02ef, B:129:0x0300, B:133:0x030d, B:137:0x0324, B:141:0x0337, B:145:0x0348, B:149:0x035d, B:151:0x0373, B:153:0x037d, B:155:0x0387, B:157:0x0391, B:159:0x039b, B:180:0x0410, B:181:0x041b, B:183:0x0431, B:184:0x0436, B:167:0x03b6, B:171:0x03c7, B:175:0x03dc, B:179:0x03ef, B:178:0x03e7, B:174:0x03d4, B:170:0x03bf, B:148:0x0359, B:144:0x0344, B:140:0x0331, B:136:0x031e, B:132:0x0309, B:124:0x02e7, B:120:0x02d2, B:116:0x02bd, B:112:0x02ac, B:108:0x029d, B:104:0x028e, B:100:0x0275, B:96:0x0260, B:92:0x024f, B:88:0x0240, B:84:0x0231), top: B:202:0x010f }] */
    /* JADX WARN: Code duplicated, block: B:157:0x0391 A[Catch: all -> 0x0465, TryCatch #1 {all -> 0x0465, blocks: (B:14:0x010f, B:16:0x0117, B:18:0x011d, B:20:0x0123, B:22:0x0129, B:24:0x012f, B:26:0x0135, B:28:0x013b, B:30:0x0141, B:32:0x0147, B:34:0x014d, B:36:0x0153, B:38:0x015b, B:40:0x0163, B:42:0x016d, B:44:0x0177, B:46:0x0181, B:48:0x018b, B:50:0x0195, B:52:0x019f, B:54:0x01a9, B:56:0x01b3, B:58:0x01bd, B:60:0x01c7, B:62:0x01d1, B:81:0x0228, B:85:0x0237, B:89:0x0246, B:93:0x0253, B:97:0x0268, B:101:0x027d, B:105:0x0294, B:109:0x02a3, B:113:0x02b0, B:117:0x02c5, B:121:0x02da, B:125:0x02ef, B:129:0x0300, B:133:0x030d, B:137:0x0324, B:141:0x0337, B:145:0x0348, B:149:0x035d, B:151:0x0373, B:153:0x037d, B:155:0x0387, B:157:0x0391, B:159:0x039b, B:180:0x0410, B:181:0x041b, B:183:0x0431, B:184:0x0436, B:167:0x03b6, B:171:0x03c7, B:175:0x03dc, B:179:0x03ef, B:178:0x03e7, B:174:0x03d4, B:170:0x03bf, B:148:0x0359, B:144:0x0344, B:140:0x0331, B:136:0x031e, B:132:0x0309, B:124:0x02e7, B:120:0x02d2, B:116:0x02bd, B:112:0x02ac, B:108:0x029d, B:104:0x028e, B:100:0x0275, B:96:0x0260, B:92:0x024f, B:88:0x0240, B:84:0x0231), top: B:202:0x010f }] */
    /* JADX WARN: Code duplicated, block: B:159:0x039b A[Catch: all -> 0x0465, TryCatch #1 {all -> 0x0465, blocks: (B:14:0x010f, B:16:0x0117, B:18:0x011d, B:20:0x0123, B:22:0x0129, B:24:0x012f, B:26:0x0135, B:28:0x013b, B:30:0x0141, B:32:0x0147, B:34:0x014d, B:36:0x0153, B:38:0x015b, B:40:0x0163, B:42:0x016d, B:44:0x0177, B:46:0x0181, B:48:0x018b, B:50:0x0195, B:52:0x019f, B:54:0x01a9, B:56:0x01b3, B:58:0x01bd, B:60:0x01c7, B:62:0x01d1, B:81:0x0228, B:85:0x0237, B:89:0x0246, B:93:0x0253, B:97:0x0268, B:101:0x027d, B:105:0x0294, B:109:0x02a3, B:113:0x02b0, B:117:0x02c5, B:121:0x02da, B:125:0x02ef, B:129:0x0300, B:133:0x030d, B:137:0x0324, B:141:0x0337, B:145:0x0348, B:149:0x035d, B:151:0x0373, B:153:0x037d, B:155:0x0387, B:157:0x0391, B:159:0x039b, B:180:0x0410, B:181:0x041b, B:183:0x0431, B:184:0x0436, B:167:0x03b6, B:171:0x03c7, B:175:0x03dc, B:179:0x03ef, B:178:0x03e7, B:174:0x03d4, B:170:0x03bf, B:148:0x0359, B:144:0x0344, B:140:0x0331, B:136:0x031e, B:132:0x0309, B:124:0x02e7, B:120:0x02d2, B:116:0x02bd, B:112:0x02ac, B:108:0x029d, B:104:0x028e, B:100:0x0275, B:96:0x0260, B:92:0x024f, B:88:0x0240, B:84:0x0231), top: B:202:0x010f }] */
    /* JADX WARN: Code duplicated, block: B:163:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:169:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:170:0x03bf A[Catch: all -> 0x0465, TryCatch #1 {all -> 0x0465, blocks: (B:14:0x010f, B:16:0x0117, B:18:0x011d, B:20:0x0123, B:22:0x0129, B:24:0x012f, B:26:0x0135, B:28:0x013b, B:30:0x0141, B:32:0x0147, B:34:0x014d, B:36:0x0153, B:38:0x015b, B:40:0x0163, B:42:0x016d, B:44:0x0177, B:46:0x0181, B:48:0x018b, B:50:0x0195, B:52:0x019f, B:54:0x01a9, B:56:0x01b3, B:58:0x01bd, B:60:0x01c7, B:62:0x01d1, B:81:0x0228, B:85:0x0237, B:89:0x0246, B:93:0x0253, B:97:0x0268, B:101:0x027d, B:105:0x0294, B:109:0x02a3, B:113:0x02b0, B:117:0x02c5, B:121:0x02da, B:125:0x02ef, B:129:0x0300, B:133:0x030d, B:137:0x0324, B:141:0x0337, B:145:0x0348, B:149:0x035d, B:151:0x0373, B:153:0x037d, B:155:0x0387, B:157:0x0391, B:159:0x039b, B:180:0x0410, B:181:0x041b, B:183:0x0431, B:184:0x0436, B:167:0x03b6, B:171:0x03c7, B:175:0x03dc, B:179:0x03ef, B:178:0x03e7, B:174:0x03d4, B:170:0x03bf, B:148:0x0359, B:144:0x0344, B:140:0x0331, B:136:0x031e, B:132:0x0309, B:124:0x02e7, B:120:0x02d2, B:116:0x02bd, B:112:0x02ac, B:108:0x029d, B:104:0x028e, B:100:0x0275, B:96:0x0260, B:92:0x024f, B:88:0x0240, B:84:0x0231), top: B:202:0x010f }] */
    /* JADX WARN: Code duplicated, block: B:173:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:174:0x03d4 A[Catch: all -> 0x0465, TryCatch #1 {all -> 0x0465, blocks: (B:14:0x010f, B:16:0x0117, B:18:0x011d, B:20:0x0123, B:22:0x0129, B:24:0x012f, B:26:0x0135, B:28:0x013b, B:30:0x0141, B:32:0x0147, B:34:0x014d, B:36:0x0153, B:38:0x015b, B:40:0x0163, B:42:0x016d, B:44:0x0177, B:46:0x0181, B:48:0x018b, B:50:0x0195, B:52:0x019f, B:54:0x01a9, B:56:0x01b3, B:58:0x01bd, B:60:0x01c7, B:62:0x01d1, B:81:0x0228, B:85:0x0237, B:89:0x0246, B:93:0x0253, B:97:0x0268, B:101:0x027d, B:105:0x0294, B:109:0x02a3, B:113:0x02b0, B:117:0x02c5, B:121:0x02da, B:125:0x02ef, B:129:0x0300, B:133:0x030d, B:137:0x0324, B:141:0x0337, B:145:0x0348, B:149:0x035d, B:151:0x0373, B:153:0x037d, B:155:0x0387, B:157:0x0391, B:159:0x039b, B:180:0x0410, B:181:0x041b, B:183:0x0431, B:184:0x0436, B:167:0x03b6, B:171:0x03c7, B:175:0x03dc, B:179:0x03ef, B:178:0x03e7, B:174:0x03d4, B:170:0x03bf, B:148:0x0359, B:144:0x0344, B:140:0x0331, B:136:0x031e, B:132:0x0309, B:124:0x02e7, B:120:0x02d2, B:116:0x02bd, B:112:0x02ac, B:108:0x029d, B:104:0x028e, B:100:0x0275, B:96:0x0260, B:92:0x024f, B:88:0x0240, B:84:0x0231), top: B:202:0x010f }] */
    /* JADX WARN: Code duplicated, block: B:177:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:178:0x03e7 A[Catch: all -> 0x0465, TryCatch #1 {all -> 0x0465, blocks: (B:14:0x010f, B:16:0x0117, B:18:0x011d, B:20:0x0123, B:22:0x0129, B:24:0x012f, B:26:0x0135, B:28:0x013b, B:30:0x0141, B:32:0x0147, B:34:0x014d, B:36:0x0153, B:38:0x015b, B:40:0x0163, B:42:0x016d, B:44:0x0177, B:46:0x0181, B:48:0x018b, B:50:0x0195, B:52:0x019f, B:54:0x01a9, B:56:0x01b3, B:58:0x01bd, B:60:0x01c7, B:62:0x01d1, B:81:0x0228, B:85:0x0237, B:89:0x0246, B:93:0x0253, B:97:0x0268, B:101:0x027d, B:105:0x0294, B:109:0x02a3, B:113:0x02b0, B:117:0x02c5, B:121:0x02da, B:125:0x02ef, B:129:0x0300, B:133:0x030d, B:137:0x0324, B:141:0x0337, B:145:0x0348, B:149:0x035d, B:151:0x0373, B:153:0x037d, B:155:0x0387, B:157:0x0391, B:159:0x039b, B:180:0x0410, B:181:0x041b, B:183:0x0431, B:184:0x0436, B:167:0x03b6, B:171:0x03c7, B:175:0x03dc, B:179:0x03ef, B:178:0x03e7, B:174:0x03d4, B:170:0x03bf, B:148:0x0359, B:144:0x0344, B:140:0x0331, B:136:0x031e, B:132:0x0309, B:124:0x02e7, B:120:0x02d2, B:116:0x02bd, B:112:0x02ac, B:108:0x029d, B:104:0x028e, B:100:0x0275, B:96:0x0260, B:92:0x024f, B:88:0x0240, B:84:0x0231), top: B:202:0x010f }] */
    /* JADX WARN: Code duplicated, block: B:183:0x0431 A[Catch: all -> 0x0465, TryCatch #1 {all -> 0x0465, blocks: (B:14:0x010f, B:16:0x0117, B:18:0x011d, B:20:0x0123, B:22:0x0129, B:24:0x012f, B:26:0x0135, B:28:0x013b, B:30:0x0141, B:32:0x0147, B:34:0x014d, B:36:0x0153, B:38:0x015b, B:40:0x0163, B:42:0x016d, B:44:0x0177, B:46:0x0181, B:48:0x018b, B:50:0x0195, B:52:0x019f, B:54:0x01a9, B:56:0x01b3, B:58:0x01bd, B:60:0x01c7, B:62:0x01d1, B:81:0x0228, B:85:0x0237, B:89:0x0246, B:93:0x0253, B:97:0x0268, B:101:0x027d, B:105:0x0294, B:109:0x02a3, B:113:0x02b0, B:117:0x02c5, B:121:0x02da, B:125:0x02ef, B:129:0x0300, B:133:0x030d, B:137:0x0324, B:141:0x0337, B:145:0x0348, B:149:0x035d, B:151:0x0373, B:153:0x037d, B:155:0x0387, B:157:0x0391, B:159:0x039b, B:180:0x0410, B:181:0x041b, B:183:0x0431, B:184:0x0436, B:167:0x03b6, B:171:0x03c7, B:175:0x03dc, B:179:0x03ef, B:178:0x03e7, B:174:0x03d4, B:170:0x03bf, B:148:0x0359, B:144:0x0344, B:140:0x0331, B:136:0x031e, B:132:0x0309, B:124:0x02e7, B:120:0x02d2, B:116:0x02bd, B:112:0x02ac, B:108:0x029d, B:104:0x028e, B:100:0x0275, B:96:0x0260, B:92:0x024f, B:88:0x0240, B:84:0x0231), top: B:202:0x010f }] */
    /* JADX WARN: Code duplicated, block: B:83:0x022e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0231 A[Catch: all -> 0x0465, TryCatch #1 {all -> 0x0465, blocks: (B:14:0x010f, B:16:0x0117, B:18:0x011d, B:20:0x0123, B:22:0x0129, B:24:0x012f, B:26:0x0135, B:28:0x013b, B:30:0x0141, B:32:0x0147, B:34:0x014d, B:36:0x0153, B:38:0x015b, B:40:0x0163, B:42:0x016d, B:44:0x0177, B:46:0x0181, B:48:0x018b, B:50:0x0195, B:52:0x019f, B:54:0x01a9, B:56:0x01b3, B:58:0x01bd, B:60:0x01c7, B:62:0x01d1, B:81:0x0228, B:85:0x0237, B:89:0x0246, B:93:0x0253, B:97:0x0268, B:101:0x027d, B:105:0x0294, B:109:0x02a3, B:113:0x02b0, B:117:0x02c5, B:121:0x02da, B:125:0x02ef, B:129:0x0300, B:133:0x030d, B:137:0x0324, B:141:0x0337, B:145:0x0348, B:149:0x035d, B:151:0x0373, B:153:0x037d, B:155:0x0387, B:157:0x0391, B:159:0x039b, B:180:0x0410, B:181:0x041b, B:183:0x0431, B:184:0x0436, B:167:0x03b6, B:171:0x03c7, B:175:0x03dc, B:179:0x03ef, B:178:0x03e7, B:174:0x03d4, B:170:0x03bf, B:148:0x0359, B:144:0x0344, B:140:0x0331, B:136:0x031e, B:132:0x0309, B:124:0x02e7, B:120:0x02d2, B:116:0x02bd, B:112:0x02ac, B:108:0x029d, B:104:0x028e, B:100:0x0275, B:96:0x0260, B:92:0x024f, B:88:0x0240, B:84:0x0231), top: B:202:0x010f }] */
    /* JADX WARN: Code duplicated, block: B:87:0x023d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0240 A[Catch: all -> 0x0465, TryCatch #1 {all -> 0x0465, blocks: (B:14:0x010f, B:16:0x0117, B:18:0x011d, B:20:0x0123, B:22:0x0129, B:24:0x012f, B:26:0x0135, B:28:0x013b, B:30:0x0141, B:32:0x0147, B:34:0x014d, B:36:0x0153, B:38:0x015b, B:40:0x0163, B:42:0x016d, B:44:0x0177, B:46:0x0181, B:48:0x018b, B:50:0x0195, B:52:0x019f, B:54:0x01a9, B:56:0x01b3, B:58:0x01bd, B:60:0x01c7, B:62:0x01d1, B:81:0x0228, B:85:0x0237, B:89:0x0246, B:93:0x0253, B:97:0x0268, B:101:0x027d, B:105:0x0294, B:109:0x02a3, B:113:0x02b0, B:117:0x02c5, B:121:0x02da, B:125:0x02ef, B:129:0x0300, B:133:0x030d, B:137:0x0324, B:141:0x0337, B:145:0x0348, B:149:0x035d, B:151:0x0373, B:153:0x037d, B:155:0x0387, B:157:0x0391, B:159:0x039b, B:180:0x0410, B:181:0x041b, B:183:0x0431, B:184:0x0436, B:167:0x03b6, B:171:0x03c7, B:175:0x03dc, B:179:0x03ef, B:178:0x03e7, B:174:0x03d4, B:170:0x03bf, B:148:0x0359, B:144:0x0344, B:140:0x0331, B:136:0x031e, B:132:0x0309, B:124:0x02e7, B:120:0x02d2, B:116:0x02bd, B:112:0x02ac, B:108:0x029d, B:104:0x028e, B:100:0x0275, B:96:0x0260, B:92:0x024f, B:88:0x0240, B:84:0x0231), top: B:202:0x010f }] */
    /* JADX WARN: Code duplicated, block: B:91:0x024c  */
    /* JADX WARN: Code duplicated, block: B:92:0x024f A[Catch: all -> 0x0465, TryCatch #1 {all -> 0x0465, blocks: (B:14:0x010f, B:16:0x0117, B:18:0x011d, B:20:0x0123, B:22:0x0129, B:24:0x012f, B:26:0x0135, B:28:0x013b, B:30:0x0141, B:32:0x0147, B:34:0x014d, B:36:0x0153, B:38:0x015b, B:40:0x0163, B:42:0x016d, B:44:0x0177, B:46:0x0181, B:48:0x018b, B:50:0x0195, B:52:0x019f, B:54:0x01a9, B:56:0x01b3, B:58:0x01bd, B:60:0x01c7, B:62:0x01d1, B:81:0x0228, B:85:0x0237, B:89:0x0246, B:93:0x0253, B:97:0x0268, B:101:0x027d, B:105:0x0294, B:109:0x02a3, B:113:0x02b0, B:117:0x02c5, B:121:0x02da, B:125:0x02ef, B:129:0x0300, B:133:0x030d, B:137:0x0324, B:141:0x0337, B:145:0x0348, B:149:0x035d, B:151:0x0373, B:153:0x037d, B:155:0x0387, B:157:0x0391, B:159:0x039b, B:180:0x0410, B:181:0x041b, B:183:0x0431, B:184:0x0436, B:167:0x03b6, B:171:0x03c7, B:175:0x03dc, B:179:0x03ef, B:178:0x03e7, B:174:0x03d4, B:170:0x03bf, B:148:0x0359, B:144:0x0344, B:140:0x0331, B:136:0x031e, B:132:0x0309, B:124:0x02e7, B:120:0x02d2, B:116:0x02bd, B:112:0x02ac, B:108:0x029d, B:104:0x028e, B:100:0x0275, B:96:0x0260, B:92:0x024f, B:88:0x0240, B:84:0x0231), top: B:202:0x010f }] */
    /* JADX WARN: Code duplicated, block: B:95:0x025d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0260 A[Catch: all -> 0x0465, TryCatch #1 {all -> 0x0465, blocks: (B:14:0x010f, B:16:0x0117, B:18:0x011d, B:20:0x0123, B:22:0x0129, B:24:0x012f, B:26:0x0135, B:28:0x013b, B:30:0x0141, B:32:0x0147, B:34:0x014d, B:36:0x0153, B:38:0x015b, B:40:0x0163, B:42:0x016d, B:44:0x0177, B:46:0x0181, B:48:0x018b, B:50:0x0195, B:52:0x019f, B:54:0x01a9, B:56:0x01b3, B:58:0x01bd, B:60:0x01c7, B:62:0x01d1, B:81:0x0228, B:85:0x0237, B:89:0x0246, B:93:0x0253, B:97:0x0268, B:101:0x027d, B:105:0x0294, B:109:0x02a3, B:113:0x02b0, B:117:0x02c5, B:121:0x02da, B:125:0x02ef, B:129:0x0300, B:133:0x030d, B:137:0x0324, B:141:0x0337, B:145:0x0348, B:149:0x035d, B:151:0x0373, B:153:0x037d, B:155:0x0387, B:157:0x0391, B:159:0x039b, B:180:0x0410, B:181:0x041b, B:183:0x0431, B:184:0x0436, B:167:0x03b6, B:171:0x03c7, B:175:0x03dc, B:179:0x03ef, B:178:0x03e7, B:174:0x03d4, B:170:0x03bf, B:148:0x0359, B:144:0x0344, B:140:0x0331, B:136:0x031e, B:132:0x0309, B:124:0x02e7, B:120:0x02d2, B:116:0x02bd, B:112:0x02ac, B:108:0x029d, B:104:0x028e, B:100:0x0275, B:96:0x0260, B:92:0x024f, B:88:0x0240, B:84:0x0231), top: B:202:0x010f }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0272  */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        int i;
        int i2;
        ArrayList arrayList;
        int i3;
        HashMap map;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        nqh nqhVar;
        int i15;
        ArrayList arrayList2;
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
        int i16;
        String string8;
        int i17;
        String string9;
        int i18;
        byte[] blob;
        int i19;
        byte[] blob2;
        int i20;
        Long lValueOf6;
        Long lValueOf7;
        npk npkVar;
        nqr nqrVar = this;
        nqrVar.b.a.h();
        try {
            Cursor cursorI = fy.i(nqrVar.b.a, nqrVar.a, true);
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
                int i21 = iL13;
                int iL20 = fy.l(cursorI, "status_addedToAirlockEpochTimestamp");
                int iL21 = fy.l(cursorI, "status_uploadToF250RequestedEpochTimestamp");
                int iL22 = fy.l(cursorI, "status_uploadToF250CompletedEpochTimestamp");
                int iL23 = fy.l(cursorI, "status_airlockFileState");
                int iL24 = fy.l(cursorI, "status_uploadState");
                int iL25 = fy.l(cursorI, "status_uploadProgressPercent");
                HashMap map2 = new HashMap();
                while (cursorI.moveToNext()) {
                    iL19 = iL19;
                    Long lValueOf8 = Long.valueOf(cursorI.getLong(iL19));
                    if (((ArrayList) map2.get(lValueOf8)) == null) {
                        map2.put(lValueOf8, new ArrayList());
                        iL12 = iL12;
                    }
                }
                int i22 = iL19;
                int i23 = iL12;
                cursorI.moveToPosition(-1);
                nqrVar.b.g(map2);
                ArrayList arrayList3 = new ArrayList(cursorI.getCount());
                while (cursorI.moveToNext()) {
                    try {
                        Long lValueOf9 = null;
                        if (cursorI.isNull(iL) && cursorI.isNull(iL2) && cursorI.isNull(iL3) && cursorI.isNull(iL4) && cursorI.isNull(iL5) && cursorI.isNull(iL6) && cursorI.isNull(iL7) && cursorI.isNull(iL8) && cursorI.isNull(iL9) && cursorI.isNull(iL10) && cursorI.isNull(iL11)) {
                            i2 = i23;
                            if (cursorI.isNull(i2)) {
                                i = i21;
                                if (cursorI.isNull(i)) {
                                    arrayList = arrayList3;
                                    i3 = iL14;
                                    if (cursorI.isNull(i3)) {
                                        map = map2;
                                        int i24 = iL15;
                                        if (cursorI.isNull(i24)) {
                                            iL15 = i24;
                                            int i25 = iL16;
                                            if (cursorI.isNull(i25)) {
                                                iL16 = i25;
                                                int i26 = iL17;
                                                if (cursorI.isNull(i26)) {
                                                    iL17 = i26;
                                                    int i27 = iL18;
                                                    if (cursorI.isNull(i27)) {
                                                        iL18 = i27;
                                                        int i28 = i22;
                                                        if (cursorI.isNull(i28)) {
                                                            i22 = i28;
                                                            int i29 = iL20;
                                                            if (cursorI.isNull(i29)) {
                                                                iL20 = i29;
                                                                int i30 = iL21;
                                                                if (cursorI.isNull(i30)) {
                                                                    iL21 = i30;
                                                                    int i31 = iL22;
                                                                    if (cursorI.isNull(i31)) {
                                                                        iL22 = i31;
                                                                        int i32 = iL23;
                                                                        if (cursorI.isNull(i32)) {
                                                                            iL23 = i32;
                                                                            int i33 = iL24;
                                                                            if (cursorI.isNull(i33)) {
                                                                                iL24 = i33;
                                                                                i4 = iL25;
                                                                                if (cursorI.isNull(i4)) {
                                                                                    i5 = i;
                                                                                    nqhVar = null;
                                                                                    i15 = i22;
                                                                                    i10 = i3;
                                                                                    i14 = iL21;
                                                                                    i9 = iL2;
                                                                                    i13 = iL22;
                                                                                    i8 = iL3;
                                                                                    i12 = iL23;
                                                                                    i7 = iL4;
                                                                                    i11 = iL24;
                                                                                    i6 = iL20;
                                                                                } else {
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
                                                                                    if (cursorI.isNull(i2)) {
                                                                                        lValueOf5 = null;
                                                                                    } else {
                                                                                        lValueOf5 = Long.valueOf(cursorI.getLong(i2));
                                                                                    }
                                                                                    pop popVarI4 = npy.i(lValueOf5);
                                                                                    if (cursorI.getInt(i) != 0) {
                                                                                        z = true;
                                                                                    } else {
                                                                                        z = false;
                                                                                    }
                                                                                    if (cursorI.isNull(i3)) {
                                                                                        string7 = null;
                                                                                    } else {
                                                                                        string7 = cursorI.getString(i3);
                                                                                    }
                                                                                    List listM = npy.m(string7);
                                                                                    i16 = iL15;
                                                                                    if (cursorI.isNull(i16)) {
                                                                                        string8 = null;
                                                                                    } else {
                                                                                        string8 = cursorI.getString(i16);
                                                                                    }
                                                                                    iL15 = i16;
                                                                                    i17 = iL16;
                                                                                    if (cursorI.isNull(i17)) {
                                                                                        string9 = null;
                                                                                    } else {
                                                                                        string9 = cursorI.getString(i17);
                                                                                    }
                                                                                    iL16 = i17;
                                                                                    i18 = iL17;
                                                                                    if (cursorI.isNull(i18)) {
                                                                                        blob = null;
                                                                                    } else {
                                                                                        blob = cursorI.getBlob(i18);
                                                                                    }
                                                                                    pti ptiVarC = npy.c(blob);
                                                                                    iL17 = i18;
                                                                                    i19 = iL18;
                                                                                    if (cursorI.isNull(i19)) {
                                                                                        blob2 = null;
                                                                                    } else {
                                                                                        blob2 = cursorI.getBlob(i19);
                                                                                    }
                                                                                    plu pluVarB = npy.b(blob2);
                                                                                    iL18 = i19;
                                                                                    i15 = i22;
                                                                                    long j2 = cursorI.getLong(i15);
                                                                                    i5 = i;
                                                                                    i20 = iL20;
                                                                                    if (cursorI.isNull(i20)) {
                                                                                        i10 = i3;
                                                                                        i14 = iL21;
                                                                                        if (cursorI.isNull(i14)) {
                                                                                            i9 = iL2;
                                                                                            i13 = iL22;
                                                                                            if (cursorI.isNull(i13)) {
                                                                                                i8 = iL3;
                                                                                                i12 = iL23;
                                                                                                if (cursorI.isNull(i12)) {
                                                                                                    i7 = iL4;
                                                                                                    i11 = iL24;
                                                                                                    if (!cursorI.isNull(i11) && cursorI.isNull(i4)) {
                                                                                                        npkVar = null;
                                                                                                    }
                                                                                                    i6 = i20;
                                                                                                    nqhVar = new nqh(string, string2, listN, prlVarH, popVarI, j, string4, string5, nmzVarV, popVarI2, popVarI3, popVarI4, z, listM, string8, string9, ptiVarC, pluVarB, npkVar, j2);
                                                                                                }
                                                                                                if (cursorI.isNull(i20)) {
                                                                                                    lValueOf6 = null;
                                                                                                } else {
                                                                                                    lValueOf6 = Long.valueOf(cursorI.getLong(i20));
                                                                                                }
                                                                                                prl prlVarH2 = npy.h(lValueOf6);
                                                                                                if (cursorI.isNull(i14)) {
                                                                                                    lValueOf7 = null;
                                                                                                } else {
                                                                                                    lValueOf7 = Long.valueOf(cursorI.getLong(i14));
                                                                                                }
                                                                                                prl prlVarH3 = npy.h(lValueOf7);
                                                                                                if (cursorI.isNull(i13)) {
                                                                                                    lValueOf9 = Long.valueOf(cursorI.getLong(i13));
                                                                                                }
                                                                                                npkVar = new npk(prlVarH2, prlVarH3, npy.h(lValueOf9), npy.j(cursorI.getInt(i12)), npy.k(cursorI.getInt(i11)), cursorI.getDouble(i4));
                                                                                                i6 = i20;
                                                                                                nqhVar = new nqh(string, string2, listN, prlVarH, popVarI, j, string4, string5, nmzVarV, popVarI2, popVarI3, popVarI4, z, listM, string8, string9, ptiVarC, pluVarB, npkVar, j2);
                                                                                            }
                                                                                            i7 = iL4;
                                                                                            i11 = iL24;
                                                                                            if (cursorI.isNull(i20)) {
                                                                                                lValueOf6 = null;
                                                                                            } else {
                                                                                                lValueOf6 = Long.valueOf(cursorI.getLong(i20));
                                                                                            }
                                                                                            prl prlVarH4 = npy.h(lValueOf6);
                                                                                            if (cursorI.isNull(i14)) {
                                                                                                lValueOf7 = null;
                                                                                            } else {
                                                                                                lValueOf7 = Long.valueOf(cursorI.getLong(i14));
                                                                                            }
                                                                                            prl prlVarH5 = npy.h(lValueOf7);
                                                                                            if (cursorI.isNull(i13)) {
                                                                                                lValueOf9 = Long.valueOf(cursorI.getLong(i13));
                                                                                            }
                                                                                            npkVar = new npk(prlVarH4, prlVarH5, npy.h(lValueOf9), npy.j(cursorI.getInt(i12)), npy.k(cursorI.getInt(i11)), cursorI.getDouble(i4));
                                                                                            i6 = i20;
                                                                                            nqhVar = new nqh(string, string2, listN, prlVarH, popVarI, j, string4, string5, nmzVarV, popVarI2, popVarI3, popVarI4, z, listM, string8, string9, ptiVarC, pluVarB, npkVar, j2);
                                                                                        }
                                                                                        i8 = iL3;
                                                                                        i12 = iL23;
                                                                                        i7 = iL4;
                                                                                        i11 = iL24;
                                                                                        if (cursorI.isNull(i20)) {
                                                                                            lValueOf6 = null;
                                                                                        } else {
                                                                                            lValueOf6 = Long.valueOf(cursorI.getLong(i20));
                                                                                        }
                                                                                        prl prlVarH6 = npy.h(lValueOf6);
                                                                                        if (cursorI.isNull(i14)) {
                                                                                            lValueOf7 = null;
                                                                                        } else {
                                                                                            lValueOf7 = Long.valueOf(cursorI.getLong(i14));
                                                                                        }
                                                                                        prl prlVarH7 = npy.h(lValueOf7);
                                                                                        if (cursorI.isNull(i13)) {
                                                                                            lValueOf9 = Long.valueOf(cursorI.getLong(i13));
                                                                                        }
                                                                                        npkVar = new npk(prlVarH6, prlVarH7, npy.h(lValueOf9), npy.j(cursorI.getInt(i12)), npy.k(cursorI.getInt(i11)), cursorI.getDouble(i4));
                                                                                        i6 = i20;
                                                                                        nqhVar = new nqh(string, string2, listN, prlVarH, popVarI, j, string4, string5, nmzVarV, popVarI2, popVarI3, popVarI4, z, listM, string8, string9, ptiVarC, pluVarB, npkVar, j2);
                                                                                    } else {
                                                                                        i10 = i3;
                                                                                        i14 = iL21;
                                                                                    }
                                                                                    i9 = iL2;
                                                                                    i13 = iL22;
                                                                                    i8 = iL3;
                                                                                    i12 = iL23;
                                                                                    i7 = iL4;
                                                                                    i11 = iL24;
                                                                                    if (cursorI.isNull(i20)) {
                                                                                        lValueOf6 = null;
                                                                                    } else {
                                                                                        lValueOf6 = Long.valueOf(cursorI.getLong(i20));
                                                                                    }
                                                                                    prl prlVarH8 = npy.h(lValueOf6);
                                                                                    if (cursorI.isNull(i14)) {
                                                                                        lValueOf7 = null;
                                                                                    } else {
                                                                                        lValueOf7 = Long.valueOf(cursorI.getLong(i14));
                                                                                    }
                                                                                    prl prlVarH9 = npy.h(lValueOf7);
                                                                                    if (cursorI.isNull(i13)) {
                                                                                        lValueOf9 = Long.valueOf(cursorI.getLong(i13));
                                                                                    }
                                                                                    npkVar = new npk(prlVarH8, prlVarH9, npy.h(lValueOf9), npy.j(cursorI.getInt(i12)), npy.k(cursorI.getInt(i11)), cursorI.getDouble(i4));
                                                                                    i6 = i20;
                                                                                    nqhVar = new nqh(string, string2, listN, prlVarH, popVarI, j, string4, string5, nmzVarV, popVarI2, popVarI3, popVarI4, z, listM, string8, string9, ptiVarC, pluVarB, npkVar, j2);
                                                                                }
                                                                            } else {
                                                                                iL24 = i33;
                                                                            }
                                                                            int i34 = i15;
                                                                            int i35 = i14;
                                                                            HashMap map3 = map;
                                                                            arrayList2 = (ArrayList) map3.get(Long.valueOf(cursorI.getLong(i15)));
                                                                            if (arrayList2 == null) {
                                                                                arrayList2 = new ArrayList();
                                                                            }
                                                                            nqi nqiVar = new nqi(nqhVar, arrayList2);
                                                                            ArrayList arrayList4 = arrayList;
                                                                            arrayList4.add(nqiVar);
                                                                            arrayList3 = arrayList4;
                                                                            iL = iL;
                                                                            i21 = i5;
                                                                            i22 = i34;
                                                                            i23 = i2;
                                                                            iL25 = i4;
                                                                            map2 = map3;
                                                                            iL14 = i10;
                                                                            iL20 = i6;
                                                                            iL24 = i11;
                                                                            iL4 = i7;
                                                                            iL23 = i12;
                                                                            iL3 = i8;
                                                                            iL22 = i13;
                                                                            iL2 = i9;
                                                                            iL21 = i35;
                                                                        } else {
                                                                            iL23 = i32;
                                                                        }
                                                                    } else {
                                                                        iL22 = i31;
                                                                    }
                                                                } else {
                                                                    iL21 = i30;
                                                                }
                                                            } else {
                                                                iL20 = i29;
                                                            }
                                                        } else {
                                                            i22 = i28;
                                                        }
                                                    } else {
                                                        iL18 = i27;
                                                    }
                                                } else {
                                                    iL17 = i26;
                                                }
                                            } else {
                                                iL16 = i25;
                                            }
                                        } else {
                                            iL15 = i24;
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
                                    if (cursorI.isNull(i2)) {
                                        lValueOf5 = null;
                                    } else {
                                        lValueOf5 = Long.valueOf(cursorI.getLong(i2));
                                    }
                                    pop popVarI8 = npy.i(lValueOf5);
                                    if (cursorI.getInt(i) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (cursorI.isNull(i3)) {
                                        string7 = null;
                                    } else {
                                        string7 = cursorI.getString(i3);
                                    }
                                    List listM2 = npy.m(string7);
                                    i16 = iL15;
                                    if (cursorI.isNull(i16)) {
                                        string8 = null;
                                    } else {
                                        string8 = cursorI.getString(i16);
                                    }
                                    iL15 = i16;
                                    i17 = iL16;
                                    if (cursorI.isNull(i17)) {
                                        string9 = null;
                                    } else {
                                        string9 = cursorI.getString(i17);
                                    }
                                    iL16 = i17;
                                    i18 = iL17;
                                    if (cursorI.isNull(i18)) {
                                        blob = null;
                                    } else {
                                        blob = cursorI.getBlob(i18);
                                    }
                                    pti ptiVarC2 = npy.c(blob);
                                    iL17 = i18;
                                    i19 = iL18;
                                    if (cursorI.isNull(i19)) {
                                        blob2 = null;
                                    } else {
                                        blob2 = cursorI.getBlob(i19);
                                    }
                                    plu pluVarB2 = npy.b(blob2);
                                    iL18 = i19;
                                    i15 = i22;
                                    long j4 = cursorI.getLong(i15);
                                    i5 = i;
                                    i20 = iL20;
                                    if (cursorI.isNull(i20)) {
                                        i10 = i3;
                                        i14 = iL21;
                                        if (cursorI.isNull(i14)) {
                                            i9 = iL2;
                                            i13 = iL22;
                                            if (cursorI.isNull(i13)) {
                                                i8 = iL3;
                                                i12 = iL23;
                                                if (cursorI.isNull(i12)) {
                                                    i7 = iL4;
                                                    i11 = iL24;
                                                    if (!cursorI.isNull(i11)) {
                                                    }
                                                    i6 = i20;
                                                    nqhVar = new nqh(string, string2, listN2, prlVarH10, popVarI5, j3, string4, string5, nmzVarV2, popVarI6, popVarI7, popVarI8, z, listM2, string8, string9, ptiVarC2, pluVarB2, npkVar, j4);
                                                    int i36 = i15;
                                                    int i37 = i14;
                                                    HashMap map4 = map;
                                                    arrayList2 = (ArrayList) map4.get(Long.valueOf(cursorI.getLong(i15)));
                                                    if (arrayList2 == null) {
                                                        arrayList2 = new ArrayList();
                                                    }
                                                    nqi nqiVar2 = new nqi(nqhVar, arrayList2);
                                                    ArrayList arrayList5 = arrayList;
                                                    arrayList5.add(nqiVar2);
                                                    arrayList3 = arrayList5;
                                                    iL = iL;
                                                    i21 = i5;
                                                    i22 = i36;
                                                    i23 = i2;
                                                    iL25 = i4;
                                                    map2 = map4;
                                                    iL14 = i10;
                                                    iL20 = i6;
                                                    iL24 = i11;
                                                    iL4 = i7;
                                                    iL23 = i12;
                                                    iL3 = i8;
                                                    iL22 = i13;
                                                    iL2 = i9;
                                                    iL21 = i37;
                                                }
                                                if (cursorI.isNull(i20)) {
                                                    lValueOf6 = null;
                                                } else {
                                                    lValueOf6 = Long.valueOf(cursorI.getLong(i20));
                                                }
                                                prl prlVarH11 = npy.h(lValueOf6);
                                                if (cursorI.isNull(i14)) {
                                                    lValueOf7 = null;
                                                } else {
                                                    lValueOf7 = Long.valueOf(cursorI.getLong(i14));
                                                }
                                                prl prlVarH12 = npy.h(lValueOf7);
                                                if (cursorI.isNull(i13)) {
                                                    lValueOf9 = Long.valueOf(cursorI.getLong(i13));
                                                }
                                                npkVar = new npk(prlVarH11, prlVarH12, npy.h(lValueOf9), npy.j(cursorI.getInt(i12)), npy.k(cursorI.getInt(i11)), cursorI.getDouble(i4));
                                                i6 = i20;
                                                nqhVar = new nqh(string, string2, listN2, prlVarH10, popVarI5, j3, string4, string5, nmzVarV2, popVarI6, popVarI7, popVarI8, z, listM2, string8, string9, ptiVarC2, pluVarB2, npkVar, j4);
                                                int i38 = i15;
                                                int i39 = i14;
                                                HashMap map5 = map;
                                                arrayList2 = (ArrayList) map5.get(Long.valueOf(cursorI.getLong(i15)));
                                                if (arrayList2 == null) {
                                                    arrayList2 = new ArrayList();
                                                }
                                                nqi nqiVar3 = new nqi(nqhVar, arrayList2);
                                                ArrayList arrayList6 = arrayList;
                                                arrayList6.add(nqiVar3);
                                                arrayList3 = arrayList6;
                                                iL = iL;
                                                i21 = i5;
                                                i22 = i38;
                                                i23 = i2;
                                                iL25 = i4;
                                                map2 = map5;
                                                iL14 = i10;
                                                iL20 = i6;
                                                iL24 = i11;
                                                iL4 = i7;
                                                iL23 = i12;
                                                iL3 = i8;
                                                iL22 = i13;
                                                iL2 = i9;
                                                iL21 = i39;
                                            }
                                            i7 = iL4;
                                            i11 = iL24;
                                            if (cursorI.isNull(i20)) {
                                                lValueOf6 = null;
                                            } else {
                                                lValueOf6 = Long.valueOf(cursorI.getLong(i20));
                                            }
                                            prl prlVarH13 = npy.h(lValueOf6);
                                            if (cursorI.isNull(i14)) {
                                                lValueOf7 = null;
                                            } else {
                                                lValueOf7 = Long.valueOf(cursorI.getLong(i14));
                                            }
                                            prl prlVarH14 = npy.h(lValueOf7);
                                            if (cursorI.isNull(i13)) {
                                                lValueOf9 = Long.valueOf(cursorI.getLong(i13));
                                            }
                                            npkVar = new npk(prlVarH13, prlVarH14, npy.h(lValueOf9), npy.j(cursorI.getInt(i12)), npy.k(cursorI.getInt(i11)), cursorI.getDouble(i4));
                                            i6 = i20;
                                            nqhVar = new nqh(string, string2, listN2, prlVarH10, popVarI5, j3, string4, string5, nmzVarV2, popVarI6, popVarI7, popVarI8, z, listM2, string8, string9, ptiVarC2, pluVarB2, npkVar, j4);
                                            int i310 = i15;
                                            int i311 = i14;
                                            HashMap map6 = map;
                                            arrayList2 = (ArrayList) map6.get(Long.valueOf(cursorI.getLong(i15)));
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                            }
                                            nqi nqiVar4 = new nqi(nqhVar, arrayList2);
                                            ArrayList arrayList7 = arrayList;
                                            arrayList7.add(nqiVar4);
                                            arrayList3 = arrayList7;
                                            iL = iL;
                                            i21 = i5;
                                            i22 = i310;
                                            i23 = i2;
                                            iL25 = i4;
                                            map2 = map6;
                                            iL14 = i10;
                                            iL20 = i6;
                                            iL24 = i11;
                                            iL4 = i7;
                                            iL23 = i12;
                                            iL3 = i8;
                                            iL22 = i13;
                                            iL2 = i9;
                                            iL21 = i311;
                                        }
                                        i8 = iL3;
                                        i12 = iL23;
                                        i7 = iL4;
                                        i11 = iL24;
                                        if (cursorI.isNull(i20)) {
                                            lValueOf6 = null;
                                        } else {
                                            lValueOf6 = Long.valueOf(cursorI.getLong(i20));
                                        }
                                        prl prlVarH15 = npy.h(lValueOf6);
                                        if (cursorI.isNull(i14)) {
                                            lValueOf7 = null;
                                        } else {
                                            lValueOf7 = Long.valueOf(cursorI.getLong(i14));
                                        }
                                        prl prlVarH16 = npy.h(lValueOf7);
                                        if (cursorI.isNull(i13)) {
                                            lValueOf9 = Long.valueOf(cursorI.getLong(i13));
                                        }
                                        npkVar = new npk(prlVarH15, prlVarH16, npy.h(lValueOf9), npy.j(cursorI.getInt(i12)), npy.k(cursorI.getInt(i11)), cursorI.getDouble(i4));
                                        i6 = i20;
                                        nqhVar = new nqh(string, string2, listN2, prlVarH10, popVarI5, j3, string4, string5, nmzVarV2, popVarI6, popVarI7, popVarI8, z, listM2, string8, string9, ptiVarC2, pluVarB2, npkVar, j4);
                                        int i312 = i15;
                                        int i313 = i14;
                                        HashMap map7 = map;
                                        arrayList2 = (ArrayList) map7.get(Long.valueOf(cursorI.getLong(i15)));
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                        }
                                        nqi nqiVar5 = new nqi(nqhVar, arrayList2);
                                        ArrayList arrayList8 = arrayList;
                                        arrayList8.add(nqiVar5);
                                        arrayList3 = arrayList8;
                                        iL = iL;
                                        i21 = i5;
                                        i22 = i312;
                                        i23 = i2;
                                        iL25 = i4;
                                        map2 = map7;
                                        iL14 = i10;
                                        iL20 = i6;
                                        iL24 = i11;
                                        iL4 = i7;
                                        iL23 = i12;
                                        iL3 = i8;
                                        iL22 = i13;
                                        iL2 = i9;
                                        iL21 = i313;
                                    } else {
                                        i10 = i3;
                                        i14 = iL21;
                                    }
                                    i9 = iL2;
                                    i13 = iL22;
                                    i8 = iL3;
                                    i12 = iL23;
                                    i7 = iL4;
                                    i11 = iL24;
                                    if (cursorI.isNull(i20)) {
                                        lValueOf6 = null;
                                    } else {
                                        lValueOf6 = Long.valueOf(cursorI.getLong(i20));
                                    }
                                    prl prlVarH17 = npy.h(lValueOf6);
                                    if (cursorI.isNull(i14)) {
                                        lValueOf7 = null;
                                    } else {
                                        lValueOf7 = Long.valueOf(cursorI.getLong(i14));
                                    }
                                    prl prlVarH18 = npy.h(lValueOf7);
                                    if (cursorI.isNull(i13)) {
                                        lValueOf9 = Long.valueOf(cursorI.getLong(i13));
                                    }
                                    npkVar = new npk(prlVarH17, prlVarH18, npy.h(lValueOf9), npy.j(cursorI.getInt(i12)), npy.k(cursorI.getInt(i11)), cursorI.getDouble(i4));
                                    i6 = i20;
                                    nqhVar = new nqh(string, string2, listN2, prlVarH10, popVarI5, j3, string4, string5, nmzVarV2, popVarI6, popVarI7, popVarI8, z, listM2, string8, string9, ptiVarC2, pluVarB2, npkVar, j4);
                                    int i314 = i15;
                                    int i315 = i14;
                                    HashMap map8 = map;
                                    arrayList2 = (ArrayList) map8.get(Long.valueOf(cursorI.getLong(i15)));
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList();
                                    }
                                    nqi nqiVar6 = new nqi(nqhVar, arrayList2);
                                    ArrayList arrayList9 = arrayList;
                                    arrayList9.add(nqiVar6);
                                    arrayList3 = arrayList9;
                                    iL = iL;
                                    i21 = i5;
                                    i22 = i314;
                                    i23 = i2;
                                    iL25 = i4;
                                    map2 = map8;
                                    iL14 = i10;
                                    iL20 = i6;
                                    iL24 = i11;
                                    iL4 = i7;
                                    iL23 = i12;
                                    iL3 = i8;
                                    iL22 = i13;
                                    iL2 = i9;
                                    iL21 = i315;
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
                                if (cursorI.isNull(i2)) {
                                    lValueOf5 = null;
                                } else {
                                    lValueOf5 = Long.valueOf(cursorI.getLong(i2));
                                }
                                pop popVarI12 = npy.i(lValueOf5);
                                if (cursorI.getInt(i) != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (cursorI.isNull(i3)) {
                                    string7 = null;
                                } else {
                                    string7 = cursorI.getString(i3);
                                }
                                List listM3 = npy.m(string7);
                                i16 = iL15;
                                if (cursorI.isNull(i16)) {
                                    string8 = null;
                                } else {
                                    string8 = cursorI.getString(i16);
                                }
                                iL15 = i16;
                                i17 = iL16;
                                if (cursorI.isNull(i17)) {
                                    string9 = null;
                                } else {
                                    string9 = cursorI.getString(i17);
                                }
                                iL16 = i17;
                                i18 = iL17;
                                if (cursorI.isNull(i18)) {
                                    blob = null;
                                } else {
                                    blob = cursorI.getBlob(i18);
                                }
                                pti ptiVarC3 = npy.c(blob);
                                iL17 = i18;
                                i19 = iL18;
                                if (cursorI.isNull(i19)) {
                                    blob2 = null;
                                } else {
                                    blob2 = cursorI.getBlob(i19);
                                }
                                plu pluVarB3 = npy.b(blob2);
                                iL18 = i19;
                                i15 = i22;
                                long j6 = cursorI.getLong(i15);
                                i5 = i;
                                i20 = iL20;
                                if (cursorI.isNull(i20)) {
                                    i10 = i3;
                                    i14 = iL21;
                                    if (cursorI.isNull(i14)) {
                                        i9 = iL2;
                                        i13 = iL22;
                                        if (cursorI.isNull(i13)) {
                                            i8 = iL3;
                                            i12 = iL23;
                                            if (cursorI.isNull(i12)) {
                                                i7 = iL4;
                                                i11 = iL24;
                                                if (!cursorI.isNull(i11)) {
                                                }
                                                i6 = i20;
                                                nqhVar = new nqh(string, string2, listN3, prlVarH19, popVarI9, j5, string4, string5, nmzVarV3, popVarI10, popVarI11, popVarI12, z, listM3, string8, string9, ptiVarC3, pluVarB3, npkVar, j6);
                                                int i316 = i15;
                                                int i317 = i14;
                                                HashMap map9 = map;
                                                arrayList2 = (ArrayList) map9.get(Long.valueOf(cursorI.getLong(i15)));
                                                if (arrayList2 == null) {
                                                    arrayList2 = new ArrayList();
                                                }
                                                nqi nqiVar7 = new nqi(nqhVar, arrayList2);
                                                ArrayList arrayList10 = arrayList;
                                                arrayList10.add(nqiVar7);
                                                arrayList3 = arrayList10;
                                                iL = iL;
                                                i21 = i5;
                                                i22 = i316;
                                                i23 = i2;
                                                iL25 = i4;
                                                map2 = map9;
                                                iL14 = i10;
                                                iL20 = i6;
                                                iL24 = i11;
                                                iL4 = i7;
                                                iL23 = i12;
                                                iL3 = i8;
                                                iL22 = i13;
                                                iL2 = i9;
                                                iL21 = i317;
                                            }
                                            if (cursorI.isNull(i20)) {
                                                lValueOf6 = null;
                                            } else {
                                                lValueOf6 = Long.valueOf(cursorI.getLong(i20));
                                            }
                                            prl prlVarH110 = npy.h(lValueOf6);
                                            if (cursorI.isNull(i14)) {
                                                lValueOf7 = null;
                                            } else {
                                                lValueOf7 = Long.valueOf(cursorI.getLong(i14));
                                            }
                                            prl prlVarH111 = npy.h(lValueOf7);
                                            if (cursorI.isNull(i13)) {
                                                lValueOf9 = Long.valueOf(cursorI.getLong(i13));
                                            }
                                            npkVar = new npk(prlVarH110, prlVarH111, npy.h(lValueOf9), npy.j(cursorI.getInt(i12)), npy.k(cursorI.getInt(i11)), cursorI.getDouble(i4));
                                            i6 = i20;
                                            nqhVar = new nqh(string, string2, listN3, prlVarH19, popVarI9, j5, string4, string5, nmzVarV3, popVarI10, popVarI11, popVarI12, z, listM3, string8, string9, ptiVarC3, pluVarB3, npkVar, j6);
                                            int i318 = i15;
                                            int i319 = i14;
                                            HashMap map10 = map;
                                            arrayList2 = (ArrayList) map10.get(Long.valueOf(cursorI.getLong(i15)));
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                            }
                                            nqi nqiVar8 = new nqi(nqhVar, arrayList2);
                                            ArrayList arrayList11 = arrayList;
                                            arrayList11.add(nqiVar8);
                                            arrayList3 = arrayList11;
                                            iL = iL;
                                            i21 = i5;
                                            i22 = i318;
                                            i23 = i2;
                                            iL25 = i4;
                                            map2 = map10;
                                            iL14 = i10;
                                            iL20 = i6;
                                            iL24 = i11;
                                            iL4 = i7;
                                            iL23 = i12;
                                            iL3 = i8;
                                            iL22 = i13;
                                            iL2 = i9;
                                            iL21 = i319;
                                        }
                                        i7 = iL4;
                                        i11 = iL24;
                                        if (cursorI.isNull(i20)) {
                                            lValueOf6 = null;
                                        } else {
                                            lValueOf6 = Long.valueOf(cursorI.getLong(i20));
                                        }
                                        prl prlVarH112 = npy.h(lValueOf6);
                                        if (cursorI.isNull(i14)) {
                                            lValueOf7 = null;
                                        } else {
                                            lValueOf7 = Long.valueOf(cursorI.getLong(i14));
                                        }
                                        prl prlVarH113 = npy.h(lValueOf7);
                                        if (cursorI.isNull(i13)) {
                                            lValueOf9 = Long.valueOf(cursorI.getLong(i13));
                                        }
                                        npkVar = new npk(prlVarH112, prlVarH113, npy.h(lValueOf9), npy.j(cursorI.getInt(i12)), npy.k(cursorI.getInt(i11)), cursorI.getDouble(i4));
                                        i6 = i20;
                                        nqhVar = new nqh(string, string2, listN3, prlVarH19, popVarI9, j5, string4, string5, nmzVarV3, popVarI10, popVarI11, popVarI12, z, listM3, string8, string9, ptiVarC3, pluVarB3, npkVar, j6);
                                        int i3110 = i15;
                                        int i3111 = i14;
                                        HashMap map11 = map;
                                        arrayList2 = (ArrayList) map11.get(Long.valueOf(cursorI.getLong(i15)));
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                        }
                                        nqi nqiVar9 = new nqi(nqhVar, arrayList2);
                                        ArrayList arrayList12 = arrayList;
                                        arrayList12.add(nqiVar9);
                                        arrayList3 = arrayList12;
                                        iL = iL;
                                        i21 = i5;
                                        i22 = i3110;
                                        i23 = i2;
                                        iL25 = i4;
                                        map2 = map11;
                                        iL14 = i10;
                                        iL20 = i6;
                                        iL24 = i11;
                                        iL4 = i7;
                                        iL23 = i12;
                                        iL3 = i8;
                                        iL22 = i13;
                                        iL2 = i9;
                                        iL21 = i3111;
                                    }
                                    i8 = iL3;
                                    i12 = iL23;
                                    i7 = iL4;
                                    i11 = iL24;
                                    if (cursorI.isNull(i20)) {
                                        lValueOf6 = null;
                                    } else {
                                        lValueOf6 = Long.valueOf(cursorI.getLong(i20));
                                    }
                                    prl prlVarH114 = npy.h(lValueOf6);
                                    if (cursorI.isNull(i14)) {
                                        lValueOf7 = null;
                                    } else {
                                        lValueOf7 = Long.valueOf(cursorI.getLong(i14));
                                    }
                                    prl prlVarH115 = npy.h(lValueOf7);
                                    if (cursorI.isNull(i13)) {
                                        lValueOf9 = Long.valueOf(cursorI.getLong(i13));
                                    }
                                    npkVar = new npk(prlVarH114, prlVarH115, npy.h(lValueOf9), npy.j(cursorI.getInt(i12)), npy.k(cursorI.getInt(i11)), cursorI.getDouble(i4));
                                    i6 = i20;
                                    nqhVar = new nqh(string, string2, listN3, prlVarH19, popVarI9, j5, string4, string5, nmzVarV3, popVarI10, popVarI11, popVarI12, z, listM3, string8, string9, ptiVarC3, pluVarB3, npkVar, j6);
                                    int i3112 = i15;
                                    int i3113 = i14;
                                    HashMap map12 = map;
                                    arrayList2 = (ArrayList) map12.get(Long.valueOf(cursorI.getLong(i15)));
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList();
                                    }
                                    nqi nqiVar10 = new nqi(nqhVar, arrayList2);
                                    ArrayList arrayList13 = arrayList;
                                    arrayList13.add(nqiVar10);
                                    arrayList3 = arrayList13;
                                    iL = iL;
                                    i21 = i5;
                                    i22 = i3112;
                                    i23 = i2;
                                    iL25 = i4;
                                    map2 = map12;
                                    iL14 = i10;
                                    iL20 = i6;
                                    iL24 = i11;
                                    iL4 = i7;
                                    iL23 = i12;
                                    iL3 = i8;
                                    iL22 = i13;
                                    iL2 = i9;
                                    iL21 = i3113;
                                } else {
                                    i10 = i3;
                                    i14 = iL21;
                                }
                                i9 = iL2;
                                i13 = iL22;
                                i8 = iL3;
                                i12 = iL23;
                                i7 = iL4;
                                i11 = iL24;
                                if (cursorI.isNull(i20)) {
                                    lValueOf6 = null;
                                } else {
                                    lValueOf6 = Long.valueOf(cursorI.getLong(i20));
                                }
                                prl prlVarH116 = npy.h(lValueOf6);
                                if (cursorI.isNull(i14)) {
                                    lValueOf7 = null;
                                } else {
                                    lValueOf7 = Long.valueOf(cursorI.getLong(i14));
                                }
                                prl prlVarH117 = npy.h(lValueOf7);
                                if (cursorI.isNull(i13)) {
                                    lValueOf9 = Long.valueOf(cursorI.getLong(i13));
                                }
                                npkVar = new npk(prlVarH116, prlVarH117, npy.h(lValueOf9), npy.j(cursorI.getInt(i12)), npy.k(cursorI.getInt(i11)), cursorI.getDouble(i4));
                                i6 = i20;
                                nqhVar = new nqh(string, string2, listN3, prlVarH19, popVarI9, j5, string4, string5, nmzVarV3, popVarI10, popVarI11, popVarI12, z, listM3, string8, string9, ptiVarC3, pluVarB3, npkVar, j6);
                                int i3114 = i15;
                                int i3115 = i14;
                                HashMap map13 = map;
                                arrayList2 = (ArrayList) map13.get(Long.valueOf(cursorI.getLong(i15)));
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                nqi nqiVar11 = new nqi(nqhVar, arrayList2);
                                ArrayList arrayList14 = arrayList;
                                arrayList14.add(nqiVar11);
                                arrayList3 = arrayList14;
                                iL = iL;
                                i21 = i5;
                                i22 = i3114;
                                i23 = i2;
                                iL25 = i4;
                                map2 = map13;
                                iL14 = i10;
                                iL20 = i6;
                                iL24 = i11;
                                iL4 = i7;
                                iL23 = i12;
                                iL3 = i8;
                                iL22 = i13;
                                iL2 = i9;
                                iL21 = i3115;
                            } else {
                                i = i21;
                            }
                        } else {
                            i = i21;
                            i2 = i23;
                        }
                        arrayList = arrayList3;
                        i3 = iL14;
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
                        List listN4 = npy.n(string3);
                        if (cursorI.isNull(iL4)) {
                            lValueOf = null;
                        } else {
                            lValueOf = Long.valueOf(cursorI.getLong(iL4));
                        }
                        prl prlVarH118 = npy.h(lValueOf);
                        if (cursorI.isNull(iL5)) {
                            lValueOf2 = null;
                        } else {
                            lValueOf2 = Long.valueOf(cursorI.getLong(iL5));
                        }
                        pop popVarI13 = npy.i(lValueOf2);
                        long j7 = cursorI.getLong(iL6);
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
                        nmz nmzVarV4 = npy.v(string6);
                        if (cursorI.isNull(iL10)) {
                            lValueOf3 = null;
                        } else {
                            lValueOf3 = Long.valueOf(cursorI.getLong(iL10));
                        }
                        pop popVarI14 = npy.i(lValueOf3);
                        if (cursorI.isNull(iL11)) {
                            lValueOf4 = null;
                        } else {
                            lValueOf4 = Long.valueOf(cursorI.getLong(iL11));
                        }
                        pop popVarI15 = npy.i(lValueOf4);
                        if (cursorI.isNull(i2)) {
                            lValueOf5 = null;
                        } else {
                            lValueOf5 = Long.valueOf(cursorI.getLong(i2));
                        }
                        pop popVarI16 = npy.i(lValueOf5);
                        if (cursorI.getInt(i) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (cursorI.isNull(i3)) {
                            string7 = null;
                        } else {
                            string7 = cursorI.getString(i3);
                        }
                        List listM4 = npy.m(string7);
                        i16 = iL15;
                        if (cursorI.isNull(i16)) {
                            string8 = null;
                        } else {
                            string8 = cursorI.getString(i16);
                        }
                        iL15 = i16;
                        i17 = iL16;
                        if (cursorI.isNull(i17)) {
                            string9 = null;
                        } else {
                            string9 = cursorI.getString(i17);
                        }
                        iL16 = i17;
                        i18 = iL17;
                        if (cursorI.isNull(i18)) {
                            blob = null;
                        } else {
                            blob = cursorI.getBlob(i18);
                        }
                        pti ptiVarC4 = npy.c(blob);
                        iL17 = i18;
                        i19 = iL18;
                        if (cursorI.isNull(i19)) {
                            blob2 = null;
                        } else {
                            blob2 = cursorI.getBlob(i19);
                        }
                        plu pluVarB4 = npy.b(blob2);
                        iL18 = i19;
                        i15 = i22;
                        long j8 = cursorI.getLong(i15);
                        i5 = i;
                        i20 = iL20;
                        if (cursorI.isNull(i20)) {
                            i10 = i3;
                            i14 = iL21;
                            if (cursorI.isNull(i14)) {
                                i9 = iL2;
                                i13 = iL22;
                                if (cursorI.isNull(i13)) {
                                    i8 = iL3;
                                    i12 = iL23;
                                    if (cursorI.isNull(i12)) {
                                        i7 = iL4;
                                        i11 = iL24;
                                        if (!cursorI.isNull(i11)) {
                                        }
                                        i6 = i20;
                                        nqhVar = new nqh(string, string2, listN4, prlVarH118, popVarI13, j7, string4, string5, nmzVarV4, popVarI14, popVarI15, popVarI16, z, listM4, string8, string9, ptiVarC4, pluVarB4, npkVar, j8);
                                        int i3116 = i15;
                                        int i3117 = i14;
                                        HashMap map14 = map;
                                        arrayList2 = (ArrayList) map14.get(Long.valueOf(cursorI.getLong(i15)));
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                        }
                                        nqi nqiVar12 = new nqi(nqhVar, arrayList2);
                                        ArrayList arrayList15 = arrayList;
                                        arrayList15.add(nqiVar12);
                                        arrayList3 = arrayList15;
                                        iL = iL;
                                        i21 = i5;
                                        i22 = i3116;
                                        i23 = i2;
                                        iL25 = i4;
                                        map2 = map14;
                                        iL14 = i10;
                                        iL20 = i6;
                                        iL24 = i11;
                                        iL4 = i7;
                                        iL23 = i12;
                                        iL3 = i8;
                                        iL22 = i13;
                                        iL2 = i9;
                                        iL21 = i3117;
                                    }
                                    if (cursorI.isNull(i20)) {
                                        lValueOf6 = null;
                                    } else {
                                        lValueOf6 = Long.valueOf(cursorI.getLong(i20));
                                    }
                                    prl prlVarH119 = npy.h(lValueOf6);
                                    if (cursorI.isNull(i14)) {
                                        lValueOf7 = null;
                                    } else {
                                        lValueOf7 = Long.valueOf(cursorI.getLong(i14));
                                    }
                                    prl prlVarH1110 = npy.h(lValueOf7);
                                    if (cursorI.isNull(i13)) {
                                        lValueOf9 = Long.valueOf(cursorI.getLong(i13));
                                    }
                                    npkVar = new npk(prlVarH119, prlVarH1110, npy.h(lValueOf9), npy.j(cursorI.getInt(i12)), npy.k(cursorI.getInt(i11)), cursorI.getDouble(i4));
                                    i6 = i20;
                                    nqhVar = new nqh(string, string2, listN4, prlVarH118, popVarI13, j7, string4, string5, nmzVarV4, popVarI14, popVarI15, popVarI16, z, listM4, string8, string9, ptiVarC4, pluVarB4, npkVar, j8);
                                    int i3118 = i15;
                                    int i3119 = i14;
                                    HashMap map15 = map;
                                    arrayList2 = (ArrayList) map15.get(Long.valueOf(cursorI.getLong(i15)));
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList();
                                    }
                                    nqi nqiVar13 = new nqi(nqhVar, arrayList2);
                                    ArrayList arrayList16 = arrayList;
                                    arrayList16.add(nqiVar13);
                                    arrayList3 = arrayList16;
                                    iL = iL;
                                    i21 = i5;
                                    i22 = i3118;
                                    i23 = i2;
                                    iL25 = i4;
                                    map2 = map15;
                                    iL14 = i10;
                                    iL20 = i6;
                                    iL24 = i11;
                                    iL4 = i7;
                                    iL23 = i12;
                                    iL3 = i8;
                                    iL22 = i13;
                                    iL2 = i9;
                                    iL21 = i3119;
                                }
                                i7 = iL4;
                                i11 = iL24;
                                if (cursorI.isNull(i20)) {
                                    lValueOf6 = null;
                                } else {
                                    lValueOf6 = Long.valueOf(cursorI.getLong(i20));
                                }
                                prl prlVarH1111 = npy.h(lValueOf6);
                                if (cursorI.isNull(i14)) {
                                    lValueOf7 = null;
                                } else {
                                    lValueOf7 = Long.valueOf(cursorI.getLong(i14));
                                }
                                prl prlVarH1112 = npy.h(lValueOf7);
                                if (cursorI.isNull(i13)) {
                                    lValueOf9 = Long.valueOf(cursorI.getLong(i13));
                                }
                                npkVar = new npk(prlVarH1111, prlVarH1112, npy.h(lValueOf9), npy.j(cursorI.getInt(i12)), npy.k(cursorI.getInt(i11)), cursorI.getDouble(i4));
                                i6 = i20;
                                nqhVar = new nqh(string, string2, listN4, prlVarH118, popVarI13, j7, string4, string5, nmzVarV4, popVarI14, popVarI15, popVarI16, z, listM4, string8, string9, ptiVarC4, pluVarB4, npkVar, j8);
                                int i31110 = i15;
                                int i31111 = i14;
                                HashMap map16 = map;
                                arrayList2 = (ArrayList) map16.get(Long.valueOf(cursorI.getLong(i15)));
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                nqi nqiVar14 = new nqi(nqhVar, arrayList2);
                                ArrayList arrayList17 = arrayList;
                                arrayList17.add(nqiVar14);
                                arrayList3 = arrayList17;
                                iL = iL;
                                i21 = i5;
                                i22 = i31110;
                                i23 = i2;
                                iL25 = i4;
                                map2 = map16;
                                iL14 = i10;
                                iL20 = i6;
                                iL24 = i11;
                                iL4 = i7;
                                iL23 = i12;
                                iL3 = i8;
                                iL22 = i13;
                                iL2 = i9;
                                iL21 = i31111;
                            }
                            i8 = iL3;
                            i12 = iL23;
                            i7 = iL4;
                            i11 = iL24;
                            if (cursorI.isNull(i20)) {
                                lValueOf6 = null;
                            } else {
                                lValueOf6 = Long.valueOf(cursorI.getLong(i20));
                            }
                            prl prlVarH1113 = npy.h(lValueOf6);
                            if (cursorI.isNull(i14)) {
                                lValueOf7 = null;
                            } else {
                                lValueOf7 = Long.valueOf(cursorI.getLong(i14));
                            }
                            prl prlVarH1114 = npy.h(lValueOf7);
                            if (cursorI.isNull(i13)) {
                                lValueOf9 = Long.valueOf(cursorI.getLong(i13));
                            }
                            npkVar = new npk(prlVarH1113, prlVarH1114, npy.h(lValueOf9), npy.j(cursorI.getInt(i12)), npy.k(cursorI.getInt(i11)), cursorI.getDouble(i4));
                            i6 = i20;
                            nqhVar = new nqh(string, string2, listN4, prlVarH118, popVarI13, j7, string4, string5, nmzVarV4, popVarI14, popVarI15, popVarI16, z, listM4, string8, string9, ptiVarC4, pluVarB4, npkVar, j8);
                            int i31112 = i15;
                            int i31113 = i14;
                            HashMap map17 = map;
                            arrayList2 = (ArrayList) map17.get(Long.valueOf(cursorI.getLong(i15)));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            nqi nqiVar15 = new nqi(nqhVar, arrayList2);
                            ArrayList arrayList18 = arrayList;
                            arrayList18.add(nqiVar15);
                            arrayList3 = arrayList18;
                            iL = iL;
                            i21 = i5;
                            i22 = i31112;
                            i23 = i2;
                            iL25 = i4;
                            map2 = map17;
                            iL14 = i10;
                            iL20 = i6;
                            iL24 = i11;
                            iL4 = i7;
                            iL23 = i12;
                            iL3 = i8;
                            iL22 = i13;
                            iL2 = i9;
                            iL21 = i31113;
                        } else {
                            i10 = i3;
                            i14 = iL21;
                        }
                        i9 = iL2;
                        i13 = iL22;
                        i8 = iL3;
                        i12 = iL23;
                        i7 = iL4;
                        i11 = iL24;
                        if (cursorI.isNull(i20)) {
                            lValueOf6 = null;
                        } else {
                            lValueOf6 = Long.valueOf(cursorI.getLong(i20));
                        }
                        prl prlVarH1115 = npy.h(lValueOf6);
                        if (cursorI.isNull(i14)) {
                            lValueOf7 = null;
                        } else {
                            lValueOf7 = Long.valueOf(cursorI.getLong(i14));
                        }
                        prl prlVarH1116 = npy.h(lValueOf7);
                        if (cursorI.isNull(i13)) {
                            lValueOf9 = Long.valueOf(cursorI.getLong(i13));
                        }
                        npkVar = new npk(prlVarH1115, prlVarH1116, npy.h(lValueOf9), npy.j(cursorI.getInt(i12)), npy.k(cursorI.getInt(i11)), cursorI.getDouble(i4));
                        i6 = i20;
                        nqhVar = new nqh(string, string2, listN4, prlVarH118, popVarI13, j7, string4, string5, nmzVarV4, popVarI14, popVarI15, popVarI16, z, listM4, string8, string9, ptiVarC4, pluVarB4, npkVar, j8);
                        int i31114 = i15;
                        int i31115 = i14;
                        HashMap map18 = map;
                        arrayList2 = (ArrayList) map18.get(Long.valueOf(cursorI.getLong(i15)));
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        nqi nqiVar16 = new nqi(nqhVar, arrayList2);
                        ArrayList arrayList19 = arrayList;
                        arrayList19.add(nqiVar16);
                        arrayList3 = arrayList19;
                        iL = iL;
                        i21 = i5;
                        i22 = i31114;
                        i23 = i2;
                        iL25 = i4;
                        map2 = map18;
                        iL14 = i10;
                        iL20 = i6;
                        iL24 = i11;
                        iL4 = i7;
                        iL23 = i12;
                        iL3 = i8;
                        iL22 = i13;
                        iL2 = i9;
                        iL21 = i31115;
                    } catch (Throwable th) {
                        th = th;
                        nqrVar = this;
                        cursorI.close();
                        nqrVar.a.j();
                        throw th;
                    }
                }
                ArrayList arrayList20 = arrayList3;
                nqrVar = this;
                nqrVar.b.a.j();
                cursorI.close();
                nqrVar.a.j();
                nqrVar.b.a.i();
                return arrayList20;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            nqrVar.b.a.i();
            throw th3;
        }
    }
}

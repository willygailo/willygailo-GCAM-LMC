package defpackage;

import android.os.Handler;
import android.os.Trace;
import com.google.android.apps.camera.moments.MomentsUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class gdj implements ges, gfh, gfj {
    private final boolean C;
    private final boolean D;
    private boolean E;
    private boolean F;
    public final fuo a;
    public final lis b;
    public final Handler h;
    private final geu i;
    private final gao j;
    private final gdp k;
    private final gdp l;
    private final pyn m;
    private final qkg n;
    private final gez o;
    private final gff p;
    private final ddf q;
    private final dzv r;
    private final hkg s;
    private final gbb t;
    private boolean u;
    private gew x;
    private gfs y;
    public boolean c = false;
    public final Deque d = new ConcurrentLinkedDeque();
    public final Deque e = new ConcurrentLinkedDeque();
    private boolean v = false;
    private boolean w = false;
    public final Set f = new HashSet();
    private hsr z = hsr.UNKNOWN;
    public int g = 0;
    private final Deque A = new ConcurrentLinkedDeque();
    private float B = 0.0f;

    public gdj(geu geuVar, gao gaoVar, gdp gdpVar, gdp gdpVar2, pyn pynVar, qkg qkgVar, fuo fuoVar, gez gezVar, gff gffVar, ddf ddfVar, dzv dzvVar, lis lisVar, Handler handler, hkg hkgVar, gbb gbbVar) {
        boolean z;
        this.i = geuVar;
        this.j = gaoVar;
        this.k = gdpVar;
        this.l = gdpVar2;
        this.m = pynVar;
        this.n = qkgVar;
        this.a = fuoVar;
        this.o = gezVar;
        this.p = gffVar;
        this.q = ddfVar;
        this.r = dzvVar;
        this.b = lisVar.a("MomentsMainLoop");
        this.h = handler;
        this.s = hkgVar;
        if (ddfVar.k(dds.A) && ddfVar.k(dds.B)) {
            z = true;
        } else {
            z = ddfVar.k(dds.C) && ddfVar.k(dds.D);
        }
        this.C = z;
        this.D = ddfVar.k(dds.E) && ddfVar.k(dds.F);
        ddfVar.b();
        this.u = false;
        ddi ddiVar = ddl.a;
        ddfVar.e();
        this.t = gbbVar;
    }

    private final int s(long j, boolean z) {
        if (!z) {
            return this.i.b;
        }
        geu geuVar = this.i;
        long j2 = j / geuVar.d;
        int i = geuVar.b;
        return Math.min(Math.max((int) j2, i), geuVar.a);
    }

    private final long t(gdf gdfVar) {
        long jA = this.a.a();
        long jLongValue = gdfVar.d.m() ? ((Long) gdfVar.d.j()).longValue() : jA;
        if (gdfVar.d.n()) {
            jA = ((Long) gdfVar.d.k()).longValue();
        }
        return TimeUnit.MILLISECONDS.convert(jA - jLongValue, TimeUnit.NANOSECONDS);
    }

    private final gdi u(gdf gdfVar, List list) {
        gdi gdiVar = new gdi();
        for (gde gdeVar : this.e) {
            if (gdfVar.d.o(gdeVar.c())) {
                if (gdeVar.d()) {
                    gdiVar.g++;
                } else if (gdeVar.a) {
                    gdiVar.a++;
                } else if (gdeVar.b.g()) {
                    gdiVar.f++;
                } else {
                    gdiVar.h++;
                }
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gan ganVar = (gan) it.next();
            if (!gdfVar.d.a(Long.valueOf(ganVar.c()))) {
                gdiVar.d++;
            } else if (x(ganVar)) {
                gdiVar.e++;
            } else if (this.C && !this.u && ((this.F || this.E) && !MomentsUtils.c(ganVar, this.B, this.s, this.A))) {
                gdiVar.c++;
            } else if (this.D && this.u && !MomentsUtils.b(ganVar, this.s, this.A)) {
                gdiVar.c++;
            } else {
                gdiVar.b++;
            }
        }
        return gdiVar;
    }

    private static ojc v(ojc ojcVar, long j) {
        return (!ojcVar.g() || (ojcVar.g() && ((Long) ojcVar.c()).longValue() > j)) ? ojc.i(Long.valueOf(j)) : ojcVar;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x02ec A[Catch: all -> 0x09c9, PHI: r5
      0x02ec: PHI (r5v12 gan) = (r5v5 gan), (r5v9 gan), (r5v23 gan), (r5v5 gan) binds: [B:98:0x02b5, B:110:0x02e8, B:95:0x02a8, B:88:0x0288] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000e, B:7:0x0014, B:9:0x0024, B:10:0x0028, B:12:0x002f, B:13:0x0066, B:15:0x006a, B:151:0x043e, B:152:0x044f, B:154:0x0455, B:156:0x0473, B:158:0x0482, B:160:0x0496, B:161:0x049e, B:163:0x04a2, B:175:0x0587, B:176:0x0596, B:178:0x059c, B:180:0x05ae, B:182:0x05f6, B:183:0x05fe, B:185:0x0606, B:186:0x061b, B:189:0x0636, B:191:0x063e, B:193:0x0644, B:195:0x065c, B:198:0x06a9, B:199:0x06e2, B:201:0x06ea, B:203:0x0779, B:204:0x0792, B:205:0x079d, B:164:0x04fd, B:166:0x050d, B:168:0x0511, B:169:0x0530, B:171:0x0569, B:173:0x0577, B:174:0x0580, B:206:0x07d8, B:207:0x07ee, B:209:0x07f4, B:211:0x07fe, B:212:0x0804, B:214:0x080a, B:217:0x081d, B:219:0x0833, B:220:0x0837, B:222:0x083e, B:224:0x084c, B:226:0x0886, B:225:0x087f, B:227:0x0889, B:228:0x0899, B:230:0x089f, B:232:0x08a9, B:234:0x08af, B:236:0x08b9, B:237:0x08c3, B:238:0x08c6, B:239:0x08d3, B:241:0x08d9, B:243:0x08e7, B:245:0x08f5, B:247:0x0901, B:249:0x090f, B:250:0x0914, B:254:0x0927, B:256:0x0949, B:258:0x095c, B:257:0x0955, B:259:0x0966, B:261:0x096e, B:263:0x0976, B:265:0x097a, B:267:0x097e, B:270:0x0989, B:269:0x0982, B:271:0x098e, B:272:0x0994, B:274:0x099a, B:276:0x09a8, B:278:0x09ac, B:17:0x006e, B:21:0x0078, B:22:0x0080, B:24:0x0086, B:26:0x0090, B:29:0x0098, B:31:0x009c, B:33:0x00a0, B:36:0x00a8, B:38:0x00b6, B:40:0x00d2, B:41:0x00d9, B:42:0x00e8, B:44:0x00ee, B:45:0x0106, B:47:0x010c, B:49:0x011a, B:72:0x01d3, B:52:0x0120, B:53:0x0127, B:55:0x012d, B:57:0x0143, B:59:0x0149, B:61:0x014d, B:63:0x0155, B:65:0x015d, B:67:0x016d, B:69:0x0175, B:71:0x01ac, B:73:0x01fc, B:75:0x0208, B:77:0x0214, B:79:0x0260, B:78:0x023c, B:80:0x0263, B:82:0x026e, B:83:0x0277, B:85:0x0282, B:87:0x0286, B:112:0x02ec, B:114:0x02f6, B:116:0x02fa, B:117:0x0336, B:118:0x033f, B:120:0x0364, B:125:0x036d, B:126:0x0376, B:127:0x0382, B:129:0x0388, B:131:0x0394, B:138:0x03bd, B:140:0x03c3, B:142:0x03c7, B:144:0x03d1, B:147:0x03e0, B:149:0x03f8, B:148:0x03ee, B:145:0x03dc, B:123:0x0369, B:89:0x028a, B:91:0x0291, B:96:0x02aa, B:97:0x02b3, B:99:0x02b7, B:101:0x02be, B:103:0x02ce, B:108:0x02e4, B:105:0x02d8, B:150:0x0437), top: B:289:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x02fa A[Catch: all -> 0x09c9, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000e, B:7:0x0014, B:9:0x0024, B:10:0x0028, B:12:0x002f, B:13:0x0066, B:15:0x006a, B:151:0x043e, B:152:0x044f, B:154:0x0455, B:156:0x0473, B:158:0x0482, B:160:0x0496, B:161:0x049e, B:163:0x04a2, B:175:0x0587, B:176:0x0596, B:178:0x059c, B:180:0x05ae, B:182:0x05f6, B:183:0x05fe, B:185:0x0606, B:186:0x061b, B:189:0x0636, B:191:0x063e, B:193:0x0644, B:195:0x065c, B:198:0x06a9, B:199:0x06e2, B:201:0x06ea, B:203:0x0779, B:204:0x0792, B:205:0x079d, B:164:0x04fd, B:166:0x050d, B:168:0x0511, B:169:0x0530, B:171:0x0569, B:173:0x0577, B:174:0x0580, B:206:0x07d8, B:207:0x07ee, B:209:0x07f4, B:211:0x07fe, B:212:0x0804, B:214:0x080a, B:217:0x081d, B:219:0x0833, B:220:0x0837, B:222:0x083e, B:224:0x084c, B:226:0x0886, B:225:0x087f, B:227:0x0889, B:228:0x0899, B:230:0x089f, B:232:0x08a9, B:234:0x08af, B:236:0x08b9, B:237:0x08c3, B:238:0x08c6, B:239:0x08d3, B:241:0x08d9, B:243:0x08e7, B:245:0x08f5, B:247:0x0901, B:249:0x090f, B:250:0x0914, B:254:0x0927, B:256:0x0949, B:258:0x095c, B:257:0x0955, B:259:0x0966, B:261:0x096e, B:263:0x0976, B:265:0x097a, B:267:0x097e, B:270:0x0989, B:269:0x0982, B:271:0x098e, B:272:0x0994, B:274:0x099a, B:276:0x09a8, B:278:0x09ac, B:17:0x006e, B:21:0x0078, B:22:0x0080, B:24:0x0086, B:26:0x0090, B:29:0x0098, B:31:0x009c, B:33:0x00a0, B:36:0x00a8, B:38:0x00b6, B:40:0x00d2, B:41:0x00d9, B:42:0x00e8, B:44:0x00ee, B:45:0x0106, B:47:0x010c, B:49:0x011a, B:72:0x01d3, B:52:0x0120, B:53:0x0127, B:55:0x012d, B:57:0x0143, B:59:0x0149, B:61:0x014d, B:63:0x0155, B:65:0x015d, B:67:0x016d, B:69:0x0175, B:71:0x01ac, B:73:0x01fc, B:75:0x0208, B:77:0x0214, B:79:0x0260, B:78:0x023c, B:80:0x0263, B:82:0x026e, B:83:0x0277, B:85:0x0282, B:87:0x0286, B:112:0x02ec, B:114:0x02f6, B:116:0x02fa, B:117:0x0336, B:118:0x033f, B:120:0x0364, B:125:0x036d, B:126:0x0376, B:127:0x0382, B:129:0x0388, B:131:0x0394, B:138:0x03bd, B:140:0x03c3, B:142:0x03c7, B:144:0x03d1, B:147:0x03e0, B:149:0x03f8, B:148:0x03ee, B:145:0x03dc, B:123:0x0369, B:89:0x028a, B:91:0x0291, B:96:0x02aa, B:97:0x02b3, B:99:0x02b7, B:101:0x02be, B:103:0x02ce, B:108:0x02e4, B:105:0x02d8, B:150:0x0437), top: B:289:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0364 A[Catch: all -> 0x09c9, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000e, B:7:0x0014, B:9:0x0024, B:10:0x0028, B:12:0x002f, B:13:0x0066, B:15:0x006a, B:151:0x043e, B:152:0x044f, B:154:0x0455, B:156:0x0473, B:158:0x0482, B:160:0x0496, B:161:0x049e, B:163:0x04a2, B:175:0x0587, B:176:0x0596, B:178:0x059c, B:180:0x05ae, B:182:0x05f6, B:183:0x05fe, B:185:0x0606, B:186:0x061b, B:189:0x0636, B:191:0x063e, B:193:0x0644, B:195:0x065c, B:198:0x06a9, B:199:0x06e2, B:201:0x06ea, B:203:0x0779, B:204:0x0792, B:205:0x079d, B:164:0x04fd, B:166:0x050d, B:168:0x0511, B:169:0x0530, B:171:0x0569, B:173:0x0577, B:174:0x0580, B:206:0x07d8, B:207:0x07ee, B:209:0x07f4, B:211:0x07fe, B:212:0x0804, B:214:0x080a, B:217:0x081d, B:219:0x0833, B:220:0x0837, B:222:0x083e, B:224:0x084c, B:226:0x0886, B:225:0x087f, B:227:0x0889, B:228:0x0899, B:230:0x089f, B:232:0x08a9, B:234:0x08af, B:236:0x08b9, B:237:0x08c3, B:238:0x08c6, B:239:0x08d3, B:241:0x08d9, B:243:0x08e7, B:245:0x08f5, B:247:0x0901, B:249:0x090f, B:250:0x0914, B:254:0x0927, B:256:0x0949, B:258:0x095c, B:257:0x0955, B:259:0x0966, B:261:0x096e, B:263:0x0976, B:265:0x097a, B:267:0x097e, B:270:0x0989, B:269:0x0982, B:271:0x098e, B:272:0x0994, B:274:0x099a, B:276:0x09a8, B:278:0x09ac, B:17:0x006e, B:21:0x0078, B:22:0x0080, B:24:0x0086, B:26:0x0090, B:29:0x0098, B:31:0x009c, B:33:0x00a0, B:36:0x00a8, B:38:0x00b6, B:40:0x00d2, B:41:0x00d9, B:42:0x00e8, B:44:0x00ee, B:45:0x0106, B:47:0x010c, B:49:0x011a, B:72:0x01d3, B:52:0x0120, B:53:0x0127, B:55:0x012d, B:57:0x0143, B:59:0x0149, B:61:0x014d, B:63:0x0155, B:65:0x015d, B:67:0x016d, B:69:0x0175, B:71:0x01ac, B:73:0x01fc, B:75:0x0208, B:77:0x0214, B:79:0x0260, B:78:0x023c, B:80:0x0263, B:82:0x026e, B:83:0x0277, B:85:0x0282, B:87:0x0286, B:112:0x02ec, B:114:0x02f6, B:116:0x02fa, B:117:0x0336, B:118:0x033f, B:120:0x0364, B:125:0x036d, B:126:0x0376, B:127:0x0382, B:129:0x0388, B:131:0x0394, B:138:0x03bd, B:140:0x03c3, B:142:0x03c7, B:144:0x03d1, B:147:0x03e0, B:149:0x03f8, B:148:0x03ee, B:145:0x03dc, B:123:0x0369, B:89:0x028a, B:91:0x0291, B:96:0x02aa, B:97:0x02b3, B:99:0x02b7, B:101:0x02be, B:103:0x02ce, B:108:0x02e4, B:105:0x02d8, B:150:0x0437), top: B:289:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0368  */
    /* JADX WARN: Code duplicated, block: B:123:0x0369 A[Catch: all -> 0x09c9, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000e, B:7:0x0014, B:9:0x0024, B:10:0x0028, B:12:0x002f, B:13:0x0066, B:15:0x006a, B:151:0x043e, B:152:0x044f, B:154:0x0455, B:156:0x0473, B:158:0x0482, B:160:0x0496, B:161:0x049e, B:163:0x04a2, B:175:0x0587, B:176:0x0596, B:178:0x059c, B:180:0x05ae, B:182:0x05f6, B:183:0x05fe, B:185:0x0606, B:186:0x061b, B:189:0x0636, B:191:0x063e, B:193:0x0644, B:195:0x065c, B:198:0x06a9, B:199:0x06e2, B:201:0x06ea, B:203:0x0779, B:204:0x0792, B:205:0x079d, B:164:0x04fd, B:166:0x050d, B:168:0x0511, B:169:0x0530, B:171:0x0569, B:173:0x0577, B:174:0x0580, B:206:0x07d8, B:207:0x07ee, B:209:0x07f4, B:211:0x07fe, B:212:0x0804, B:214:0x080a, B:217:0x081d, B:219:0x0833, B:220:0x0837, B:222:0x083e, B:224:0x084c, B:226:0x0886, B:225:0x087f, B:227:0x0889, B:228:0x0899, B:230:0x089f, B:232:0x08a9, B:234:0x08af, B:236:0x08b9, B:237:0x08c3, B:238:0x08c6, B:239:0x08d3, B:241:0x08d9, B:243:0x08e7, B:245:0x08f5, B:247:0x0901, B:249:0x090f, B:250:0x0914, B:254:0x0927, B:256:0x0949, B:258:0x095c, B:257:0x0955, B:259:0x0966, B:261:0x096e, B:263:0x0976, B:265:0x097a, B:267:0x097e, B:270:0x0989, B:269:0x0982, B:271:0x098e, B:272:0x0994, B:274:0x099a, B:276:0x09a8, B:278:0x09ac, B:17:0x006e, B:21:0x0078, B:22:0x0080, B:24:0x0086, B:26:0x0090, B:29:0x0098, B:31:0x009c, B:33:0x00a0, B:36:0x00a8, B:38:0x00b6, B:40:0x00d2, B:41:0x00d9, B:42:0x00e8, B:44:0x00ee, B:45:0x0106, B:47:0x010c, B:49:0x011a, B:72:0x01d3, B:52:0x0120, B:53:0x0127, B:55:0x012d, B:57:0x0143, B:59:0x0149, B:61:0x014d, B:63:0x0155, B:65:0x015d, B:67:0x016d, B:69:0x0175, B:71:0x01ac, B:73:0x01fc, B:75:0x0208, B:77:0x0214, B:79:0x0260, B:78:0x023c, B:80:0x0263, B:82:0x026e, B:83:0x0277, B:85:0x0282, B:87:0x0286, B:112:0x02ec, B:114:0x02f6, B:116:0x02fa, B:117:0x0336, B:118:0x033f, B:120:0x0364, B:125:0x036d, B:126:0x0376, B:127:0x0382, B:129:0x0388, B:131:0x0394, B:138:0x03bd, B:140:0x03c3, B:142:0x03c7, B:144:0x03d1, B:147:0x03e0, B:149:0x03f8, B:148:0x03ee, B:145:0x03dc, B:123:0x0369, B:89:0x028a, B:91:0x0291, B:96:0x02aa, B:97:0x02b3, B:99:0x02b7, B:101:0x02be, B:103:0x02ce, B:108:0x02e4, B:105:0x02d8, B:150:0x0437), top: B:289:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x036d A[Catch: all -> 0x09c9, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000e, B:7:0x0014, B:9:0x0024, B:10:0x0028, B:12:0x002f, B:13:0x0066, B:15:0x006a, B:151:0x043e, B:152:0x044f, B:154:0x0455, B:156:0x0473, B:158:0x0482, B:160:0x0496, B:161:0x049e, B:163:0x04a2, B:175:0x0587, B:176:0x0596, B:178:0x059c, B:180:0x05ae, B:182:0x05f6, B:183:0x05fe, B:185:0x0606, B:186:0x061b, B:189:0x0636, B:191:0x063e, B:193:0x0644, B:195:0x065c, B:198:0x06a9, B:199:0x06e2, B:201:0x06ea, B:203:0x0779, B:204:0x0792, B:205:0x079d, B:164:0x04fd, B:166:0x050d, B:168:0x0511, B:169:0x0530, B:171:0x0569, B:173:0x0577, B:174:0x0580, B:206:0x07d8, B:207:0x07ee, B:209:0x07f4, B:211:0x07fe, B:212:0x0804, B:214:0x080a, B:217:0x081d, B:219:0x0833, B:220:0x0837, B:222:0x083e, B:224:0x084c, B:226:0x0886, B:225:0x087f, B:227:0x0889, B:228:0x0899, B:230:0x089f, B:232:0x08a9, B:234:0x08af, B:236:0x08b9, B:237:0x08c3, B:238:0x08c6, B:239:0x08d3, B:241:0x08d9, B:243:0x08e7, B:245:0x08f5, B:247:0x0901, B:249:0x090f, B:250:0x0914, B:254:0x0927, B:256:0x0949, B:258:0x095c, B:257:0x0955, B:259:0x0966, B:261:0x096e, B:263:0x0976, B:265:0x097a, B:267:0x097e, B:270:0x0989, B:269:0x0982, B:271:0x098e, B:272:0x0994, B:274:0x099a, B:276:0x09a8, B:278:0x09ac, B:17:0x006e, B:21:0x0078, B:22:0x0080, B:24:0x0086, B:26:0x0090, B:29:0x0098, B:31:0x009c, B:33:0x00a0, B:36:0x00a8, B:38:0x00b6, B:40:0x00d2, B:41:0x00d9, B:42:0x00e8, B:44:0x00ee, B:45:0x0106, B:47:0x010c, B:49:0x011a, B:72:0x01d3, B:52:0x0120, B:53:0x0127, B:55:0x012d, B:57:0x0143, B:59:0x0149, B:61:0x014d, B:63:0x0155, B:65:0x015d, B:67:0x016d, B:69:0x0175, B:71:0x01ac, B:73:0x01fc, B:75:0x0208, B:77:0x0214, B:79:0x0260, B:78:0x023c, B:80:0x0263, B:82:0x026e, B:83:0x0277, B:85:0x0282, B:87:0x0286, B:112:0x02ec, B:114:0x02f6, B:116:0x02fa, B:117:0x0336, B:118:0x033f, B:120:0x0364, B:125:0x036d, B:126:0x0376, B:127:0x0382, B:129:0x0388, B:131:0x0394, B:138:0x03bd, B:140:0x03c3, B:142:0x03c7, B:144:0x03d1, B:147:0x03e0, B:149:0x03f8, B:148:0x03ee, B:145:0x03dc, B:123:0x0369, B:89:0x028a, B:91:0x0291, B:96:0x02aa, B:97:0x02b3, B:99:0x02b7, B:101:0x02be, B:103:0x02ce, B:108:0x02e4, B:105:0x02d8, B:150:0x0437), top: B:289:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0388 A[Catch: all -> 0x09c9, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000e, B:7:0x0014, B:9:0x0024, B:10:0x0028, B:12:0x002f, B:13:0x0066, B:15:0x006a, B:151:0x043e, B:152:0x044f, B:154:0x0455, B:156:0x0473, B:158:0x0482, B:160:0x0496, B:161:0x049e, B:163:0x04a2, B:175:0x0587, B:176:0x0596, B:178:0x059c, B:180:0x05ae, B:182:0x05f6, B:183:0x05fe, B:185:0x0606, B:186:0x061b, B:189:0x0636, B:191:0x063e, B:193:0x0644, B:195:0x065c, B:198:0x06a9, B:199:0x06e2, B:201:0x06ea, B:203:0x0779, B:204:0x0792, B:205:0x079d, B:164:0x04fd, B:166:0x050d, B:168:0x0511, B:169:0x0530, B:171:0x0569, B:173:0x0577, B:174:0x0580, B:206:0x07d8, B:207:0x07ee, B:209:0x07f4, B:211:0x07fe, B:212:0x0804, B:214:0x080a, B:217:0x081d, B:219:0x0833, B:220:0x0837, B:222:0x083e, B:224:0x084c, B:226:0x0886, B:225:0x087f, B:227:0x0889, B:228:0x0899, B:230:0x089f, B:232:0x08a9, B:234:0x08af, B:236:0x08b9, B:237:0x08c3, B:238:0x08c6, B:239:0x08d3, B:241:0x08d9, B:243:0x08e7, B:245:0x08f5, B:247:0x0901, B:249:0x090f, B:250:0x0914, B:254:0x0927, B:256:0x0949, B:258:0x095c, B:257:0x0955, B:259:0x0966, B:261:0x096e, B:263:0x0976, B:265:0x097a, B:267:0x097e, B:270:0x0989, B:269:0x0982, B:271:0x098e, B:272:0x0994, B:274:0x099a, B:276:0x09a8, B:278:0x09ac, B:17:0x006e, B:21:0x0078, B:22:0x0080, B:24:0x0086, B:26:0x0090, B:29:0x0098, B:31:0x009c, B:33:0x00a0, B:36:0x00a8, B:38:0x00b6, B:40:0x00d2, B:41:0x00d9, B:42:0x00e8, B:44:0x00ee, B:45:0x0106, B:47:0x010c, B:49:0x011a, B:72:0x01d3, B:52:0x0120, B:53:0x0127, B:55:0x012d, B:57:0x0143, B:59:0x0149, B:61:0x014d, B:63:0x0155, B:65:0x015d, B:67:0x016d, B:69:0x0175, B:71:0x01ac, B:73:0x01fc, B:75:0x0208, B:77:0x0214, B:79:0x0260, B:78:0x023c, B:80:0x0263, B:82:0x026e, B:83:0x0277, B:85:0x0282, B:87:0x0286, B:112:0x02ec, B:114:0x02f6, B:116:0x02fa, B:117:0x0336, B:118:0x033f, B:120:0x0364, B:125:0x036d, B:126:0x0376, B:127:0x0382, B:129:0x0388, B:131:0x0394, B:138:0x03bd, B:140:0x03c3, B:142:0x03c7, B:144:0x03d1, B:147:0x03e0, B:149:0x03f8, B:148:0x03ee, B:145:0x03dc, B:123:0x0369, B:89:0x028a, B:91:0x0291, B:96:0x02aa, B:97:0x02b3, B:99:0x02b7, B:101:0x02be, B:103:0x02ce, B:108:0x02e4, B:105:0x02d8, B:150:0x0437), top: B:289:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x0394 A[Catch: all -> 0x09c9, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000e, B:7:0x0014, B:9:0x0024, B:10:0x0028, B:12:0x002f, B:13:0x0066, B:15:0x006a, B:151:0x043e, B:152:0x044f, B:154:0x0455, B:156:0x0473, B:158:0x0482, B:160:0x0496, B:161:0x049e, B:163:0x04a2, B:175:0x0587, B:176:0x0596, B:178:0x059c, B:180:0x05ae, B:182:0x05f6, B:183:0x05fe, B:185:0x0606, B:186:0x061b, B:189:0x0636, B:191:0x063e, B:193:0x0644, B:195:0x065c, B:198:0x06a9, B:199:0x06e2, B:201:0x06ea, B:203:0x0779, B:204:0x0792, B:205:0x079d, B:164:0x04fd, B:166:0x050d, B:168:0x0511, B:169:0x0530, B:171:0x0569, B:173:0x0577, B:174:0x0580, B:206:0x07d8, B:207:0x07ee, B:209:0x07f4, B:211:0x07fe, B:212:0x0804, B:214:0x080a, B:217:0x081d, B:219:0x0833, B:220:0x0837, B:222:0x083e, B:224:0x084c, B:226:0x0886, B:225:0x087f, B:227:0x0889, B:228:0x0899, B:230:0x089f, B:232:0x08a9, B:234:0x08af, B:236:0x08b9, B:237:0x08c3, B:238:0x08c6, B:239:0x08d3, B:241:0x08d9, B:243:0x08e7, B:245:0x08f5, B:247:0x0901, B:249:0x090f, B:250:0x0914, B:254:0x0927, B:256:0x0949, B:258:0x095c, B:257:0x0955, B:259:0x0966, B:261:0x096e, B:263:0x0976, B:265:0x097a, B:267:0x097e, B:270:0x0989, B:269:0x0982, B:271:0x098e, B:272:0x0994, B:274:0x099a, B:276:0x09a8, B:278:0x09ac, B:17:0x006e, B:21:0x0078, B:22:0x0080, B:24:0x0086, B:26:0x0090, B:29:0x0098, B:31:0x009c, B:33:0x00a0, B:36:0x00a8, B:38:0x00b6, B:40:0x00d2, B:41:0x00d9, B:42:0x00e8, B:44:0x00ee, B:45:0x0106, B:47:0x010c, B:49:0x011a, B:72:0x01d3, B:52:0x0120, B:53:0x0127, B:55:0x012d, B:57:0x0143, B:59:0x0149, B:61:0x014d, B:63:0x0155, B:65:0x015d, B:67:0x016d, B:69:0x0175, B:71:0x01ac, B:73:0x01fc, B:75:0x0208, B:77:0x0214, B:79:0x0260, B:78:0x023c, B:80:0x0263, B:82:0x026e, B:83:0x0277, B:85:0x0282, B:87:0x0286, B:112:0x02ec, B:114:0x02f6, B:116:0x02fa, B:117:0x0336, B:118:0x033f, B:120:0x0364, B:125:0x036d, B:126:0x0376, B:127:0x0382, B:129:0x0388, B:131:0x0394, B:138:0x03bd, B:140:0x03c3, B:142:0x03c7, B:144:0x03d1, B:147:0x03e0, B:149:0x03f8, B:148:0x03ee, B:145:0x03dc, B:123:0x0369, B:89:0x028a, B:91:0x0291, B:96:0x02aa, B:97:0x02b3, B:99:0x02b7, B:101:0x02be, B:103:0x02ce, B:108:0x02e4, B:105:0x02d8, B:150:0x0437), top: B:289:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:134:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:138:0x03bd A[Catch: all -> 0x09c9, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000e, B:7:0x0014, B:9:0x0024, B:10:0x0028, B:12:0x002f, B:13:0x0066, B:15:0x006a, B:151:0x043e, B:152:0x044f, B:154:0x0455, B:156:0x0473, B:158:0x0482, B:160:0x0496, B:161:0x049e, B:163:0x04a2, B:175:0x0587, B:176:0x0596, B:178:0x059c, B:180:0x05ae, B:182:0x05f6, B:183:0x05fe, B:185:0x0606, B:186:0x061b, B:189:0x0636, B:191:0x063e, B:193:0x0644, B:195:0x065c, B:198:0x06a9, B:199:0x06e2, B:201:0x06ea, B:203:0x0779, B:204:0x0792, B:205:0x079d, B:164:0x04fd, B:166:0x050d, B:168:0x0511, B:169:0x0530, B:171:0x0569, B:173:0x0577, B:174:0x0580, B:206:0x07d8, B:207:0x07ee, B:209:0x07f4, B:211:0x07fe, B:212:0x0804, B:214:0x080a, B:217:0x081d, B:219:0x0833, B:220:0x0837, B:222:0x083e, B:224:0x084c, B:226:0x0886, B:225:0x087f, B:227:0x0889, B:228:0x0899, B:230:0x089f, B:232:0x08a9, B:234:0x08af, B:236:0x08b9, B:237:0x08c3, B:238:0x08c6, B:239:0x08d3, B:241:0x08d9, B:243:0x08e7, B:245:0x08f5, B:247:0x0901, B:249:0x090f, B:250:0x0914, B:254:0x0927, B:256:0x0949, B:258:0x095c, B:257:0x0955, B:259:0x0966, B:261:0x096e, B:263:0x0976, B:265:0x097a, B:267:0x097e, B:270:0x0989, B:269:0x0982, B:271:0x098e, B:272:0x0994, B:274:0x099a, B:276:0x09a8, B:278:0x09ac, B:17:0x006e, B:21:0x0078, B:22:0x0080, B:24:0x0086, B:26:0x0090, B:29:0x0098, B:31:0x009c, B:33:0x00a0, B:36:0x00a8, B:38:0x00b6, B:40:0x00d2, B:41:0x00d9, B:42:0x00e8, B:44:0x00ee, B:45:0x0106, B:47:0x010c, B:49:0x011a, B:72:0x01d3, B:52:0x0120, B:53:0x0127, B:55:0x012d, B:57:0x0143, B:59:0x0149, B:61:0x014d, B:63:0x0155, B:65:0x015d, B:67:0x016d, B:69:0x0175, B:71:0x01ac, B:73:0x01fc, B:75:0x0208, B:77:0x0214, B:79:0x0260, B:78:0x023c, B:80:0x0263, B:82:0x026e, B:83:0x0277, B:85:0x0282, B:87:0x0286, B:112:0x02ec, B:114:0x02f6, B:116:0x02fa, B:117:0x0336, B:118:0x033f, B:120:0x0364, B:125:0x036d, B:126:0x0376, B:127:0x0382, B:129:0x0388, B:131:0x0394, B:138:0x03bd, B:140:0x03c3, B:142:0x03c7, B:144:0x03d1, B:147:0x03e0, B:149:0x03f8, B:148:0x03ee, B:145:0x03dc, B:123:0x0369, B:89:0x028a, B:91:0x0291, B:96:0x02aa, B:97:0x02b3, B:99:0x02b7, B:101:0x02be, B:103:0x02ce, B:108:0x02e4, B:105:0x02d8, B:150:0x0437), top: B:289:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:142:0x03c7 A[Catch: all -> 0x09c9, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000e, B:7:0x0014, B:9:0x0024, B:10:0x0028, B:12:0x002f, B:13:0x0066, B:15:0x006a, B:151:0x043e, B:152:0x044f, B:154:0x0455, B:156:0x0473, B:158:0x0482, B:160:0x0496, B:161:0x049e, B:163:0x04a2, B:175:0x0587, B:176:0x0596, B:178:0x059c, B:180:0x05ae, B:182:0x05f6, B:183:0x05fe, B:185:0x0606, B:186:0x061b, B:189:0x0636, B:191:0x063e, B:193:0x0644, B:195:0x065c, B:198:0x06a9, B:199:0x06e2, B:201:0x06ea, B:203:0x0779, B:204:0x0792, B:205:0x079d, B:164:0x04fd, B:166:0x050d, B:168:0x0511, B:169:0x0530, B:171:0x0569, B:173:0x0577, B:174:0x0580, B:206:0x07d8, B:207:0x07ee, B:209:0x07f4, B:211:0x07fe, B:212:0x0804, B:214:0x080a, B:217:0x081d, B:219:0x0833, B:220:0x0837, B:222:0x083e, B:224:0x084c, B:226:0x0886, B:225:0x087f, B:227:0x0889, B:228:0x0899, B:230:0x089f, B:232:0x08a9, B:234:0x08af, B:236:0x08b9, B:237:0x08c3, B:238:0x08c6, B:239:0x08d3, B:241:0x08d9, B:243:0x08e7, B:245:0x08f5, B:247:0x0901, B:249:0x090f, B:250:0x0914, B:254:0x0927, B:256:0x0949, B:258:0x095c, B:257:0x0955, B:259:0x0966, B:261:0x096e, B:263:0x0976, B:265:0x097a, B:267:0x097e, B:270:0x0989, B:269:0x0982, B:271:0x098e, B:272:0x0994, B:274:0x099a, B:276:0x09a8, B:278:0x09ac, B:17:0x006e, B:21:0x0078, B:22:0x0080, B:24:0x0086, B:26:0x0090, B:29:0x0098, B:31:0x009c, B:33:0x00a0, B:36:0x00a8, B:38:0x00b6, B:40:0x00d2, B:41:0x00d9, B:42:0x00e8, B:44:0x00ee, B:45:0x0106, B:47:0x010c, B:49:0x011a, B:72:0x01d3, B:52:0x0120, B:53:0x0127, B:55:0x012d, B:57:0x0143, B:59:0x0149, B:61:0x014d, B:63:0x0155, B:65:0x015d, B:67:0x016d, B:69:0x0175, B:71:0x01ac, B:73:0x01fc, B:75:0x0208, B:77:0x0214, B:79:0x0260, B:78:0x023c, B:80:0x0263, B:82:0x026e, B:83:0x0277, B:85:0x0282, B:87:0x0286, B:112:0x02ec, B:114:0x02f6, B:116:0x02fa, B:117:0x0336, B:118:0x033f, B:120:0x0364, B:125:0x036d, B:126:0x0376, B:127:0x0382, B:129:0x0388, B:131:0x0394, B:138:0x03bd, B:140:0x03c3, B:142:0x03c7, B:144:0x03d1, B:147:0x03e0, B:149:0x03f8, B:148:0x03ee, B:145:0x03dc, B:123:0x0369, B:89:0x028a, B:91:0x0291, B:96:0x02aa, B:97:0x02b3, B:99:0x02b7, B:101:0x02be, B:103:0x02ce, B:108:0x02e4, B:105:0x02d8, B:150:0x0437), top: B:289:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x03dc A[Catch: all -> 0x09c9, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000e, B:7:0x0014, B:9:0x0024, B:10:0x0028, B:12:0x002f, B:13:0x0066, B:15:0x006a, B:151:0x043e, B:152:0x044f, B:154:0x0455, B:156:0x0473, B:158:0x0482, B:160:0x0496, B:161:0x049e, B:163:0x04a2, B:175:0x0587, B:176:0x0596, B:178:0x059c, B:180:0x05ae, B:182:0x05f6, B:183:0x05fe, B:185:0x0606, B:186:0x061b, B:189:0x0636, B:191:0x063e, B:193:0x0644, B:195:0x065c, B:198:0x06a9, B:199:0x06e2, B:201:0x06ea, B:203:0x0779, B:204:0x0792, B:205:0x079d, B:164:0x04fd, B:166:0x050d, B:168:0x0511, B:169:0x0530, B:171:0x0569, B:173:0x0577, B:174:0x0580, B:206:0x07d8, B:207:0x07ee, B:209:0x07f4, B:211:0x07fe, B:212:0x0804, B:214:0x080a, B:217:0x081d, B:219:0x0833, B:220:0x0837, B:222:0x083e, B:224:0x084c, B:226:0x0886, B:225:0x087f, B:227:0x0889, B:228:0x0899, B:230:0x089f, B:232:0x08a9, B:234:0x08af, B:236:0x08b9, B:237:0x08c3, B:238:0x08c6, B:239:0x08d3, B:241:0x08d9, B:243:0x08e7, B:245:0x08f5, B:247:0x0901, B:249:0x090f, B:250:0x0914, B:254:0x0927, B:256:0x0949, B:258:0x095c, B:257:0x0955, B:259:0x0966, B:261:0x096e, B:263:0x0976, B:265:0x097a, B:267:0x097e, B:270:0x0989, B:269:0x0982, B:271:0x098e, B:272:0x0994, B:274:0x099a, B:276:0x09a8, B:278:0x09ac, B:17:0x006e, B:21:0x0078, B:22:0x0080, B:24:0x0086, B:26:0x0090, B:29:0x0098, B:31:0x009c, B:33:0x00a0, B:36:0x00a8, B:38:0x00b6, B:40:0x00d2, B:41:0x00d9, B:42:0x00e8, B:44:0x00ee, B:45:0x0106, B:47:0x010c, B:49:0x011a, B:72:0x01d3, B:52:0x0120, B:53:0x0127, B:55:0x012d, B:57:0x0143, B:59:0x0149, B:61:0x014d, B:63:0x0155, B:65:0x015d, B:67:0x016d, B:69:0x0175, B:71:0x01ac, B:73:0x01fc, B:75:0x0208, B:77:0x0214, B:79:0x0260, B:78:0x023c, B:80:0x0263, B:82:0x026e, B:83:0x0277, B:85:0x0282, B:87:0x0286, B:112:0x02ec, B:114:0x02f6, B:116:0x02fa, B:117:0x0336, B:118:0x033f, B:120:0x0364, B:125:0x036d, B:126:0x0376, B:127:0x0382, B:129:0x0388, B:131:0x0394, B:138:0x03bd, B:140:0x03c3, B:142:0x03c7, B:144:0x03d1, B:147:0x03e0, B:149:0x03f8, B:148:0x03ee, B:145:0x03dc, B:123:0x0369, B:89:0x028a, B:91:0x0291, B:96:0x02aa, B:97:0x02b3, B:99:0x02b7, B:101:0x02be, B:103:0x02ce, B:108:0x02e4, B:105:0x02d8, B:150:0x0437), top: B:289:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x03e0 A[Catch: all -> 0x09c9, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000e, B:7:0x0014, B:9:0x0024, B:10:0x0028, B:12:0x002f, B:13:0x0066, B:15:0x006a, B:151:0x043e, B:152:0x044f, B:154:0x0455, B:156:0x0473, B:158:0x0482, B:160:0x0496, B:161:0x049e, B:163:0x04a2, B:175:0x0587, B:176:0x0596, B:178:0x059c, B:180:0x05ae, B:182:0x05f6, B:183:0x05fe, B:185:0x0606, B:186:0x061b, B:189:0x0636, B:191:0x063e, B:193:0x0644, B:195:0x065c, B:198:0x06a9, B:199:0x06e2, B:201:0x06ea, B:203:0x0779, B:204:0x0792, B:205:0x079d, B:164:0x04fd, B:166:0x050d, B:168:0x0511, B:169:0x0530, B:171:0x0569, B:173:0x0577, B:174:0x0580, B:206:0x07d8, B:207:0x07ee, B:209:0x07f4, B:211:0x07fe, B:212:0x0804, B:214:0x080a, B:217:0x081d, B:219:0x0833, B:220:0x0837, B:222:0x083e, B:224:0x084c, B:226:0x0886, B:225:0x087f, B:227:0x0889, B:228:0x0899, B:230:0x089f, B:232:0x08a9, B:234:0x08af, B:236:0x08b9, B:237:0x08c3, B:238:0x08c6, B:239:0x08d3, B:241:0x08d9, B:243:0x08e7, B:245:0x08f5, B:247:0x0901, B:249:0x090f, B:250:0x0914, B:254:0x0927, B:256:0x0949, B:258:0x095c, B:257:0x0955, B:259:0x0966, B:261:0x096e, B:263:0x0976, B:265:0x097a, B:267:0x097e, B:270:0x0989, B:269:0x0982, B:271:0x098e, B:272:0x0994, B:274:0x099a, B:276:0x09a8, B:278:0x09ac, B:17:0x006e, B:21:0x0078, B:22:0x0080, B:24:0x0086, B:26:0x0090, B:29:0x0098, B:31:0x009c, B:33:0x00a0, B:36:0x00a8, B:38:0x00b6, B:40:0x00d2, B:41:0x00d9, B:42:0x00e8, B:44:0x00ee, B:45:0x0106, B:47:0x010c, B:49:0x011a, B:72:0x01d3, B:52:0x0120, B:53:0x0127, B:55:0x012d, B:57:0x0143, B:59:0x0149, B:61:0x014d, B:63:0x0155, B:65:0x015d, B:67:0x016d, B:69:0x0175, B:71:0x01ac, B:73:0x01fc, B:75:0x0208, B:77:0x0214, B:79:0x0260, B:78:0x023c, B:80:0x0263, B:82:0x026e, B:83:0x0277, B:85:0x0282, B:87:0x0286, B:112:0x02ec, B:114:0x02f6, B:116:0x02fa, B:117:0x0336, B:118:0x033f, B:120:0x0364, B:125:0x036d, B:126:0x0376, B:127:0x0382, B:129:0x0388, B:131:0x0394, B:138:0x03bd, B:140:0x03c3, B:142:0x03c7, B:144:0x03d1, B:147:0x03e0, B:149:0x03f8, B:148:0x03ee, B:145:0x03dc, B:123:0x0369, B:89:0x028a, B:91:0x0291, B:96:0x02aa, B:97:0x02b3, B:99:0x02b7, B:101:0x02be, B:103:0x02ce, B:108:0x02e4, B:105:0x02d8, B:150:0x0437), top: B:289:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x03ee A[Catch: all -> 0x09c9, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000e, B:7:0x0014, B:9:0x0024, B:10:0x0028, B:12:0x002f, B:13:0x0066, B:15:0x006a, B:151:0x043e, B:152:0x044f, B:154:0x0455, B:156:0x0473, B:158:0x0482, B:160:0x0496, B:161:0x049e, B:163:0x04a2, B:175:0x0587, B:176:0x0596, B:178:0x059c, B:180:0x05ae, B:182:0x05f6, B:183:0x05fe, B:185:0x0606, B:186:0x061b, B:189:0x0636, B:191:0x063e, B:193:0x0644, B:195:0x065c, B:198:0x06a9, B:199:0x06e2, B:201:0x06ea, B:203:0x0779, B:204:0x0792, B:205:0x079d, B:164:0x04fd, B:166:0x050d, B:168:0x0511, B:169:0x0530, B:171:0x0569, B:173:0x0577, B:174:0x0580, B:206:0x07d8, B:207:0x07ee, B:209:0x07f4, B:211:0x07fe, B:212:0x0804, B:214:0x080a, B:217:0x081d, B:219:0x0833, B:220:0x0837, B:222:0x083e, B:224:0x084c, B:226:0x0886, B:225:0x087f, B:227:0x0889, B:228:0x0899, B:230:0x089f, B:232:0x08a9, B:234:0x08af, B:236:0x08b9, B:237:0x08c3, B:238:0x08c6, B:239:0x08d3, B:241:0x08d9, B:243:0x08e7, B:245:0x08f5, B:247:0x0901, B:249:0x090f, B:250:0x0914, B:254:0x0927, B:256:0x0949, B:258:0x095c, B:257:0x0955, B:259:0x0966, B:261:0x096e, B:263:0x0976, B:265:0x097a, B:267:0x097e, B:270:0x0989, B:269:0x0982, B:271:0x098e, B:272:0x0994, B:274:0x099a, B:276:0x09a8, B:278:0x09ac, B:17:0x006e, B:21:0x0078, B:22:0x0080, B:24:0x0086, B:26:0x0090, B:29:0x0098, B:31:0x009c, B:33:0x00a0, B:36:0x00a8, B:38:0x00b6, B:40:0x00d2, B:41:0x00d9, B:42:0x00e8, B:44:0x00ee, B:45:0x0106, B:47:0x010c, B:49:0x011a, B:72:0x01d3, B:52:0x0120, B:53:0x0127, B:55:0x012d, B:57:0x0143, B:59:0x0149, B:61:0x014d, B:63:0x0155, B:65:0x015d, B:67:0x016d, B:69:0x0175, B:71:0x01ac, B:73:0x01fc, B:75:0x0208, B:77:0x0214, B:79:0x0260, B:78:0x023c, B:80:0x0263, B:82:0x026e, B:83:0x0277, B:85:0x0282, B:87:0x0286, B:112:0x02ec, B:114:0x02f6, B:116:0x02fa, B:117:0x0336, B:118:0x033f, B:120:0x0364, B:125:0x036d, B:126:0x0376, B:127:0x0382, B:129:0x0388, B:131:0x0394, B:138:0x03bd, B:140:0x03c3, B:142:0x03c7, B:144:0x03d1, B:147:0x03e0, B:149:0x03f8, B:148:0x03ee, B:145:0x03dc, B:123:0x0369, B:89:0x028a, B:91:0x0291, B:96:0x02aa, B:97:0x02b3, B:99:0x02b7, B:101:0x02be, B:103:0x02ce, B:108:0x02e4, B:105:0x02d8, B:150:0x0437), top: B:289:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:373:0x033f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:374:0x0336 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:375:0x02f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:407:0x03b6 A[SYNTHETIC] */
    private final synchronized void w() {
        lmr lmrVarA;
        long j;
        gde gdeVar;
        gdg gdgVarA;
        gfs gfsVar;
        htf htfVarB;
        gfi gfiVar;
        int i;
        long jAbs;
        long j2;
        ArrayList arrayList = new ArrayList();
        for (gdf gdfVar : this.d) {
            if (this.f.contains(gdfVar.a)) {
                arrayList.add(gdfVar);
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            gdf gdfVar2 = (gdf) arrayList.get(i2);
            lis lisVar = this.b;
            String strValueOf = String.valueOf(gdfVar2.a);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 30);
            sb.append("track ");
            sb.append(strValueOf);
            sb.append(" is not HDR+; cancelling");
            lisVar.b(sb.toString());
            c(gdfVar2);
        }
        if (this.v || this.w) {
            gew gewVar = this.x;
            gfs gfsVar2 = this.y;
            if (gewVar == null || gfsVar2 == null) {
                this.b.b("not launching new shots as most recent shot buffers are not available");
            } else {
                int i3 = 0;
                boolean z = false;
                for (gde gdeVar2 : this.e) {
                    if (gdeVar2.a) {
                        if (gdeVar2.d()) {
                            z = true;
                        } else {
                            i3++;
                        }
                    }
                }
                while (true) {
                    if (!this.w && ((!this.i.c && z) || i3 >= ((gey) this.m.get()).a())) {
                        break;
                    }
                    lis lisVar2 = this.b;
                    StringBuilder sb2 = new StringBuilder(53);
                    sb2.append("trying to add shots; currently in flight: ");
                    sb2.append(i3);
                    lisVar2.b(sb2.toString());
                    if (this.w) {
                        this.b.b("... but ignoring counts since this is our last chance before shutdown");
                    }
                    List<gan> listC = this.j.c();
                    ArrayList arrayList2 = new ArrayList();
                    for (gan ganVar : listC) {
                        Long lValueOf = Long.valueOf(ganVar.c());
                        orj orjVarF = orj.f(lValueOf, lValueOf);
                        for (gdf gdfVar3 : this.d) {
                            if (gdfVar3.d.o(orjVarF)) {
                                if (!gdfVar3.f) {
                                    Iterator it = this.e.iterator();
                                    int i4 = 0;
                                    while (it.hasNext()) {
                                        gde gdeVar3 = (gde) it.next();
                                        it = it;
                                        if (gdfVar3.d.o(gdeVar3.c()) && gdeVar3.e() && (gdeVar3.a || gdeVar3.b.g())) {
                                            i4++;
                                        }
                                    }
                                    int iS = s(t(gdfVar3), gdfVar3.f);
                                    if (this.i.c && !gdfVar3.d.n()) {
                                        lis lisVar3 = this.b;
                                        String strValueOf2 = String.valueOf(gdfVar3.d);
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf2).length() + 140);
                                        sb3.append("Cannot launch alternative as this shot (");
                                        sb3.append(i4);
                                        sb3.append(") requires the full range (");
                                        sb3.append(strValueOf2);
                                        sb3.append(") of shots (and we have not reached that yet). Need to wait...");
                                        lisVar3.b(sb3.toString());
                                    } else if (i4 >= iS) {
                                        lis lisVar4 = this.b;
                                        StringBuilder sb4 = new StringBuilder(90);
                                        sb4.append("Cannot launch alternative as we have already exceeded the max (");
                                        sb4.append(i4);
                                        sb4.append(" of ");
                                        sb4.append(iS);
                                        sb4.append(")");
                                        lisVar4.b(sb4.toString());
                                    }
                                }
                                arrayList2.add(ganVar);
                                lis lisVar5 = this.b;
                                String strValueOf3 = String.valueOf(ganVar);
                                StringBuilder sb5 = new StringBuilder(String.valueOf(strValueOf3).length() + 22);
                                sb5.append("found relevant burst! ");
                                sb5.append(strValueOf3);
                                lisVar5.b(sb5.toString());
                                break;
                            }
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    int size2 = arrayList2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        gan ganVar2 = (gan) arrayList2.get(i5);
                        if (x(ganVar2)) {
                            lis lisVar6 = this.b;
                            String strValueOf4 = String.valueOf(ganVar2);
                            StringBuilder sb6 = new StringBuilder(String.valueOf(strValueOf4).length() + 38);
                            sb6.append("burst already processing (or failed): ");
                            sb6.append(strValueOf4);
                            lisVar6.b(sb6.toString());
                        } else {
                            lis lisVar7 = this.b;
                            String strValueOf5 = String.valueOf(ganVar2);
                            StringBuilder sb7 = new StringBuilder(String.valueOf(strValueOf5).length() + 17);
                            sb7.append("not yet created: ");
                            sb7.append(strValueOf5);
                            lisVar7.b(sb7.toString());
                            arrayList3.add(ganVar2);
                        }
                    }
                    Collections.sort(arrayList3, cdg.h);
                    if (arrayList3.isEmpty()) {
                        this.b.g("Ran out of alternatives to launch.");
                        break;
                    }
                    gan ganVar3 = (gan) arrayList3.get(0);
                    if (this.u) {
                        if (this.D) {
                            int size3 = arrayList3.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size3) {
                                    ganVar3 = null;
                                    break;
                                }
                                gan ganVar4 = (gan) arrayList3.get(i6);
                                if ((ganVar4.e().g() || ganVar4.f().g()) && MomentsUtils.b(ganVar4, this.s, this.A)) {
                                    ganVar3 = ganVar4;
                                    break;
                                }
                                i6++;
                            }
                            if (ganVar3 == null) {
                                break;
                            }
                            lmrVarA = gewVar.a(ganVar3.c());
                            if (lmrVarA == null) {
                                lmw lmwVarB = lmrVarA.b();
                                lmwVarB.getClass();
                                long j3 = lmwVarB.b;
                                lis lisVar8 = this.b;
                                StringBuilder sb8 = new StringBuilder(40);
                                sb8.append("adding launch frame ");
                                sb8.append(j3);
                                lisVar8.b(sb8.toString());
                                if (this.u) {
                                    if (this.D) {
                                        this.A.add(ganVar3.d());
                                    }
                                } else if (this.C) {
                                    this.A.add(ganVar3.d());
                                }
                                j = Long.MAX_VALUE;
                                gdeVar = null;
                                for (gde gdeVar4 : this.e) {
                                    if (gdeVar4.d()) {
                                        long j4 = gdeVar4.a().e;
                                        lmw lmwVarB2 = lmrVarA.b();
                                        lmwVarB2.getClass();
                                        i = i3;
                                        jAbs = Math.abs(j4 - lmwVarB2.b);
                                        if (jAbs < j) {
                                            j = jAbs;
                                            gdeVar = gdeVar4;
                                        }
                                    } else {
                                        i = i3;
                                    }
                                    i3 = i;
                                }
                                int i7 = i3;
                                if (gdeVar != null) {
                                    gdgVarA = gdeVar.a();
                                } else {
                                    gdgVarA = null;
                                }
                                gfsVar = this.y;
                                if (gfsVar == null) {
                                    htfVarB = htf.OFF;
                                } else {
                                    htfVarB = htf.OFF;
                                }
                                if (gdgVarA == null) {
                                    this.b.b("Cannot associate main session with this burst, use the default setting.");
                                    gfiVar = new gfi(htfVarB, false);
                                } else {
                                    gfiVar = new gfi(htfVarB, gdgVarA.d.b);
                                }
                                gdh gdhVar = new gdh(ganVar3.c(), ganVar3.b(), ganVar3.a());
                                gdhVar.d = ojc.i(Long.valueOf(System.currentTimeMillis()));
                                ((gey) this.m.get()).b(lmrVarA, gfsVar2, gfiVar, new gdd(this, gdhVar));
                                this.e.add(gdhVar);
                                this.b.b("starting HDR+ session.");
                                i3 = i7 + 1;
                            } else {
                                if (this.w) {
                                    this.b.h("almost launched empty burst; aborting");
                                    break;
                                }
                                lis lisVar9 = this.b;
                                long jC = ganVar3.c();
                                StringBuilder sb9 = new StringBuilder(59);
                                sb9.append("inserting failed shots for timestamp <");
                                sb9.append(jC);
                                sb9.append(">");
                                lisVar9.b(sb9.toString());
                                gdh gdhVar2 = new gdh(ganVar3.c(), ganVar3.b(), ganVar3.a());
                                gdhVar2.a = false;
                                this.e.add(gdhVar2);
                            }
                        } else {
                            lmrVarA = gewVar.a(ganVar3.c());
                            if (lmrVarA == null) {
                                lmw lmwVarB3 = lmrVarA.b();
                                lmwVarB3.getClass();
                                long j5 = lmwVarB3.b;
                                lis lisVar10 = this.b;
                                StringBuilder sb10 = new StringBuilder(40);
                                sb10.append("adding launch frame ");
                                sb10.append(j5);
                                lisVar10.b(sb10.toString());
                                if (this.u) {
                                    if (this.C) {
                                        this.A.add(ganVar3.d());
                                    }
                                } else if (this.D) {
                                    this.A.add(ganVar3.d());
                                }
                                j = Long.MAX_VALUE;
                                gdeVar = null;
                                while (r4.hasNext()) {
                                    if (gdeVar4.d()) {
                                        long j6 = gdeVar4.a().e;
                                        lmw lmwVarB4 = lmrVarA.b();
                                        lmwVarB4.getClass();
                                        i = i3;
                                        jAbs = Math.abs(j6 - lmwVarB4.b);
                                        if (jAbs < j) {
                                            j = jAbs;
                                            gdeVar = gdeVar4;
                                        }
                                    } else {
                                        i = i3;
                                    }
                                    i3 = i;
                                }
                                int i8 = i3;
                                if (gdeVar != null) {
                                    gdgVarA = gdeVar.a();
                                } else {
                                    gdgVarA = null;
                                }
                                gfsVar = this.y;
                                if (gfsVar == null) {
                                    htfVarB = htf.OFF;
                                } else {
                                    htfVarB = htf.OFF;
                                }
                                if (gdgVarA == null) {
                                    this.b.b("Cannot associate main session with this burst, use the default setting.");
                                    gfiVar = new gfi(htfVarB, false);
                                } else {
                                    gfiVar = new gfi(htfVarB, gdgVarA.d.b);
                                }
                                gdh gdhVar3 = new gdh(ganVar3.c(), ganVar3.b(), ganVar3.a());
                                gdhVar3.d = ojc.i(Long.valueOf(System.currentTimeMillis()));
                                ((gey) this.m.get()).b(lmrVarA, gfsVar2, gfiVar, new gdd(this, gdhVar3));
                                this.e.add(gdhVar3);
                                this.b.b("starting HDR+ session.");
                                i3 = i8 + 1;
                            } else {
                                if (this.w) {
                                    this.b.h("almost launched empty burst; aborting");
                                    break;
                                }
                                lis lisVar11 = this.b;
                                long jC2 = ganVar3.c();
                                StringBuilder sb11 = new StringBuilder(59);
                                sb11.append("inserting failed shots for timestamp <");
                                sb11.append(jC2);
                                sb11.append(">");
                                lisVar11.b(sb11.toString());
                                gdh gdhVar4 = new gdh(ganVar3.c(), ganVar3.b(), ganVar3.a());
                                gdhVar4.a = false;
                                this.e.add(gdhVar4);
                            }
                        }
                    } else if (this.F || this.E) {
                        int size4 = arrayList3.size();
                        int i9 = 0;
                        while (true) {
                            if (i9 >= size4) {
                                ganVar3 = null;
                                break;
                            }
                            gan ganVar5 = (gan) arrayList3.get(i9);
                            i9++;
                            if (MomentsUtils.c(ganVar5, this.B, this.s, this.A)) {
                                ganVar3 = ganVar5;
                                break;
                            }
                        }
                        if (ganVar3 == null) {
                            this.b.b("We do not have any burst that has good quality and large diversity.");
                            break;
                        }
                        lmrVarA = gewVar.a(ganVar3.c());
                        if (lmrVarA == null) {
                            lmw lmwVarB5 = lmrVarA.b();
                            lmwVarB5.getClass();
                            long j7 = lmwVarB5.b;
                            lis lisVar12 = this.b;
                            StringBuilder sb12 = new StringBuilder(40);
                            sb12.append("adding launch frame ");
                            sb12.append(j7);
                            lisVar12.b(sb12.toString());
                            if (this.u) {
                                if (this.C) {
                                    this.A.add(ganVar3.d());
                                }
                            } else if (this.D) {
                                this.A.add(ganVar3.d());
                            }
                            j = Long.MAX_VALUE;
                            gdeVar = null;
                            while (r4.hasNext()) {
                                if (gdeVar4.d()) {
                                    long j8 = gdeVar4.a().e;
                                    lmw lmwVarB6 = lmrVarA.b();
                                    lmwVarB6.getClass();
                                    i = i3;
                                    jAbs = Math.abs(j8 - lmwVarB6.b);
                                    if (jAbs < j) {
                                        j = jAbs;
                                        gdeVar = gdeVar4;
                                    }
                                } else {
                                    i = i3;
                                }
                                i3 = i;
                            }
                            int i10 = i3;
                            if (gdeVar != null) {
                                gdgVarA = gdeVar.a();
                            } else {
                                gdgVarA = null;
                            }
                            gfsVar = this.y;
                            if (gfsVar == null && dkr.b(gfsVar.d, this.z)) {
                                htfVarB = this.r.a().b();
                            } else {
                                htfVarB = htf.OFF;
                            }
                            if (gdgVarA == null) {
                                this.b.b("Cannot associate main session with this burst, use the default setting.");
                                gfiVar = new gfi(htfVarB, false);
                            } else {
                                gfiVar = new gfi(htfVarB, gdgVarA.d.b);
                            }
                            gdh gdhVar5 = new gdh(ganVar3.c(), ganVar3.b(), ganVar3.a());
                            gdhVar5.d = ojc.i(Long.valueOf(System.currentTimeMillis()));
                            ((gey) this.m.get()).b(lmrVarA, gfsVar2, gfiVar, new gdd(this, gdhVar5));
                            this.e.add(gdhVar5);
                            this.b.b("starting HDR+ session.");
                            i3 = i10 + 1;
                        } else {
                            if (this.w) {
                                this.b.h("almost launched empty burst; aborting");
                                break;
                            }
                            lis lisVar13 = this.b;
                            long jC3 = ganVar3.c();
                            StringBuilder sb13 = new StringBuilder(59);
                            sb13.append("inserting failed shots for timestamp <");
                            sb13.append(jC3);
                            sb13.append(">");
                            lisVar13.b(sb13.toString());
                            gdh gdhVar6 = new gdh(ganVar3.c(), ganVar3.b(), ganVar3.a());
                            gdhVar6.a = false;
                            this.e.add(gdhVar6);
                        }
                    } else {
                        lmrVarA = gewVar.a(ganVar3.c());
                        if (lmrVarA == null) {
                            lmw lmwVarB7 = lmrVarA.b();
                            lmwVarB7.getClass();
                            long j9 = lmwVarB7.b;
                            lis lisVar14 = this.b;
                            StringBuilder sb14 = new StringBuilder(40);
                            sb14.append("adding launch frame ");
                            sb14.append(j9);
                            lisVar14.b(sb14.toString());
                            if (this.u) {
                                if (this.C) {
                                    this.A.add(ganVar3.d());
                                }
                            } else if (this.D) {
                                this.A.add(ganVar3.d());
                            }
                            j = Long.MAX_VALUE;
                            gdeVar = null;
                            while (r4.hasNext()) {
                                if (gdeVar4.d()) {
                                    long j10 = gdeVar4.a().e;
                                    lmw lmwVarB8 = lmrVarA.b();
                                    lmwVarB8.getClass();
                                    i = i3;
                                    jAbs = Math.abs(j10 - lmwVarB8.b);
                                    if (jAbs < j) {
                                        j = jAbs;
                                        gdeVar = gdeVar4;
                                    }
                                } else {
                                    i = i3;
                                }
                                i3 = i;
                            }
                            int i11 = i3;
                            if (gdeVar != null) {
                                gdgVarA = gdeVar.a();
                            } else {
                                gdgVarA = null;
                            }
                            gfsVar = this.y;
                            if (gfsVar == null) {
                                htfVarB = htf.OFF;
                            } else {
                                htfVarB = htf.OFF;
                            }
                            if (gdgVarA == null) {
                                this.b.b("Cannot associate main session with this burst, use the default setting.");
                                gfiVar = new gfi(htfVarB, false);
                            } else {
                                gfiVar = new gfi(htfVarB, gdgVarA.d.b);
                            }
                            gdh gdhVar7 = new gdh(ganVar3.c(), ganVar3.b(), ganVar3.a());
                            gdhVar7.d = ojc.i(Long.valueOf(System.currentTimeMillis()));
                            ((gey) this.m.get()).b(lmrVarA, gfsVar2, gfiVar, new gdd(this, gdhVar7));
                            this.e.add(gdhVar7);
                            this.b.b("starting HDR+ session.");
                            i3 = i11 + 1;
                        } else {
                            if (this.w) {
                                this.b.h("almost launched empty burst; aborting");
                                break;
                            }
                            lis lisVar15 = this.b;
                            long jC4 = ganVar3.c();
                            StringBuilder sb15 = new StringBuilder(59);
                            sb15.append("inserting failed shots for timestamp <");
                            sb15.append(jC4);
                            sb15.append(">");
                            lisVar15.b(sb15.toString());
                            gdh gdhVar8 = new gdh(ganVar3.c(), ganVar3.b(), ganVar3.a());
                            gdhVar8.a = false;
                            this.e.add(gdhVar8);
                        }
                    }
                }
            }
        }
        long jA = this.a.a();
        ArrayList arrayList4 = new ArrayList();
        for (gdf gdfVar4 : this.d) {
            lis lisVar16 = this.b;
            Locale locale = Locale.US;
            Object[] objArr = new Object[2];
            objArr[0] = gdfVar4.d.j();
            objArr[1] = gdfVar4.d.n() ? ((Long) gdfVar4.d.k()).toString() : "UNSPEC";
            lisVar16.g(String.format(locale, "Considering track for finishing, %d to: %s", objArr));
            if (gdfVar4.d.n()) {
                if (gdfVar4.e) {
                    lis lisVar17 = this.b;
                    String strValueOf6 = String.valueOf(gdfVar4.a);
                    StringBuilder sb16 = new StringBuilder(String.valueOf(strValueOf6).length() + 46);
                    sb16.append("Ending high-res track ");
                    sb16.append(strValueOf6);
                    sb16.append(" due to imminent timeout");
                    lisVar17.h(sb16.toString());
                    gdi gdiVarU = u(gdfVar4, this.j.c());
                    lis lisVar18 = this.b;
                    String strValueOf7 = String.valueOf(gdiVarU);
                    StringBuilder sb17 = new StringBuilder(String.valueOf(strValueOf7).length() + 18);
                    sb17.append("Track timing out: ");
                    sb17.append(strValueOf7);
                    lisVar18.h(sb17.toString());
                } else if (((Long) gdfVar4.d.k()).longValue() <= jA || this.w) {
                    List listC2 = this.j.c();
                    this.b.b(String.format(Locale.US, "%d bursts are available for launching track %s.", Integer.valueOf(listC2.size()), gdfVar4.a));
                    gdi gdiVarU2 = u(gdfVar4, listC2);
                    this.b.b(gdiVarU2.toString());
                    if (gdiVarU2.a + gdiVarU2.b <= 0 || gdiVarU2.f >= s(t(gdfVar4), gdfVar4.f)) {
                        this.b.b("... and we found no reason why not to finish");
                    } else {
                        this.b.b("... but we're still waiting for frames");
                    }
                } else {
                    lis lisVar19 = this.b;
                    StringBuilder sb18 = new StringBuilder(88);
                    sb18.append("... but we might still have incoming frames (... latest timestamp: ");
                    sb18.append(jA);
                    sb18.append(")");
                    lisVar19.b(sb18.toString());
                }
                ArrayList<gdh> arrayList5 = new ArrayList();
                ojc ojcVarV = oih.a;
                ojc ojcVarV2 = oih.a;
                for (gde gdeVar5 : this.e) {
                    if (gdfVar4.d.o(gdeVar5.c())) {
                        lis lisVar20 = this.b;
                        String strValueOf8 = String.valueOf(gdeVar5.c());
                        String strValueOf9 = String.valueOf(gdfVar4.d);
                        j2 = jA;
                        StringBuilder sb19 = new StringBuilder(String.valueOf(strValueOf8).length() + 46 + String.valueOf(strValueOf9).length());
                        sb19.append("adding frame from burst: ");
                        sb19.append(strValueOf8);
                        sb19.append(" to track with range ");
                        sb19.append(strValueOf9);
                        lisVar20.b(sb19.toString());
                        if (gdeVar5.d()) {
                            this.b.b("... actually, skipping it since it's from a main shot");
                        } else if (gdeVar5.b.g()) {
                            ojcVarV2 = v(ojcVarV2, gdeVar5.b().c);
                            arrayList5.add(gdeVar5.b());
                            jA = j2;
                        } else {
                            ojcVarV = v(ojcVarV, gdeVar5.b().c);
                            this.b.b("... actually, skipping it since it's still in flight");
                            jA = j2;
                        }
                    } else {
                        j2 = jA;
                    }
                    jA = j2;
                }
                long j11 = jA;
                if (ojcVarV2.g() && ojcVarV.g() && ((Long) ojcVarV.c()).longValue() < ((Long) ojcVarV2.c()).longValue()) {
                    lis lisVar21 = this.b;
                    String strValueOf10 = String.valueOf(ojcVarV.c());
                    String strValueOf11 = String.valueOf(ojcVarV2.c());
                    StringBuilder sb20 = new StringBuilder(String.valueOf(strValueOf10).length() + 90 + String.valueOf(strValueOf11).length());
                    sb20.append("earlier moments frame might drop: frame <");
                    sb20.append(strValueOf10);
                    sb20.append("> is still in flight, while frame <");
                    sb20.append(strValueOf11);
                    sb20.append("> is finished.");
                    lisVar21.b(sb20.toString());
                }
                Collections.sort(arrayList5, cdg.i);
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                lis lisVar22 = this.b;
                String strValueOf12 = String.valueOf(gdfVar4.a);
                StringBuilder sb21 = new StringBuilder(String.valueOf(strValueOf12).length() + 32);
                sb21.append("Sending frames for encoding for ");
                sb21.append(strValueOf12);
                lisVar22.b(sb21.toString());
                for (gdh gdhVar9 : arrayList5) {
                    mad madVarK = ((lwk) gdhVar9.b.c()).k();
                    madVarK.getClass();
                    obr.aR(gdhVar9.d.g(), "Start time not available for Moments shot");
                    obr.aR(gdhVar9.e.g(), "End time not available for finished Moments shot");
                    long jLongValue = ((Long) gdhVar9.e.c()).longValue() - ((Long) gdhVar9.d.c()).longValue();
                    arrayList7.add(Long.valueOf(jLongValue));
                    lis lisVar23 = this.b;
                    StringBuilder sb22 = new StringBuilder(56);
                    sb22.append("Moments HDR+ processing time in ms: ");
                    sb22.append(jLongValue);
                    lisVar23.b(sb22.toString());
                    lis lisVar24 = this.b;
                    long jD = madVarK.d();
                    StringBuilder sb23 = new StringBuilder(48);
                    sb23.append("sending out for encoding: <");
                    sb23.append(jD / 1000);
                    sb23.append(">");
                    lisVar24.b(sb23.toString());
                    if (gdfVar4.b.a(madVarK)) {
                        this.b.b(" >> success");
                        arrayList6.add(new lhy(madVarK.d(), gdhVar9.g));
                    } else {
                        this.b.b(" >> failed to encode");
                    }
                }
                lis lisVar25 = this.b;
                int size5 = arrayList6.size();
                StringBuilder sb24 = new StringBuilder(48);
                sb24.append("Setting stream with a set of ");
                sb24.append(size5);
                sb24.append(" frames.");
                lisVar25.b(sb24.toString());
                gdfVar4.b.close();
                gdfVar4.c.c(oom.j(arrayList7));
                this.o.d(gdfVar4.a, arrayList6);
                arrayList4.add(gdfVar4);
                jA = j11;
            } else {
                this.b.g("... but it doesn't have an upper bound yet");
            }
        }
        this.d.removeAll(arrayList4);
        long jA2 = this.a.a();
        ArrayList arrayList8 = new ArrayList();
        for (gde gdeVar6 : this.e) {
            if (!gdeVar6.a) {
                Iterator it2 = this.d.iterator();
                do {
                    if (!it2.hasNext()) {
                        if (!gdeVar6.c().o(orj.d(Long.valueOf((-2000000000) + jA2)))) {
                            arrayList8.add(gdeVar6);
                            break;
                        }
                        break;
                    }
                } while (!((gdf) it2.next()).d.o(gdeVar6.c()));
            }
        }
        int size6 = arrayList8.size();
        for (int i12 = 0; i12 < size6; i12++) {
            gde gdeVar7 = (gde) arrayList8.get(i12);
            if (gdeVar7.b.g()) {
                obr.aR(gdeVar7.e(), "We shouldn't get results for main shots");
                lis lisVar26 = this.b;
                long j12 = gdeVar7.b().c;
                StringBuilder sb25 = new StringBuilder(55);
                sb25.append("Disposing of YUV frame from burst: ");
                sb25.append(j12);
                lisVar26.b(sb25.toString());
                ((lwk) gdeVar7.b.c()).l();
            } else {
                this.b.b("... nothing to close as it never completed.");
            }
        }
        this.e.removeAll(arrayList8);
        float f = Float.MAX_VALUE;
        int i13 = 0;
        gdh gdhVarB = null;
        for (gde gdeVar8 : this.e) {
            if (!gdeVar8.a && !gdeVar8.d()) {
                if (gdeVar8.b().f < f) {
                    f = gdeVar8.b().f;
                    gdhVarB = gdeVar8.b();
                }
                i13++;
            }
        }
        long jA3 = this.a.a();
        long jMin = jA3;
        for (gdf gdfVar5 : this.d) {
            jMin = Math.min(jMin, gdfVar5.d.m() ? ((Long) gdfVar5.d.j()).longValue() : jMin);
            jA3 = Math.max(jA3, gdfVar5.d.n() ? ((Long) gdfVar5.d.k()).longValue() : jA3);
        }
        if (i13 >= s(TimeUnit.MILLISECONDS.convert(jA3 - jMin, TimeUnit.NANOSECONDS), true) && gdhVarB != null) {
            lis lisVar27 = this.b;
            long j13 = gdhVarB.c;
            StringBuilder sb26 = new StringBuilder(72);
            sb26.append("YUV cap reached. Disposing of YUV frame from burst: ");
            sb26.append(j13);
            lisVar27.b(sb26.toString());
            if (gdhVarB.b.g()) {
                ((lwk) gdhVarB.b.c()).l();
            } else {
                this.b.b("... nothing to close as it never completed.");
            }
            this.e.remove(gdhVarB);
            d(gdhVarB.c);
        }
        if (this.d.isEmpty() && this.e.isEmpty() && this.g == 0) {
            if (this.y != null || this.x != null) {
                this.b.b("nothing is in flight; cleaning up last parameters & buffers");
            }
            this.y = null;
            this.x = null;
        }
        Iterator it3 = this.d.iterator();
        while (it3.hasNext()) {
            if (!((gdf) it3.next()).d.n() && !this.c) {
                this.c = true;
                Handler handler = this.h;
                gcs gcsVar = new gcs(this, 0);
                geu geuVar = this.i;
                handler.postDelayed(gcsVar, geuVar.d * ((long) geuVar.e));
            }
        }
    }

    private final boolean x(gan ganVar) {
        for (gde gdeVar : this.e) {
            if (gdeVar.e() && gdeVar.b().c == ganVar.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gfh
    public final synchronized gfg a(hsp hspVar, long j, lic licVar, boolean z, gfe gfeVar, mln mlnVar) {
        lis lisVar = this.b;
        StringBuilder sb = new StringBuilder(44);
        sb.append("Microvideo started at <");
        sb.append(j);
        sb.append(">");
        lisVar.b(sb.toString());
        this.u = z;
        boolean z2 = false;
        if (z) {
            ddf ddfVar = this.q;
            ddi ddiVar = ddr.a;
            ddfVar.b();
            if (!this.q.k(ddr.d)) {
                z2 = true;
            }
        }
        if (this.p.a() != 1 && !z2) {
            q();
            this.t.c(this.u ? gba.LONGSHOT_MODE : gba.TOPSHOT_MODE);
            gfeVar.a();
            gdf gdfVar = new gdf(hspVar, gfeVar, z);
            gdfVar.d = orj.d(Long.valueOf(TimeUnit.NANOSECONDS.convert(j, TimeUnit.MICROSECONDS)));
            this.d.addLast(gdfVar);
            gbp gauVar = new gau(this.u ? this.l : this.k, mlnVar, licVar);
            if ((z && this.q.k(dds.n)) || (!z && this.q.k(dds.o))) {
                gauVar = new gat(gauVar);
            }
            gdfVar.b = gauVar;
            r();
            return new gcz(this, gdfVar);
        }
        this.b.b("... but Moments is disabled by the switcher; ignoring.");
        this.o.d(hspVar, oom.l());
        gfeVar.b();
        mlnVar.close();
        return new gfk(1);
    }

    @Override // defpackage.gfh
    public final lie b() {
        this.h.post(new gcs(this, 2));
        return new lie() { // from class: gcq
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                gdj gdjVar = this.a;
                gdjVar.h.post(new gcs(gdjVar, 3));
            }
        };
    }

    public final void c(gdf gdfVar) {
        gdfVar.b.close();
        this.o.d(gdfVar.a, oom.l());
        this.d.remove(gdfVar);
    }

    public final void d(long j) {
        for (hkn hknVar : this.A) {
            if (hknVar.a == j) {
                this.A.remove(hknVar);
                return;
            }
        }
    }

    public final void e() {
        String string;
        for (gde gdeVar : this.e) {
            if (gdeVar.e()) {
                string = Long.toString(gdeVar.b().c);
            } else {
                long j = gdeVar.a().e;
                StringBuilder sb = new StringBuilder(25);
                sb.append(j);
                sb.append(" est.");
                string = sb.toString();
            }
            lis lisVar = this.b;
            Locale locale = Locale.US;
            Object[] objArr = new Object[5];
            objArr[0] = true != gdeVar.e() ? "MAIN  " : "MTS   ";
            String str = "YES";
            objArr[1] = true != gdeVar.b.g() ? "NO " : "YES";
            if (gdeVar.e()) {
                gdeVar.b();
            }
            objArr[2] = "NO ";
            if (true != gdeVar.a) {
                str = "NO";
            }
            objArr[3] = str;
            objArr[4] = string;
            lisVar.g(String.format(locale, "   session; type: %s has_image: %s cancel: %s pending: %s timestamps: %s", objArr));
        }
        for (gdf gdfVar : this.d) {
            lis lisVar2 = this.b;
            Locale locale2 = Locale.US;
            Object[] objArr2 = new Object[3];
            objArr2[0] = gdfVar.d.j();
            objArr2[1] = gdfVar.d.n() ? ((Long) gdfVar.d.k()).toString() : "UNSPEC";
            objArr2[2] = gdfVar.a;
            lisVar2.g(String.format(locale2, "   track from: %d to: %s uri: %s", objArr2));
        }
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            this.b.g(String.format(Locale.US, "not a HDR+ shot: %s", (hsp) it.next()));
        }
    }

    @Override // defpackage.gfj
    public final void f(final hsp hspVar) {
        this.h.post(new Runnable() { // from class: gcu
            @Override // java.lang.Runnable
            public final void run() {
                gdj gdjVar = this.a;
                hsp hspVar2 = hspVar;
                synchronized (gdjVar) {
                    Iterator it = gdjVar.e.iterator();
                    while (it.hasNext()) {
                        gde gdeVar = (gde) it.next();
                        if (gdeVar.d() && gdeVar.a().c.equals(hspVar2)) {
                            it.remove();
                            gdjVar.r();
                        }
                    }
                    gdjVar.e();
                    String strValueOf = String.valueOf(hspVar2);
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 28);
                    sb.append("Failed shot ");
                    sb.append(strValueOf);
                    sb.append(" was not present");
                    throw new RuntimeException(sb.toString());
                }
            }
        });
    }

    @Override // defpackage.gfh
    public final synchronized void g(hsp hspVar) {
        lis lisVar = this.b;
        String strValueOf = String.valueOf(hspVar);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 50);
        sb.append("Track ");
        sb.append(strValueOf);
        sb.append(" just about to time out; trying to finish up");
        lisVar.b(sb.toString());
        for (gdf gdfVar : this.d) {
            if (gdfVar.a.equals(hspVar)) {
                gdfVar.e = true;
                this.b.b("... found it");
                r();
                return;
            }
        }
        this.b.b("... probably done already");
    }

    public final synchronized void h() {
        this.w = true;
        r();
    }

    @Override // defpackage.ges
    public final void i(gew gewVar, gog gogVar) {
        this.h.post(new gct(this, gewVar, gogVar, 1));
    }

    public final synchronized void j(gew gewVar, gog gogVar) {
        this.b.b("HDR+ command finished; possibly launching Moments processing");
        this.v = true;
        this.x = gewVar;
        this.y = gogVar.a;
        this.z = gogVar.b.i();
        if (gogVar.b.i() != hsr.LONG_SHOT) {
            final hsp hspVarH = gogVar.b.h();
            Iterator it = this.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.f.add(hspVarH);
                    gogVar.a.f.c(new lie() { // from class: gcr
                        @Override // defpackage.lie, java.lang.AutoCloseable
                        public final void close() {
                            gdj gdjVar = this.a;
                            hsp hspVar = hspVarH;
                            synchronized (gdjVar) {
                                lis lisVar = gdjVar.b;
                                String strValueOf = String.valueOf(hspVar);
                                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 24);
                                sb.append("removing fallback shot: ");
                                sb.append(strValueOf);
                                lisVar.b(sb.toString());
                                gdjVar.f.remove(hspVar);
                            }
                        }
                    });
                    break;
                } else {
                    gde gdeVar = (gde) it.next();
                    if (gdeVar.d() && gdeVar.a().c.equals(hspVarH)) {
                        break;
                    }
                }
            }
        }
        r();
    }

    @Override // defpackage.ges
    public final void k(gew gewVar, gog gogVar) {
        this.h.post(new gct(this, gewVar, gogVar, 0));
    }

    public final synchronized void l(gew gewVar, gog gogVar) {
        this.x = gewVar;
        this.y = gogVar.a;
        this.z = gogVar.b.i();
        this.v = false;
        this.A.clear();
        r();
    }

    @Override // defpackage.gfj
    public final void m(final hsp hspVar, final long j) {
        this.h.post(new Runnable() { // from class: gcv
            @Override // java.lang.Runnable
            public final void run() {
                this.a.n(hspVar, j);
            }
        });
    }

    public final synchronized void n(hsp hspVar, long j) {
        for (gde gdeVar : this.e) {
            if (gdeVar.d() && gdeVar.a().c.equals(hspVar)) {
                obr.aQ(gdeVar.a);
                boolean z = true;
                obr.aQ(!gdeVar.b.g());
                if (this.C && !this.u) {
                    gan ganVarB = this.j.b(j);
                    boolean z2 = ganVarB.f().g() && ((hla) ganVarB.f().c()).a.length > 0;
                    this.E = !z2 && this.q.k(dds.C) && this.q.k(dds.D);
                    if (!z2 || !this.q.k(dds.A) || !this.q.k(dds.B)) {
                        z = false;
                    }
                    this.F = z;
                    this.A.add(ganVarB.d());
                    this.B = ganVarB.a();
                }
                gdeVar.a = false;
                lis lisVar = this.b;
                String strValueOf = String.valueOf(hspVar);
                String strValueOf2 = String.valueOf(hspVar);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 28 + String.valueOf(strValueOf2).length());
                sb.append("Incoming YUV frame ");
                sb.append(strValueOf);
                sb.append(" CROSS : ");
                sb.append(strValueOf2);
                lisVar.b(sb.toString());
                r();
            }
        }
        e();
        throw new RuntimeException("Too many incoming YUV shots; we didn't start this many");
    }

    @Override // defpackage.gfj
    public final void o(final hsp hspVar, final gfi gfiVar) {
        final long jA = this.a.a();
        this.h.post(new Runnable() { // from class: gcw
            @Override // java.lang.Runnable
            public final void run() {
                this.a.p(hspVar, gfiVar, jA);
            }
        });
    }

    public final synchronized void p(hsp hspVar, gfi gfiVar, long j) {
        gdg gdgVar = new gdg(j, gfiVar, hspVar);
        this.e.add(gdgVar);
        lis lisVar = this.b;
        String strValueOf = String.valueOf(gdgVar);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 17);
        sb.append("adding main shot ");
        sb.append(strValueOf);
        lisVar.b(sb.toString());
        r();
    }

    public final void q() {
        if (this.q.k(dds.q)) {
            Trace.beginSection("Moments Prewarm");
            ((geq) this.n.get()).a();
            Trace.endSection();
        }
    }

    public final synchronized void r() {
        e();
        this.b.b("running update");
        w();
        e();
    }
}

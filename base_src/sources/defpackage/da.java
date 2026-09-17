package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.lens.sdk.LensApi;
import defpackage.adz;
import defpackage.aee;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class da {
    public final cj a;
    public final db b;
    public final bu c;
    private boolean e = false;
    public int d = -1;

    public da(cj cjVar, db dbVar, bu buVar) {
        this.a = cjVar;
        this.b = dbVar;
        this.c = buVar;
    }

    public da(cj cjVar, db dbVar, bu buVar, cy cyVar) {
        this.a = cjVar;
        this.b = dbVar;
        this.c = buVar;
        buVar.h = null;
        buVar.i = null;
        buVar.x = 0;
        buVar.u = false;
        buVar.q = false;
        bu buVar2 = buVar.m;
        buVar.n = buVar2 != null ? buVar2.k : null;
        buVar.m = null;
        Bundle bundle = cyVar.m;
        if (bundle != null) {
            buVar.g = bundle;
        } else {
            buVar.g = new Bundle();
        }
    }

    public da(cj cjVar, db dbVar, ClassLoader classLoader, ce ceVar, cy cyVar) {
        this.a = cjVar;
        this.b = dbVar;
        bu buVarB = ceVar.b(cyVar.a);
        Bundle bundle = cyVar.j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        buVarB.Q(cyVar.j);
        buVarB.k = cyVar.b;
        buVarB.t = cyVar.c;
        buVarB.v = true;
        buVarB.C = cyVar.d;
        buVarB.D = cyVar.e;
        buVarB.E = cyVar.f;
        buVarB.H = cyVar.g;
        buVarB.r = cyVar.h;
        buVarB.G = cyVar.i;
        buVarB.F = cyVar.k;
        buVarB.U = aea.values()[cyVar.l];
        Bundle bundle2 = cyVar.m;
        if (bundle2 != null) {
            buVarB.g = bundle2;
        } else {
            buVarB.g = new Bundle();
        }
        this.c = buVarB;
        if (cu.Q(2)) {
            String str = "Instantiated fragment " + buVarB;
        }
    }

    final void a() {
        View view;
        View view2;
        db dbVar = this.b;
        bu buVar = this.c;
        ViewGroup viewGroup = buVar.L;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = dbVar.a.indexOf(buVar);
            for (int i = iIndexOf - 1; i >= 0; i--) {
                bu buVar2 = (bu) dbVar.a.get(i);
                if (buVar2.L == viewGroup && (view2 = buVar2.M) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= dbVar.a.size()) {
                    break;
                }
                bu buVar3 = (bu) dbVar.a.get(iIndexOf);
                if (buVar3.L == viewGroup && (view = buVar3.M) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        bu buVar4 = this.c;
        buVar4.L.addView(buVar4.M, iIndexOfChild);
    }

    final void b() {
        String resourceName;
        if (this.c.t) {
            return;
        }
        if (cu.Q(3)) {
            String str = "moveto CREATE_VIEW: " + this.c;
        }
        bu buVar = this.c;
        Bundle bundle = buVar.g;
        LayoutInflater layoutInflaterAf = buVar.af();
        bu buVar2 = this.c;
        ViewGroup viewGroup = buVar2.L;
        if (viewGroup == null) {
            int i = buVar2.D;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) buVar2.y.k.a(i);
                if (viewGroup == null) {
                    bu buVar3 = this.c;
                    if (!buVar3.v) {
                        try {
                            resourceName = buVar3.t().getResourceName(this.c.D);
                        } catch (Resources.NotFoundException e) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.c.D) + " (" + resourceName + ") for fragment " + this.c);
                    }
                } else if (!(viewGroup instanceof cc)) {
                    adl.d(this.c, viewGroup);
                }
            }
        }
        bu buVar4 = this.c;
        buVar4.L = viewGroup;
        buVar4.j(layoutInflaterAf, viewGroup, buVar4.g);
        View view = this.c.M;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            bu buVar5 = this.c;
            buVar5.M.setTag(R.id.fragment_container_view_tag, buVar5);
            if (viewGroup != null) {
                a();
            }
            bu buVar6 = this.c;
            if (buVar6.F) {
                buVar6.M.setVisibility(8);
            }
            if (gl.U(this.c.M)) {
                gl.D(this.c.M);
            } else {
                View view2 = this.c.M;
                view2.addOnAttachStateChangeListener(new cz(view2));
            }
            this.c.N();
            cj cjVar = this.a;
            bu buVar7 = this.c;
            cjVar.m(buVar7, buVar7.M, buVar7.g, false);
            int visibility = this.c.M.getVisibility();
            this.c.u().l = this.c.M.getAlpha();
            bu buVar8 = this.c;
            if (buVar8.L != null && visibility == 0) {
                View viewFindFocus = buVar8.M.findFocus();
                if (viewFindFocus != null) {
                    this.c.R(viewFindFocus);
                    if (cu.Q(2)) {
                        String str2 = "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.c;
                    }
                }
                this.c.M.setAlpha(0.0f);
            }
        }
        this.c.f = 2;
    }

    final void c() {
        bu buVar = this.c;
        if (buVar.t && buVar.u && !buVar.w) {
            if (cu.Q(3)) {
                String str = "moveto CREATE_VIEW: " + this.c;
            }
            bu buVar2 = this.c;
            Bundle bundle = buVar2.g;
            buVar2.j(buVar2.af(), null, this.c.g);
            View view = this.c.M;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                bu buVar3 = this.c;
                buVar3.M.setTag(R.id.fragment_container_view_tag, buVar3);
                bu buVar4 = this.c;
                if (buVar4.F) {
                    buVar4.M.setVisibility(8);
                }
                this.c.N();
                cj cjVar = this.a;
                bu buVar5 = this.c;
                cjVar.m(buVar5, buVar5.M, buVar5.g, false);
                this.c.f = 2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:304:0x07e9 A[Catch: all -> 0x09b3, TryCatch #0 {all -> 0x09b3, blocks: (B:9:0x0022, B:10:0x0025, B:12:0x0030, B:75:0x012e, B:83:0x0143, B:85:0x0149, B:86:0x015b, B:106:0x01c1, B:108:0x01e0, B:110:0x01eb, B:111:0x01f2, B:112:0x020c, B:113:0x0225, B:92:0x0168, B:100:0x017e, B:102:0x0188, B:105:0x01a1, B:95:0x016d, B:97:0x0173, B:99:0x0179, B:89:0x0163, B:114:0x0226, B:115:0x022c, B:117:0x0232, B:118:0x0244, B:120:0x025d, B:122:0x0268, B:123:0x026f, B:124:0x0280, B:125:0x0299, B:126:0x029a, B:128:0x029e, B:130:0x02a2, B:132:0x02bc, B:133:0x02ce, B:134:0x02d1, B:135:0x02da, B:137:0x02e0, B:138:0x02f2, B:140:0x0307, B:142:0x030d, B:143:0x031d, B:145:0x0321, B:147:0x0327, B:148:0x032d, B:150:0x0331, B:151:0x033d, B:153:0x0347, B:155:0x034b, B:156:0x0353, B:157:0x036c, B:158:0x036d, B:159:0x0383, B:160:0x039c, B:161:0x039d, B:162:0x03a5, B:164:0x03ab, B:165:0x03bd, B:167:0x03c3, B:169:0x03f1, B:170:0x0406, B:171:0x041f, B:172:0x0420, B:173:0x042d, B:175:0x0433, B:176:0x0445, B:179:0x044f, B:181:0x0459, B:193:0x04be, B:194:0x04c1, B:196:0x04de, B:197:0x04ea, B:199:0x050a, B:200:0x0512, B:202:0x0518, B:203:0x0522, B:204:0x053b, B:205:0x0554, B:182:0x0466, B:183:0x0489, B:184:0x048a, B:186:0x048e, B:189:0x0497, B:190:0x04ba, B:206:0x0555, B:207:0x0557, B:209:0x055e, B:211:0x0564, B:212:0x0576, B:214:0x0581, B:215:0x0588, B:217:0x059b, B:218:0x05a7, B:219:0x05c0, B:220:0x05c1, B:221:0x05c8, B:223:0x05ce, B:224:0x05e0, B:226:0x05eb, B:227:0x05f2, B:229:0x0606, B:230:0x0612, B:231:0x062b, B:232:0x062c, B:234:0x0632, B:235:0x0644, B:237:0x064c, B:239:0x0650, B:240:0x0653, B:242:0x0659, B:244:0x065d, B:246:0x066b, B:247:0x067d, B:248:0x0680, B:249:0x0688, B:250:0x0691, B:252:0x0697, B:253:0x06a9, B:255:0x06af, B:257:0x06b3, B:258:0x06b6, B:260:0x06c1, B:262:0x06d1, B:263:0x06d8, B:265:0x06e4, B:267:0x06f3, B:268:0x0701, B:269:0x0724, B:270:0x073d, B:271:0x073e, B:273:0x0746, B:274:0x0758, B:276:0x075e, B:281:0x0769, B:283:0x0777, B:286:0x0784, B:288:0x078a, B:290:0x0792, B:292:0x0796, B:293:0x079a, B:294:0x07a3, B:296:0x07ab, B:299:0x07bd, B:301:0x07c4, B:302:0x07cd, B:304:0x07e9, B:305:0x07fb, B:307:0x0801, B:309:0x0809, B:311:0x0817, B:312:0x081f, B:314:0x0825, B:315:0x082d, B:316:0x0836, B:317:0x084f, B:297:0x07b2, B:318:0x0850, B:320:0x0856, B:321:0x0868, B:323:0x0879, B:325:0x087f, B:326:0x0889, B:328:0x08a0, B:334:0x08b7, B:336:0x08bd, B:337:0x08cd, B:331:0x08a7, B:338:0x08d6, B:339:0x08ef, B:342:0x08f4, B:344:0x08f8, B:346:0x08fe, B:348:0x0908, B:349:0x091a, B:351:0x092e, B:352:0x093e, B:353:0x0943, B:355:0x0949, B:357:0x094d, B:359:0x0951, B:361:0x095f, B:363:0x0965, B:364:0x0977, B:365:0x097b, B:367:0x0981, B:368:0x0993, B:369:0x0996, B:371:0x099c, B:373:0x09a0, B:375:0x09a6, B:376:0x09a8, B:13:0x0034, B:14:0x003e, B:15:0x0041, B:20:0x0055, B:22:0x005b, B:24:0x005f, B:26:0x006b, B:28:0x0071, B:29:0x0076, B:31:0x007a, B:32:0x0081, B:33:0x0085, B:35:0x008b, B:36:0x008f, B:38:0x0095, B:40:0x00a5, B:42:0x00a9, B:44:0x00b4, B:46:0x00c4, B:54:0x00d5, B:57:0x00db, B:66:0x00fc, B:68:0x0102, B:70:0x0107, B:72:0x010e, B:74:0x0114, B:59:0x00e2, B:60:0x00e7, B:62:0x00ed, B:64:0x00f3, B:65:0x00f8, B:49:0x00c9, B:17:0x0047, B:18:0x004c, B:19:0x0051), top: B:383:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:307:0x0801 A[Catch: all -> 0x09b3, TryCatch #0 {all -> 0x09b3, blocks: (B:9:0x0022, B:10:0x0025, B:12:0x0030, B:75:0x012e, B:83:0x0143, B:85:0x0149, B:86:0x015b, B:106:0x01c1, B:108:0x01e0, B:110:0x01eb, B:111:0x01f2, B:112:0x020c, B:113:0x0225, B:92:0x0168, B:100:0x017e, B:102:0x0188, B:105:0x01a1, B:95:0x016d, B:97:0x0173, B:99:0x0179, B:89:0x0163, B:114:0x0226, B:115:0x022c, B:117:0x0232, B:118:0x0244, B:120:0x025d, B:122:0x0268, B:123:0x026f, B:124:0x0280, B:125:0x0299, B:126:0x029a, B:128:0x029e, B:130:0x02a2, B:132:0x02bc, B:133:0x02ce, B:134:0x02d1, B:135:0x02da, B:137:0x02e0, B:138:0x02f2, B:140:0x0307, B:142:0x030d, B:143:0x031d, B:145:0x0321, B:147:0x0327, B:148:0x032d, B:150:0x0331, B:151:0x033d, B:153:0x0347, B:155:0x034b, B:156:0x0353, B:157:0x036c, B:158:0x036d, B:159:0x0383, B:160:0x039c, B:161:0x039d, B:162:0x03a5, B:164:0x03ab, B:165:0x03bd, B:167:0x03c3, B:169:0x03f1, B:170:0x0406, B:171:0x041f, B:172:0x0420, B:173:0x042d, B:175:0x0433, B:176:0x0445, B:179:0x044f, B:181:0x0459, B:193:0x04be, B:194:0x04c1, B:196:0x04de, B:197:0x04ea, B:199:0x050a, B:200:0x0512, B:202:0x0518, B:203:0x0522, B:204:0x053b, B:205:0x0554, B:182:0x0466, B:183:0x0489, B:184:0x048a, B:186:0x048e, B:189:0x0497, B:190:0x04ba, B:206:0x0555, B:207:0x0557, B:209:0x055e, B:211:0x0564, B:212:0x0576, B:214:0x0581, B:215:0x0588, B:217:0x059b, B:218:0x05a7, B:219:0x05c0, B:220:0x05c1, B:221:0x05c8, B:223:0x05ce, B:224:0x05e0, B:226:0x05eb, B:227:0x05f2, B:229:0x0606, B:230:0x0612, B:231:0x062b, B:232:0x062c, B:234:0x0632, B:235:0x0644, B:237:0x064c, B:239:0x0650, B:240:0x0653, B:242:0x0659, B:244:0x065d, B:246:0x066b, B:247:0x067d, B:248:0x0680, B:249:0x0688, B:250:0x0691, B:252:0x0697, B:253:0x06a9, B:255:0x06af, B:257:0x06b3, B:258:0x06b6, B:260:0x06c1, B:262:0x06d1, B:263:0x06d8, B:265:0x06e4, B:267:0x06f3, B:268:0x0701, B:269:0x0724, B:270:0x073d, B:271:0x073e, B:273:0x0746, B:274:0x0758, B:276:0x075e, B:281:0x0769, B:283:0x0777, B:286:0x0784, B:288:0x078a, B:290:0x0792, B:292:0x0796, B:293:0x079a, B:294:0x07a3, B:296:0x07ab, B:299:0x07bd, B:301:0x07c4, B:302:0x07cd, B:304:0x07e9, B:305:0x07fb, B:307:0x0801, B:309:0x0809, B:311:0x0817, B:312:0x081f, B:314:0x0825, B:315:0x082d, B:316:0x0836, B:317:0x084f, B:297:0x07b2, B:318:0x0850, B:320:0x0856, B:321:0x0868, B:323:0x0879, B:325:0x087f, B:326:0x0889, B:328:0x08a0, B:334:0x08b7, B:336:0x08bd, B:337:0x08cd, B:331:0x08a7, B:338:0x08d6, B:339:0x08ef, B:342:0x08f4, B:344:0x08f8, B:346:0x08fe, B:348:0x0908, B:349:0x091a, B:351:0x092e, B:352:0x093e, B:353:0x0943, B:355:0x0949, B:357:0x094d, B:359:0x0951, B:361:0x095f, B:363:0x0965, B:364:0x0977, B:365:0x097b, B:367:0x0981, B:368:0x0993, B:369:0x0996, B:371:0x099c, B:373:0x09a0, B:375:0x09a6, B:376:0x09a8, B:13:0x0034, B:14:0x003e, B:15:0x0041, B:20:0x0055, B:22:0x005b, B:24:0x005f, B:26:0x006b, B:28:0x0071, B:29:0x0076, B:31:0x007a, B:32:0x0081, B:33:0x0085, B:35:0x008b, B:36:0x008f, B:38:0x0095, B:40:0x00a5, B:42:0x00a9, B:44:0x00b4, B:46:0x00c4, B:54:0x00d5, B:57:0x00db, B:66:0x00fc, B:68:0x0102, B:70:0x0107, B:72:0x010e, B:74:0x0114, B:59:0x00e2, B:60:0x00e7, B:62:0x00ed, B:64:0x00f3, B:65:0x00f8, B:49:0x00c9, B:17:0x0047, B:18:0x004c, B:19:0x0051), top: B:383:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:314:0x0825 A[Catch: all -> 0x09b3, TryCatch #0 {all -> 0x09b3, blocks: (B:9:0x0022, B:10:0x0025, B:12:0x0030, B:75:0x012e, B:83:0x0143, B:85:0x0149, B:86:0x015b, B:106:0x01c1, B:108:0x01e0, B:110:0x01eb, B:111:0x01f2, B:112:0x020c, B:113:0x0225, B:92:0x0168, B:100:0x017e, B:102:0x0188, B:105:0x01a1, B:95:0x016d, B:97:0x0173, B:99:0x0179, B:89:0x0163, B:114:0x0226, B:115:0x022c, B:117:0x0232, B:118:0x0244, B:120:0x025d, B:122:0x0268, B:123:0x026f, B:124:0x0280, B:125:0x0299, B:126:0x029a, B:128:0x029e, B:130:0x02a2, B:132:0x02bc, B:133:0x02ce, B:134:0x02d1, B:135:0x02da, B:137:0x02e0, B:138:0x02f2, B:140:0x0307, B:142:0x030d, B:143:0x031d, B:145:0x0321, B:147:0x0327, B:148:0x032d, B:150:0x0331, B:151:0x033d, B:153:0x0347, B:155:0x034b, B:156:0x0353, B:157:0x036c, B:158:0x036d, B:159:0x0383, B:160:0x039c, B:161:0x039d, B:162:0x03a5, B:164:0x03ab, B:165:0x03bd, B:167:0x03c3, B:169:0x03f1, B:170:0x0406, B:171:0x041f, B:172:0x0420, B:173:0x042d, B:175:0x0433, B:176:0x0445, B:179:0x044f, B:181:0x0459, B:193:0x04be, B:194:0x04c1, B:196:0x04de, B:197:0x04ea, B:199:0x050a, B:200:0x0512, B:202:0x0518, B:203:0x0522, B:204:0x053b, B:205:0x0554, B:182:0x0466, B:183:0x0489, B:184:0x048a, B:186:0x048e, B:189:0x0497, B:190:0x04ba, B:206:0x0555, B:207:0x0557, B:209:0x055e, B:211:0x0564, B:212:0x0576, B:214:0x0581, B:215:0x0588, B:217:0x059b, B:218:0x05a7, B:219:0x05c0, B:220:0x05c1, B:221:0x05c8, B:223:0x05ce, B:224:0x05e0, B:226:0x05eb, B:227:0x05f2, B:229:0x0606, B:230:0x0612, B:231:0x062b, B:232:0x062c, B:234:0x0632, B:235:0x0644, B:237:0x064c, B:239:0x0650, B:240:0x0653, B:242:0x0659, B:244:0x065d, B:246:0x066b, B:247:0x067d, B:248:0x0680, B:249:0x0688, B:250:0x0691, B:252:0x0697, B:253:0x06a9, B:255:0x06af, B:257:0x06b3, B:258:0x06b6, B:260:0x06c1, B:262:0x06d1, B:263:0x06d8, B:265:0x06e4, B:267:0x06f3, B:268:0x0701, B:269:0x0724, B:270:0x073d, B:271:0x073e, B:273:0x0746, B:274:0x0758, B:276:0x075e, B:281:0x0769, B:283:0x0777, B:286:0x0784, B:288:0x078a, B:290:0x0792, B:292:0x0796, B:293:0x079a, B:294:0x07a3, B:296:0x07ab, B:299:0x07bd, B:301:0x07c4, B:302:0x07cd, B:304:0x07e9, B:305:0x07fb, B:307:0x0801, B:309:0x0809, B:311:0x0817, B:312:0x081f, B:314:0x0825, B:315:0x082d, B:316:0x0836, B:317:0x084f, B:297:0x07b2, B:318:0x0850, B:320:0x0856, B:321:0x0868, B:323:0x0879, B:325:0x087f, B:326:0x0889, B:328:0x08a0, B:334:0x08b7, B:336:0x08bd, B:337:0x08cd, B:331:0x08a7, B:338:0x08d6, B:339:0x08ef, B:342:0x08f4, B:344:0x08f8, B:346:0x08fe, B:348:0x0908, B:349:0x091a, B:351:0x092e, B:352:0x093e, B:353:0x0943, B:355:0x0949, B:357:0x094d, B:359:0x0951, B:361:0x095f, B:363:0x0965, B:364:0x0977, B:365:0x097b, B:367:0x0981, B:368:0x0993, B:369:0x0996, B:371:0x099c, B:373:0x09a0, B:375:0x09a6, B:376:0x09a8, B:13:0x0034, B:14:0x003e, B:15:0x0041, B:20:0x0055, B:22:0x005b, B:24:0x005f, B:26:0x006b, B:28:0x0071, B:29:0x0076, B:31:0x007a, B:32:0x0081, B:33:0x0085, B:35:0x008b, B:36:0x008f, B:38:0x0095, B:40:0x00a5, B:42:0x00a9, B:44:0x00b4, B:46:0x00c4, B:54:0x00d5, B:57:0x00db, B:66:0x00fc, B:68:0x0102, B:70:0x0107, B:72:0x010e, B:74:0x0114, B:59:0x00e2, B:60:0x00e7, B:62:0x00ed, B:64:0x00f3, B:65:0x00f8, B:49:0x00c9, B:17:0x0047, B:18:0x004c, B:19:0x0051), top: B:383:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:421:0x0836 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:449:0x0809 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:450:0x0817 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:0x07fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:453:0x07fb A[SYNTHETIC] */
    final void d() {
        int i;
        int iMin;
        dp dpVar;
        ViewGroup viewGroup;
        da daVarD;
        ViewGroup viewGroup2;
        bu buVar;
        bu buVar2;
        String str;
        bu buVar3;
        bu buVarA;
        View view;
        ViewGroup viewGroup3;
        if (this.e) {
            if (cu.Q(2)) {
                String str2 = "Ignoring re-entrant call to moveToExpectedState() for " + this.c;
                return;
            }
            return;
        }
        int i2 = 0;
        try {
            this.e = true;
            boolean z = false;
            while (true) {
                bu buVar4 = this.c;
                if (buVar4.y == null) {
                    iMin = buVar4.f;
                } else {
                    int iMin2 = this.d;
                    aea aeaVar = aea.DESTROYED;
                    switch (buVar4.U.ordinal()) {
                        case 1:
                            iMin2 = Math.min(iMin2, i2);
                            break;
                        case 2:
                            iMin2 = Math.min(iMin2, 1);
                            break;
                        case 3:
                            iMin2 = Math.min(iMin2, 5);
                            break;
                        case 4:
                            break;
                        default:
                            iMin2 = Math.min(iMin2, -1);
                            break;
                    }
                    bu buVar5 = this.c;
                    if (buVar5.t) {
                        if (buVar5.u) {
                            iMin2 = Math.max(this.d, 2);
                            View view2 = this.c.M;
                            if (view2 != null && view2.getParent() == null) {
                                iMin2 = Math.min(iMin2, 2);
                            }
                        } else {
                            iMin2 = this.d < 4 ? Math.min(iMin2, buVar5.f) : Math.min(iMin2, 1);
                        }
                    }
                    if (!this.c.q) {
                        iMin2 = Math.min(iMin2, 1);
                    }
                    bu buVar6 = this.c;
                    ViewGroup viewGroup4 = buVar6.L;
                    if (viewGroup4 != null) {
                        dq dqVarB = dq.b(viewGroup4, buVar6.z());
                        dp dpVarA = dqVarB.a(this.c);
                        i = dpVarA != null ? dpVarA.f : 0;
                        bu buVar7 = this.c;
                        ArrayList arrayList = dqVarB.c;
                        int size = arrayList.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 < size) {
                                dpVar = (dp) arrayList.get(i3);
                                if (!dpVar.a.equals(buVar7) || dpVar.c) {
                                    i3++;
                                }
                            } else {
                                dpVar = null;
                            }
                        }
                        if (dpVar != null && (i == 0 || i == 1)) {
                            i = dpVar.f;
                        }
                    } else {
                        i = 0;
                    }
                    if (i == 2) {
                        iMin2 = Math.min(iMin2, 6);
                    } else if (i == 3) {
                        iMin2 = Math.max(iMin2, 3);
                    } else {
                        bu buVar8 = this.c;
                        if (buVar8.r) {
                            iMin2 = buVar8.X() ? Math.min(iMin2, 1) : Math.min(iMin2, -1);
                        }
                    }
                    bu buVar9 = this.c;
                    iMin = (!buVar9.N || buVar9.f >= 5) ? iMin2 : Math.min(iMin2, 4);
                    if (cu.Q(2)) {
                        String str3 = "computeExpectedState() of " + iMin + " for " + this.c;
                    }
                }
                bu buVar10 = this.c;
                int i4 = buVar10.f;
                if (iMin == i4) {
                    if (!z && i4 == -1 && buVar10.r && !buVar10.X()) {
                        boolean z2 = this.c.s;
                        if (cu.Q(3)) {
                            String str4 = "Cleaning up state of never attached fragment: " + this.c;
                        }
                        this.b.d.a(this.c);
                        this.b.j(this);
                        if (cu.Q(3)) {
                            String str5 = "initState called for fragment: " + this.c;
                        }
                        this.c.G();
                    }
                    bu buVar11 = this.c;
                    if (buVar11.Q) {
                        if (buVar11.M != null && (viewGroup = buVar11.L) != null) {
                            dq dqVarB2 = dq.b(viewGroup, buVar11.z());
                            if (this.c.F) {
                                if (cu.Q(2)) {
                                    String str6 = "SpecialEffectsController: Enqueuing hide operation for fragment " + this.c;
                                }
                                dqVarB2.e(3, 1, this);
                            } else {
                                if (cu.Q(2)) {
                                    String str7 = "SpecialEffectsController: Enqueuing show operation for fragment " + this.c;
                                }
                                dqVarB2.e(2, 1, this);
                            }
                        }
                        bu buVar12 = this.c;
                        cu cuVar = buVar12.y;
                        if (cuVar != null && buVar12.q && cu.U(buVar12)) {
                            cuVar.p = true;
                        }
                        bu buVar13 = this.c;
                        buVar13.Q = false;
                        boolean z3 = buVar13.F;
                    }
                    this.e = false;
                    return;
                }
                if (iMin > i4) {
                    switch (i4 + 1) {
                        case 0:
                            if (cu.Q(3)) {
                                String str8 = "moveto ATTACHED: " + this.c;
                            }
                            bu buVar14 = this.c;
                            bu buVar15 = buVar14.m;
                            if (buVar15 != null) {
                                da daVarD2 = this.b.d(buVar15.k);
                                if (daVarD2 == null) {
                                    throw new IllegalStateException("Fragment " + this.c + " declared target fragment " + this.c.m + " that does not belong to this FragmentManager!");
                                }
                                bu buVar16 = this.c;
                                buVar16.n = buVar16.m.k;
                                buVar16.m = null;
                                daVarD = daVarD2;
                            } else {
                                String str9 = buVar14.n;
                                if (str9 != null) {
                                    daVarD = this.b.d(str9);
                                    if (daVarD == null) {
                                        throw new IllegalStateException("Fragment " + this.c + " declared target fragment " + this.c.n + " that does not belong to this FragmentManager!");
                                    }
                                } else {
                                    daVarD = null;
                                }
                            }
                            if (daVarD != null) {
                                daVarD.d();
                            }
                            bu buVar17 = this.c;
                            cu cuVar2 = buVar17.y;
                            buVar17.z = cuVar2.j;
                            buVar17.B = cuVar2.l;
                            this.a.g(buVar17, false);
                            bu buVar18 = this.c;
                            ArrayList arrayList2 = buVar18.Y;
                            int size2 = arrayList2.size();
                            for (int i5 = 0; i5 < size2; i5++) {
                                ((bt) arrayList2.get(i5)).a();
                            }
                            buVar18.Y.clear();
                            buVar18.A.j(buVar18.z, buVar18.fr(), buVar18);
                            buVar18.f = 0;
                            buVar18.K = false;
                            buVar18.gv(buVar18.z.c);
                            if (!buVar18.K) {
                                throw new dr("Fragment " + buVar18 + " did not call through to super.onAttach()");
                            }
                            Iterator it = buVar18.y.h.iterator();
                            while (it.hasNext()) {
                                ((cx) it.next()).c();
                            }
                            cu cuVar3 = buVar18.A;
                            cuVar3.q = false;
                            cuVar3.r = false;
                            cuVar3.t.g = false;
                            cuVar3.y(0);
                            this.a.b(this.c, false);
                            i2 = 0;
                            z = true;
                            continue;
                            break;
                        case 1:
                            if (cu.Q(3)) {
                                String str10 = "moveto CREATED: " + this.c;
                            }
                            bu buVar19 = this.c;
                            if (!buVar19.S) {
                                this.a.h(buVar19, buVar19.g, false);
                                final bu buVar20 = this.c;
                                Bundle bundle = buVar20.g;
                                buVar20.A.F();
                                buVar20.f = 1;
                                buVar20.K = false;
                                buVar20.Z.b(new aec() { // from class: android.support.v4.app.Fragment$5
                                    @Override // defpackage.aec
                                    public final void a(aee aeeVar, adz adzVar) {
                                        View view3;
                                        if (adzVar != adz.ON_STOP || (view3 = buVar20.M) == null) {
                                            return;
                                        }
                                        view3.cancelPendingInputEvents();
                                    }
                                });
                                buVar20.X.b(bundle);
                                buVar20.gA(bundle);
                                buVar20.S = true;
                                if (!buVar20.K) {
                                    throw new dr("Fragment " + buVar20 + " did not call through to super.onCreate()");
                                }
                                buVar20.Z.c(adz.ON_CREATE);
                                cj cjVar = this.a;
                                bu buVar21 = this.c;
                                cjVar.c(buVar21, buVar21.g, false);
                                i2 = 0;
                                z = true;
                            } else {
                                buVar19.O(buVar19.g);
                                this.c.f = 1;
                                i2 = 0;
                                z = true;
                                continue;
                            }
                            break;
                        case 2:
                            c();
                            b();
                            break;
                        case 3:
                            if (cu.Q(3)) {
                                String str11 = "moveto ACTIVITY_CREATED: " + this.c;
                            }
                            bu buVar22 = this.c;
                            Bundle bundle2 = buVar22.g;
                            buVar22.A.F();
                            buVar22.f = 3;
                            buVar22.K = false;
                            buVar22.H(bundle2);
                            if (!buVar22.K) {
                                throw new dr("Fragment " + buVar22 + " did not call through to super.onActivityCreated()");
                            }
                            if (cu.Q(3)) {
                                String str12 = "moveto RESTORE_VIEW_STATE: " + buVar22;
                            }
                            View view3 = buVar22.M;
                            if (view3 != null) {
                                Bundle bundle3 = buVar22.g;
                                SparseArray<Parcelable> sparseArray = buVar22.h;
                                if (sparseArray != null) {
                                    view3.restoreHierarchyState(sparseArray);
                                    buVar22.h = null;
                                }
                                if (buVar22.M != null) {
                                    buVar22.V.a.b(buVar22.i);
                                    buVar22.i = null;
                                }
                                buVar22.K = false;
                                buVar22.i(bundle3);
                                if (!buVar22.K) {
                                    throw new dr("Fragment " + buVar22 + " did not call through to super.onViewStateRestored()");
                                }
                                if (buVar22.M != null) {
                                    buVar22.V.a(adz.ON_CREATE);
                                }
                            }
                            buVar22.g = null;
                            buVar22.A.m();
                            cj cjVar2 = this.a;
                            bu buVar23 = this.c;
                            cjVar2.a(buVar23, buVar23.g, false);
                            i2 = 0;
                            z = true;
                            continue;
                            break;
                        case 4:
                            if (buVar10.M != null && (viewGroup2 = buVar10.L) != null) {
                                dq dqVarB3 = dq.b(viewGroup2, buVar10.z());
                                int iM = d.m(this.c.M.getVisibility());
                                if (cu.Q(2)) {
                                    String str13 = "SpecialEffectsController: Enqueuing add operation for fragment " + this.c;
                                }
                                dqVarB3.e(iM, 2, this);
                            }
                            this.c.f = 4;
                            i2 = 0;
                            z = true;
                            continue;
                        case 5:
                            if (cu.Q(3)) {
                                String str14 = "moveto STARTED: " + this.c;
                            }
                            bu buVar24 = this.c;
                            buVar24.A.F();
                            buVar24.A.Y(true);
                            buVar24.f = 5;
                            buVar24.K = false;
                            buVar24.g();
                            if (!buVar24.K) {
                                throw new dr("Fragment " + buVar24 + " did not call through to super.onStart()");
                            }
                            buVar24.Z.c(adz.ON_START);
                            if (buVar24.M != null) {
                                buVar24.V.a(adz.ON_START);
                            }
                            buVar24.A.x();
                            this.a.k(this.c, false);
                            i2 = 0;
                            z = true;
                            continue;
                            break;
                        case 6:
                            buVar10.f = 6;
                            i2 = 0;
                            z = true;
                            continue;
                        case 7:
                            if (cu.Q(3)) {
                                String str15 = "moveto RESUMED: " + this.c;
                            }
                            bu buVar25 = this.c;
                            br brVar = buVar25.P;
                            View view4 = brVar == null ? null : brVar.m;
                            if (view4 != null) {
                                if (view4 != buVar25.M) {
                                    ViewParent parent = view4.getParent();
                                    while (true) {
                                        if (parent != null) {
                                            if (parent != this.c.M) {
                                                parent = parent.getParent();
                                            }
                                        }
                                    }
                                }
                                boolean zRequestFocus = view4.requestFocus();
                                if (cu.Q(2)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("requestFocus: Restoring focused view ");
                                    sb.append(view4);
                                    sb.append(" ");
                                    sb.append(true != zRequestFocus ? "failed" : "succeeded");
                                    sb.append(" on Fragment ");
                                    sb.append(this.c);
                                    sb.append(" resulting in focused view ");
                                    sb.append(this.c.M.findFocus());
                                    sb.toString();
                                }
                            }
                            this.c.R(null);
                            bu buVar26 = this.c;
                            buVar26.A.F();
                            buVar26.A.Y(true);
                            buVar26.f = 7;
                            buVar26.K = false;
                            buVar26.L();
                            if (!buVar26.K) {
                                throw new dr("Fragment " + buVar26 + " did not call through to super.onResume()");
                            }
                            buVar26.Z.c(adz.ON_RESUME);
                            if (buVar26.M != null) {
                                buVar26.V.a(adz.ON_RESUME);
                            }
                            buVar26.A.w();
                            this.a.i(this.c, false);
                            bu buVar27 = this.c;
                            buVar27.g = null;
                            buVar27.h = null;
                            buVar27.i = null;
                            i2 = 0;
                            z = true;
                            continue;
                            break;
                        default:
                            i2 = 0;
                            z = true;
                            continue;
                    }
                    i2 = 0;
                    z = true;
                } else {
                    switch (i4 - 1) {
                        case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                            if (cu.Q(3)) {
                                String str16 = "movefrom ATTACHED: " + this.c;
                            }
                            bu buVar28 = this.c;
                            buVar28.f = -1;
                            buVar28.K = false;
                            buVar28.e();
                            buVar28.R = null;
                            if (!buVar28.K) {
                                throw new dr("Fragment " + buVar28 + " did not call through to super.onDetach()");
                            }
                            cu cuVar4 = buVar28.A;
                            if (!cuVar4.s) {
                                cuVar4.p();
                                buVar28.A = new cu();
                            }
                            this.a.e(this.c, false);
                            bu buVar29 = this.c;
                            buVar29.f = -1;
                            buVar29.z = null;
                            buVar29.B = null;
                            buVar29.y = null;
                            if ((!buVar29.r || buVar29.X()) && !this.b.d.e(this.c)) {
                                i2 = 0;
                                z = true;
                            } else {
                                if (cu.Q(3)) {
                                    String str17 = "initState called for fragment: " + this.c;
                                }
                                this.c.G();
                                i2 = 0;
                                z = true;
                                continue;
                            }
                            break;
                            break;
                        case 0:
                            boolean z4 = buVar10.s;
                            if (cu.Q(3)) {
                                String str18 = "movefrom CREATED: " + this.c;
                            }
                            bu buVar30 = this.c;
                            boolean z5 = buVar30.r && !buVar30.X();
                            if (z5) {
                                bu buVar31 = this.c;
                                boolean z6 = buVar31.s;
                                this.b.c(buVar31.k, null);
                            }
                            if (z5 || this.b.d.e(this.c)) {
                                cf cfVar = this.c.z;
                                boolean z7 = cfVar instanceof aey ? this.b.d.f : !((Activity) cfVar.c).isChangingConfigurations();
                                if (!z5) {
                                    if (z7) {
                                    }
                                    buVar = this.c;
                                    buVar.A.p();
                                    buVar.Z.c(adz.ON_DESTROY);
                                    buVar.f = 0;
                                    buVar.K = false;
                                    buVar.S = false;
                                    buVar.J();
                                    if (buVar.K) {
                                        throw new dr("Fragment " + buVar + " did not call through to super.onDestroy()");
                                    }
                                    this.a.d(this.c, false);
                                    for (da daVar : this.b.e()) {
                                        if (daVar != null) {
                                            buVar3 = daVar.c;
                                            if (this.c.k.equals(buVar3.n)) {
                                                buVar3.m = this.c;
                                                buVar3.n = null;
                                            }
                                        }
                                    }
                                    buVar2 = this.c;
                                    str = buVar2.n;
                                    if (str != null) {
                                        buVar2.m = this.b.a(str);
                                    }
                                    this.b.j(this);
                                    i2 = 0;
                                    z = true;
                                    continue;
                                } else {
                                    boolean z8 = this.c.s;
                                }
                                this.b.d.a(this.c);
                                buVar = this.c;
                                buVar.A.p();
                                buVar.Z.c(adz.ON_DESTROY);
                                buVar.f = 0;
                                buVar.K = false;
                                buVar.S = false;
                                buVar.J();
                                if (buVar.K) {
                                    throw new dr("Fragment " + buVar + " did not call through to super.onDestroy()");
                                }
                                this.a.d(this.c, false);
                                while (r2.hasNext()) {
                                    if (daVar != null) {
                                        buVar3 = daVar.c;
                                        if (this.c.k.equals(buVar3.n)) {
                                            buVar3.m = this.c;
                                            buVar3.n = null;
                                        }
                                    }
                                }
                                buVar2 = this.c;
                                str = buVar2.n;
                                if (str != null) {
                                    buVar2.m = this.b.a(str);
                                }
                                this.b.j(this);
                                i2 = 0;
                                z = true;
                                continue;
                            } else {
                                String str19 = this.c.n;
                                if (str19 != null && (buVarA = this.b.a(str19)) != null && buVarA.H) {
                                    this.c.m = buVarA;
                                }
                                this.c.f = 0;
                                i2 = 0;
                                z = true;
                            }
                            break;
                        case 1:
                            if (cu.Q(3)) {
                                String str20 = "movefrom CREATE_VIEW: " + this.c;
                            }
                            bu buVar32 = this.c;
                            ViewGroup viewGroup5 = buVar32.L;
                            if (viewGroup5 != null && (view = buVar32.M) != null) {
                                viewGroup5.removeView(view);
                            }
                            bu buVar33 = this.c;
                            buVar33.A.y(1);
                            if (buVar33.M != null && buVar33.V.C().a.a(aea.CREATED)) {
                                buVar33.V.a(adz.ON_DESTROY);
                            }
                            buVar33.f = 1;
                            buVar33.K = false;
                            buVar33.gw();
                            if (!buVar33.K) {
                                throw new dr("Fragment " + buVar33 + " did not call through to super.onDestroyView()");
                            }
                            afe afeVar = afa.a(buVar33).a;
                            int iB = afeVar.b.b();
                            for (int i6 = 0; i6 < iB; i6++) {
                                ((afb) afeVar.b.e(i6)).i();
                            }
                            buVar33.w = false;
                            this.a.n(this.c, false);
                            bu buVar34 = this.c;
                            buVar34.L = null;
                            buVar34.M = null;
                            buVar34.V = null;
                            buVar34.W.g(null);
                            bu buVar35 = this.c;
                            buVar35.u = false;
                            buVar35.f = 1;
                            i2 = 0;
                            z = true;
                            continue;
                            break;
                        case 2:
                            buVar10.u = false;
                            buVar10.f = 2;
                            i2 = 0;
                            z = true;
                            continue;
                        case 3:
                            if (cu.Q(3)) {
                                String str21 = "movefrom ACTIVITY_CREATED: " + this.c;
                            }
                            bu buVar36 = this.c;
                            boolean z9 = buVar36.s;
                            if (buVar36.M != null && buVar36.h == null) {
                                f();
                            }
                            bu buVar37 = this.c;
                            if (buVar37.M != null && (viewGroup3 = buVar37.L) != null) {
                                dq dqVarB4 = dq.b(viewGroup3, buVar37.z());
                                if (cu.Q(2)) {
                                    String str22 = "SpecialEffectsController: Enqueuing remove operation for fragment " + this.c;
                                }
                                dqVarB4.e(1, 3, this);
                            }
                            this.c.f = 3;
                            i2 = 0;
                            z = true;
                            continue;
                        case 4:
                            if (cu.Q(3)) {
                                String str23 = "movefrom STARTED: " + this.c;
                            }
                            bu buVar38 = this.c;
                            buVar38.A.z();
                            if (buVar38.M != null) {
                                buVar38.V.a(adz.ON_STOP);
                            }
                            buVar38.Z.c(adz.ON_STOP);
                            buVar38.f = 4;
                            buVar38.K = false;
                            buVar38.h();
                            if (!buVar38.K) {
                                throw new dr("Fragment " + buVar38 + " did not call through to super.onStop()");
                            }
                            this.a.l(this.c, false);
                            i2 = 0;
                            z = true;
                            continue;
                            break;
                        case 5:
                            buVar10.f = 5;
                            i2 = 0;
                            z = true;
                            continue;
                        case 6:
                            if (cu.Q(3)) {
                                String str24 = "movefrom RESUMED: " + this.c;
                            }
                            bu buVar39 = this.c;
                            buVar39.A.u();
                            if (buVar39.M != null) {
                                buVar39.V.a(adz.ON_PAUSE);
                            }
                            buVar39.Z.c(adz.ON_PAUSE);
                            buVar39.f = 6;
                            buVar39.K = false;
                            buVar39.K();
                            if (!buVar39.K) {
                                throw new dr("Fragment " + buVar39 + " did not call through to super.onPause()");
                            }
                            this.a.f(this.c, false);
                            i2 = 0;
                            z = true;
                            continue;
                            break;
                    }
                    i2 = 0;
                    z = true;
                }
            }
        } catch (Throwable th) {
            this.e = false;
            throw th;
        }
    }

    final void e(ClassLoader classLoader) {
        Bundle bundle = this.c.g;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        bu buVar = this.c;
        buVar.h = buVar.g.getSparseParcelableArray("android:view_state");
        bu buVar2 = this.c;
        buVar2.i = buVar2.g.getBundle("android:view_registry_state");
        bu buVar3 = this.c;
        buVar3.n = buVar3.g.getString("android:target_state");
        bu buVar4 = this.c;
        if (buVar4.n != null) {
            buVar4.o = buVar4.g.getInt("android:target_req_state", 0);
        }
        bu buVar5 = this.c;
        Boolean bool = buVar5.j;
        buVar5.O = buVar5.g.getBoolean("android:user_visible_hint", true);
        bu buVar6 = this.c;
        if (buVar6.O) {
            return;
        }
        buVar6.N = true;
    }

    final void f() {
        if (this.c.M == null) {
            return;
        }
        if (cu.Q(2)) {
            String str = "Saving view state for fragment " + this.c + " with view " + this.c.M;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.c.M.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.c.h = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.c.V.a.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.c.i = bundle;
    }
}

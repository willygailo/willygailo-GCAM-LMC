package defpackage;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class atm {
    private static final Map a;

    static {
        HashMap map = new HashMap();
        a = map;
        atx atxVar = new atx();
        atxVar.q();
        map.put("dc:contributor", atxVar);
        map.put("dc:language", atxVar);
        map.put("dc:publisher", atxVar);
        map.put("dc:relation", atxVar);
        map.put("dc:subject", atxVar);
        map.put("dc:type", atxVar);
        atx atxVar2 = new atx();
        atxVar2.q();
        atxVar2.t();
        map.put("dc:creator", atxVar2);
        map.put("dc:date", atxVar2);
        atx atxVar3 = new atx();
        atxVar3.q();
        atxVar3.t();
        atxVar3.s();
        atxVar3.r();
        map.put("dc:description", atxVar3);
        map.put("dc:rights", atxVar3);
        map.put("dc:title", atxVar3);
    }

    static void a(ati atiVar, atw atwVar) {
        atl atlVarE;
        atl atlVarD;
        atl atlVar = atiVar.a;
        gk.f(atlVar, "http://purl.org/dc/elements/1.1/", true);
        Iterator itH = atiVar.a.h();
        while (itH.hasNext()) {
            atl atlVar2 = (atl) itH.next();
            if ("http://purl.org/dc/elements/1.1/".equals(atlVar2.a)) {
                for (int i = 1; i <= atlVar2.a(); i++) {
                    atl atlVarE2 = atlVar2.e(i);
                    atx atxVar = (atx) a.get(atlVarE2.a);
                    if (atxVar != null) {
                        if ((atlVarE2.g().a & 768) == 0) {
                            atl atlVar3 = new atl(atlVarE2.a, atxVar);
                            atlVarE2.a = "[]";
                            atlVar3.k(atlVarE2);
                            atlVar3.c = atlVar2;
                            atlVar2.j().set(i - 1, atlVar3);
                            if (atxVar.i() && !atlVarE2.g().c()) {
                                atlVarE2.m(new atl("xml:lang", "x-default", null));
                            }
                        } else {
                            atlVarE2.g().f(7680, false);
                            atlVarE2.g().b(atxVar);
                            if (atxVar.i()) {
                                c(atlVarE2);
                            }
                        }
                    }
                }
            } else if ("http://ns.adobe.com/exif/1.0/".equals(atlVar2.a)) {
                atl atlVarD2 = gk.d(atlVar2, "exif:GPSTimeStamp", false);
                if (atlVarD2 != null) {
                    try {
                        atc atcVarL = gi.l(atlVarD2.b);
                        if (atcVarL.a == 0 && atcVarL.b == 0 && atcVarL.c == 0) {
                            atl atlVarD3 = gk.d(atlVar2, "exif:DateTimeOriginal", false);
                            if (atlVarD3 == null) {
                                atlVarD3 = gk.d(atlVar2, "exif:DateTimeDigitized", false);
                            }
                            atc atcVarL2 = gi.l(atlVarD3.b);
                            Calendar calendarA = atcVarL.a();
                            calendarA.set(1, atcVarL2.a);
                            calendarA.set(2, atcVarL2.b);
                            calendarA.set(5, atcVarL2.c);
                            atlVarD2.b = gi.k(new atc(calendarA));
                        }
                    } catch (ass e) {
                    }
                }
                atl atlVarD4 = gk.d(atlVar2, "exif:UserComment", false);
                if (atlVarD4 != null) {
                    c(atlVarD4);
                }
            } else if ("http://ns.adobe.com/xmp/1.0/DynamicMedia/".equals(atlVar2.a)) {
                atl atlVarD5 = gk.d(atlVar2, "xmpDM:copyright", false);
                if (atlVarD5 != null) {
                    try {
                        atl atlVarF = gk.f(atiVar.a, "http://purl.org/dc/elements/1.1/", true);
                        String str = atlVarD5.b;
                        atl atlVarD6 = gk.d(atlVarF, "dc:rights", false);
                        if (atlVarD6 == null || !atlVarD6.s()) {
                            String strValueOf = String.valueOf(str);
                            atiVar.i(strValueOf.length() != 0 ? "\n\n".concat(strValueOf) : new String("\n\n"));
                        } else {
                            int iC = gk.c(atlVarD6, "x-default");
                            if (iC < 0) {
                                atiVar.i(atlVarD6.e(1).b);
                                iC = gk.c(atlVarD6, "x-default");
                            }
                            atl atlVarE3 = atlVarD6.e(iC);
                            String str2 = atlVarE3.b;
                            int iIndexOf = str2.indexOf("\n\n");
                            if (iIndexOf >= 0) {
                                int i2 = iIndexOf + 2;
                                if (!str2.substring(i2).equals(str)) {
                                    String strValueOf2 = String.valueOf(str2.substring(0, i2));
                                    String strValueOf3 = String.valueOf(str);
                                    atlVarE3.b = strValueOf3.length() != 0 ? strValueOf2.concat(strValueOf3) : new String(strValueOf2);
                                }
                            } else if (!str.equals(str2)) {
                                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2 + String.valueOf(str).length());
                                sb.append(str2);
                                sb.append("\n\n");
                                sb.append(str);
                                atlVarE3.b = sb.toString();
                            }
                        }
                        atlVarD5.c.o(atlVarD5);
                    } catch (ass e2) {
                    }
                }
            } else if ("http://ns.adobe.com/xap/1.0/rights/".equals(atlVar2.a) && (atlVarD = gk.d(atlVar2, "xmpRights:UsageTerms", false)) != null) {
                c(atlVarD);
            }
        }
        if (atlVar.g) {
            atlVar.g = false;
            boolean zH = atwVar.h(4);
            for (atl atlVar4 : Collections.unmodifiableList(new ArrayList(atlVar.j()))) {
                if (atlVar4.g) {
                    Iterator itH2 = atlVar4.h();
                    while (itH2.hasNext()) {
                        atl atlVar5 = (atl) itH2.next();
                        if (atlVar5.h) {
                            atlVar5.h = false;
                            atn atnVarE = asv.a.e(atlVar5.a);
                            if (atnVarE != null) {
                                atl atlVarG = gk.g(atlVar, atnVarE.a, null, true);
                                atlVarG.f = false;
                                String str3 = atnVarE.b;
                                String str4 = atnVarE.c;
                                atl atlVarD7 = gk.d(atlVarG, str4.length() != 0 ? str3.concat(str4) : new String(str3), false);
                                if (atlVarD7 == null) {
                                    if (atnVarE.d.d()) {
                                        String str5 = atnVarE.b;
                                        String str6 = atnVarE.c;
                                        atlVar5.a = str6.length() != 0 ? str5.concat(str6) : new String(str5);
                                        atlVarG.k(atlVar5);
                                        itH2.remove();
                                    } else {
                                        String str7 = atnVarE.b;
                                        String str8 = atnVarE.c;
                                        atl atlVar6 = new atl(str8.length() != 0 ? str7.concat(str8) : new String(str7), atnVarE.d.b());
                                        atlVarG.k(atlVar6);
                                        d(itH2, atlVar5, atlVar6);
                                    }
                                } else if (atnVarE.d.d()) {
                                    if (zH) {
                                        b(atlVar5, atlVarD7, true);
                                    }
                                    itH2.remove();
                                } else {
                                    if (atnVarE.d.c()) {
                                        int iC2 = gk.c(atlVarD7, "x-default");
                                        atlVarE = iC2 != -1 ? atlVarD7.e(iC2) : null;
                                    } else {
                                        atlVarE = atlVarD7.s() ? atlVarD7.e(1) : null;
                                    }
                                    if (atlVarE == null) {
                                        d(itH2, atlVar5, atlVarD7);
                                    } else {
                                        if (zH) {
                                            b(atlVar5, atlVarE, true);
                                        }
                                        itH2.remove();
                                    }
                                }
                            }
                        }
                    }
                    atlVar4.g = false;
                }
            }
        }
        String str9 = atlVar.a;
        if (str9 != null && str9.length() >= 36) {
            String lowerCase = atlVar.a.toLowerCase();
            if (lowerCase.startsWith("uuid:")) {
                lowerCase = lowerCase.substring(5);
            }
            if (atb.c(lowerCase)) {
                atl atlVarE4 = gk.e(atlVar, hn.d("http://ns.adobe.com/xap/1.0/mm/", "InstanceID"), true, null);
                if (atlVarE4 == null) {
                    throw new ass("Failure creating xmpMM:InstanceID", 9);
                }
                atlVarE4.e = null;
                String strValueOf4 = String.valueOf(lowerCase);
                atlVarE4.b = strValueOf4.length() != 0 ? "uuid:".concat(strValueOf4) : new String("uuid:");
                atlVarE4.p();
                atx atxVarG = atlVarE4.g();
                atxVarG.v(false);
                atxVarG.u(false);
                atxVarG.w(false);
                atlVarE4.d = null;
                atlVar.a = null;
            }
        }
        Iterator itH3 = atlVar.h();
        while (itH3.hasNext()) {
            if (!((atl) itH3.next()).s()) {
                itH3.remove();
            }
        }
    }

    private static void b(atl atlVar, atl atlVar2, boolean z) throws ass {
        if (!atlVar.b.equals(atlVar2.b) || atlVar.a() != atlVar2.a()) {
            throw new ass("Mismatch between alias and base nodes", 203);
        }
        if (!z && (!atlVar.a.equals(atlVar2.a) || !atlVar.g().equals(atlVar2.g()) || atlVar.b() != atlVar2.b())) {
            throw new ass("Mismatch between alias and base nodes", 203);
        }
        Iterator itH = atlVar.h();
        Iterator itH2 = atlVar2.h();
        while (itH.hasNext() && itH2.hasNext()) {
            b((atl) itH.next(), (atl) itH2.next(), false);
        }
        Iterator itI = atlVar.i();
        Iterator itI2 = atlVar2.i();
        while (itI.hasNext() && itI2.hasNext()) {
            b((atl) itI.next(), (atl) itI2.next(), false);
        }
    }

    private static void c(atl atlVar) throws ass {
        if (atlVar == null || !atlVar.g().d()) {
            return;
        }
        atx atxVarG = atlVar.g();
        atxVarG.t();
        atxVarG.s();
        atxVarG.r();
        Iterator itH = atlVar.h();
        while (itH.hasNext()) {
            atl atlVar2 = (atl) itH.next();
            if (atlVar2.g().l()) {
                itH.remove();
            } else if (!atlVar2.g().c()) {
                String str = atlVar2.b;
                if (str == null || str.length() == 0) {
                    itH.remove();
                } else {
                    atlVar2.m(new atl("xml:lang", "x-repair", null));
                }
            }
        }
    }

    private static void d(Iterator it, atl atlVar, atl atlVar2) throws ass {
        if (atlVar2.g().i()) {
            if (atlVar.g().c()) {
                throw new ass("Alias to x-default already has a language qualifier", 203);
            }
            atlVar.m(new atl("xml:lang", "x-default", null));
        }
        it.remove();
        atlVar.a = "[]";
        atlVar2.k(atlVar);
    }
}

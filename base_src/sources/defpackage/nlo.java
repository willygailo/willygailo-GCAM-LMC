package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class nlo extends naq implements nmg {
    private final nln a;

    public nlo(Context context, String str) {
        oom oomVarJ;
        TelephonyManager telephonyManager = (TelephonyManager) aas.b(context, TelephonyManager.class);
        if (telephonyManager == null) {
            oomVarJ = oom.m(str.toUpperCase());
        } else {
            ArrayList arrayList = new ArrayList(2);
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                arrayList.add(networkCountryIso.toUpperCase());
            }
            String simCountryIso = telephonyManager.getSimCountryIso();
            if (!TextUtils.isEmpty(simCountryIso) && !arrayList.contains(simCountryIso.toUpperCase())) {
                arrayList.add(simCountryIso.toUpperCase());
            }
            if (arrayList.isEmpty()) {
                arrayList.add(str.toUpperCase());
            }
            oomVarJ = oom.j(arrayList);
        }
        this.a = new nln(oomVarJ);
    }

    /* JADX WARN: Code duplicated, block: B:157:0x017c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0190 A[LOOP:3: B:35:0x00b1->B:80:0x0190, LOOP_END] */
    @Override // defpackage.nmg
    public final synchronized ojc a(String str, float f) {
        List<nlp> listF;
        orj orjVarG;
        Matcher matcher;
        opb opbVar;
        Iterator it;
        Iterator it2;
        ojc ojcVarI;
        char c = 1;
        int i = 0;
        obr.aF(str.length() > 0);
        obr.aF(f >= 0.0f && f <= 1.0f);
        if (str.length() == 0) {
            return oih.a;
        }
        nlh nlhVar = new nlh(nmh.b(str));
        ArrayList arrayList = new ArrayList();
        final nln nlnVar = this.a;
        if (TextUtils.isEmpty(nlhVar.a)) {
            listF = nln.f;
        } else {
            nlx nlxVar = nlnVar.i;
            String str2 = nlhVar.a;
            oth othVarA = oth.a();
            Matcher matcher2 = nly.b.matcher(str2);
            while (matcher2.find()) {
                if (!nly.c.matcher(matcher2.group()).matches()) {
                    c = 1;
                    i = 0;
                } else if (matcher2.start() <= 0 || !Character.isLetterOrDigit(str2.charAt(matcher2.start() - 1))) {
                    orj[] orjVarArr = new orj[2];
                    orjVarArr[i] = nly.a(matcher2, i);
                    orjVarArr[c] = nly.a(matcher2, 2);
                    Iterator it3 = Arrays.asList(orjVarArr).iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            matcher = matcher2;
                            opbVar = opb.a;
                            break;
                        }
                        orj orjVar = (orj) it3.next();
                        Iterator it4 = ((nly) nlxVar).d.iterator();
                        while (it4.hasNext()) {
                            String str3 = (String) it4.next();
                            String strSubstring = str2.substring(((Integer) orjVar.j()).intValue(), ((Integer) orjVar.k()).intValue());
                            if (str3 == null) {
                                str3 = "ZZ";
                                if (!strSubstring.startsWith("+")) {
                                    String strValueOf = String.valueOf(strSubstring);
                                    strSubstring = strValueOf.length() != 0 ? "+".concat(strValueOf) : new String("+");
                                }
                            }
                            try {
                                nhi nhiVarH = nly.a.h(strSubstring, str3);
                                nhd nhdVar = nly.a;
                                try {
                                    if (nhdVar.u(nhiVarH)) {
                                        matcher = matcher2;
                                        it = it3;
                                        it2 = it4;
                                    } else {
                                        nhi nhiVar = new nhi();
                                        nhiVar.d(nhiVarH);
                                        nhd nhdVar2 = nhdVar;
                                        long j = nhiVarH.b;
                                        while (true) {
                                            j /= 10;
                                            nhiVar.i(j);
                                            matcher = matcher2;
                                            nhd nhdVar3 = nhdVar2;
                                            it = it3;
                                            try {
                                                String strK = nhdVar3.k(nhiVar);
                                                it2 = it4;
                                                int i2 = nhiVar.a;
                                                if (!nhdVar3.s(i2) || nhdVar3.A(strK, nhdVar3.f(i2, nhdVar3.l(i2)), 12) != 4) {
                                                    if (j != 0) {
                                                        if (nhdVar3.u(nhiVar)) {
                                                            nhiVarH.i(j);
                                                        } else {
                                                            it3 = it;
                                                            it4 = it2;
                                                            nhdVar2 = nhdVar3;
                                                            matcher2 = matcher;
                                                        }
                                                    }
                                                }
                                                ojcVarI = oih.a;
                                            } catch (ngy e) {
                                                it2 = it4;
                                                ojcVarI = oih.a;
                                                if (ojcVarI.g()) {
                                                    opbVar = new opb(oom.m(orjVar), oom.m((nhi) ojcVarI.c()));
                                                    othVarA.d(opbVar);
                                                    matcher2 = matcher;
                                                    c = 1;
                                                    i = 0;
                                                } else {
                                                    it3 = it;
                                                    matcher2 = matcher;
                                                    it4 = it2;
                                                }
                                            }
                                            if (ojcVarI.g()) {
                                                opbVar = new opb(oom.m(orjVar), oom.m((nhi) ojcVarI.c()));
                                                break;
                                            }
                                            it3 = it;
                                            matcher2 = matcher;
                                            it4 = it2;
                                        }
                                    }
                                    ojcVarI = ojc.i(nhiVarH);
                                } catch (ngy e2) {
                                    ojcVarI = oih.a;
                                }
                            } catch (ngy e3) {
                                matcher = matcher2;
                                it = it3;
                            }
                            if (ojcVarI.g()) {
                                opbVar = new opb(oom.m(orjVar), oom.m((nhi) ojcVarI.c()));
                                break;
                            }
                            it3 = it;
                            matcher2 = matcher;
                            it4 = it2;
                        }
                    }
                    othVarA.d(opbVar);
                    matcher2 = matcher;
                    c = 1;
                    i = 0;
                }
            }
            opb opbVar2 = opb.a;
            ArrayList arrayListAg = obr.ag();
            for (Map.Entry entry : othVarA.b().entrySet()) {
                int iIntValue = ((Integer) ((orj) entry.getKey()).j()).intValue();
                int iIntValue2 = ((Integer) ((orj) entry.getKey()).k()).intValue();
                int i3 = iIntValue2 - iIntValue;
                nhi nhiVar2 = (nhi) entry.getValue();
                String strB = nly.a.B(nhiVar2, 1);
                strB.getClass();
                if (strB.length() < i3) {
                    StringBuilder sb = new StringBuilder(i3);
                    sb.append(strB);
                    for (int length = strB.length(); length < i3; length++) {
                        sb.append(' ');
                    }
                    strB = sb.toString();
                }
                ojc ojcVarA = ond.c(((nly) nlxVar).d).d(new nfp(new StringBuilder(str2).replace(iIntValue, iIntValue2, strB).substring(iIntValue), 6)).a(mcz.g);
                if (ojcVarA.g()) {
                    ngz ngzVar = (ngz) ojcVarA.c();
                    orjVarG = orj.g(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue + ngzVar.a()));
                    nhiVar2 = ngzVar.b;
                } else {
                    orjVarG = (orj) entry.getKey();
                }
                ohh.B(orjVarG, nhiVar2, arrayListAg);
            }
            opb opbVarA = ohh.A(arrayListAg);
            String str4 = nlhVar.a;
            oth othVarA2 = oth.a();
            othVarA2.d(nln.a(str4, nln.a, nln.c, "0"));
            othVarA2.d(nln.a(str4, nln.b, nln.d, "9"));
            Iterator it5 = opbVarA.b().keySet().iterator();
            while (it5.hasNext()) {
                othVarA2.e((orj) it5.next());
            }
            StringBuilder sb2 = new StringBuilder(str4);
            for (Map.Entry entry2 : othVarA2.b().entrySet()) {
                sb2.replace(((Integer) ((orj) entry2.getKey()).j()).intValue(), ((Integer) ((orj) entry2.getKey()).k()).intValue(), (String) entry2.getValue());
            }
            String string = sb2.toString();
            oth othVarA3 = oth.a();
            Iterator it6 = nlnVar.h.iterator();
            while (it6.hasNext()) {
                for (ngz ngzVar2 : nlnVar.g.i(string, (String) it6.next())) {
                    int i4 = ngzVar2.a;
                    if (!nln.e.matcher(string.subSequence(i4 < 5 ? 0 : i4 - 5, i4)).find()) {
                        orj orjVarG2 = orj.g(Integer.valueOf(ngzVar2.a), Integer.valueOf(ngzVar2.a()));
                        if ((orjVarG2.equals(orj.a) ? othVarA3 : new otg(othVarA3, orjVarG2)).b().isEmpty()) {
                            othVarA3.c(orjVarG2, ngzVar2.b);
                        }
                    }
                }
            }
            ooh oohVarE = oom.e();
            oohVarE.h(nlnVar.b(nlhVar, opbVarA, new nlm() { // from class: nlk
                @Override // defpackage.nlm
                public final String a(nlh nlhVar2, orj orjVar2, nhi nhiVar3) {
                    Pattern pattern = nln.a;
                    return nlhVar2.a.substring(((Integer) orjVar2.j()).intValue(), ((Integer) orjVar2.k()).intValue());
                }
            }));
            oohVarE.h(nlnVar.b(nlhVar, othVarA3, new nlm() { // from class: nlj
                @Override // defpackage.nlm
                public final String a(nlh nlhVar2, orj orjVar2, final nhi nhiVar3) {
                    final nln nlnVar2 = nlnVar;
                    boolean zW = ohh.w(ond.c(nlnVar2.h).e(), new ojf() { // from class: nll
                        @Override // defpackage.ojf
                        public final boolean a(Object obj) {
                            int iA;
                            nln nlnVar3 = nlnVar2;
                            nhi nhiVar4 = nhiVar3;
                            String str5 = (String) obj;
                            nhd nhdVar4 = nlnVar3.g;
                            if (nhdVar4.v(str5)) {
                                iA = nhdVar4.a(str5);
                            } else {
                                Logger logger = nhd.a;
                                Level level = Level.WARNING;
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Invalid or missing region code (");
                                if (str5 == null) {
                                    str5 = "null";
                                }
                                sb3.append(str5);
                                sb3.append(") provided.");
                                logger.log(level, sb3.toString());
                                iA = 0;
                            }
                            return iA != 0 && nhiVar4.a == iA;
                        }
                    });
                    nhi nhiVar4 = new nhi();
                    nhiVar4.d(nhiVar3);
                    nhiVar4.c();
                    return nlnVar2.g.B(nhiVar4, true != zW ? 2 : 3);
                }
            }));
            listF = oohVarE.f();
        }
        for (nlp nlpVar : listF) {
            nmc nmcVarA = nme.a(nlpVar.a, nlf.PHONE);
            nmcVarA.e();
            naq.j(arrayList, nmcVarA, nlpVar.b);
        }
        return ond.c(arrayList).a(new nlv(str.length(), f, 1));
    }
}

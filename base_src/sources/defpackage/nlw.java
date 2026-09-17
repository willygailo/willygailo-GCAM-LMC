package defpackage;

import android.net.Uri;
import android.util.Pair;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class nlw extends naq implements nmg {
    public final nls a = new nls();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:78:0x0281  */
    @Override // defpackage.nmg
    public final ojc a(String str, float f) {
        String strConcat;
        ojc ojcVarI;
        String strGroup;
        String strGroup2;
        if (str == null || str.length() == 0) {
            return oih.a;
        }
        int i = 0;
        obr.aF(f >= 0.0f && f <= 1.0f);
        try {
            nlh nlhVar = new nlh(nmh.b(str));
            ArrayList arrayList = new ArrayList();
            nls nlsVar = this.a;
            ArrayList<nlp> arrayList2 = new ArrayList();
            String strReplaceAll = nlsVar.h.matcher(nlsVar.g.matcher(nlhVar.a).replaceAll("$1$4.$5")).replaceAll("$1$2.$3");
            Matcher matcher = nlsVar.i.matcher(strReplaceAll);
            StringBuffer stringBuffer = new StringBuffer(strReplaceAll.length());
            while (matcher.find()) {
                String strGroup3 = matcher.group(1);
                String strGroup4 = matcher.group(2);
                String strGroup5 = matcher.group(3);
                String strC = oje.c(matcher.group(4));
                StringBuilder sb = new StringBuilder(String.valueOf(strGroup3).length() + 1 + String.valueOf(strGroup4).length() + String.valueOf(strGroup5).length() + strC.length());
                sb.append(strGroup3);
                sb.append(strGroup4);
                sb.append(".");
                sb.append(strGroup5);
                sb.append(strC);
                matcher.appendReplacement(stringBuffer, sb.toString());
            }
            matcher.appendTail(stringBuffer);
            String string = stringBuffer.toString();
            Matcher matcher2 = nlsVar.l.matcher(string);
            StringBuffer stringBuffer2 = new StringBuffer(string.length());
            while (matcher2.find() && (strGroup2 = matcher2.group(0)) != null) {
                matcher2.appendReplacement(stringBuffer2, strGroup2.replaceAll("\\s+", ""));
            }
            matcher2.appendTail(stringBuffer2);
            String strReplaceAll2 = nlsVar.j.matcher(stringBuffer2.toString()).replaceAll("www.$2");
            Matcher matcher3 = nlsVar.k.matcher(strReplaceAll2);
            StringBuffer stringBuffer3 = new StringBuffer(strReplaceAll2.length());
            while (matcher3.find() && (strGroup = matcher3.group(0)) != null) {
                matcher3.appendReplacement(stringBuffer3, strGroup.replaceAll("\\s+", ""));
            }
            matcher3.appendTail(stringBuffer3);
            String string2 = stringBuffer3.toString();
            for (Pair pair : nlsVar.n) {
                Matcher matcher4 = ((Pattern) pair.first).matcher(string2);
                String strValueOf = String.valueOf((String) pair.second);
                string2 = matcher4.replaceAll(strValueOf.length() != 0 ? "\\.".concat(strValueOf) : new String("\\."));
            }
            Matcher matcher5 = nlsVar.m.matcher(string2);
            if (matcher5.find()) {
                string2 = matcher5.replaceAll(String.valueOf(matcher5.group(1).substring(1)).concat("$2"));
            }
            Matcher matcher6 = nlsVar.f.matcher(string2);
            while (matcher6.find()) {
                if (matcher6.start() <= 0 || string2.charAt(matcher6.start() - 1) != '@') {
                    Uri uriA = nmi.a(string2.substring(matcher6.start(), matcher6.end()));
                    if (uriA.equals(Uri.EMPTY)) {
                        i = 0;
                    } else {
                        int iMax = Math.max(Math.min(matcher6.start(), nlhVar.a.length()), i);
                        int iMax2 = Math.max(Math.min(matcher6.end(), nlhVar.a.length()), iMax);
                        nli nliVarA = nlp.a();
                        nmf nmfVarA = nmf.a(uriA.toString());
                        final String strA = nlu.a("%s@", uriA.getUserInfo());
                        int port = uriA.getPort();
                        final String strA2 = nlu.a(":%s", port == -1 ? "" : String.valueOf(port));
                        String lowerCase = oje.c(uriA.getHost()).toLowerCase();
                        ojc ojcVarB = (lowerCase.isEmpty() ? oih.a : ojc.i(lowerCase.substring(true != lowerCase.startsWith("www.") ? 0 : 4, lowerCase.length() - (lowerCase.endsWith("/") ? 1 : 0)))).b(new oiu() { // from class: nlt
                            @Override // defpackage.oiu
                            public final Object a(Object obj) {
                                String str2 = strA;
                                String str3 = strA2;
                                String str4 = (String) obj;
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + String.valueOf(str4).length() + String.valueOf(str3).length());
                                sb2.append(str2);
                                sb2.append(str4);
                                sb2.append(str3);
                                return sb2.toString();
                            }
                        });
                        if (ojcVarB.g()) {
                            String strC2 = oje.c(uriA.getScheme());
                            switch (strC2.toLowerCase()) {
                                case "http":
                                case "https":
                                case "":
                                    strConcat = "";
                                    break;
                                default:
                                    strConcat = strC2.concat("://");
                                    break;
                            }
                            String strValueOf2 = String.valueOf(strConcat);
                            String str2 = (String) ojcVarB.c();
                            String strConcat2 = str2.length() != 0 ? strValueOf2.concat(str2) : new String(strValueOf2);
                            String strValueOf3 = String.valueOf(strConcat2);
                            String strValueOf4 = String.valueOf(nlu.b(uriA));
                            String strConcat3 = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
                            if (nlu.c(strConcat3)) {
                                String str3 = (!nlu.b(uriA).isEmpty() || nlu.c(strConcat2)) ? "…" : "";
                                int length = 25 - str3.length();
                                if (length > strConcat2.length()) {
                                    length = strConcat2.length();
                                }
                                String strValueOf5 = String.valueOf(strConcat2.substring(length < 0 ? length : 0, length));
                                ojcVarI = ojc.i(str3.length() != 0 ? strValueOf5.concat(str3) : new String(strValueOf5));
                            } else {
                                ojcVarI = ojc.i(strConcat3);
                            }
                        } else {
                            ojcVarI = oih.a;
                        }
                        nliVarA.a = nmfVarA.c((String) ojcVarI.f());
                        nliVarA.b(nlhVar.a(iMax, iMax2));
                        arrayList2.add(nliVarA.a());
                        matcher6 = matcher6;
                        i = 0;
                    }
                }
            }
            for (nlp nlpVar : arrayList2) {
                nmc nmcVarA = nme.a(nlpVar.a, nlf.URL);
                nmcVarA.e();
                naq.j(arrayList, nmcVarA, nlpVar.b);
            }
            return ond.c(arrayList).a(new nlv(str.length(), f, 0));
        } catch (NullPointerException e) {
            return oih.a;
        }
    }
}

package defpackage;

import com.google.android.apps.camera.bottombar.R;
import java.util.GregorianCalendar;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ati implements ast {
    public final atl a;

    public ati() {
        this.a = new atl(null, null, null);
    }

    public ati(atl atlVar) {
        this.a = atlVar;
    }

    static final void m(atl atlVar, Object obj, atx atxVar) throws ass {
        String str;
        atlVar.g().b(atxVar);
        if (atlVar.g().l()) {
            if (obj != null && obj.toString().length() > 0) {
                throw new ass("Composite nodes can't have values", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
            }
            atlVar.p();
            return;
        }
        if (obj == null) {
            str = null;
        } else if (obj instanceof Boolean) {
            str = true != ((Boolean) obj).booleanValue() ? "False" : "True";
        } else if (obj instanceof Integer) {
            str = String.valueOf(((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            str = String.valueOf(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            str = String.valueOf(((Double) obj).doubleValue());
        } else if (obj instanceof atc) {
            str = gi.k((atc) obj);
        } else if (obj instanceof GregorianCalendar) {
            str = gi.k(asr.a((GregorianCalendar) obj));
        } else {
            str = obj instanceof byte[] ? new String(asw.a((byte[]) obj)) : obj.toString();
        }
        String strB = str != null ? atb.b(str) : null;
        if (atlVar.g().m() && "xml:lang".equals(atlVar.a)) {
            atlVar.b = atb.a(strB);
        } else {
            atlVar.b = strB;
        }
    }

    private static final Object n(int i, atl atlVar) throws ass {
        String str = atlVar.b;
        switch (i) {
            case 1:
                if (str == null || str.length() == 0) {
                    throw new ass("Empty convert-string", 5);
                }
                String lowerCase = str.toLowerCase();
                boolean z = false;
                try {
                    if (Integer.parseInt(lowerCase) != 0) {
                        z = true;
                    }
                } catch (NumberFormatException e) {
                    if ("true".equals(lowerCase) || "t".equals(lowerCase) || "on".equals(lowerCase) || "yes".equals(lowerCase)) {
                        z = true;
                    }
                }
                return new Boolean(z);
            case 2:
                if (str != null) {
                    try {
                        if (str.length() != 0) {
                            return new Integer(str.startsWith("0x") ? Integer.parseInt(str.substring(2), 16) : Integer.parseInt(str));
                        }
                    } catch (NumberFormatException e2) {
                        throw new ass("Invalid integer string", 5);
                    }
                }
                throw new ass("Empty convert-string", 5);
            case 3:
                if (str != null) {
                    try {
                        if (str.length() != 0) {
                            return new Long(str.startsWith("0x") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str));
                        }
                    } catch (NumberFormatException e3) {
                        throw new ass("Invalid long string", 5);
                    }
                }
                throw new ass("Empty convert-string", 5);
            case 4:
                if (str != null) {
                    try {
                        if (str.length() != 0) {
                            return new Double(Double.parseDouble(str));
                        }
                    } catch (NumberFormatException e4) {
                        throw new ass("Invalid double string", 5);
                    }
                }
                throw new ass("Empty convert-string", 5);
            case 5:
                return gi.l(str);
            case 6:
                return gi.l(str).a();
            default:
                return (str != null || atlVar.g().l()) ? str : "";
        }
    }

    @Override // defpackage.ast
    public final atz a(String str, String str2) {
        gj.f(str);
        gj.e(str2);
        atl atlVarE = gk.e(this.a, hn.d(str, str2), false, null);
        if (atlVarE != null) {
            return new ath(n(0, atlVarE));
        }
        return null;
    }

    @Override // defpackage.ast
    public final Integer b(String str, String str2) {
        return (Integer) l(str, str2, 2);
    }

    @Override // defpackage.ast
    public final void c(String str, String str2, Object obj) throws ass {
        d(str, str2, obj, null);
    }

    public final Object clone() {
        return new ati((atl) this.a.clone());
    }

    @Override // defpackage.ast
    public final void d(String str, String str2, Object obj, atx atxVar) throws ass {
        gj.f(str);
        gj.e(str2);
        atx atxVarH = gk.h(atxVar, obj);
        atl atlVarE = gk.e(this.a, hn.d(str, str2), true, atxVarH);
        if (atlVarE == null) {
            throw new ass("Specified property does not exist", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
        }
        m(atlVarE, obj, atxVarH);
    }

    @Override // defpackage.ast
    public final boolean e(String str, String str2) {
        try {
            gj.f(str);
            gj.e(str2);
            return gk.e(this.a, hn.d(str, str2), false, null) != null;
        } catch (ass e) {
            return false;
        }
    }

    @Override // defpackage.ast
    public final atg f() {
        return new atg(this);
    }

    @Override // defpackage.ast
    public final void g(String str, atx atxVar, String str2, atx atxVar2) throws ass {
        gj.f("http://ns.google.com/photos/1.0/camera/");
        gj.c(str);
        if ((atxVar.a & (-7681)) != 0) {
            throw new ass("Only array form flags allowed for arrayOptions", R.styleable.AppCompatTheme_textAppearanceListItem);
        }
        atx atxVarH = gk.h(atxVar, null);
        atr atrVarD = hn.d("http://ns.google.com/photos/1.0/camera/", str);
        atl atlVarE = gk.e(this.a, atrVarD, false, null);
        if (atlVarE != null) {
            if (!atlVarE.g().d()) {
                throw new ass("The named property is not an array", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
            }
        } else {
            if (!atxVarH.d()) {
                throw new ass("Explicit arrayOptions required to create new array", R.styleable.AppCompatTheme_textAppearanceListItem);
            }
            atlVarE = gk.e(this.a, atrVarD, true, atxVarH);
            if (atlVarE == null) {
                throw new ass("Failure creating array node", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
            }
        }
        atl atlVar = new atl("[]", null);
        atx atxVarH2 = gk.h(atxVar2, str2);
        int iA = atlVarE.a() + 1;
        if (iA <= 0) {
            throw new ass("Array index out of bounds", R.styleable.AppCompatTheme_textAppearanceListItemSecondary);
        }
        atlVarE.l(iA, atlVar);
        m(atlVar, str2, atxVarH2);
    }

    @Override // defpackage.ast
    public final void h() {
        try {
            gj.f("http://ns.adobe.com/xmp/note/");
            gj.e("HasExtendedXMP");
            atl atlVarE = gk.e(this.a, hn.d("http://ns.adobe.com/xmp/note/", "HasExtendedXMP"), false, null);
            if (atlVarE != null) {
                gk.j(atlVarE);
            }
        } catch (ass e) {
        }
    }

    @Override // defpackage.ast
    public final void i(String str) throws ass {
        atl atlVar;
        boolean z;
        Object[] objArr;
        gj.f("http://purl.org/dc/elements/1.1/");
        gj.c("rights");
        String strA = atb.a("");
        String strA2 = atb.a("x-default");
        atl atlVarE = gk.e(this.a, hn.d("http://purl.org/dc/elements/1.1/", "rights"), true, new atx(7680));
        if (atlVarE == null) {
            throw new ass("Failed to find or create array node", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
        }
        if (!atlVarE.g().i()) {
            if (atlVarE.s() || !atlVarE.g().j()) {
                throw new ass("Specified property is no alt-text array", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
            }
            atlVarE.g().r();
        }
        Iterator itH = atlVarE.h();
        while (true) {
            if (!itH.hasNext()) {
                atlVar = null;
                z = false;
                break;
            }
            atlVar = (atl) itH.next();
            if (!atlVar.t() || !"xml:lang".equals(atlVar.f(1).a)) {
                throw new ass("Language qualifier must be first", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
            }
            if ("x-default".equals(atlVar.f(1).b)) {
                z = true;
                break;
            }
        }
        if (atlVar != null && atlVarE.a() > 1) {
            atlVarE.o(atlVar);
            atlVarE.l(1, atlVar);
        }
        if (!atlVarE.g().i()) {
            throw new ass("Localized text array is not alt-text", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
        }
        if (atlVarE.s()) {
            Iterator itH2 = atlVarE.h();
            atl atlVar2 = null;
            atl atlVar3 = null;
            int i = 0;
            while (true) {
                if (!itH2.hasNext()) {
                    if (i != 1) {
                        if (i <= 1) {
                            if (atlVar3 != null) {
                                objArr = new Object[]{new Integer(4), atlVar3};
                                break;
                            } else {
                                objArr = new Object[]{new Integer(5), atlVarE.e(1)};
                                break;
                            }
                        }
                        objArr = new Object[]{new Integer(3), atlVar2};
                        break;
                    }
                    objArr = new Object[]{new Integer(2), atlVar2};
                    break;
                }
                atl atlVar4 = (atl) itH2.next();
                if (atlVar4.g().l()) {
                    throw new ass("Alt-text array item is not simple", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
                }
                if (!atlVar4.t() || !"xml:lang".equals(atlVar4.f(1).a)) {
                    throw new ass("Alt-text array item has no language qualifier", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
                }
                String str2 = atlVar4.f(1).b;
                if (strA2.equals(str2)) {
                    objArr = new Object[]{new Integer(1), atlVar4};
                    break;
                } else if (strA != null && str2.startsWith(strA)) {
                    if (atlVar2 == null) {
                        atlVar2 = atlVar4;
                    }
                    i++;
                } else if ("x-default".equals(str2)) {
                    atlVar3 = atlVar4;
                }
            }
        } else {
            objArr = new Object[]{new Integer(0), null};
        }
        int iIntValue = ((Integer) objArr[0]).intValue();
        atl atlVar5 = (atl) objArr[1];
        boolean zEquals = "x-default".equals(strA2);
        switch (iIntValue) {
            case 0:
                gk.i(atlVarE, "x-default", str);
                if (zEquals) {
                    return;
                }
                gk.i(atlVarE, strA2, str);
                return;
            case 1:
                if (!zEquals) {
                    if (z && atlVar != atlVar5 && atlVar != null && atlVar.b.equals(atlVar5.b)) {
                        atlVar.b = str;
                    }
                    atlVar5.b = str;
                } else {
                    Iterator itH3 = atlVarE.h();
                    while (itH3.hasNext()) {
                        atl atlVar6 = (atl) itH3.next();
                        if (atlVar6 != atlVar) {
                            if (atlVar6.b.equals(atlVar != null ? atlVar.b : null)) {
                                atlVar6.b = str;
                            }
                        }
                    }
                    if (atlVar != null) {
                        atlVar.b = str;
                    }
                }
                break;
            case 2:
                if (z && atlVar != atlVar5 && atlVar != null && atlVar.b.equals(atlVar5.b)) {
                    atlVar.b = str;
                }
                atlVar5.b = str;
                break;
            case 3:
                gk.i(atlVarE, strA2, str);
                if (zEquals) {
                    return;
                }
                break;
            case 4:
                if (atlVar != null && atlVarE.a() == 1) {
                    atlVar.b = str;
                }
                gk.i(atlVarE, strA2, str);
                break;
            case 5:
                gk.i(atlVarE, strA2, str);
                if (zEquals) {
                    return;
                }
                break;
            default:
                throw new ass("Unexpected result from ChooseLocalizedText", 9);
        }
        if (z || atlVarE.a() != 1) {
            return;
        }
        gk.i(atlVarE, "x-default", str);
    }

    @Override // defpackage.ast
    public final void j(String str, boolean z) throws ass {
        d("http://ns.google.com/photos/1.0/panorama/", str, true != z ? "False" : "True", null);
    }

    @Override // defpackage.ast
    public final void k(String str, int i) throws ass {
        d("http://ns.google.com/photos/1.0/panorama/", str, new Integer(i), null);
    }

    public final Object l(String str, String str2, int i) throws ass {
        gj.f(str);
        gj.e(str2);
        atl atlVarE = gk.e(this.a, hn.d(str, str2), false, null);
        if (atlVarE == null) {
            return null;
        }
        if (i == 0 || !atlVarE.g().l()) {
            return n(i, atlVarE);
        }
        throw new ass("Property must be simple when a value type is requested", R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
    }
}

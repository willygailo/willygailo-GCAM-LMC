package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class qoy extends qnp implements qmy {
    final /* synthetic */ List a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qoy(List list) {
        super(2);
        this.a = list;
    }

    @Override // defpackage.qmy
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        qkl qklVarK;
        Object next;
        String str;
        Object next2;
        String str2;
        int length;
        CharSequence charSequence = (CharSequence) obj;
        int iIntValue = ((Number) obj2).intValue();
        charSequence.getClass();
        List list = this.a;
        if (list.size() == 1) {
            switch (list.size()) {
                case 0:
                    throw new NoSuchElementException("List is empty.");
                case 1:
                    String str3 = (String) list.get(0);
                    int iN = qno.n(charSequence, str3, iIntValue);
                    qklVarK = iN >= 0 ? qmd.K(Integer.valueOf(iN), str3) : null;
                    break;
                default:
                    throw new IllegalArgumentException("List has more than one element.");
            }
        } else {
            qoa qoaVar = new qoa(qno.f(iIntValue, 0), charSequence.length());
            if (charSequence instanceof String) {
                int i = qoaVar.a;
                int i2 = qoaVar.b;
                if (i > i2) {
                    qklVarK = null;
                    break;
                }
                while (true) {
                    Iterator it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        str2 = (String) next2;
                        length = str2.length();
                        str2.getClass();
                    } while (!str2.regionMatches(0, (String) charSequence, i, length));
                    String str4 = (String) next2;
                    if (str4 != null) {
                        qklVarK = qmd.K(Integer.valueOf(i), str4);
                        break;
                    }
                    if (i == i2) {
                        qklVarK = null;
                        break;
                    }
                    i++;
                }
            } else {
                int i3 = qoaVar.a;
                int i4 = qoaVar.b;
                if (i3 <= i4) {
                    while (true) {
                        Iterator it2 = list.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                            str = (String) next;
                        } while (!qno.r(str, charSequence, i3, str.length()));
                        String str5 = (String) next;
                        if (str5 != null) {
                            qklVarK = qmd.K(Integer.valueOf(i3), str5);
                            break;
                        }
                        if (i3 == i4) {
                            qklVarK = null;
                            break;
                        }
                        i3++;
                    }
                } else {
                    qklVarK = null;
                }
            }
        }
        if (qklVarK != null) {
            return qmd.K(qklVarK.a, Integer.valueOf(((String) qklVarK.b).length()));
        }
        return null;
    }
}

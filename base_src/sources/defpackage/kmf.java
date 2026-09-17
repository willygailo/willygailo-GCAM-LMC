package defpackage;

import android.accounts.Account;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class kmf {
    public final Account a;
    public final Set b;
    public final Set c;
    public final Map d;
    public final String e;
    public final String f;
    public final kuj g;
    public Integer h;

    public kmf(Account account, Set set, String str, String str2, kuj kujVar) {
        this.a = account;
        Set setEmptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.b = setEmptySet;
        Map mapEmptyMap = Collections.emptyMap();
        this.d = mapEmptyMap;
        this.e = str;
        this.f = str2;
        this.g = kujVar;
        HashSet hashSet = new HashSet(setEmptySet);
        Iterator it = mapEmptyMap.values().iterator();
        while (it.hasNext()) {
            Set set2 = ((kme) it.next()).a;
            hashSet.addAll(null);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }
}

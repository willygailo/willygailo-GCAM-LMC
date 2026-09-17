package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class kfr {
    public Set a;
    public String b;
    private boolean c;
    private boolean d;
    private boolean e;
    private String f;
    private Account g;
    private String h;
    private Map i;

    public kfr() {
        this.a = new HashSet();
        this.i = new HashMap();
    }

    public kfr(GoogleSignInOptions googleSignInOptions) {
        this.a = new HashSet();
        this.i = new HashMap();
        mip.dk(googleSignInOptions);
        Scope scope = GoogleSignInOptions.a;
        this.a = new HashSet(googleSignInOptions.i);
        this.c = googleSignInOptions.l;
        this.d = googleSignInOptions.m;
        this.e = googleSignInOptions.k;
        this.f = googleSignInOptions.n;
        this.g = googleSignInOptions.j;
        this.h = googleSignInOptions.o;
        this.i = GoogleSignInOptions.c(googleSignInOptions.p);
        this.b = googleSignInOptions.q;
    }

    public final GoogleSignInOptions a() {
        if (this.a.contains(GoogleSignInOptions.e) && this.a.contains(GoogleSignInOptions.d)) {
            this.a.remove(GoogleSignInOptions.d);
        }
        if (this.e && (this.g == null || !this.a.isEmpty())) {
            b();
        }
        return new GoogleSignInOptions(3, new ArrayList(this.a), this.g, this.e, this.c, this.d, this.f, this.h, this.i, this.b);
    }

    public final void b() {
        this.a.add(GoogleSignInOptions.c);
    }

    public final void c(Scope scope, Scope... scopeArr) {
        this.a.add(scope);
        this.a.addAll(Arrays.asList(scopeArr));
    }
}

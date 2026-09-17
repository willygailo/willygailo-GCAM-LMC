package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class nir {
    private final String b;
    public String a = "files";
    private String c = "common";
    private final Account d = nis.b;
    private String e = "";
    private final ooh f = oom.e();

    public nir(Context context) {
        myw.b(true, "Context cannot be null", new Object[0]);
        this.b = context.getPackageName();
    }

    public final Uri a() {
        String str = this.a;
        String str2 = this.c;
        String strB = nip.b(this.d);
        String str3 = this.e;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 4 + length2 + String.valueOf(strB).length() + String.valueOf(str3).length());
        sb.append("/");
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        sb.append("/");
        sb.append(strB);
        sb.append("/");
        sb.append(str3);
        String string = sb.toString();
        return new Uri.Builder().scheme("android").authority(this.b).path(string).encodedFragment(nje.b(this.f.f())).build();
    }

    public final void b() {
        myw.b(nis.a.matcher("phenotype").matches(), "Module must match [a-z]+(_[a-z]+)*: %s", "phenotype");
        myw.b(!nis.c.contains("phenotype"), "Module name is reserved and cannot be used: %s", "phenotype");
        this.c = "phenotype";
    }

    public final void c(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = nis.a;
        this.e = str;
    }
}

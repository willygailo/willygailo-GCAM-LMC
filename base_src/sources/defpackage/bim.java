package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bim implements azv {
    private final Context a;

    public bim(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.azv
    public final /* bridge */ /* synthetic */ bcl a(Object obj, int i, int i2, azt aztVar) {
        return c((Uri) obj);
    }

    @Override // defpackage.azv
    public final /* bridge */ /* synthetic */ boolean b(Object obj, azt aztVar) {
        return ((Uri) obj).getScheme().equals("android.resource");
    }

    public final bcl c(Uri uri) {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        if (authority.equals(this.a.getPackageName())) {
            contextCreatePackageContext = this.a;
        } else {
            try {
                contextCreatePackageContext = this.a.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                if (!authority.contains(this.a.getPackageName())) {
                    String strValueOf = String.valueOf(uri);
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 57);
                    sb.append("Failed to obtain context or unrecognized Uri format for: ");
                    sb.append(strValueOf);
                    throw new IllegalArgumentException(sb.toString(), e);
                }
                contextCreatePackageContext = this.a;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier == 0) {
                String strValueOf2 = String.valueOf(uri);
                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 32);
                sb2.append("Failed to find resource id for: ");
                sb2.append(strValueOf2);
                throw new IllegalArgumentException(sb2.toString());
            }
        } else {
            if (pathSegments.size() != 1) {
                String strValueOf3 = String.valueOf(uri);
                StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf3).length() + 25);
                sb3.append("Unrecognized Uri format: ");
                sb3.append(strValueOf3);
                throw new IllegalArgumentException(sb3.toString());
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                String strValueOf4 = String.valueOf(uri);
                StringBuilder sb4 = new StringBuilder(String.valueOf(strValueOf4).length() + 25);
                sb4.append("Unrecognized Uri format: ");
                sb4.append(strValueOf4);
                throw new IllegalArgumentException(sb4.toString(), e2);
            }
        }
        return bil.g(bij.a(this.a, contextCreatePackageContext, identifier, null));
    }
}

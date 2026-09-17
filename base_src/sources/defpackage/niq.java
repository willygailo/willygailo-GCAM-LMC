package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class niq extends njj {
    private final Context a;
    private String d;
    private final Object c = new Object();
    private final nji b = new nit(null);

    public niq(odu oduVar, byte[] bArr) {
        this.a = oduVar.a;
    }

    private final boolean h(Uri uri) {
        return (TextUtils.isEmpty(uri.getAuthority()) || this.a.getPackageName().equals(uri.getAuthority())) ? false : true;
    }

    private static final void i() throws niw {
        throw new niw("Android backend cannot perform remote operations without a remote backend");
    }

    @Override // defpackage.njj
    protected final Uri a(Uri uri) throws nix {
        if (h(uri)) {
            throw new nix("Operation across authorities is not allowed.");
        }
        File fileC = c(uri);
        Uri.Builder builderPath = new Uri.Builder().scheme("file").authority("").path("/");
        ooh oohVarE = oom.e();
        builderPath.path(fileC.getAbsolutePath());
        return builderPath.encodedFragment(nje.b(oohVarE.f())).build();
    }

    @Override // defpackage.njj
    protected final nji b() {
        return this.b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
    @Override // defpackage.njj, defpackage.nji
    public final File c(Uri uri) throws IOException {
        File filesDir;
        String str;
        if (h(uri)) {
            throw new IOException("operation is not permitted in other authorities.");
        }
        Context context = this.a;
        if (!uri.getScheme().equals("android")) {
            throw new nix("Scheme must be 'android'");
        }
        if (uri.getPathSegments().isEmpty()) {
            throw new nix(String.format("Path must start with a valid logical location: %s", uri));
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new nix("Did not expect uri to have query");
        }
        ArrayList arrayList = new ArrayList(uri.getPathSegments());
        switch ((String) arrayList.get(0)) {
            case "directboot-files":
                filesDir = context.createDeviceProtectedStorageContext().getFilesDir();
                break;
            case "directboot-cache":
                filesDir = context.createDeviceProtectedStorageContext().getCacheDir();
                break;
            case "files":
                filesDir = myw.d(context);
                break;
            case "cache":
                filesDir = context.getCacheDir();
                break;
            case "managed":
                File file = new File(myw.d(context), "managed");
                if (arrayList.size() >= 3) {
                    try {
                        if (!nip.c(nip.a((String) arrayList.get(2)))) {
                            throw new nix("AccountManager cannot be null");
                        }
                    } catch (IllegalArgumentException e) {
                        throw new nix(e);
                    }
                }
                filesDir = file;
                break;
            case "external":
                filesDir = context.getExternalFilesDir(null);
                break;
            default:
                throw new nix(String.format("Path must start with a valid logical location: %s", uri));
        }
        File file2 = new File(filesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
        if (!mez.c(this.a)) {
            synchronized (this.c) {
                if (this.d == null) {
                    this.d = myw.d(this.a.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                }
                str = this.d;
            }
            if (!file2.getAbsolutePath().startsWith(str)) {
                throw new niw("Cannot access credential-protected data from direct boot");
            }
        }
        return file2;
    }

    @Override // defpackage.njj, defpackage.nji
    public final InputStream d(Uri uri) throws niw {
        if (!h(uri)) {
            return this.b.d(a(uri));
        }
        i();
        throw null;
    }

    @Override // defpackage.nji
    public final String e() {
        return "android";
    }

    @Override // defpackage.njj, defpackage.nji
    public final boolean f(Uri uri) throws niw {
        if (!h(uri)) {
            return this.b.f(a(uri));
        }
        i();
        throw null;
    }
}

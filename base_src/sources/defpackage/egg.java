package defpackage;

import android.content.Context;
import com.google.android.GoogleCameraEngR18F1.R;
import java.io.FileOutputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class egg {
    private final lis a;
    private final Context b;
    private final qkg c;
    private final ljf d;

    public egg(lis lisVar, ljf ljfVar, qkg qkgVar, Context context) {
        this.a = lisVar.a("HexagonEnv");
        this.c = qkgVar;
        this.b = context;
        this.d = ljfVar;
    }

    public final void a() {
        try {
            try {
                this.a.f("Loading libhalide_hexagon_host.so.");
                System.loadLibrary("halide_hexagon_host");
                String str = ((etv) this.c).get().a;
                this.d.e("HexagonEnvironment#copyHexagonRemoteToDisk");
                String strConcat = String.valueOf(str).concat("/libhalide_hexagon_remote_skel.so");
                lis lisVar = this.a;
                String strValueOf = String.valueOf(strConcat);
                lisVar.f(strValueOf.length() != 0 ? "Writing libhalide_hexagon_remote_skel_signed_by_testsig.so to ".concat(strValueOf) : new String("Writing libhalide_hexagon_remote_skel_signed_by_testsig.so to "));
                InputStream inputStreamOpenRawResource = this.b.getResources().openRawResource(R.raw.libhalide_hexagon_remote_skel_signed_by_testsig);
                FileOutputStream fileOutputStream = new FileOutputStream(strConcat);
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStreamOpenRawResource.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        inputStreamOpenRawResource.close();
                        fileOutputStream.close();
                        this.d.f();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (UnsatisfiedLinkError e) {
                this.a.i("Failed to load Hexagon library", e);
            }
        } catch (Exception e2) {
            this.a.i("Error initializing Hexagon", e2);
        }
    }
}

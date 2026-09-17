package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
final class gpc implements ghz {
    final /* synthetic */ gpd a;
    private final gox b;
    private final gog c;
    private final box d;
    private final ljf e;

    public gpc(gpd gpdVar, gox goxVar, gog gogVar, box boxVar, ljf ljfVar) {
        this.a = gpdVar;
        this.b = goxVar;
        this.c = gogVar;
        this.d = boxVar;
        this.e = ljfVar;
    }

    @Override // defpackage.ghz
    public final void a() throws Throwable {
        Throwable th;
        Exception runtimeException = new RuntimeException("Unknown exception in PictureTaker.");
        try {
            try {
                try {
                    try {
                        goy goyVar = (goy) this.a.a.get(1000L, TimeUnit.MILLISECONDS);
                        if (!((Boolean) goyVar.a().fA()).booleanValue()) {
                            String strValueOf = String.valueOf(goyVar);
                            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 74);
                            sb.append("Take picture was invoked, but the picture taker is not available! Command ");
                            sb.append(strValueOf);
                            String string = sb.toString();
                            this.a.b.d(string);
                            llv llvVar = new llv(string);
                            this.a.b.f("PictureTakerCommand.run: success=false");
                            this.b.close();
                            this.c.b.w(llvVar);
                            this.c.c.f();
                            this.c.a.f.close();
                            return;
                        }
                        lis lisVar = this.a.b;
                        String strValueOf2 = String.valueOf(goyVar);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 44);
                        sb2.append("PictureTakerCommand.run: got captureCommand=");
                        sb2.append(strValueOf2);
                        lisVar.f(sb2.toString());
                        this.e.e("collect3AStats");
                        this.d.a(4);
                        this.e.g("captureImage");
                        goyVar.c(this.b, this.c);
                        if (!((Boolean) this.a.g.c(htu.ab)).booleanValue() && this.a.c.c()) {
                            this.e.g("FFListener#onImageCaptured");
                            ((dwj) this.a.c.b()).a();
                        }
                        this.e.f();
                        this.a.b.f("PictureTakerCommand.run: success=true");
                        this.b.close();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new RuntimeException(e);
                    }
                } catch (TimeoutException e2) {
                    this.a.b.e("ImageCaptureCommand retrieval timed out", e2);
                    this.a.b.f("PictureTakerCommand.run: success=false");
                    this.b.close();
                    this.c.b.w(e2);
                }
            } catch (Exception e3) {
                gpd gpdVar = this.a;
                lis lisVar2 = gpdVar.b;
                String strValueOf3 = String.valueOf(gpdVar.a.toString());
                lisVar2.e(strValueOf3.length() != 0 ? "PictureTaker command failed: ".concat(strValueOf3) : new String("PictureTaker command failed: "), e3);
                try {
                    throw e3;
                } catch (Throwable th2) {
                    th = th2;
                    runtimeException = e3;
                    this.a.b.f("PictureTakerCommand.run: success=false");
                    this.b.close();
                    this.c.b.w(runtimeException);
                    this.c.c.f();
                    this.c.a.f.close();
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            this.a.b.f("PictureTakerCommand.run: success=false");
            this.b.close();
            this.c.b.w(runtimeException);
            this.c.c.f();
            this.c.a.f.close();
            throw th;
        }
    }

    public final String toString() {
        return "PictureTakerCommand";
    }
}

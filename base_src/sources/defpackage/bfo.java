package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class bfo implements bfh {
    private final Resources a;
    private final /* synthetic */ int b;

    public bfo(Resources resources, int i) {
        this.b = i;
        this.a = resources;
    }

    @Override // defpackage.bfh
    public final bfg b(bfn bfnVar) {
        switch (this.b) {
            case 0:
                return new bfp(this.a, bfnVar.a(Uri.class, ParcelFileDescriptor.class));
            case 1:
                return new bfp(this.a, bfnVar.a(Uri.class, AssetFileDescriptor.class));
            case 2:
                return new bfp(this.a, bfnVar.a(Uri.class, InputStream.class));
            default:
                return new bfp(this.a, bfl.a);
        }
    }
}

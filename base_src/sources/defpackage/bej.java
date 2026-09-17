package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class bej implements bfh {
    private final /* synthetic */ int a;

    public bej(int i) {
        this.a = i;
    }

    @Override // defpackage.bfh
    public final bfg b(bfn bfnVar) {
        switch (this.a) {
            case 0:
                return new bek(new bei(0));
            case 1:
                return new bek(new bei(1));
            case 2:
                return new ben();
            case 3:
                return new bge(bfnVar.a(Uri.class, AssetFileDescriptor.class), 1);
            case 4:
                return new bge(bfnVar.a(Uri.class, ParcelFileDescriptor.class), 1);
            default:
                return new bge(bfnVar.a(Uri.class, InputStream.class), 1);
        }
    }
}

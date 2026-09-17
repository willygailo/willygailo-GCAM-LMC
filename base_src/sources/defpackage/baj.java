package defpackage;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class baj extends azz {
    public baj(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // defpackage.bac
    public final Class a() {
        return ParcelFileDescriptor.class;
    }

    @Override // defpackage.azz
    protected final /* bridge */ /* synthetic */ Object b(AssetManager assetManager, String str) {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }

    @Override // defpackage.azz
    protected final /* synthetic */ void e(Object obj) throws IOException {
        ((ParcelFileDescriptor) obj).close();
    }
}

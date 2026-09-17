package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class bin implements azv {
    private final /* synthetic */ int a;

    public bin(int i) {
        this.a = i;
    }

    @Override // defpackage.azv
    public final /* synthetic */ bcl a(Object obj, int i, int i2, azt aztVar) {
        switch (this.a) {
            case 0:
                return bil.g((Drawable) obj);
            case 1:
                return new bhz((Bitmap) obj);
            default:
                return new bgi((File) obj);
        }
    }

    @Override // defpackage.azv
    public final /* synthetic */ boolean b(Object obj, azt aztVar) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }
}

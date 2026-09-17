package defpackage;

import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class bhr implements azv {
    private final bhe a;
    private final /* synthetic */ int b;

    public bhr(bhe bheVar, int i) {
        this.b = i;
        this.a = bheVar;
    }

    @Override // defpackage.azv
    public final /* synthetic */ bcl a(Object obj, int i, int i2, azt aztVar) {
        switch (this.b) {
            case 0:
                bhe bheVar = this.a;
                return bheVar.a(new bhn((ParcelFileDescriptor) obj, bheVar.g, bheVar.f), i, i2, aztVar, bhe.e);
            default:
                bhe bheVar2 = this.a;
                return bheVar2.a(new bhl((ByteBuffer) obj, bheVar2.g, bheVar2.f), i, i2, aztVar, bhe.e);
        }
    }

    @Override // defpackage.azv
    public final /* synthetic */ boolean b(Object obj, azt aztVar) {
        switch (this.b) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }
}

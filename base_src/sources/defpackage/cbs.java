package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class cbs implements cbr {
    private final /* synthetic */ int a;

    public cbs(int i) {
        this.a = i;
    }

    @Override // defpackage.cbr
    public final ojc a(byte[] bArr) {
        switch (this.a) {
            case 0:
                try {
                    qys qysVar = ((qyp) ppd.s(qyp.b, bArr, pos.b())).a;
                    if (qysVar == null) {
                        qysVar = qys.b;
                    }
                    return ojc.i(qysVar);
                } catch (ppp e) {
                    return oih.a;
                }
            default:
                try {
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                    int width = bitmapDecodeByteArray.getWidth();
                    int height = bitmapDecodeByteArray.getHeight();
                    poy poyVarM = qys.b.m();
                    poy poyVarM2 = qyq.c.m();
                    poy poyVarM3 = qyu.b.m();
                    poyVarM3.aq(width);
                    qyu qyuVar = (qyu) poyVarM3.j();
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    qyq qyqVar = (qyq) poyVarM2.b;
                    qyuVar.getClass();
                    qyqVar.b = qyuVar;
                    qyqVar.a = 3;
                    poyVarM.ap("image/width", (qyq) poyVarM2.j());
                    poy poyVarM4 = qyq.c.m();
                    poy poyVarM5 = qyu.b.m();
                    poyVarM5.aq(height);
                    qyu qyuVar2 = (qyu) poyVarM5.j();
                    if (poyVarM4.c) {
                        poyVarM4.m();
                        poyVarM4.c = false;
                    }
                    qyq qyqVar2 = (qyq) poyVarM4.b;
                    qyuVar2.getClass();
                    qyqVar2.b = qyuVar2;
                    qyqVar2.a = 3;
                    poyVarM.ap("image/height", (qyq) poyVarM4.j());
                    poy poyVarM6 = qyq.c.m();
                    poy poyVarM7 = qyo.b.m();
                    poyVarM7.ao(poc.s((ByteBuffer) ((mtq) mtr.a(bitmapDecodeByteArray)).c().c()));
                    qyo qyoVar = (qyo) poyVarM7.j();
                    if (poyVarM6.c) {
                        poyVarM6.m();
                        poyVarM6.c = false;
                    }
                    qyq qyqVar3 = (qyq) poyVarM6.b;
                    qyoVar.getClass();
                    qyqVar3.b = qyoVar;
                    qyqVar3.a = 1;
                    poyVarM.ap("image/pixel_data", (qyq) poyVarM6.j());
                    return ojc.i((qys) poyVarM.j());
                } catch (RuntimeException e2) {
                    return oih.a;
                }
        }
    }
}

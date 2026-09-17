package defpackage;

import android.media.MediaCodec;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
final class lgg implements lij {
    final /* synthetic */ lgi a;
    private boolean b = true;

    public lgg(lgi lgiVar) {
        this.a = lgiVar;
    }

    @Override // defpackage.lij
    public final /* bridge */ /* synthetic */ void fB(Object obj) {
        byte[] bArrArray;
        byte[] bArrArray2;
        byte[] bArrArray3;
        Long l = (Long) obj;
        if (this.b) {
            this.b = false;
            return;
        }
        if (!this.a.e.g()) {
            Log.e("MetaEncoder", "Fail to write metadata. Metadata track is not present.");
            return;
        }
        lgi lgiVar = this.a;
        long jLongValue = l.longValue();
        int iIntValue = ((Integer) this.a.e.c()).intValue();
        boolean z = false;
        while (!lgiVar.d.isEmpty() && ((lgh) lgiVar.d.peek()).a - lgi.a.longValue() <= jLongValue) {
            lgh lghVar = (lgh) lgiVar.d.poll();
            if (z) {
                Log.w("MetaEncoder", String.format("Multiple metadata (%d) found for video frame (%d)", Long.valueOf(lghVar.a), Long.valueOf(jLongValue)));
            } else if (Math.abs(lghVar.a - jLongValue) <= lgi.a.longValue()) {
                cmj cmjVar = lghVar.b;
                byte[][] bArr = new byte[3][];
                byte[] bArr2 = cmjVar.b;
                if (bArr2 == null) {
                    bArrArray = new byte[0];
                } else {
                    int length = bArr2.length;
                    obr.aR(length < 256, "AF data too large.");
                    bArrArray = ByteBuffer.allocate(length + 2).order(ByteOrder.nativeOrder()).put((byte) 1).put((byte) length).put(cmjVar.b).array();
                }
                bArr[0] = bArrArray;
                byte[] bArr3 = cmjVar.a;
                if (bArr3 == null) {
                    bArrArray2 = new byte[0];
                } else {
                    int length2 = bArr3.length;
                    obr.aR(length2 < 256, "AE data too large.");
                    bArrArray2 = ByteBuffer.allocate(length2 + 2).order(ByteOrder.nativeOrder()).put((byte) 2).put((byte) length2).put(cmjVar.a).array();
                }
                bArr[1] = bArrArray2;
                byte[] bArr4 = cmjVar.c;
                if (bArr4 == null) {
                    bArrArray3 = new byte[0];
                } else {
                    int length3 = bArr4.length;
                    obr.aR(length3 < 256, "AWB data too large.");
                    bArrArray3 = ByteBuffer.allocate(length3 + 2).order(ByteOrder.nativeOrder()).put((byte) 3).put((byte) length3).put(cmjVar.c).array();
                }
                bArr[2] = bArrArray3;
                int length4 = 0;
                for (int i = 0; i < 3; i++) {
                    length4 += bArr[i].length;
                }
                byte[] bArr5 = new byte[length4];
                int i2 = 0;
                for (int i3 = 0; i3 < 3; i3++) {
                    byte[] bArr6 = bArr[i3];
                    int length5 = bArr6.length;
                    System.arraycopy(bArr6, 0, bArr5, i2, length5);
                    i2 += length5;
                }
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr5);
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                bufferInfo.size = byteBufferWrap.remaining();
                bufferInfo.offset = 0;
                bufferInfo.presentationTimeUs = jLongValue;
                if (lgiVar.c.c == ldz.FPS_30 && bufferInfo.size == 0) {
                    long j = lghVar.a;
                }
                lgiVar.b.m(byteBufferWrap, bufferInfo, iIntValue);
                z = true;
            }
        }
        if (z) {
            return;
        }
        StringBuilder sb = new StringBuilder(55);
        sb.append("No metadata found for video frame: ");
        sb.append(jLongValue);
        Log.w("MetaEncoder", sb.toString());
    }
}

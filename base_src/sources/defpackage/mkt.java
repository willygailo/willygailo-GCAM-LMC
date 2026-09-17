package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.google.android.apps.camera.bottombar.R;
import j$.nio.charset.StandardCharsets;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class mkt {
    private final mkq a;
    private final mkg b;

    public mkt(mkq mkqVar, mkg mkgVar) {
        short[][] sArr = mkw.a;
        this.a = mkqVar;
        this.b = mkgVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:149:0x0616  */
    /* JADX WARN: Code duplicated, block: B:206:0x0799  */
    /* JADX WARN: Code duplicated, block: B:99:0x03e8  */
    final ByteBuffer a(List list, long j) {
        ByteBuffer byteBufferAx;
        ByteBuffer byteBufferAw;
        ByteBuffer byteBufferAllocate;
        ByteBuffer byteBufferAllocate2;
        Iterator it;
        ArrayList arrayList;
        long j2;
        byte[] bArr;
        int i;
        char c;
        ByteBuffer byteBufferAx2;
        long j3;
        ByteBuffer[] byteBufferArr;
        ByteBuffer[] byteBufferArr2;
        int i2;
        ByteBuffer byteBufferAx3;
        ByteBuffer byteBufferAx4;
        ByteBuffer byteBufferAx5;
        ByteBuffer[] byteBufferArr3;
        String str;
        short s;
        short s2;
        short s3;
        byte b;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list.iterator();
        int i3 = 1;
        long jMax = 0;
        int i4 = 1;
        while (it2.hasNext()) {
            mks mksVar = (mks) it2.next();
            if (this.b.e == i3) {
                ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(200);
                byteBufferAllocate3.putInt(0);
                byteBufferAllocate3.putInt(i4);
                byteBufferAllocate3.putInt(i3);
                byteBufferAllocate3.putInt(0);
                byteBufferAllocate3.putInt(0);
                byteBufferAllocate3.putInt(0);
                arrayList3.add(mip.ax("trex", byteBufferAllocate3));
            }
            if (!mksVar.e().isEmpty() || this.b.e == i3) {
                MediaFormat mediaFormatB = mksVar.b();
                ojc ojcVarI = mediaFormatB.containsKey("language") ? ojc.i(mediaFormatB.getString("language")) : oih.a;
                boolean zAq = mip.aq(mksVar.b());
                boolean zAp = mip.ap(mksVar.b());
                long j4 = this.b.e == i3 ? 0L : ((MediaCodec.BufferInfo) mksVar.e().get(0)).presentationTimeUs;
                if (j4 <= j || !this.b.a) {
                    j4 = j;
                    byteBufferAllocate2 = ByteBuffer.allocate(0);
                } else {
                    ByteBuffer[] byteBufferArr4 = new ByteBuffer[i3];
                    byteBufferArr4[0] = mip.at(oom.n(Integer.valueOf((int) mip.an(j4 - j, 10000L)), 0), oom.n(-1, 0), oom.n(65536, 65536));
                    byteBufferAllocate2 = mip.aw("edts", Arrays.asList(byteBufferArr4));
                }
                oom oomVarE = mksVar.e();
                int iA = mksVar.a();
                int i5 = this.b.c;
                ArrayList arrayList4 = new ArrayList();
                int i6 = 0;
                long j5 = 0;
                while (true) {
                    it = it2;
                    if (i6 >= oomVarE.size()) {
                        arrayList = arrayList3;
                        if (arrayList4.size() > 2) {
                            int i7 = i5 - 1;
                            if (i5 == 0) {
                                throw null;
                            }
                            switch (i7) {
                                case 0:
                                    j2 = 0;
                                    arrayList4.set(arrayList4.size() - 1, (Long) arrayList4.get(arrayList4.size() - 2));
                                    break;
                                case 1:
                                    j2 = 0;
                                    obr.aQ(((Long) ohh.t(arrayList4)).longValue() == 0);
                                    break;
                                default:
                                    j2 = 0;
                                    break;
                            }
                        } else {
                            j2 = 0;
                        }
                        Iterator it3 = arrayList4.iterator();
                        long jLongValue = j2;
                        while (it3.hasNext()) {
                            jLongValue += ((Long) it3.next()).longValue();
                        }
                        long jA = (1000000 * jLongValue) / ((long) mksVar.a());
                        ByteBuffer[] byteBufferArr5 = new ByteBuffer[3];
                        mkq mkqVar = this.a;
                        ojc ojcVar = ojcVarI;
                        long j6 = mkqVar.d;
                        int i8 = mkqVar.a;
                        ArrayList arrayList5 = arrayList2;
                        ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(200);
                        byteBufferAllocate4.putInt(7);
                        byteBufferAllocate4.putInt(mip.as(j6));
                        byteBufferAllocate4.putInt(mip.as(j6));
                        byteBufferAllocate4.putInt(i4);
                        byteBufferAllocate4.putInt(0);
                        byteBufferAllocate4.putInt((int) mip.an(jA, 10000L));
                        byteBufferAllocate4.putInt(0);
                        byteBufferAllocate4.putInt(0);
                        byteBufferAllocate4.putInt(0);
                        byteBufferAllocate4.putShort((short) 256);
                        byteBufferAllocate4.putShort((short) 0);
                        switch (i8) {
                            case 0:
                                bArr = new byte[]{0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 64, 0, 0, 0};
                                break;
                            case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                                bArr = new byte[]{0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 64, 0, 0, 0};
                                break;
                            case 180:
                                bArr = new byte[]{-1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 64, 0, 0, 0};
                                break;
                            case 270:
                                bArr = new byte[]{0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 64, 0, 0, 0};
                                break;
                            default:
                                StringBuilder sb = new StringBuilder(31);
                                sb.append("invalid orientation ");
                                sb.append(i8);
                                throw new IllegalArgumentException(sb.toString());
                        }
                        byteBufferAllocate4.put(bArr);
                        int integer = mediaFormatB.containsKey("width") ? mediaFormatB.getInteger("width") : 0;
                        int integer2 = mediaFormatB.containsKey("height") ? mediaFormatB.getInteger("height") : 0;
                        byteBufferAllocate4.putInt(integer << 16);
                        byteBufferAllocate4.putInt(integer2 << 16);
                        byteBufferArr5[0] = mip.ax("tkhd", byteBufferAllocate4);
                        byteBufferArr5[1] = byteBufferAllocate2;
                        ByteBuffer[] byteBufferArr6 = new ByteBuffer[3];
                        int iA2 = mksVar.a();
                        long j7 = this.a.d;
                        ByteBuffer byteBufferAllocate5 = ByteBuffer.allocate(200);
                        byteBufferAllocate5.putInt(0);
                        byteBufferAllocate5.putInt(mip.as(j7));
                        byteBufferAllocate5.putInt(mip.as(j7));
                        byteBufferAllocate5.putInt(iA2);
                        byteBufferAllocate5.putInt((int) jLongValue);
                        if (ojcVar.g()) {
                            byte[] bytes = ((String) ojcVar.c()).getBytes(StandardCharsets.UTF_8);
                            if (bytes.length != 3) {
                                String strValueOf = String.valueOf(ojcVar);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
                                sb2.append("Non-length-3 language code: ");
                                sb2.append(strValueOf);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                            i = ((bytes[0] & 31) << 10) + (bytes[2] & 31) + ((bytes[1] & 31) << 5);
                            obr.aQ(true);
                        } else {
                            i = 0;
                        }
                        byteBufferAllocate5.putShort((short) i);
                        byteBufferAllocate5.putShort((short) 0);
                        byteBufferArr6[0] = mip.ax("mdhd", byteBufferAllocate5);
                        byteBufferArr6[1] = mip.au(mksVar);
                        ByteBuffer[] byteBufferArr7 = new ByteBuffer[3];
                        if (zAq) {
                            ByteBuffer byteBufferAllocate6 = ByteBuffer.allocate(200);
                            byteBufferAllocate6.putInt(0);
                            byteBufferAllocate6.putShort((short) 0);
                            byteBufferAllocate6.putShort((short) 0);
                            byteBufferAllocate6.putShort((short) 0);
                            byteBufferAllocate6.putShort((short) 0);
                            byteBufferAx2 = mip.ax("vmhd", byteBufferAllocate6);
                            c = 0;
                        } else if (zAp) {
                            ByteBuffer byteBufferAllocate7 = ByteBuffer.allocate(200);
                            byteBufferAllocate7.putInt(0);
                            byteBufferAllocate7.putShort((short) 0);
                            byteBufferAllocate7.putShort((short) 0);
                            byteBufferAx2 = mip.ax("smhd", byteBufferAllocate7);
                            c = 0;
                        } else {
                            ByteBuffer byteBufferAllocate8 = ByteBuffer.allocate(200);
                            c = 0;
                            byteBufferAllocate8.putInt(0);
                            byteBufferAx2 = mip.ax("nmhd", byteBufferAllocate8);
                        }
                        byteBufferArr7[c] = byteBufferAx2;
                        ByteBuffer byteBufferAllocate9 = ByteBuffer.allocate(4);
                        byteBufferAllocate9.putInt(1);
                        ByteBuffer[] byteBufferArr8 = {mip.ax("url ", byteBufferAllocate9)};
                        ByteBuffer byteBufferAllocate10 = ByteBuffer.allocate(8);
                        byteBufferAllocate10.putInt(0);
                        byteBufferAllocate10.putInt(1);
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.add(byteBufferAllocate10);
                        Collections.addAll(arrayList6, byteBufferArr8);
                        byteBufferArr7[1] = mip.ax("dinf", mip.aw("dref", arrayList6));
                        ByteBuffer[] byteBufferArr9 = new ByteBuffer[6];
                        if (zAq) {
                            switch (mediaFormatB.getString("mime")) {
                                case "video/avc":
                                    j3 = jA;
                                    byteBufferArr = byteBufferArr6;
                                    byteBufferArr2 = byteBufferArr5;
                                    i2 = i4;
                                    ByteBuffer byteBuffer = mediaFormatB.getByteBuffer("csd-0");
                                    ByteBuffer byteBuffer2 = mediaFormatB.getByteBuffer("csd-1");
                                    byteBuffer.getClass();
                                    byteBuffer2.getClass();
                                    ByteBuffer byteBufferAllocate11 = ByteBuffer.allocate(byteBuffer.limit() + byteBuffer2.limit() + 200);
                                    byteBufferAllocate11.put((byte) 1);
                                    obr.aG(byteBuffer.limit() > 3, "SPS too small");
                                    byteBufferAllocate11.put(byteBuffer.get(5));
                                    byteBufferAllocate11.put(byteBuffer.get(6));
                                    byteBufferAllocate11.put(byteBuffer.get(7));
                                    byteBufferAllocate11.put((byte) -1);
                                    byteBufferAllocate11.put((byte) -31);
                                    byteBufferAllocate11.putShort((short) (byteBuffer.limit() - 4));
                                    byteBufferAllocate11.put(byteBuffer);
                                    byteBufferAllocate11.put((byte) 1);
                                    byteBufferAllocate11.putShort((short) (byteBuffer2.limit() - 4));
                                    byteBufferAllocate11.put(byteBuffer2);
                                    byteBufferAx5 = mip.ax("avcC", byteBufferAllocate11);
                                    break;
                                case "video/hevc":
                                    ByteBuffer byteBuffer3 = mediaFormatB.getByteBuffer("csd-0");
                                    byteBuffer3.getClass();
                                    ByteBuffer byteBufferAllocate12 = ByteBuffer.allocate(byteBuffer3.limit() + 200);
                                    List<ByteBuffer> listAA = mip.aA(byteBuffer3);
                                    ArrayList arrayList7 = new ArrayList();
                                    for (ByteBuffer byteBuffer4 : listAA) {
                                        int i9 = i4;
                                        ByteBuffer byteBufferAllocate13 = ByteBuffer.allocate(byteBuffer4.limit());
                                        long j8 = jA;
                                        int i10 = 0;
                                        int i11 = 0;
                                        while (true) {
                                            byteBufferArr3 = byteBufferArr5;
                                            if (i10 < byteBuffer4.limit()) {
                                                ByteBuffer[] byteBufferArr10 = byteBufferArr6;
                                                if (byteBuffer4.get(i10) != 3 || i11 < 2) {
                                                    byteBufferAllocate13.put(byteBuffer4.get(i10));
                                                }
                                                i11 = byteBuffer4.get(i10) == 0 ? i11 + 1 : 0;
                                                i10++;
                                                byteBufferArr5 = byteBufferArr3;
                                                byteBufferArr6 = byteBufferArr10;
                                            }
                                        }
                                        arrayList7.add(byteBufferAllocate13);
                                        byteBufferArr5 = byteBufferArr3;
                                        i4 = i9;
                                        jA = j8;
                                    }
                                    j3 = jA;
                                    byteBufferArr = byteBufferArr6;
                                    byteBufferArr2 = byteBufferArr5;
                                    i2 = i4;
                                    byteBufferAllocate12.put((byte) 1);
                                    ByteBuffer byteBuffer5 = (ByteBuffer) arrayList7.get(0);
                                    if (byteBuffer5.get(byteBuffer5.position()) != 64) {
                                        throw new UnsupportedOperationException("first NALU in csr-0 is not the VPS");
                                    }
                                    byteBufferAllocate12.put(byteBuffer5.get(6));
                                    byteBufferAllocate12.putInt(byteBuffer5.getInt(7));
                                    byteBufferAllocate12.putInt(byteBuffer5.getInt(11));
                                    byteBufferAllocate12.putShort(byteBuffer5.getShort(15));
                                    byteBufferAllocate12.put(byteBuffer5.get(17));
                                    byteBufferAllocate12.putShort((short) -4096);
                                    byteBufferAllocate12.put((byte) -4);
                                    byteBufferAllocate12.put((byte) -4);
                                    byteBufferAllocate12.put((byte) -8);
                                    byteBufferAllocate12.put((byte) -8);
                                    byteBufferAllocate12.putShort((short) 0);
                                    byteBufferAllocate12.put((byte) 15);
                                    byteBufferAllocate12.put((byte) listAA.size());
                                    for (ByteBuffer byteBuffer6 : listAA) {
                                        byteBufferAllocate12.put((byte) ((byteBuffer6.get(0) >> 1) & 63));
                                        byteBufferAllocate12.putShort((short) 1);
                                        byteBufferAllocate12.putShort((short) byteBuffer6.limit());
                                        byteBufferAllocate12.put(byteBuffer6);
                                    }
                                    byteBufferAx5 = mip.ax("hvcC", byteBufferAllocate12);
                                    break;
                                    break;
                                case "video/av01":
                                    ByteBuffer byteBuffer7 = mediaFormatB.getByteBuffer("csd-0");
                                    byteBuffer7.getClass();
                                    byteBufferAx5 = mip.ax("av1C", byteBuffer7.duplicate());
                                    j3 = jA;
                                    byteBufferArr = byteBufferArr6;
                                    byteBufferArr2 = byteBufferArr5;
                                    i2 = i4;
                                    break;
                                default:
                                    String strValueOf2 = String.valueOf(mediaFormatB.getString("mime"));
                                    throw new UnsupportedOperationException(strValueOf2.length() != 0 ? "Unsupported video format: ".concat(strValueOf2) : new String("Unsupported video format: "));
                            }
                            switch (mediaFormatB.getString("mime")) {
                                case "video/avc":
                                    str = "avc1";
                                    break;
                                case "video/hevc":
                                    str = "hvc1";
                                    break;
                                case "video/av01":
                                    str = "av01";
                                    break;
                                default:
                                    String strValueOf3 = String.valueOf(mediaFormatB.getString("mime"));
                                    throw new UnsupportedOperationException(strValueOf3.length() != 0 ? "Unsupported video format: ".concat(strValueOf3) : new String("Unsupported video format: "));
                            }
                            ByteBuffer byteBufferAllocate14 = ByteBuffer.allocate(byteBufferAx5.limit() + 200);
                            byteBufferAllocate14.putInt(0);
                            byteBufferAllocate14.putShort((short) 0);
                            byteBufferAllocate14.putShort((short) 1);
                            byteBufferAllocate14.putShort((short) 0);
                            byteBufferAllocate14.putShort((short) 0);
                            byteBufferAllocate14.putInt(0);
                            byteBufferAllocate14.putInt(0);
                            byteBufferAllocate14.putInt(0);
                            int integer3 = mediaFormatB.containsKey("width") ? mediaFormatB.getInteger("width") : 0;
                            int integer4 = mediaFormatB.containsKey("height") ? mediaFormatB.getInteger("height") : 0;
                            byteBufferAllocate14.putShort((short) integer3);
                            byteBufferAllocate14.putShort((short) integer4);
                            byteBufferAllocate14.putInt(4718592);
                            byteBufferAllocate14.putInt(4718592);
                            byteBufferAllocate14.putInt(0);
                            byteBufferAllocate14.putShort((short) 1);
                            byteBufferAllocate14.put((byte) 0);
                            for (int i12 = 0; i12 < 31; i12++) {
                                byteBufferAllocate14.put((byte) 32);
                            }
                            byteBufferAllocate14.putShort((short) 24);
                            byteBufferAllocate14.putShort((short) -1);
                            byteBufferAllocate14.put(byteBufferAx5);
                            ByteBuffer byteBufferAllocate15 = ByteBuffer.allocate(200);
                            byteBufferAllocate15.putInt(65536);
                            byteBufferAllocate15.putInt(65536);
                            byteBufferAllocate14.put(mip.ax("pasp", byteBufferAllocate15));
                            if (mkw.a(mediaFormatB, "color-standard") != 0 || mkw.a(mediaFormatB, "color-transfer") != 0 || mkw.a(mediaFormatB, "color-range") != 0) {
                                ByteBuffer byteBufferAllocate16 = ByteBuffer.allocate(20);
                                byteBufferAllocate16.put((byte) 110);
                                byteBufferAllocate16.put((byte) 99);
                                byteBufferAllocate16.put((byte) 108);
                                byteBufferAllocate16.put((byte) 120);
                                if (mediaFormatB.containsKey("color-standard")) {
                                    int integer5 = mediaFormatB.getInteger("color-standard");
                                    if (integer5 < 0 || integer5 >= 10) {
                                        StringBuilder sb3 = new StringBuilder(43);
                                        sb3.append("Color standard not implemented: ");
                                        sb3.append(integer5);
                                        throw new IllegalArgumentException(sb3.toString());
                                    }
                                    s2 = mkw.a[integer5][0];
                                    s = mkw.a[integer5][1];
                                } else {
                                    s = 0;
                                    s2 = 0;
                                }
                                if (mediaFormatB.containsKey("color-transfer")) {
                                    int integer6 = mediaFormatB.getInteger("color-transfer");
                                    if (integer6 < 0 || integer6 >= 8) {
                                        StringBuilder sb4 = new StringBuilder(43);
                                        sb4.append("Color transfer not implemented: ");
                                        sb4.append(integer6);
                                        throw new IllegalArgumentException(sb4.toString());
                                    }
                                    s3 = mkw.b[integer6];
                                } else {
                                    s3 = 0;
                                }
                                if (mediaFormatB.containsKey("color-range")) {
                                    int integer7 = mediaFormatB.getInteger("color-range");
                                    if (integer7 < 0 || integer7 > 2) {
                                        StringBuilder sb5 = new StringBuilder(40);
                                        sb5.append("Color range not implemented: ");
                                        sb5.append(integer7);
                                        throw new IllegalArgumentException(sb5.toString());
                                    }
                                    if (integer7 == 1) {
                                        b = -128;
                                    } else {
                                        b = 0;
                                    }
                                } else {
                                    b = 0;
                                }
                                byteBufferAllocate16.putShort(s2);
                                byteBufferAllocate16.putShort(s3);
                                byteBufferAllocate16.putShort(s);
                                byteBufferAllocate16.put(b);
                                byteBufferAllocate14.put(mip.ax("colr", byteBufferAllocate16));
                            }
                            byteBufferAx3 = mip.ax(str, byteBufferAllocate14);
                        } else {
                            j3 = jA;
                            byteBufferArr = byteBufferArr6;
                            byteBufferArr2 = byteBufferArr5;
                            i2 = i4;
                            if (zAp) {
                                byteBufferAx3 = mip.az(mediaFormatB);
                            } else {
                                ByteBuffer byteBufferAllocate17 = ByteBuffer.allocate(200);
                                byte[] bytes2 = mediaFormatB.getString("mime").getBytes(StandardCharsets.UTF_8);
                                byteBufferAllocate17.put(bytes2);
                                byteBufferAllocate17.put((byte) 0);
                                byteBufferAllocate17.put(bytes2);
                                byteBufferAllocate17.put((byte) 0);
                                byteBufferAx3 = mip.ax("mett", byteBufferAllocate17);
                            }
                        }
                        ByteBuffer byteBufferAllocate18 = ByteBuffer.allocate(byteBufferAx3.limit() + 200);
                        byteBufferAllocate18.putInt(0);
                        byteBufferAllocate18.putInt(1);
                        byteBufferAllocate18.put(byteBufferAx3);
                        byteBufferArr9[0] = mip.ax("stsd", byteBufferAllocate18);
                        ByteBuffer byteBufferAllocate19 = ByteBuffer.allocate((arrayList4.size() * 8) + 200);
                        byteBufferAllocate19.putInt(0);
                        int iPosition = byteBufferAllocate19.position();
                        byteBufferAllocate19.putInt(0);
                        Iterator it4 = arrayList4.iterator();
                        long j9 = -1;
                        int i13 = 0;
                        int iPosition2 = -1;
                        while (it4.hasNext()) {
                            long jLongValue2 = ((Long) it4.next()).longValue();
                            if (j9 != jLongValue2) {
                                iPosition2 = byteBufferAllocate19.position();
                                byteBufferAllocate19.putInt(1);
                                byteBufferAllocate19.putInt((int) jLongValue2);
                                i13++;
                                j9 = jLongValue2;
                            } else {
                                byteBufferAllocate19.putInt(iPosition2, byteBufferAllocate19.getInt(iPosition2) + 1);
                            }
                        }
                        byteBufferAllocate19.putInt(iPosition, i13);
                        byteBufferArr9[1] = mip.ax("stts", byteBufferAllocate19);
                        oom oomVarE2 = mksVar.e();
                        ByteBuffer byteBufferAllocate20 = ByteBuffer.allocate((oomVarE2.size() * 4) + 200);
                        byteBufferAllocate20.putInt(0);
                        byteBufferAllocate20.putInt(0);
                        byteBufferAllocate20.putInt(oomVarE2.size());
                        Iterator it5 = oomVarE2.iterator();
                        while (it5.hasNext()) {
                            byteBufferAllocate20.putInt(((MediaCodec.BufferInfo) it5.next()).size);
                        }
                        byteBufferArr9[2] = mip.ax("stsz", byteBufferAllocate20);
                        oom oomVarD = mksVar.d();
                        ByteBuffer byteBufferAllocate21 = ByteBuffer.allocate((oomVarD.size() * 12) + 200);
                        byteBufferAllocate21.putInt(0);
                        byteBufferAllocate21.putInt(oomVarD.size());
                        Iterator it6 = oomVarD.iterator();
                        int i14 = 1;
                        while (it6.hasNext()) {
                            int iIntValue = ((Integer) it6.next()).intValue();
                            byteBufferAllocate21.putInt(i14);
                            byteBufferAllocate21.putInt(iIntValue);
                            byteBufferAllocate21.putInt(1);
                            i14++;
                        }
                        byteBufferArr9[3] = mip.ax("stsc", byteBufferAllocate21);
                        oom oomVarC = mksVar.c();
                        ByteBuffer byteBufferAllocate22 = ByteBuffer.allocate((oomVarC.size() * 8) + 200);
                        byteBufferAllocate22.putInt(0);
                        byteBufferAllocate22.putInt(oomVarC.size());
                        Iterator it7 = oomVarC.iterator();
                        while (it7.hasNext()) {
                            byteBufferAllocate22.putLong(((Long) it7.next()).longValue());
                        }
                        byteBufferArr9[4] = mip.ax("co64", byteBufferAllocate22);
                        if (zAq) {
                            oom oomVarE3 = mksVar.e();
                            ByteBuffer byteBufferAllocate23 = ByteBuffer.allocate((oomVarE3.size() * 4) + 200);
                            byteBufferAllocate23.putInt(0);
                            int iPosition3 = byteBufferAllocate23.position();
                            byteBufferAllocate23.putInt(oomVarE3.size());
                            Iterator it8 = oomVarE3.iterator();
                            int i15 = 0;
                            int i16 = 1;
                            while (it8.hasNext()) {
                                if ((((MediaCodec.BufferInfo) it8.next()).flags & 1) > 0) {
                                    byteBufferAllocate23.putInt(i16);
                                    i15++;
                                }
                                i16++;
                            }
                            byteBufferAllocate23.putInt(iPosition3, i15);
                            byteBufferAx4 = mip.ax("stss", byteBufferAllocate23);
                        } else {
                            byteBufferAx4 = null;
                        }
                        byteBufferArr9[5] = byteBufferAx4;
                        ArrayList arrayList8 = new ArrayList();
                        for (int i17 = 0; i17 < 6; i17++) {
                            ByteBuffer byteBuffer8 = byteBufferArr9[i17];
                            if (byteBuffer8 != null) {
                                arrayList8.add(byteBuffer8);
                            }
                        }
                        byteBufferArr7[2] = mip.aw("stbl", arrayList8);
                        byteBufferArr[2] = mip.aw("minf", Arrays.asList(byteBufferArr7));
                        byteBufferArr2[2] = mip.aw("mdia", Arrays.asList(byteBufferArr));
                        arrayList2 = arrayList5;
                        arrayList2.add(mip.aw("trak", Arrays.asList(byteBufferArr2)));
                        jMax = Math.max(jMax, j3);
                        i4 = i2 + 1;
                        break;
                    }
                    ArrayList arrayList9 = arrayList3;
                    long j10 = j4;
                    long jAn = mip.an((i6 == oomVarE.size() + (-1) ? ((MediaCodec.BufferInfo) oomVarE.get(i6)).presentationTimeUs : ((MediaCodec.BufferInfo) oomVarE.get(i6 + 1)).presentationTimeUs) - j4, iA);
                    long j11 = jAn - j5;
                    if (j11 >= 2147483647L) {
                        throw new IllegalArgumentException(String.format(Locale.US, "Timestamp delta %d doesn't fit into an int", Long.valueOf(j11)));
                    }
                    arrayList4.add(Long.valueOf(j11));
                    i6++;
                    j5 = jAn;
                    it2 = it;
                    arrayList3 = arrayList9;
                    j4 = j10;
                }
            } else {
                arrayList = arrayList3;
                it = it2;
            }
            it2 = it;
            arrayList3 = arrayList;
            i3 = 1;
        }
        ArrayList arrayList10 = arrayList3;
        long j12 = jMax;
        int i18 = i4;
        long j13 = this.a.d;
        ByteBuffer byteBufferAllocate24 = ByteBuffer.allocate(200);
        byteBufferAllocate24.putInt(0);
        byteBufferAllocate24.putInt(mip.as(j13));
        byteBufferAllocate24.putInt(mip.as(j13));
        byteBufferAllocate24.putInt(10000);
        byteBufferAllocate24.putInt((int) mip.an(j12, 10000L));
        byteBufferAllocate24.putInt(65536);
        byteBufferAllocate24.putShort((short) 256);
        byteBufferAllocate24.putShort((short) 0);
        byteBufferAllocate24.putInt(0);
        byteBufferAllocate24.putInt(0);
        int[] iArr = {65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824};
        for (int i19 = 0; i19 < 9; i19++) {
            byteBufferAllocate24.putInt(iArr[i19]);
        }
        for (int i20 = 0; i20 < 6; i20++) {
            byteBufferAllocate24.putInt(0);
        }
        byteBufferAllocate24.putInt(i18);
        ByteBuffer byteBufferAx6 = mip.ax("mvhd", byteBufferAllocate24);
        ojc ojcVar2 = this.a.b;
        if (ojcVar2.g()) {
            String str2 = String.format(Locale.US, "%+.4f%+.4f/", Float.valueOf(((mkr) ojcVar2.c()).a), Float.valueOf(((mkr) ojcVar2.c()).b));
            ByteBuffer byteBufferAllocate25 = ByteBuffer.allocate(str2.length() + 4);
            byteBufferAllocate25.putShort((short) (byteBufferAllocate25.capacity() - 4));
            byteBufferAllocate25.putShort((short) 5575);
            byteBufferAllocate25.put(str2.getBytes(StandardCharsets.UTF_8));
            obr.aQ(byteBufferAllocate25.limit() == byteBufferAllocate25.capacity());
            byteBufferAx = mip.ax("udta", mip.ay(new byte[]{-87, 120, 121, 122}, byteBufferAllocate25));
        } else {
            byteBufferAx = ByteBuffer.allocate(0);
        }
        if (this.a.c.isEmpty()) {
            byteBufferAw = ByteBuffer.allocate(0);
        } else {
            ByteBuffer[] byteBufferArr11 = new ByteBuffer[3];
            ByteBuffer byteBufferAllocate26 = ByteBuffer.allocate(200);
            byteBufferAllocate26.putInt(0);
            byteBufferAllocate26.putInt(0);
            byteBufferAllocate26.put("mdta".getBytes(StandardCharsets.UTF_8));
            byteBufferAllocate26.putInt(0);
            byteBufferAllocate26.putInt(0);
            byteBufferAllocate26.putInt(0);
            byteBufferAllocate26.put((byte) 0);
            byteBufferArr11[0] = mip.ax("hdlr", byteBufferAllocate26);
            ArrayList arrayListAh = obr.ah(this.a.c.keySet());
            ByteBuffer byteBufferAllocate27 = ByteBuffer.allocate(200);
            byteBufferAllocate27.putInt(0);
            byteBufferAllocate27.putInt(arrayListAh.size());
            Iterator it9 = arrayListAh.iterator();
            while (it9.hasNext()) {
                byteBufferAllocate27.put(mip.ax("mdta", ByteBuffer.wrap(((String) it9.next()).getBytes(StandardCharsets.UTF_8))));
            }
            byteBufferArr11[1] = mip.ax("keys", byteBufferAllocate27);
            ArrayList arrayListAh2 = obr.ah(this.a.c.values());
            ByteBuffer byteBufferAllocate28 = ByteBuffer.allocate(200);
            int i21 = 0;
            while (i21 < arrayListAh2.size()) {
                int i22 = i21 + 1;
                Object obj = arrayListAh2.get(i21);
                if (obj instanceof String) {
                    byte[] bytes3 = ((String) obj).getBytes(StandardCharsets.UTF_8);
                    byteBufferAllocate = ByteBuffer.allocate(bytes3.length + 8);
                    byteBufferAllocate.putInt(1);
                    byteBufferAllocate.putInt(0);
                    byteBufferAllocate.put(bytes3);
                } else {
                    if (!(obj instanceof Float)) {
                        String strValueOf4 = String.valueOf(obj.getClass());
                        StringBuilder sb6 = new StringBuilder(String.valueOf(strValueOf4).length() + 23);
                        sb6.append("Unknown metadata type: ");
                        sb6.append(strValueOf4);
                        throw new IllegalArgumentException(sb6.toString());
                    }
                    byteBufferAllocate = ByteBuffer.allocate(12);
                    byteBufferAllocate.putInt(23);
                    byteBufferAllocate.putInt(0);
                    byteBufferAllocate.putFloat(((Float) obj).floatValue());
                }
                ByteBuffer byteBufferAx7 = mip.ax("data", byteBufferAllocate);
                byteBufferAllocate28.putInt(byteBufferAx7.remaining() + 8);
                byteBufferAllocate28.putInt(i22);
                byteBufferAllocate28.put(byteBufferAx7);
                i21 = i22;
            }
            byteBufferArr11[2] = mip.ax("ilst", byteBufferAllocate28);
            byteBufferAw = mip.aw("meta", Arrays.asList(byteBufferArr11));
        }
        if (this.b.e != 1) {
            return mip.av(byteBufferAx6, byteBufferAx, byteBufferAw, arrayList2, ByteBuffer.allocate(0));
        }
        ArrayList arrayList11 = new ArrayList();
        arrayList11.addAll(arrayList10);
        return mip.av(byteBufferAx6, byteBufferAx, byteBufferAw, arrayList2, mip.aw("mvex", arrayList11));
    }
}

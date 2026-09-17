package defpackage;

import android.media.MediaCodecInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class leg implements lef {
    private static final ope a = ope.J(lig.h(720, 480), lig.h(704, 480), lig.h(640, 480));
    private static final ope b = ope.I(lig.h(leb.RES_1080P.c().a, leb.RES_1080P.c().b), lig.h(leb.RES_1080P_3X4.c().a, leb.RES_1080P_3X4.c().b));
    private static final ope c = ope.I(lig.h(leb.RES_2160P.c().a, leb.RES_2160P.c().b), lig.h(leb.RES_2160P_3X4.c().a, leb.RES_2160P_3X4.c().b));
    private final int[] d = {8000, 11025, 12000, 16000, 22050, 24000, 44100, 48000, 192000};
    private final nvb e;

    public leg(nvb nvbVar, byte[] bArr, byte[] bArr2) {
        this.e = nvbVar;
    }

    @Override // defpackage.lef
    public final lee a(ldz ldzVar, les lesVar) {
        int i = lesVar.d;
        return new lee(ldw.a(lesVar.c), lesVar.a, i, i * ldzVar.a(), lesVar.b);
    }

    @Override // defpackage.lef
    public final lee b(ldz ldzVar, les lesVar) {
        int iA;
        int i;
        int i2 = lesVar.d;
        ldw ldwVarA = ldw.a(lesVar.c);
        ldy ldyVar = ldwVarA.h;
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) this.e.a.get(ldyVar.e);
        obr.ao(mediaCodecInfo);
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(ldyVar.e);
        obr.ao(capabilitiesForType);
        MediaCodecInfo.AudioCapabilities audioCapabilities = capabilitiesForType.getAudioCapabilities();
        obr.ao(audioCapabilities);
        int[] iArr = this.d;
        int i3 = 0;
        for (int i4 = 0; i4 < 9; i4++) {
            int i5 = iArr[i4];
            if (audioCapabilities.isSampleRateSupported(i5)) {
                if (i5 >= i2) {
                    i3 = i5;
                    break;
                }
                i3 = i5;
            }
        }
        int iA2 = ldzVar.a() * i3;
        if (iA2 > 192000) {
            iA = 192000 / ldzVar.a();
            i = 192000;
        } else {
            iA = i3;
            i = iA2;
        }
        obr.ap(iA > 0);
        obr.ap(i > 0);
        return new lee(ldwVarA, lesVar.a, iA, i, lesVar.b);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    @Override // defpackage.lef
    public final leh c(les lesVar, ldz ldzVar, leb lebVar) {
        int i;
        lea leaVar;
        obr.aF(d(lesVar, ldzVar, lebVar));
        int i2 = lesVar.l;
        int i3 = ldzVar.i;
        int i4 = lesVar.g;
        if (ldzVar.f()) {
            if (i3 < i2) {
                i = (int) (i4 * (i3 / i2));
            } else {
                i = i4;
            }
        } else {
            if (!ldzVar.g()) {
                int i5 = ldzVar.i;
                int i6 = ldzVar.j;
                StringBuilder sb = new StringBuilder(79);
                sb.append("unsupported capture frame rate =");
                sb.append(i5);
                sb.append(" and encoding frame rate=");
                sb.append(i6);
                throw new IllegalArgumentException(sb.toString());
            }
            if (i3 == 30 && i2 == 60) {
                double d = i4;
                Double.isNaN(d);
                i = (int) (d / 1.5d);
            } else {
                i = i4;
            }
        }
        obr.aF(lea.a(lesVar));
        int i7 = lesVar.e;
        switch (i7) {
            case 1:
                leaVar = lea.THREE_GPP;
                break;
            case 2:
                leaVar = lea.MPEG_4;
                break;
            default:
                StringBuilder sb2 = new StringBuilder(41);
                sb2.append("file format is not supported: ");
                sb2.append(i7);
                throw new IllegalArgumentException(sb2.toString());
        }
        return new leh(leaVar, lebVar, i, ldzVar, lesVar.h, lesVar.i, lesVar.j, ldzVar == ldz.FPS_AUTO ? 2 : 1);
    }

    @Override // defpackage.lef
    public final boolean d(les lesVar, ldz ldzVar, leb lebVar) {
        boolean zContains;
        if (ldzVar.k > lesVar.l) {
            return false;
        }
        int i = lesVar.f;
        if (i == 4) {
            zContains = a.contains(lebVar.c());
        } else if (i == 6) {
            zContains = b.contains(lebVar.c());
        } else {
            zContains = i == 8 ? c.contains(lebVar.c()) : new lig(lesVar.m, lesVar.k).equals(lebVar.c());
        }
        return zContains && lea.a(lesVar);
    }
}

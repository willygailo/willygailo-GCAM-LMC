package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gsr implements lij {
    public final /* synthetic */ gtg a;
    private final /* synthetic */ int b;

    public /* synthetic */ gsr(gtg gtgVar, int i) {
        this.b = i;
        this.a = gtgVar;
    }

    @Override // defpackage.lij
    public final void fB(Object obj) {
        switch (this.b) {
            case 0:
                gtg gtgVar = this.a;
                ((gts) gtgVar.bf.c()).j((hth) obj, gtgVar.d());
                break;
            case 1:
                this.a.w();
                break;
            case 2:
                gtg gtgVar2 = this.a;
                hti htiVar = (hti) obj;
                if (gtg.A((jrl) gtgVar2.b.fA(), gtgVar2.ar)) {
                    gtgVar2.ay = htiVar == hti.AUTO;
                    break;
                } else if (gtgVar2.ay && htiVar != hti.OFF) {
                    gtgVar2.ay = false;
                    break;
                }
                break;
            case 3:
                gtg gtgVar3 = this.a;
                gtk gtkVar = gtgVar3.aj;
                if (gtkVar != null) {
                    gtgVar3.aT.f(gtkVar.a, false);
                }
                break;
            case 4:
                this.a.p(true);
                break;
            case 5:
                this.a.w();
                break;
            case 6:
                this.a.p(true);
                break;
            case 7:
                this.a.p(true);
                break;
            case 8:
                this.a.p(true);
                break;
            case 9:
                this.a.p(true);
                break;
            case 10:
                gtg gtgVar4 = this.a;
                if (!((Boolean) ((lce) gtgVar4.f.a()).d).booleanValue()) {
                    gtgVar4.aT.b(gtm.BACK_PHOTO_FLASH);
                    gtgVar4.aT.b(gtm.FRONT_PHOTO_FLASH);
                    gtgVar4.aT.b(gtm.NIGHT_FRONT_PHOTO_FLASH);
                } else if (!gtgVar4.e.k(ddm.ao)) {
                    gtgVar4.aT.e(gtm.BACK_PHOTO_FLASH);
                    gtgVar4.aT.e(gtm.FRONT_PHOTO_FLASH);
                    gtgVar4.aT.e(gtm.NIGHT_FRONT_PHOTO_FLASH);
                } else if (gtgVar4.ar) {
                    gtgVar4.aT.e(gtm.FRONT_PHOTO_FLASH);
                    gtgVar4.aT.e(gtm.NIGHT_FRONT_PHOTO_FLASH);
                } else if (((Boolean) gtgVar4.am.fA()).booleanValue()) {
                    gtgVar4.aT.b(gtm.BACK_PHOTO_FLASH);
                } else {
                    gtgVar4.aT.e(gtm.BACK_PHOTO_FLASH);
                }
                gtgVar4.r();
                if (gtgVar4.bf.g()) {
                    ((gts) gtgVar4.bf.c()).i(gtgVar4.B());
                }
                gtgVar4.w();
                break;
            case 11:
                gtg gtgVar5 = this.a;
                if (((Boolean) obj).booleanValue()) {
                    gtgVar5.bj.c(gtgVar5.f.a().a(new gsr(gtgVar5, 10), gtgVar5.c));
                }
                break;
            case 12:
                this.a.y();
                break;
            case 13:
                this.a.w();
                break;
            case 14:
                gtg gtgVar6 = this.a;
                gtgVar6.w();
                gtgVar6.y();
                break;
            case 15:
                this.a.w();
                break;
            case 16:
                gtg gtgVar7 = this.a;
                if (((Boolean) obj).booleanValue()) {
                    gtgVar7.aT.e(gtm.MICROPHONE);
                    break;
                } else if (((hth) gtgVar7.u.fA()).equals(hth.EXT_BLUETOOTH) && !gtgVar7.aT.i(gtm.MICROPHONE)) {
                    ((oug) ((oug) gtg.a.c()).G((char) 2125)).r("Connect bluetooth failed. Reset to phone mic from %s", gtgVar7.u.fA());
                    gtgVar7.aT.e(gtm.MICROPHONE);
                    gtgVar7.u.fB(hth.PHONE);
                    break;
                }
                break;
            case 17:
                gtg gtgVar8 = this.a;
                gtgVar8.t();
                gtgVar8.u();
                break;
            case 18:
                gtg gtgVar9 = this.a;
                Integer num = (Integer) obj;
                String str = (String) gtgVar9.G.fA();
                if (str != null) {
                    gtgVar9.I(hls.h(num.intValue()), lwd.BACK, str);
                    gtgVar9.I(hls.h(num.intValue()), lwd.FRONT, str);
                }
                break;
            case 19:
                gtg gtgVar10 = this.a;
                ((gts) gtgVar10.bf.c()).i(gtgVar10.B());
                break;
            default:
                gtg gtgVar11 = this.a;
                ((gts) gtgVar11.bf.c()).i(gtgVar11.B());
                break;
        }
    }
}

package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cme implements lij {
    public final /* synthetic */ lnc a;
    private final /* synthetic */ int b;

    public /* synthetic */ cme(lnc lncVar, int i) {
        this.b = i;
        this.a = lncVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.lij
    public final void fB(Object obj) {
        int i = 1;
        switch (this.b) {
            case 0:
                this.a.h(kdc.m, Boolean.valueOf(((cjr) obj) == cjr.RECORDING_SESSION_ACTIVE));
                break;
            case 1:
                lnc lncVar = this.a;
                lmp lmpVarA = lncVar.a();
                ((lok) lmpVarA).f = (Integer) obj;
                lncVar.m(lmpVarA.a());
                break;
            case 2:
                lnc lncVar2 = this.a;
                cqj cqjVar = (cqj) obj;
                if (cqjVar != cqj.ACTIVE) {
                    switch (cqjVar) {
                        case OFF:
                        case DEFAULT:
                        case CINEMATIC:
                            i = 0;
                            break;
                        case LOCKED:
                            break;
                        case ACTIVE:
                            i = 3;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                    byte[] bArrArray = ByteBuffer.allocate(12).order(ByteOrder.nativeOrder()).putInt(i).array();
                    Arrays.toString(bArrArray);
                    lncVar2.h(kdc.e, bArrArray);
                    break;
                }
                break;
            case 3:
                lnc lncVar3 = this.a;
                gsm gsmVar = (gsm) obj;
                lncVar3.h(CaptureRequest.SCALER_CROP_REGION, gsmVar.a);
                lncVar3.h(CaptureRequest.LENS_FOCAL_LENGTH, Float.valueOf(gsmVar.c));
                break;
            case 4:
                hck hckVar = (hck) obj;
                this.a.i(ope.I(mip.be(kdd.a, Integer.valueOf(hckVar.a)), mip.be(kdd.b, oxh.L(hckVar.b))));
                break;
            case 5:
                lnc lncVar4 = this.a;
                int i2 = true == ((Boolean) obj).booleanValue() ? 2 : 0;
                lmp lmpVarA2 = lncVar4.a();
                ((lok) lmpVarA2).g = Integer.valueOf(i2);
                lncVar4.m(lmpVarA2.a());
                break;
            case 6:
                this.a.h(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, (Integer) obj);
                break;
            case 7:
                lnc lncVar5 = this.a;
                if (((Boolean) obj).booleanValue()) {
                    lncVar5.l(false, true, false);
                }
                break;
            case 8:
                fvq.p(this.a, fvq.o((gjm) obj));
                break;
            case 9:
                hck hckVar2 = (hck) obj;
                this.a.i(ope.I(mip.be(kdd.a, Integer.valueOf(hckVar2.a)), mip.be(kdd.b, oxh.L(hckVar2.b))));
                break;
            case 10:
                lnc lncVar6 = this.a;
                lmp lmpVarA3 = lncVar6.a();
                ((lok) lmpVarA3).f = (Integer) obj;
                lncVar6.m(lmpVarA3.a());
                break;
            case 11:
                this.a.g(mip.be(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, (Integer) obj));
                break;
            default:
                gsm gsmVar2 = (gsm) obj;
                this.a.i(mip.eL(gsmVar2.a, gsmVar2.c));
                break;
        }
    }
}

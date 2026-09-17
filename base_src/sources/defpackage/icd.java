package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import com.google.android.GoogleCameraEngR18F1.R;
import j$.util.function.Consumer;
import j$.util.function.Function;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class icd implements Function {
    private final /* synthetic */ int v;
    public static final /* synthetic */ icd u = new icd(20);
    public static final /* synthetic */ icd t = new icd(19);
    public static final /* synthetic */ icd s = new icd(18);
    public static final /* synthetic */ icd r = new icd(17);
    public static final /* synthetic */ icd q = new icd(16);
    public static final /* synthetic */ icd p = new icd(15);
    public static final /* synthetic */ icd o = new icd(14);
    public static final /* synthetic */ icd n = new icd(13);
    public static final /* synthetic */ icd m = new icd(12);
    public static final /* synthetic */ icd l = new icd(11);
    public static final /* synthetic */ icd k = new icd(10);
    public static final /* synthetic */ icd j = new icd(9);
    public static final /* synthetic */ icd i = new icd(8);
    public static final /* synthetic */ icd h = new icd(7);
    public static final /* synthetic */ icd g = new icd(6);
    public static final /* synthetic */ icd f = new icd(5);
    public static final /* synthetic */ icd e = new icd(4);
    public static final /* synthetic */ icd d = new icd(3);
    public static final /* synthetic */ icd c = new icd(2);
    public static final /* synthetic */ icd b = new icd(1);
    public static final /* synthetic */ icd a = new icd(0);

    private /* synthetic */ icd(int i2) {
        this.v = i2;
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        switch (this.v) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
        }
        return Function.CC.$default$andThen(this, function);
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        switch (this.v) {
            case 0:
                int i2 = icf.d;
                return ((ifm) obj).a.activityInfo.packageName;
            case 1:
                int i3 = icf.d;
                return ((ResolveInfo) obj).activityInfo.packageName;
            case 2:
                return ((ifm) obj).a;
            case 3:
                return ((ResolveInfo) obj).activityInfo.packageName;
            case 4:
                return (String) ((ojd) obj).a;
            case 5:
                return (ResolveInfo) ((ojd) obj).b;
            case 6:
                return ((ResolveInfo) obj).activityInfo.packageName;
            case 7:
                return (String) ((ojd) obj).a;
            case 8:
                return (ResolveInfo) ((ojd) obj).b;
            case 9:
                ouj oujVar = iec.a;
                return ((ResolveInfo) obj).activityInfo.packageName;
            case 10:
                ouj oujVar2 = iec.a;
                return ((ResolveInfo) obj).activityInfo.packageName;
            case 11:
                ouj oujVar3 = iec.a;
                return ((ResolveInfo) obj).activityInfo.packageName;
            case 12:
                ouj oujVar4 = iec.a;
                return ((ResolveInfo) obj).activityInfo.packageName;
            case 13:
                ouj oujVar5 = iec.a;
                return idm.c(((ResolveInfo) obj).activityInfo.packageName);
            case 14:
                return idm.c((String) obj);
            case 15:
                iek iekVar = (iek) obj;
                iekVar.setVisibility(0);
                ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(iekVar, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, iekVar.getAlpha(), 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, iekVar.getScaleX(), 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, iekVar.getScaleY(), 1.0f));
                objectAnimatorOfPropertyValuesHolder.setDuration(iekVar.b.toMillis());
                return objectAnimatorOfPropertyValuesHolder;
            case 16:
                final iek iekVar2 = (iek) obj;
                ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(iekVar2, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, iekVar2.getAlpha(), 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, iekVar2.getScaleX(), 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, iekVar2.getScaleY(), 0.0f));
                objectAnimatorOfPropertyValuesHolder2.addListener(mip.ev(new Consumer() { // from class: iej
                    @Override // j$.util.function.Consumer
                    public final void accept(Object obj2) {
                        iekVar2.setVisibility(8);
                    }

                    @Override // j$.util.function.Consumer
                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer.CC.$default$andThen(this, consumer);
                    }
                }));
                objectAnimatorOfPropertyValuesHolder2.setDuration(iekVar2.b.toMillis());
                return objectAnimatorOfPropertyValuesHolder2;
            case 17:
                return htl.b((leb) obj);
            case 18:
                return (htl) ((ojc) obj).c();
            case 19:
                return new EnumMap(jkc.class);
            default:
                Resources resources = (Resources) obj;
                if (!jlq.a) {
                    jlp jlpVarA = jlq.a();
                    jlpVarA.o(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                    jlpVarA.m(255);
                    jlpVarA.n(-1);
                    jlpVarA.z(resources.getColor(R.color.camera_mode_color, null));
                    jlpVarA.A(resources.getDimensionPixelSize(R.dimen.photo_button_radius));
                    jlpVarA.u(0);
                    jlpVarA.d(R.drawable.ic_check);
                    jlpVarA.i(resources.getDrawable(R.drawable.ic_check, null).getIntrinsicWidth() / 2);
                    jlpVarA.s(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                    jlpVarA.t(resources.getDimensionPixelSize(R.dimen.photo_button_radius));
                    jlpVarA.l(resources.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                    return jlpVarA;
                }
                jlp jlpVarA2 = jlq.a();
                jlpVarA2.o(resources.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA2.j(resources.getColor(R.color.camera_main_button_color, null));
                jlpVarA2.m(255);
                jlpVarA2.n(jlq.c ? jlq.e : resources.getColor(R.color.camera_mode_pressed_color, null));
                jlpVarA2.z(0);
                jlpVarA2.A(resources.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                jlpVarA2.u(0);
                jlpVarA2.d(R.drawable.quantum_gm_ic_done_black_24);
                jlpVarA2.i(resources.getDrawable(R.drawable.quantum_gm_ic_done_black_24, null).getIntrinsicWidth() / 2);
                jlpVarA2.s(resources.getDimensionPixelSize(R.dimen.P20_photo_button_inner_radius));
                jlpVarA2.t(resources.getDimensionPixelSize(R.dimen.P20_photo_button_radius));
                jlpVarA2.l(resources.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                return jlpVarA2;
        }
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        switch (this.v) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
        }
        return Function.CC.$default$compose(this, function);
    }
}

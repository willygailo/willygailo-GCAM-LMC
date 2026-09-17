package defpackage;

import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.view.View;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.GoogleCameraEngR18F1.R;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class epw extends iux implements esi {
    public final lar a;
    public final List b;
    public esn c;
    public boolean d;
    public esn e;
    private int j;

    public epw(Context context, ius iusVar, ddf ddfVar, lar larVar) {
        super(ddfVar, context, iusVar);
        this.d = false;
        this.a = larVar;
        this.b = new ArrayList();
    }

    public static final void b(TextView textView, mlu mluVar) {
        try {
            textView.setTextColor(((Integer) mluVar.a(textView)).intValue());
        } catch (Throwable th) {
            ovd ovdVar = ovl.a;
        }
    }

    public static final void c(AnimatedVectorDrawable animatedVectorDrawable) {
        animatedVectorDrawable.clearAnimationCallbacks();
        animatedVectorDrawable.stop();
    }

    public final void a() {
        if (this.e != null) {
            List list = this.b;
            poy poyVarM = pda.e.m();
            int i = this.j;
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pda pdaVar = (pda) poyVarM.b;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            pdaVar.c = i2;
            pdaVar.a |= 2;
            esn esnVar = this.e;
            esnVar.getClass();
            int iOrdinal = esnVar.ordinal();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pda pdaVar2 = (pda) poyVarM.b;
            int i3 = pdaVar2.a | 1;
            pdaVar2.a = i3;
            pdaVar2.b = iOrdinal;
            iuv iuvVar = this.i;
            int i4 = iuvVar != null ? iuvVar.d : 0;
            pdaVar2.a = i3 | 4;
            pdaVar2.d = i4;
            list.add((pda) poyVarM.j());
        }
    }

    @Override // defpackage.esi
    public final void d(esn esnVar, int i) {
        this.c = esnVar;
        this.j = i;
        this.e = null;
        this.d = false;
        this.b.clear();
        Context context = this.h;
        ArrayList arrayList = new ArrayList();
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) context.getDrawable(R.drawable.long_exposure_animation);
        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) context.getDrawable(R.drawable.action_animation);
        arrayList.add(epv.a(esn.ACTION, context.getString(R.string.moblur_action_title), new iuu(context.getString(R.string.moblur_action_title), context.getString(R.string.moblur_action_edu_desc), oom.p(msq.b(animatedVectorDrawable2), msq.a(context.getString(R.string.moblur_action_url1)), msq.a(context.getString(R.string.moblur_action_url2)), msq.a(context.getString(R.string.moblur_action_url3))), context.getString(R.string.moblur_action_edu_photo_acc), context.getString(R.string.moblur_action_edu_animation_acc), context.getString(R.string.moblur_regular), true)));
        arrayList.add(epv.a(esn.LANDSCAPE, context.getString(R.string.moblur_landscape_title), new iuu(context.getString(R.string.moblur_landscape_title), context.getString(R.string.moblur_landscape_edu_desc), oom.p(msq.b(animatedVectorDrawable), msq.a(context.getString(R.string.moblur_landscape_url1)), msq.a(context.getString(R.string.moblur_landscape_url2)), msq.a(context.getString(R.string.moblur_landscape_url3))), context.getString(R.string.moblur_landscape_edu_photo_acc), context.getString(R.string.moblur_landscape_edu_animation_acc), context.getString(R.string.moblur_regular), true)));
        View viewE = e();
        ViewPager2 viewPager2F = f(viewE, (List) Collection.EL.stream(arrayList).map(cgw.k).collect(Collectors.toList()), ((orr) ((epv) arrayList.get(0)).c.c).c, new eps(this, animatedVectorDrawable2, animatedVectorDrawable), new epq(arrayList, 0));
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext() && !((epv) it.next()).a.equals(esnVar)) {
            i2++;
        }
        viewPager2F.d(i2, false);
        viewE.addOnAttachStateChangeListener(new ept(animatedVectorDrawable, animatedVectorDrawable2, viewE));
        g(2, viewE, context, new epp(this));
    }
}

package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.ui.modeswitcher.MoreModesGrid;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class jgj implements phh {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ jgk d;

    public jgj(jgk jgkVar, boolean z, boolean z2, boolean z3) {
        this.d = jgkVar;
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:31:0x0162  */
    /* JADX WARN: Code duplicated, block: B:33:0x0166  */
    /* JADX WARN: Code duplicated, block: B:35:0x0174  */
    /* JADX WARN: Code duplicated, block: B:36:0x017b  */
    /* JADX WARN: Code duplicated, block: B:42:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:44:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:46:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:47:0x01c0  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void c() {
        lco lcoVar;
        int i;
        Drawable drawableA;
        String strD;
        ojc ojcVarB;
        String strC;
        ojc ojcVarB2;
        jgk jgkVar = this.d;
        final MoreModesGrid moreModesGrid = jgkVar.e;
        lar.a();
        if (moreModesGrid.f) {
            ArrayList arrayList = moreModesGrid.b;
            Context context = moreModesGrid.getContext();
            Resources resources = context.getResources();
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
            moreModesGrid.removeAllViews();
            int size = moreModesGrid.b.size() % 3;
            if (size == 0) {
                size = 3;
            }
            layoutInflater.getClass();
            ArrayList arrayList2 = moreModesGrid.b;
            int size2 = arrayList2.size();
            boolean z = false;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            LayoutInflater layoutInflater2 = layoutInflater;
            while (i2 < size2) {
                jgp jgpVar = (jgp) arrayList2.get(i2);
                final jrl jrlVar = jgpVar.a;
                TextView textView = (TextView) layoutInflater2.inflate(R.layout.more_modes_item, moreModesGrid, z);
                GridLayout.LayoutParams layoutParams = (GridLayout.LayoutParams) textView.getLayoutParams();
                if (i3 == 0) {
                    i = 1;
                    layoutParams.rowSpec = GridLayout.spec(0, 1, MoreModesGrid.BOTTOM, 1.0f);
                } else {
                    i = 1;
                    layoutParams.rowSpec = GridLayout.spec(i3, 1, MoreModesGrid.BOTTOM, 0.0f);
                }
                layoutParams.columnSpec = GridLayout.spec(i4, i, MoreModesGrid.FILL, 1.0f);
                Drawable drawable = resources.getDrawable(R.drawable.more_modes_icon_circle, null);
                if (jrlVar == jrl.ORNAMENT) {
                    ojc ojcVarH = ojc.h(new pvr(moreModesGrid.getContext().getPackageManager()).d());
                    if (ojcVarH.g()) {
                        drawableA = (Drawable) ojcVarH.c();
                    } else {
                        drawableA = jri.b(jrlVar).a(moreModesGrid.getContext().getResources());
                    }
                } else {
                    drawableA = jri.b(jrlVar).a(moreModesGrid.getContext().getResources());
                }
                Drawable drawableMutate = drawableA.getConstantState().newDrawable().mutate();
                drawableMutate.setColorFilter(MoreModesGrid.a);
                Drawable drawable2 = moreModesGrid.getContext().getDrawable(R.drawable.notification_dot);
                if (!moreModesGrid.g) {
                    LayerDrawable layerDrawable = (LayerDrawable) moreModesGrid.getContext().getDrawable(R.drawable.notification_dot);
                    layerDrawable.setDrawableByLayerId(R.id.notification_dot_foreground, moreModesGrid.getContext().getDrawable(R.drawable.notification_dot_foreground_legacy));
                    drawable2 = layerDrawable;
                }
                int i5 = size2;
                LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{drawable, drawableMutate, drawable2});
                layerDrawable2.setLayerGravity(0, 17);
                layerDrawable2.setLayerGravity(1, 17);
                layerDrawable2.setLayerGravity(2, 17);
                int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.more_modes_grid_dot_inset);
                layerDrawable2.setLayerInset(2, dimensionPixelOffset, 0, 0, dimensionPixelOffset);
                layerDrawable2.getDrawable(2).setAlpha(true != jgpVar.c ? 0 : 255);
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.more_modes_icon_diameter);
                layerDrawable2.setLayerSize(0, dimensionPixelSize, dimensionPixelSize);
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, layerDrawable2, (Drawable) null, (Drawable) null);
                if (jrlVar == jrl.ORNAMENT) {
                    ojc ojcVarC = jtx.c(moreModesGrid.getContext());
                    if (ojcVarC.g()) {
                        strD = (String) ojcVarC.c();
                    } else if (jrlVar == jrl.MEASURE) {
                        ojcVarB = jtx.b(moreModesGrid.getContext());
                        if (ojcVarB.g()) {
                            strD = (String) ojcVarB.c();
                        } else {
                            strD = jri.b(jrlVar).d(moreModesGrid.getContext().getResources());
                        }
                    } else {
                        strD = jri.b(jrlVar).d(moreModesGrid.getContext().getResources());
                    }
                } else if (jrlVar == jrl.MEASURE) {
                    ojcVarB = jtx.b(moreModesGrid.getContext());
                    if (ojcVarB.g()) {
                        strD = (String) ojcVarB.c();
                    } else {
                        strD = jri.b(jrlVar).d(moreModesGrid.getContext().getResources());
                    }
                } else {
                    strD = jri.b(jrlVar).d(moreModesGrid.getContext().getResources());
                }
                textView.setText(strD);
                if (jrlVar == jrl.ORNAMENT) {
                    ojc ojcVarC2 = jtx.c(moreModesGrid.getContext());
                    if (ojcVarC2.g()) {
                        strC = (String) ojcVarC2.c();
                    } else if (jrlVar == jrl.MEASURE) {
                        ojcVarB2 = jtx.b(moreModesGrid.getContext());
                        if (ojcVarB2.g()) {
                            strC = (String) ojcVarB2.c();
                        } else {
                            strC = jri.b(jrlVar).c(moreModesGrid.getContext().getResources());
                        }
                    } else {
                        strC = jri.b(jrlVar).c(moreModesGrid.getContext().getResources());
                    }
                } else if (jrlVar == jrl.MEASURE) {
                    ojcVarB2 = jtx.b(moreModesGrid.getContext());
                    if (ojcVarB2.g()) {
                        strC = (String) ojcVarB2.c();
                    } else {
                        strC = jri.b(jrlVar).c(moreModesGrid.getContext().getResources());
                    }
                } else {
                    strC = jri.b(jrlVar).c(moreModesGrid.getContext().getResources());
                }
                textView.setContentDescription(strC);
                textView.setOnClickListener(new View.OnClickListener() { // from class: jgn
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MoreModesGrid moreModesGrid2 = moreModesGrid;
                        jrl jrlVar2 = jrlVar;
                        if (moreModesGrid2.isEnabled() && !moreModesGrid2.h.isRunning() && view.getVisibility() == 0 && ((MoreModesGrid) view.getParent()).getVisibility() == 0) {
                            fjs fjsVar = moreModesGrid2.e;
                            if (fjsVar != null) {
                                fjsVar.aa(3, jrl.MORE_MODES.toString(), jrlVar2.toString());
                            }
                            jty.e(view);
                            if (moreModesGrid2.m.g()) {
                                ((jgr) moreModesGrid2.m.c()).g(jrlVar2);
                            }
                        }
                    }
                });
                textView.setSoundEffectsEnabled(false);
                moreModesGrid.addView(textView);
                jgpVar.b = textView;
                i4++;
                if (i4 == 3) {
                    i3++;
                    i4 = 0;
                } else if (i4 == size && i3 == 0) {
                    i3 = 0;
                    i3++;
                    i4 = 0;
                }
                i2++;
                layoutInflater2 = layoutInflater2;
                arrayList2 = arrayList2;
                size2 = i5;
                z = false;
            }
            moreModesGrid.f = false;
        }
        ArrayList arrayList3 = new ArrayList();
        for (jrl jrlVar2 : jgkVar.b.keySet()) {
            if (jgkVar.x(jrlVar2) && (lcoVar = (lco) jgkVar.b.get(jrlVar2)) != null) {
                arrayList3.add(lcoVar);
            }
        }
        if (!arrayList3.isEmpty()) {
            jgkVar.b.put(jrl.MORE_MODES, lcv.c(arrayList3));
            jgkVar.i(jrl.MORE_MODES);
            jgkVar.s(jrl.MORE_MODES);
        }
        if (jgkVar.h) {
            jgkVar.w();
        }
        jgkVar.g = true;
    }

    private final void d() {
        this.d.k(jrl.IMAX);
        this.d.k(jrl.PHOTO_SPHERE);
        if (!this.d.k.k(dcu.J)) {
            this.d.k(jrl.SLOW_MOTION);
            this.d.k(jrl.TIME_LAPSE);
        }
        if (this.a) {
            this.d.k(jrl.ORNAMENT);
        }
        if (this.b) {
            this.d.k(jrl.TIARA);
        }
        if (this.c) {
            this.d.k(jrl.MEASURE);
        }
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        ((oug) ((oug) jgk.a.b()).G((char) 3344)).r("Failed to add Lens entry: %s", th);
        this.d.j.e("FinalizeMoreModes");
        d();
        c();
        this.d.j.f();
    }

    @Override // defpackage.phh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.d.j.e("FinalizeMoreModes");
        d();
        if (((Boolean) obj).booleanValue()) {
            this.d.k(jrl.LENS);
            this.d.h = true;
        }
        c();
        this.d.j.f();
    }
}

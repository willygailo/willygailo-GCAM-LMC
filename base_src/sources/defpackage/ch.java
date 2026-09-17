package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
final class ch implements LayoutInflater.Factory2 {
    final cu a;

    public ch(cu cuVar) {
        this.a = cuVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        da daVarG;
        if (cc.class.getName().equals(str)) {
            return new cc(context, attributeSet, this.a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ax.a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                if (bu.class.isAssignableFrom(ce.a(context.getClassLoader(), attributeValue))) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1) {
                        if (resourceId != -1) {
                            id = -1;
                        } else {
                            if (string == null) {
                                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                            }
                            id = -1;
                            resourceId = -1;
                        }
                    }
                    bu buVarC = resourceId != -1 ? this.a.c(resourceId) : null;
                    if (buVarC == null && string != null) {
                        buVarC = this.a.d(string);
                    }
                    if (buVarC == null && id != -1) {
                        buVarC = this.a.c(id);
                    }
                    if (buVarC == null) {
                        ce ceVarE = this.a.e();
                        context.getClassLoader();
                        buVarC = ceVarE.b(attributeValue);
                        buVarC.t = true;
                        buVarC.C = resourceId != 0 ? resourceId : id;
                        buVarC.D = id;
                        buVarC.E = string;
                        buVarC.u = true;
                        buVarC.y = this.a;
                        cu cuVar = this.a;
                        buVarC.z = cuVar.j;
                        Context context2 = cuVar.j.c;
                        Bundle bundle = buVarC.g;
                        buVarC.ad();
                        daVarG = this.a.f(buVarC);
                        if (cu.Q(2)) {
                            String str2 = "Fragment " + buVarC + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId);
                        }
                    } else {
                        if (buVarC.u) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        buVarC.u = true;
                        buVarC.y = this.a;
                        cu cuVar2 = this.a;
                        buVarC.z = cuVar2.j;
                        Context context3 = cuVar2.j.c;
                        buVarC.ad();
                        daVarG = this.a.g(buVarC);
                        if (cu.Q(2)) {
                            String str3 = "Retained Fragment " + buVarC + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId);
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    adl.b(buVarC, viewGroup);
                    buVarC.L = viewGroup;
                    daVarG.d();
                    daVarG.c();
                    View view2 = buVarC.M;
                    if (view2 == null) {
                        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (buVarC.M.getTag() == null) {
                        buVarC.M.setTag(string);
                    }
                    buVarC.M.addOnAttachStateChangeListener(new cg(this, daVarG));
                    return buVarC.M;
                }
            } catch (ClassNotFoundException e) {
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}

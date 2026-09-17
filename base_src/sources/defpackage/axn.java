package defpackage;

import android.graphics.Point;
import android.hardware.Camera;
import android.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class axn {
    private final Point a;

    public axn(int i, int i2) {
        this.a = new Point(i, i2);
    }

    public axn(Camera.Size size) {
        if (size == null) {
            this.a = new Point(0, 0);
        } else {
            this.a = new Point(size.width, size.height);
        }
    }

    public axn(Size size) {
        if (size == null) {
            this.a = new Point(0, 0);
        } else {
            this.a = new Point(size.getWidth(), size.getHeight());
        }
    }

    public axn(axn axnVar) {
        if (axnVar == null) {
            this.a = new Point(0, 0);
        } else {
            this.a = new Point(axnVar.b(), axnVar.a());
        }
    }

    public static List c(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new axn((Size) it.next()));
        }
        return arrayList;
    }

    public final int a() {
        return this.a.y;
    }

    public final int b() {
        return this.a.x;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof axn) {
            return this.a.equals(((axn) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Size: (" + b() + " x " + a() + ")";
    }
}

package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.ArrayMap;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class vo {
    public final String a;
    public final CameraCharacteristics b;
    private final ArrayMap c = new ArrayMap();
    private final qkj d;
    private final qkj e;
    private final qkj f;

    public vo(String str, CameraCharacteristics cameraCharacteristics) {
        this.a = str;
        this.b = cameraCharacteristics;
        qmd.O(new vn(this, 1));
        this.d = qmd.O(new vn(this, 3));
        qmd.O(new vn(this, 4));
        this.e = qmd.O(new vn(this, 0));
        qmd.O(new vn(this, 2));
        this.f = qmd.O(new vn(this, 5));
    }

    public final Object a(CameraCharacteristics.Key key) {
        Object obj;
        synchronized (this.c) {
            obj = this.c.get(key);
        }
        if (obj == null && (obj = this.b.get(key)) != null) {
            synchronized (this.c) {
                this.c.put(key, obj);
            }
        }
        return obj;
    }

    public final Set b() {
        return (Set) this.e.a();
    }

    public final Set c() {
        return (Set) this.d.a();
    }

    public final Set d() {
        return (Set) this.f.a();
    }
}

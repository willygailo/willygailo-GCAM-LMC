package defpackage;

import android.view.animation.Interpolator;
import j$.util.function.BiConsumer;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class jku {
    final Set a;
    final Map b;

    public jku(jkc jkcVar) {
        EnumSet enumSetNoneOf = EnumSet.noneOf(jkc.class);
        this.a = enumSetNoneOf;
        this.b = new EnumMap(jkc.class);
        enumSetNoneOf.add(jkcVar);
    }

    final void a(jks jksVar) {
        for (jkc jkcVar : jkc.values()) {
            j$.util.Map.EL.putIfAbsent(this.b, jkcVar, jksVar);
        }
    }

    final void b(jkc jkcVar, jks jksVar) {
        this.b.put(jkcVar, jksVar);
    }

    final void c(jkc jkcVar) {
        b(jkcVar, new jks() { // from class: jkt
            @Override // j$.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Interpolator interpolator = jkz.a;
                jkc jkcVar2 = ((jlq) obj).x;
                jkc jkcVar3 = ((jlq) obj2).x;
            }

            @Override // j$.util.function.BiConsumer
            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer.CC.$default$andThen(this, biConsumer);
            }
        });
    }
}

package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ayf extends ayd {
    public ayf(Class cls, Class cls2) {
        String strValueOf = String.valueOf(cls);
        String strValueOf2 = String.valueOf(cls2);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 54 + String.valueOf(strValueOf2).length());
        sb.append("Failed to find any ModelLoaders for model: ");
        sb.append(strValueOf);
        sb.append(" and data: ");
        sb.append(strValueOf2);
        super(sb.toString());
    }

    public ayf(Object obj) {
        String strValueOf = String.valueOf(obj.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 60);
        sb.append("Failed to find any ModelLoaders registered for model class: ");
        sb.append(strValueOf);
        super(sb.toString());
    }

    public ayf(Object obj, List list) {
        String strValueOf = String.valueOf(list);
        String strValueOf2 = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 89 + String.valueOf(strValueOf2).length());
        sb.append("Found ModelLoaders for model class: ");
        sb.append(strValueOf);
        sb.append(", but none that handle this specific model instance: ");
        sb.append(strValueOf2);
        super(sb.toString());
    }
}

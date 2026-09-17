package defpackage;

import java.io.IOException;
import java.text.AttributedCharacterIterator;
import java.text.Format;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class g {
    public final Appendable a;
    public int b;
    public List c = null;

    public g(StringBuffer stringBuffer) {
        this.a = stringBuffer;
        this.b = stringBuffer.length();
    }

    public g(StringBuilder sb) {
        this.a = sb;
        this.b = sb.length();
    }

    public final void a(CharSequence charSequence) {
        try {
            this.a.append(charSequence);
            this.b += charSequence.length();
        } catch (IOException e) {
            throw new ad(e);
        }
    }

    public final void b(Format format, Object obj) {
        if (this.c == null) {
            a(format.format(obj));
            return;
        }
        AttributedCharacterIterator toCharacterIterator = format.formatToCharacterIterator(obj);
        int i = this.b;
        Appendable appendable = this.a;
        try {
            int beginIndex = toCharacterIterator.getBeginIndex();
            int endIndex = toCharacterIterator.getEndIndex();
            int i2 = endIndex - beginIndex;
            if (beginIndex < endIndex) {
                appendable.append(toCharacterIterator.first());
                while (true) {
                    beginIndex++;
                    if (beginIndex >= endIndex) {
                        break;
                    } else {
                        appendable.append(toCharacterIterator.next());
                    }
                }
            }
            this.b = i2 + i;
            toCharacterIterator.first();
            int index = toCharacterIterator.getIndex();
            int endIndex2 = toCharacterIterator.getEndIndex();
            int i3 = i - index;
            while (index < endIndex2) {
                Map<AttributedCharacterIterator.Attribute, Object> attributes = toCharacterIterator.getAttributes();
                int runLimit = toCharacterIterator.getRunLimit();
                if (attributes.size() != 0) {
                    for (Map.Entry<AttributedCharacterIterator.Attribute, Object> entry : attributes.entrySet()) {
                        this.c.add(new h(entry.getKey(), entry.getValue(), i3 + index, i3 + runLimit));
                    }
                }
                toCharacterIterator.setIndex(runLimit);
                index = runLimit;
            }
        } catch (IOException e) {
            throw new ad(e);
        }
    }

    public final void c(Format format, Object obj, String str) {
        if (this.c != null || str == null) {
            b(format, obj);
        } else {
            a(str);
        }
    }
}

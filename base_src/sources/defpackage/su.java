package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.view.Gravity;
import j$.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class su {
    private static final Class[] a = {ForegroundColorSpan.class, LocaleSpan.class, SubscriptSpan.class, SuperscriptSpan.class, StrikethroughSpan.class, StyleSpan.class, TypefaceSpan.class, UnderlineSpan.class};
    private TextPaint c;
    private String d;
    private CharSequence e;
    private CharSequence f;
    private float g;
    private StaticLayout h;
    private boolean p;
    private boolean q;
    private final Rect b = new Rect();
    private int i = 17;
    private int j = 1;
    private final TextUtils.TruncateAt k = TextUtils.TruncateAt.END;
    private Layout.Alignment l = Layout.Alignment.ALIGN_CENTER;
    private final Rect m = new Rect();
    private final Rect n = new Rect();
    private boolean o = false;

    public final void a(Canvas canvas, Rect rect) {
        String string;
        if (TextUtils.isEmpty(this.f)) {
            return;
        }
        if (this.p || this.b.width() != rect.width() || this.b.height() != rect.height()) {
            int iWidth = rect.width();
            int iHeight = rect.height();
            if (this.c == null) {
                f(new TextPaint());
            }
            int i = (int) (iWidth * ((1.0f - this.g) + 0.0f));
            TextPaint textPaint = new TextPaint(this.c);
            textPaint.setTextSize(Math.min(iHeight / this.j, textPaint.getTextSize()));
            CharSequence charSequence = this.f;
            float f = i;
            if (textPaint.measureText(charSequence, 0, charSequence.length()) > f) {
                TextUtils.TruncateAt truncateAt = this.k;
                int i2 = 7;
                if (truncateAt != null && truncateAt != TextUtils.TruncateAt.MARQUEE) {
                    i2 = 8;
                }
                CharSequence charSequenceSubSequence = this.f.subSequence(0, Math.min(i2, this.f.length()));
                for (float fMeasureText = textPaint.measureText(charSequenceSubSequence, 0, charSequenceSubSequence.length()); fMeasureText > f; fMeasureText = textPaint.measureText(charSequenceSubSequence, 0, charSequenceSubSequence.length())) {
                    textPaint.setTextSize(textPaint.getTextSize() - 1.0f);
                }
            }
            CharSequence charSequence2 = this.f;
            CharSequence charSequence3 = charSequence2;
            if (this.o) {
                int i3 = ss.a;
                if (charSequence2 == null) {
                    string = null;
                } else {
                    StringBuilder sb = new StringBuilder(charSequence2.length());
                    int length = charSequence2.length();
                    int iCharCount = 0;
                    boolean zA = false;
                    while (iCharCount < length) {
                        int iCodePointAt = Character.codePointAt(charSequence2, iCharCount);
                        if (!ss.a(iCodePointAt)) {
                            sb.appendCodePoint(iCodePointAt);
                        } else if (!zA) {
                            sb.appendCodePoint(32);
                        }
                        zA = ss.a(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                    string = sb.toString();
                }
                this.d = string;
                charSequence3 = string;
            }
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence3, 0, charSequence3.length(), textPaint, i);
            builderObtain.setBreakStrategy(1);
            builderObtain.setEllipsize(this.k);
            builderObtain.setHyphenationFrequency(2);
            builderObtain.setMaxLines(this.j);
            builderObtain.setAlignment(this.l);
            this.h = builderObtain.build();
            this.p = false;
            this.q = true;
        }
        if (this.q || !this.b.equals(rect)) {
            this.b.set(rect);
            int i4 = !h() ? 1 : 0;
            this.m.set(this.b.left + ((int) (this.b.width() * (h() ? this.g : 0.0f))), this.b.top + ((int) (this.b.height() * 0.0f)), this.b.right - ((int) (this.b.width() * (h() ? 0.0f : this.g))), this.b.bottom - ((int) (this.b.height() * 0.0f)));
            Gravity.apply(this.i, this.h.getWidth(), this.h.getHeight(), this.m, this.n, i4);
            this.q = false;
        }
        canvas.save();
        canvas.translate(this.n.left, this.n.top);
        this.h.draw(canvas);
        canvas.restore();
    }

    public final void b(Layout.Alignment alignment) {
        if (this.l == alignment) {
            return;
        }
        this.l = alignment;
        this.p = true;
    }

    public final void c(int i) {
        if (this.i == i) {
            return;
        }
        this.i = i;
        this.q = true;
    }

    public final void d(boolean z) {
        if (this.o == z) {
            return;
        }
        this.o = z;
        if (TextUtils.equals(this.d, this.f)) {
            return;
        }
        this.p = true;
    }

    public final void e(int i) {
        if (this.j != i) {
            this.j = i;
            this.p = true;
        }
    }

    public final void f(TextPaint textPaint) {
        this.c = textPaint;
        this.p = true;
    }

    public final void g(CharSequence charSequence) {
        if (Objects.equals(this.e, charSequence)) {
            return;
        }
        this.e = charSequence;
        if (charSequence instanceof Spanned) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            for (Object obj : spannableStringBuilder.getSpans(0, charSequence.length(), Object.class)) {
                Class[] clsArr = a;
                int i = 0;
                while (true) {
                    if (i >= 8) {
                        spannableStringBuilder.removeSpan(obj);
                        break;
                    } else if (clsArr[i].isInstance(obj)) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            charSequence = spannableStringBuilder;
        }
        this.f = charSequence;
        this.p = true;
    }

    public final boolean h() {
        return this.h.getParagraphDirection(0) == 1;
    }

    public final void i(float f) {
        if (this.g == f) {
            return;
        }
        this.g = f;
        this.p = true;
    }
}

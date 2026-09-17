package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.text.Selection;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class mv extends EditText {
    private final mp a;
    private final nt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        rk.a(context);
        ri.d(this, getContext());
        mp mpVar = new mp(this);
        this.a = mpVar;
        mpVar.d(attributeSet, R.attr.editTextStyle);
        nt ntVar = new nt(this);
        this.b = ntVar;
        ntVar.b(attributeSet, R.attr.editTextStyle);
        ntVar.a();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        mp mpVar = this.a;
        if (mpVar != null) {
            mpVar.c();
        }
        nt ntVar = this.b;
        if (ntVar != null) {
            ntVar.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        gb.d(inputConnectionOnCreateInputConnection, editorInfo, this);
        String[] strArrZ = gl.Z(this);
        if (inputConnectionOnCreateInputConnection == null || strArrZ == null) {
            return inputConnectionOnCreateInputConnection;
        }
        editorInfo.contentMimeTypes = strArrZ;
        nd ndVar = new nd(this);
        eu.c(editorInfo, "editorInfo must be non-null");
        return new abt(inputConnectionOnCreateInputConnection, ndVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        if (dragEvent.getLocalState() == null && gl.Z(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                String str = "Can't handle drop: no activity: view=" + this;
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                activity.requestDragAndDropPermissions(dragEvent);
                int offsetForPosition = getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
                beginBatchEdit();
                try {
                    Selection.setSelection(getText(), offsetForPosition);
                    gl.o(this, eu.e(new fi(dragEvent.getClipData(), 3)));
                    return true;
                } finally {
                    endBatchEdit();
                }
            }
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        int i2 = android.R.id.pasteAsPlainText;
        if (i != 16908322) {
            if (i == 16908337) {
                i = android.R.id.pasteAsPlainText;
            }
            return super.onTextContextMenuItem(i);
        }
        i2 = i;
        if (gl.Z(this) != null) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                fi fiVar = new fi(primaryClip, 1);
                fiVar.a.setFlags(i2 == 16908322 ? 0 : 1);
                gl.o(this, eu.e(fiVar));
            }
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        mp mpVar = this.a;
        if (mpVar != null) {
            mpVar.i();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        mp mpVar = this.a;
        if (mpVar != null) {
            mpVar.e(i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        nt ntVar = this.b;
        if (ntVar != null) {
            ntVar.c(context, i);
        }
    }
}

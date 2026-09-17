package defpackage;

import java.io.InvalidObjectException;
import java.text.Format;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends Format.Field {
    public static final i a = new i();
    private static final long serialVersionUID = 7510380454602616157L;

    protected i() {
        super("message argument field");
    }

    @Override // java.text.AttributedCharacterIterator.Attribute
    protected Object readResolve() throws InvalidObjectException {
        if (getClass() != i.class) {
            throw new InvalidObjectException("A subclass of MessageFormat.Field must implement readResolve.");
        }
        String name = getName();
        i iVar = a;
        if (name.equals(iVar.getName())) {
            return iVar;
        }
        throw new InvalidObjectException("Unknown attribute name.");
    }
}

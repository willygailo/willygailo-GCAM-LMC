package j$.util;

import j$.util.function.Consumer;
import j$.util.function.Function;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class Optional {
    private static final Optional EMPTY = new Optional();
    private final Object value;

    private Optional() {
        this.value = null;
    }

    private Optional(Object obj) {
        obj.getClass();
        this.value = obj;
    }

    public static Optional empty() {
        return EMPTY;
    }

    public static Optional of(Object obj) {
        return new Optional(obj);
    }

    public static Optional ofNullable(Object obj) {
        return obj == null ? empty() : of(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Optional) {
            return Objects.equals(this.value, ((Optional) obj).value);
        }
        return false;
    }

    public Object get() {
        Object obj = this.value;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public int hashCode() {
        return Objects.hashCode(this.value);
    }

    public void ifPresent(Consumer consumer) {
        Object obj = this.value;
        if (obj != null) {
            consumer.accept(obj);
        }
    }

    public boolean isPresent() {
        return this.value != null;
    }

    public Optional map(Function function) {
        function.getClass();
        return !isPresent() ? empty() : ofNullable(function.apply(this.value));
    }

    public Object orElse(Object obj) {
        Object obj2 = this.value;
        return obj2 != null ? obj2 : obj;
    }

    public String toString() {
        Object obj = this.value;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}

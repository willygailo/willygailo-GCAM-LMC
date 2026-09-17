package j$.util.function;

/* JADX INFO: loaded from: classes2.dex */
public interface BiFunction {

    /* JADX INFO: renamed from: j$.util.function.BiFunction$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static BiFunction $default$andThen(final BiFunction biFunction, final Function function) {
            function.getClass();
            return new BiFunction() { // from class: j$.util.function.BiFunction$$ExternalSyntheticLambda0
                @Override // j$.util.function.BiFunction
                public /* synthetic */ BiFunction andThen(Function function2) {
                    return BiFunction.CC.$default$andThen(this, function2);
                }

                @Override // j$.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return function.apply(biFunction.apply(obj, obj2));
                }
            };
        }
    }

    BiFunction andThen(Function function);

    Object apply(Object obj, Object obj2);
}

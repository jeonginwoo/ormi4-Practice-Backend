package ch10_제네릭.inherit;

public class ChildProduct<T, M, C> extends Product<T, M> {
    private C company;

    public ChildProduct(T kind, M model, C company) {
        super(kind, model);
        this.company = company;
    }

    public C getCompany() {
        return company;
    }

    public void setCompany(C company) {
        this.company = company;
    }
}

package rholang.parsing.rholang1.Absyn; // Java Package generated by the BNF Converter.

public class VQuant extends Value {
  public final Quantity quantity_;
  public VQuant(Quantity p1) { quantity_ = p1; }

  public <R,A> R accept(rholang.parsing.rholang1.Absyn.Value.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof rholang.parsing.rholang1.Absyn.VQuant) {
      rholang.parsing.rholang1.Absyn.VQuant x = (rholang.parsing.rholang1.Absyn.VQuant)o;
      return this.quantity_.equals(x.quantity_);
    }
    return false;
  }

  public int hashCode() {
    return this.quantity_.hashCode();
  }


}

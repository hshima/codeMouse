package br.com.codeMouse.store.model;

import java.math.BigDecimal;

import javax.persistence.Embeddable;

@Embeddable //allows class to be persisted as Entity attribute
public class Price {
	private BigDecimal value;
	private PriceType kind;

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public PriceType getKind() {
		return kind;
	}

	public void setKind(PriceType kind) {
		this.kind = kind;
	}
}
